package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "RevolvingCreditCustomerServiceFragment", "MailingAddress", "PhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter$RevolvingCreditCustomerServiceFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RevolvingCreditCustomerServiceFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter.RevolvingCreditCustomerServiceFragment INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter.RevolvingCreditCustomerServiceFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"mailingAddress", "operationHours", "payableTo", "phoneNumber"});
        public static final int $stable = 8;

        private RevolvingCreditCustomerServiceFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.MailingAddress mailingAddress = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.PhoneNumber phoneNumber = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    mailingAddress = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.MailingAddress) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter.MailingAddress.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    phoneNumber = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.PhoneNumber) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter.PhoneNumber.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment(mailingAddress, str, str2, phoneNumber);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("mailingAddress");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter.MailingAddress.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getMailingAddress());
            writer.name("operationHours");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getOperationHours());
            writer.name("payableTo");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPayableTo());
            writer.name("phoneNumber");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter.PhoneNumber.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getPhoneNumber());
        }
    }

    private RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter$MailingAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment$MailingAddress;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment$MailingAddress;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment$MailingAddress;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MailingAddress implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.MailingAddress> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter.MailingAddress INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter.MailingAddress();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"addressLine1", "addressLine2", "addressLine3", "adminArea1", "adminArea2", "adminArea3", "countryCode", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE});
        public static final int $stable = 8;

        private MailingAddress() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x007a, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r8 == null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
        
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.MailingAddress(r2, r3, r4, r5, r6, r7, r8, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "countryCode");
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.MailingAddress fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            java.lang.Object obj = null;
            java.lang.String str7 = null;
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
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str7 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.MailingAddress value) {
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
            writer.name("countryCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCountryCode());
            writer.name(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPostalCode());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter$PhoneNumber;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment$PhoneNumber;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment$PhoneNumber;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment$PhoneNumber;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhoneNumber implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.PhoneNumber> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter.PhoneNumber INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragmentImpl_ResponseAdapter.PhoneNumber();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PhoneNumber() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.PhoneNumber fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragmentImpl_ResponseAdapter.RevolvingCreditPhoneFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.PhoneNumber(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment.PhoneNumber value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragmentImpl_ResponseAdapter.RevolvingCreditPhoneFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditPhoneFragment());
        }
    }
}
