package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\t*+,-./01)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateCardInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateCardInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdateCardInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateCardInput;)Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateCardInput;", "getInput", "Companion", "Data", "UpdateCard", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "Issuer", "CardArt", "BillingAddress", "Status", "InstitutionImage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UpdateWalletCardMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Data> {
    public static final java.lang.String OPERATION_ID = "c37cb20c49895348520543e230569359319bc0a3869e8c52ec0b5f7267127a41";
    public static final java.lang.String OPERATION_NAME = "UpdateWalletCard";
    private final com.paypal.oslo.api.graphql.schema.type.UpdateCardInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateWalletCardMutation(com.paypal.oslo.api.graphql.schema.type.UpdateCardInput updateCardInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCardInput, "");
        this.input = updateCardInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateCardInput getInput() {
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
        com.paypal.oslo.feature.wallet.graphql.adapter.UpdateWalletCardMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.UpdateWalletCardMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.UpdateWalletCardMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$UpdateCard;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OPERATION_NAME, "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$UpdateCard;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$UpdateCard;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$UpdateCard;)Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$UpdateCard;", "getUpdateCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard updateCard;

        public Data(com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard updateCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCard, "");
            this.updateCard = updateCard;
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard getUpdateCard() {
            return this.updateCard;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard updateCard = this.updateCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateCard=");
            sb.append(updateCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updateCard.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateCard, ((com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Data) other).updateCard);
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Data copy(com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard updateCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCard, "");
            return new com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Data(updateCard);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard getUpdateCard() {
            return this.updateCard;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Data copy$default(com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Data data, com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard updateCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateCard = data.updateCard;
            }
            return data.copy(updateCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$UpdateCard;", "", "", "success", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Card;", "card", "<init>", "(ZLcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Card;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Card;", "copy", "(ZLcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Card;)Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$UpdateCard;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Card;", "getCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateCard {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card card;
        private final boolean success;

        public UpdateCard(boolean z, com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card card) {
            this.success = z;
            this.card = card;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card getCard() {
            return this.card;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card card = this.card;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateCard(success=");
            sb.append(z);
            sb.append(", card=");
            sb.append(card);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.success);
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card card = this.card;
            return (hashCode * 31) + (card == null ? 0 : card.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard updateCard = (com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard) other;
            return this.success == updateCard.success && kotlin.jvm.internal.Intrinsics.areEqual(this.card, updateCard.card);
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard copy(boolean success, com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card card) {
            return new com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard(success, card);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card getCard() {
            return this.card;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard copy$default(com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.UpdateCard updateCard, boolean z, com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card card, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = updateCard.success;
            }
            if ((i & 2) != 0) {
                card = updateCard.card;
            }
            return updateCard.copy(z, card);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b!\u0010\"Jr\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010\u001eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010 R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Card;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Issuer;", "issuer", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$CardArt;", "cardArt", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$BillingAddress;", "billingAddress", "addressId", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Status;", "status", "", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$InstitutionImage;", "institutionImages", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardBasicInfoFragment;", "walletCardBasicInfoFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Issuer;Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$CardArt;Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$BillingAddress;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Status;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardBasicInfoFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Issuer;", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$CardArt;", "component4", "()Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$BillingAddress;", "component5", "component6", "()Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Status;", "component7", "()Ljava/util/List;", "component8", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardBasicInfoFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Issuer;Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$CardArt;Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$BillingAddress;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Status;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardBasicInfoFragment;)Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Card;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Issuer;", "getIssuer", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$CardArt;", "getCardArt", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$BillingAddress;", "getBillingAddress", "getAddressId", "Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Status;", "getStatus", "Ljava/util/List;", "getInstitutionImages", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardBasicInfoFragment;", "getWalletCardBasicInfoFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Card {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.String addressId;
        private final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress billingAddress;
        private final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt cardArt;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage> institutionImages;
        private final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer issuer;
        private final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status status;
        private final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment walletCardBasicInfoFragment;

        public Card(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer issuer, com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt cardArt, com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress billingAddress, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status status, java.util.List<com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage> list, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment walletCardBasicInfoFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardBasicInfoFragment, "");
            this.__typename = str;
            this.issuer = issuer;
            this.cardArt = cardArt;
            this.billingAddress = billingAddress;
            this.addressId = str2;
            this.status = status;
            this.institutionImages = list;
            this.walletCardBasicInfoFragment = walletCardBasicInfoFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer getIssuer() {
            return this.issuer;
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt getCardArt() {
            return this.cardArt;
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status getStatus() {
            return this.status;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage> getInstitutionImages() {
            return this.institutionImages;
        }

        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment getWalletCardBasicInfoFragment() {
            return this.walletCardBasicInfoFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer issuer = this.issuer;
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt cardArt = this.cardArt;
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress billingAddress = this.billingAddress;
            java.lang.String str2 = this.addressId;
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status status = this.status;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage> list = this.institutionImages;
            com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment walletCardBasicInfoFragment = this.walletCardBasicInfoFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Card(__typename=");
            sb.append(str);
            sb.append(", issuer=");
            sb.append(issuer);
            sb.append(", cardArt=");
            sb.append(cardArt);
            sb.append(", billingAddress=");
            sb.append(billingAddress);
            sb.append(", addressId=");
            sb.append(str2);
            sb.append(", status=");
            sb.append(status);
            sb.append(", institutionImages=");
            sb.append(list);
            sb.append(", walletCardBasicInfoFragment=");
            sb.append(walletCardBasicInfoFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer issuer = this.issuer;
            int hashCode2 = issuer == null ? 0 : issuer.hashCode();
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt cardArt = this.cardArt;
            int hashCode3 = cardArt == null ? 0 : cardArt.hashCode();
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress billingAddress = this.billingAddress;
            int hashCode4 = billingAddress == null ? 0 : billingAddress.hashCode();
            java.lang.String str = this.addressId;
            int hashCode5 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status status = this.status;
            int hashCode6 = status == null ? 0 : status.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage> list = this.institutionImages;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.walletCardBasicInfoFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card card = (com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, card.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, card.issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArt, card.cardArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddress, card.billingAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, card.addressId) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, card.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionImages, card.institutionImages) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletCardBasicInfoFragment, card.walletCardBasicInfoFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer issuer, com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt cardArt, com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress billingAddress, java.lang.String addressId, com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status status, java.util.List<com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage> institutionImages, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment walletCardBasicInfoFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardBasicInfoFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card(__typename, issuer, cardArt, billingAddress, addressId, status, institutionImages, walletCardBasicInfoFragment);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment getWalletCardBasicInfoFragment() {
            return this.walletCardBasicInfoFragment;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage> component7() {
            return this.institutionImages;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status getStatus() {
            return this.status;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt getCardArt() {
            return this.cardArt;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer getIssuer() {
            return this.issuer;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Issuer;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;", "walletCardIssuerFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;)Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Issuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;", "getWalletCardIssuerFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer issuer = (com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, issuer.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletCardIssuerFragment, issuer.walletCardIssuerFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardIssuerFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer(__typename, walletCardIssuerFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment getWalletCardIssuerFragment() {
            return this.walletCardIssuerFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer copy$default(com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer issuer, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuer.__typename;
            }
            if ((i & 2) != 0) {
                walletCardIssuerFragment = issuer.walletCardIssuerFragment;
            }
            return issuer.copy(str, walletCardIssuerFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$CardArt;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardArtFragment;", "walletCardArtFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardArtFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardArtFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardArtFragment;)Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$CardArt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardArtFragment;", "getWalletCardArtFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt cardArt = (com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, cardArt.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletCardArtFragment, cardArt.walletCardArtFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment walletCardArtFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardArtFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt(__typename, walletCardArtFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment getWalletCardArtFragment() {
            return this.walletCardArtFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt copy$default(com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt cardArt, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment walletCardArtFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardArt.__typename;
            }
            if ((i & 2) != 0) {
                walletCardArtFragment = cardArt.walletCardArtFragment;
            }
            return cardArt.copy(str, walletCardArtFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$BillingAddress;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletBillingAddressFragment;", "walletBillingAddressFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletBillingAddressFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletBillingAddressFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletBillingAddressFragment;)Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$BillingAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletBillingAddressFragment;", "getWalletBillingAddressFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress billingAddress = (com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, billingAddress.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletBillingAddressFragment, billingAddress.walletBillingAddressFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment walletBillingAddressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletBillingAddressFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress(__typename, walletBillingAddressFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment getWalletBillingAddressFragment() {
            return this.walletBillingAddressFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress copy$default(com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress billingAddress, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment walletBillingAddressFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = billingAddress.__typename;
            }
            if ((i & 2) != 0) {
                walletBillingAddressFragment = billingAddress.walletBillingAddressFragment;
            }
            return billingAddress.copy(str, walletBillingAddressFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Status;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardStatusInfoFragment;", "walletCardStatusInfoFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardStatusInfoFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardStatusInfoFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardStatusInfoFragment;)Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Status;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardStatusInfoFragment;", "getWalletCardStatusInfoFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment walletCardStatusInfoFragment;

        public Status(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment walletCardStatusInfoFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardStatusInfoFragment, "");
            this.__typename = str;
            this.walletCardStatusInfoFragment = walletCardStatusInfoFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment getWalletCardStatusInfoFragment() {
            return this.walletCardStatusInfoFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment walletCardStatusInfoFragment = this.walletCardStatusInfoFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Status(__typename=");
            sb.append(str);
            sb.append(", walletCardStatusInfoFragment=");
            sb.append(walletCardStatusInfoFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.walletCardStatusInfoFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status status = (com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, status.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletCardStatusInfoFragment, status.walletCardStatusInfoFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment walletCardStatusInfoFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardStatusInfoFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status(__typename, walletCardStatusInfoFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment getWalletCardStatusInfoFragment() {
            return this.walletCardStatusInfoFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status copy$default(com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status status, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment walletCardStatusInfoFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = status.__typename;
            }
            if ((i & 2) != 0) {
                walletCardStatusInfoFragment = status.walletCardStatusInfoFragment;
            }
            return status.copy(str, walletCardStatusInfoFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$InstitutionImage;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;", "walletInstitutionImageFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;)Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$InstitutionImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;", "getWalletInstitutionImageFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage institutionImage = (com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, institutionImage.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletInstitutionImageFragment, institutionImage.walletInstitutionImageFragment);
        }

        public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletInstitutionImageFragment, "");
            return new com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage(__typename, walletInstitutionImageFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment getWalletInstitutionImageFragment() {
            return this.walletInstitutionImageFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage copy$default(com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage institutionImage, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = institutionImage.__typename;
            }
            if ((i & 2) != 0) {
                walletInstitutionImageFragment = institutionImage.walletInstitutionImageFragment;
            }
            return institutionImage.copy(str, walletInstitutionImageFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateWalletCard($input: UpdateCardInput!) { updateCard(input: $input) { success card { __typename ...WalletCardBasicInfoFragment issuer { __typename ...WalletCardIssuerFragment } cardArt { __typename ...WalletCardArtFragment } billingAddress { __typename ...WalletBillingAddressFragment } addressId status { __typename ...WalletCardStatusInfoFragment } institutionImages { __typename ...WalletInstitutionImageFragment } } } }  fragment WalletCardBasicInfoFragment on Card { id lastNChars brand expirationDate nickName productClass currencyCode }  fragment WalletCardIssuerFragment on CardIssuer { name id countryCode issuerProductDescription issuerAlternateName }  fragment WalletCardArtFragment on CardArt { primaryImage { baseCdnLinkPath mimeType height width } thumbnailImage { baseCdnLinkPath mimeType height width } backgroundColor foregroundColor labelColor }  fragment WalletBillingAddressFragment on AddressPortable { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 adminArea4 postalCode countryCode }  fragment WalletCardStatusInfoFragment on CardStatusInfo { value reason }  fragment WalletInstitutionImageFragment on InstitutionImage { url mimeType width height category }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdateCardInput updateCardInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateWalletCardMutation(input=");
        sb.append(updateCardInput);
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
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdateCardInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdateCardInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation copy$default(com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation updateWalletCardMutation, com.paypal.oslo.api.graphql.schema.type.UpdateCardInput updateCardInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updateCardInput = updateWalletCardMutation.input;
        }
        return updateWalletCardMutation.copy(updateCardInput);
    }
}
