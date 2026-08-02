package com.paypal.oslo.feature.packagetracking.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/GetPackageTrackingUserPreferencesQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "PackageTrackingUserPreferences", "Preference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetPackageTrackingUserPreferencesQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/GetPackageTrackingUserPreferencesQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("packageTrackingUserPreferences");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences packageTrackingUserPreferences = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                packageTrackingUserPreferences = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_ResponseAdapter.PackageTrackingUserPreferences.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data(packageTrackingUserPreferences);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("packageTrackingUserPreferences");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_ResponseAdapter.PackageTrackingUserPreferences.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getPackageTrackingUserPreferences());
        }
    }

    private GetPackageTrackingUserPreferencesQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/GetPackageTrackingUserPreferencesQuery_ResponseAdapter$PackageTrackingUserPreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$PackageTrackingUserPreferences;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$PackageTrackingUserPreferences;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$PackageTrackingUserPreferences;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PackageTrackingUserPreferences implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_ResponseAdapter.PackageTrackingUserPreferences INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_ResponseAdapter.PackageTrackingUserPreferences();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("preferences");
        public static final int $stable = 8;

        private PackageTrackingUserPreferences() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_ResponseAdapter.Preference.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "preferences");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.PackageTrackingUserPreferences value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("preferences");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_ResponseAdapter.Preference.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getPreferences());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/GetPackageTrackingUserPreferencesQuery_ResponseAdapter$Preference;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Preference;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Preference;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageTrackingUserPreferencesQuery$Preference;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Preference implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_ResponseAdapter.Preference INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageTrackingUserPreferencesQuery_ResponseAdapter.Preference();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"preferenceType", "preferenceKey", "preferenceValue"});
        public static final int $stable = 8;

        private Preference() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceType packageTrackingPreferenceType = null;
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingPreferenceKey packageTrackingPreferenceKey = null;
            java.lang.Boolean bool = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    packageTrackingPreferenceType = com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingPreferenceType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    packageTrackingPreferenceKey = com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingPreferenceKey_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (packageTrackingPreferenceType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "preferenceType");
                throw new kotlin.KotlinNothingValueException();
            }
            if (packageTrackingPreferenceKey == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "preferenceKey");
                throw new kotlin.KotlinNothingValueException();
            }
            if (bool != null) {
                return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference(packageTrackingPreferenceType, packageTrackingPreferenceKey, bool.booleanValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "preferenceValue");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.GetPackageTrackingUserPreferencesQuery.Preference value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("preferenceType");
            com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingPreferenceType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getPreferenceType());
            writer.name("preferenceKey");
            com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingPreferenceKey_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getPreferenceKey());
            writer.name("preferenceValue");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getPreferenceValue()));
        }
    }
}
