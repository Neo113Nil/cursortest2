package com.paypal.oslo.feature.savings.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "SavingsMoneyBoxFragment", "TargetAmount", "CurrentBalance", "PendingAmount", "TransferSettings", "ReloadAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsMoneyBoxFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragmentImpl_ResponseAdapter$SavingsMoneyBoxFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SavingsMoneyBoxFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment> {
        public static final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.SavingsMoneyBoxFragment INSTANCE = new com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.SavingsMoneyBoxFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "type", "targetAmount", "currentBalance", "pendingAmount", "category", "status", "transferSettings"});
        public static final int $stable = 8;

        private SavingsMoneyBoxFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            if (r8 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        
            if (r9 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            if (r10 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            return new com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00b1, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "status");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00bb, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00bc, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "category");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00c6, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c7, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "pendingAmount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00d2, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "currentBalance");
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "targetAmount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00e8, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00f2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00f3, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "name");
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00fd, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00fe, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        
            if (r2 == null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
        
            if (r3 == null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        
            if (r5 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (r6 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            if (r7 == null) goto L31;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxType moneyboxType = null;
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.TargetAmount targetAmount = null;
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.CurrentBalance currentBalance = null;
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.PendingAmount pendingAmount = null;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory = null;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxStatus moneyboxStatus = null;
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.TransferSettings transferSettings = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        moneyboxType = com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        targetAmount = (com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.TargetAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.TargetAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        currentBalance = (com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.CurrentBalance) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.CurrentBalance.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        pendingAmount = (com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.PendingAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.PendingAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        moneyboxCategory = com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxCategory_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        moneyboxStatus = com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        transferSettings = (com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.TransferSettings) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.TransferSettings.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getDescription());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("targetAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.TargetAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getTargetAmount());
            writer.name("currentBalance");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.CurrentBalance.INSTANCE, true).toJson(writer, customScalarAdapters, value.getCurrentBalance());
            writer.name("pendingAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.PendingAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getPendingAmount());
            writer.name("category");
            com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxCategory_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCategory());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("transferSettings");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.TransferSettings.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getTransferSettings());
        }
    }

    private SavingsMoneyBoxFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragmentImpl_ResponseAdapter$TargetAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$TargetAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$TargetAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$TargetAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TargetAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.TargetAmount> {
        public static final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.TargetAmount INSTANCE = new com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.TargetAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TargetAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.TargetAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment fromJson = com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragmentImpl_ResponseAdapter.SavingsMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.TargetAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.TargetAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragmentImpl_ResponseAdapter.SavingsMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getSavingsMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragmentImpl_ResponseAdapter$CurrentBalance;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$CurrentBalance;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$CurrentBalance;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$CurrentBalance;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CurrentBalance implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.CurrentBalance> {
        public static final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.CurrentBalance INSTANCE = new com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.CurrentBalance();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CurrentBalance() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.CurrentBalance fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment fromJson = com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragmentImpl_ResponseAdapter.SavingsMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.CurrentBalance(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.CurrentBalance value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragmentImpl_ResponseAdapter.SavingsMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getSavingsMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragmentImpl_ResponseAdapter$PendingAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$PendingAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$PendingAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$PendingAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PendingAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.PendingAmount> {
        public static final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.PendingAmount INSTANCE = new com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.PendingAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PendingAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.PendingAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment fromJson = com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragmentImpl_ResponseAdapter.SavingsMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.PendingAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.PendingAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragmentImpl_ResponseAdapter.SavingsMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getSavingsMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragmentImpl_ResponseAdapter$TransferSettings;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$TransferSettings;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$TransferSettings;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$TransferSettings;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TransferSettings implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.TransferSettings> {
        public static final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.TransferSettings INSTANCE = new com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.TransferSettings();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "startDate", "nextReloadDate", "recurrence", "financialInstrumentId", "financialInstrumentName", "lastFourChars", "reloadAmount", "status", "type"});
        public static final int $stable = 8;

        private TransferSettings() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            if (r9 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            if (r10 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            if (r11 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        
            return new com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.TransferSettings(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "status");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "reloadAmount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b1, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "financialInstrumentId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "recurrence");
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c7, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "nextReloadDate");
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "startDate");
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if (r2 == null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
        
            if (r3 == null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        
            if (r4 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (r5 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            if (r6 == null) goto L31;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.TransferSettings fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleRecurrence moneyboxScheduleRecurrence = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.ReloadAmount reloadAmount = null;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus moneyboxScheduleStatus = null;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType moneyboxTransferSettingsType = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        moneyboxScheduleRecurrence = com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxScheduleRecurrence_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        reloadAmount = (com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.ReloadAmount) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.ReloadAmount.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        moneyboxScheduleStatus = com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxScheduleStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        moneyboxTransferSettingsType = com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxTransferSettingsType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.TransferSettings value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("startDate");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getStartDate());
            writer.name("nextReloadDate");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getNextReloadDate());
            writer.name("recurrence");
            com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxScheduleRecurrence_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getRecurrence());
            writer.name("financialInstrumentId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getFinancialInstrumentId());
            writer.name("financialInstrumentName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getFinancialInstrumentName());
            writer.name("lastFourChars");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getLastFourChars());
            writer.name("reloadAmount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.ReloadAmount.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getReloadAmount());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxScheduleStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxTransferSettingsType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragmentImpl_ResponseAdapter$ReloadAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$ReloadAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$ReloadAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment$ReloadAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ReloadAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.ReloadAmount> {
        public static final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.ReloadAmount INSTANCE = new com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragmentImpl_ResponseAdapter.ReloadAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode"});
        public static final int $stable = 8;

        private ReloadAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.ReloadAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.ReloadAmount(str, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.ReloadAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
        }
    }
}
