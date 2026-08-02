package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0017!\"#$%&'()*+,-./0123456 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.OPERATION_NAME, com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.OPERATION_NAME, "PaymentTokenArt", androidx.exifinterface.media.ExifInterface.TAG_ORF_THUMBNAIL_IMAGE, "RemainingPaymentToken", "PaymentTokenArt1", "ThumbnailImage1", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "Issuer", "CardArt", "ThumbnailImage2", "RemainingCard", "Issuer1", "CardArt1", "ThumbnailImage3", "BankAccount", "Issuer2", "InstitutionImage", "RemainingBankAccount", "Issuer3", "InstitutionImage1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProvisionInstrumentsMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Companion(null);
    public static final java.lang.String OPERATION_ID = "27e42271b305008c32ed64835c9ab1d08a455cca79a55d2d761b42c851483271";
    public static final java.lang.String OPERATION_NAME = "ProvisionInstruments";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.ProvisionInstrumentsMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.ProvisionInstrumentsMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ProvisionInstruments;", "provisionInstruments", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ProvisionInstruments;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ProvisionInstruments;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ProvisionInstruments;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ProvisionInstruments;", "getProvisionInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments provisionInstruments;

        public Data(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments provisionInstruments) {
            this.provisionInstruments = provisionInstruments;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments getProvisionInstruments() {
            return this.provisionInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments provisionInstruments = this.provisionInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(provisionInstruments=");
            sb.append(provisionInstruments);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments provisionInstruments = this.provisionInstruments;
            if (provisionInstruments == null) {
                return 0;
            }
            return provisionInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.provisionInstruments, ((com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data) other).provisionInstruments);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data copy(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments provisionInstruments) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data(provisionInstruments);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments getProvisionInstruments() {
            return this.provisionInstruments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Data data, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments provisionInstruments, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                provisionInstruments = data.provisionInstruments;
            }
            return data.copy(provisionInstruments);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J|\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0012R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b'\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b(\u0010\u0012R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b)\u0010\u0012R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b*\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ProvisionInstruments;", "", "", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentToken;", "paymentTokens", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$RemainingPaymentToken;", "remainingPaymentTokens", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Card;", "cards", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$RemainingCard;", "remainingCards", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$BankAccount;", "bankAccounts", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$RemainingBankAccount;", "remainingBankAccounts", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ProvisionInstruments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPaymentTokens", "getRemainingPaymentTokens", "getCards", "getRemainingCards", "getBankAccounts", "getRemainingBankAccounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisionInstruments {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount> bankAccounts;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card> cards;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken> paymentTokens;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount> remainingBankAccounts;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard> remainingCards;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken> remainingPaymentTokens;

        public ProvisionInstruments(java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken> list, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken> list2, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card> list3, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard> list4, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount> list5, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount> list6) {
            this.paymentTokens = list;
            this.remainingPaymentTokens = list2;
            this.cards = list3;
            this.remainingCards = list4;
            this.bankAccounts = list5;
            this.remainingBankAccounts = list6;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken> getPaymentTokens() {
            return this.paymentTokens;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken> getRemainingPaymentTokens() {
            return this.remainingPaymentTokens;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card> getCards() {
            return this.cards;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard> getRemainingCards() {
            return this.remainingCards;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount> getBankAccounts() {
            return this.bankAccounts;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount> getRemainingBankAccounts() {
            return this.remainingBankAccounts;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken> list = this.paymentTokens;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken> list2 = this.remainingPaymentTokens;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card> list3 = this.cards;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard> list4 = this.remainingCards;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount> list5 = this.bankAccounts;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount> list6 = this.remainingBankAccounts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionInstruments(paymentTokens=");
            sb.append(list);
            sb.append(", remainingPaymentTokens=");
            sb.append(list2);
            sb.append(", cards=");
            sb.append(list3);
            sb.append(", remainingCards=");
            sb.append(list4);
            sb.append(", bankAccounts=");
            sb.append(list5);
            sb.append(", remainingBankAccounts=");
            sb.append(list6);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken> list = this.paymentTokens;
            int hashCode = list == null ? 0 : list.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken> list2 = this.remainingPaymentTokens;
            int hashCode2 = list2 == null ? 0 : list2.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card> list3 = this.cards;
            int hashCode3 = list3 == null ? 0 : list3.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard> list4 = this.remainingCards;
            int hashCode4 = list4 == null ? 0 : list4.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount> list5 = this.bankAccounts;
            int hashCode5 = list5 == null ? 0 : list5.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount> list6 = this.remainingBankAccounts;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list6 != null ? list6.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments provisionInstruments = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTokens, provisionInstruments.paymentTokens) && kotlin.jvm.internal.Intrinsics.areEqual(this.remainingPaymentTokens, provisionInstruments.remainingPaymentTokens) && kotlin.jvm.internal.Intrinsics.areEqual(this.cards, provisionInstruments.cards) && kotlin.jvm.internal.Intrinsics.areEqual(this.remainingCards, provisionInstruments.remainingCards) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccounts, provisionInstruments.bankAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.remainingBankAccounts, provisionInstruments.remainingBankAccounts);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments copy(java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken> paymentTokens, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken> remainingPaymentTokens, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card> cards, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard> remainingCards, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount> bankAccounts, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount> remainingBankAccounts) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments(paymentTokens, remainingPaymentTokens, cards, remainingCards, bankAccounts, remainingBankAccounts);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount> component6() {
            return this.remainingBankAccounts;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount> component5() {
            return this.bankAccounts;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard> component4() {
            return this.remainingCards;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card> component3() {
            return this.cards;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken> component2() {
            return this.remainingPaymentTokens;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken> component1() {
            return this.paymentTokens;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments provisionInstruments, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, java.util.List list6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = provisionInstruments.paymentTokens;
            }
            if ((i & 2) != 0) {
                list2 = provisionInstruments.remainingPaymentTokens;
            }
            java.util.List list7 = list2;
            if ((i & 4) != 0) {
                list3 = provisionInstruments.cards;
            }
            java.util.List list8 = list3;
            if ((i & 8) != 0) {
                list4 = provisionInstruments.remainingCards;
            }
            java.util.List list9 = list4;
            if ((i & 16) != 0) {
                list5 = provisionInstruments.bankAccounts;
            }
            java.util.List list10 = list5;
            if ((i & 32) != 0) {
                list6 = provisionInstruments.remainingBankAccounts;
            }
            return provisionInstruments.copy(list, list7, list8, list9, list10, list6);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentToken;", "", "", "id", "issuerDisplayName", "productDisplayName", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt;", "paymentTokenArt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentToken;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getIssuerDisplayName", "getProductDisplayName", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt;", "getPaymentTokenArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentToken {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.String issuerDisplayName;
        private final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt paymentTokenArt;
        private final java.lang.String productDisplayName;

        public PaymentToken(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt paymentTokenArt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.issuerDisplayName = str2;
            this.productDisplayName = str3;
            this.paymentTokenArt = paymentTokenArt;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getIssuerDisplayName() {
            return this.issuerDisplayName;
        }

        public final java.lang.String getProductDisplayName() {
            return this.productDisplayName;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt getPaymentTokenArt() {
            return this.paymentTokenArt;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.issuerDisplayName;
            java.lang.String str3 = this.productDisplayName;
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt paymentTokenArt = this.paymentTokenArt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentToken(id=");
            sb.append(str);
            sb.append(", issuerDisplayName=");
            sb.append(str2);
            sb.append(", productDisplayName=");
            sb.append(str3);
            sb.append(", paymentTokenArt=");
            sb.append(paymentTokenArt);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.issuerDisplayName;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.productDisplayName;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt paymentTokenArt = this.paymentTokenArt;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (paymentTokenArt != null ? paymentTokenArt.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken paymentToken = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, paymentToken.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerDisplayName, paymentToken.issuerDisplayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.productDisplayName, paymentToken.productDisplayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTokenArt, paymentToken.paymentTokenArt);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken copy(java.lang.String id, java.lang.String issuerDisplayName, java.lang.String productDisplayName, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt paymentTokenArt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken(id, issuerDisplayName, productDisplayName, paymentTokenArt);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt getPaymentTokenArt() {
            return this.paymentTokenArt;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getProductDisplayName() {
            return this.productDisplayName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getIssuerDisplayName() {
            return this.issuerDisplayName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken paymentToken, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt paymentTokenArt, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentToken.id;
            }
            if ((i & 2) != 0) {
                str2 = paymentToken.issuerDisplayName;
            }
            if ((i & 4) != 0) {
                str3 = paymentToken.productDisplayName;
            }
            if ((i & 8) != 0) {
                paymentTokenArt = paymentToken.paymentTokenArt;
            }
            return paymentToken.copy(str, str2, str3, paymentTokenArt);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt;", "", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage;", "thumbnailImage", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage;", "getThumbnailImage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentTokenArt {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage thumbnailImage;

        public PaymentTokenArt(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage thumbnailImage) {
            this.thumbnailImage = thumbnailImage;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage getThumbnailImage() {
            return this.thumbnailImage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage thumbnailImage = this.thumbnailImage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTokenArt(thumbnailImage=");
            sb.append(thumbnailImage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage thumbnailImage = this.thumbnailImage;
            if (thumbnailImage == null) {
                return 0;
            }
            return thumbnailImage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailImage, ((com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt) other).thumbnailImage);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt copy(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage thumbnailImage) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt(thumbnailImage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage getThumbnailImage() {
            return this.thumbnailImage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt paymentTokenArt, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage thumbnailImage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                thumbnailImage = paymentTokenArt.thumbnailImage;
            }
            return paymentTokenArt.copy(thumbnailImage);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage;", "", "baseCdnLinkPath", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getBaseCdnLinkPath", "Ljava/lang/String;", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ThumbnailImage {
        public static final int $stable = 8;
        private final java.lang.Object baseCdnLinkPath;
        private final java.lang.String mimeType;

        public ThumbnailImage(java.lang.Object obj, java.lang.String str) {
            this.baseCdnLinkPath = obj;
            this.mimeType = str;
        }

        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.baseCdnLinkPath;
            java.lang.String str = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThumbnailImage(baseCdnLinkPath=");
            sb.append(obj);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.baseCdnLinkPath;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.mimeType;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage thumbnailImage = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.baseCdnLinkPath, thumbnailImage.baseCdnLinkPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, thumbnailImage.mimeType);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage copy(java.lang.Object baseCdnLinkPath, java.lang.String mimeType) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage(baseCdnLinkPath, mimeType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage thumbnailImage, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = thumbnailImage.baseCdnLinkPath;
            }
            if ((i & 2) != 0) {
                str = thumbnailImage.mimeType;
            }
            return thumbnailImage.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$RemainingPaymentToken;", "", "", "id", "issuerDisplayName", "productDisplayName", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt1;", "paymentTokenArt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt1;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt1;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$RemainingPaymentToken;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getIssuerDisplayName", "getProductDisplayName", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt1;", "getPaymentTokenArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemainingPaymentToken {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.String issuerDisplayName;
        private final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1 paymentTokenArt;
        private final java.lang.String productDisplayName;

        public RemainingPaymentToken(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1 paymentTokenArt1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.issuerDisplayName = str2;
            this.productDisplayName = str3;
            this.paymentTokenArt = paymentTokenArt1;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getIssuerDisplayName() {
            return this.issuerDisplayName;
        }

        public final java.lang.String getProductDisplayName() {
            return this.productDisplayName;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1 getPaymentTokenArt() {
            return this.paymentTokenArt;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.issuerDisplayName;
            java.lang.String str3 = this.productDisplayName;
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1 paymentTokenArt1 = this.paymentTokenArt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemainingPaymentToken(id=");
            sb.append(str);
            sb.append(", issuerDisplayName=");
            sb.append(str2);
            sb.append(", productDisplayName=");
            sb.append(str3);
            sb.append(", paymentTokenArt=");
            sb.append(paymentTokenArt1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.issuerDisplayName;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.productDisplayName;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1 paymentTokenArt1 = this.paymentTokenArt;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (paymentTokenArt1 != null ? paymentTokenArt1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken remainingPaymentToken = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, remainingPaymentToken.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerDisplayName, remainingPaymentToken.issuerDisplayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.productDisplayName, remainingPaymentToken.productDisplayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTokenArt, remainingPaymentToken.paymentTokenArt);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken copy(java.lang.String id, java.lang.String issuerDisplayName, java.lang.String productDisplayName, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1 paymentTokenArt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken(id, issuerDisplayName, productDisplayName, paymentTokenArt);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1 getPaymentTokenArt() {
            return this.paymentTokenArt;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getProductDisplayName() {
            return this.productDisplayName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getIssuerDisplayName() {
            return this.issuerDisplayName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken remainingPaymentToken, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1 paymentTokenArt1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = remainingPaymentToken.id;
            }
            if ((i & 2) != 0) {
                str2 = remainingPaymentToken.issuerDisplayName;
            }
            if ((i & 4) != 0) {
                str3 = remainingPaymentToken.productDisplayName;
            }
            if ((i & 8) != 0) {
                paymentTokenArt1 = remainingPaymentToken.paymentTokenArt;
            }
            return remainingPaymentToken.copy(str, str2, str3, paymentTokenArt1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt1;", "", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage1;", "thumbnailImage", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage1;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage1;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage1;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$PaymentTokenArt1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage1;", "getThumbnailImage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentTokenArt1 {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 thumbnailImage;

        public PaymentTokenArt1(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 thumbnailImage1) {
            this.thumbnailImage = thumbnailImage1;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 getThumbnailImage() {
            return this.thumbnailImage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 thumbnailImage1 = this.thumbnailImage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTokenArt1(thumbnailImage=");
            sb.append(thumbnailImage1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 thumbnailImage1 = this.thumbnailImage;
            if (thumbnailImage1 == null) {
                return 0;
            }
            return thumbnailImage1.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailImage, ((com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1) other).thumbnailImage);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1 copy(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 thumbnailImage) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1(thumbnailImage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 getThumbnailImage() {
            return this.thumbnailImage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1 copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1 paymentTokenArt1, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 thumbnailImage1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                thumbnailImage1 = paymentTokenArt1.thumbnailImage;
            }
            return paymentTokenArt1.copy(thumbnailImage1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage1;", "", "baseCdnLinkPath", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getBaseCdnLinkPath", "Ljava/lang/String;", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ThumbnailImage1 {
        public static final int $stable = 8;
        private final java.lang.Object baseCdnLinkPath;
        private final java.lang.String mimeType;

        public ThumbnailImage1(java.lang.Object obj, java.lang.String str) {
            this.baseCdnLinkPath = obj;
            this.mimeType = str;
        }

        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.baseCdnLinkPath;
            java.lang.String str = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThumbnailImage1(baseCdnLinkPath=");
            sb.append(obj);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.baseCdnLinkPath;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.mimeType;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 thumbnailImage1 = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.baseCdnLinkPath, thumbnailImage1.baseCdnLinkPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, thumbnailImage1.mimeType);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 copy(java.lang.Object baseCdnLinkPath, java.lang.String mimeType) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1(baseCdnLinkPath, mimeType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 thumbnailImage1, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = thumbnailImage1.baseCdnLinkPath;
            }
            if ((i & 2) != 0) {
                str = thumbnailImage1.mimeType;
            }
            return thumbnailImage1.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JH\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Card;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer;", "issuer", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt;", "cardArt", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "productClass", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt;Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer;", "component4", "()Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt;Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Card;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer;", "getIssuer", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt;", "getCardArt", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "getProductClass"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Card {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt cardArt;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer issuer;
        private final java.lang.String lastNChars;
        private final com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass;

        public Card(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer issuer, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt cardArt, com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.lastNChars = str2;
            this.issuer = issuer;
            this.cardArt = cardArt;
            this.productClass = cardProductClass;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer getIssuer() {
            return this.issuer;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt getCardArt() {
            return this.cardArt;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass getProductClass() {
            return this.productClass;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer issuer = this.issuer;
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt cardArt = this.cardArt;
            com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = this.productClass;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Card(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", issuer=");
            sb.append(issuer);
            sb.append(", cardArt=");
            sb.append(cardArt);
            sb.append(", productClass=");
            sb.append(cardProductClass);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer issuer = this.issuer;
            int hashCode3 = issuer == null ? 0 : issuer.hashCode();
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt cardArt = this.cardArt;
            int hashCode4 = cardArt == null ? 0 : cardArt.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = this.productClass;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (cardProductClass != null ? cardProductClass.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card card = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, card.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, card.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, card.issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArt, card.cardArt) && this.productClass == card.productClass;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer issuer, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt cardArt, com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card(id, lastNChars, issuer, cardArt, productClass);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass getProductClass() {
            return this.productClass;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt getCardArt() {
            return this.cardArt;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer getIssuer() {
            return this.issuer;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card card, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer issuer, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt cardArt, com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = card.id;
            }
            if ((i & 2) != 0) {
                str2 = card.lastNChars;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                issuer = card.issuer;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer issuer2 = issuer;
            if ((i & 8) != 0) {
                cardArt = card.cardArt;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt cardArt2 = cardArt;
            if ((i & 16) != 0) {
                cardProductClass = card.productClass;
            }
            return card.copy(str, str3, issuer2, cardArt2, cardProductClass);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer {
        public static final int $stable = 0;
        private final java.lang.String name;

        public Issuer(java.lang.String str) {
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.name;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer) other).name);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer copy(java.lang.String name2) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer issuer, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuer.name;
            }
            return issuer.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt;", "", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage2;", "thumbnailImage", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage2;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage2;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage2;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage2;", "getThumbnailImage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardArt {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 thumbnailImage;

        public CardArt(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 thumbnailImage2) {
            this.thumbnailImage = thumbnailImage2;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 getThumbnailImage() {
            return this.thumbnailImage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 thumbnailImage2 = this.thumbnailImage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardArt(thumbnailImage=");
            sb.append(thumbnailImage2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 thumbnailImage2 = this.thumbnailImage;
            if (thumbnailImage2 == null) {
                return 0;
            }
            return thumbnailImage2.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailImage, ((com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt) other).thumbnailImage);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt copy(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 thumbnailImage) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt(thumbnailImage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 getThumbnailImage() {
            return this.thumbnailImage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt cardArt, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 thumbnailImage2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                thumbnailImage2 = cardArt.thumbnailImage;
            }
            return cardArt.copy(thumbnailImage2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ@\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage2;", "", "baseCdnLinkPath", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "width", "height", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getBaseCdnLinkPath", "Ljava/lang/String;", "getMimeType", "Ljava/lang/Integer;", "getWidth", "getHeight"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ThumbnailImage2 {
        public static final int $stable = 8;
        private final java.lang.Object baseCdnLinkPath;
        private final java.lang.Integer height;
        private final java.lang.String mimeType;
        private final java.lang.Integer width;

        public ThumbnailImage2(java.lang.Object obj, java.lang.String str, java.lang.Integer num, java.lang.Integer num2) {
            this.baseCdnLinkPath = obj;
            this.mimeType = str;
            this.width = num;
            this.height = num2;
        }

        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.Integer getWidth() {
            return this.width;
        }

        public final java.lang.Integer getHeight() {
            return this.height;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.baseCdnLinkPath;
            java.lang.String str = this.mimeType;
            java.lang.Integer num = this.width;
            java.lang.Integer num2 = this.height;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThumbnailImage2(baseCdnLinkPath=");
            sb.append(obj);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(", width=");
            sb.append(num);
            sb.append(", height=");
            sb.append(num2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.baseCdnLinkPath;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.mimeType;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.width;
            int hashCode3 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.height;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 thumbnailImage2 = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.baseCdnLinkPath, thumbnailImage2.baseCdnLinkPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, thumbnailImage2.mimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, thumbnailImage2.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, thumbnailImage2.height);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 copy(java.lang.Object baseCdnLinkPath, java.lang.String mimeType, java.lang.Integer width, java.lang.Integer height) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2(baseCdnLinkPath, mimeType, width, height);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getHeight() {
            return this.height;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 thumbnailImage2, java.lang.Object obj, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = thumbnailImage2.baseCdnLinkPath;
            }
            if ((i & 2) != 0) {
                str = thumbnailImage2.mimeType;
            }
            if ((i & 4) != 0) {
                num = thumbnailImage2.width;
            }
            if ((i & 8) != 0) {
                num2 = thumbnailImage2.height;
            }
            return thumbnailImage2.copy(obj, str, num, num2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JH\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$RemainingCard;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer1;", "issuer", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt1;", "cardArt", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "productClass", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer1;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt1;Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer1;", "component4", "()Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt1;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer1;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt1;Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$RemainingCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer1;", "getIssuer", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt1;", "getCardArt", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "getProductClass"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemainingCard {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 cardArt;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1 issuer;
        private final java.lang.String lastNChars;
        private final com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass;

        public RemainingCard(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1 issuer1, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 cardArt1, com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.lastNChars = str2;
            this.issuer = issuer1;
            this.cardArt = cardArt1;
            this.productClass = cardProductClass;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1 getIssuer() {
            return this.issuer;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 getCardArt() {
            return this.cardArt;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass getProductClass() {
            return this.productClass;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1 issuer1 = this.issuer;
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 cardArt1 = this.cardArt;
            com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = this.productClass;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemainingCard(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", issuer=");
            sb.append(issuer1);
            sb.append(", cardArt=");
            sb.append(cardArt1);
            sb.append(", productClass=");
            sb.append(cardProductClass);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1 issuer1 = this.issuer;
            int hashCode3 = issuer1 == null ? 0 : issuer1.hashCode();
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 cardArt1 = this.cardArt;
            int hashCode4 = cardArt1 == null ? 0 : cardArt1.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = this.productClass;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (cardProductClass != null ? cardProductClass.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard remainingCard = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, remainingCard.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, remainingCard.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, remainingCard.issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArt, remainingCard.cardArt) && this.productClass == remainingCard.productClass;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1 issuer, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 cardArt, com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard(id, lastNChars, issuer, cardArt, productClass);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass getProductClass() {
            return this.productClass;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 getCardArt() {
            return this.cardArt;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1 getIssuer() {
            return this.issuer;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard remainingCard, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1 issuer1, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 cardArt1, com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = remainingCard.id;
            }
            if ((i & 2) != 0) {
                str2 = remainingCard.lastNChars;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                issuer1 = remainingCard.issuer;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1 issuer12 = issuer1;
            if ((i & 8) != 0) {
                cardArt1 = remainingCard.cardArt;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 cardArt12 = cardArt1;
            if ((i & 16) != 0) {
                cardProductClass = remainingCard.productClass;
            }
            return remainingCard.copy(str, str3, issuer12, cardArt12, cardProductClass);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer1;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer1 {
        public static final int $stable = 0;
        private final java.lang.String name;

        public Issuer1(java.lang.String str) {
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer1(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.name;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1) other).name);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1 copy(java.lang.String name2) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1 copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1 issuer1, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuer1.name;
            }
            return issuer1.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt1;", "", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage3;", "thumbnailImage", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage3;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage3;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage3;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$CardArt1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage3;", "getThumbnailImage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardArt1 {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 thumbnailImage;

        public CardArt1(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 thumbnailImage3) {
            this.thumbnailImage = thumbnailImage3;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 getThumbnailImage() {
            return this.thumbnailImage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 thumbnailImage3 = this.thumbnailImage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardArt1(thumbnailImage=");
            sb.append(thumbnailImage3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 thumbnailImage3 = this.thumbnailImage;
            if (thumbnailImage3 == null) {
                return 0;
            }
            return thumbnailImage3.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailImage, ((com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1) other).thumbnailImage);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 copy(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 thumbnailImage) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1(thumbnailImage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 getThumbnailImage() {
            return this.thumbnailImage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 cardArt1, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 thumbnailImage3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                thumbnailImage3 = cardArt1.thumbnailImage;
            }
            return cardArt1.copy(thumbnailImage3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ@\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage3;", "", "baseCdnLinkPath", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "width", "height", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ThumbnailImage3;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getBaseCdnLinkPath", "Ljava/lang/String;", "getMimeType", "Ljava/lang/Integer;", "getWidth", "getHeight"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ThumbnailImage3 {
        public static final int $stable = 8;
        private final java.lang.Object baseCdnLinkPath;
        private final java.lang.Integer height;
        private final java.lang.String mimeType;
        private final java.lang.Integer width;

        public ThumbnailImage3(java.lang.Object obj, java.lang.String str, java.lang.Integer num, java.lang.Integer num2) {
            this.baseCdnLinkPath = obj;
            this.mimeType = str;
            this.width = num;
            this.height = num2;
        }

        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.Integer getWidth() {
            return this.width;
        }

        public final java.lang.Integer getHeight() {
            return this.height;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.baseCdnLinkPath;
            java.lang.String str = this.mimeType;
            java.lang.Integer num = this.width;
            java.lang.Integer num2 = this.height;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThumbnailImage3(baseCdnLinkPath=");
            sb.append(obj);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(", width=");
            sb.append(num);
            sb.append(", height=");
            sb.append(num2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.baseCdnLinkPath;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.mimeType;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.width;
            int hashCode3 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.height;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 thumbnailImage3 = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.baseCdnLinkPath, thumbnailImage3.baseCdnLinkPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, thumbnailImage3.mimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, thumbnailImage3.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, thumbnailImage3.height);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 copy(java.lang.Object baseCdnLinkPath, java.lang.String mimeType, java.lang.Integer width, java.lang.Integer height) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3(baseCdnLinkPath, mimeType, width, height);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getHeight() {
            return this.height;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 thumbnailImage3, java.lang.Object obj, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = thumbnailImage3.baseCdnLinkPath;
            }
            if ((i & 2) != 0) {
                str = thumbnailImage3.mimeType;
            }
            if ((i & 4) != 0) {
                num = thumbnailImage3.width;
            }
            if ((i & 8) != 0) {
                num2 = thumbnailImage3.height;
            }
            return thumbnailImage3.copy(obj, str, num, num2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JJ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0014R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$BankAccount;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer2;", "issuer", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$InstitutionImage;", "institutionImages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer2;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer2;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer2;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$BankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer2;", "getIssuer", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType", "Ljava/util/List;", "getInstitutionImages"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankAccount {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage> institutionImages;
        private final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2 issuer;
        private final java.lang.String lastNChars;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        public BankAccount(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2 issuer2, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
            this.id = str;
            this.lastNChars = str2;
            this.issuer = issuer2;
            this.type = bankAccountType;
            this.institutionImages = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2 getIssuer() {
            return this.issuer;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage> getInstitutionImages() {
            return this.institutionImages;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2 issuer2 = this.issuer;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage> list = this.institutionImages;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccount(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", issuer=");
            sb.append(issuer2);
            sb.append(", type=");
            sb.append(bankAccountType);
            sb.append(", institutionImages=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            int hashCode3 = this.issuer.hashCode();
            int hashCode4 = this.type.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage> list = this.institutionImages;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount bankAccount = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bankAccount.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, bankAccount.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, bankAccount.issuer) && this.type == bankAccount.type && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionImages, bankAccount.institutionImages);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2 issuer, com.paypal.oslo.api.graphql.schema.type.BankAccountType type, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage> institutionImages) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount(id, lastNChars, issuer, type, institutionImages);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage> component5() {
            return this.institutionImages;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2 getIssuer() {
            return this.issuer;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount bankAccount, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2 issuer2, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bankAccount.id;
            }
            if ((i & 2) != 0) {
                str2 = bankAccount.lastNChars;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                issuer2 = bankAccount.issuer;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2 issuer22 = issuer2;
            if ((i & 8) != 0) {
                bankAccountType = bankAccount.type;
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType2 = bankAccountType;
            if ((i & 16) != 0) {
                list = bankAccount.institutionImages;
            }
            return bankAccount.copy(str, str3, issuer22, bankAccountType2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer2;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer2 {
        public static final int $stable = 0;
        private final java.lang.String name;

        public Issuer2(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer2(name=");
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
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2) other).name);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2 copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2 copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer2 issuer2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuer2.name;
            }
            return issuer2.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$InstitutionImage;", "", "url", "", "width", "height", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$InstitutionImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getUrl", "Ljava/lang/Integer;", "getWidth", "getHeight", "Ljava/lang/String;", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InstitutionImage {
        public static final int $stable = 8;
        private final java.lang.Integer height;
        private final java.lang.String mimeType;
        private final java.lang.Object url;
        private final java.lang.Integer width;

        public InstitutionImage(java.lang.Object obj, java.lang.Integer num, java.lang.Integer num2, java.lang.String str) {
            this.url = obj;
            this.width = num;
            this.height = num2;
            this.mimeType = str;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.Integer getWidth() {
            return this.width;
        }

        public final java.lang.Integer getHeight() {
            return this.height;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            java.lang.Integer num = this.width;
            java.lang.Integer num2 = this.height;
            java.lang.String str = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InstitutionImage(url=");
            sb.append(obj);
            sb.append(", width=");
            sb.append(num);
            sb.append(", height=");
            sb.append(num2);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.url;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.Integer num = this.width;
            int hashCode2 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.height;
            int hashCode3 = num2 == null ? 0 : num2.hashCode();
            java.lang.String str = this.mimeType;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage institutionImage = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, institutionImage.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, institutionImage.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, institutionImage.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, institutionImage.mimeType);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage copy(java.lang.Object url, java.lang.Integer width, java.lang.Integer height, java.lang.String mimeType) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage(url, width, height, mimeType);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getHeight() {
            return this.height;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getWidth() {
            return this.width;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage institutionImage, java.lang.Object obj, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = institutionImage.url;
            }
            if ((i & 2) != 0) {
                num = institutionImage.width;
            }
            if ((i & 4) != 0) {
                num2 = institutionImage.height;
            }
            if ((i & 8) != 0) {
                str = institutionImage.mimeType;
            }
            return institutionImage.copy(obj, num, num2, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JJ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0014R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$RemainingBankAccount;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer3;", "issuer", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$InstitutionImage1;", "institutionImages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer3;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer3;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer3;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$RemainingBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer3;", "getIssuer", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType", "Ljava/util/List;", "getInstitutionImages"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemainingBankAccount {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1> institutionImages;
        private final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3 issuer;
        private final java.lang.String lastNChars;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        public RemainingBankAccount(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3 issuer3, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
            this.id = str;
            this.lastNChars = str2;
            this.issuer = issuer3;
            this.type = bankAccountType;
            this.institutionImages = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3 getIssuer() {
            return this.issuer;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1> getInstitutionImages() {
            return this.institutionImages;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3 issuer3 = this.issuer;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1> list = this.institutionImages;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemainingBankAccount(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", issuer=");
            sb.append(issuer3);
            sb.append(", type=");
            sb.append(bankAccountType);
            sb.append(", institutionImages=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            int hashCode3 = this.issuer.hashCode();
            int hashCode4 = this.type.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1> list = this.institutionImages;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount remainingBankAccount = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, remainingBankAccount.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, remainingBankAccount.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, remainingBankAccount.issuer) && this.type == remainingBankAccount.type && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionImages, remainingBankAccount.institutionImages);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3 issuer, com.paypal.oslo.api.graphql.schema.type.BankAccountType type, java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1> institutionImages) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount(id, lastNChars, issuer, type, institutionImages);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1> component5() {
            return this.institutionImages;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3 getIssuer() {
            return this.issuer;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount remainingBankAccount, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3 issuer3, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = remainingBankAccount.id;
            }
            if ((i & 2) != 0) {
                str2 = remainingBankAccount.lastNChars;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                issuer3 = remainingBankAccount.issuer;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3 issuer32 = issuer3;
            if ((i & 8) != 0) {
                bankAccountType = remainingBankAccount.type;
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType2 = bankAccountType;
            if ((i & 16) != 0) {
                list = remainingBankAccount.institutionImages;
            }
            return remainingBankAccount.copy(str, str3, issuer32, bankAccountType2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer3;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Issuer3;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer3 {
        public static final int $stable = 0;
        private final java.lang.String name;

        public Issuer3(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer3(name=");
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
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3) other).name);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3 copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3 copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer3 issuer3, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuer3.name;
            }
            return issuer3.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$InstitutionImage1;", "", "url", "", "width", "height", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$InstitutionImage1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getUrl", "Ljava/lang/Integer;", "getWidth", "getHeight", "Ljava/lang/String;", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InstitutionImage1 {
        public static final int $stable = 8;
        private final java.lang.Integer height;
        private final java.lang.String mimeType;
        private final java.lang.Object url;
        private final java.lang.Integer width;

        public InstitutionImage1(java.lang.Object obj, java.lang.Integer num, java.lang.Integer num2, java.lang.String str) {
            this.url = obj;
            this.width = num;
            this.height = num2;
            this.mimeType = str;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.Integer getWidth() {
            return this.width;
        }

        public final java.lang.Integer getHeight() {
            return this.height;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            java.lang.Integer num = this.width;
            java.lang.Integer num2 = this.height;
            java.lang.String str = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InstitutionImage1(url=");
            sb.append(obj);
            sb.append(", width=");
            sb.append(num);
            sb.append(", height=");
            sb.append(num2);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.url;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.Integer num = this.width;
            int hashCode2 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.height;
            int hashCode3 = num2 == null ? 0 : num2.hashCode();
            java.lang.String str = this.mimeType;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1 institutionImage1 = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, institutionImage1.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, institutionImage1.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, institutionImage1.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, institutionImage1.mimeType);
        }

        public final com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1 copy(java.lang.Object url, java.lang.Integer width, java.lang.Integer height, java.lang.String mimeType) {
            return new com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1(url, width, height, mimeType);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getHeight() {
            return this.height;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getWidth() {
            return this.width;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1 copy$default(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1 institutionImage1, java.lang.Object obj, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = institutionImage1.url;
            }
            if ((i & 2) != 0) {
                num = institutionImage1.width;
            }
            if ((i & 4) != 0) {
                num2 = institutionImage1.height;
            }
            if ((i & 8) != 0) {
                str = institutionImage1.mimeType;
            }
            return institutionImage1.copy(obj, num, num2, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ProvisionInstruments { provisionInstruments { paymentTokens { id issuerDisplayName productDisplayName paymentTokenArt { thumbnailImage { baseCdnLinkPath mimeType } } } remainingPaymentTokens { id issuerDisplayName productDisplayName paymentTokenArt { thumbnailImage { baseCdnLinkPath mimeType } } } cards { id lastNChars issuer { name } cardArt { thumbnailImage { baseCdnLinkPath mimeType width height } } productClass } remainingCards { id lastNChars issuer { name } cardArt { thumbnailImage { baseCdnLinkPath mimeType width height } } productClass } bankAccounts { id lastNChars issuer { name } type institutionImages { url width height mimeType } } remainingBankAccounts { id lastNChars issuer { name } type institutionImages { url width height mimeType } } } }";
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
