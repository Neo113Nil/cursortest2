package com.paypal.oslo.feature.home.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFieldsImpl_ResponseAdapter;", "", "<init>", "()V", "HomeCreditNextBestActionFields", "OnRevolvingCreditPastDue", "OnRevolvingCreditMinimumPaymentDue", "MinimumPaymentDue", "OnRevolvingCreditAutopayCustomAmount", "CustomAmount", "OnRevolvingCreditAutopayMinimumPaymentDue", "MinimumPaymentDue1", "OnRevolvingCreditAutopayLastStatement"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HomeCreditNextBestActionFieldsImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFieldsImpl_ResponseAdapter$HomeCreditNextBestActionFields;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HomeCreditNextBestActionFields implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields> {
        public static final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.HomeCreditNextBestActionFields INSTANCE = new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.HomeCreditNextBestActionFields();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private HomeCreditNextBestActionFields() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditPastDue onRevolvingCreditPastDue;
            com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditMinimumPaymentDue onRevolvingCreditMinimumPaymentDue;
            com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayCustomAmount onRevolvingCreditAutopayCustomAmount;
            com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayMinimumPaymentDue onRevolvingCreditAutopayMinimumPaymentDue;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayLastStatement onRevolvingCreditAutopayLastStatement = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditPastDue"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditPastDue = com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditPastDue.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRevolvingCreditPastDue = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditMinimumPaymentDue"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditMinimumPaymentDue = com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditMinimumPaymentDue.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRevolvingCreditMinimumPaymentDue = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditAutopayCustomAmount"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditAutopayCustomAmount = com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditAutopayCustomAmount.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRevolvingCreditAutopayCustomAmount = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditAutopayMinimumPaymentDue"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditAutopayMinimumPaymentDue = com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditAutopayMinimumPaymentDue.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRevolvingCreditAutopayMinimumPaymentDue = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditAutopayLastStatement"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditAutopayLastStatement = com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditAutopayLastStatement.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields(str, onRevolvingCreditPastDue, onRevolvingCreditMinimumPaymentDue, onRevolvingCreditAutopayCustomAmount, onRevolvingCreditAutopayMinimumPaymentDue, onRevolvingCreditAutopayLastStatement);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnRevolvingCreditPastDue() != null) {
                com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditPastDue.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditPastDue());
            }
            if (value.getOnRevolvingCreditMinimumPaymentDue() != null) {
                com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditMinimumPaymentDue.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditMinimumPaymentDue());
            }
            if (value.getOnRevolvingCreditAutopayCustomAmount() != null) {
                com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditAutopayCustomAmount.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditAutopayCustomAmount());
            }
            if (value.getOnRevolvingCreditAutopayMinimumPaymentDue() != null) {
                com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditAutopayMinimumPaymentDue.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditAutopayMinimumPaymentDue());
            }
            if (value.getOnRevolvingCreditAutopayLastStatement() != null) {
                com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditAutopayLastStatement.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditAutopayLastStatement());
            }
        }
    }

    private HomeCreditNextBestActionFieldsImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFieldsImpl_ResponseAdapter$OnRevolvingCreditPastDue;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditPastDue;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditPastDue;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditPastDue;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditPastDue implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditPastDue> {
        public static final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditPastDue INSTANCE = new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditPastDue();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "personalizationTrackingId"});
        public static final int $stable = 8;

        private OnRevolvingCreditPastDue() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditPastDue fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditPastDue(str, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "personalizationTrackingId");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditPastDue value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("personalizationTrackingId");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getPersonalizationTrackingId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFieldsImpl_ResponseAdapter$OnRevolvingCreditMinimumPaymentDue;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditMinimumPaymentDue;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditMinimumPaymentDue;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditMinimumPaymentDue;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditMinimumPaymentDue implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditMinimumPaymentDue> {
        public static final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditMinimumPaymentDue INSTANCE = new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditMinimumPaymentDue();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "minimumPaymentDue", "nextPaymentDueTime", "personalizationTrackingId"});
        public static final int $stable = 8;

        private OnRevolvingCreditMinimumPaymentDue() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditMinimumPaymentDue fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.MinimumPaymentDue minimumPaymentDue = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    minimumPaymentDue = (com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.MinimumPaymentDue) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.MinimumPaymentDue.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
                throw new kotlin.KotlinNothingValueException();
            }
            if (minimumPaymentDue == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "minimumPaymentDue");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "nextPaymentDueTime");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj2 != null) {
                return new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditMinimumPaymentDue(str, minimumPaymentDue, obj, obj2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "personalizationTrackingId");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditMinimumPaymentDue value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("minimumPaymentDue");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.MinimumPaymentDue.INSTANCE, true).toJson(writer, customScalarAdapters, value.getMinimumPaymentDue());
            writer.name("nextPaymentDueTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getNextPaymentDueTime());
            writer.name("personalizationTrackingId");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getPersonalizationTrackingId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFieldsImpl_ResponseAdapter$MinimumPaymentDue;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$MinimumPaymentDue;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$MinimumPaymentDue;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$MinimumPaymentDue;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MinimumPaymentDue implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.MinimumPaymentDue> {
        public static final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.MinimumPaymentDue INSTANCE = new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.MinimumPaymentDue();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private MinimumPaymentDue() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.MinimumPaymentDue fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment fromJson = com.paypal.oslo.feature.home.graphql.fragment.MoneyFragmentImpl_ResponseAdapter.MoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.MinimumPaymentDue(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.MinimumPaymentDue value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.home.graphql.fragment.MoneyFragmentImpl_ResponseAdapter.MoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFieldsImpl_ResponseAdapter$OnRevolvingCreditAutopayCustomAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditAutopayCustomAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditAutopayCustomAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditAutopayCustomAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditAutopayCustomAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayCustomAmount> {
        public static final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditAutopayCustomAmount INSTANCE = new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditAutopayCustomAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "customAmount", "nextPaymentDueTime", "personalizationTrackingId"});
        public static final int $stable = 8;

        private OnRevolvingCreditAutopayCustomAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayCustomAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.CustomAmount customAmount = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    customAmount = (com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.CustomAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.CustomAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
                throw new kotlin.KotlinNothingValueException();
            }
            if (customAmount == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "customAmount");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "nextPaymentDueTime");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj2 != null) {
                return new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayCustomAmount(str, customAmount, obj, obj2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "personalizationTrackingId");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayCustomAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("customAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.CustomAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getCustomAmount());
            writer.name("nextPaymentDueTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getNextPaymentDueTime());
            writer.name("personalizationTrackingId");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getPersonalizationTrackingId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFieldsImpl_ResponseAdapter$CustomAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$CustomAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$CustomAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$CustomAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CustomAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.CustomAmount> {
        public static final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.CustomAmount INSTANCE = new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.CustomAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CustomAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.CustomAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment fromJson = com.paypal.oslo.feature.home.graphql.fragment.MoneyFragmentImpl_ResponseAdapter.MoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.CustomAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.CustomAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.home.graphql.fragment.MoneyFragmentImpl_ResponseAdapter.MoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFieldsImpl_ResponseAdapter$OnRevolvingCreditAutopayMinimumPaymentDue;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditAutopayMinimumPaymentDue;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditAutopayMinimumPaymentDue;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditAutopayMinimumPaymentDue;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditAutopayMinimumPaymentDue implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayMinimumPaymentDue> {
        public static final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditAutopayMinimumPaymentDue INSTANCE = new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditAutopayMinimumPaymentDue();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "minimumPaymentDue", "nextPaymentDueTime", "personalizationTrackingId"});
        public static final int $stable = 8;

        private OnRevolvingCreditAutopayMinimumPaymentDue() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayMinimumPaymentDue fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.MinimumPaymentDue1 minimumPaymentDue1 = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    minimumPaymentDue1 = (com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.MinimumPaymentDue1) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.MinimumPaymentDue1.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
                throw new kotlin.KotlinNothingValueException();
            }
            if (minimumPaymentDue1 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "minimumPaymentDue");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "nextPaymentDueTime");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj2 != null) {
                return new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayMinimumPaymentDue(str, minimumPaymentDue1, obj, obj2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "personalizationTrackingId");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayMinimumPaymentDue value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("minimumPaymentDue");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.MinimumPaymentDue1.INSTANCE, true).toJson(writer, customScalarAdapters, value.getMinimumPaymentDue());
            writer.name("nextPaymentDueTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getNextPaymentDueTime());
            writer.name("personalizationTrackingId");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getPersonalizationTrackingId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFieldsImpl_ResponseAdapter$MinimumPaymentDue1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$MinimumPaymentDue1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$MinimumPaymentDue1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$MinimumPaymentDue1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MinimumPaymentDue1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.MinimumPaymentDue1> {
        public static final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.MinimumPaymentDue1 INSTANCE = new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.MinimumPaymentDue1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private MinimumPaymentDue1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.MinimumPaymentDue1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment fromJson = com.paypal.oslo.feature.home.graphql.fragment.MoneyFragmentImpl_ResponseAdapter.MoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.MinimumPaymentDue1(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.MinimumPaymentDue1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.home.graphql.fragment.MoneyFragmentImpl_ResponseAdapter.MoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFieldsImpl_ResponseAdapter$OnRevolvingCreditAutopayLastStatement;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditAutopayLastStatement;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditAutopayLastStatement;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields$OnRevolvingCreditAutopayLastStatement;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditAutopayLastStatement implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayLastStatement> {
        public static final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditAutopayLastStatement INSTANCE = new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFieldsImpl_ResponseAdapter.OnRevolvingCreditAutopayLastStatement();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "nextPaymentDueTime", "personalizationTrackingId"});
        public static final int $stable = 8;

        private OnRevolvingCreditAutopayLastStatement() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayLastStatement fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "nextPaymentDueTime");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj2 != null) {
                return new com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayLastStatement(str, obj, obj2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "personalizationTrackingId");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields.OnRevolvingCreditAutopayLastStatement value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("nextPaymentDueTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getNextPaymentDueTime());
            writer.name("personalizationTrackingId");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getPersonalizationTrackingId());
        }
    }
}
