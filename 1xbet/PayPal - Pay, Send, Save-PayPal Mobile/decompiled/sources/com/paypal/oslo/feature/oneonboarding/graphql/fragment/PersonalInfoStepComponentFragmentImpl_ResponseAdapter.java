package com.paypal.oslo.feature.oneonboarding.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "PersonalInfoStepComponentFragment", "ContextualInfo", "Component"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PersonalInfoStepComponentFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragmentImpl_ResponseAdapter$PersonalInfoStepComponentFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PersonalInfoStepComponentFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment> {
        public static final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter.PersonalInfoStepComponentFragment INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter.PersonalInfoStepComponentFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "id", "contextualInfo", "components"});
        public static final int $stable = 8;

        private PersonalInfoStepComponentFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.util.List list = null;
            java.util.List list2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter.ContextualInfo.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter.Component.INSTANCE, true)).fromJson(reader, customScalarAdapters);
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
            if (list != null) {
                return new com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment(str, str2, list2, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "components");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("contextualInfo");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter.ContextualInfo.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getContextualInfo());
            writer.name("components");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter.Component.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getComponents());
        }
    }

    private PersonalInfoStepComponentFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragmentImpl_ResponseAdapter$ContextualInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment$ContextualInfo;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment$ContextualInfo;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment$ContextualInfo;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ContextualInfo implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment.ContextualInfo> {
        public static final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter.ContextualInfo INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter.ContextualInfo();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private ContextualInfo() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment.ContextualInfo fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.ContextualInfoFragment fromJson = com.paypal.oslo.feature.oneonboarding.graphql.fragment.ContextualInfoFragmentImpl_ResponseAdapter.ContextualInfoFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment.ContextualInfo(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment.ContextualInfo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.ContextualInfoFragmentImpl_ResponseAdapter.ContextualInfoFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getContextualInfoFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragmentImpl_ResponseAdapter$Component;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment$Component;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment$Component;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PersonalInfoStepComponentFragment$Component;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Component implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment.Component> {
        public static final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter.Component INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter.Component();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Component() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment.Component fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameInputComponentFragment nameInputComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.AddressInputComponentFragment addressInputComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthInputComponentFragment dateOfBirthInputComponentFragment;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.AccountCreationTermsInputFragment accountCreationTermsInputFragment = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardNameInputComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                nameInputComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameInputComponentFragmentImpl_ResponseAdapter.NameInputComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                nameInputComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardAddressInputComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                addressInputComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.AddressInputComponentFragmentImpl_ResponseAdapter.AddressInputComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                addressInputComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardDateOfBirthInputComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                dateOfBirthInputComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthInputComponentFragmentImpl_ResponseAdapter.DateOfBirthInputComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                dateOfBirthInputComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardAccountCreationTermsInputComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                accountCreationTermsInputFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.AccountCreationTermsInputFragmentImpl_ResponseAdapter.AccountCreationTermsInputFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment.Component(str, nameInputComponentFragment, addressInputComponentFragment, dateOfBirthInputComponentFragment, accountCreationTermsInputFragment);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment.Component value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getNameInputComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameInputComponentFragmentImpl_ResponseAdapter.NameInputComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getNameInputComponentFragment());
            }
            if (value.getAddressInputComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.AddressInputComponentFragmentImpl_ResponseAdapter.AddressInputComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getAddressInputComponentFragment());
            }
            if (value.getDateOfBirthInputComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthInputComponentFragmentImpl_ResponseAdapter.DateOfBirthInputComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getDateOfBirthInputComponentFragment());
            }
            if (value.getAccountCreationTermsInputFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.AccountCreationTermsInputFragmentImpl_ResponseAdapter.AccountCreationTermsInputFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getAccountCreationTermsInputFragment());
            }
        }
    }
}
