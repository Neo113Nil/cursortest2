package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\t*+,-./01)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/AddCardInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AddCardInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AddCardInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AddCardInput;)Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AddCardInput;", "getInput", "Companion", "Data", "AddCard", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "Issuer", "BillingAddress", "Status", "InstitutionImage", "CardArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CreateWalletCardMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Data> {
    public static final java.lang.String OPERATION_ID = "cf6782f12bbcc09f92dfcb8d09f70e487829ecb9dedbc5f64d730a016d1da8aa";
    public static final java.lang.String OPERATION_NAME = "CreateWalletCard";
    private final com.paypal.oslo.api.graphql.schema.type.AddCardInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Companion(null);
    public static final int $stable = 8;

    public CreateWalletCardMutation(com.paypal.oslo.api.graphql.schema.type.AddCardInput addCardInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardInput, "");
        this.input = addCardInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddCardInput getInput() {
        return this.input;
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
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.wallet.graphql.adapter.CreateWalletCardMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.CreateWalletCardMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.CreateWalletCardMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$AddCard;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME, "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$AddCard;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$AddCard;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$AddCard;)Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$AddCard;", "getAddCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard addCard;

        public Data(com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard addCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCard, "");
            this.addCard = addCard;
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard getAddCard() {
            return this.addCard;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard addCard = this.addCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(addCard=");
            sb.append(addCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.addCard.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.addCard, ((com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Data) other).addCard);
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Data copy(com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard addCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCard, "");
            return new com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Data(addCard);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard getAddCard() {
            return this.addCard;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Data copy$default(com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Data data, com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard addCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addCard = data.addCard;
            }
            return data.copy(addCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$AddCard;", "", "", "success", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Card;", "card", "<init>", "(ZLcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Card;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Card;", "copy", "(ZLcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Card;)Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$AddCard;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Card;", "getCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddCard {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card card;
        private final boolean success;

        public AddCard(boolean z, com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card card) {
            this.success = z;
            this.card = card;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card getCard() {
            return this.card;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card card = this.card;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCard(success=");
            sb.append(z);
            sb.append(", card=");
            sb.append(card);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.success);
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card card = this.card;
            return (hashCode * 31) + (card == null ? 0 : card.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard addCard = (com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard) other;
            return this.success == addCard.success && kotlin.jvm.internal.Intrinsics.areEqual(this.card, addCard.card);
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard copy(boolean success, com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card card) {
            return new com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard(success, card);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card getCard() {
            return this.card;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard copy$default(com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.AddCard addCard, boolean z, com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card card, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = addCard.success;
            }
            if ((i & 2) != 0) {
                card = addCard.card;
            }
            return addCard.copy(z, card);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b!\u0010\"Jr\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u001cR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010 R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Card;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Issuer;", "issuer", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$BillingAddress;", "billingAddress", "addressId", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Status;", "status", "", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$InstitutionImage;", "institutionImages", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$CardArt;", "cardArt", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardBasicInfoFragment;", "walletCardBasicInfoFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Issuer;Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$BillingAddress;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Status;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$CardArt;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardBasicInfoFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Issuer;", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$BillingAddress;", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Status;", "component6", "()Ljava/util/List;", "component7", "()Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$CardArt;", "component8", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardBasicInfoFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Issuer;Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$BillingAddress;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Status;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$CardArt;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardBasicInfoFragment;)Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Card;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Issuer;", "getIssuer", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$BillingAddress;", "getBillingAddress", "getAddressId", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Status;", "getStatus", "Ljava/util/List;", "getInstitutionImages", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$CardArt;", "getCardArt", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardBasicInfoFragment;", "getWalletCardBasicInfoFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Card {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.String addressId;
        private final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress billingAddress;
        private final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt cardArt;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage> institutionImages;
        private final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer issuer;
        private final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status status;
        private final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment walletCardBasicInfoFragment;

        public Card(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer issuer, com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress billingAddress, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status status, java.util.List<com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage> list, com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt cardArt, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment walletCardBasicInfoFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardBasicInfoFragment, "");
            this.__typename = str;
            this.issuer = issuer;
            this.billingAddress = billingAddress;
            this.addressId = str2;
            this.status = status;
            this.institutionImages = list;
            this.cardArt = cardArt;
            this.walletCardBasicInfoFragment = walletCardBasicInfoFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer getIssuer() {
            return this.issuer;
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status getStatus() {
            return this.status;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage> getInstitutionImages() {
            return this.institutionImages;
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt getCardArt() {
            return this.cardArt;
        }

        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment getWalletCardBasicInfoFragment() {
            return this.walletCardBasicInfoFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer issuer = this.issuer;
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress billingAddress = this.billingAddress;
            java.lang.String str2 = this.addressId;
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status status = this.status;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage> list = this.institutionImages;
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt cardArt = this.cardArt;
            com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment walletCardBasicInfoFragment = this.walletCardBasicInfoFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Card(__typename=");
            sb.append(str);
            sb.append(", issuer=");
            sb.append(issuer);
            sb.append(", billingAddress=");
            sb.append(billingAddress);
            sb.append(", addressId=");
            sb.append(str2);
            sb.append(", status=");
            sb.append(status);
            sb.append(", institutionImages=");
            sb.append(list);
            sb.append(", cardArt=");
            sb.append(cardArt);
            sb.append(", walletCardBasicInfoFragment=");
            sb.append(walletCardBasicInfoFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer issuer = this.issuer;
            int hashCode2 = issuer == null ? 0 : issuer.hashCode();
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress billingAddress = this.billingAddress;
            int hashCode3 = billingAddress == null ? 0 : billingAddress.hashCode();
            java.lang.String str = this.addressId;
            int hashCode4 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status status = this.status;
            int hashCode5 = status == null ? 0 : status.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage> list = this.institutionImages;
            int hashCode6 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt cardArt = this.cardArt;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (cardArt != null ? cardArt.hashCode() : 0)) * 31) + this.walletCardBasicInfoFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card card = (com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, card.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, card.issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddress, card.billingAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, card.addressId) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, card.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionImages, card.institutionImages) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArt, card.cardArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletCardBasicInfoFragment, card.walletCardBasicInfoFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer issuer, com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress billingAddress, java.lang.String addressId, com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status status, java.util.List<com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage> institutionImages, com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt cardArt, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment walletCardBasicInfoFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardBasicInfoFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card(__typename, issuer, billingAddress, addressId, status, institutionImages, cardArt, walletCardBasicInfoFragment);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment getWalletCardBasicInfoFragment() {
            return this.walletCardBasicInfoFragment;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt getCardArt() {
            return this.cardArt;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage> component6() {
            return this.institutionImages;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status getStatus() {
            return this.status;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer getIssuer() {
            return this.issuer;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Issuer;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;", "walletCardIssuerFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;)Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Issuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;", "getWalletCardIssuerFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment;

        public Issuer(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardIssuerFragment, "");
            this.__typename = str;
            this.walletCardIssuerFragment = walletCardIssuerFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment getWalletCardIssuerFragment() {
            return this.walletCardIssuerFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment = this.walletCardIssuerFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer(__typename=");
            sb.append(str);
            sb.append(", walletCardIssuerFragment=");
            sb.append(walletCardIssuerFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.walletCardIssuerFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer issuer = (com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, issuer.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletCardIssuerFragment, issuer.walletCardIssuerFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardIssuerFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer(__typename, walletCardIssuerFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment getWalletCardIssuerFragment() {
            return this.walletCardIssuerFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer copy$default(com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer issuer, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuer.__typename;
            }
            if ((i & 2) != 0) {
                walletCardIssuerFragment = issuer.walletCardIssuerFragment;
            }
            return issuer.copy(str, walletCardIssuerFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$BillingAddress;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletBillingAddressFragment;", "walletBillingAddressFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletBillingAddressFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletBillingAddressFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletBillingAddressFragment;)Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$BillingAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletBillingAddressFragment;", "getWalletBillingAddressFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BillingAddress {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment walletBillingAddressFragment;

        public BillingAddress(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment walletBillingAddressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletBillingAddressFragment, "");
            this.__typename = str;
            this.walletBillingAddressFragment = walletBillingAddressFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment getWalletBillingAddressFragment() {
            return this.walletBillingAddressFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment walletBillingAddressFragment = this.walletBillingAddressFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BillingAddress(__typename=");
            sb.append(str);
            sb.append(", walletBillingAddressFragment=");
            sb.append(walletBillingAddressFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.walletBillingAddressFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress billingAddress = (com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, billingAddress.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletBillingAddressFragment, billingAddress.walletBillingAddressFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment walletBillingAddressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletBillingAddressFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress(__typename, walletBillingAddressFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment getWalletBillingAddressFragment() {
            return this.walletBillingAddressFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress copy$default(com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress billingAddress, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment walletBillingAddressFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = billingAddress.__typename;
            }
            if ((i & 2) != 0) {
                walletBillingAddressFragment = billingAddress.walletBillingAddressFragment;
            }
            return billingAddress.copy(str, walletBillingAddressFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Status;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Status;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", "getValue", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status status = (com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status) other;
            return this.value == status.value && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, status.reason);
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status copy(com.paypal.oslo.api.graphql.schema.type.CardStatus value, java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status(value, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardStatus getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status copy$default(com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status status, com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardStatus = status.value;
            }
            if ((i & 2) != 0) {
                str = status.reason;
            }
            return status.copy(cardStatus, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$InstitutionImage;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;", "walletInstitutionImageFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;)Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$InstitutionImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;", "getWalletInstitutionImageFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InstitutionImage {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment;

        public InstitutionImage(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletInstitutionImageFragment, "");
            this.__typename = str;
            this.walletInstitutionImageFragment = walletInstitutionImageFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment getWalletInstitutionImageFragment() {
            return this.walletInstitutionImageFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment = this.walletInstitutionImageFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InstitutionImage(__typename=");
            sb.append(str);
            sb.append(", walletInstitutionImageFragment=");
            sb.append(walletInstitutionImageFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.walletInstitutionImageFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage institutionImage = (com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, institutionImage.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletInstitutionImageFragment, institutionImage.walletInstitutionImageFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletInstitutionImageFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage(__typename, walletInstitutionImageFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment getWalletInstitutionImageFragment() {
            return this.walletInstitutionImageFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage copy$default(com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage institutionImage, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = institutionImage.__typename;
            }
            if ((i & 2) != 0) {
                walletInstitutionImageFragment = institutionImage.walletInstitutionImageFragment;
            }
            return institutionImage.copy(str, walletInstitutionImageFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$CardArt;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardArtFragment;", "walletCardArtFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardArtFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardArtFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardArtFragment;)Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$CardArt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardArtFragment;", "getWalletCardArtFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardArt {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment walletCardArtFragment;

        public CardArt(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment walletCardArtFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardArtFragment, "");
            this.__typename = str;
            this.walletCardArtFragment = walletCardArtFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment getWalletCardArtFragment() {
            return this.walletCardArtFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment walletCardArtFragment = this.walletCardArtFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardArt(__typename=");
            sb.append(str);
            sb.append(", walletCardArtFragment=");
            sb.append(walletCardArtFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.walletCardArtFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt cardArt = (com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, cardArt.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletCardArtFragment, cardArt.walletCardArtFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment walletCardArtFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardArtFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt(__typename, walletCardArtFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment getWalletCardArtFragment() {
            return this.walletCardArtFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt copy$default(com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt cardArt, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment walletCardArtFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardArt.__typename;
            }
            if ((i & 2) != 0) {
                walletCardArtFragment = cardArt.walletCardArtFragment;
            }
            return cardArt.copy(str, walletCardArtFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation CreateWalletCard($input: AddCardInput!) { addCard(input: $input) { success card { __typename ...WalletCardBasicInfoFragment issuer { __typename ...WalletCardIssuerFragment } billingAddress { __typename ...WalletBillingAddressFragment } addressId status { value reason } institutionImages { __typename ...WalletInstitutionImageFragment } cardArt { __typename ...WalletCardArtFragment } } } }  fragment WalletCardBasicInfoFragment on Card { id lastNChars brand expirationDate nickName productClass currencyCode }  fragment WalletCardIssuerFragment on CardIssuer { name id countryCode issuerProductDescription issuerAlternateName }  fragment WalletBillingAddressFragment on AddressPortable { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 adminArea4 postalCode countryCode }  fragment WalletInstitutionImageFragment on InstitutionImage { url mimeType width height category }  fragment WalletCardArtFragment on CardArt { primaryImage { baseCdnLinkPath mimeType height width } thumbnailImage { baseCdnLinkPath mimeType height width } backgroundColor foregroundColor labelColor }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AddCardInput addCardInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateWalletCardMutation(input=");
        sb.append(addCardInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.input.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation copy(com.paypal.oslo.api.graphql.schema.type.AddCardInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AddCardInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation copy$default(com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation createWalletCardMutation, com.paypal.oslo.api.graphql.schema.type.AddCardInput addCardInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addCardInput = createWalletCardMutation.input;
        }
        return createWalletCardMutation.copy(addCardInput);
    }
}
