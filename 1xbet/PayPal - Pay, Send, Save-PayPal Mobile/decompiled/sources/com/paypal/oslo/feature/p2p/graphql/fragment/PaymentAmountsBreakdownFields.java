package com.paypal.oslo.feature.p2p.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001:\t!\"#$%&'()B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Sender;", "sender", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Receiver;", "receiver", "", "__typename", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Sender;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Receiver;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Sender;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Receiver;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Sender;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Receiver;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Sender;", "getSender", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Receiver;", "getReceiver", "Ljava/lang/String;", "get__typename", "Sender", "Receiver", "AmountSent", "TotalFee", "FeeBreakdown", "InstrumentFees", "CrossBorderFees", "TotalAmountSent", "AmountReceived"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentAmountsBreakdownFields implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver receiver;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender sender;

    public PaymentAmountsBreakdownFields(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender sender, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver receiver, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sender, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.sender = sender;
        this.receiver = receiver;
        this.__typename = str;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender getSender() {
        return this.sender;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver getReceiver() {
        return this.receiver;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Sender;", "", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountSent;", "amountSent", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalFee;", "totalFee", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$FeeBreakdown;", "feeBreakdown", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalAmountSent;", "totalAmountSent", "", "__typename", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountSent;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalFee;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$FeeBreakdown;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalAmountSent;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountSent;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalFee;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$FeeBreakdown;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalAmountSent;", "component5", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountSent;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalFee;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$FeeBreakdown;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalAmountSent;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Sender;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountSent;", "getAmountSent", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalFee;", "getTotalFee", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$FeeBreakdown;", "getFeeBreakdown", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalAmountSent;", "getTotalAmountSent", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Sender {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent amountSent;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown feeBreakdown;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent totalAmountSent;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee totalFee;

        public Sender(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent amountSent, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee totalFee, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown feeBreakdown, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent totalAmountSent, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountSent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalFee, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmountSent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amountSent = amountSent;
            this.totalFee = totalFee;
            this.feeBreakdown = feeBreakdown;
            this.totalAmountSent = totalAmountSent;
            this.__typename = str;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent getAmountSent() {
            return this.amountSent;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee getTotalFee() {
            return this.totalFee;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown getFeeBreakdown() {
            return this.feeBreakdown;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent getTotalAmountSent() {
            return this.totalAmountSent;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent amountSent = this.amountSent;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee totalFee = this.totalFee;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown feeBreakdown = this.feeBreakdown;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent totalAmountSent = this.totalAmountSent;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Sender(amountSent=");
            sb.append(amountSent);
            sb.append(", totalFee=");
            sb.append(totalFee);
            sb.append(", feeBreakdown=");
            sb.append(feeBreakdown);
            sb.append(", totalAmountSent=");
            sb.append(totalAmountSent);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amountSent.hashCode();
            int hashCode2 = this.totalFee.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown feeBreakdown = this.feeBreakdown;
            return (((((((hashCode * 31) + hashCode2) * 31) + (feeBreakdown == null ? 0 : feeBreakdown.hashCode())) * 31) + this.totalAmountSent.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender sender = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amountSent, sender.amountSent) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalFee, sender.totalFee) && kotlin.jvm.internal.Intrinsics.areEqual(this.feeBreakdown, sender.feeBreakdown) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmountSent, sender.totalAmountSent) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, sender.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender copy(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent amountSent, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee totalFee, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown feeBreakdown, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent totalAmountSent, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountSent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalFee, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmountSent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender(amountSent, totalFee, feeBreakdown, totalAmountSent, __typename);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent getTotalAmountSent() {
            return this.totalAmountSent;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown getFeeBreakdown() {
            return this.feeBreakdown;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee getTotalFee() {
            return this.totalFee;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent getAmountSent() {
            return this.amountSent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender sender, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent amountSent, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee totalFee, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown feeBreakdown, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent totalAmountSent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amountSent = sender.amountSent;
            }
            if ((i & 2) != 0) {
                totalFee = sender.totalFee;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee totalFee2 = totalFee;
            if ((i & 4) != 0) {
                feeBreakdown = sender.feeBreakdown;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown feeBreakdown2 = feeBreakdown;
            if ((i & 8) != 0) {
                totalAmountSent = sender.totalAmountSent;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent totalAmountSent2 = totalAmountSent;
            if ((i & 16) != 0) {
                str = sender.__typename;
            }
            return sender.copy(amountSent, totalFee2, feeBreakdown2, totalAmountSent2, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Receiver;", "", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountReceived;", "amountReceived", "", "__typename", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountReceived;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountReceived;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountReceived;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$Receiver;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountReceived;", "getAmountReceived", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Receiver {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived amountReceived;

        public Receiver(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived amountReceived, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountReceived, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amountReceived = amountReceived;
            this.__typename = str;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived getAmountReceived() {
            return this.amountReceived;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived amountReceived = this.amountReceived;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Receiver(amountReceived=");
            sb.append(amountReceived);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.amountReceived.hashCode() * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver receiver = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amountReceived, receiver.amountReceived) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, receiver.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver copy(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived amountReceived, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountReceived, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver(amountReceived, __typename);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived getAmountReceived() {
            return this.amountReceived;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver receiver, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived amountReceived, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amountReceived = receiver.amountReceived;
            }
            if ((i & 2) != 0) {
                str = receiver.__typename;
            }
            return receiver.copy(amountReceived, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountSent;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountSent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountSent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public AmountSent(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.currencyCode = obj;
            this.value = str;
            this.__typename = str2;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountSent(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.currencyCode.hashCode() * 31) + this.value.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent amountSent = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amountSent.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amountSent.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amountSent.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent(currencyCode, value, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountSent amountSent, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amountSent.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amountSent.value;
            }
            if ((i & 4) != 0) {
                str2 = amountSent.__typename;
            }
            return amountSent.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalFee;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalFee;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalFee {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalFee(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.currencyCode = obj;
            this.value = str;
            this.__typename = str2;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalFee(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.currencyCode.hashCode() * 31) + this.value.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee totalFee = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalFee.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalFee.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalFee.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee(currencyCode, value, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalFee totalFee, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalFee.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalFee.value;
            }
            if ((i & 4) != 0) {
                str2 = totalFee.__typename;
            }
            return totalFee.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$FeeBreakdown;", "", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$InstrumentFees;", "instrumentFees", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$CrossBorderFees;", "crossBorderFees", "", "__typename", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$InstrumentFees;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$CrossBorderFees;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$InstrumentFees;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$CrossBorderFees;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$InstrumentFees;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$CrossBorderFees;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$FeeBreakdown;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$InstrumentFees;", "getInstrumentFees", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$CrossBorderFees;", "getCrossBorderFees", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FeeBreakdown {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees crossBorderFees;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees instrumentFees;

        public FeeBreakdown(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees instrumentFees, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees crossBorderFees, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.instrumentFees = instrumentFees;
            this.crossBorderFees = crossBorderFees;
            this.__typename = str;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees getInstrumentFees() {
            return this.instrumentFees;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees getCrossBorderFees() {
            return this.crossBorderFees;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees instrumentFees = this.instrumentFees;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees crossBorderFees = this.crossBorderFees;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FeeBreakdown(instrumentFees=");
            sb.append(instrumentFees);
            sb.append(", crossBorderFees=");
            sb.append(crossBorderFees);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees instrumentFees = this.instrumentFees;
            int hashCode = instrumentFees == null ? 0 : instrumentFees.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees crossBorderFees = this.crossBorderFees;
            return (((hashCode * 31) + (crossBorderFees != null ? crossBorderFees.hashCode() : 0)) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown feeBreakdown = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentFees, feeBreakdown.instrumentFees) && kotlin.jvm.internal.Intrinsics.areEqual(this.crossBorderFees, feeBreakdown.crossBorderFees) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, feeBreakdown.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown copy(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees instrumentFees, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees crossBorderFees, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown(instrumentFees, crossBorderFees, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees getCrossBorderFees() {
            return this.crossBorderFees;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees getInstrumentFees() {
            return this.instrumentFees;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.FeeBreakdown feeBreakdown, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees instrumentFees, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees crossBorderFees, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                instrumentFees = feeBreakdown.instrumentFees;
            }
            if ((i & 2) != 0) {
                crossBorderFees = feeBreakdown.crossBorderFees;
            }
            if ((i & 4) != 0) {
                str = feeBreakdown.__typename;
            }
            return feeBreakdown.copy(instrumentFees, crossBorderFees, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$InstrumentFees;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$InstrumentFees;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InstrumentFees {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public InstrumentFees(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.currencyCode = obj;
            this.value = str;
            this.__typename = str2;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InstrumentFees(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.currencyCode.hashCode() * 31) + this.value.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees instrumentFees = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, instrumentFees.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, instrumentFees.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, instrumentFees.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees(currencyCode, value, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.InstrumentFees instrumentFees, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = instrumentFees.currencyCode;
            }
            if ((i & 2) != 0) {
                str = instrumentFees.value;
            }
            if ((i & 4) != 0) {
                str2 = instrumentFees.__typename;
            }
            return instrumentFees.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$CrossBorderFees;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$CrossBorderFees;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CrossBorderFees {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public CrossBorderFees(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.currencyCode = obj;
            this.value = str;
            this.__typename = str2;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CrossBorderFees(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.currencyCode.hashCode() * 31) + this.value.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees crossBorderFees = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, crossBorderFees.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, crossBorderFees.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, crossBorderFees.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees(currencyCode, value, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.CrossBorderFees crossBorderFees, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = crossBorderFees.currencyCode;
            }
            if ((i & 2) != 0) {
                str = crossBorderFees.value;
            }
            if ((i & 4) != 0) {
                str2 = crossBorderFees.__typename;
            }
            return crossBorderFees.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalAmountSent;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$TotalAmountSent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalAmountSent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalAmountSent(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.currencyCode = obj;
            this.value = str;
            this.__typename = str2;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAmountSent(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.currencyCode.hashCode() * 31) + this.value.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent totalAmountSent = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalAmountSent.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalAmountSent.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalAmountSent.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent(currencyCode, value, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.TotalAmountSent totalAmountSent, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalAmountSent.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalAmountSent.value;
            }
            if ((i & 4) != 0) {
                str2 = totalAmountSent.__typename;
            }
            return totalAmountSent.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountReceived;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentAmountsBreakdownFields$AmountReceived;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountReceived {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public AmountReceived(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.currencyCode = obj;
            this.value = str;
            this.__typename = str2;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountReceived(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.currencyCode.hashCode() * 31) + this.value.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived amountReceived = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amountReceived.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amountReceived.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amountReceived.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived(currencyCode, value, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.AmountReceived amountReceived, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amountReceived.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amountReceived.value;
            }
            if ((i & 4) != 0) {
                str2 = amountReceived.__typename;
            }
            return amountReceived.copy(obj, str, str2);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender sender = this.sender;
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver receiver = this.receiver;
        java.lang.String str = this.__typename;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentAmountsBreakdownFields(sender=");
        sb.append(sender);
        sb.append(", receiver=");
        sb.append(receiver);
        sb.append(", __typename=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.sender.hashCode() * 31) + this.receiver.hashCode()) * 31) + this.__typename.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields paymentAmountsBreakdownFields = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sender, paymentAmountsBreakdownFields.sender) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiver, paymentAmountsBreakdownFields.receiver) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentAmountsBreakdownFields.__typename);
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields copy(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender sender, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver receiver, java.lang.String __typename) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sender, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields(sender, receiver, __typename);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver getReceiver() {
        return this.receiver;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender getSender() {
        return this.sender;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields paymentAmountsBreakdownFields, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Sender sender, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentAmountsBreakdownFields.Receiver receiver, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sender = paymentAmountsBreakdownFields.sender;
        }
        if ((i & 2) != 0) {
            receiver = paymentAmountsBreakdownFields.receiver;
        }
        if ((i & 4) != 0) {
            str = paymentAmountsBreakdownFields.__typename;
        }
        return paymentAmountsBreakdownFields.copy(sender, receiver, str);
    }
}
