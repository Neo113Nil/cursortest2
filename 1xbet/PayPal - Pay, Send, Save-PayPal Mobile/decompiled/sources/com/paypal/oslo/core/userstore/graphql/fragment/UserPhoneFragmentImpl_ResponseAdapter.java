package com.paypal.oslo.core.userstore.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "UserPhoneFragment", "PhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserPhoneFragmentImpl_ResponseAdapter {
    public static final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragmentImpl_ResponseAdapter$UserPhoneFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UserPhoneFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment> {
        public static final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragmentImpl_ResponseAdapter.UserPhoneFragment INSTANCE = new com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragmentImpl_ResponseAdapter.UserPhoneFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "phoneNumber", "type", "maskedPhoneNumber", "primary", "confirmed", "createdTime"});

        private UserPhoneFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            r12 = r1.booleanValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            if (r6 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        
            r7 = r6.booleanValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        
            if (r8 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        
            return new com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment(r2, r3, r4, r5, r12, r7, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "createdTime");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "confirmed");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "primary");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "maskedPhoneNumber");
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "phoneNumber");
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r2 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
        
            if (r3 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        
            if (r4 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r5 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r1 == null) goto L27;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.String str = null;
            com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment.PhoneNumber phoneNumber = null;
            com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType = null;
            java.lang.String str2 = null;
            java.lang.Boolean bool2 = null;
            java.lang.Object obj = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = (java.lang.String) customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.PartyContactInfoID.INSTANCE.getType()).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        phoneNumber = (com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment.PhoneNumber) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragmentImpl_ResponseAdapter.PhoneNumber.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        phoneType = com.paypal.oslo.api.graphql.schema.type.adapter.PhoneType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool2 = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.PartyContactInfoID.INSTANCE.getType()).toJson(writer, customScalarAdapters, value.getId());
            writer.name("phoneNumber");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragmentImpl_ResponseAdapter.PhoneNumber.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getPhoneNumber());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.PhoneType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("maskedPhoneNumber");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getMaskedPhoneNumber());
            writer.name("primary");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getPrimary()));
            writer.name("confirmed");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getConfirmed()));
            writer.name("createdTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCreatedTime());
        }
    }

    private UserPhoneFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragmentImpl_ResponseAdapter$PhoneNumber;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment$PhoneNumber;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment$PhoneNumber;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment$PhoneNumber;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhoneNumber implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment.PhoneNumber> {
        public static final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragmentImpl_ResponseAdapter.PhoneNumber INSTANCE = new com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragmentImpl_ResponseAdapter.PhoneNumber();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"extensionNumber", "countryCode", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber});

        private PhoneNumber() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment.PhoneNumber fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment.PhoneNumber(str, str2, str3);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment.PhoneNumber value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("extensionNumber");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getExtensionNumber());
            writer.name("countryCode");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getCountryCode());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNationalNumber());
        }
    }
}
