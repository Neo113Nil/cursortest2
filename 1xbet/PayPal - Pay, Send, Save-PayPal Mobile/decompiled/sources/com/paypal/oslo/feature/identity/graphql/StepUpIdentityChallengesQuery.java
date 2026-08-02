package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0011*+,-./0123456789)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengesInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengesInput;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengesInput;", "getInput", "Companion", "Data", "StepUpIdentityChallenge", "OnTextOneTimePasscodeIdentityChallenge", "PhoneNumber", "OnEmailOneTimePasscodeIdentityChallenge", "EmailAddress", "OnWhatsappOneTimePasscodeIdentityChallenge", "PhoneNumber1", "OnPhoneOneTimePasscodeIdentityChallenge", "PhoneNumber2", "OnSecurityQuestionIdentityChallenge", "SecurityQuestion", "OnAuthenticatorAppIdentityChallenge", "OnSilentAuthenticationIdentityChallenge", "PhoneNumber3", "OnWebViewIdentityChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StepUpIdentityChallengesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data> {
    public static final java.lang.String OPERATION_ID = "f824b4baa74544cc0102de57090e82bca5d1777c39fc719cdbba4b8e326c8e81";
    public static final java.lang.String OPERATION_NAME = "StepUpIdentityChallenges";
    private final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengesInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Companion(null);
    public static final int $stable = 8;

    public StepUpIdentityChallengesQuery(com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengesInput stepUpIdentityChallengesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpIdentityChallengesInput, "");
        this.input = stepUpIdentityChallengesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengesInput getInput() {
        return this.input;
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
        com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.StepUpIdentityChallengesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$StepUpIdentityChallenge;", "stepUpIdentityChallenges", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getStepUpIdentityChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge> stepUpIdentityChallenges;

        public Data(java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge> list) {
            this.stepUpIdentityChallenges = list;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge> getStepUpIdentityChallenges() {
            return this.stepUpIdentityChallenges;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge> list = this.stepUpIdentityChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(stepUpIdentityChallenges=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge> list = this.stepUpIdentityChallenges;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.stepUpIdentityChallenges, ((com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data) other).stepUpIdentityChallenges);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data copy(java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge> stepUpIdentityChallenges) {
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data(stepUpIdentityChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge> component1() {
            return this.stepUpIdentityChallenges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.stepUpIdentityChallenges;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'Jz\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bC\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$StepUpIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnTextOneTimePasscodeIdentityChallenge;", "onTextOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnEmailOneTimePasscodeIdentityChallenge;", "onEmailOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWhatsappOneTimePasscodeIdentityChallenge;", "onWhatsappOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnPhoneOneTimePasscodeIdentityChallenge;", "onPhoneOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSecurityQuestionIdentityChallenge;", "onSecurityQuestionIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnAuthenticatorAppIdentityChallenge;", "onAuthenticatorAppIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSilentAuthenticationIdentityChallenge;", "onSilentAuthenticationIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWebViewIdentityChallenge;", "onWebViewIdentityChallenge", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnTextOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnEmailOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWhatsappOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnPhoneOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSecurityQuestionIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnAuthenticatorAppIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSilentAuthenticationIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWebViewIdentityChallenge;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnTextOneTimePasscodeIdentityChallenge;", "component3", "()Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnEmailOneTimePasscodeIdentityChallenge;", "component4", "()Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWhatsappOneTimePasscodeIdentityChallenge;", "component5", "()Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnPhoneOneTimePasscodeIdentityChallenge;", "component6", "()Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSecurityQuestionIdentityChallenge;", "component7", "()Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnAuthenticatorAppIdentityChallenge;", "component8", "()Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSilentAuthenticationIdentityChallenge;", "component9", "()Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWebViewIdentityChallenge;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnTextOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnEmailOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWhatsappOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnPhoneOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSecurityQuestionIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnAuthenticatorAppIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSilentAuthenticationIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWebViewIdentityChallenge;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$StepUpIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnTextOneTimePasscodeIdentityChallenge;", "getOnTextOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnEmailOneTimePasscodeIdentityChallenge;", "getOnEmailOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWhatsappOneTimePasscodeIdentityChallenge;", "getOnWhatsappOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnPhoneOneTimePasscodeIdentityChallenge;", "getOnPhoneOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSecurityQuestionIdentityChallenge;", "getOnSecurityQuestionIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnAuthenticatorAppIdentityChallenge;", "getOnAuthenticatorAppIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSilentAuthenticationIdentityChallenge;", "getOnSilentAuthenticationIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWebViewIdentityChallenge;", "getOnWebViewIdentityChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StepUpIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge onWebViewIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge;

        public StepUpIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge onWebViewIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onTextOneTimePasscodeIdentityChallenge = onTextOneTimePasscodeIdentityChallenge;
            this.onEmailOneTimePasscodeIdentityChallenge = onEmailOneTimePasscodeIdentityChallenge;
            this.onWhatsappOneTimePasscodeIdentityChallenge = onWhatsappOneTimePasscodeIdentityChallenge;
            this.onPhoneOneTimePasscodeIdentityChallenge = onPhoneOneTimePasscodeIdentityChallenge;
            this.onSecurityQuestionIdentityChallenge = onSecurityQuestionIdentityChallenge;
            this.onAuthenticatorAppIdentityChallenge = onAuthenticatorAppIdentityChallenge;
            this.onSilentAuthenticationIdentityChallenge = onSilentAuthenticationIdentityChallenge;
            this.onWebViewIdentityChallenge = onWebViewIdentityChallenge;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge getOnTextOneTimePasscodeIdentityChallenge() {
            return this.onTextOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge getOnEmailOneTimePasscodeIdentityChallenge() {
            return this.onEmailOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge getOnWhatsappOneTimePasscodeIdentityChallenge() {
            return this.onWhatsappOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge getOnPhoneOneTimePasscodeIdentityChallenge() {
            return this.onPhoneOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge getOnSecurityQuestionIdentityChallenge() {
            return this.onSecurityQuestionIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge getOnAuthenticatorAppIdentityChallenge() {
            return this.onAuthenticatorAppIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge getOnSilentAuthenticationIdentityChallenge() {
            return this.onSilentAuthenticationIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge getOnWebViewIdentityChallenge() {
            return this.onWebViewIdentityChallenge;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = this.onTextOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = this.onEmailOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = this.onWhatsappOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = this.onPhoneOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge = this.onSecurityQuestionIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = this.onAuthenticatorAppIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge = this.onSilentAuthenticationIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge onWebViewIdentityChallenge = this.onWebViewIdentityChallenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StepUpIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", onTextOneTimePasscodeIdentityChallenge=");
            sb.append(onTextOneTimePasscodeIdentityChallenge);
            sb.append(", onEmailOneTimePasscodeIdentityChallenge=");
            sb.append(onEmailOneTimePasscodeIdentityChallenge);
            sb.append(", onWhatsappOneTimePasscodeIdentityChallenge=");
            sb.append(onWhatsappOneTimePasscodeIdentityChallenge);
            sb.append(", onPhoneOneTimePasscodeIdentityChallenge=");
            sb.append(onPhoneOneTimePasscodeIdentityChallenge);
            sb.append(", onSecurityQuestionIdentityChallenge=");
            sb.append(onSecurityQuestionIdentityChallenge);
            sb.append(", onAuthenticatorAppIdentityChallenge=");
            sb.append(onAuthenticatorAppIdentityChallenge);
            sb.append(", onSilentAuthenticationIdentityChallenge=");
            sb.append(onSilentAuthenticationIdentityChallenge);
            sb.append(", onWebViewIdentityChallenge=");
            sb.append(onWebViewIdentityChallenge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = this.onTextOneTimePasscodeIdentityChallenge;
            int hashCode2 = onTextOneTimePasscodeIdentityChallenge == null ? 0 : onTextOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = this.onEmailOneTimePasscodeIdentityChallenge;
            int hashCode3 = onEmailOneTimePasscodeIdentityChallenge == null ? 0 : onEmailOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = this.onWhatsappOneTimePasscodeIdentityChallenge;
            int hashCode4 = onWhatsappOneTimePasscodeIdentityChallenge == null ? 0 : onWhatsappOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = this.onPhoneOneTimePasscodeIdentityChallenge;
            int hashCode5 = onPhoneOneTimePasscodeIdentityChallenge == null ? 0 : onPhoneOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge = this.onSecurityQuestionIdentityChallenge;
            int hashCode6 = onSecurityQuestionIdentityChallenge == null ? 0 : onSecurityQuestionIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = this.onAuthenticatorAppIdentityChallenge;
            int hashCode7 = onAuthenticatorAppIdentityChallenge == null ? 0 : onAuthenticatorAppIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge = this.onSilentAuthenticationIdentityChallenge;
            int hashCode8 = onSilentAuthenticationIdentityChallenge == null ? 0 : onSilentAuthenticationIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge onWebViewIdentityChallenge = this.onWebViewIdentityChallenge;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (onWebViewIdentityChallenge != null ? onWebViewIdentityChallenge.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge stepUpIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, stepUpIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onTextOneTimePasscodeIdentityChallenge, stepUpIdentityChallenge.onTextOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEmailOneTimePasscodeIdentityChallenge, stepUpIdentityChallenge.onEmailOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onWhatsappOneTimePasscodeIdentityChallenge, stepUpIdentityChallenge.onWhatsappOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPhoneOneTimePasscodeIdentityChallenge, stepUpIdentityChallenge.onPhoneOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onSecurityQuestionIdentityChallenge, stepUpIdentityChallenge.onSecurityQuestionIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAuthenticatorAppIdentityChallenge, stepUpIdentityChallenge.onAuthenticatorAppIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onSilentAuthenticationIdentityChallenge, stepUpIdentityChallenge.onSilentAuthenticationIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onWebViewIdentityChallenge, stepUpIdentityChallenge.onWebViewIdentityChallenge);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge onWebViewIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge(__typename, onTextOneTimePasscodeIdentityChallenge, onEmailOneTimePasscodeIdentityChallenge, onWhatsappOneTimePasscodeIdentityChallenge, onPhoneOneTimePasscodeIdentityChallenge, onSecurityQuestionIdentityChallenge, onAuthenticatorAppIdentityChallenge, onSilentAuthenticationIdentityChallenge, onWebViewIdentityChallenge);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge getOnWebViewIdentityChallenge() {
            return this.onWebViewIdentityChallenge;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge getOnSilentAuthenticationIdentityChallenge() {
            return this.onSilentAuthenticationIdentityChallenge;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge getOnAuthenticatorAppIdentityChallenge() {
            return this.onAuthenticatorAppIdentityChallenge;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge getOnSecurityQuestionIdentityChallenge() {
            return this.onSecurityQuestionIdentityChallenge;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge getOnPhoneOneTimePasscodeIdentityChallenge() {
            return this.onPhoneOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge getOnWhatsappOneTimePasscodeIdentityChallenge() {
            return this.onWhatsappOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge getOnEmailOneTimePasscodeIdentityChallenge() {
            return this.onEmailOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge getOnTextOneTimePasscodeIdentityChallenge() {
            return this.onTextOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnTextOneTimePasscodeIdentityChallenge;", "", "", "id", "nonce", "partialToken", "", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber;", "phoneNumbers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnTextOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getNonce", "getPartialToken", "Ljava/util/List;", "getPhoneNumbers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTextOneTimePasscodeIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber> phoneNumbers;

        public OnTextOneTimePasscodeIdentityChallenge(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = str;
            this.nonce = str2;
            this.partialToken = str3;
            this.phoneNumbers = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.nonce;
            java.lang.String str3 = this.partialToken;
            java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber> list = this.phoneNumbers;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTextOneTimePasscodeIdentityChallenge(id=");
            sb.append(str);
            sb.append(", nonce=");
            sb.append(str2);
            sb.append(", partialToken=");
            sb.append(str3);
            sb.append(", phoneNumbers=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.nonce;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.phoneNumbers.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onTextOneTimePasscodeIdentityChallenge.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, onTextOneTimePasscodeIdentityChallenge.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, onTextOneTimePasscodeIdentityChallenge.partialToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumbers, onTextOneTimePasscodeIdentityChallenge.phoneNumbers);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge copy(java.lang.String id, java.lang.String nonce, java.lang.String partialToken, java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber> phoneNumbers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumbers, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge(id, nonce, partialToken, phoneNumbers);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber> component4() {
            return this.phoneNumbers;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onTextOneTimePasscodeIdentityChallenge.id;
            }
            if ((i & 2) != 0) {
                str2 = onTextOneTimePasscodeIdentityChallenge.nonce;
            }
            if ((i & 4) != 0) {
                str3 = onTextOneTimePasscodeIdentityChallenge.partialToken;
            }
            if ((i & 8) != 0) {
                list = onTextOneTimePasscodeIdentityChallenge.phoneNumbers;
            }
            return onTextOneTimePasscodeIdentityChallenge.copy(str, str2, str3, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber;", "", "", "challengeId", "maskedNumber", "", "notified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChallengeId", "getMaskedNumber", "Ljava/lang/Boolean;", "getNotified"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PhoneNumber {
        public static final int $stable = 0;
        private final java.lang.String challengeId;
        private final java.lang.String maskedNumber;
        private final java.lang.Boolean notified;

        public PhoneNumber(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.challengeId = str;
            this.maskedNumber = str2;
            this.notified = bool;
        }

        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public final java.lang.String getMaskedNumber() {
            return this.maskedNumber;
        }

        public final java.lang.Boolean getNotified() {
            return this.notified;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.challengeId;
            java.lang.String str2 = this.maskedNumber;
            java.lang.Boolean bool = this.notified;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneNumber(challengeId=");
            sb.append(str);
            sb.append(", maskedNumber=");
            sb.append(str2);
            sb.append(", notified=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challengeId.hashCode();
            int hashCode2 = this.maskedNumber.hashCode();
            java.lang.Boolean bool = this.notified;
            return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber phoneNumber = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, phoneNumber.challengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedNumber, phoneNumber.maskedNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.notified, phoneNumber.notified);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber copy(java.lang.String challengeId, java.lang.String maskedNumber, java.lang.Boolean notified) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedNumber, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber(challengeId, maskedNumber, notified);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getNotified() {
            return this.notified;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMaskedNumber() {
            return this.maskedNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber phoneNumber, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = phoneNumber.challengeId;
            }
            if ((i & 2) != 0) {
                str2 = phoneNumber.maskedNumber;
            }
            if ((i & 4) != 0) {
                bool = phoneNumber.notified;
            }
            return phoneNumber.copy(str, str2, bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnEmailOneTimePasscodeIdentityChallenge;", "", "", "id", "nonce", "partialToken", "", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$EmailAddress;", "emailAddresses", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnEmailOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getNonce", "getPartialToken", "Ljava/util/List;", "getEmailAddresses"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEmailOneTimePasscodeIdentityChallenge {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress> emailAddresses;
        private final java.lang.String id;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;

        public OnEmailOneTimePasscodeIdentityChallenge(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = str;
            this.nonce = str2;
            this.partialToken = str3;
            this.emailAddresses = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress> getEmailAddresses() {
            return this.emailAddresses;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.nonce;
            java.lang.String str3 = this.partialToken;
            java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress> list = this.emailAddresses;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnEmailOneTimePasscodeIdentityChallenge(id=");
            sb.append(str);
            sb.append(", nonce=");
            sb.append(str2);
            sb.append(", partialToken=");
            sb.append(str3);
            sb.append(", emailAddresses=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.nonce;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.emailAddresses.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onEmailOneTimePasscodeIdentityChallenge.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, onEmailOneTimePasscodeIdentityChallenge.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, onEmailOneTimePasscodeIdentityChallenge.partialToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailAddresses, onEmailOneTimePasscodeIdentityChallenge.emailAddresses);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge copy(java.lang.String id, java.lang.String nonce, java.lang.String partialToken, java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress> emailAddresses) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAddresses, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge(id, nonce, partialToken, emailAddresses);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress> component4() {
            return this.emailAddresses;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onEmailOneTimePasscodeIdentityChallenge.id;
            }
            if ((i & 2) != 0) {
                str2 = onEmailOneTimePasscodeIdentityChallenge.nonce;
            }
            if ((i & 4) != 0) {
                str3 = onEmailOneTimePasscodeIdentityChallenge.partialToken;
            }
            if ((i & 8) != 0) {
                list = onEmailOneTimePasscodeIdentityChallenge.emailAddresses;
            }
            return onEmailOneTimePasscodeIdentityChallenge.copy(str, str2, str3, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$EmailAddress;", "", "", "challengeId", "maskedEmail", "", "notified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$EmailAddress;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChallengeId", "getMaskedEmail", "Z", "getNotified"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmailAddress {
        public static final int $stable = 0;
        private final java.lang.String challengeId;
        private final java.lang.String maskedEmail;
        private final boolean notified;

        public EmailAddress(java.lang.String str, java.lang.String str2, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.challengeId = str;
            this.maskedEmail = str2;
            this.notified = z;
        }

        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public final java.lang.String getMaskedEmail() {
            return this.maskedEmail;
        }

        public final boolean getNotified() {
            return this.notified;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.challengeId;
            java.lang.String str2 = this.maskedEmail;
            boolean z = this.notified;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailAddress(challengeId=");
            sb.append(str);
            sb.append(", maskedEmail=");
            sb.append(str2);
            sb.append(", notified=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.challengeId.hashCode() * 31) + this.maskedEmail.hashCode()) * 31) + java.lang.Boolean.hashCode(this.notified);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress emailAddress = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, emailAddress.challengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedEmail, emailAddress.maskedEmail) && this.notified == emailAddress.notified;
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress copy(java.lang.String challengeId, java.lang.String maskedEmail, boolean notified) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedEmail, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress(challengeId, maskedEmail, notified);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getNotified() {
            return this.notified;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMaskedEmail() {
            return this.maskedEmail;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress emailAddress, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = emailAddress.challengeId;
            }
            if ((i & 2) != 0) {
                str2 = emailAddress.maskedEmail;
            }
            if ((i & 4) != 0) {
                z = emailAddress.notified;
            }
            return emailAddress.copy(str, str2, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWhatsappOneTimePasscodeIdentityChallenge;", "", "", "id", "nonce", "partialToken", "", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber1;", "phoneNumbers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWhatsappOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getNonce", "getPartialToken", "Ljava/util/List;", "getPhoneNumbers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnWhatsappOneTimePasscodeIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1> phoneNumbers;

        public OnWhatsappOneTimePasscodeIdentityChallenge(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = str;
            this.nonce = str2;
            this.partialToken = str3;
            this.phoneNumbers = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.nonce;
            java.lang.String str3 = this.partialToken;
            java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1> list = this.phoneNumbers;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnWhatsappOneTimePasscodeIdentityChallenge(id=");
            sb.append(str);
            sb.append(", nonce=");
            sb.append(str2);
            sb.append(", partialToken=");
            sb.append(str3);
            sb.append(", phoneNumbers=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.nonce;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.phoneNumbers.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onWhatsappOneTimePasscodeIdentityChallenge.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, onWhatsappOneTimePasscodeIdentityChallenge.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, onWhatsappOneTimePasscodeIdentityChallenge.partialToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumbers, onWhatsappOneTimePasscodeIdentityChallenge.phoneNumbers);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge copy(java.lang.String id, java.lang.String nonce, java.lang.String partialToken, java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1> phoneNumbers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumbers, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge(id, nonce, partialToken, phoneNumbers);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1> component4() {
            return this.phoneNumbers;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onWhatsappOneTimePasscodeIdentityChallenge.id;
            }
            if ((i & 2) != 0) {
                str2 = onWhatsappOneTimePasscodeIdentityChallenge.nonce;
            }
            if ((i & 4) != 0) {
                str3 = onWhatsappOneTimePasscodeIdentityChallenge.partialToken;
            }
            if ((i & 8) != 0) {
                list = onWhatsappOneTimePasscodeIdentityChallenge.phoneNumbers;
            }
            return onWhatsappOneTimePasscodeIdentityChallenge.copy(str, str2, str3, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber1;", "", "", "challengeId", "maskedNumber", "", "notified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber1;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChallengeId", "getMaskedNumber", "Ljava/lang/Boolean;", "getNotified"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PhoneNumber1 {
        public static final int $stable = 0;
        private final java.lang.String challengeId;
        private final java.lang.String maskedNumber;
        private final java.lang.Boolean notified;

        public PhoneNumber1(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.challengeId = str;
            this.maskedNumber = str2;
            this.notified = bool;
        }

        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public final java.lang.String getMaskedNumber() {
            return this.maskedNumber;
        }

        public final java.lang.Boolean getNotified() {
            return this.notified;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.challengeId;
            java.lang.String str2 = this.maskedNumber;
            java.lang.Boolean bool = this.notified;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneNumber1(challengeId=");
            sb.append(str);
            sb.append(", maskedNumber=");
            sb.append(str2);
            sb.append(", notified=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challengeId.hashCode();
            int hashCode2 = this.maskedNumber.hashCode();
            java.lang.Boolean bool = this.notified;
            return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1 phoneNumber1 = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, phoneNumber1.challengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedNumber, phoneNumber1.maskedNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.notified, phoneNumber1.notified);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1 copy(java.lang.String challengeId, java.lang.String maskedNumber, java.lang.Boolean notified) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedNumber, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1(challengeId, maskedNumber, notified);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getNotified() {
            return this.notified;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMaskedNumber() {
            return this.maskedNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1 copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1 phoneNumber1, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = phoneNumber1.challengeId;
            }
            if ((i & 2) != 0) {
                str2 = phoneNumber1.maskedNumber;
            }
            if ((i & 4) != 0) {
                bool = phoneNumber1.notified;
            }
            return phoneNumber1.copy(str, str2, bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnPhoneOneTimePasscodeIdentityChallenge;", "", "", "id", "nonce", "partialToken", "", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber2;", "phoneNumbers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnPhoneOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getNonce", "getPartialToken", "Ljava/util/List;", "getPhoneNumbers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPhoneOneTimePasscodeIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2> phoneNumbers;

        public OnPhoneOneTimePasscodeIdentityChallenge(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = str;
            this.nonce = str2;
            this.partialToken = str3;
            this.phoneNumbers = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.nonce;
            java.lang.String str3 = this.partialToken;
            java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2> list = this.phoneNumbers;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPhoneOneTimePasscodeIdentityChallenge(id=");
            sb.append(str);
            sb.append(", nonce=");
            sb.append(str2);
            sb.append(", partialToken=");
            sb.append(str3);
            sb.append(", phoneNumbers=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.nonce;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.phoneNumbers.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onPhoneOneTimePasscodeIdentityChallenge.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, onPhoneOneTimePasscodeIdentityChallenge.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, onPhoneOneTimePasscodeIdentityChallenge.partialToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumbers, onPhoneOneTimePasscodeIdentityChallenge.phoneNumbers);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge copy(java.lang.String id, java.lang.String nonce, java.lang.String partialToken, java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2> phoneNumbers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumbers, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge(id, nonce, partialToken, phoneNumbers);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2> component4() {
            return this.phoneNumbers;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPhoneOneTimePasscodeIdentityChallenge.id;
            }
            if ((i & 2) != 0) {
                str2 = onPhoneOneTimePasscodeIdentityChallenge.nonce;
            }
            if ((i & 4) != 0) {
                str3 = onPhoneOneTimePasscodeIdentityChallenge.partialToken;
            }
            if ((i & 8) != 0) {
                list = onPhoneOneTimePasscodeIdentityChallenge.phoneNumbers;
            }
            return onPhoneOneTimePasscodeIdentityChallenge.copy(str, str2, str3, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber2;", "", "", "challengeId", "maskedNumber", "", "notified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber2;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChallengeId", "getMaskedNumber", "Ljava/lang/Boolean;", "getNotified"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PhoneNumber2 {
        public static final int $stable = 0;
        private final java.lang.String challengeId;
        private final java.lang.String maskedNumber;
        private final java.lang.Boolean notified;

        public PhoneNumber2(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.challengeId = str;
            this.maskedNumber = str2;
            this.notified = bool;
        }

        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public final java.lang.String getMaskedNumber() {
            return this.maskedNumber;
        }

        public final java.lang.Boolean getNotified() {
            return this.notified;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.challengeId;
            java.lang.String str2 = this.maskedNumber;
            java.lang.Boolean bool = this.notified;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneNumber2(challengeId=");
            sb.append(str);
            sb.append(", maskedNumber=");
            sb.append(str2);
            sb.append(", notified=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challengeId.hashCode();
            int hashCode2 = this.maskedNumber.hashCode();
            java.lang.Boolean bool = this.notified;
            return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2 phoneNumber2 = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, phoneNumber2.challengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedNumber, phoneNumber2.maskedNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.notified, phoneNumber2.notified);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2 copy(java.lang.String challengeId, java.lang.String maskedNumber, java.lang.Boolean notified) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedNumber, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2(challengeId, maskedNumber, notified);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getNotified() {
            return this.notified;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMaskedNumber() {
            return this.maskedNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2 copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2 phoneNumber2, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = phoneNumber2.challengeId;
            }
            if ((i & 2) != 0) {
                str2 = phoneNumber2.maskedNumber;
            }
            if ((i & 4) != 0) {
                bool = phoneNumber2.notified;
            }
            return phoneNumber2.copy(str, str2, bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSecurityQuestionIdentityChallenge;", "", "", "id", "nonce", "partialToken", "", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$SecurityQuestion;", "securityQuestions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSecurityQuestionIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getNonce", "getPartialToken", "Ljava/util/List;", "getSecurityQuestions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSecurityQuestionIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion> securityQuestions;

        public OnSecurityQuestionIdentityChallenge(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = str;
            this.nonce = str2;
            this.partialToken = str3;
            this.securityQuestions = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion> getSecurityQuestions() {
            return this.securityQuestions;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.nonce;
            java.lang.String str3 = this.partialToken;
            java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion> list = this.securityQuestions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSecurityQuestionIdentityChallenge(id=");
            sb.append(str);
            sb.append(", nonce=");
            sb.append(str2);
            sb.append(", partialToken=");
            sb.append(str3);
            sb.append(", securityQuestions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.nonce;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.securityQuestions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onSecurityQuestionIdentityChallenge.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, onSecurityQuestionIdentityChallenge.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, onSecurityQuestionIdentityChallenge.partialToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.securityQuestions, onSecurityQuestionIdentityChallenge.securityQuestions);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge copy(java.lang.String id, java.lang.String nonce, java.lang.String partialToken, java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion> securityQuestions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityQuestions, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge(id, nonce, partialToken, securityQuestions);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion> component4() {
            return this.securityQuestions;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSecurityQuestionIdentityChallenge.id;
            }
            if ((i & 2) != 0) {
                str2 = onSecurityQuestionIdentityChallenge.nonce;
            }
            if ((i & 4) != 0) {
                str3 = onSecurityQuestionIdentityChallenge.partialToken;
            }
            if ((i & 8) != 0) {
                list = onSecurityQuestionIdentityChallenge.securityQuestions;
            }
            return onSecurityQuestionIdentityChallenge.copy(str, str2, str3, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$SecurityQuestion;", "", "", "challengeId", "question", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$SecurityQuestion;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChallengeId", "getQuestion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SecurityQuestion {
        public static final int $stable = 0;
        private final java.lang.String challengeId;
        private final java.lang.String question;

        public SecurityQuestion(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.challengeId = str;
            this.question = str2;
        }

        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public final java.lang.String getQuestion() {
            return this.question;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.challengeId;
            java.lang.String str2 = this.question;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SecurityQuestion(challengeId=");
            sb.append(str);
            sb.append(", question=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.challengeId.hashCode() * 31) + this.question.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion securityQuestion = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, securityQuestion.challengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.question, securityQuestion.question);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion copy(java.lang.String challengeId, java.lang.String question) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(question, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion(challengeId, question);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getQuestion() {
            return this.question;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion securityQuestion, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = securityQuestion.challengeId;
            }
            if ((i & 2) != 0) {
                str2 = securityQuestion.question;
            }
            return securityQuestion.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnAuthenticatorAppIdentityChallenge;", "", "", "id", "nonce", "partialToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnAuthenticatorAppIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getNonce", "getPartialToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAuthenticatorAppIdentityChallenge {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;

        public OnAuthenticatorAppIdentityChallenge(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.nonce = str2;
            this.partialToken = str3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.nonce;
            java.lang.String str3 = this.partialToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAuthenticatorAppIdentityChallenge(id=");
            sb.append(str);
            sb.append(", nonce=");
            sb.append(str2);
            sb.append(", partialToken=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.nonce;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onAuthenticatorAppIdentityChallenge.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, onAuthenticatorAppIdentityChallenge.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, onAuthenticatorAppIdentityChallenge.partialToken);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge copy(java.lang.String id, java.lang.String nonce, java.lang.String partialToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge(id, nonce, partialToken);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAuthenticatorAppIdentityChallenge.id;
            }
            if ((i & 2) != 0) {
                str2 = onAuthenticatorAppIdentityChallenge.nonce;
            }
            if ((i & 4) != 0) {
                str3 = onAuthenticatorAppIdentityChallenge.partialToken;
            }
            return onAuthenticatorAppIdentityChallenge.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSilentAuthenticationIdentityChallenge;", "", "", "id", "nonce", "partialToken", "", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber3;", "phoneNumbers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSilentAuthenticationIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getNonce", "getPartialToken", "Ljava/util/List;", "getPhoneNumbers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSilentAuthenticationIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3> phoneNumbers;

        public OnSilentAuthenticationIdentityChallenge(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = str;
            this.nonce = str2;
            this.partialToken = str3;
            this.phoneNumbers = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.nonce;
            java.lang.String str3 = this.partialToken;
            java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3> list = this.phoneNumbers;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSilentAuthenticationIdentityChallenge(id=");
            sb.append(str);
            sb.append(", nonce=");
            sb.append(str2);
            sb.append(", partialToken=");
            sb.append(str3);
            sb.append(", phoneNumbers=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.nonce;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.phoneNumbers.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onSilentAuthenticationIdentityChallenge.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, onSilentAuthenticationIdentityChallenge.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, onSilentAuthenticationIdentityChallenge.partialToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumbers, onSilentAuthenticationIdentityChallenge.phoneNumbers);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge copy(java.lang.String id, java.lang.String nonce, java.lang.String partialToken, java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3> phoneNumbers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumbers, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge(id, nonce, partialToken, phoneNumbers);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3> component4() {
            return this.phoneNumbers;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSilentAuthenticationIdentityChallenge.id;
            }
            if ((i & 2) != 0) {
                str2 = onSilentAuthenticationIdentityChallenge.nonce;
            }
            if ((i & 4) != 0) {
                str3 = onSilentAuthenticationIdentityChallenge.partialToken;
            }
            if ((i & 8) != 0) {
                list = onSilentAuthenticationIdentityChallenge.phoneNumbers;
            }
            return onSilentAuthenticationIdentityChallenge.copy(str, str2, str3, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber3;", "", "", "challengeId", "maskedNumber", "", "notified", "evaluateURL", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber3;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChallengeId", "getMaskedNumber", "Ljava/lang/Boolean;", "getNotified", "getEvaluateURL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PhoneNumber3 {
        public static final int $stable = 0;
        private final java.lang.String challengeId;
        private final java.lang.String evaluateURL;
        private final java.lang.String maskedNumber;
        private final java.lang.Boolean notified;

        public PhoneNumber3(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.challengeId = str;
            this.maskedNumber = str2;
            this.notified = bool;
            this.evaluateURL = str3;
        }

        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public final java.lang.String getMaskedNumber() {
            return this.maskedNumber;
        }

        public final java.lang.Boolean getNotified() {
            return this.notified;
        }

        public final java.lang.String getEvaluateURL() {
            return this.evaluateURL;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.challengeId;
            java.lang.String str2 = this.maskedNumber;
            java.lang.Boolean bool = this.notified;
            java.lang.String str3 = this.evaluateURL;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneNumber3(challengeId=");
            sb.append(str);
            sb.append(", maskedNumber=");
            sb.append(str2);
            sb.append(", notified=");
            sb.append(bool);
            sb.append(", evaluateURL=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challengeId.hashCode();
            int hashCode2 = this.maskedNumber.hashCode();
            java.lang.Boolean bool = this.notified;
            int hashCode3 = bool == null ? 0 : bool.hashCode();
            java.lang.String str = this.evaluateURL;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3 phoneNumber3 = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, phoneNumber3.challengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedNumber, phoneNumber3.maskedNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.notified, phoneNumber3.notified) && kotlin.jvm.internal.Intrinsics.areEqual(this.evaluateURL, phoneNumber3.evaluateURL);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3 copy(java.lang.String challengeId, java.lang.String maskedNumber, java.lang.Boolean notified, java.lang.String evaluateURL) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedNumber, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3(challengeId, maskedNumber, notified, evaluateURL);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getEvaluateURL() {
            return this.evaluateURL;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getNotified() {
            return this.notified;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMaskedNumber() {
            return this.maskedNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3 copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3 phoneNumber3, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = phoneNumber3.challengeId;
            }
            if ((i & 2) != 0) {
                str2 = phoneNumber3.maskedNumber;
            }
            if ((i & 4) != 0) {
                bool = phoneNumber3.notified;
            }
            if ((i & 8) != 0) {
                str3 = phoneNumber3.evaluateURL;
            }
            return phoneNumber3.copy(str, str2, bool, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018Jd\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWebViewIdentityChallenge;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "challengeMethod", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_STEP_UP_CONTEXT_ID, "returnUri", "returnUriParam", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "flowContext", "webChallengeUrl", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWebViewIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "getChallengeMethod", "getStepUpContextId", "getReturnUri", "getReturnUriParam", "getFlowName", "getFlowContext", "Ljava/lang/Object;", "getWebChallengeUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnWebViewIdentityChallenge {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod challengeMethod;
        private final java.lang.String flowContext;
        private final java.lang.String flowName;
        private final java.lang.String id;
        private final java.lang.String returnUri;
        private final java.lang.String returnUriParam;
        private final java.lang.String stepUpContextId;
        private final java.lang.Object webChallengeUrl;

        public OnWebViewIdentityChallenge(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpIdentityChallengeMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.id = str;
            this.challengeMethod = stepUpIdentityChallengeMethod;
            this.stepUpContextId = str2;
            this.returnUri = str3;
            this.returnUriParam = str4;
            this.flowName = str5;
            this.flowContext = str6;
            this.webChallengeUrl = obj;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getChallengeMethod() {
            return this.challengeMethod;
        }

        public final java.lang.String getStepUpContextId() {
            return this.stepUpContextId;
        }

        public final java.lang.String getReturnUri() {
            return this.returnUri;
        }

        public final java.lang.String getReturnUriParam() {
            return this.returnUriParam;
        }

        public final java.lang.String getFlowName() {
            return this.flowName;
        }

        public final java.lang.String getFlowContext() {
            return this.flowContext;
        }

        public final java.lang.Object getWebChallengeUrl() {
            return this.webChallengeUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = this.challengeMethod;
            java.lang.String str2 = this.stepUpContextId;
            java.lang.String str3 = this.returnUri;
            java.lang.String str4 = this.returnUriParam;
            java.lang.String str5 = this.flowName;
            java.lang.String str6 = this.flowContext;
            java.lang.Object obj = this.webChallengeUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnWebViewIdentityChallenge(id=");
            sb.append(str);
            sb.append(", challengeMethod=");
            sb.append(stepUpIdentityChallengeMethod);
            sb.append(", stepUpContextId=");
            sb.append(str2);
            sb.append(", returnUri=");
            sb.append(str3);
            sb.append(", returnUriParam=");
            sb.append(str4);
            sb.append(", flowName=");
            sb.append(str5);
            sb.append(", flowContext=");
            sb.append(str6);
            sb.append(", webChallengeUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.challengeMethod.hashCode();
            int hashCode3 = this.stepUpContextId.hashCode();
            int hashCode4 = this.returnUri.hashCode();
            int hashCode5 = this.returnUriParam.hashCode();
            java.lang.String str = this.flowName;
            int hashCode6 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.flowContext;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.webChallengeUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge onWebViewIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onWebViewIdentityChallenge.id) && this.challengeMethod == onWebViewIdentityChallenge.challengeMethod && kotlin.jvm.internal.Intrinsics.areEqual(this.stepUpContextId, onWebViewIdentityChallenge.stepUpContextId) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUri, onWebViewIdentityChallenge.returnUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUriParam, onWebViewIdentityChallenge.returnUriParam) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowName, onWebViewIdentityChallenge.flowName) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, onWebViewIdentityChallenge.flowContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.webChallengeUrl, onWebViewIdentityChallenge.webChallengeUrl);
        }

        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod challengeMethod, java.lang.String stepUpContextId, java.lang.String returnUri, java.lang.String returnUriParam, java.lang.String flowName, java.lang.String flowContext, java.lang.Object webChallengeUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpContextId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUri, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUriParam, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webChallengeUrl, "");
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge(id, challengeMethod, stepUpContextId, returnUri, returnUriParam, flowName, flowContext, webChallengeUrl);
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Object getWebChallengeUrl() {
            return this.webChallengeUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getFlowContext() {
            return this.flowContext;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getFlowName() {
            return this.flowName;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getReturnUriParam() {
            return this.returnUriParam;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getReturnUri() {
            return this.returnUri;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getStepUpContextId() {
            return this.stepUpContextId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getChallengeMethod() {
            return this.challengeMethod;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query StepUpIdentityChallenges($input: StepUpIdentityChallengesInput!) { stepUpIdentityChallenges(input: $input) { __typename ... on TextOneTimePasscodeIdentityChallenge { id nonce partialToken phoneNumbers { challengeId maskedNumber notified } } ... on EmailOneTimePasscodeIdentityChallenge { id nonce partialToken emailAddresses { challengeId maskedEmail notified } } ... on WhatsappOneTimePasscodeIdentityChallenge { id nonce partialToken phoneNumbers { challengeId maskedNumber notified } } ... on PhoneOneTimePasscodeIdentityChallenge { id nonce partialToken phoneNumbers { challengeId maskedNumber notified } } ... on SecurityQuestionIdentityChallenge { id nonce partialToken securityQuestions { challengeId question } } ... on AuthenticatorAppIdentityChallenge { id nonce partialToken } ... on SilentAuthenticationIdentityChallenge { id nonce partialToken phoneNumbers { challengeId maskedNumber notified evaluateURL } } ... on WebViewIdentityChallenge { id challengeMethod stepUpContextId returnUri returnUriParam flowName flowContext webChallengeUrl } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengesInput stepUpIdentityChallengesInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StepUpIdentityChallengesQuery(input=");
        sb.append(stepUpIdentityChallengesInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.input.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery copy(com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengesInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengesInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery copy$default(com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery stepUpIdentityChallengesQuery, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengesInput stepUpIdentityChallengesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            stepUpIdentityChallengesInput = stepUpIdentityChallengesQuery.input;
        }
        return stepUpIdentityChallengesQuery.copy(stepUpIdentityChallengesInput);
    }
}
