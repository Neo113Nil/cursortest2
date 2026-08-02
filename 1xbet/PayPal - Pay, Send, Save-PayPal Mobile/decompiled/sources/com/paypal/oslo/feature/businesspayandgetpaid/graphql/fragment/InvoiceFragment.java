package com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001:\u0019DEFGHIJKLMNOPQRSTUVWXYZ[\\Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0082\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\u001cR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001eR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b;\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\bC\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceStatus;", "status", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Detail;", "detail", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$PrimaryRecipient;", "primaryRecipients", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Item;", "items", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$AmountBreakDown;", "amountBreakDown", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Payments;", "payments", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Refunds;", "refunds", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/InvoiceStatus;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Detail;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$AmountBreakDown;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Configuration;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Payments;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Refunds;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/InvoiceStatus;", "component3", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Detail;", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$AmountBreakDown;", "component7", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Configuration;", "component8", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Payments;", "component9", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Refunds;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/InvoiceStatus;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Detail;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$AmountBreakDown;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Configuration;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Payments;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Refunds;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceStatus;", "getStatus", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Detail;", "getDetail", "Ljava/util/List;", "getPrimaryRecipients", "getItems", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$AmountBreakDown;", "getAmountBreakDown", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Configuration;", "getConfiguration", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Payments;", "getPayments", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Refunds;", "getRefunds", "Detail", "PrimaryRecipient", "Item", "AmountBreakDown", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "Payments", "Refunds", "PaymentTerm", com.paypal.oslo.feature.bnplacquisition.ui.common.components.BillingAddressCardTestTags.BILLING_DETAILS, "Name", "Phone", "Item1", "Price", "Amount", "DueAmount", "Gratuity", "ItemTotal", "InvoiceDiscount", "ItemDiscount", "TaxTotal", "ShippingAmount", "TotalAmountPaid", "Transaction", "TotalAmountRefunded", "Transaction1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InvoiceFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.AmountBreakDown amountBreakDown;
    private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration configuration;
    private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail detail;
    private final java.lang.String id;
    private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item> items;
    private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments payments;
    private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient> primaryRecipients;
    private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds refunds;
    private final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus status;

    public InvoiceFragment(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail detail, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient> list, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item> list2, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.AmountBreakDown amountBreakDown, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration configuration, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments payments, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds refunds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountBreakDown, "");
        this.id = str;
        this.status = invoiceStatus;
        this.detail = detail;
        this.primaryRecipients = list;
        this.items = list2;
        this.amountBreakDown = amountBreakDown;
        this.configuration = configuration;
        this.payments = payments;
        this.refunds = refunds;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail getDetail() {
        return this.detail;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient> getPrimaryRecipients() {
        return this.primaryRecipients;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item> getItems() {
        return this.items;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.AmountBreakDown getAmountBreakDown() {
        return this.amountBreakDown;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration getConfiguration() {
        return this.configuration;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments getPayments() {
        return this.payments;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds getRefunds() {
        return this.refunds;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JJ\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Detail;", "", "", "invoiceNumber", "invoiceDate", "currencyCode", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$PaymentTerm;", "paymentTerm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$PaymentTerm;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$PaymentTerm;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$PaymentTerm;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Detail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInvoiceNumber", "getInvoiceDate", "getCurrencyCode", "getNote", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$PaymentTerm;", "getPaymentTerm"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Detail {
        public static final int $stable = 0;
        private final java.lang.String currencyCode;
        private final java.lang.String invoiceDate;
        private final java.lang.String invoiceNumber;
        private final java.lang.String note;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm paymentTerm;

        public Detail(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm paymentTerm) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.invoiceNumber = str;
            this.invoiceDate = str2;
            this.currencyCode = str3;
            this.note = str4;
            this.paymentTerm = paymentTerm;
        }

        public final java.lang.String getInvoiceNumber() {
            return this.invoiceNumber;
        }

        public final java.lang.String getInvoiceDate() {
            return this.invoiceDate;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getNote() {
            return this.note;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm getPaymentTerm() {
            return this.paymentTerm;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.invoiceNumber;
            java.lang.String str2 = this.invoiceDate;
            java.lang.String str3 = this.currencyCode;
            java.lang.String str4 = this.note;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm paymentTerm = this.paymentTerm;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Detail(invoiceNumber=");
            sb.append(str);
            sb.append(", invoiceDate=");
            sb.append(str2);
            sb.append(", currencyCode=");
            sb.append(str3);
            sb.append(", note=");
            sb.append(str4);
            sb.append(", paymentTerm=");
            sb.append(paymentTerm);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.invoiceNumber;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.invoiceDate;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            int hashCode3 = this.currencyCode.hashCode();
            java.lang.String str3 = this.note;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm paymentTerm = this.paymentTerm;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (paymentTerm != null ? paymentTerm.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail detail = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceNumber, detail.invoiceNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceDate, detail.invoiceDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, detail.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.note, detail.note) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTerm, detail.paymentTerm);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail copy(java.lang.String invoiceNumber, java.lang.String invoiceDate, java.lang.String currencyCode, java.lang.String note, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm paymentTerm) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail(invoiceNumber, invoiceDate, currencyCode, note, paymentTerm);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm getPaymentTerm() {
            return this.paymentTerm;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getNote() {
            return this.note;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getInvoiceDate() {
            return this.invoiceDate;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInvoiceNumber() {
            return this.invoiceNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail detail, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm paymentTerm, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = detail.invoiceNumber;
            }
            if ((i & 2) != 0) {
                str2 = detail.invoiceDate;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = detail.currencyCode;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                str4 = detail.note;
            }
            java.lang.String str7 = str4;
            if ((i & 16) != 0) {
                paymentTerm = detail.paymentTerm;
            }
            return detail.copy(str, str5, str6, str7, paymentTerm);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$PrimaryRecipient;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$BillingDetails;", "billingDetails", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$BillingDetails;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$BillingDetails;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$BillingDetails;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$PrimaryRecipient;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$BillingDetails;", "getBillingDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryRecipient {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails billingDetails;

        public PrimaryRecipient(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails billingDetails) {
            this.billingDetails = billingDetails;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails billingDetails = this.billingDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryRecipient(billingDetails=");
            sb.append(billingDetails);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails billingDetails = this.billingDetails;
            if (billingDetails == null) {
                return 0;
            }
            return billingDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingDetails, ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient) other).billingDetails);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient copy(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails billingDetails) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient(billingDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient primaryRecipient, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails billingDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                billingDetails = primaryRecipient.billingDetails;
            }
            return primaryRecipient.copy(billingDetails);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Item;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Item1;", "item", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceItemUnitOfMeasure;", "unitOfMeasure", "", "quantity", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Item1;Lcom/paypal/oslo/api/graphql/schema/type/InvoiceItemUnitOfMeasure;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Item1;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/InvoiceItemUnitOfMeasure;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Item1;Lcom/paypal/oslo/api/graphql/schema/type/InvoiceItemUnitOfMeasure;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Item1;", "getItem", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceItemUnitOfMeasure;", "getUnitOfMeasure", "Ljava/lang/String;", "getQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 item;
        private final java.lang.String quantity;
        private final com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure unitOfMeasure;

        public Item(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 item1, com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure invoiceItemUnitOfMeasure, java.lang.String str) {
            this.item = item1;
            this.unitOfMeasure = invoiceItemUnitOfMeasure;
            this.quantity = str;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 getItem() {
            return this.item;
        }

        public final com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure getUnitOfMeasure() {
            return this.unitOfMeasure;
        }

        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 item1 = this.item;
            com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure invoiceItemUnitOfMeasure = this.unitOfMeasure;
            java.lang.String str = this.quantity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(item=");
            sb.append(item1);
            sb.append(", unitOfMeasure=");
            sb.append(invoiceItemUnitOfMeasure);
            sb.append(", quantity=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 item1 = this.item;
            int hashCode = item1 == null ? 0 : item1.hashCode();
            com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure invoiceItemUnitOfMeasure = this.unitOfMeasure;
            int hashCode2 = invoiceItemUnitOfMeasure == null ? 0 : invoiceItemUnitOfMeasure.hashCode();
            java.lang.String str = this.quantity;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item item = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.item, item.item) && this.unitOfMeasure == item.unitOfMeasure && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, item.quantity);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item copy(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 item, com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure unitOfMeasure, java.lang.String quantity) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item(item, unitOfMeasure, quantity);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure getUnitOfMeasure() {
            return this.unitOfMeasure;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 getItem() {
            return this.item;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item item, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 item1, com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure invoiceItemUnitOfMeasure, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                item1 = item.item;
            }
            if ((i & 2) != 0) {
                invoiceItemUnitOfMeasure = item.unitOfMeasure;
            }
            if ((i & 4) != 0) {
                str = item.quantity;
            }
            return item.copy(item1, invoiceItemUnitOfMeasure, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jp\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$AmountBreakDown;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Amount;", "amount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$DueAmount;", "dueAmount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Gratuity;", "gratuity", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemTotal;", "itemTotal", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$InvoiceDiscount;", "invoiceDiscount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemDiscount;", "itemDiscount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TaxTotal;", "taxTotal", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ShippingAmount;", "shippingAmount", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Amount;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$DueAmount;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Gratuity;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemTotal;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$InvoiceDiscount;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemDiscount;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TaxTotal;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ShippingAmount;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Amount;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$DueAmount;", "component3", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Gratuity;", "component4", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemTotal;", "component5", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$InvoiceDiscount;", "component6", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemDiscount;", "component7", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TaxTotal;", "component8", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ShippingAmount;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Amount;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$DueAmount;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Gratuity;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemTotal;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$InvoiceDiscount;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemDiscount;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TaxTotal;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ShippingAmount;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$AmountBreakDown;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Amount;", "getAmount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$DueAmount;", "getDueAmount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Gratuity;", "getGratuity", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemTotal;", "getItemTotal", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$InvoiceDiscount;", "getInvoiceDiscount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemDiscount;", "getItemDiscount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TaxTotal;", "getTaxTotal", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ShippingAmount;", "getShippingAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountBreakDown {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount amount;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount dueAmount;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity gratuity;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount invoiceDiscount;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount itemDiscount;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal itemTotal;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount shippingAmount;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal taxTotal;

        public AmountBreakDown(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount amount, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount dueAmount, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity gratuity, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal itemTotal, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount invoiceDiscount, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount itemDiscount, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal taxTotal, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount shippingAmount) {
            this.amount = amount;
            this.dueAmount = dueAmount;
            this.gratuity = gratuity;
            this.itemTotal = itemTotal;
            this.invoiceDiscount = invoiceDiscount;
            this.itemDiscount = itemDiscount;
            this.taxTotal = taxTotal;
            this.shippingAmount = shippingAmount;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount getDueAmount() {
            return this.dueAmount;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity getGratuity() {
            return this.gratuity;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal getItemTotal() {
            return this.itemTotal;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount getItemDiscount() {
            return this.itemDiscount;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal getTaxTotal() {
            return this.taxTotal;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount getShippingAmount() {
            return this.shippingAmount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount amount = this.amount;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount dueAmount = this.dueAmount;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity gratuity = this.gratuity;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal itemTotal = this.itemTotal;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount invoiceDiscount = this.invoiceDiscount;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount itemDiscount = this.itemDiscount;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal taxTotal = this.taxTotal;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount shippingAmount = this.shippingAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountBreakDown(amount=");
            sb.append(amount);
            sb.append(", dueAmount=");
            sb.append(dueAmount);
            sb.append(", gratuity=");
            sb.append(gratuity);
            sb.append(", itemTotal=");
            sb.append(itemTotal);
            sb.append(", invoiceDiscount=");
            sb.append(invoiceDiscount);
            sb.append(", itemDiscount=");
            sb.append(itemDiscount);
            sb.append(", taxTotal=");
            sb.append(taxTotal);
            sb.append(", shippingAmount=");
            sb.append(shippingAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount amount = this.amount;
            int hashCode = amount == null ? 0 : amount.hashCode();
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount dueAmount = this.dueAmount;
            int hashCode2 = dueAmount == null ? 0 : dueAmount.hashCode();
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity gratuity = this.gratuity;
            int hashCode3 = gratuity == null ? 0 : gratuity.hashCode();
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal itemTotal = this.itemTotal;
            int hashCode4 = itemTotal == null ? 0 : itemTotal.hashCode();
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount invoiceDiscount = this.invoiceDiscount;
            int hashCode5 = invoiceDiscount == null ? 0 : invoiceDiscount.hashCode();
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount itemDiscount = this.itemDiscount;
            int hashCode6 = itemDiscount == null ? 0 : itemDiscount.hashCode();
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal taxTotal = this.taxTotal;
            int hashCode7 = taxTotal == null ? 0 : taxTotal.hashCode();
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount shippingAmount = this.shippingAmount;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (shippingAmount != null ? shippingAmount.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.AmountBreakDown)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.AmountBreakDown amountBreakDown = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.AmountBreakDown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, amountBreakDown.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.dueAmount, amountBreakDown.dueAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.gratuity, amountBreakDown.gratuity) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemTotal, amountBreakDown.itemTotal) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceDiscount, amountBreakDown.invoiceDiscount) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemDiscount, amountBreakDown.itemDiscount) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxTotal, amountBreakDown.taxTotal) && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingAmount, amountBreakDown.shippingAmount);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.AmountBreakDown copy(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount amount, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount dueAmount, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity gratuity, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal itemTotal, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount invoiceDiscount, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount itemDiscount, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal taxTotal, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount shippingAmount) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.AmountBreakDown(amount, dueAmount, gratuity, itemTotal, invoiceDiscount, itemDiscount, taxTotal, shippingAmount);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount getShippingAmount() {
            return this.shippingAmount;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal getTaxTotal() {
            return this.taxTotal;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount getItemDiscount() {
            return this.itemDiscount;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal getItemTotal() {
            return this.itemTotal;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity getGratuity() {
            return this.gratuity;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount getDueAmount() {
            return this.dueAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount getAmount() {
            return this.amount;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Configuration;", "", "", "taxCalculatedAfterDiscount", "allowTip", "taxInclusive", "conditional", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Configuration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getTaxCalculatedAfterDiscount", "getAllowTip", "getTaxInclusive", "getConditional"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Configuration {
        public static final int $stable = 0;
        private final java.lang.Boolean allowTip;
        private final java.lang.Boolean conditional;
        private final java.lang.Boolean taxCalculatedAfterDiscount;
        private final java.lang.Boolean taxInclusive;

        public Configuration(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4) {
            this.taxCalculatedAfterDiscount = bool;
            this.allowTip = bool2;
            this.taxInclusive = bool3;
            this.conditional = bool4;
        }

        public final java.lang.Boolean getTaxCalculatedAfterDiscount() {
            return this.taxCalculatedAfterDiscount;
        }

        public final java.lang.Boolean getAllowTip() {
            return this.allowTip;
        }

        public final java.lang.Boolean getTaxInclusive() {
            return this.taxInclusive;
        }

        public final java.lang.Boolean getConditional() {
            return this.conditional;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.taxCalculatedAfterDiscount;
            java.lang.Boolean bool2 = this.allowTip;
            java.lang.Boolean bool3 = this.taxInclusive;
            java.lang.Boolean bool4 = this.conditional;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Configuration(taxCalculatedAfterDiscount=");
            sb.append(bool);
            sb.append(", allowTip=");
            sb.append(bool2);
            sb.append(", taxInclusive=");
            sb.append(bool3);
            sb.append(", conditional=");
            sb.append(bool4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.taxCalculatedAfterDiscount;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.allowTip;
            int hashCode2 = bool2 == null ? 0 : bool2.hashCode();
            java.lang.Boolean bool3 = this.taxInclusive;
            int hashCode3 = bool3 == null ? 0 : bool3.hashCode();
            java.lang.Boolean bool4 = this.conditional;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool4 != null ? bool4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration configuration = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.taxCalculatedAfterDiscount, configuration.taxCalculatedAfterDiscount) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowTip, configuration.allowTip) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxInclusive, configuration.taxInclusive) && kotlin.jvm.internal.Intrinsics.areEqual(this.conditional, configuration.conditional);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration copy(java.lang.Boolean taxCalculatedAfterDiscount, java.lang.Boolean allowTip, java.lang.Boolean taxInclusive, java.lang.Boolean conditional) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration(taxCalculatedAfterDiscount, allowTip, taxInclusive, conditional);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Boolean getConditional() {
            return this.conditional;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getTaxInclusive() {
            return this.taxInclusive;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getAllowTip() {
            return this.allowTip;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getTaxCalculatedAfterDiscount() {
            return this.taxCalculatedAfterDiscount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration configuration, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = configuration.taxCalculatedAfterDiscount;
            }
            if ((i & 2) != 0) {
                bool2 = configuration.allowTip;
            }
            if ((i & 4) != 0) {
                bool3 = configuration.taxInclusive;
            }
            if ((i & 8) != 0) {
                bool4 = configuration.conditional;
            }
            return configuration.copy(bool, bool2, bool3, bool4);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Payments;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountPaid;", "totalAmountPaid", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Transaction;", "transactions", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountPaid;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountPaid;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountPaid;Ljava/util/List;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Payments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountPaid;", "getTotalAmountPaid", "Ljava/util/List;", "getTransactions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Payments {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid totalAmountPaid;
        private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction> transactions;

        public Payments(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid totalAmountPaid, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction> list) {
            this.totalAmountPaid = totalAmountPaid;
            this.transactions = list;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid getTotalAmountPaid() {
            return this.totalAmountPaid;
        }

        public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction> getTransactions() {
            return this.transactions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid totalAmountPaid = this.totalAmountPaid;
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction> list = this.transactions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Payments(totalAmountPaid=");
            sb.append(totalAmountPaid);
            sb.append(", transactions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid totalAmountPaid = this.totalAmountPaid;
            int hashCode = totalAmountPaid == null ? 0 : totalAmountPaid.hashCode();
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction> list = this.transactions;
            return (hashCode * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments payments = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmountPaid, payments.totalAmountPaid) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactions, payments.transactions);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments copy(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid totalAmountPaid, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction> transactions) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments(totalAmountPaid, transactions);
        }

        public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction> component2() {
            return this.transactions;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid getTotalAmountPaid() {
            return this.totalAmountPaid;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments payments, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid totalAmountPaid, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                totalAmountPaid = payments.totalAmountPaid;
            }
            if ((i & 2) != 0) {
                list = payments.transactions;
            }
            return payments.copy(totalAmountPaid, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Refunds;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountRefunded;", "totalAmountRefunded", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Transaction1;", "transactions", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountRefunded;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountRefunded;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountRefunded;Ljava/util/List;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Refunds;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountRefunded;", "getTotalAmountRefunded", "Ljava/util/List;", "getTransactions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Refunds {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded totalAmountRefunded;
        private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1> transactions;

        public Refunds(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded totalAmountRefunded, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1> list) {
            this.totalAmountRefunded = totalAmountRefunded;
            this.transactions = list;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded getTotalAmountRefunded() {
            return this.totalAmountRefunded;
        }

        public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1> getTransactions() {
            return this.transactions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded totalAmountRefunded = this.totalAmountRefunded;
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1> list = this.transactions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Refunds(totalAmountRefunded=");
            sb.append(totalAmountRefunded);
            sb.append(", transactions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded totalAmountRefunded = this.totalAmountRefunded;
            int hashCode = totalAmountRefunded == null ? 0 : totalAmountRefunded.hashCode();
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1> list = this.transactions;
            return (hashCode * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds refunds = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmountRefunded, refunds.totalAmountRefunded) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactions, refunds.transactions);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds copy(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded totalAmountRefunded, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1> transactions) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds(totalAmountRefunded, transactions);
        }

        public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1> component2() {
            return this.transactions;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded getTotalAmountRefunded() {
            return this.totalAmountRefunded;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds refunds, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded totalAmountRefunded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                totalAmountRefunded = refunds.totalAmountRefunded;
            }
            if ((i & 2) != 0) {
                list = refunds.transactions;
            }
            return refunds.copy(totalAmountRefunded, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$PaymentTerm;", "", "", "dueDate", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$PaymentTerm;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDueDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentTerm {
        public static final int $stable = 0;
        private final java.lang.String dueDate;

        public PaymentTerm(java.lang.String str) {
            this.dueDate = str;
        }

        public final java.lang.String getDueDate() {
            return this.dueDate;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.dueDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTerm(dueDate=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.dueDate;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm) && kotlin.jvm.internal.Intrinsics.areEqual(this.dueDate, ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm) other).dueDate);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm copy(java.lang.String dueDate) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm(dueDate);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDueDate() {
            return this.dueDate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm paymentTerm, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentTerm.dueDate;
            }
            return paymentTerm.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\rR$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$BillingDetails;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Name;", "name", "email", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Phone;", "phones", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Name;Ljava/lang/Object;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Name;", "component2", "()Ljava/lang/Object;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Name;Ljava/lang/Object;Ljava/util/List;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$BillingDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Name;", "getName", "Ljava/lang/Object;", "getEmail", "Ljava/util/List;", "getPhones"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BillingDetails {
        public static final int $stable = 8;
        private final java.lang.Object email;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name name;
        private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone> phones;

        public BillingDetails(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name name2, java.lang.Object obj, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone> list) {
            this.name = name2;
            this.email = obj;
            this.phones = list;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name getName() {
            return this.name;
        }

        public final java.lang.Object getEmail() {
            return this.email;
        }

        public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone> getPhones() {
            return this.phones;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name name2 = this.name;
            java.lang.Object obj = this.email;
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone> list = this.phones;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BillingDetails(name=");
            sb.append(name2);
            sb.append(", email=");
            sb.append(obj);
            sb.append(", phones=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name name2 = this.name;
            int hashCode = name2 == null ? 0 : name2.hashCode();
            java.lang.Object obj = this.email;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone> list = this.phones;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails billingDetails = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, billingDetails.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, billingDetails.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.phones, billingDetails.phones);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails copy(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name name2, java.lang.Object email, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone> phones) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails(name2, email, phones);
        }

        public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone> component3() {
            return this.phones;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getEmail() {
            return this.email;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name getName() {
            return this.name;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails billingDetails, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name name2, java.lang.Object obj, java.util.List list, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                name2 = billingDetails.name;
            }
            if ((i & 2) != 0) {
                obj = billingDetails.email;
            }
            if ((i & 4) != 0) {
                list = billingDetails.phones;
            }
            return billingDetails.copy(name2, obj, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Name;", "", "", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGivenName", "getSurname"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Name {
        public static final int $stable = 0;
        private final java.lang.String givenName;
        private final java.lang.String surname;

        public Name(java.lang.String str, java.lang.String str2) {
            this.givenName = str;
            this.surname = str2;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.givenName;
            java.lang.String str2 = this.surname;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(givenName=");
            sb.append(str);
            sb.append(", surname=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.givenName;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.surname;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name name2 = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, name2.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, name2.surname);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name copy(java.lang.String givenName, java.lang.String surname) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name(givenName, surname);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name name2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name2.givenName;
            }
            if ((i & 2) != 0) {
                str2 = name2.surname;
            }
            return name2.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Phone;", "", "", "countryCode", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Phone;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "getNationalNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Phone {
        public static final int $stable = 0;
        private final java.lang.String countryCode;
        private final java.lang.String nationalNumber;

        public Phone(java.lang.String str, java.lang.String str2) {
            this.countryCode = str;
            this.nationalNumber = str2;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getNationalNumber() {
            return this.nationalNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.countryCode;
            java.lang.String str2 = this.nationalNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Phone(countryCode=");
            sb.append(str);
            sb.append(", nationalNumber=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.countryCode;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.nationalNumber;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone phone = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, phone.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.nationalNumber, phone.nationalNumber);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone copy(java.lang.String countryCode, java.lang.String nationalNumber) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone(countryCode, nationalNumber);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNationalNumber() {
            return this.nationalNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone phone, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = phone.countryCode;
            }
            if ((i & 2) != 0) {
                str2 = phone.nationalNumber;
            }
            return phone.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Item1;", "", "", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Price;", "price", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Price;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Price;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Price;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Item1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getDescription", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Price;", "getPrice"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item1 {
        public static final int $stable = 8;
        private final java.lang.String description;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price price;

        public Item1(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price price) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(price, "");
            this.name = str;
            this.description = str2;
            this.price = price;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price getPrice() {
            return this.price;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.description;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price price = this.price;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item1(name=");
            sb.append(str);
            sb.append(", description=");
            sb.append(str2);
            sb.append(", price=");
            sb.append(price);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.String str = this.description;
            return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.price.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 item1 = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, item1.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, item1.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.price, item1.price);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 copy(java.lang.String name2, java.lang.String description, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price price) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(price, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1(name2, description, price);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price getPrice() {
            return this.price;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 item1, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price price, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item1.name;
            }
            if ((i & 2) != 0) {
                str2 = item1.description;
            }
            if ((i & 4) != 0) {
                price = item1.price;
            }
            return item1.copy(str, str2, price);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Price;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Price;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Price {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;

        public Price(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Price(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price price = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, price.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, price.moneyFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price price, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = price.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = price.moneyFragment;
            }
            return price.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;

        public Amount(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount amount = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, amount.moneyFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount amount, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = amount.moneyFragment;
            }
            return amount.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$DueAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$DueAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DueAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;

        public DueAmount(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DueAmount(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount dueAmount = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, dueAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, dueAmount.moneyFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount dueAmount, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dueAmount.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = dueAmount.moneyFragment;
            }
            return dueAmount.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Gratuity;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Gratuity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Gratuity {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;

        public Gratuity(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Gratuity(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity gratuity = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, gratuity.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, gratuity.moneyFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity gratuity, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = gratuity.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = gratuity.moneyFragment;
            }
            return gratuity.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemTotal;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemTotal;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ItemTotal {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;

        public ItemTotal(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ItemTotal(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal itemTotal = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, itemTotal.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, itemTotal.moneyFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal itemTotal, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = itemTotal.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = itemTotal.moneyFragment;
            }
            return itemTotal.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$InvoiceDiscount;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$InvoiceDiscount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvoiceDiscount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;

        public InvoiceDiscount(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceDiscount(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount invoiceDiscount = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, invoiceDiscount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, invoiceDiscount.moneyFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.InvoiceDiscount invoiceDiscount, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invoiceDiscount.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = invoiceDiscount.moneyFragment;
            }
            return invoiceDiscount.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemDiscount;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ItemDiscount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ItemDiscount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;

        public ItemDiscount(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ItemDiscount(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount itemDiscount = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, itemDiscount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, itemDiscount.moneyFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount itemDiscount, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = itemDiscount.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = itemDiscount.moneyFragment;
            }
            return itemDiscount.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TaxTotal;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TaxTotal;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxTotal {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;

        public TaxTotal(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxTotal(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal taxTotal = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, taxTotal.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, taxTotal.moneyFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal taxTotal, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taxTotal.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = taxTotal.moneyFragment;
            }
            return taxTotal.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ShippingAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$ShippingAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShippingAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;

        public ShippingAmount(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShippingAmount(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount shippingAmount = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, shippingAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, shippingAmount.moneyFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount shippingAmount, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = shippingAmount.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = shippingAmount.moneyFragment;
            }
            return shippingAmount.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountPaid;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountPaid;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalAmountPaid {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;

        public TotalAmountPaid(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAmountPaid(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid totalAmountPaid = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalAmountPaid.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, totalAmountPaid.moneyFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid totalAmountPaid, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalAmountPaid.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = totalAmountPaid.moneyFragment;
            }
            return totalAmountPaid.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Transaction;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment;", "invoiceTransactionFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Transaction;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment;", "getInvoiceTransactionFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Transaction {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment;

        public Transaction(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceTransactionFragment, "");
            this.__typename = str;
            this.invoiceTransactionFragment = invoiceTransactionFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment getInvoiceTransactionFragment() {
            return this.invoiceTransactionFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment = this.invoiceTransactionFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Transaction(__typename=");
            sb.append(str);
            sb.append(", invoiceTransactionFragment=");
            sb.append(invoiceTransactionFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.invoiceTransactionFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction transaction = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, transaction.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceTransactionFragment, transaction.invoiceTransactionFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceTransactionFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction(__typename, invoiceTransactionFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment getInvoiceTransactionFragment() {
            return this.invoiceTransactionFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction transaction, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = transaction.__typename;
            }
            if ((i & 2) != 0) {
                invoiceTransactionFragment = transaction.invoiceTransactionFragment;
            }
            return transaction.copy(str, invoiceTransactionFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountRefunded;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$TotalAmountRefunded;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalAmountRefunded {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;

        public TotalAmountRefunded(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAmountRefunded(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded totalAmountRefunded = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalAmountRefunded.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, totalAmountRefunded.moneyFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded totalAmountRefunded, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalAmountRefunded.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = totalAmountRefunded.moneyFragment;
            }
            return totalAmountRefunded.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Transaction1;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment;", "invoiceTransactionFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment$Transaction1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment;", "getInvoiceTransactionFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Transaction1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment;

        public Transaction1(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceTransactionFragment, "");
            this.__typename = str;
            this.invoiceTransactionFragment = invoiceTransactionFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment getInvoiceTransactionFragment() {
            return this.invoiceTransactionFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment = this.invoiceTransactionFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Transaction1(__typename=");
            sb.append(str);
            sb.append(", invoiceTransactionFragment=");
            sb.append(invoiceTransactionFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.invoiceTransactionFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1 transaction1 = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, transaction1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceTransactionFragment, transaction1.invoiceTransactionFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1 copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceTransactionFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1(__typename, invoiceTransactionFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment getInvoiceTransactionFragment() {
            return this.invoiceTransactionFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1 copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1 transaction1, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = transaction1.__typename;
            }
            if ((i & 2) != 0) {
                invoiceTransactionFragment = transaction1.invoiceTransactionFragment;
            }
            return transaction1.copy(str, invoiceTransactionFragment);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus = this.status;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail detail = this.detail;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient> list = this.primaryRecipients;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item> list2 = this.items;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.AmountBreakDown amountBreakDown = this.amountBreakDown;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration configuration = this.configuration;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments payments = this.payments;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds refunds = this.refunds;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceFragment(id=");
        sb.append(str);
        sb.append(", status=");
        sb.append(invoiceStatus);
        sb.append(", detail=");
        sb.append(detail);
        sb.append(", primaryRecipients=");
        sb.append(list);
        sb.append(", items=");
        sb.append(list2);
        sb.append(", amountBreakDown=");
        sb.append(amountBreakDown);
        sb.append(", configuration=");
        sb.append(configuration);
        sb.append(", payments=");
        sb.append(payments);
        sb.append(", refunds=");
        sb.append(refunds);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.status.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail detail = this.detail;
        int hashCode3 = detail == null ? 0 : detail.hashCode();
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient> list = this.primaryRecipients;
        int hashCode4 = list == null ? 0 : list.hashCode();
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item> list2 = this.items;
        int hashCode5 = list2 == null ? 0 : list2.hashCode();
        int hashCode6 = this.amountBreakDown.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration configuration = this.configuration;
        int hashCode7 = configuration == null ? 0 : configuration.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments payments = this.payments;
        int hashCode8 = payments == null ? 0 : payments.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds refunds = this.refunds;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (refunds != null ? refunds.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, invoiceFragment.id) && this.status == invoiceFragment.status && kotlin.jvm.internal.Intrinsics.areEqual(this.detail, invoiceFragment.detail) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryRecipients, invoiceFragment.primaryRecipients) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, invoiceFragment.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountBreakDown, invoiceFragment.amountBreakDown) && kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, invoiceFragment.configuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.payments, invoiceFragment.payments) && kotlin.jvm.internal.Intrinsics.areEqual(this.refunds, invoiceFragment.refunds);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus status, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail detail, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient> primaryRecipients, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item> items, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.AmountBreakDown amountBreakDown, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration configuration, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments payments, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds refunds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountBreakDown, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment(id, status, detail, primaryRecipients, items, amountBreakDown, configuration, payments, refunds);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds getRefunds() {
        return this.refunds;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments getPayments() {
        return this.payments;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.AmountBreakDown getAmountBreakDown() {
        return this.amountBreakDown;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item> component5() {
        return this.items;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient> component4() {
        return this.primaryRecipients;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail getDetail() {
        return this.detail;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
