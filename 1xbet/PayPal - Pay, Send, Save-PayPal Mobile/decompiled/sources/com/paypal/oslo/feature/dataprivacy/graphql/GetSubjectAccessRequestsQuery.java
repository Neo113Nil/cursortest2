package com.paypal.oslo.feature.dataprivacy.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/SubjectAccessRequestsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SubjectAccessRequestsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SubjectAccessRequestsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SubjectAccessRequestsInput;)Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SubjectAccessRequestsInput;", "getInput", "Companion", "Data", "SubjectAccessRequest", "File"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetSubjectAccessRequestsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "8569c914f34b2628db6b5cb3fe047c9ae34f63a41518541e883b323b511ee6ce";
    public static final java.lang.String OPERATION_NAME = "GetSubjectAccessRequests";
    private final com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequestsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Companion INSTANCE = new com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Companion(null);
    public static final int $stable = 8;

    public GetSubjectAccessRequestsQuery(com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequestsInput subjectAccessRequestsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subjectAccessRequestsInput, "");
        this.input = subjectAccessRequestsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequestsInput getInput() {
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
        com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.dataprivacy.graphql.selections.GetSubjectAccessRequestsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$SubjectAccessRequest;", "subjectAccessRequests", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSubjectAccessRequests"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> subjectAccessRequests;

        public Data(java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> list) {
            this.subjectAccessRequests = list;
        }

        public final java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> getSubjectAccessRequests() {
            return this.subjectAccessRequests;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> list = this.subjectAccessRequests;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(subjectAccessRequests=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> list = this.subjectAccessRequests;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.subjectAccessRequests, ((com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data) other).subjectAccessRequests);
        }

        public final com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data copy(java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> subjectAccessRequests) {
            return new com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data(subjectAccessRequests);
        }

        public final java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> component1() {
            return this.subjectAccessRequests;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data copy$default(com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.subjectAccessRequests;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0012\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0086\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b<\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b=\u0010\u0015R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$SubjectAccessRequest;", "", "", "id", "partyId", "Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;", "domain", "Lcom/paypal/oslo/api/graphql/schema/type/DSRRequestType;", "requestType", "Lcom/paypal/oslo/api/graphql/schema/type/DSRCaseStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/DSRSource;", "source", "createTime", "updateTime", "alias", "Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$File;", "file", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;Lcom/paypal/oslo/api/graphql/schema/type/DSRRequestType;Lcom/paypal/oslo/api/graphql/schema/type/DSRCaseStatus;Lcom/paypal/oslo/api/graphql/schema/type/DSRSource;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$File;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/DSRRequestType;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/DSRCaseStatus;", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/DSRSource;", "component7", "()Ljava/lang/Object;", "component8", "component9", "component10", "()Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$File;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;Lcom/paypal/oslo/api/graphql/schema/type/DSRRequestType;Lcom/paypal/oslo/api/graphql/schema/type/DSRCaseStatus;Lcom/paypal/oslo/api/graphql/schema/type/DSRSource;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$File;)Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$SubjectAccessRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getPartyId", "Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;", "getDomain", "Lcom/paypal/oslo/api/graphql/schema/type/DSRRequestType;", "getRequestType", "Lcom/paypal/oslo/api/graphql/schema/type/DSRCaseStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/DSRSource;", "getSource", "Ljava/lang/Object;", "getCreateTime", "getUpdateTime", "getAlias", "Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$File;", "getFile"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubjectAccessRequest {
        public static final int $stable = 8;
        private final java.lang.String alias;
        private final java.lang.Object createTime;
        private final com.paypal.oslo.api.graphql.schema.type.DSRDomain domain;
        private final com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File file;
        private final java.lang.String id;
        private final java.lang.String partyId;
        private final com.paypal.oslo.api.graphql.schema.type.DSRRequestType requestType;
        private final com.paypal.oslo.api.graphql.schema.type.DSRSource source;
        private final com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus status;
        private final java.lang.Object updateTime;

        public SubjectAccessRequest(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain, com.paypal.oslo.api.graphql.schema.type.DSRRequestType dSRRequestType, com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus dSRCaseStatus, com.paypal.oslo.api.graphql.schema.type.DSRSource dSRSource, java.lang.Object obj, java.lang.Object obj2, java.lang.String str3, com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.partyId = str2;
            this.domain = dSRDomain;
            this.requestType = dSRRequestType;
            this.status = dSRCaseStatus;
            this.source = dSRSource;
            this.createTime = obj;
            this.updateTime = obj2;
            this.alias = str3;
            this.file = file;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getPartyId() {
            return this.partyId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DSRDomain getDomain() {
            return this.domain;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DSRRequestType getRequestType() {
            return this.requestType;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DSRSource getSource() {
            return this.source;
        }

        public final java.lang.Object getCreateTime() {
            return this.createTime;
        }

        public final java.lang.Object getUpdateTime() {
            return this.updateTime;
        }

        public final java.lang.String getAlias() {
            return this.alias;
        }

        public final com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File getFile() {
            return this.file;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.partyId;
            com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain = this.domain;
            com.paypal.oslo.api.graphql.schema.type.DSRRequestType dSRRequestType = this.requestType;
            com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus dSRCaseStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.DSRSource dSRSource = this.source;
            java.lang.Object obj = this.createTime;
            java.lang.Object obj2 = this.updateTime;
            java.lang.String str3 = this.alias;
            com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File file = this.file;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubjectAccessRequest(id=");
            sb.append(str);
            sb.append(", partyId=");
            sb.append(str2);
            sb.append(", domain=");
            sb.append(dSRDomain);
            sb.append(", requestType=");
            sb.append(dSRRequestType);
            sb.append(", status=");
            sb.append(dSRCaseStatus);
            sb.append(", source=");
            sb.append(dSRSource);
            sb.append(", createTime=");
            sb.append(obj);
            sb.append(", updateTime=");
            sb.append(obj2);
            sb.append(", alias=");
            sb.append(str3);
            sb.append(", file=");
            sb.append(file);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.partyId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain = this.domain;
            int hashCode3 = dSRDomain == null ? 0 : dSRDomain.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DSRRequestType dSRRequestType = this.requestType;
            int hashCode4 = dSRRequestType == null ? 0 : dSRRequestType.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus dSRCaseStatus = this.status;
            int hashCode5 = dSRCaseStatus == null ? 0 : dSRCaseStatus.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DSRSource dSRSource = this.source;
            int hashCode6 = dSRSource == null ? 0 : dSRSource.hashCode();
            java.lang.Object obj = this.createTime;
            int hashCode7 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.updateTime;
            int hashCode8 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.String str2 = this.alias;
            int hashCode9 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File file = this.file;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (file != null ? file.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest)) {
                return false;
            }
            com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest subjectAccessRequest = (com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, subjectAccessRequest.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.partyId, subjectAccessRequest.partyId) && this.domain == subjectAccessRequest.domain && this.requestType == subjectAccessRequest.requestType && this.status == subjectAccessRequest.status && this.source == subjectAccessRequest.source && kotlin.jvm.internal.Intrinsics.areEqual(this.createTime, subjectAccessRequest.createTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateTime, subjectAccessRequest.updateTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.alias, subjectAccessRequest.alias) && kotlin.jvm.internal.Intrinsics.areEqual(this.file, subjectAccessRequest.file);
        }

        public final com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest copy(java.lang.String id, java.lang.String partyId, com.paypal.oslo.api.graphql.schema.type.DSRDomain domain, com.paypal.oslo.api.graphql.schema.type.DSRRequestType requestType, com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus status, com.paypal.oslo.api.graphql.schema.type.DSRSource source, java.lang.Object createTime, java.lang.Object updateTime, java.lang.String alias, com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest(id, partyId, domain, requestType, status, source, createTime, updateTime, alias, file);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getAlias() {
            return this.alias;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Object getUpdateTime() {
            return this.updateTime;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getCreateTime() {
            return this.createTime;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DSRSource getSource() {
            return this.source;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus getStatus() {
            return this.status;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DSRRequestType getRequestType() {
            return this.requestType;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DSRDomain getDomain() {
            return this.domain;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPartyId() {
            return this.partyId;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File getFile() {
            return this.file;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$File;", "", "", "documentId", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$File;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDocumentId", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class File {
        public static final int $stable = 0;
        private final java.lang.String documentId;
        private final java.lang.String name;

        public File(java.lang.String str, java.lang.String str2) {
            this.documentId = str;
            this.name = str2;
        }

        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.documentId;
            java.lang.String str2 = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("File(documentId=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.documentId;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.name;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File)) {
                return false;
            }
            com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File file = (com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, file.documentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, file.name);
        }

        public final com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File copy(java.lang.String documentId, java.lang.String name2) {
            return new com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File(documentId, name2);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File copy$default(com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File file, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = file.documentId;
            }
            if ((i & 2) != 0) {
                str2 = file.name;
            }
            return file.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetSubjectAccessRequests($input: SubjectAccessRequestsInput!) { subjectAccessRequests(input: $input) { id partyId domain requestType status source createTime updateTime alias file { documentId name } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequestsInput subjectAccessRequestsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetSubjectAccessRequestsQuery(input=");
        sb.append(subjectAccessRequestsInput);
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
        return (other instanceof com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery) other).input);
    }

    public final com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery copy(com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequestsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequestsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery copy$default(com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery getSubjectAccessRequestsQuery, com.paypal.oslo.api.graphql.schema.type.SubjectAccessRequestsInput subjectAccessRequestsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            subjectAccessRequestsInput = getSubjectAccessRequestsQuery.input;
        }
        return getSubjectAccessRequestsQuery.copy(subjectAccessRequestsInput);
    }
}
