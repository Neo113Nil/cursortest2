package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u001f!\"#$%&'()*+,-./0123456789:;<=> B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "Wallet", "OnlineEligibleFinancialInstruments", "Item", "OnBalance", "Available", "Amount", "OnBankAccount", "BankIssuer", "InstitutionImage", "OnCard", "Status", "Issuer", "CardArt", "PrimaryImage", "InstoreEligibleFinancialInstruments", "Item1", "OnBalance1", "Available1", "Amount1", "OnCard1", "Status1", "Issuer1", "CardArt1", "PrimaryImage1", "OnBankAccount1", "BankIssuer1", "InstitutionImage1", "PaymentPreference", "UsageContextDimension"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GetEligiblePaymentMethodsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "9969f777dc906985a4cf913fa7ef5b3c6733d14a2bbbfba3dc5e43bd1c0f7460";
    public static final java.lang.String OPERATION_NAME = "GetEligiblePaymentMethods";

    public final boolean equals(java.lang.Object other) {
        return other != null && other.getClass() == getClass();
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetEligiblePaymentMethodsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.GetEligiblePaymentMethodsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Wallet;", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, "", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PaymentPreference;", "paymentPreferences", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Wallet;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Wallet;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Wallet;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Wallet;", "getWallet", "Ljava/util/List;", "getPaymentPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference> paymentPreferences;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet wallet;

        public Data(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet wallet, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.wallet = wallet;
            this.paymentPreferences = list;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet getWallet() {
            return this.wallet;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference> getPaymentPreferences() {
            return this.paymentPreferences;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet wallet = this.wallet;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference> list = this.paymentPreferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(wallet=");
            sb.append(wallet);
            sb.append(", paymentPreferences=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet wallet = this.wallet;
            return ((wallet == null ? 0 : wallet.hashCode()) * 31) + this.paymentPreferences.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data data = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.wallet, data.wallet) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentPreferences, data.paymentPreferences);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet wallet, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference> paymentPreferences) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPreferences, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data(wallet, paymentPreferences);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference> component2() {
            return this.paymentPreferences;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet getWallet() {
            return this.wallet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data data, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet wallet, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                wallet = data.wallet;
            }
            if ((i & 2) != 0) {
                list = data.paymentPreferences;
            }
            return data.copy(wallet, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Wallet;", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnlineEligibleFinancialInstruments;", "onlineEligibleFinancialInstruments", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$InstoreEligibleFinancialInstruments;", "instoreEligibleFinancialInstruments", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnlineEligibleFinancialInstruments;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$InstoreEligibleFinancialInstruments;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnlineEligibleFinancialInstruments;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$InstoreEligibleFinancialInstruments;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnlineEligibleFinancialInstruments;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$InstoreEligibleFinancialInstruments;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Wallet;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnlineEligibleFinancialInstruments;", "getOnlineEligibleFinancialInstruments", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$InstoreEligibleFinancialInstruments;", "getInstoreEligibleFinancialInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Wallet {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments instoreEligibleFinancialInstruments;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments onlineEligibleFinancialInstruments;

        public Wallet(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments onlineEligibleFinancialInstruments, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments instoreEligibleFinancialInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineEligibleFinancialInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreEligibleFinancialInstruments, "");
            this.onlineEligibleFinancialInstruments = onlineEligibleFinancialInstruments;
            this.instoreEligibleFinancialInstruments = instoreEligibleFinancialInstruments;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments getOnlineEligibleFinancialInstruments() {
            return this.onlineEligibleFinancialInstruments;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments getInstoreEligibleFinancialInstruments() {
            return this.instoreEligibleFinancialInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments onlineEligibleFinancialInstruments = this.onlineEligibleFinancialInstruments;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments instoreEligibleFinancialInstruments = this.instoreEligibleFinancialInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wallet(onlineEligibleFinancialInstruments=");
            sb.append(onlineEligibleFinancialInstruments);
            sb.append(", instoreEligibleFinancialInstruments=");
            sb.append(instoreEligibleFinancialInstruments);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.onlineEligibleFinancialInstruments.hashCode() * 31) + this.instoreEligibleFinancialInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet wallet = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.onlineEligibleFinancialInstruments, wallet.onlineEligibleFinancialInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.instoreEligibleFinancialInstruments, wallet.instoreEligibleFinancialInstruments);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet copy(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments onlineEligibleFinancialInstruments, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments instoreEligibleFinancialInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineEligibleFinancialInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instoreEligibleFinancialInstruments, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet(onlineEligibleFinancialInstruments, instoreEligibleFinancialInstruments);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments getInstoreEligibleFinancialInstruments() {
            return this.instoreEligibleFinancialInstruments;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments getOnlineEligibleFinancialInstruments() {
            return this.onlineEligibleFinancialInstruments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet wallet, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments onlineEligibleFinancialInstruments, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments instoreEligibleFinancialInstruments, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                onlineEligibleFinancialInstruments = wallet.onlineEligibleFinancialInstruments;
            }
            if ((i & 2) != 0) {
                instoreEligibleFinancialInstruments = wallet.instoreEligibleFinancialInstruments;
            }
            return wallet.copy(onlineEligibleFinancialInstruments, instoreEligibleFinancialInstruments);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnlineEligibleFinancialInstruments;", "", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnlineEligibleFinancialInstruments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnlineEligibleFinancialInstruments {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item> items;

        public OnlineEligibleFinancialInstruments(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnlineEligibleFinancialInstruments(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments) other).items);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments copy(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments(items);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments onlineEligibleFinancialInstruments, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onlineEligibleFinancialInstruments.items;
            }
            return onlineEligibleFinancialInstruments.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Item;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance;", "onBalance", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount;", "onBankAccount", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard;", "onCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance;", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount;", "component4", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance;", "getOnBalance", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount;", "getOnBankAccount", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard;", "getOnCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance onBalance;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount onBankAccount;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard onCard;

        public Item(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance onBalance, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount onBankAccount, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBalance = onBalance;
            this.onBankAccount = onBankAccount;
            this.onCard = onCard;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance getOnBalance() {
            return this.onBalance;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard getOnCard() {
            return this.onCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance onBalance = this.onBalance;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount onBankAccount = this.onBankAccount;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard onCard = this.onCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", onBalance=");
            sb.append(onBalance);
            sb.append(", onBankAccount=");
            sb.append(onBankAccount);
            sb.append(", onCard=");
            sb.append(onCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance onBalance = this.onBalance;
            int hashCode2 = onBalance == null ? 0 : onBalance.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount onBankAccount = this.onBankAccount;
            int hashCode3 = onBankAccount == null ? 0 : onBankAccount.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard onCard = this.onCard;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onCard != null ? onCard.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item item = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBalance, item.onBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBankAccount, item.onBankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCard, item.onCard);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance onBalance, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount onBankAccount, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item(__typename, onBalance, onBankAccount, onCard);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard getOnCard() {
            return this.onCard;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance getOnBalance() {
            return this.onBalance;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item item, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance onBalance, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount onBankAccount, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard onCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                onBalance = item.onBalance;
            }
            if ((i & 4) != 0) {
                onBankAccount = item.onBankAccount;
            }
            if ((i & 8) != 0) {
                onCard = item.onCard;
            }
            return item.copy(str, onBalance, onBankAccount, onCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance;", "", "", "id", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available;", "getAvailable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBalance {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available available;
        private final java.lang.String id;

        public OnBalance(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available available) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(available, "");
            this.id = str;
            this.available = available;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available getAvailable() {
            return this.available;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available available = this.available;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBalance(id=");
            sb.append(str);
            sb.append(", available=");
            sb.append(available);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.available.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance onBalance = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onBalance.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.available, onBalance.available);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance copy(java.lang.String id, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available available) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(available, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance(id, available);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available getAvailable() {
            return this.available;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance onBalance, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available available, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBalance.id;
            }
            if ((i & 2) != 0) {
                available = onBalance.available;
            }
            return onBalance.copy(str, available);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available;", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount;", "amount", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Available {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount amount;

        public Available(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            this.amount = amount;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount amount = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Available(amount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available) other).amount);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available copy(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available available, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount amount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount = available.amount;
            }
            return available.copy(amount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Amount(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount amount = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount amount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount.value;
            }
            return amount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JV\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount;", "", "", "id", "lastNChars", "nickname", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer;", "bankIssuer", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$InstitutionImage;", "institutionImages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "component5", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "getNickname", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer;", "getBankIssuer", "Ljava/util/List;", "getInstitutionImages"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBankAccount {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer bankIssuer;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage> institutionImages;
        private final java.lang.String lastNChars;
        private final java.lang.String nickname;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        public OnBankAccount(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer bankIssuer, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankIssuer, "");
            this.id = str;
            this.lastNChars = str2;
            this.nickname = str3;
            this.type = bankAccountType;
            this.bankIssuer = bankIssuer;
            this.institutionImages = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String getNickname() {
            return this.nickname;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer getBankIssuer() {
            return this.bankIssuer;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage> getInstitutionImages() {
            return this.institutionImages;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            java.lang.String str3 = this.nickname;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer bankIssuer = this.bankIssuer;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage> list = this.institutionImages;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBankAccount(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", nickname=");
            sb.append(str3);
            sb.append(", type=");
            sb.append(bankAccountType);
            sb.append(", bankIssuer=");
            sb.append(bankIssuer);
            sb.append(", institutionImages=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            java.lang.String str = this.nickname;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int hashCode4 = this.type.hashCode();
            int hashCode5 = this.bankIssuer.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage> list = this.institutionImages;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount onBankAccount = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onBankAccount.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, onBankAccount.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickname, onBankAccount.nickname) && this.type == onBankAccount.type && kotlin.jvm.internal.Intrinsics.areEqual(this.bankIssuer, onBankAccount.bankIssuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionImages, onBankAccount.institutionImages);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount copy(java.lang.String id, java.lang.String lastNChars, java.lang.String nickname, com.paypal.oslo.api.graphql.schema.type.BankAccountType type, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer bankIssuer, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage> institutionImages) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankIssuer, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount(id, lastNChars, nickname, type, bankIssuer, institutionImages);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage> component6() {
            return this.institutionImages;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer getBankIssuer() {
            return this.bankIssuer;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNickname() {
            return this.nickname;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount onBankAccount, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer bankIssuer, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBankAccount.id;
            }
            if ((i & 2) != 0) {
                str2 = onBankAccount.lastNChars;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = onBankAccount.nickname;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                bankAccountType = onBankAccount.type;
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType2 = bankAccountType;
            if ((i & 16) != 0) {
                bankIssuer = onBankAccount.bankIssuer;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer bankIssuer2 = bankIssuer;
            if ((i & 32) != 0) {
                list = onBankAccount.institutionImages;
            }
            return onBankAccount.copy(str, str4, str5, bankAccountType2, bankIssuer2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankIssuer {
        public static final int $stable = 0;
        private final java.lang.String name;

        public BankIssuer(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankIssuer(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer) other).name);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer bankIssuer, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bankIssuer.name;
            }
            return bankIssuer.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$InstitutionImage;", "", "url", "Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "category", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$InstitutionImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUrl", "Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "getCategory"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InstitutionImage {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory category;
        private final java.lang.Object url;

        public InstitutionImage(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(institutionImageCategory, "");
            this.url = obj;
            this.category = institutionImageCategory;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory getCategory() {
            return this.category;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory = this.category;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InstitutionImage(url=");
            sb.append(obj);
            sb.append(", category=");
            sb.append(institutionImageCategory);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.url;
            return ((obj == null ? 0 : obj.hashCode()) * 31) + this.category.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage institutionImage = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, institutionImage.url) && this.category == institutionImage.category;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage copy(java.lang.Object url, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory category) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage(url, category);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory getCategory() {
            return this.category;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage institutionImage, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = institutionImage.url;
            }
            if ((i & 2) != 0) {
                institutionImageCategory = institutionImage.category;
            }
            return institutionImage.copy(obj, institutionImageCategory);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"Jv\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "brand", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "productClass", "nickName", "expirationDate", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status;", "status", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer;", "issuer", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt;", "cardArt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "component5", "component6", "()Ljava/lang/Object;", "component7", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status;", "component8", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer;", "component9", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "getBrand", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "getProductClass", "getNickName", "Ljava/lang/Object;", "getExpirationDate", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status;", "getStatus", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer;", "getIssuer", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt;", "getCardArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCard {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.CardBrand brand;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt cardArt;
        private final java.lang.Object expirationDate;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer issuer;
        private final java.lang.String lastNChars;
        private final java.lang.String nickName;
        private final com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status status;

        public OnCard(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand, com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass, java.lang.String str3, java.lang.Object obj, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status status, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer issuer, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt cardArt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardBrand, "");
            this.id = str;
            this.lastNChars = str2;
            this.brand = cardBrand;
            this.productClass = cardProductClass;
            this.nickName = str3;
            this.expirationDate = obj;
            this.status = status;
            this.issuer = issuer;
            this.cardArt = cardArt;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass getProductClass() {
            return this.productClass;
        }

        public final java.lang.String getNickName() {
            return this.nickName;
        }

        public final java.lang.Object getExpirationDate() {
            return this.expirationDate;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer getIssuer() {
            return this.issuer;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt getCardArt() {
            return this.cardArt;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand = this.brand;
            com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = this.productClass;
            java.lang.String str3 = this.nickName;
            java.lang.Object obj = this.expirationDate;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status status = this.status;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer issuer = this.issuer;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt cardArt = this.cardArt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCard(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", brand=");
            sb.append(cardBrand);
            sb.append(", productClass=");
            sb.append(cardProductClass);
            sb.append(", nickName=");
            sb.append(str3);
            sb.append(", expirationDate=");
            sb.append(obj);
            sb.append(", status=");
            sb.append(status);
            sb.append(", issuer=");
            sb.append(issuer);
            sb.append(", cardArt=");
            sb.append(cardArt);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            int hashCode3 = this.brand.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = this.productClass;
            int hashCode4 = cardProductClass == null ? 0 : cardProductClass.hashCode();
            java.lang.String str = this.nickName;
            int hashCode5 = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.expirationDate;
            int hashCode6 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status status = this.status;
            int hashCode7 = status == null ? 0 : status.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer issuer = this.issuer;
            int hashCode8 = issuer == null ? 0 : issuer.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt cardArt = this.cardArt;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (cardArt != null ? cardArt.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard onCard = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onCard.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, onCard.lastNChars) && this.brand == onCard.brand && this.productClass == onCard.productClass && kotlin.jvm.internal.Intrinsics.areEqual(this.nickName, onCard.nickName) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, onCard.expirationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, onCard.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, onCard.issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArt, onCard.cardArt);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.api.graphql.schema.type.CardBrand brand, com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass, java.lang.String nickName, java.lang.Object expirationDate, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status status, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer issuer, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt cardArt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard(id, lastNChars, brand, productClass, nickName, expirationDate, status, issuer, cardArt);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt getCardArt() {
            return this.cardArt;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer getIssuer() {
            return this.issuer;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status getStatus() {
            return this.status;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getExpirationDate() {
            return this.expirationDate;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getNickName() {
            return this.nickName;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass getProductClass() {
            return this.productClass;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", "getValue", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 0;
        private final java.lang.String reason;
        private final com.paypal.oslo.api.graphql.schema.type.CardStatus value;

        public Status(com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardStatus, "");
            this.value = cardStatus;
            this.reason = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardStatus getValue() {
            return this.value;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus = this.value;
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Status(value=");
            sb.append(cardStatus);
            sb.append(", reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.value.hashCode();
            java.lang.String str = this.reason;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status status = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status) other;
            return this.value == status.value && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, status.reason);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status copy(com.paypal.oslo.api.graphql.schema.type.CardStatus value, java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status(value, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardStatus getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status status, com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardStatus = status.value;
            }
            if ((i & 2) != 0) {
                str = status.reason;
            }
            return status.copy(cardStatus, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer;", "", "", "name", "issuerProductDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getIssuerProductDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer {
        public static final int $stable = 0;
        private final java.lang.String issuerProductDescription;
        private final java.lang.String name;

        public Issuer(java.lang.String str, java.lang.String str2) {
            this.name = str;
            this.issuerProductDescription = str2;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getIssuerProductDescription() {
            return this.issuerProductDescription;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.issuerProductDescription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer(name=");
            sb.append(str);
            sb.append(", issuerProductDescription=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.name;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.issuerProductDescription;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer issuer = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, issuer.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerProductDescription, issuer.issuerProductDescription);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer copy(java.lang.String name2, java.lang.String issuerProductDescription) {
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer(name2, issuerProductDescription);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getIssuerProductDescription() {
            return this.issuerProductDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer issuer, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuer.name;
            }
            if ((i & 2) != 0) {
                str2 = issuer.issuerProductDescription;
            }
            return issuer.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt;", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage;", "primaryImage", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage;", "getPrimaryImage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardArt {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage primaryImage;

        public CardArt(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage primaryImage) {
            this.primaryImage = primaryImage;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage getPrimaryImage() {
            return this.primaryImage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage primaryImage = this.primaryImage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardArt(primaryImage=");
            sb.append(primaryImage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage primaryImage = this.primaryImage;
            if (primaryImage == null) {
                return 0;
            }
            return primaryImage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImage, ((com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt) other).primaryImage);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt copy(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage primaryImage) {
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt(primaryImage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage getPrimaryImage() {
            return this.primaryImage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt cardArt, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage primaryImage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                primaryImage = cardArt.primaryImage;
            }
            return cardArt.copy(primaryImage);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage;", "", "baseCdnLinkPath", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getBaseCdnLinkPath"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryImage {
        public static final int $stable = 8;
        private final java.lang.Object baseCdnLinkPath;

        public PrimaryImage(java.lang.Object obj) {
            this.baseCdnLinkPath = obj;
        }

        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.baseCdnLinkPath;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryImage(baseCdnLinkPath=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.baseCdnLinkPath;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.baseCdnLinkPath, ((com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage) other).baseCdnLinkPath);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage copy(java.lang.Object baseCdnLinkPath) {
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage(baseCdnLinkPath);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage primaryImage, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = primaryImage.baseCdnLinkPath;
            }
            return primaryImage.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$InstoreEligibleFinancialInstruments;", "", "", "useBalanceFirst", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Item1;", "items", "<init>", "(ZLjava/util/List;)V", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$InstoreEligibleFinancialInstruments;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getUseBalanceFirst", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InstoreEligibleFinancialInstruments {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1> items;
        private final boolean useBalanceFirst;

        public InstoreEligibleFinancialInstruments(boolean z, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.useBalanceFirst = z;
            this.items = list;
        }

        public final boolean getUseBalanceFirst() {
            return this.useBalanceFirst;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            boolean z = this.useBalanceFirst;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InstoreEligibleFinancialInstruments(useBalanceFirst=");
            sb.append(z);
            sb.append(", items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.useBalanceFirst) * 31) + this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments instoreEligibleFinancialInstruments = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments) other;
            return this.useBalanceFirst == instoreEligibleFinancialInstruments.useBalanceFirst && kotlin.jvm.internal.Intrinsics.areEqual(this.items, instoreEligibleFinancialInstruments.items);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments copy(boolean useBalanceFirst, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments(useBalanceFirst, items);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1> component2() {
            return this.items;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getUseBalanceFirst() {
            return this.useBalanceFirst;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments instoreEligibleFinancialInstruments, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = instoreEligibleFinancialInstruments.useBalanceFirst;
            }
            if ((i & 2) != 0) {
                list = instoreEligibleFinancialInstruments.items;
            }
            return instoreEligibleFinancialInstruments.copy(z, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Item1;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance1;", "onBalance", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard1;", "onCard", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount1;", "onBankAccount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance1;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard1;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance1;", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard1;", "component4", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance1;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard1;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount1;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Item1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance1;", "getOnBalance", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard1;", "getOnCard", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount1;", "getOnBankAccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1 onBalance;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1 onBankAccount;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1 onCard;

        public Item1(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1 onBalance1, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1 onCard1, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1 onBankAccount1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBalance = onBalance1;
            this.onCard = onCard1;
            this.onBankAccount = onBankAccount1;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1 getOnBalance() {
            return this.onBalance;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1 getOnCard() {
            return this.onCard;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1 getOnBankAccount() {
            return this.onBankAccount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1 onBalance1 = this.onBalance;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1 onCard1 = this.onCard;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1 onBankAccount1 = this.onBankAccount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item1(__typename=");
            sb.append(str);
            sb.append(", onBalance=");
            sb.append(onBalance1);
            sb.append(", onCard=");
            sb.append(onCard1);
            sb.append(", onBankAccount=");
            sb.append(onBankAccount1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1 onBalance1 = this.onBalance;
            int hashCode2 = onBalance1 == null ? 0 : onBalance1.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1 onCard1 = this.onCard;
            int hashCode3 = onCard1 == null ? 0 : onCard1.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1 onBankAccount1 = this.onBankAccount;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onBankAccount1 != null ? onBankAccount1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1 item1 = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBalance, item1.onBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCard, item1.onCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBankAccount, item1.onBankAccount);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1 copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1 onBalance, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1 onCard, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1 onBankAccount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1(__typename, onBalance, onCard, onBankAccount);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1 getOnBankAccount() {
            return this.onBankAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1 getOnCard() {
            return this.onCard;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1 getOnBalance() {
            return this.onBalance;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1 item1, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1 onBalance1, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1 onCard1, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1 onBankAccount1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item1.__typename;
            }
            if ((i & 2) != 0) {
                onBalance1 = item1.onBalance;
            }
            if ((i & 4) != 0) {
                onCard1 = item1.onCard;
            }
            if ((i & 8) != 0) {
                onBankAccount1 = item1.onBankAccount;
            }
            return item1.copy(str, onBalance1, onCard1, onBankAccount1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance1;", "", "", "id", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available1;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available1;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBalance1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available1;", "getAvailable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBalance1 {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available1 available;
        private final java.lang.String id;

        public OnBalance1(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available1 available1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(available1, "");
            this.id = str;
            this.available = available1;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available1 getAvailable() {
            return this.available;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available1 available1 = this.available;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBalance1(id=");
            sb.append(str);
            sb.append(", available=");
            sb.append(available1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.available.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1 onBalance1 = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onBalance1.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.available, onBalance1.available);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1 copy(java.lang.String id, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available1 available) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(available, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1(id, available);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available1 getAvailable() {
            return this.available;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1 onBalance1, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available1 available1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBalance1.id;
            }
            if ((i & 2) != 0) {
                available1 = onBalance1.available;
            }
            return onBalance1.copy(str, available1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available1;", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount1;", "amount", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount1;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount1;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount1;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Available1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount1;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Available1 {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1 amount;

        public Available1(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1 amount1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount1, "");
            this.amount = amount1;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1 getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1 amount1 = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Available1(amount=");
            sb.append(amount1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available1) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available1) other).amount);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available1 copy(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1 amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available1(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1 getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Available1 available1, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1 amount1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount1 = available1.amount;
            }
            return available1.copy(amount1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount1;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Amount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount1 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Amount1(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount1(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1 amount1 = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount1.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount1.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Amount1 amount1, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount1.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount1.value;
            }
            return amount1.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJj\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard1;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "brand", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "productClass", "nickName", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status1;", "status", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer1;", "issuer", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt1;", "cardArt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status1;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer1;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "component5", "component6", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status1;", "component7", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer1;", "component8", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt1;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status1;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer1;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt1;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnCard1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "getBrand", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "getProductClass", "getNickName", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status1;", "getStatus", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer1;", "getIssuer", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt1;", "getCardArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCard1 {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.CardBrand brand;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1 cardArt;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1 issuer;
        private final java.lang.String lastNChars;
        private final java.lang.String nickName;
        private final com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1 status;

        public OnCard1(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand, com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass, java.lang.String str3, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1 status1, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1 issuer1, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1 cardArt1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardBrand, "");
            this.id = str;
            this.lastNChars = str2;
            this.brand = cardBrand;
            this.productClass = cardProductClass;
            this.nickName = str3;
            this.status = status1;
            this.issuer = issuer1;
            this.cardArt = cardArt1;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass getProductClass() {
            return this.productClass;
        }

        public final java.lang.String getNickName() {
            return this.nickName;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1 getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1 getIssuer() {
            return this.issuer;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1 getCardArt() {
            return this.cardArt;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand = this.brand;
            com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = this.productClass;
            java.lang.String str3 = this.nickName;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1 status1 = this.status;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1 issuer1 = this.issuer;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1 cardArt1 = this.cardArt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCard1(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", brand=");
            sb.append(cardBrand);
            sb.append(", productClass=");
            sb.append(cardProductClass);
            sb.append(", nickName=");
            sb.append(str3);
            sb.append(", status=");
            sb.append(status1);
            sb.append(", issuer=");
            sb.append(issuer1);
            sb.append(", cardArt=");
            sb.append(cardArt1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            int hashCode3 = this.brand.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = this.productClass;
            int hashCode4 = cardProductClass == null ? 0 : cardProductClass.hashCode();
            java.lang.String str = this.nickName;
            int hashCode5 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1 status1 = this.status;
            int hashCode6 = status1 == null ? 0 : status1.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1 issuer1 = this.issuer;
            int hashCode7 = issuer1 == null ? 0 : issuer1.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1 cardArt1 = this.cardArt;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (cardArt1 != null ? cardArt1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1 onCard1 = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onCard1.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, onCard1.lastNChars) && this.brand == onCard1.brand && this.productClass == onCard1.productClass && kotlin.jvm.internal.Intrinsics.areEqual(this.nickName, onCard1.nickName) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, onCard1.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, onCard1.issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArt, onCard1.cardArt);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1 copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.api.graphql.schema.type.CardBrand brand, com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass, java.lang.String nickName, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1 status, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1 issuer, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1 cardArt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1(id, lastNChars, brand, productClass, nickName, status, issuer, cardArt);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1 getCardArt() {
            return this.cardArt;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1 getIssuer() {
            return this.issuer;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1 getStatus() {
            return this.status;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getNickName() {
            return this.nickName;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass getProductClass() {
            return this.productClass;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status1;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Status1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", "getValue", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Status1 {
        public static final int $stable = 0;
        private final java.lang.String reason;
        private final com.paypal.oslo.api.graphql.schema.type.CardStatus value;

        public Status1(com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardStatus, "");
            this.value = cardStatus;
            this.reason = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardStatus getValue() {
            return this.value;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus = this.value;
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Status1(value=");
            sb.append(cardStatus);
            sb.append(", reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.value.hashCode();
            java.lang.String str = this.reason;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1 status1 = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1) other;
            return this.value == status1.value && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, status1.reason);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1 copy(com.paypal.oslo.api.graphql.schema.type.CardStatus value, java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1(value, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardStatus getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Status1 status1, com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardStatus = status1.value;
            }
            if ((i & 2) != 0) {
                str = status1.reason;
            }
            return status1.copy(cardStatus, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer1;", "", "", "name", "issuerProductDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Issuer1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getIssuerProductDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer1 {
        public static final int $stable = 0;
        private final java.lang.String issuerProductDescription;
        private final java.lang.String name;

        public Issuer1(java.lang.String str, java.lang.String str2) {
            this.name = str;
            this.issuerProductDescription = str2;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getIssuerProductDescription() {
            return this.issuerProductDescription;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.issuerProductDescription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer1(name=");
            sb.append(str);
            sb.append(", issuerProductDescription=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.name;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.issuerProductDescription;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1 issuer1 = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, issuer1.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerProductDescription, issuer1.issuerProductDescription);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1 copy(java.lang.String name2, java.lang.String issuerProductDescription) {
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1(name2, issuerProductDescription);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getIssuerProductDescription() {
            return this.issuerProductDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1 issuer1, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuer1.name;
            }
            if ((i & 2) != 0) {
                str2 = issuer1.issuerProductDescription;
            }
            return issuer1.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt1;", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage1;", "primaryImage", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage1;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage1;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage1;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$CardArt1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage1;", "getPrimaryImage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardArt1 {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1 primaryImage;

        public CardArt1(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1 primaryImage1) {
            this.primaryImage = primaryImage1;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1 getPrimaryImage() {
            return this.primaryImage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1 primaryImage1 = this.primaryImage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardArt1(primaryImage=");
            sb.append(primaryImage1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1 primaryImage1 = this.primaryImage;
            if (primaryImage1 == null) {
                return 0;
            }
            return primaryImage1.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImage, ((com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1) other).primaryImage);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1 copy(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1 primaryImage) {
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1(primaryImage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1 getPrimaryImage() {
            return this.primaryImage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1 cardArt1, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1 primaryImage1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                primaryImage1 = cardArt1.primaryImage;
            }
            return cardArt1.copy(primaryImage1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage1;", "", "baseCdnLinkPath", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PrimaryImage1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getBaseCdnLinkPath"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryImage1 {
        public static final int $stable = 8;
        private final java.lang.Object baseCdnLinkPath;

        public PrimaryImage1(java.lang.Object obj) {
            this.baseCdnLinkPath = obj;
        }

        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.baseCdnLinkPath;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryImage1(baseCdnLinkPath=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.baseCdnLinkPath;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1) && kotlin.jvm.internal.Intrinsics.areEqual(this.baseCdnLinkPath, ((com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1) other).baseCdnLinkPath);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1 copy(java.lang.Object baseCdnLinkPath) {
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1(baseCdnLinkPath);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1 primaryImage1, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = primaryImage1.baseCdnLinkPath;
            }
            return primaryImage1.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JV\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount1;", "", "", "id", "lastNChars", "nickname", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer1;", "bankIssuer", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$InstitutionImage1;", "institutionImages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer1;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "component5", "()Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer1;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer1;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$OnBankAccount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "getNickname", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer1;", "getBankIssuer", "Ljava/util/List;", "getInstitutionImages"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBankAccount1 {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1 bankIssuer;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1> institutionImages;
        private final java.lang.String lastNChars;
        private final java.lang.String nickname;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        public OnBankAccount1(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1 bankIssuer1, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankIssuer1, "");
            this.id = str;
            this.lastNChars = str2;
            this.nickname = str3;
            this.type = bankAccountType;
            this.bankIssuer = bankIssuer1;
            this.institutionImages = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String getNickname() {
            return this.nickname;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1 getBankIssuer() {
            return this.bankIssuer;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1> getInstitutionImages() {
            return this.institutionImages;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            java.lang.String str3 = this.nickname;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1 bankIssuer1 = this.bankIssuer;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1> list = this.institutionImages;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBankAccount1(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", nickname=");
            sb.append(str3);
            sb.append(", type=");
            sb.append(bankAccountType);
            sb.append(", bankIssuer=");
            sb.append(bankIssuer1);
            sb.append(", institutionImages=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            java.lang.String str = this.nickname;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int hashCode4 = this.type.hashCode();
            int hashCode5 = this.bankIssuer.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1> list = this.institutionImages;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1 onBankAccount1 = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onBankAccount1.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, onBankAccount1.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickname, onBankAccount1.nickname) && this.type == onBankAccount1.type && kotlin.jvm.internal.Intrinsics.areEqual(this.bankIssuer, onBankAccount1.bankIssuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionImages, onBankAccount1.institutionImages);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1 copy(java.lang.String id, java.lang.String lastNChars, java.lang.String nickname, com.paypal.oslo.api.graphql.schema.type.BankAccountType type, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1 bankIssuer, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1> institutionImages) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankIssuer, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1(id, lastNChars, nickname, type, bankIssuer, institutionImages);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1> component6() {
            return this.institutionImages;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1 getBankIssuer() {
            return this.bankIssuer;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNickname() {
            return this.nickname;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1 onBankAccount1, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1 bankIssuer1, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBankAccount1.id;
            }
            if ((i & 2) != 0) {
                str2 = onBankAccount1.lastNChars;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = onBankAccount1.nickname;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                bankAccountType = onBankAccount1.type;
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType2 = bankAccountType;
            if ((i & 16) != 0) {
                bankIssuer1 = onBankAccount1.bankIssuer;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1 bankIssuer12 = bankIssuer1;
            if ((i & 32) != 0) {
                list = onBankAccount1.institutionImages;
            }
            return onBankAccount1.copy(str, str4, str5, bankAccountType2, bankIssuer12, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer1;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$BankIssuer1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankIssuer1 {
        public static final int $stable = 0;
        private final java.lang.String name;

        public BankIssuer1(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankIssuer1(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1) other).name);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1 copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.BankIssuer1 bankIssuer1, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bankIssuer1.name;
            }
            return bankIssuer1.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$InstitutionImage1;", "", "url", "Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "category", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$InstitutionImage1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUrl", "Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "getCategory"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InstitutionImage1 {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory category;
        private final java.lang.Object url;

        public InstitutionImage1(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(institutionImageCategory, "");
            this.url = obj;
            this.category = institutionImageCategory;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory getCategory() {
            return this.category;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory = this.category;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InstitutionImage1(url=");
            sb.append(obj);
            sb.append(", category=");
            sb.append(institutionImageCategory);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.url;
            return ((obj == null ? 0 : obj.hashCode()) * 31) + this.category.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1 institutionImage1 = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, institutionImage1.url) && this.category == institutionImage1.category;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1 copy(java.lang.Object url, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory category) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1(url, category);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory getCategory() {
            return this.category;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1 institutionImage1, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = institutionImage1.url;
            }
            if ((i & 2) != 0) {
                institutionImageCategory = institutionImage1.category;
            }
            return institutionImage1.copy(obj, institutionImageCategory);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J^\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0015R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b)\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PaymentPreference;", "", "", "subjectName", "subjectValue", "preferenceName", "", "preferenceValues", "Lcom/paypal/oslo/api/graphql/schema/type/PreferenceStatus;", "status", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$UsageContextDimension;", "usageContextDimensions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PreferenceStatus;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/PreferenceStatus;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PreferenceStatus;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$PaymentPreference;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSubjectName", "getSubjectValue", "getPreferenceName", "Ljava/util/List;", "getPreferenceValues", "Lcom/paypal/oslo/api/graphql/schema/type/PreferenceStatus;", "getStatus", "getUsageContextDimensions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentPreference {
        public static final int $stable = 8;
        private final java.lang.String preferenceName;
        private final java.util.List<java.lang.String> preferenceValues;
        private final com.paypal.oslo.api.graphql.schema.type.PreferenceStatus status;
        private final java.lang.String subjectName;
        private final java.lang.String subjectValue;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension> usageContextDimensions;

        public PaymentPreference(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, com.paypal.oslo.api.graphql.schema.type.PreferenceStatus preferenceStatus, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.subjectName = str;
            this.subjectValue = str2;
            this.preferenceName = str3;
            this.preferenceValues = list;
            this.status = preferenceStatus;
            this.usageContextDimensions = list2;
        }

        public final java.lang.String getSubjectName() {
            return this.subjectName;
        }

        public final java.lang.String getSubjectValue() {
            return this.subjectValue;
        }

        public final java.lang.String getPreferenceName() {
            return this.preferenceName;
        }

        public final java.util.List<java.lang.String> getPreferenceValues() {
            return this.preferenceValues;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PreferenceStatus getStatus() {
            return this.status;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension> getUsageContextDimensions() {
            return this.usageContextDimensions;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.subjectName;
            java.lang.String str2 = this.subjectValue;
            java.lang.String str3 = this.preferenceName;
            java.util.List<java.lang.String> list = this.preferenceValues;
            com.paypal.oslo.api.graphql.schema.type.PreferenceStatus preferenceStatus = this.status;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension> list2 = this.usageContextDimensions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentPreference(subjectName=");
            sb.append(str);
            sb.append(", subjectValue=");
            sb.append(str2);
            sb.append(", preferenceName=");
            sb.append(str3);
            sb.append(", preferenceValues=");
            sb.append(list);
            sb.append(", status=");
            sb.append(preferenceStatus);
            sb.append(", usageContextDimensions=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.subjectName.hashCode();
            java.lang.String str = this.subjectValue;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.preferenceName.hashCode();
            int hashCode4 = this.preferenceValues.hashCode();
            com.paypal.oslo.api.graphql.schema.type.PreferenceStatus preferenceStatus = this.status;
            int hashCode5 = preferenceStatus == null ? 0 : preferenceStatus.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension> list = this.usageContextDimensions;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference paymentPreference = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.subjectName, paymentPreference.subjectName) && kotlin.jvm.internal.Intrinsics.areEqual(this.subjectValue, paymentPreference.subjectValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferenceName, paymentPreference.preferenceName) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferenceValues, paymentPreference.preferenceValues) && this.status == paymentPreference.status && kotlin.jvm.internal.Intrinsics.areEqual(this.usageContextDimensions, paymentPreference.usageContextDimensions);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference copy(java.lang.String subjectName, java.lang.String subjectValue, java.lang.String preferenceName, java.util.List<java.lang.String> preferenceValues, com.paypal.oslo.api.graphql.schema.type.PreferenceStatus status, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension> usageContextDimensions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subjectName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferenceName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferenceValues, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference(subjectName, subjectValue, preferenceName, preferenceValues, status, usageContextDimensions);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension> component6() {
            return this.usageContextDimensions;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PreferenceStatus getStatus() {
            return this.status;
        }

        public final java.util.List<java.lang.String> component4() {
            return this.preferenceValues;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPreferenceName() {
            return this.preferenceName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSubjectValue() {
            return this.subjectValue;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSubjectName() {
            return this.subjectName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference paymentPreference, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, com.paypal.oslo.api.graphql.schema.type.PreferenceStatus preferenceStatus, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentPreference.subjectName;
            }
            if ((i & 2) != 0) {
                str2 = paymentPreference.subjectValue;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = paymentPreference.preferenceName;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                list = paymentPreference.preferenceValues;
            }
            java.util.List list3 = list;
            if ((i & 16) != 0) {
                preferenceStatus = paymentPreference.status;
            }
            com.paypal.oslo.api.graphql.schema.type.PreferenceStatus preferenceStatus2 = preferenceStatus;
            if ((i & 32) != 0) {
                list2 = paymentPreference.usageContextDimensions;
            }
            return paymentPreference.copy(str, str4, str5, list3, preferenceStatus2, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$UsageContextDimension;", "", "", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$UsageContextDimension;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UsageContextDimension {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final java.lang.String value;

        public UsageContextDimension(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.name = str;
            this.value = str2;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UsageContextDimension(name=");
            sb.append(str);
            sb.append(", value=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension usageContextDimension = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, usageContextDimension.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, usageContextDimension.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension copy(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension(name2, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension copy$default(com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension usageContextDimension, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = usageContextDimension.name;
            }
            if ((i & 2) != 0) {
                str2 = usageContextDimension.value;
            }
            return usageContextDimension.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetEligiblePaymentMethods { wallet { onlineEligibleFinancialInstruments { items { __typename ... on Balance { id available { amount { currencyCode value } } } ... on BankAccount { id lastNChars nickname type bankIssuer: issuer { name } institutionImages { url category } } ... on Card { id lastNChars brand productClass nickName expirationDate status { value reason } issuer { name issuerProductDescription } cardArt { primaryImage { baseCdnLinkPath } } } } } instoreEligibleFinancialInstruments { useBalanceFirst items { __typename ... on Balance { id available { amount { currencyCode value } } } ... on Card { id lastNChars brand productClass nickName status { value reason } issuer { name issuerProductDescription } cardArt { primaryImage { baseCdnLinkPath } } } ... on BankAccount { id lastNChars nickname type bankIssuer: issuer { name } institutionImages { url category } } } } } paymentPreferences { subjectName subjectValue preferenceName preferenceValues status usageContextDimensions { name value } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
    }
}
