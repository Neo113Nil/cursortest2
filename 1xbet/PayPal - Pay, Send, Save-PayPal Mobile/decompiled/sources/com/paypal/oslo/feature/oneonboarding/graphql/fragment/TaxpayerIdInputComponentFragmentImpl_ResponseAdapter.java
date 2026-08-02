package com.paypal.oslo.feature.oneonboarding.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "TaxpayerIdInputComponentFragment", "ContextualInfo", "Option"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxpayerIdInputComponentFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragmentImpl_ResponseAdapter$TaxpayerIdInputComponentFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TaxpayerIdInputComponentFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment> {
        public static final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragmentImpl_ResponseAdapter.TaxpayerIdInputComponentFragment INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragmentImpl_ResponseAdapter.TaxpayerIdInputComponentFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "id", "contextualInfo", "taxpayerIdVariant", "editable", "options", "displayHelperTextWithLink"});
        public static final int $stable = 8;

        private TaxpayerIdInputComponentFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            if (r7 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            if (r6 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            return new com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment(r2, r3, r4, r5, r12, r7, r6.booleanValue());
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "displayHelperTextWithLink");
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "options");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "editable");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "taxpayerIdVariant");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00bb, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "__typename");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r2 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
        
            if (r3 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (r5 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        
            if (r1 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        
            r12 = r1.booleanValue();
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.util.List list = null;
            com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant onboardTaxpayerIdVariant = null;
            java.lang.Boolean bool2 = null;
            java.util.List list2 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragmentImpl_ResponseAdapter.ContextualInfo.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        onboardTaxpayerIdVariant = com.paypal.oslo.api.graphql.schema.type.adapter.OnboardTaxpayerIdVariant_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        list2 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragmentImpl_ResponseAdapter.Option.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool2 = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("contextualInfo");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragmentImpl_ResponseAdapter.ContextualInfo.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getContextualInfo());
            writer.name("taxpayerIdVariant");
            com.paypal.oslo.api.graphql.schema.type.adapter.OnboardTaxpayerIdVariant_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getTaxpayerIdVariant());
            writer.name("editable");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getEditable()));
            writer.name("options");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragmentImpl_ResponseAdapter.Option.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getOptions());
            writer.name("displayHelperTextWithLink");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getDisplayHelperTextWithLink()));
        }
    }

    private TaxpayerIdInputComponentFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragmentImpl_ResponseAdapter$ContextualInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragment$ContextualInfo;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragment$ContextualInfo;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragment$ContextualInfo;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ContextualInfo implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment.ContextualInfo> {
        public static final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragmentImpl_ResponseAdapter.ContextualInfo INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragmentImpl_ResponseAdapter.ContextualInfo();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private ContextualInfo() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment.ContextualInfo fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.ContextualInfoFragment fromJson = com.paypal.oslo.feature.oneonboarding.graphql.fragment.ContextualInfoFragmentImpl_ResponseAdapter.ContextualInfoFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment.ContextualInfo(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment.ContextualInfo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.ContextualInfoFragmentImpl_ResponseAdapter.ContextualInfoFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getContextualInfoFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragmentImpl_ResponseAdapter$Option;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragment$Option;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragment$Option;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragment$Option;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Option implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment.Option> {
        public static final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragmentImpl_ResponseAdapter.Option INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragmentImpl_ResponseAdapter.Option();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"type", "taxId"});
        public static final int $stable = 8;

        private Option() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment.Option fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType onboardTaxpayerIdType = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    onboardTaxpayerIdType = com.paypal.oslo.api.graphql.schema.type.adapter.OnboardTaxpayerIdType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (onboardTaxpayerIdType != null) {
                return new com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment.Option(onboardTaxpayerIdType, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "type");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment.Option value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.OnboardTaxpayerIdType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("taxId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getTaxId());
        }
    }
}
