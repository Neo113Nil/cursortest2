package com.paypal.oslo.feature.oneonboarding.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006*+,-.)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardInput;)Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.OPERATION_NAME, "StatusDetail", "Authentication", "Step"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OnboardMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data> {
    public static final java.lang.String OPERATION_ID = "221cfdd3302e2ccfdabcf4283b8a2600a65b8213c35bfbf492f8495ccb7e3b36";
    public static final java.lang.String OPERATION_NAME = "Onboard";
    private final com.paypal.oslo.api.graphql.schema.type.OnboardInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Companion(null);
    public static final int $stable = 8;

    public OnboardMutation(com.paypal.oslo.api.graphql.schema.type.OnboardInput onboardInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardInput, "");
        this.input = onboardInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardInput getInput() {
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
        com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.oneonboarding.graphql.selections.OnboardMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Onboard;", "onboard", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Onboard;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Onboard;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Onboard;)Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Onboard;", "getOnboard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard onboard;

        public Data(com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard onboard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboard, "");
            this.onboard = onboard;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard getOnboard() {
            return this.onboard;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard onboard = this.onboard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(onboard=");
            sb.append(onboard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.onboard.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.onboard, ((com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data) other).onboard);
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data copy(com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard onboard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboard, "");
            return new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data(onboard);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard getOnboard() {
            return this.onboard;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data copy$default(com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data data, com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard onboard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                onboard = data.onboard;
            }
            return data.copy(onboard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010JJ\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Onboard;", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardStatus;", "status", "", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$StatusDetail;", "statusDetails", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Authentication;", "authentication", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Step;", "steps", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardStatus;Ljava/util/List;Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Authentication;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardStatus;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Authentication;", "component4", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardStatus;Ljava/util/List;Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Authentication;Ljava/util/List;)Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Onboard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardStatus;", "getStatus", "Ljava/util/List;", "getStatusDetails", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Authentication;", "getAuthentication", "getSteps"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Onboard {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication authentication;
        private final com.paypal.oslo.api.graphql.schema.type.OnboardStatus status;
        private final java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail> statusDetails;
        private final java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step> steps;

        public Onboard(com.paypal.oslo.api.graphql.schema.type.OnboardStatus onboardStatus, java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail> list, com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication authentication, java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardStatus, "");
            this.status = onboardStatus;
            this.statusDetails = list;
            this.authentication = authentication;
            this.steps = list2;
        }

        public final com.paypal.oslo.api.graphql.schema.type.OnboardStatus getStatus() {
            return this.status;
        }

        public final java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail> getStatusDetails() {
            return this.statusDetails;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication getAuthentication() {
            return this.authentication;
        }

        public final java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step> getSteps() {
            return this.steps;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.OnboardStatus onboardStatus = this.status;
            java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail> list = this.statusDetails;
            com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication authentication = this.authentication;
            java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step> list2 = this.steps;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Onboard(status=");
            sb.append(onboardStatus);
            sb.append(", statusDetails=");
            sb.append(list);
            sb.append(", authentication=");
            sb.append(authentication);
            sb.append(", steps=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode();
            java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail> list = this.statusDetails;
            int hashCode2 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication authentication = this.authentication;
            int hashCode3 = authentication == null ? 0 : authentication.hashCode();
            java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step> list2 = this.steps;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard onboard = (com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard) other;
            return this.status == onboard.status && kotlin.jvm.internal.Intrinsics.areEqual(this.statusDetails, onboard.statusDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.authentication, onboard.authentication) && kotlin.jvm.internal.Intrinsics.areEqual(this.steps, onboard.steps);
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard copy(com.paypal.oslo.api.graphql.schema.type.OnboardStatus status, java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail> statusDetails, com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication authentication, java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step> steps) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard(status, statusDetails, authentication, steps);
        }

        public final java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step> component4() {
            return this.steps;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication getAuthentication() {
            return this.authentication;
        }

        public final java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail> component2() {
            return this.statusDetails;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.OnboardStatus getStatus() {
            return this.status;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard copy$default(com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard onboard, com.paypal.oslo.api.graphql.schema.type.OnboardStatus onboardStatus, java.util.List list, com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication authentication, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                onboardStatus = onboard.status;
            }
            if ((i & 2) != 0) {
                list = onboard.statusDetails;
            }
            if ((i & 4) != 0) {
                authentication = onboard.authentication;
            }
            if ((i & 8) != 0) {
                list2 = onboard.steps;
            }
            return onboard.copy(onboardStatus, list, authentication, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$StatusDetail;", "", "", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$StatusDetail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIssue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StatusDetail {
        public static final int $stable = 0;
        private final java.lang.String issue;

        public StatusDetail(java.lang.String str) {
            this.issue = str;
        }

        public final java.lang.String getIssue() {
            return this.issue;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.issue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StatusDetail(issue=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.issue;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.issue, ((com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail) other).issue);
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail copy(java.lang.String issue) {
            return new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail(issue);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getIssue() {
            return this.issue;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail copy$default(com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail statusDetail, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = statusDetail.issue;
            }
            return statusDetail.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Authentication;", "", "", "__typename", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;", "authenticationTokenFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;)Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Authentication;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;", "getAuthenticationTokenFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Authentication {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment authenticationTokenFragment;

        public Authentication(java.lang.String str, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment authenticationTokenFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationTokenFragment, "");
            this.__typename = str;
            this.authenticationTokenFragment = authenticationTokenFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment getAuthenticationTokenFragment() {
            return this.authenticationTokenFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment authenticationTokenFragment = this.authenticationTokenFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Authentication(__typename=");
            sb.append(str);
            sb.append(", authenticationTokenFragment=");
            sb.append(authenticationTokenFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.authenticationTokenFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication authentication = (com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, authentication.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationTokenFragment, authentication.authenticationTokenFragment);
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication copy(java.lang.String __typename, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment authenticationTokenFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationTokenFragment, "");
            return new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication(__typename, authenticationTokenFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment getAuthenticationTokenFragment() {
            return this.authenticationTokenFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication copy$default(com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication authentication, java.lang.String str, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment authenticationTokenFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = authentication.__typename;
            }
            if ((i & 2) != 0) {
                authenticationTokenFragment = authentication.authenticationTokenFragment;
            }
            return authentication.copy(str, authenticationTokenFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bF\u0010GJÚ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"HÆ\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010L\u001a\u00020K2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010O\u001a\u00020NHÖ\u0001¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bQ\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010T\u001a\u0004\bU\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bW\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010X\u001a\u0004\bY\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\b[\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\\\u001a\u0004\b]\u00101R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010^\u001a\u0004\b_\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010`\u001a\u0004\ba\u00105R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010b\u001a\u0004\bc\u00107R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010d\u001a\u0004\be\u00109R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010f\u001a\u0004\bg\u0010;R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010h\u001a\u0004\bi\u0010=R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010j\u001a\u0004\bk\u0010?R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010l\u001a\u0004\bm\u0010AR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010n\u001a\u0004\bo\u0010CR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010p\u001a\u0004\bq\u0010ER\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010r\u001a\u0004\bs\u0010G"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Step;", "", "", "__typename", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PhoneStepComponentFragment;", "phoneStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PasswordStepComponentFragment;", "passwordStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TermsStepComponentFragment;", "termsStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CryptoTermsStepComponentFragment;", "cryptoTermsStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPW9StepComponentFragment;", "cIPW9StepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPTaxInfoStepComponentFragment;", "cIPTaxInfoStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment;", "personalInfoStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/AccountSubmissionStepComponentFragment;", "accountSubmissionStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SignUpWithGoogleStepComponentFragment;", "signUpWithGoogleStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SubmissionStepComponentFragment;", "submissionStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SavingsCIPW9StepComponentFragment;", "savingsCIPW9StepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPPersonalInfoStepComponentFragment;", "cIPPersonalInfoStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TermsSheetViewStepComponentFragment;", "termsSheetViewStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/ModuleLauncherStepComponentFragment;", "moduleLauncherStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DocUploadStepComponentFragment;", "docUploadStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TerminalStepComponentFragment;", "terminalStepComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PhoneStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PasswordStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TermsStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CryptoTermsStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPW9StepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPTaxInfoStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/AccountSubmissionStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SignUpWithGoogleStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SubmissionStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SavingsCIPW9StepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPPersonalInfoStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TermsSheetViewStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/ModuleLauncherStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DocUploadStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TerminalStepComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PhoneStepComponentFragment;", "component3", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PasswordStepComponentFragment;", "component4", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TermsStepComponentFragment;", "component5", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CryptoTermsStepComponentFragment;", "component6", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPW9StepComponentFragment;", "component7", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPTaxInfoStepComponentFragment;", "component8", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment;", "component9", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/AccountSubmissionStepComponentFragment;", "component10", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SignUpWithGoogleStepComponentFragment;", "component11", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SubmissionStepComponentFragment;", "component12", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SavingsCIPW9StepComponentFragment;", "component13", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPPersonalInfoStepComponentFragment;", "component14", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TermsSheetViewStepComponentFragment;", "component15", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/ModuleLauncherStepComponentFragment;", "component16", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DocUploadStepComponentFragment;", "component17", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TerminalStepComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PhoneStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PasswordStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TermsStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CryptoTermsStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPW9StepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPTaxInfoStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/AccountSubmissionStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SignUpWithGoogleStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SubmissionStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SavingsCIPW9StepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPPersonalInfoStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TermsSheetViewStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/ModuleLauncherStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DocUploadStepComponentFragment;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TerminalStepComponentFragment;)Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Step;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PhoneStepComponentFragment;", "getPhoneStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PasswordStepComponentFragment;", "getPasswordStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TermsStepComponentFragment;", "getTermsStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CryptoTermsStepComponentFragment;", "getCryptoTermsStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPW9StepComponentFragment;", "getCIPW9StepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPTaxInfoStepComponentFragment;", "getCIPTaxInfoStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment;", "getPersonalInfoStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/AccountSubmissionStepComponentFragment;", "getAccountSubmissionStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SignUpWithGoogleStepComponentFragment;", "getSignUpWithGoogleStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SubmissionStepComponentFragment;", "getSubmissionStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SavingsCIPW9StepComponentFragment;", "getSavingsCIPW9StepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/CIPPersonalInfoStepComponentFragment;", "getCIPPersonalInfoStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TermsSheetViewStepComponentFragment;", "getTermsSheetViewStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/ModuleLauncherStepComponentFragment;", "getModuleLauncherStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DocUploadStepComponentFragment;", "getDocUploadStepComponentFragment", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TerminalStepComponentFragment;", "getTerminalStepComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Step {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.AccountSubmissionStepComponentFragment accountSubmissionStepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPPersonalInfoStepComponentFragment cIPPersonalInfoStepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPTaxInfoStepComponentFragment cIPTaxInfoStepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPW9StepComponentFragment cIPW9StepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.CryptoTermsStepComponentFragment cryptoTermsStepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadStepComponentFragment docUploadStepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment moduleLauncherStepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PasswordStepComponentFragment passwordStepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment personalInfoStepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment phoneStepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment savingsCIPW9StepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment signUpWithGoogleStepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.SubmissionStepComponentFragment submissionStepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment terminalStepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment termsSheetViewStepComponentFragment;
        private final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsStepComponentFragment termsStepComponentFragment;

        public Step(java.lang.String str, com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment phoneStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.PasswordStepComponentFragment passwordStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsStepComponentFragment termsStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.CryptoTermsStepComponentFragment cryptoTermsStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPW9StepComponentFragment cIPW9StepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPTaxInfoStepComponentFragment cIPTaxInfoStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment personalInfoStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.AccountSubmissionStepComponentFragment accountSubmissionStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment signUpWithGoogleStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.SubmissionStepComponentFragment submissionStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment savingsCIPW9StepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPPersonalInfoStepComponentFragment cIPPersonalInfoStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment termsSheetViewStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment moduleLauncherStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadStepComponentFragment docUploadStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment terminalStepComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.phoneStepComponentFragment = phoneStepComponentFragment;
            this.passwordStepComponentFragment = passwordStepComponentFragment;
            this.termsStepComponentFragment = termsStepComponentFragment;
            this.cryptoTermsStepComponentFragment = cryptoTermsStepComponentFragment;
            this.cIPW9StepComponentFragment = cIPW9StepComponentFragment;
            this.cIPTaxInfoStepComponentFragment = cIPTaxInfoStepComponentFragment;
            this.personalInfoStepComponentFragment = personalInfoStepComponentFragment;
            this.accountSubmissionStepComponentFragment = accountSubmissionStepComponentFragment;
            this.signUpWithGoogleStepComponentFragment = signUpWithGoogleStepComponentFragment;
            this.submissionStepComponentFragment = submissionStepComponentFragment;
            this.savingsCIPW9StepComponentFragment = savingsCIPW9StepComponentFragment;
            this.cIPPersonalInfoStepComponentFragment = cIPPersonalInfoStepComponentFragment;
            this.termsSheetViewStepComponentFragment = termsSheetViewStepComponentFragment;
            this.moduleLauncherStepComponentFragment = moduleLauncherStepComponentFragment;
            this.docUploadStepComponentFragment = docUploadStepComponentFragment;
            this.terminalStepComponentFragment = terminalStepComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment getPhoneStepComponentFragment() {
            return this.phoneStepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PasswordStepComponentFragment getPasswordStepComponentFragment() {
            return this.passwordStepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsStepComponentFragment getTermsStepComponentFragment() {
            return this.termsStepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.CryptoTermsStepComponentFragment getCryptoTermsStepComponentFragment() {
            return this.cryptoTermsStepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPW9StepComponentFragment getCIPW9StepComponentFragment() {
            return this.cIPW9StepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPTaxInfoStepComponentFragment getCIPTaxInfoStepComponentFragment() {
            return this.cIPTaxInfoStepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment getPersonalInfoStepComponentFragment() {
            return this.personalInfoStepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.AccountSubmissionStepComponentFragment getAccountSubmissionStepComponentFragment() {
            return this.accountSubmissionStepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment getSignUpWithGoogleStepComponentFragment() {
            return this.signUpWithGoogleStepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.SubmissionStepComponentFragment getSubmissionStepComponentFragment() {
            return this.submissionStepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment getSavingsCIPW9StepComponentFragment() {
            return this.savingsCIPW9StepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPPersonalInfoStepComponentFragment getCIPPersonalInfoStepComponentFragment() {
            return this.cIPPersonalInfoStepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment getTermsSheetViewStepComponentFragment() {
            return this.termsSheetViewStepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment getModuleLauncherStepComponentFragment() {
            return this.moduleLauncherStepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadStepComponentFragment getDocUploadStepComponentFragment() {
            return this.docUploadStepComponentFragment;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment getTerminalStepComponentFragment() {
            return this.terminalStepComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment phoneStepComponentFragment = this.phoneStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.PasswordStepComponentFragment passwordStepComponentFragment = this.passwordStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsStepComponentFragment termsStepComponentFragment = this.termsStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.CryptoTermsStepComponentFragment cryptoTermsStepComponentFragment = this.cryptoTermsStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPW9StepComponentFragment cIPW9StepComponentFragment = this.cIPW9StepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPTaxInfoStepComponentFragment cIPTaxInfoStepComponentFragment = this.cIPTaxInfoStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment personalInfoStepComponentFragment = this.personalInfoStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.AccountSubmissionStepComponentFragment accountSubmissionStepComponentFragment = this.accountSubmissionStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment signUpWithGoogleStepComponentFragment = this.signUpWithGoogleStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.SubmissionStepComponentFragment submissionStepComponentFragment = this.submissionStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment savingsCIPW9StepComponentFragment = this.savingsCIPW9StepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPPersonalInfoStepComponentFragment cIPPersonalInfoStepComponentFragment = this.cIPPersonalInfoStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment termsSheetViewStepComponentFragment = this.termsSheetViewStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment moduleLauncherStepComponentFragment = this.moduleLauncherStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadStepComponentFragment docUploadStepComponentFragment = this.docUploadStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment terminalStepComponentFragment = this.terminalStepComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Step(__typename=");
            sb.append(str);
            sb.append(", phoneStepComponentFragment=");
            sb.append(phoneStepComponentFragment);
            sb.append(", passwordStepComponentFragment=");
            sb.append(passwordStepComponentFragment);
            sb.append(", termsStepComponentFragment=");
            sb.append(termsStepComponentFragment);
            sb.append(", cryptoTermsStepComponentFragment=");
            sb.append(cryptoTermsStepComponentFragment);
            sb.append(", cIPW9StepComponentFragment=");
            sb.append(cIPW9StepComponentFragment);
            sb.append(", cIPTaxInfoStepComponentFragment=");
            sb.append(cIPTaxInfoStepComponentFragment);
            sb.append(", personalInfoStepComponentFragment=");
            sb.append(personalInfoStepComponentFragment);
            sb.append(", accountSubmissionStepComponentFragment=");
            sb.append(accountSubmissionStepComponentFragment);
            sb.append(", signUpWithGoogleStepComponentFragment=");
            sb.append(signUpWithGoogleStepComponentFragment);
            sb.append(", submissionStepComponentFragment=");
            sb.append(submissionStepComponentFragment);
            sb.append(", savingsCIPW9StepComponentFragment=");
            sb.append(savingsCIPW9StepComponentFragment);
            sb.append(", cIPPersonalInfoStepComponentFragment=");
            sb.append(cIPPersonalInfoStepComponentFragment);
            sb.append(", termsSheetViewStepComponentFragment=");
            sb.append(termsSheetViewStepComponentFragment);
            sb.append(", moduleLauncherStepComponentFragment=");
            sb.append(moduleLauncherStepComponentFragment);
            sb.append(", docUploadStepComponentFragment=");
            sb.append(docUploadStepComponentFragment);
            sb.append(", terminalStepComponentFragment=");
            sb.append(terminalStepComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment phoneStepComponentFragment = this.phoneStepComponentFragment;
            int hashCode2 = phoneStepComponentFragment == null ? 0 : phoneStepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.PasswordStepComponentFragment passwordStepComponentFragment = this.passwordStepComponentFragment;
            int hashCode3 = passwordStepComponentFragment == null ? 0 : passwordStepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsStepComponentFragment termsStepComponentFragment = this.termsStepComponentFragment;
            int hashCode4 = termsStepComponentFragment == null ? 0 : termsStepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.CryptoTermsStepComponentFragment cryptoTermsStepComponentFragment = this.cryptoTermsStepComponentFragment;
            int hashCode5 = cryptoTermsStepComponentFragment == null ? 0 : cryptoTermsStepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPW9StepComponentFragment cIPW9StepComponentFragment = this.cIPW9StepComponentFragment;
            int hashCode6 = cIPW9StepComponentFragment == null ? 0 : cIPW9StepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPTaxInfoStepComponentFragment cIPTaxInfoStepComponentFragment = this.cIPTaxInfoStepComponentFragment;
            int hashCode7 = cIPTaxInfoStepComponentFragment == null ? 0 : cIPTaxInfoStepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment personalInfoStepComponentFragment = this.personalInfoStepComponentFragment;
            int hashCode8 = personalInfoStepComponentFragment == null ? 0 : personalInfoStepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.AccountSubmissionStepComponentFragment accountSubmissionStepComponentFragment = this.accountSubmissionStepComponentFragment;
            int hashCode9 = accountSubmissionStepComponentFragment == null ? 0 : accountSubmissionStepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment signUpWithGoogleStepComponentFragment = this.signUpWithGoogleStepComponentFragment;
            int hashCode10 = signUpWithGoogleStepComponentFragment == null ? 0 : signUpWithGoogleStepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.SubmissionStepComponentFragment submissionStepComponentFragment = this.submissionStepComponentFragment;
            int hashCode11 = submissionStepComponentFragment == null ? 0 : submissionStepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment savingsCIPW9StepComponentFragment = this.savingsCIPW9StepComponentFragment;
            int hashCode12 = savingsCIPW9StepComponentFragment == null ? 0 : savingsCIPW9StepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPPersonalInfoStepComponentFragment cIPPersonalInfoStepComponentFragment = this.cIPPersonalInfoStepComponentFragment;
            int hashCode13 = cIPPersonalInfoStepComponentFragment == null ? 0 : cIPPersonalInfoStepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment termsSheetViewStepComponentFragment = this.termsSheetViewStepComponentFragment;
            int hashCode14 = termsSheetViewStepComponentFragment == null ? 0 : termsSheetViewStepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment moduleLauncherStepComponentFragment = this.moduleLauncherStepComponentFragment;
            int hashCode15 = moduleLauncherStepComponentFragment == null ? 0 : moduleLauncherStepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadStepComponentFragment docUploadStepComponentFragment = this.docUploadStepComponentFragment;
            int hashCode16 = docUploadStepComponentFragment == null ? 0 : docUploadStepComponentFragment.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment terminalStepComponentFragment = this.terminalStepComponentFragment;
            return (((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + (terminalStepComponentFragment != null ? terminalStepComponentFragment.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step step = (com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, step.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneStepComponentFragment, step.phoneStepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.passwordStepComponentFragment, step.passwordStepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.termsStepComponentFragment, step.termsStepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoTermsStepComponentFragment, step.cryptoTermsStepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.cIPW9StepComponentFragment, step.cIPW9StepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.cIPTaxInfoStepComponentFragment, step.cIPTaxInfoStepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.personalInfoStepComponentFragment, step.personalInfoStepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountSubmissionStepComponentFragment, step.accountSubmissionStepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.signUpWithGoogleStepComponentFragment, step.signUpWithGoogleStepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.submissionStepComponentFragment, step.submissionStepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsCIPW9StepComponentFragment, step.savingsCIPW9StepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.cIPPersonalInfoStepComponentFragment, step.cIPPersonalInfoStepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.termsSheetViewStepComponentFragment, step.termsSheetViewStepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.moduleLauncherStepComponentFragment, step.moduleLauncherStepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.docUploadStepComponentFragment, step.docUploadStepComponentFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.terminalStepComponentFragment, step.terminalStepComponentFragment);
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step copy(java.lang.String __typename, com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment phoneStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.PasswordStepComponentFragment passwordStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsStepComponentFragment termsStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.CryptoTermsStepComponentFragment cryptoTermsStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPW9StepComponentFragment cIPW9StepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPTaxInfoStepComponentFragment cIPTaxInfoStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment personalInfoStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.AccountSubmissionStepComponentFragment accountSubmissionStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment signUpWithGoogleStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.SubmissionStepComponentFragment submissionStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment savingsCIPW9StepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPPersonalInfoStepComponentFragment cIPPersonalInfoStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment termsSheetViewStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment moduleLauncherStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadStepComponentFragment docUploadStepComponentFragment, com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment terminalStepComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step(__typename, phoneStepComponentFragment, passwordStepComponentFragment, termsStepComponentFragment, cryptoTermsStepComponentFragment, cIPW9StepComponentFragment, cIPTaxInfoStepComponentFragment, personalInfoStepComponentFragment, accountSubmissionStepComponentFragment, signUpWithGoogleStepComponentFragment, submissionStepComponentFragment, savingsCIPW9StepComponentFragment, cIPPersonalInfoStepComponentFragment, termsSheetViewStepComponentFragment, moduleLauncherStepComponentFragment, docUploadStepComponentFragment, terminalStepComponentFragment);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.AccountSubmissionStepComponentFragment getAccountSubmissionStepComponentFragment() {
            return this.accountSubmissionStepComponentFragment;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment getPersonalInfoStepComponentFragment() {
            return this.personalInfoStepComponentFragment;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPTaxInfoStepComponentFragment getCIPTaxInfoStepComponentFragment() {
            return this.cIPTaxInfoStepComponentFragment;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPW9StepComponentFragment getCIPW9StepComponentFragment() {
            return this.cIPW9StepComponentFragment;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.CryptoTermsStepComponentFragment getCryptoTermsStepComponentFragment() {
            return this.cryptoTermsStepComponentFragment;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsStepComponentFragment getTermsStepComponentFragment() {
            return this.termsStepComponentFragment;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PasswordStepComponentFragment getPasswordStepComponentFragment() {
            return this.passwordStepComponentFragment;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment getPhoneStepComponentFragment() {
            return this.phoneStepComponentFragment;
        }

        /* renamed from: component17, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment getTerminalStepComponentFragment() {
            return this.terminalStepComponentFragment;
        }

        /* renamed from: component16, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadStepComponentFragment getDocUploadStepComponentFragment() {
            return this.docUploadStepComponentFragment;
        }

        /* renamed from: component15, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment getModuleLauncherStepComponentFragment() {
            return this.moduleLauncherStepComponentFragment;
        }

        /* renamed from: component14, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment getTermsSheetViewStepComponentFragment() {
            return this.termsSheetViewStepComponentFragment;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPPersonalInfoStepComponentFragment getCIPPersonalInfoStepComponentFragment() {
            return this.cIPPersonalInfoStepComponentFragment;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment getSavingsCIPW9StepComponentFragment() {
            return this.savingsCIPW9StepComponentFragment;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.SubmissionStepComponentFragment getSubmissionStepComponentFragment() {
            return this.submissionStepComponentFragment;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment getSignUpWithGoogleStepComponentFragment() {
            return this.signUpWithGoogleStepComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation Onboard($input: OnboardInput!) { onboard(input: $input) { status statusDetails { issue } authentication { __typename ...AuthenticationTokenFragment } steps { __typename ...PhoneStepComponentFragment ...PasswordStepComponentFragment ...TermsStepComponentFragment ...CryptoTermsStepComponentFragment ...CIPW9StepComponentFragment ...CIPTaxInfoStepComponentFragment ...PersonalInfoStepComponentFragment ...AccountSubmissionStepComponentFragment ...SignUpWithGoogleStepComponentFragment ...SubmissionStepComponentFragment ...SavingsCIPW9StepComponentFragment ...CIPPersonalInfoStepComponentFragment ...TermsSheetViewStepComponentFragment ...ModuleLauncherStepComponentFragment ...DocUploadStepComponentFragment ...TerminalStepComponentFragment } } }  fragment AuthenticationTokenFragment on OnboardAuthentication { token expiresInSec expiresAtTime }  fragment ContextualInfoFragment on OnboardContextualInfo { issue }  fragment PhoneStepComponentFragment on OnboardPhoneStepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } component { id contextualInfo { __typename ...ContextualInfoFragment } variant phone { countryCode nationalNumber } editable } }  fragment PasswordStepComponentFragment on OnboardPasswordStepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } component { id contextualInfo { __typename ...ContextualInfoFragment } } }  fragment BalanceTermsInputFragment on OnboardBalanceTermsInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } }  fragment CryptoTermsInputFragment on OnboardCryptoTermsInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } }  fragment PPDCTermsInputFragment on OnboardPPDCTermsInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } }  fragment TermsStepComponentFragment on OnboardTermsStepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } components { __typename ...BalanceTermsInputFragment ...CryptoTermsInputFragment ...PPDCTermsInputFragment } }  fragment CryptoTermsStepComponentFragment on OnboardCryptoTermsStepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } components { __typename ...CryptoTermsInputFragment } }  fragment NameInputComponentFragment on OnboardNameInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } nameVariant: variant editable name { givenName middleName surname secondSurname } }  fragment DateOfBirthInputComponentFragment on OnboardDateOfBirthInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } dateOfBirthVariant: variant editable birthDate }  fragment TaxpayerIdInputComponentFragment on OnboardTaxpayerIdInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } taxpayerIdVariant: variant editable options { type taxId } displayHelperTextWithLink }  fragment AddressSelectionInputComponentFragment on OnboardAddressSelectionInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } addressSelectionInputComponentVariant: variant addresses { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 adminArea4 postalCode countryCode } editable }  fragment W9TermsInputComponentFragment on OnboardW9TermsInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } }  fragment CIPW9StepComponentFragment on OnboardCIPW9StepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } components { __typename ...NameInputComponentFragment ...DateOfBirthInputComponentFragment ...TaxpayerIdInputComponentFragment ...AddressSelectionInputComponentFragment ...W9TermsInputComponentFragment } }  fragment CIPTaxInfoStepComponentFragment on OnboardCIPTaxInfoStepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } components { __typename ...TaxpayerIdInputComponentFragment } }  fragment AddressInputComponentFragment on OnboardAddressInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } addressVariant: variant editable address { addressLine1 addressLine2 addressLine3 adminArea4 adminArea3 adminArea2 adminArea1 postalCode countryCode } }  fragment AccountCreationTermsInputFragment on OnboardAccountCreationTermsInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } }  fragment PersonalInfoStepComponentFragment on OnboardPersonalInfoStepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } components { __typename ...NameInputComponentFragment ...AddressInputComponentFragment ...DateOfBirthInputComponentFragment ...AccountCreationTermsInputFragment } }  fragment AccountSubmissionStepComponentFragment on OnboardAccountCreationSubmissionStepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } }  fragment GoogleAccountInfoDisplayComponentFragment on OnboardGoogleAccountInfoDisplayComponent { __typename email profilePictureUrl }  fragment SignUpWithGoogleStepComponentFragment on OnboardSignUpWithGoogleStepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } components { __typename ...GoogleAccountInfoDisplayComponentFragment ...NameInputComponentFragment } }  fragment SubmissionStepComponentFragment on OnboardSubmissionStepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } }  fragment NameAddressInputComponentFragment on OnboardNameAddressInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } nameAddressInputComponentVariant: variant name { givenName middleName surname secondSurname } addresses { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 adminArea4 postalCode countryCode } editable }  fragment DateOfBirthPickerInputComponentFragment on OnboardDateOfBirthPickerInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } dateOfBirthPickerInputComponentVariant: variant editable birthDate }  fragment W9ConsentInputComponentFragment on OnboardW9ConsentInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } }  fragment SavingsCIPW9StepComponentFragment on OnboardSavingsCIPW9StepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } components { __typename ...NameAddressInputComponentFragment ...DateOfBirthPickerInputComponentFragment ...TaxpayerIdInputComponentFragment ...W9ConsentInputComponentFragment } }  fragment CIPPersonalInfoStepComponentFragment on OnboardCIPPersonalInfoStepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } components { __typename ...NameAddressInputComponentFragment ...DateOfBirthPickerInputComponentFragment } }  fragment TermsSheetViewStepComponentFragment on OnboardTermsSheetViewStepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } components { __typename ...BalanceTermsInputFragment ...PPDCTermsInputFragment } }  fragment StepUpComponentFragment on OnboardStepUpComponent { __typename id stepUpContextId flowContextId }  fragment ModuleLauncherStepComponentFragment on OnboardModuleLauncherStepComponent { __typename id component { __typename ...StepUpComponentFragment } }  fragment DocUploadInputComponentFragment on OnboardDocUploadInputComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } documentCategory allowedDocumentTypes }  fragment DocUploadStepComponentFragment on OnboardDocUploadStepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } components { __typename ...DocUploadInputComponentFragment } }  fragment ReviewPendingComponentFragment on OnboardReviewPendingComponent { __typename id }  fragment AdditionalInfoNeededComponentFragment on OnboardAdditionalInfoNeededComponent { __typename id }  fragment RegionNotSupportedComponentFragment on OnboardRegionNotSupportedComponent { __typename id }  fragment ProductNotSetupComponentFragment on OnboardProductNotSetupComponent { __typename id }  fragment TerminalStepComponentFragment on OnboardTerminalStepComponent { __typename id contextualInfo { __typename ...ContextualInfoFragment } component { __typename ...ReviewPendingComponentFragment ...AdditionalInfoNeededComponentFragment ...RegionNotSupportedComponentFragment ...ProductNotSetupComponentFragment } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.OnboardInput onboardInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardMutation(input=");
        sb.append(onboardInput);
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
        return (other instanceof com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation) other).input);
    }

    public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation copy(com.paypal.oslo.api.graphql.schema.type.OnboardInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OnboardInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation copy$default(com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation onboardMutation, com.paypal.oslo.api.graphql.schema.type.OnboardInput onboardInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            onboardInput = onboardMutation.input;
        }
        return onboardMutation.copy(onboardInput);
    }
}
