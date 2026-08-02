package com.paypal.oslo.feature.packagetracking.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005!\"#$ B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "PackageEmailLinks", "Item", "Event"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetEmailLinkStatusQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Companion INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "1dfb0681ac6f2558520fdaf023f4053dec42ed64a5b2c578104d386a0f2d0d02";
    public static final java.lang.String OPERATION_NAME = "GetEmailLinkStatus";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.GetEmailLinkStatusQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.packagetracking.graphql.selections.GetEmailLinkStatusQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$PackageEmailLinks;", "packageEmailLinks", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$PackageEmailLinks;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$PackageEmailLinks;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$PackageEmailLinks;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$PackageEmailLinks;", "getPackageEmailLinks"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks packageEmailLinks;

        public Data(com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks packageEmailLinks) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageEmailLinks, "");
            this.packageEmailLinks = packageEmailLinks;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks getPackageEmailLinks() {
            return this.packageEmailLinks;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks packageEmailLinks = this.packageEmailLinks;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(packageEmailLinks=");
            sb.append(packageEmailLinks);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.packageEmailLinks.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.packageEmailLinks, ((com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Data) other).packageEmailLinks);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Data copy(com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks packageEmailLinks) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageEmailLinks, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Data(packageEmailLinks);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks getPackageEmailLinks() {
            return this.packageEmailLinks;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Data copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Data data, com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks packageEmailLinks, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                packageEmailLinks = data.packageEmailLinks;
            }
            return data.copy(packageEmailLinks);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$PackageEmailLinks;", "", "", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$PackageEmailLinks;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PackageEmailLinks {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item> items;

        public PackageEmailLinks(java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PackageEmailLinks(items=");
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
            return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks) other).items);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks copy(java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks(items);
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.PackageEmailLinks packageEmailLinks, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = packageEmailLinks.items;
            }
            return packageEmailLinks.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JN\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Item;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkStatus;", "status", "", "providerId", "", "isDataDeleted", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "provider", "", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Event;", "events", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkStatus;Ljava/lang/String;Ljava/lang/Boolean;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkStatus;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "component5", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkStatus;Ljava/lang/String;Ljava/lang/Boolean;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;Ljava/util/List;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Item;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkStatus;", "getStatus", "Ljava/lang/String;", "getProviderId", "Ljava/lang/Boolean;", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "getProvider", "Ljava/util/List;", "getEvents"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event> events;
        private final java.lang.Boolean isDataDeleted;
        private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider provider;
        private final java.lang.String providerId;
        private final com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus status;

        public Item(com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus packageEmailLinkStatus, java.lang.String str, java.lang.Boolean bool, com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider, java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageTrackingIdentityProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.status = packageEmailLinkStatus;
            this.providerId = str;
            this.isDataDeleted = bool;
            this.provider = packageTrackingIdentityProvider;
            this.events = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getProviderId() {
            return this.providerId;
        }

        public final java.lang.Boolean isDataDeleted() {
            return this.isDataDeleted;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider getProvider() {
            return this.provider;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event> getEvents() {
            return this.events;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus packageEmailLinkStatus = this.status;
            java.lang.String str = this.providerId;
            java.lang.Boolean bool = this.isDataDeleted;
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider = this.provider;
            java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event> list = this.events;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(status=");
            sb.append(packageEmailLinkStatus);
            sb.append(", providerId=");
            sb.append(str);
            sb.append(", isDataDeleted=");
            sb.append(bool);
            sb.append(", provider=");
            sb.append(packageTrackingIdentityProvider);
            sb.append(", events=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus packageEmailLinkStatus = this.status;
            int hashCode = packageEmailLinkStatus == null ? 0 : packageEmailLinkStatus.hashCode();
            java.lang.String str = this.providerId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Boolean bool = this.isDataDeleted;
            return (((((((hashCode * 31) + hashCode2) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.provider.hashCode()) * 31) + this.events.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item item = (com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item) other;
            return this.status == item.status && kotlin.jvm.internal.Intrinsics.areEqual(this.providerId, item.providerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.isDataDeleted, item.isDataDeleted) && this.provider == item.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.events, item.events);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item copy(com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus status, java.lang.String providerId, java.lang.Boolean isDataDeleted, com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider provider, java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event> events) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(events, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item(status, providerId, isDataDeleted, provider, events);
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event> component5() {
            return this.events;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider getProvider() {
            return this.provider;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getIsDataDeleted() {
            return this.isDataDeleted;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getProviderId() {
            return this.providerId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Item item, com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkStatus packageEmailLinkStatus, java.lang.String str, java.lang.Boolean bool, com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                packageEmailLinkStatus = item.status;
            }
            if ((i & 2) != 0) {
                str = item.providerId;
            }
            java.lang.String str2 = str;
            if ((i & 4) != 0) {
                bool = item.isDataDeleted;
            }
            java.lang.Boolean bool2 = bool;
            if ((i & 8) != 0) {
                packageTrackingIdentityProvider = item.provider;
            }
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider2 = packageTrackingIdentityProvider;
            if ((i & 16) != 0) {
                list = item.events;
            }
            return item.copy(packageEmailLinkStatus, str2, bool2, packageTrackingIdentityProvider2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Event;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkEventType;", "type", "", "hasActiveReminder", "", "reminderDateMessage", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkEventType;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkEventType;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkEventType;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Event;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PackageEmailLinkEventType;", "getType", "Ljava/lang/Boolean;", "getHasActiveReminder", "Ljava/lang/String;", "getReminderDateMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Event {
        public static final int $stable = 0;
        private final java.lang.Boolean hasActiveReminder;
        private final java.lang.String reminderDateMessage;
        private final com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkEventType type;

        public Event(com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkEventType packageEmailLinkEventType, java.lang.Boolean bool, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageEmailLinkEventType, "");
            this.type = packageEmailLinkEventType;
            this.hasActiveReminder = bool;
            this.reminderDateMessage = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkEventType getType() {
            return this.type;
        }

        public final java.lang.Boolean getHasActiveReminder() {
            return this.hasActiveReminder;
        }

        public final java.lang.String getReminderDateMessage() {
            return this.reminderDateMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkEventType packageEmailLinkEventType = this.type;
            java.lang.Boolean bool = this.hasActiveReminder;
            java.lang.String str = this.reminderDateMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Event(type=");
            sb.append(packageEmailLinkEventType);
            sb.append(", hasActiveReminder=");
            sb.append(bool);
            sb.append(", reminderDateMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode();
            java.lang.Boolean bool = this.hasActiveReminder;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            java.lang.String str = this.reminderDateMessage;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event event = (com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event) other;
            return this.type == event.type && kotlin.jvm.internal.Intrinsics.areEqual(this.hasActiveReminder, event.hasActiveReminder) && kotlin.jvm.internal.Intrinsics.areEqual(this.reminderDateMessage, event.reminderDateMessage);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event copy(com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkEventType type, java.lang.Boolean hasActiveReminder, java.lang.String reminderDateMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event(type, hasActiveReminder, reminderDateMessage);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getReminderDateMessage() {
            return this.reminderDateMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getHasActiveReminder() {
            return this.hasActiveReminder;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkEventType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetEmailLinkStatusQuery.Event event, com.paypal.oslo.api.graphql.schema.type.PackageEmailLinkEventType packageEmailLinkEventType, java.lang.Boolean bool, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                packageEmailLinkEventType = event.type;
            }
            if ((i & 2) != 0) {
                bool = event.hasActiveReminder;
            }
            if ((i & 4) != 0) {
                str = event.reminderDateMessage;
            }
            return event.copy(packageEmailLinkEventType, bool, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetEmailLinkStatusQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetEmailLinkStatus { packageEmailLinks { items { status providerId isDataDeleted provider events { type hasActiveReminder reminderDateMessage } } } }";
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
