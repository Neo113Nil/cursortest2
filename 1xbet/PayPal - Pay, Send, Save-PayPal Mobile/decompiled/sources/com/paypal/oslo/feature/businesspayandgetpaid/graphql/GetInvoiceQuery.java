package com.paypal.oslo.feature.businesspayandgetpaid.graphql;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003'(&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0007J\u001a\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceQuery$Data;", "", "id", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Companion", "Data", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySearchConstants.KEY_SEARCH_FILTER_TYPE_INVOICES}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetInvoiceQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "688998d25b731e53c0993de768f82869f5a7ca13bfc98a1b04971bfbeab25363";
    public static final java.lang.String OPERATION_NAME = "GetInvoice";
    private final java.lang.String id;

    public GetInvoiceQuery(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    public final java.lang.String getId() {
        return this.id;
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
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.businesspayandgetpaid.graphql.selections.GetInvoiceQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceQuery$Invoice;", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceQuery$Invoice;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceQuery$Invoice;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceQuery$Invoice;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceQuery$Invoice;", "getInvoice"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice invoice;

        public Data(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice invoice) {
            this.invoice = invoice;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice getInvoice() {
            return this.invoice;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice invoice = this.invoice;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(invoice=");
            sb.append(invoice);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice invoice = this.invoice;
            if (invoice == null) {
                return 0;
            }
            return invoice.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoice, ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Data) other).invoice);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Data copy(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice invoice) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Data(invoice);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice getInvoice() {
            return this.invoice;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Data copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Data data, com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice invoice, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                invoice = data.invoice;
            }
            return data.copy(invoice);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceQuery$Invoice;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;", "invoiceFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceQuery$Invoice;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;", "getInvoiceFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Invoice {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment;

        public Invoice(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invoice(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice invoice = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, invoice.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceFragment, invoice.invoiceFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice(__typename, invoiceFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment getInvoiceFragment() {
            return this.invoiceFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice invoice, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invoice.__typename;
            }
            if ((i & 2) != 0) {
                invoiceFragment = invoice.invoiceFragment;
            }
            return invoice.copy(str, invoiceFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetInvoice($id: ID!) { invoice(id: $id) { __typename ...InvoiceFragment } }  fragment MoneyFragment on Money { value currencyCode }  fragment InvoiceTransactionFragment on InvoiceTransaction { id type amount { __typename ...MoneyFragment } }  fragment InvoiceFragment on Invoice { id status detail { invoiceNumber invoiceDate currencyCode note paymentTerm { dueDate } } primaryRecipients { billingDetails { name { givenName surname } email phones { countryCode nationalNumber } } } items { item { name description price { __typename ...MoneyFragment } } unitOfMeasure quantity } amountBreakDown { amount { __typename ...MoneyFragment } dueAmount { __typename ...MoneyFragment } gratuity { __typename ...MoneyFragment } itemTotal { __typename ...MoneyFragment } invoiceDiscount { __typename ...MoneyFragment } itemDiscount { __typename ...MoneyFragment } taxTotal { __typename ...MoneyFragment } shippingAmount { __typename ...MoneyFragment } } configuration { taxCalculatedAfterDiscount allowTip taxInclusive conditional } payments { totalAmountPaid { __typename ...MoneyFragment } transactions { __typename ...InvoiceTransactionFragment } } refunds { totalAmountRefunded { __typename ...MoneyFragment } transactions { __typename ...InvoiceTransactionFragment } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetInvoiceQuery(id=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery) other).id);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery copy(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery(id);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery getInvoiceQuery, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = getInvoiceQuery.id;
        }
        return getInvoiceQuery.copy(str);
    }
}
