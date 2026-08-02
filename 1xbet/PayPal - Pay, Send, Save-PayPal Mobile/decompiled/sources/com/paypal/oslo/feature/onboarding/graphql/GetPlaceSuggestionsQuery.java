package com.paypal.oslo.feature.onboarding.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceSuggestionsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceSuggestionsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/PlaceSuggestionsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PlaceSuggestionsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PlaceSuggestionsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PlaceSuggestionsInput;)Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceSuggestionsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PlaceSuggestionsInput;", "getInput", "Companion", "Data", "PlaceSuggestion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetPlaceSuggestionsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "74a2136a369241d583383566153fc2f647a3e85647eb9127d177fecc7ee01f43";
    public static final java.lang.String OPERATION_NAME = "GetPlaceSuggestions";
    private final com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Companion(null);
    public static final int $stable = 8;

    public GetPlaceSuggestionsQuery(com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput placeSuggestionsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeSuggestionsInput, "");
        this.input = placeSuggestionsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput getInput() {
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
        com.paypal.oslo.feature.onboarding.graphql.adapter.GetPlaceSuggestionsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.onboarding.graphql.adapter.GetPlaceSuggestionsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.onboarding.graphql.selections.GetPlaceSuggestionsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceSuggestionsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceSuggestionsQuery$PlaceSuggestion;", "placeSuggestions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceSuggestionsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPlaceSuggestions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion> placeSuggestions;

        public Data(java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.placeSuggestions = list;
        }

        public final java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion> getPlaceSuggestions() {
            return this.placeSuggestions;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion> list = this.placeSuggestions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(placeSuggestions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.placeSuggestions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.placeSuggestions, ((com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Data) other).placeSuggestions);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Data copy(java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion> placeSuggestions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeSuggestions, "");
            return new com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Data(placeSuggestions);
        }

        public final java.util.List<com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion> component1() {
            return this.placeSuggestions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Data copy$default(com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.placeSuggestions;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceSuggestionsQuery$PlaceSuggestion;", "", "", "placeId", "mainText", "secondaryText", "completeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceSuggestionsQuery$PlaceSuggestion;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPlaceId", "getMainText", "getSecondaryText", "getCompleteText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PlaceSuggestion {
        public static final int $stable = 0;
        private final java.lang.String completeText;
        private final java.lang.String mainText;
        private final java.lang.String placeId;
        private final java.lang.String secondaryText;

        public PlaceSuggestion(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.placeId = str;
            this.mainText = str2;
            this.secondaryText = str3;
            this.completeText = str4;
        }

        public final java.lang.String getPlaceId() {
            return this.placeId;
        }

        public final java.lang.String getMainText() {
            return this.mainText;
        }

        public final java.lang.String getSecondaryText() {
            return this.secondaryText;
        }

        public final java.lang.String getCompleteText() {
            return this.completeText;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.placeId;
            java.lang.String str2 = this.mainText;
            java.lang.String str3 = this.secondaryText;
            java.lang.String str4 = this.completeText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaceSuggestion(placeId=");
            sb.append(str);
            sb.append(", mainText=");
            sb.append(str2);
            sb.append(", secondaryText=");
            sb.append(str3);
            sb.append(", completeText=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.placeId.hashCode() * 31) + this.mainText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + this.completeText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion placeSuggestion = (com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.placeId, placeSuggestion.placeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.mainText, placeSuggestion.mainText) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryText, placeSuggestion.secondaryText) && kotlin.jvm.internal.Intrinsics.areEqual(this.completeText, placeSuggestion.completeText);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion copy(java.lang.String placeId, java.lang.String mainText, java.lang.String secondaryText, java.lang.String completeText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completeText, "");
            return new com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion(placeId, mainText, secondaryText, completeText);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCompleteText() {
            return this.completeText;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMainText() {
            return this.mainText;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPlaceId() {
            return this.placeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion copy$default(com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery.PlaceSuggestion placeSuggestion, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = placeSuggestion.placeId;
            }
            if ((i & 2) != 0) {
                str2 = placeSuggestion.mainText;
            }
            if ((i & 4) != 0) {
                str3 = placeSuggestion.secondaryText;
            }
            if ((i & 8) != 0) {
                str4 = placeSuggestion.completeText;
            }
            return placeSuggestion.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/GetPlaceSuggestionsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetPlaceSuggestions($input: PlaceSuggestionsInput!) { placeSuggestions(input: $input) { placeId mainText secondaryText completeText } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput placeSuggestionsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPlaceSuggestionsQuery(input=");
        sb.append(placeSuggestionsInput);
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
        return (other instanceof com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery) other).input);
    }

    public final com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery copy(com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery copy$default(com.paypal.oslo.feature.onboarding.graphql.GetPlaceSuggestionsQuery getPlaceSuggestionsQuery, com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput placeSuggestionsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            placeSuggestionsInput = getPlaceSuggestionsQuery.input;
        }
        return getPlaceSuggestionsQuery.copy(placeSuggestionsInput);
    }
}
