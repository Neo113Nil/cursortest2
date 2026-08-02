package com.paypal.oslo.feature.oneonboarding.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DateOfBirthPickerInputComponentFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "DateOfBirthPickerInputComponentFragment", "ContextualInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateOfBirthPickerInputComponentFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DateOfBirthPickerInputComponentFragmentImpl_ResponseAdapter$DateOfBirthPickerInputComponentFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DateOfBirthPickerInputComponentFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DateOfBirthPickerInputComponentFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DateOfBirthPickerInputComponentFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DateOfBirthPickerInputComponentFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment> {
        public static final com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragmentImpl_ResponseAdapter.DateOfBirthPickerInputComponentFragment INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragmentImpl_ResponseAdapter.DateOfBirthPickerInputComponentFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "id", "contextualInfo", "dateOfBirthPickerInputComponentVariant", "editable", "birthDate"});
        public static final int $stable = 8;

        private DateOfBirthPickerInputComponentFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.util.List list = null;
            com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthPickerInputComponentVariant onboardDateOfBirthPickerInputComponentVariant = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragmentImpl_ResponseAdapter.ContextualInfo.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    onboardDateOfBirthPickerInputComponentVariant = com.paypal.oslo.api.graphql.schema.type.adapter.OnboardDateOfBirthPickerInputComponentVariant_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (onboardDateOfBirthPickerInputComponentVariant == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "dateOfBirthPickerInputComponentVariant");
                throw new kotlin.KotlinNothingValueException();
            }
            if (bool != null) {
                return new com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment(str, str2, list, onboardDateOfBirthPickerInputComponentVariant, bool.booleanValue(), obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "editable");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("contextualInfo");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragmentImpl_ResponseAdapter.ContextualInfo.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getContextualInfo());
            writer.name("dateOfBirthPickerInputComponentVariant");
            com.paypal.oslo.api.graphql.schema.type.adapter.OnboardDateOfBirthPickerInputComponentVariant_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getDateOfBirthPickerInputComponentVariant());
            writer.name("editable");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getEditable()));
            writer.name("birthDate");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getBirthDate());
        }
    }

    private DateOfBirthPickerInputComponentFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DateOfBirthPickerInputComponentFragmentImpl_ResponseAdapter$ContextualInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DateOfBirthPickerInputComponentFragment$ContextualInfo;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DateOfBirthPickerInputComponentFragment$ContextualInfo;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DateOfBirthPickerInputComponentFragment$ContextualInfo;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ContextualInfo implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment.ContextualInfo> {
        public static final com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragmentImpl_ResponseAdapter.ContextualInfo INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragmentImpl_ResponseAdapter.ContextualInfo();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private ContextualInfo() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment.ContextualInfo fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.ContextualInfoFragment fromJson = com.paypal.oslo.feature.oneonboarding.graphql.fragment.ContextualInfoFragmentImpl_ResponseAdapter.ContextualInfoFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment.ContextualInfo(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment.ContextualInfo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.ContextualInfoFragmentImpl_ResponseAdapter.ContextualInfoFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getContextualInfoFragment());
        }
    }
}
