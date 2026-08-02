package com.paypal.oslo.feature.packagetracking.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/MarkPackageAsDeliveredMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OPERATION_NAME, "Package", "Carrier", "Item", "DestinationAddress", "ShipmentUpdate", "Location", com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT, "OnMerchant", "OnShipmentPackageExternalMerchant"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarkPackageAsDeliveredMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/MarkPackageAsDeliveredMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("markPackageAsDelivered");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered markPackageAsDelivered = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                markPackageAsDelivered = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.MarkPackageAsDelivered.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data(markPackageAsDelivered);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("markPackageAsDelivered");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.MarkPackageAsDelivered.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getMarkPackageAsDelivered());
        }
    }

    private MarkPackageAsDeliveredMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/MarkPackageAsDeliveredMutation_ResponseAdapter$MarkPackageAsDelivered;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$MarkPackageAsDelivered;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$MarkPackageAsDelivered;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$MarkPackageAsDelivered;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MarkPackageAsDelivered implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.MarkPackageAsDelivered INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.MarkPackageAsDelivered();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("package");
        public static final int $stable = 8;

        private MarkPackageAsDelivered() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package r1 = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                r1 = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Package.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered(r1);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("package");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Package.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getPackage());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/MarkPackageAsDeliveredMutation_ResponseAdapter$Package;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Package;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Package;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Package;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Package implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Package INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Package();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "logoImageUrl", "trackingNumber", "status", "statusMessage", "deliveryTime", "carrier", "items", "transactionNumber", "exceptionSummary", "exceptionDetails", "trackingLink", "destinationAddress", "shipmentUpdates", "merchant", "packageNickname", "markedAsDelivered", "orderNumber", "tags", "packageSource", "orderManagementUrl", "archived"});
        public static final int $stable = 8;

        private Package() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0034. Please report as an issue. */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            java.lang.String str;
            java.lang.String str2;
            java.lang.String str3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.String str4 = null;
            java.lang.Object obj = null;
            java.lang.String str5 = null;
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus = null;
            java.lang.String str6 = null;
            java.lang.Object obj2 = null;
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier carrier = null;
            java.util.List list = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.Object obj3 = null;
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress destinationAddress = null;
            java.util.List list2 = null;
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant merchant = null;
            java.lang.String str10 = null;
            java.lang.Boolean bool2 = null;
            java.lang.String str11 = null;
            java.util.List list3 = null;
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource packageTrackingSource = null;
            java.lang.Object obj4 = null;
            while (true) {
                java.lang.Object obj5 = obj3;
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = str9;
                        str4 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                        str9 = str;
                    case 1:
                        str = str9;
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                        str9 = str;
                    case 2:
                        str = str9;
                        str5 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                        str9 = str;
                    case 3:
                        str = str9;
                        packageTrackingStatus = com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                        str9 = str;
                    case 4:
                        str = str9;
                        str6 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                        str9 = str;
                    case 5:
                        str = str9;
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                        str9 = str;
                    case 6:
                        str2 = str8;
                        str3 = str9;
                        carrier = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Carrier.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                        str9 = str3;
                        str8 = str2;
                    case 7:
                        str2 = str8;
                        str3 = str9;
                        list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Item.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                        str9 = str3;
                        str8 = str2;
                    case 8:
                        str7 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                    case 9:
                        str8 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                    case 10:
                        str9 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                    case 11:
                        obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                    case 12:
                        str2 = str8;
                        str3 = str9;
                        destinationAddress = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.DestinationAddress.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                        str9 = str3;
                        str8 = str2;
                    case 13:
                        str2 = str8;
                        str3 = str9;
                        list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.ShipmentUpdate.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                        str9 = str3;
                        str8 = str2;
                    case 14:
                        merchant = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Merchant.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                    case 15:
                        str10 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                    case 16:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                    case 17:
                        str11 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                    case 18:
                        list3 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingShipmentTag_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                    case 19:
                        packageTrackingSource = (com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingSource_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                    case 20:
                        obj4 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                    case 21:
                        bool2 = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        obj3 = obj5;
                }
                java.lang.String str12 = str8;
                java.lang.String str13 = str9;
                if (str4 == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (str5 == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "trackingNumber");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (packageTrackingStatus == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "status");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (bool2 != null) {
                        return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package(str4, obj, str5, packageTrackingStatus, str6, obj2, carrier, list, str7, str12, str13, obj5, destinationAddress, list2, merchant, str10, booleanValue, str11, list3, packageTrackingSource, obj4, bool2.booleanValue());
                    }
                    com.apollographql.apollo.api.Assertions.missingField(reader, "archived");
                    throw new kotlin.KotlinNothingValueException();
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "markedAsDelivered");
                throw new kotlin.KotlinNothingValueException();
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("logoImageUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getLogoImageUrl());
            writer.name("trackingNumber");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTrackingNumber());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("statusMessage");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getStatusMessage());
            writer.name("deliveryTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getDeliveryTime());
            writer.name("carrier");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Carrier.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getCarrier());
            writer.name("items");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Item.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getItems());
            writer.name("transactionNumber");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getTransactionNumber());
            writer.name("exceptionSummary");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getExceptionSummary());
            writer.name("exceptionDetails");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getExceptionDetails());
            writer.name("trackingLink");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getTrackingLink());
            writer.name("destinationAddress");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.DestinationAddress.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getDestinationAddress());
            writer.name("shipmentUpdates");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.ShipmentUpdate.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getShipmentUpdates());
            writer.name("merchant");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Merchant.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getMerchant());
            writer.name("packageNickname");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPackageNickname());
            writer.name("markedAsDelivered");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getMarkedAsDelivered()));
            writer.name("orderNumber");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getOrderNumber());
            writer.name("tags");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingShipmentTag_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getTags());
            writer.name("packageSource");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingSource_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getPackageSource());
            writer.name("orderManagementUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getOrderManagementUrl());
            writer.name("archived");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getArchived()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/MarkPackageAsDeliveredMutation_ResponseAdapter$Carrier;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Carrier;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Carrier;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Carrier;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Carrier implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Carrier INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Carrier();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "name", "logoImageUrl"});
        public static final int $stable = 8;

        private Carrier() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier(str, str2, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("logoImageUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getLogoImageUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/MarkPackageAsDeliveredMutation_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Item;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Item;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Item;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Item INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Item();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "quantity", "imageUrl", "tags"});
        public static final int $stable = 8;

        private Item() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Integer num = null;
            java.lang.Object obj = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    num = com.apollographql.apollo.api.Adapters.NullableIntAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.ShipmentPackageItemTag_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item(str, num, obj, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("quantity");
            com.apollographql.apollo.api.Adapters.NullableIntAdapter.toJson(writer, customScalarAdapters, value.getQuantity());
            writer.name("imageUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getImageUrl());
            writer.name("tags");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.ShipmentPackageItemTag_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getTags());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/MarkPackageAsDeliveredMutation_ResponseAdapter$DestinationAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$DestinationAddress;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$DestinationAddress;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$DestinationAddress;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DestinationAddress implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.DestinationAddress INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.DestinationAddress();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"addressLine1", "addressLine2", "addressLine3", "adminArea1", "adminArea2", "adminArea3", "adminArea4", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "countryCode"});
        public static final int $stable = 8;

        private DestinationAddress() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0085, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r10 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress(r2, r3, r4, r5, r6, r7, r8, r9, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "countryCode");
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.Object obj = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str7 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str8 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("addressLine1");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAddressLine1());
            writer.name("addressLine2");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAddressLine2());
            writer.name("addressLine3");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAddressLine3());
            writer.name("adminArea1");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAdminArea1());
            writer.name("adminArea2");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAdminArea2());
            writer.name("adminArea3");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAdminArea3());
            writer.name("adminArea4");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAdminArea4());
            writer.name(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPostalCode());
            writer.name("countryCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCountryCode());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/MarkPackageAsDeliveredMutation_ResponseAdapter$ShipmentUpdate;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$ShipmentUpdate;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$ShipmentUpdate;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$ShipmentUpdate;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ShipmentUpdate implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.ShipmentUpdate INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.ShipmentUpdate();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"shipmentStatus", "location", "updateTime", "updateTimeDescription", "checkPointMessage"});
        public static final int $stable = 8;

        private ShipmentUpdate() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus = null;
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location location = null;
            java.lang.Object obj = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    packageTrackingStatus = (com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    location = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Location.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate(packageTrackingStatus, location, obj, str, str2);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("shipmentStatus");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getShipmentStatus());
            writer.name("location");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Location.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getLocation());
            writer.name("updateTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getUpdateTime());
            writer.name("updateTimeDescription");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getUpdateTimeDescription());
            writer.name("checkPointMessage");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getCheckPointMessage());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/MarkPackageAsDeliveredMutation_ResponseAdapter$Location;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Location;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Location;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Location;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Location implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Location INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Location();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"addressLine1", "addressLine2", "addressLine3", "adminArea1", "adminArea2", "adminArea3", "adminArea4", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "countryCode"});
        public static final int $stable = 8;

        private Location() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0085, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r10 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location(r2, r3, r4, r5, r6, r7, r8, r9, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "countryCode");
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.Object obj = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str7 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str8 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("addressLine1");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAddressLine1());
            writer.name("addressLine2");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAddressLine2());
            writer.name("addressLine3");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAddressLine3());
            writer.name("adminArea1");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAdminArea1());
            writer.name("adminArea2");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAdminArea2());
            writer.name("adminArea3");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAdminArea3());
            writer.name("adminArea4");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAdminArea4());
            writer.name(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPostalCode());
            writer.name("countryCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCountryCode());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/MarkPackageAsDeliveredMutation_ResponseAdapter$Merchant;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Merchant;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Merchant;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Merchant;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Merchant implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Merchant INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Merchant();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Merchant() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant onMerchant;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onMerchant = com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.OnMerchant.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onMerchant = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("ShipmentPackageExternalMerchant"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onShipmentPackageExternalMerchant = com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.OnShipmentPackageExternalMerchant.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant(str, onMerchant, onShipmentPackageExternalMerchant);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnMerchant() != null) {
                com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.OnMerchant.INSTANCE.toJson(writer, customScalarAdapters, value.getOnMerchant());
            }
            if (value.getOnShipmentPackageExternalMerchant() != null) {
                com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.OnShipmentPackageExternalMerchant.INSTANCE.toJson(writer, customScalarAdapters, value.getOnShipmentPackageExternalMerchant());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/MarkPackageAsDeliveredMutation_ResponseAdapter$OnMerchant;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnMerchant;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnMerchant;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnMerchant;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnMerchant implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.OnMerchant INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.OnMerchant();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("id");
        public static final int $stable = 8;

        private OnMerchant() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant(str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/MarkPackageAsDeliveredMutation_ResponseAdapter$OnShipmentPackageExternalMerchant;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnShipmentPackageExternalMerchant;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnShipmentPackageExternalMerchant;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnShipmentPackageExternalMerchant;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnShipmentPackageExternalMerchant implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.OnShipmentPackageExternalMerchant INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.OnShipmentPackageExternalMerchant();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "logoImageUrl"});
        public static final int $stable = 8;

        private OnShipmentPackageExternalMerchant() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant(str, obj);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("logoImageUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getLogoImageUrl());
        }
    }
}
