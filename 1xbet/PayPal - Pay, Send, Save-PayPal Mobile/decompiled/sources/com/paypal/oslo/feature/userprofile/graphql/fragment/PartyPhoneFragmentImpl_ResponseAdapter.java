package com.paypal.oslo.feature.userprofile.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhoneFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "PartyPhoneFragment", "PhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PartyPhoneFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhoneFragmentImpl_ResponseAdapter$PartyPhoneFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhoneFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhoneFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhoneFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PartyPhoneFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment> {
        public static final com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragmentImpl_ResponseAdapter.PartyPhoneFragment INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragmentImpl_ResponseAdapter.PartyPhoneFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "phoneNumber", "maskedPhoneNumber", "primary", "confirmed", "type", "createdTime"});
        public static final int $stable = 8;

        private PartyPhoneFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        
            if (r1 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        
            r6 = r1.booleanValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            if (r7 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r8 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        
            return new com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment(r2, r3, r4, r5, r6, r7, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "createdTime");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "confirmed");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "primary");
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "maskedPhoneNumber");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "phoneNumber");
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (r2 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
        
            if (r3 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        
            if (r4 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        
            if (r0 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        
            r5 = r0.booleanValue();
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.Boolean bool2 = null;
            java.lang.String str = null;
            com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment.PhoneNumber phoneNumber = null;
            java.lang.String str2 = null;
            com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType = null;
            java.lang.Object obj = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = (java.lang.String) customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.PartyContactInfoID.INSTANCE.getType()).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        phoneNumber = (com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment.PhoneNumber) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragmentImpl_ResponseAdapter.PhoneNumber.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool2 = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        phoneType = com.paypal.oslo.api.graphql.schema.type.adapter.PhoneType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.PartyContactInfoID.INSTANCE.getType()).toJson(writer, customScalarAdapters, value.getId());
            writer.name("phoneNumber");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragmentImpl_ResponseAdapter.PhoneNumber.INSTANCE, true).toJson(writer, customScalarAdapters, value.getPhoneNumber());
            writer.name("maskedPhoneNumber");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getMaskedPhoneNumber());
            writer.name("primary");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getPrimary()));
            writer.name("confirmed");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getConfirmed()));
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.PhoneType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("createdTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCreatedTime());
        }
    }

    private PartyPhoneFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhoneFragmentImpl_ResponseAdapter$PhoneNumber;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhoneFragment$PhoneNumber;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhoneFragment$PhoneNumber;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhoneFragment$PhoneNumber;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhoneNumber implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment.PhoneNumber> {
        public static final com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragmentImpl_ResponseAdapter.PhoneNumber INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragmentImpl_ResponseAdapter.PhoneNumber();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PhoneNumber() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment.PhoneNumber fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.userprofile.graphql.fragment.PhoneNumberFragment fromJson = com.paypal.oslo.feature.userprofile.graphql.fragment.PhoneNumberFragmentImpl_ResponseAdapter.PhoneNumberFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment.PhoneNumber(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhoneFragment.PhoneNumber value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.userprofile.graphql.fragment.PhoneNumberFragmentImpl_ResponseAdapter.PhoneNumberFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getPhoneNumberFragment());
        }
    }
}
