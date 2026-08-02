package com.paypal.oslo.feature.helpcenter.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\f!\"#$%&'()*+ B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "HelpContactTopics", "Item", "Topics", "Item1", "Topics1", "Item2", "Resources", "Article", "Resources1", "Article1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetContactUsTopicsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Companion INSTANCE = new com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "4d321a6cbe3fe67e95a6a35bc600dd8d0ede6c346df4a35cc8f2a1d380da1b74";
    public static final java.lang.String OPERATION_NAME = "GetContactUsTopics";

    public final boolean equals(java.lang.Object other) {
        return other != null && other.getClass() == getClass();
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.helpcenter.graphql.adapter.GetContactUsTopicsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.helpcenter.graphql.selections.GetContactUsTopicsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$HelpContactTopics;", "helpContactTopics", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$HelpContactTopics;)V", "component1", "()Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$HelpContactTopics;", "copy", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$HelpContactTopics;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$HelpContactTopics;", "getHelpContactTopics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics helpContactTopics;

        public Data(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics helpContactTopics) {
            this.helpContactTopics = helpContactTopics;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics getHelpContactTopics() {
            return this.helpContactTopics;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics helpContactTopics = this.helpContactTopics;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(helpContactTopics=");
            sb.append(helpContactTopics);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics helpContactTopics = this.helpContactTopics;
            if (helpContactTopics == null) {
                return 0;
            }
            return helpContactTopics.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.helpContactTopics, ((com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Data) other).helpContactTopics);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Data copy(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics helpContactTopics) {
            return new com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Data(helpContactTopics);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics getHelpContactTopics() {
            return this.helpContactTopics;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Data copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Data data, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics helpContactTopics, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                helpContactTopics = data.helpContactTopics;
            }
            return data.copy(helpContactTopics);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$HelpContactTopics;", "", "", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$HelpContactTopics;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HelpContactTopics {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item> items;

        public HelpContactTopics(java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HelpContactTopics(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics) other).items);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics copy(java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics(items);
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.HelpContactTopics helpContactTopics, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = helpContactTopics.items;
            }
            return helpContactTopics.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item;", "", "", "id", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics;", "topics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "getDescription", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics;", "getTopics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String description;
        private final java.lang.String id;
        private final java.lang.String title;
        private final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics topics;

        public Item(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics topics) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.title = str2;
            this.description = str3;
            this.topics = topics;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics getTopics() {
            return this.topics;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.title;
            java.lang.String str3 = this.description;
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics topics = this.topics;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", description=");
            sb.append(str3);
            sb.append(", topics=");
            sb.append(topics);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.title.hashCode();
            java.lang.String str = this.description;
            int hashCode3 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics topics = this.topics;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (topics != null ? topics.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item item = (com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, item.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, item.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.topics, item.topics);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item copy(java.lang.String id, java.lang.String title, java.lang.String description, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics topics) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item(id, title, description, topics);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics getTopics() {
            return this.topics;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item item, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics topics, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.id;
            }
            if ((i & 2) != 0) {
                str2 = item.title;
            }
            if ((i & 4) != 0) {
                str3 = item.description;
            }
            if ((i & 8) != 0) {
                topics = item.topics;
            }
            return item.copy(str, str2, str3, topics);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics;", "", "", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item1;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Topics {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1> items;

        public Topics(java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Topics(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics) other).items);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics copy(java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics(items);
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics topics, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = topics.items;
            }
            return topics.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item1;", "", "", "id", "title", "referenceId", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics1;", "topics", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources1;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics1;Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics1;", "component5", "()Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources1;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics1;Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources1;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "getReferenceId", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics1;", "getTopics", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources1;", "getResources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item1 {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.String referenceId;
        private final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1 resources;
        private final java.lang.String title;
        private final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1 topics;

        public Item1(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1 topics1, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1 resources1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.title = str2;
            this.referenceId = str3;
            this.topics = topics1;
            this.resources = resources1;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1 getTopics() {
            return this.topics;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1 getResources() {
            return this.resources;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.title;
            java.lang.String str3 = this.referenceId;
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1 topics1 = this.topics;
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1 resources1 = this.resources;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item1(id=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", referenceId=");
            sb.append(str3);
            sb.append(", topics=");
            sb.append(topics1);
            sb.append(", resources=");
            sb.append(resources1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.title.hashCode();
            java.lang.String str = this.referenceId;
            int hashCode3 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1 topics1 = this.topics;
            int hashCode4 = topics1 == null ? 0 : topics1.hashCode();
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1 resources1 = this.resources;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (resources1 != null ? resources1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1 item1 = (com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item1.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, item1.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, item1.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.topics, item1.topics) && kotlin.jvm.internal.Intrinsics.areEqual(this.resources, item1.resources);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1 copy(java.lang.String id, java.lang.String title, java.lang.String referenceId, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1 topics, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1 resources) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1(id, title, referenceId, topics, resources);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1 getResources() {
            return this.resources;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1 getTopics() {
            return this.topics;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1 copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1 item1, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1 topics1, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1 resources1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item1.id;
            }
            if ((i & 2) != 0) {
                str2 = item1.title;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = item1.referenceId;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                topics1 = item1.topics;
            }
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1 topics12 = topics1;
            if ((i & 16) != 0) {
                resources1 = item1.resources;
            }
            return item1.copy(str, str4, str5, topics12, resources1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics1;", "", "", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item2;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Topics1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Topics1 {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2> items;

        public Topics1(java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Topics1(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1) other).items);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1 copy(java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1(items);
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1 copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1 topics1, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = topics1.items;
            }
            return topics1.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item2;", "", "", "id", "title", "referenceId", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "getReferenceId", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources;", "getResources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item2 {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String referenceId;
        private final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources resources;
        private final java.lang.String title;

        public Item2(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources resources) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.title = str2;
            this.referenceId = str3;
            this.resources = resources;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources getResources() {
            return this.resources;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.title;
            java.lang.String str3 = this.referenceId;
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources resources = this.resources;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item2(id=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", referenceId=");
            sb.append(str3);
            sb.append(", resources=");
            sb.append(resources);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.title.hashCode();
            java.lang.String str = this.referenceId;
            int hashCode3 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources resources = this.resources;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (resources != null ? resources.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2 item2 = (com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item2.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, item2.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, item2.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resources, item2.resources);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2 copy(java.lang.String id, java.lang.String title, java.lang.String referenceId, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources resources) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2(id, title, referenceId, resources);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources getResources() {
            return this.resources;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2 copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2 item2, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources resources, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item2.id;
            }
            if ((i & 2) != 0) {
                str2 = item2.title;
            }
            if ((i & 4) != 0) {
                str3 = item2.referenceId;
            }
            if ((i & 8) != 0) {
                resources = item2.resources;
            }
            return item2.copy(str, str2, str3, resources);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources;", "", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article;", "article", "", "intentName", "intentCode", "intentVariant", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article;", "getArticle", "Ljava/lang/String;", "getIntentName", "getIntentCode", "getIntentVariant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Resources {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article article;
        private final java.lang.String intentCode;
        private final java.lang.String intentName;
        private final java.lang.String intentVariant;

        public Resources(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article article, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.article = article;
            this.intentName = str;
            this.intentCode = str2;
            this.intentVariant = str3;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article getArticle() {
            return this.article;
        }

        public final java.lang.String getIntentName() {
            return this.intentName;
        }

        public final java.lang.String getIntentCode() {
            return this.intentCode;
        }

        public final java.lang.String getIntentVariant() {
            return this.intentVariant;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article article = this.article;
            java.lang.String str = this.intentName;
            java.lang.String str2 = this.intentCode;
            java.lang.String str3 = this.intentVariant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Resources(article=");
            sb.append(article);
            sb.append(", intentName=");
            sb.append(str);
            sb.append(", intentCode=");
            sb.append(str2);
            sb.append(", intentVariant=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article article = this.article;
            int hashCode = article == null ? 0 : article.hashCode();
            java.lang.String str = this.intentName;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.intentCode;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.intentVariant;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources resources = (com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.article, resources.article) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentName, resources.intentName) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentCode, resources.intentCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentVariant, resources.intentVariant);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources copy(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article article, java.lang.String intentName, java.lang.String intentCode, java.lang.String intentVariant) {
            return new com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources(article, intentName, intentCode, intentVariant);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getIntentVariant() {
            return this.intentVariant;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getIntentCode() {
            return this.intentCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getIntentName() {
            return this.intentName;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article getArticle() {
            return this.article;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources resources, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article article, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                article = resources.article;
            }
            if ((i & 2) != 0) {
                str = resources.intentName;
            }
            if ((i & 4) != 0) {
                str2 = resources.intentCode;
            }
            if ((i & 8) != 0) {
                str3 = resources.intentVariant;
            }
            return resources.copy(article, str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Article {
        public static final int $stable = 0;
        private final java.lang.String id;

        public Article(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Article(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article) other).id);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article article, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = article.id;
            }
            return article.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources1;", "", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article1;", "article", "", "intentName", "intentCode", "intentVariant", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article1;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Resources1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article1;", "getArticle", "Ljava/lang/String;", "getIntentName", "getIntentCode", "getIntentVariant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Resources1 {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1 article;
        private final java.lang.String intentCode;
        private final java.lang.String intentName;
        private final java.lang.String intentVariant;

        public Resources1(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1 article1, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.article = article1;
            this.intentName = str;
            this.intentCode = str2;
            this.intentVariant = str3;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1 getArticle() {
            return this.article;
        }

        public final java.lang.String getIntentName() {
            return this.intentName;
        }

        public final java.lang.String getIntentCode() {
            return this.intentCode;
        }

        public final java.lang.String getIntentVariant() {
            return this.intentVariant;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1 article1 = this.article;
            java.lang.String str = this.intentName;
            java.lang.String str2 = this.intentCode;
            java.lang.String str3 = this.intentVariant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Resources1(article=");
            sb.append(article1);
            sb.append(", intentName=");
            sb.append(str);
            sb.append(", intentCode=");
            sb.append(str2);
            sb.append(", intentVariant=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1 article1 = this.article;
            int hashCode = article1 == null ? 0 : article1.hashCode();
            java.lang.String str = this.intentName;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.intentCode;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.intentVariant;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1 resources1 = (com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.article, resources1.article) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentName, resources1.intentName) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentCode, resources1.intentCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentVariant, resources1.intentVariant);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1 copy(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1 article, java.lang.String intentName, java.lang.String intentCode, java.lang.String intentVariant) {
            return new com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1(article, intentName, intentCode, intentVariant);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getIntentVariant() {
            return this.intentVariant;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getIntentCode() {
            return this.intentCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getIntentName() {
            return this.intentName;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1 getArticle() {
            return this.article;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1 copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1 resources1, com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1 article1, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                article1 = resources1.article;
            }
            if ((i & 2) != 0) {
                str = resources1.intentName;
            }
            if ((i & 4) != 0) {
                str2 = resources1.intentCode;
            }
            if ((i & 8) != 0) {
                str3 = resources1.intentVariant;
            }
            return resources1.copy(article1, str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article1;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Article1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Article1 {
        public static final int $stable = 0;
        private final java.lang.String id;

        public Article1(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Article1(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1) other).id);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1 copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1 copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1 article1, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = article1.id;
            }
            return article1.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetContactUsTopics { helpContactTopics { items { id title description topics { items { id title referenceId topics { items { id title referenceId resources { article { id } intentName intentCode intentVariant } } } resources { article { id } intentName intentCode intentVariant } } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
    }
}
