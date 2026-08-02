package com.paypal.oslo.feature.qrc.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "FundingSourceFragment", "InstrumentArt", "Instrument", "OnBalance", "Available", "Amount", "OnCard", "OnBankAccount", "OnQRCodeCredit", "Amount1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FundingSourceFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragmentImpl_ResponseAdapter$FundingSourceFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FundingSourceFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment> {
        public static final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.FundingSourceFragment INSTANCE = new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.FundingSourceFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "formattedName", "type", "typeLabel", "instrumentArt", "instrument", "countryCode", "currencyCode", "amount", "internalInstrumentType"});
        public static final int $stable = 8;

        private FundingSourceFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x00d2, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "instrument");
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00dc, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x00dd, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00e7, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        
            if (r4 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        
            if (r9 == null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        
            return new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType qRCodePaymentFundingSourceType = null;
            java.lang.String str3 = null;
            com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.InstrumentArt instrumentArt = null;
            com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Instrument instrument = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount1 amount1 = null;
            java.lang.String str6 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        qRCodePaymentFundingSourceType = (com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodePaymentFundingSourceType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        instrumentArt = (com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.InstrumentArt) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.InstrumentArt.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        instrument = (com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Instrument) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Instrument.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str4 = (java.lang.String) com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.CountryCode.INSTANCE.getType())).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str5 = (java.lang.String) com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.CurrencyCode.INSTANCE.getType())).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        amount1 = (com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Amount1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        str6 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("formattedName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getFormattedName());
            writer.name("type");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodePaymentFundingSourceType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getType());
            writer.name("typeLabel");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getTypeLabel());
            writer.name("instrumentArt");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.InstrumentArt.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getInstrumentArt());
            writer.name("instrument");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Instrument.INSTANCE, true).toJson(writer, customScalarAdapters, value.getInstrument());
            writer.name("countryCode");
            com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.CountryCode.INSTANCE.getType())).toJson(writer, customScalarAdapters, value.getCountryCode());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.CurrencyCode.INSTANCE.getType())).toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name("amount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Amount1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getAmount());
            writer.name("internalInstrumentType");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getInternalInstrumentType());
        }
    }

    private FundingSourceFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragmentImpl_ResponseAdapter$InstrumentArt;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$InstrumentArt;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$InstrumentArt;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$InstrumentArt;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InstrumentArt implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.InstrumentArt> {
        public static final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.InstrumentArt INSTANCE = new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.InstrumentArt();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"primaryUrl", "thumbnailUrl"});
        public static final int $stable = 8;

        private InstrumentArt() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.InstrumentArt fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = (java.lang.String) com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.URL.INSTANCE.getType())).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = (java.lang.String) com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.URL.INSTANCE.getType())).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.InstrumentArt(str, str2);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.InstrumentArt value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("primaryUrl");
            com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.URL.INSTANCE.getType())).toJson(writer, customScalarAdapters, value.getPrimaryUrl());
            writer.name("thumbnailUrl");
            com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.URL.INSTANCE.getType())).toJson(writer, customScalarAdapters, value.getThumbnailUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragmentImpl_ResponseAdapter$Instrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$Instrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$Instrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$Instrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Instrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Instrument> {
        public static final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Instrument INSTANCE = new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Instrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Instrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Instrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnBalance onBalance;
            com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnCard onCard;
            com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnBankAccount onBankAccount;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnQRCodeCredit onQRCodeCredit = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onBalance = com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnBalance.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onBalance = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onCard = com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnCard.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onCard = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("BankAccount"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onBankAccount = com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnBankAccount.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onBankAccount = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("QRCodeCredit"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onQRCodeCredit = com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnQRCodeCredit.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Instrument(str, onBalance, onCard, onBankAccount, onQRCodeCredit);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Instrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnBalance() != null) {
                com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnBalance.INSTANCE.toJson(writer, customScalarAdapters, value.getOnBalance());
            }
            if (value.getOnCard() != null) {
                com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnCard());
            }
            if (value.getOnBankAccount() != null) {
                com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnBankAccount.INSTANCE.toJson(writer, customScalarAdapters, value.getOnBankAccount());
            }
            if (value.getOnQRCodeCredit() != null) {
                com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnQRCodeCredit.INSTANCE.toJson(writer, customScalarAdapters, value.getOnQRCodeCredit());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragmentImpl_ResponseAdapter$OnBalance;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$OnBalance;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$OnBalance;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$OnBalance;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBalance implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnBalance> {
        public static final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnBalance INSTANCE = new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnBalance();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY);
        public static final int $stable = 8;

        private OnBalance() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnBalance fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Available available = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                available = (com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Available) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Available.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (available != null) {
                return new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnBalance(available);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnBalance value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY);
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Available.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getAvailable());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragmentImpl_ResponseAdapter$Available;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$Available;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$Available;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$Available;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Available implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Available> {
        public static final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Available INSTANCE = new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Available();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("amount");
        public static final int $stable = 8;

        private Available() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Available fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount amount = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                amount = (com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Amount.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (amount != null) {
                return new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Available(amount);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "amount");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Available value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("amount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Amount.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragmentImpl_ResponseAdapter$Amount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$Amount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$Amount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$Amount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Amount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount> {
        public static final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Amount INSTANCE = new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Amount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode"});
        public static final int $stable = 8;

        private Amount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str2 = (java.lang.String) customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.CurrencyCode.INSTANCE.getType()).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount(str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("currencyCode");
            customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.CurrencyCode.INSTANCE.getType()).toJson(writer, customScalarAdapters, value.getCurrencyCode());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragmentImpl_ResponseAdapter$OnCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$OnCard;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$OnCard;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$OnCard;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnCard implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnCard> {
        public static final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnCard INSTANCE = new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnCard();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "productClass", "lastNChars", "brand"});
        public static final int $stable = 8;

        private OnCard() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnCard fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand = null;
            com.paypal.oslo.feature.qrc.graphql.type.CardProductClass cardProductClass = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    cardProductClass = (com.paypal.oslo.feature.qrc.graphql.type.CardProductClass) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.CardProductClass_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    cardBrand = com.paypal.oslo.feature.qrc.graphql.type.adapter.CardBrand_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "lastNChars");
                throw new kotlin.KotlinNothingValueException();
            }
            if (cardBrand != null) {
                return new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnCard(str, cardProductClass, str2, cardBrand);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "brand");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnCard value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("productClass");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.CardProductClass_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getProductClass());
            writer.name("lastNChars");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getLastNChars());
            writer.name("brand");
            com.paypal.oslo.feature.qrc.graphql.type.adapter.CardBrand_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getBrand());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragmentImpl_ResponseAdapter$OnBankAccount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$OnBankAccount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$OnBankAccount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$OnBankAccount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBankAccount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnBankAccount> {
        public static final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnBankAccount INSTANCE = new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnBankAccount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "type", "currencyCode", "lastNChars"});
        public static final int $stable = 8;

        private OnBankAccount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnBankAccount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.qrc.graphql.type.BankAccountType bankAccountType = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bankAccountType = com.paypal.oslo.feature.qrc.graphql.type.adapter.BankAccountType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = (java.lang.String) com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.CurrencyCode.INSTANCE.getType())).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (bankAccountType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "type");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnBankAccount(str, bankAccountType, str3, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "lastNChars");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnBankAccount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("type");
            com.paypal.oslo.feature.qrc.graphql.type.adapter.BankAccountType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.CurrencyCode.INSTANCE.getType())).toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name("lastNChars");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getLastNChars());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragmentImpl_ResponseAdapter$OnQRCodeCredit;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$OnQRCodeCredit;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$OnQRCodeCredit;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$OnQRCodeCredit;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnQRCodeCredit implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnQRCodeCredit> {
        public static final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnQRCodeCredit INSTANCE = new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.OnQRCodeCredit();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("id");
        public static final int $stable = 8;

        private OnQRCodeCredit() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnQRCodeCredit fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnQRCodeCredit(str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnQRCodeCredit value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragmentImpl_ResponseAdapter$Amount1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$Amount1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$Amount1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment$Amount1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Amount1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount1> {
        public static final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Amount1 INSTANCE = new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragmentImpl_ResponseAdapter.Amount1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode"});
        public static final int $stable = 8;

        private Amount1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str2 = (java.lang.String) customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.CurrencyCode.INSTANCE.getType()).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount1(str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("currencyCode");
            customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.CurrencyCode.INSTANCE.getType()).toJson(writer, customScalarAdapters, value.getCurrencyCode());
        }
    }
}
