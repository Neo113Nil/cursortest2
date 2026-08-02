package com.paypal.oslo.feature.businesspayandgetpaid.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/SaveInvoiceReminderMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/SaveInvoiceReminderMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/SaveInvoiceReminderInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SaveInvoiceReminderInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SaveInvoiceReminderInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SaveInvoiceReminderInput;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/SaveInvoiceReminderMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SaveInvoiceReminderInput;", "getInput", "Companion", "Data", "SaveInvoiceReminderV2"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SaveInvoiceReminderMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.Data> {
    public static final java.lang.String OPERATION_ID = "060b5d9f33ab08833dde5febe44034b95193f939010ee5dc979bfb8cdc09a434";
    public static final java.lang.String OPERATION_NAME = "SaveInvoiceReminder";
    private final com.paypal.oslo.api.graphql.schema.type.SaveInvoiceReminderInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.Companion(null);
    public static final int $stable = 8;

    public SaveInvoiceReminderMutation(com.paypal.oslo.api.graphql.schema.type.SaveInvoiceReminderInput saveInvoiceReminderInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveInvoiceReminderInput, "");
        this.input = saveInvoiceReminderInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SaveInvoiceReminderInput getInput() {
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
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.SaveInvoiceReminderMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.SaveInvoiceReminderMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.businesspayandgetpaid.graphql.selections.SaveInvoiceReminderMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/SaveInvoiceReminderMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/SaveInvoiceReminderMutation$SaveInvoiceReminderV2;", "saveInvoiceReminderV2", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/SaveInvoiceReminderMutation$SaveInvoiceReminderV2;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/SaveInvoiceReminderMutation$SaveInvoiceReminderV2;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/SaveInvoiceReminderMutation$SaveInvoiceReminderV2;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/SaveInvoiceReminderMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/SaveInvoiceReminderMutation$SaveInvoiceReminderV2;", "getSaveInvoiceReminderV2"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2 saveInvoiceReminderV2;

        public Data(com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2 saveInvoiceReminderV2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveInvoiceReminderV2, "");
            this.saveInvoiceReminderV2 = saveInvoiceReminderV2;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2 getSaveInvoiceReminderV2() {
            return this.saveInvoiceReminderV2;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2 saveInvoiceReminderV2 = this.saveInvoiceReminderV2;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(saveInvoiceReminderV2=");
            sb.append(saveInvoiceReminderV2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.saveInvoiceReminderV2.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.saveInvoiceReminderV2, ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.Data) other).saveInvoiceReminderV2);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.Data copy(com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2 saveInvoiceReminderV2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveInvoiceReminderV2, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.Data(saveInvoiceReminderV2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2 getSaveInvoiceReminderV2() {
            return this.saveInvoiceReminderV2;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.Data copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.Data data, com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2 saveInvoiceReminderV2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                saveInvoiceReminderV2 = data.saveInvoiceReminderV2;
            }
            return data.copy(saveInvoiceReminderV2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/SaveInvoiceReminderMutation$SaveInvoiceReminderV2;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;", "invoiceFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/SaveInvoiceReminderMutation$SaveInvoiceReminderV2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;", "getInvoiceFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SaveInvoiceReminderV2 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment;

        public SaveInvoiceReminderV2(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceFragment, "");
            this.__typename = str;
            this.invoiceFragment = invoiceFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment getInvoiceFragment() {
            return this.invoiceFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment = this.invoiceFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SaveInvoiceReminderV2(__typename=");
            sb.append(str);
            sb.append(", invoiceFragment=");
            sb.append(invoiceFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.invoiceFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2 saveInvoiceReminderV2 = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, saveInvoiceReminderV2.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceFragment, saveInvoiceReminderV2.invoiceFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2 copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2(__typename, invoiceFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment getInvoiceFragment() {
            return this.invoiceFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2 copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2 saveInvoiceReminderV2, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = saveInvoiceReminderV2.__typename;
            }
            if ((i & 2) != 0) {
                invoiceFragment = saveInvoiceReminderV2.invoiceFragment;
            }
            return saveInvoiceReminderV2.copy(str, invoiceFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/SaveInvoiceReminderMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation SaveInvoiceReminder($input: SaveInvoiceReminderInput!) { saveInvoiceReminderV2(input: $input) { __typename ...InvoiceFragment } }  fragment MoneyFragment on Money { value currencyCode }  fragment InvoiceTransactionFragment on InvoiceTransaction { id type amount { __typename ...MoneyFragment } }  fragment InvoiceFragment on Invoice { id status detail { invoiceNumber invoiceDate currencyCode note paymentTerm { dueDate } } primaryRecipients { billingDetails { name { givenName surname } email phones { countryCode nationalNumber } } } items { item { name description price { __typename ...MoneyFragment } } unitOfMeasure quantity } amountBreakDown { amount { __typename ...MoneyFragment } dueAmount { __typename ...MoneyFragment } gratuity { __typename ...MoneyFragment } itemTotal { __typename ...MoneyFragment } invoiceDiscount { __typename ...MoneyFragment } itemDiscount { __typename ...MoneyFragment } taxTotal { __typename ...MoneyFragment } shippingAmount { __typename ...MoneyFragment } } configuration { taxCalculatedAfterDiscount allowTip taxInclusive conditional } payments { totalAmountPaid { __typename ...MoneyFragment } transactions { __typename ...InvoiceTransactionFragment } } refunds { totalAmountRefunded { __typename ...MoneyFragment } transactions { __typename ...InvoiceTransactionFragment } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SaveInvoiceReminderInput saveInvoiceReminderInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SaveInvoiceReminderMutation(input=");
        sb.append(saveInvoiceReminderInput);
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
        return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation) other).input);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation copy(com.paypal.oslo.api.graphql.schema.type.SaveInvoiceReminderInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SaveInvoiceReminderInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation saveInvoiceReminderMutation, com.paypal.oslo.api.graphql.schema.type.SaveInvoiceReminderInput saveInvoiceReminderInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            saveInvoiceReminderInput = saveInvoiceReminderMutation.input;
        }
        return saveInvoiceReminderMutation.copy(saveInvoiceReminderInput);
    }
}
