package com.paypal.oslo.core.userstore.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "UserAddressFragment", "Address"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAddressFragmentImpl_ResponseAdapter {
    public static final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragmentImpl_ResponseAdapter$UserAddressFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UserAddressFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment> {
        public static final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragmentImpl_ResponseAdapter.UserAddressFragment INSTANCE = new com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragmentImpl_ResponseAdapter.UserAddressFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "primary", "confirmed", "addresseeName", "billing", "confirmationAuthority", "address"});

        private UserAddressFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            if (r4 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        
            r6 = r4.booleanValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        
            if (r7 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        
            if (r8 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        
            return new com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment(r2, r12, r0, r5, r6, r7, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "address");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "confirmationAuthority");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "billing");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "confirmed");
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "primary");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c9, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r2 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
        
            if (r1 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        
            r12 = r1.booleanValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r3 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r0 = r3.booleanValue();
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.String str = null;
            java.lang.Boolean bool2 = null;
            java.lang.Boolean bool3 = null;
            java.lang.String str2 = null;
            com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority = null;
            com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address address = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = (java.lang.String) customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.PartyContactInfoID.INSTANCE.getType()).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool2 = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool3 = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        addressConfirmationAuthority = com.paypal.oslo.api.graphql.schema.type.adapter.AddressConfirmationAuthority_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        address = (com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragmentImpl_ResponseAdapter.Address.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.PartyContactInfoID.INSTANCE.getType()).toJson(writer, customScalarAdapters, value.getId());
            writer.name("primary");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getPrimary()));
            writer.name("confirmed");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getConfirmed()));
            writer.name("addresseeName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAddresseeName());
            writer.name("billing");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getBilling()));
            writer.name("confirmationAuthority");
            com.paypal.oslo.api.graphql.schema.type.adapter.AddressConfirmationAuthority_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getConfirmationAuthority());
            writer.name("address");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragmentImpl_ResponseAdapter.Address.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getAddress());
        }
    }

    private UserAddressFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragmentImpl_ResponseAdapter$Address;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment$Address;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment$Address;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment$Address;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Address implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address> {
        public static final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragmentImpl_ResponseAdapter.Address INSTANCE = new com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragmentImpl_ResponseAdapter.Address();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"addressLine1", "addressLine2", "addressLine3", "adminArea1", "adminArea2", "adminArea3", "adminArea4", "countryCode", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE});

        private Address() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0085, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r9 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        
            return new com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address(r2, r3, r4, r5, r6, r7, r8, r9, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "countryCode");
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.lang.Object obj = null;
            java.lang.String str8 = null;
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
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str8 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address value) {
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
            writer.name("countryCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCountryCode());
            writer.name(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPostalCode());
        }
    }
}
