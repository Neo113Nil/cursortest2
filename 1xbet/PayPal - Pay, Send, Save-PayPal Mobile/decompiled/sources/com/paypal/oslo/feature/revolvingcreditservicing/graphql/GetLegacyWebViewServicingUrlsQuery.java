package com.paypal.oslo.feature.revolvingcreditservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006*+,-.)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "creditProductIdentifier", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "getCreditProductIdentifier", "Companion", "Data", "RevolvingCreditServicingContent", "Payments", "Statements", "Notifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetLegacyWebViewServicingUrlsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "4558a9a3f1914b05dca72f9b62c91ef116a243ea4a6d57e8765faae4444d1601";
    public static final java.lang.String OPERATION_NAME = "GetLegacyWebViewServicingUrls";
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier;

    public GetLegacyWebViewServicingUrlsQuery(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditProductIdentifier, "");
        this.creditProductIdentifier = revolvingCreditProductIdentifier;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
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
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetLegacyWebViewServicingUrlsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetLegacyWebViewServicingUrlsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections.GetLegacyWebViewServicingUrlsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$RevolvingCreditServicingContent;", "revolvingCreditServicingContent", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$RevolvingCreditServicingContent;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$RevolvingCreditServicingContent;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$RevolvingCreditServicingContent;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$RevolvingCreditServicingContent;", "getRevolvingCreditServicingContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent revolvingCreditServicingContent;

        public Data(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent revolvingCreditServicingContent) {
            this.revolvingCreditServicingContent = revolvingCreditServicingContent;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent getRevolvingCreditServicingContent() {
            return this.revolvingCreditServicingContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = this.revolvingCreditServicingContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(revolvingCreditServicingContent=");
            sb.append(revolvingCreditServicingContent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = this.revolvingCreditServicingContent;
            if (revolvingCreditServicingContent == null) {
                return 0;
            }
            return revolvingCreditServicingContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditServicingContent, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Data) other).revolvingCreditServicingContent);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Data copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent revolvingCreditServicingContent) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Data(revolvingCreditServicingContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent getRevolvingCreditServicingContent() {
            return this.revolvingCreditServicingContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Data copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Data data, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent revolvingCreditServicingContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                revolvingCreditServicingContent = data.revolvingCreditServicingContent;
            }
            return data.copy(revolvingCreditServicingContent);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001f\u001a\u0004\b \u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$RevolvingCreditServicingContent;", "", "servicingHomeUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Payments;", "payments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Statements;", "statements", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Notifications;", "notifications", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Payments;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Statements;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Notifications;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Payments;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Statements;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Notifications;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Payments;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Statements;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Notifications;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$RevolvingCreditServicingContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getServicingHomeUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Payments;", "getPayments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Statements;", "getStatements", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Notifications;", "getNotifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditServicingContent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications notifications;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments payments;
        private final java.lang.Object servicingHomeUrl;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements statements;

        public RevolvingCreditServicingContent(java.lang.Object obj, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments payments, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements statements, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications notifications) {
            this.servicingHomeUrl = obj;
            this.payments = payments;
            this.statements = statements;
            this.notifications = notifications;
        }

        public final java.lang.Object getServicingHomeUrl() {
            return this.servicingHomeUrl;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments getPayments() {
            return this.payments;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements getStatements() {
            return this.statements;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications getNotifications() {
            return this.notifications;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.servicingHomeUrl;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments payments = this.payments;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements statements = this.statements;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications notifications = this.notifications;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditServicingContent(servicingHomeUrl=");
            sb.append(obj);
            sb.append(", payments=");
            sb.append(payments);
            sb.append(", statements=");
            sb.append(statements);
            sb.append(", notifications=");
            sb.append(notifications);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.servicingHomeUrl;
            int hashCode = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments payments = this.payments;
            int hashCode2 = payments == null ? 0 : payments.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements statements = this.statements;
            int hashCode3 = statements == null ? 0 : statements.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications notifications = this.notifications;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (notifications != null ? notifications.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.servicingHomeUrl, revolvingCreditServicingContent.servicingHomeUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.payments, revolvingCreditServicingContent.payments) && kotlin.jvm.internal.Intrinsics.areEqual(this.statements, revolvingCreditServicingContent.statements) && kotlin.jvm.internal.Intrinsics.areEqual(this.notifications, revolvingCreditServicingContent.notifications);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent copy(java.lang.Object servicingHomeUrl, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments payments, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements statements, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications notifications) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent(servicingHomeUrl, payments, statements, notifications);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications getNotifications() {
            return this.notifications;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements getStatements() {
            return this.statements;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments getPayments() {
            return this.payments;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getServicingHomeUrl() {
            return this.servicingHomeUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent revolvingCreditServicingContent, java.lang.Object obj, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments payments, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements statements, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications notifications, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = revolvingCreditServicingContent.servicingHomeUrl;
            }
            if ((i & 2) != 0) {
                payments = revolvingCreditServicingContent.payments;
            }
            if ((i & 4) != 0) {
                statements = revolvingCreditServicingContent.statements;
            }
            if ((i & 8) != 0) {
                notifications = revolvingCreditServicingContent.notifications;
            }
            return revolvingCreditServicingContent.copy(obj, payments, statements, notifications);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ4\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0019\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Payments;", "", "makePaymentUrl", "manageAutopayUrl", "managePaymentsUrl", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Payments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getMakePaymentUrl", "getManageAutopayUrl", "getManagePaymentsUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Payments {
        public static final int $stable = 8;
        private final java.lang.Object makePaymentUrl;
        private final java.lang.Object manageAutopayUrl;
        private final java.lang.Object managePaymentsUrl;

        public Payments(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            this.makePaymentUrl = obj;
            this.manageAutopayUrl = obj2;
            this.managePaymentsUrl = obj3;
        }

        public final java.lang.Object getMakePaymentUrl() {
            return this.makePaymentUrl;
        }

        public final java.lang.Object getManageAutopayUrl() {
            return this.manageAutopayUrl;
        }

        public final java.lang.Object getManagePaymentsUrl() {
            return this.managePaymentsUrl;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.makePaymentUrl;
            java.lang.Object obj2 = this.manageAutopayUrl;
            java.lang.Object obj3 = this.managePaymentsUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Payments(makePaymentUrl=");
            sb.append(obj);
            sb.append(", manageAutopayUrl=");
            sb.append(obj2);
            sb.append(", managePaymentsUrl=");
            sb.append(obj3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.makePaymentUrl;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.manageAutopayUrl;
            int hashCode2 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.Object obj3 = this.managePaymentsUrl;
            return (((hashCode * 31) + hashCode2) * 31) + (obj3 != null ? obj3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments payments = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.makePaymentUrl, payments.makePaymentUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.manageAutopayUrl, payments.manageAutopayUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.managePaymentsUrl, payments.managePaymentsUrl);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments copy(java.lang.Object makePaymentUrl, java.lang.Object manageAutopayUrl, java.lang.Object managePaymentsUrl) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments(makePaymentUrl, manageAutopayUrl, managePaymentsUrl);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getManagePaymentsUrl() {
            return this.managePaymentsUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getManageAutopayUrl() {
            return this.manageAutopayUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getMakePaymentUrl() {
            return this.makePaymentUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments payments, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, java.lang.Object obj4) {
            if ((i & 1) != 0) {
                obj = payments.makePaymentUrl;
            }
            if ((i & 2) != 0) {
                obj2 = payments.manageAutopayUrl;
            }
            if ((i & 4) != 0) {
                obj3 = payments.managePaymentsUrl;
            }
            return payments.copy(obj, obj2, obj3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Statements;", "", "viewStatementsUrl", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Statements;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getViewStatementsUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Statements {
        public static final int $stable = 8;
        private final java.lang.Object viewStatementsUrl;

        public Statements(java.lang.Object obj) {
            this.viewStatementsUrl = obj;
        }

        public final java.lang.Object getViewStatementsUrl() {
            return this.viewStatementsUrl;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.viewStatementsUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Statements(viewStatementsUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.viewStatementsUrl;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements) && kotlin.jvm.internal.Intrinsics.areEqual(this.viewStatementsUrl, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements) other).viewStatementsUrl);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements copy(java.lang.Object viewStatementsUrl) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements(viewStatementsUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getViewStatementsUrl() {
            return this.viewStatementsUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements statements, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = statements.viewStatementsUrl;
            }
            return statements.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Notifications;", "", "viewNotificationsUrl", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Notifications;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getViewNotificationsUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Notifications {
        public static final int $stable = 8;
        private final java.lang.Object viewNotificationsUrl;

        public Notifications(java.lang.Object obj) {
            this.viewNotificationsUrl = obj;
        }

        public final java.lang.Object getViewNotificationsUrl() {
            return this.viewNotificationsUrl;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.viewNotificationsUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Notifications(viewNotificationsUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.viewNotificationsUrl;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications) && kotlin.jvm.internal.Intrinsics.areEqual(this.viewNotificationsUrl, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications) other).viewNotificationsUrl);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications copy(java.lang.Object viewNotificationsUrl) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications(viewNotificationsUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getViewNotificationsUrl() {
            return this.viewNotificationsUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications notifications, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = notifications.viewNotificationsUrl;
            }
            return notifications.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetLegacyWebViewServicingUrlsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetLegacyWebViewServicingUrls($creditProductIdentifier: RevolvingCreditProductIdentifier!) { revolvingCreditServicingContent(input: { creditProductIdentifier: $creditProductIdentifier } ) { servicingHomeUrl payments { makePaymentUrl manageAutopayUrl managePaymentsUrl } statements { viewStatementsUrl } notifications { viewNotificationsUrl } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier = this.creditProductIdentifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetLegacyWebViewServicingUrlsQuery(creditProductIdentifier=");
        sb.append(revolvingCreditProductIdentifier);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.creditProductIdentifier.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery) && this.creditProductIdentifier == ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery) other).creditProductIdentifier;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery(creditProductIdentifier);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery getLegacyWebViewServicingUrlsQuery, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditProductIdentifier = getLegacyWebViewServicingUrlsQuery.creditProductIdentifier;
        }
        return getLegacyWebViewServicingUrlsQuery.copy(revolvingCreditProductIdentifier);
    }
}
