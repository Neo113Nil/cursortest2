package com.paypal.oslo.feature.onboarding.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\n*+,-./012)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingFlowStepsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingFlowStepsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardingFlowStepsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingFlowStepsInput;)Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingFlowStepsInput;", "getInput", "Companion", "Data", "OnboardingFlowStep", "SupportedTransition", "FlowDatum", "Progress", "OnOnboardingContinuousProgress", com.google.common.net.HttpHeaders.RANGE, "OnOnboardingSegmentedProgress", "Range1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetOnboardingFlowStepsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "7369e0eafabff6ff787b78a9b612647c8e42ca998748e77f07a462a8a9607a4e";
    public static final java.lang.String OPERATION_NAME = "GetOnboardingFlowSteps";
    private final com.paypal.oslo.api.graphql.schema.type.OnboardingFlowStepsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Companion(null);
    public static final int $stable = 8;

    public GetOnboardingFlowStepsQuery(com.paypal.oslo.api.graphql.schema.type.OnboardingFlowStepsInput onboardingFlowStepsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingFlowStepsInput, "");
        this.input = onboardingFlowStepsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardingFlowStepsInput getInput() {
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
        com.paypal.oslo.feature.onboarding.graphql.adapter.GetOnboardingFlowStepsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.onboarding.graphql.adapter.GetOnboardingFlowStepsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.onboarding.graphql.selections.GetOnboardingFlowStepsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnboardingFlowStep;", "onboardingFlowSteps", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOnboardingFlowSteps"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep> onboardingFlowSteps;

        public Data(java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.onboardingFlowSteps = list;
        }

        public final java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep> getOnboardingFlowSteps() {
            return this.onboardingFlowSteps;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep> list = this.onboardingFlowSteps;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(onboardingFlowSteps=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.onboardingFlowSteps.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.onboardingFlowSteps, ((com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Data) other).onboardingFlowSteps);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Data copy(java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep> onboardingFlowSteps) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingFlowSteps, "");
            return new com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Data(onboardingFlowSteps);
        }

        public final java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep> component1() {
            return this.onboardingFlowSteps;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Data copy$default(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.onboardingFlowSteps;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b%\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnboardingFlowStep;", "", "", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "pageId", "", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$SupportedTransition;", "supportedTransitions", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$FlowDatum;", "flowData", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Progress;", "progress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Progress;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Progress;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Progress;)Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnboardingFlowStep;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFlowId", "getPageId", "Ljava/util/List;", "getSupportedTransitions", "getFlowData", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Progress;", "getProgress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingFlowStep {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum> flowData;
        private final java.lang.String flowId;
        private final java.lang.String pageId;
        private final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress progress;
        private final java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition> supportedTransitions;

        public OnboardingFlowStep(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition> list, java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum> list2, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress progress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.flowId = str;
            this.pageId = str2;
            this.supportedTransitions = list;
            this.flowData = list2;
            this.progress = progress;
        }

        public final java.lang.String getFlowId() {
            return this.flowId;
        }

        public final java.lang.String getPageId() {
            return this.pageId;
        }

        public final java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition> getSupportedTransitions() {
            return this.supportedTransitions;
        }

        public final java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum> getFlowData() {
            return this.flowData;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress getProgress() {
            return this.progress;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.flowId;
            java.lang.String str2 = this.pageId;
            java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition> list = this.supportedTransitions;
            java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum> list2 = this.flowData;
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress progress = this.progress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardingFlowStep(flowId=");
            sb.append(str);
            sb.append(", pageId=");
            sb.append(str2);
            sb.append(", supportedTransitions=");
            sb.append(list);
            sb.append(", flowData=");
            sb.append(list2);
            sb.append(", progress=");
            sb.append(progress);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.flowId.hashCode();
            int hashCode2 = this.pageId.hashCode();
            java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition> list = this.supportedTransitions;
            int hashCode3 = list == null ? 0 : list.hashCode();
            java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum> list2 = this.flowData;
            int hashCode4 = list2 == null ? 0 : list2.hashCode();
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress progress = this.progress;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (progress != null ? progress.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep onboardingFlowStep = (com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.flowId, onboardingFlowStep.flowId) && kotlin.jvm.internal.Intrinsics.areEqual(this.pageId, onboardingFlowStep.pageId) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedTransitions, onboardingFlowStep.supportedTransitions) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowData, onboardingFlowStep.flowData) && kotlin.jvm.internal.Intrinsics.areEqual(this.progress, onboardingFlowStep.progress);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep copy(java.lang.String flowId, java.lang.String pageId, java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition> supportedTransitions, java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum> flowData, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress progress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageId, "");
            return new com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep(flowId, pageId, supportedTransitions, flowData, progress);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress getProgress() {
            return this.progress;
        }

        public final java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum> component4() {
            return this.flowData;
        }

        public final java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition> component3() {
            return this.supportedTransitions;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPageId() {
            return this.pageId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFlowId() {
            return this.flowId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep copy$default(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnboardingFlowStep onboardingFlowStep, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress progress, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onboardingFlowStep.flowId;
            }
            if ((i & 2) != 0) {
                str2 = onboardingFlowStep.pageId;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                list = onboardingFlowStep.supportedTransitions;
            }
            java.util.List list3 = list;
            if ((i & 8) != 0) {
                list2 = onboardingFlowStep.flowData;
            }
            java.util.List list4 = list2;
            if ((i & 16) != 0) {
                progress = onboardingFlowStep.progress;
            }
            return onboardingFlowStep.copy(str, str3, list3, list4, progress);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$SupportedTransition;", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingTransition;", "transition", "", "prefetchable", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingTransition;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardingTransition;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingTransition;Z)Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$SupportedTransition;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingTransition;", "getTransition", "Z", "getPrefetchable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SupportedTransition {
        public static final int $stable = 0;
        private final boolean prefetchable;
        private final com.paypal.oslo.api.graphql.schema.type.OnboardingTransition transition;

        public SupportedTransition(com.paypal.oslo.api.graphql.schema.type.OnboardingTransition onboardingTransition, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingTransition, "");
            this.transition = onboardingTransition;
            this.prefetchable = z;
        }

        public final com.paypal.oslo.api.graphql.schema.type.OnboardingTransition getTransition() {
            return this.transition;
        }

        public final boolean getPrefetchable() {
            return this.prefetchable;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.OnboardingTransition onboardingTransition = this.transition;
            boolean z = this.prefetchable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SupportedTransition(transition=");
            sb.append(onboardingTransition);
            sb.append(", prefetchable=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.transition.hashCode() * 31) + java.lang.Boolean.hashCode(this.prefetchable);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition supportedTransition = (com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition) other;
            return this.transition == supportedTransition.transition && this.prefetchable == supportedTransition.prefetchable;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition copy(com.paypal.oslo.api.graphql.schema.type.OnboardingTransition transition, boolean prefetchable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "");
            return new com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition(transition, prefetchable);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getPrefetchable() {
            return this.prefetchable;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.OnboardingTransition getTransition() {
            return this.transition;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition copy$default(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.SupportedTransition supportedTransition, com.paypal.oslo.api.graphql.schema.type.OnboardingTransition onboardingTransition, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                onboardingTransition = supportedTransition.transition;
            }
            if ((i & 2) != 0) {
                z = supportedTransition.prefetchable;
            }
            return supportedTransition.copy(onboardingTransition, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$FlowDatum;", "", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$FlowDatum;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getKey", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FlowDatum {
        public static final int $stable = 0;
        private final java.lang.String key;
        private final java.lang.String value;

        public FlowDatum(java.lang.String str, java.lang.String str2) {
            this.key = str;
            this.value = str2;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.key;
            java.lang.String str2 = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FlowDatum(key=");
            sb.append(str);
            sb.append(", value=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.key;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.value;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum flowDatum = (com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, flowDatum.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, flowDatum.value);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum copy(java.lang.String key, java.lang.String value) {
            return new com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum(key, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getKey() {
            return this.key;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum copy$default(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.FlowDatum flowDatum, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = flowDatum.key;
            }
            if ((i & 2) != 0) {
                str2 = flowDatum.value;
            }
            return flowDatum.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Progress;", "", "", "__typename", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingContinuousProgress;", "onOnboardingContinuousProgress", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingSegmentedProgress;", "onOnboardingSegmentedProgress", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingContinuousProgress;Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingSegmentedProgress;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingContinuousProgress;", "component3", "()Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingSegmentedProgress;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingContinuousProgress;Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingSegmentedProgress;)Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Progress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingContinuousProgress;", "getOnOnboardingContinuousProgress", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingSegmentedProgress;", "getOnOnboardingSegmentedProgress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Progress {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress onOnboardingContinuousProgress;
        private final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress onOnboardingSegmentedProgress;

        public Progress(java.lang.String str, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress onOnboardingContinuousProgress, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress onOnboardingSegmentedProgress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onOnboardingContinuousProgress = onOnboardingContinuousProgress;
            this.onOnboardingSegmentedProgress = onOnboardingSegmentedProgress;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress getOnOnboardingContinuousProgress() {
            return this.onOnboardingContinuousProgress;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress getOnOnboardingSegmentedProgress() {
            return this.onOnboardingSegmentedProgress;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress onOnboardingContinuousProgress = this.onOnboardingContinuousProgress;
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress onOnboardingSegmentedProgress = this.onOnboardingSegmentedProgress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progress(__typename=");
            sb.append(str);
            sb.append(", onOnboardingContinuousProgress=");
            sb.append(onOnboardingContinuousProgress);
            sb.append(", onOnboardingSegmentedProgress=");
            sb.append(onOnboardingSegmentedProgress);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress onOnboardingContinuousProgress = this.onOnboardingContinuousProgress;
            int hashCode2 = onOnboardingContinuousProgress == null ? 0 : onOnboardingContinuousProgress.hashCode();
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress onOnboardingSegmentedProgress = this.onOnboardingSegmentedProgress;
            return (((hashCode * 31) + hashCode2) * 31) + (onOnboardingSegmentedProgress != null ? onOnboardingSegmentedProgress.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress progress = (com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, progress.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onOnboardingContinuousProgress, progress.onOnboardingContinuousProgress) && kotlin.jvm.internal.Intrinsics.areEqual(this.onOnboardingSegmentedProgress, progress.onOnboardingSegmentedProgress);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress copy(java.lang.String __typename, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress onOnboardingContinuousProgress, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress onOnboardingSegmentedProgress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress(__typename, onOnboardingContinuousProgress, onOnboardingSegmentedProgress);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress getOnOnboardingSegmentedProgress() {
            return this.onOnboardingSegmentedProgress;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress getOnOnboardingContinuousProgress() {
            return this.onOnboardingContinuousProgress;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress copy$default(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Progress progress, java.lang.String str, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress onOnboardingContinuousProgress, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress onOnboardingSegmentedProgress, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = progress.__typename;
            }
            if ((i & 2) != 0) {
                onOnboardingContinuousProgress = progress.onOnboardingContinuousProgress;
            }
            if ((i & 4) != 0) {
                onOnboardingSegmentedProgress = progress.onOnboardingSegmentedProgress;
            }
            return progress.copy(str, onOnboardingContinuousProgress, onOnboardingSegmentedProgress);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingContinuousProgress;", "", "", "currentProgress", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range;", "range", "<init>", "(Ljava/lang/Integer;Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range;", "copy", "(Ljava/lang/Integer;Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range;)Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingContinuousProgress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getCurrentProgress", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range;", "getRange"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnOnboardingContinuousProgress {
        public static final int $stable = 0;
        private final java.lang.Integer currentProgress;
        private final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range range;

        public OnOnboardingContinuousProgress(java.lang.Integer num, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range range) {
            this.currentProgress = num;
            this.range = range;
        }

        public final java.lang.Integer getCurrentProgress() {
            return this.currentProgress;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range getRange() {
            return this.range;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.currentProgress;
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range range = this.range;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnOnboardingContinuousProgress(currentProgress=");
            sb.append(num);
            sb.append(", range=");
            sb.append(range);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.currentProgress;
            int hashCode = num == null ? 0 : num.hashCode();
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range range = this.range;
            return (hashCode * 31) + (range != null ? range.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress onOnboardingContinuousProgress = (com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currentProgress, onOnboardingContinuousProgress.currentProgress) && kotlin.jvm.internal.Intrinsics.areEqual(this.range, onOnboardingContinuousProgress.range);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress copy(java.lang.Integer currentProgress, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range range) {
            return new com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress(currentProgress, range);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range getRange() {
            return this.range;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getCurrentProgress() {
            return this.currentProgress;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress copy$default(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingContinuousProgress onOnboardingContinuousProgress, java.lang.Integer num, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range range, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = onOnboardingContinuousProgress.currentProgress;
            }
            if ((i & 2) != 0) {
                range = onOnboardingContinuousProgress.range;
            }
            return onOnboardingContinuousProgress.copy(num, range);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStart", "getEnd"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Range {
        public static final int $stable = 0;
        private final int end;
        private final int start;

        public Range(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        public final int getStart() {
            return this.start;
        }

        public final int getEnd() {
            return this.end;
        }

        public final java.lang.String toString() {
            int i = this.start;
            int i2 = this.end;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Range(start=");
            sb.append(i);
            sb.append(", end=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.start) * 31) + java.lang.Integer.hashCode(this.end);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range range = (com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range) other;
            return this.start == range.start && this.end == range.end;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range copy(int start, int end) {
            return new com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range(start, end);
        }

        /* renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range copy$default(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range range, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = range.start;
            }
            if ((i3 & 2) != 0) {
                i2 = range.end;
            }
            return range.copy(i, i2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingSegmentedProgress;", "", "", "totalSegments", "currentSegment", "currentProgress", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range1;", "range", "<init>", "(IILjava/lang/Integer;Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range1;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range1;", "copy", "(IILjava/lang/Integer;Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range1;)Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$OnOnboardingSegmentedProgress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTotalSegments", "getCurrentSegment", "Ljava/lang/Integer;", "getCurrentProgress", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range1;", "getRange"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnOnboardingSegmentedProgress {
        public static final int $stable = 0;
        private final java.lang.Integer currentProgress;
        private final int currentSegment;
        private final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1 range;
        private final int totalSegments;

        public OnOnboardingSegmentedProgress(int i, int i2, java.lang.Integer num, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1 range1) {
            this.totalSegments = i;
            this.currentSegment = i2;
            this.currentProgress = num;
            this.range = range1;
        }

        public final int getTotalSegments() {
            return this.totalSegments;
        }

        public final int getCurrentSegment() {
            return this.currentSegment;
        }

        public final java.lang.Integer getCurrentProgress() {
            return this.currentProgress;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1 getRange() {
            return this.range;
        }

        public final java.lang.String toString() {
            int i = this.totalSegments;
            int i2 = this.currentSegment;
            java.lang.Integer num = this.currentProgress;
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1 range1 = this.range;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnOnboardingSegmentedProgress(totalSegments=");
            sb.append(i);
            sb.append(", currentSegment=");
            sb.append(i2);
            sb.append(", currentProgress=");
            sb.append(num);
            sb.append(", range=");
            sb.append(range1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.totalSegments);
            int hashCode2 = java.lang.Integer.hashCode(this.currentSegment);
            java.lang.Integer num = this.currentProgress;
            int hashCode3 = num == null ? 0 : num.hashCode();
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1 range1 = this.range;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (range1 != null ? range1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress onOnboardingSegmentedProgress = (com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress) other;
            return this.totalSegments == onOnboardingSegmentedProgress.totalSegments && this.currentSegment == onOnboardingSegmentedProgress.currentSegment && kotlin.jvm.internal.Intrinsics.areEqual(this.currentProgress, onOnboardingSegmentedProgress.currentProgress) && kotlin.jvm.internal.Intrinsics.areEqual(this.range, onOnboardingSegmentedProgress.range);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress copy(int totalSegments, int currentSegment, java.lang.Integer currentProgress, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1 range) {
            return new com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress(totalSegments, currentSegment, currentProgress, range);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1 getRange() {
            return this.range;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getCurrentProgress() {
            return this.currentProgress;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCurrentSegment() {
            return this.currentSegment;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotalSegments() {
            return this.totalSegments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress copy$default(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.OnOnboardingSegmentedProgress onOnboardingSegmentedProgress, int i, int i2, java.lang.Integer num, com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1 range1, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = onOnboardingSegmentedProgress.totalSegments;
            }
            if ((i3 & 2) != 0) {
                i2 = onOnboardingSegmentedProgress.currentSegment;
            }
            if ((i3 & 4) != 0) {
                num = onOnboardingSegmentedProgress.currentProgress;
            }
            if ((i3 & 8) != 0) {
                range1 = onOnboardingSegmentedProgress.range;
            }
            return onOnboardingSegmentedProgress.copy(i, i2, num, range1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range1;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Range1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStart", "getEnd"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Range1 {
        public static final int $stable = 0;
        private final int end;
        private final int start;

        public Range1(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        public final int getStart() {
            return this.start;
        }

        public final int getEnd() {
            return this.end;
        }

        public final java.lang.String toString() {
            int i = this.start;
            int i2 = this.end;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Range1(start=");
            sb.append(i);
            sb.append(", end=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.start) * 31) + java.lang.Integer.hashCode(this.end);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1 range1 = (com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1) other;
            return this.start == range1.start && this.end == range1.end;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1 copy(int start, int end) {
            return new com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1(start, end);
        }

        /* renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1 copy$default(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Range1 range1, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = range1.start;
            }
            if ((i3 & 2) != 0) {
                i2 = range1.end;
            }
            return range1.copy(i, i2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetOnboardingFlowSteps($input: OnboardingFlowStepsInput!) { onboardingFlowSteps(input: $input) { flowId pageId supportedTransitions { transition prefetchable } flowData { key value } progress { __typename ... on OnboardingContinuousProgress { currentProgress range { start end } } ... on OnboardingSegmentedProgress { totalSegments currentSegment currentProgress range { start end } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.OnboardingFlowStepsInput onboardingFlowStepsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetOnboardingFlowStepsQuery(input=");
        sb.append(onboardingFlowStepsInput);
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
        return (other instanceof com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery) other).input);
    }

    public final com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery copy(com.paypal.oslo.api.graphql.schema.type.OnboardingFlowStepsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OnboardingFlowStepsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery copy$default(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery getOnboardingFlowStepsQuery, com.paypal.oslo.api.graphql.schema.type.OnboardingFlowStepsInput onboardingFlowStepsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            onboardingFlowStepsInput = getOnboardingFlowStepsQuery.input;
        }
        return getOnboardingFlowStepsQuery.copy(onboardingFlowStepsInput);
    }
}
