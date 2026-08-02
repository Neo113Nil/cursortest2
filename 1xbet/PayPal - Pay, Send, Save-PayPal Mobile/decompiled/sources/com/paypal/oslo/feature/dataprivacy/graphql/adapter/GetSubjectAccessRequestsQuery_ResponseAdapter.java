package com.paypal.oslo.feature.dataprivacy.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/graphql/adapter/GetSubjectAccessRequestsQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "SubjectAccessRequest", "File"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetSubjectAccessRequestsQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/graphql/adapter/GetSubjectAccessRequestsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data> {
        public static final com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("subjectAccessRequests");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_ResponseAdapter.SubjectAccessRequest.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data(list);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("subjectAccessRequests");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_ResponseAdapter.SubjectAccessRequest.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getSubjectAccessRequests());
        }
    }

    private GetSubjectAccessRequestsQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/graphql/adapter/GetSubjectAccessRequestsQuery_ResponseAdapter$SubjectAccessRequest;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$SubjectAccessRequest;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$SubjectAccessRequest;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$SubjectAccessRequest;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SubjectAccessRequest implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> {
        public static final com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_ResponseAdapter.SubjectAccessRequest INSTANCE = new com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_ResponseAdapter.SubjectAccessRequest();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "partyId", "domain", "requestType", "status", "source", "createTime", "updateTime", "alias", "file"});
        public static final int $stable = 8;

        private SubjectAccessRequest() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x00b6, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if (r2 == null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
        
            return new com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x00ac, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "id");
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain = null;
            com.paypal.oslo.api.graphql.schema.type.DSRRequestType dSRRequestType = null;
            com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus dSRCaseStatus = null;
            com.paypal.oslo.api.graphql.schema.type.DSRSource dSRSource = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            java.lang.String str3 = null;
            com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File file = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        dSRDomain = (com.paypal.oslo.api.graphql.schema.type.DSRDomain) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DSRDomain_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        dSRRequestType = (com.paypal.oslo.api.graphql.schema.type.DSRRequestType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DSRRequestType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        dSRCaseStatus = (com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DSRCaseStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        dSRSource = (com.paypal.oslo.api.graphql.schema.type.DSRSource) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DSRSource_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        file = (com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_ResponseAdapter.File.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("partyId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPartyId());
            writer.name("domain");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DSRDomain_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getDomain());
            writer.name("requestType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DSRRequestType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getRequestType());
            writer.name("status");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DSRCaseStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("source");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DSRSource_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getSource());
            writer.name("createTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getCreateTime());
            writer.name("updateTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getUpdateTime());
            writer.name("alias");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAlias());
            writer.name("file");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_ResponseAdapter.File.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getFile());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/graphql/adapter/GetSubjectAccessRequestsQuery_ResponseAdapter$File;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$File;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$File;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$File;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class File implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File> {
        public static final com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_ResponseAdapter.File INSTANCE = new com.paypal.oslo.feature.dataprivacy.graphql.adapter.GetSubjectAccessRequestsQuery_ResponseAdapter.File();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"documentId", "name"});
        public static final int $stable = 8;

        private File() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File(str, str2);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.File value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("documentId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getDocumentId());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getName());
        }
    }
}
