package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;", "", "<init>", "()V", com.paypal.oslo.feature.p2p.api.navigation.SendTabConfiguration.PARENT_NAME, "Request", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult$Request;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult$Send;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class PaymentTransferResult {
    public static final int $stable = 0;

    private PaymentTransferResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0014R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult$Send;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;", "", "id", "createTime", "status", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "amount", "", "Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;", "disclosures", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;", "paymentLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "component5", "()Ljava/util/List;", "component6", "()Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult$Send;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getCreateTime", "getStatus", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "getAmount", "Ljava/util/List;", "getDisclosures", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;", "getPaymentLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Send extends com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.domain.model.Amount amount;
        private final java.lang.String createTime;
        private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> disclosures;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink;
        private final java.lang.String status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Send(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.domain.model.Amount amount, java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> list, com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = str;
            this.createTime = str2;
            this.status = str3;
            this.amount = amount;
            this.disclosures = list;
            this.paymentLink = paymentLink;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getCreateTime() {
            return this.createTime;
        }

        public final java.lang.String getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmount() {
            return this.amount;
        }

        public /* synthetic */ Send(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.domain.model.Amount amount, java.util.List list, com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, amount, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : paymentLink);
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> getDisclosures() {
            return this.disclosures;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentLink getPaymentLink() {
            return this.paymentLink;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.createTime;
            java.lang.String str3 = this.status;
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.amount;
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> list = this.disclosures;
            com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink = this.paymentLink;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Send(id=");
            sb.append(str);
            sb.append(", createTime=");
            sb.append(str2);
            sb.append(", status=");
            sb.append(str3);
            sb.append(", amount=");
            sb.append(amount);
            sb.append(", disclosures=");
            sb.append(list);
            sb.append(", paymentLink=");
            sb.append(paymentLink);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.createTime.hashCode();
            int hashCode3 = this.status.hashCode();
            int hashCode4 = this.amount.hashCode();
            int hashCode5 = this.disclosures.hashCode();
            com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink = this.paymentLink;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (paymentLink == null ? 0 : paymentLink.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send send = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, send.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.createTime, send.createTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, send.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, send.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.disclosures, send.disclosures) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentLink, send.paymentLink);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send copy(java.lang.String id, java.lang.String createTime, java.lang.String status, com.paypal.oslo.feature.p2p.domain.model.Amount amount, java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> disclosures, com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createTime, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disclosures, "");
            return new com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send(id, createTime, status, amount, disclosures, paymentLink);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PaymentLink getPaymentLink() {
            return this.paymentLink;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> component5() {
            return this.disclosures;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCreateTime() {
            return this.createTime;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send copy$default(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send send, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.domain.model.Amount amount, java.util.List list, com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = send.id;
            }
            if ((i & 2) != 0) {
                str2 = send.createTime;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = send.status;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                amount = send.amount;
            }
            com.paypal.oslo.feature.p2p.domain.model.Amount amount2 = amount;
            if ((i & 16) != 0) {
                list = send.disclosures;
            }
            java.util.List list2 = list;
            if ((i & 32) != 0) {
                paymentLink = send.paymentLink;
            }
            return send.copy(str, str4, str5, amount2, list2, paymentLink);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0014R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult$Request;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;", "", "id", "createTime", "status", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "amount", "", "Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;", "disclosures", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;", "paymentLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "component5", "()Ljava/util/List;", "component6", "()Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult$Request;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getCreateTime", "getStatus", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "getAmount", "Ljava/util/List;", "getDisclosures", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;", "getPaymentLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request extends com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.domain.model.Amount amount;
        private final java.lang.String createTime;
        private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> disclosures;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink;
        private final java.lang.String status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Request(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.domain.model.Amount amount, java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> list, com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = str;
            this.createTime = str2;
            this.status = str3;
            this.amount = amount;
            this.disclosures = list;
            this.paymentLink = paymentLink;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getCreateTime() {
            return this.createTime;
        }

        public final java.lang.String getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmount() {
            return this.amount;
        }

        public /* synthetic */ Request(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.domain.model.Amount amount, java.util.List list, com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, amount, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : paymentLink);
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> getDisclosures() {
            return this.disclosures;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentLink getPaymentLink() {
            return this.paymentLink;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.createTime;
            java.lang.String str3 = this.status;
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.amount;
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> list = this.disclosures;
            com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink = this.paymentLink;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(id=");
            sb.append(str);
            sb.append(", createTime=");
            sb.append(str2);
            sb.append(", status=");
            sb.append(str3);
            sb.append(", amount=");
            sb.append(amount);
            sb.append(", disclosures=");
            sb.append(list);
            sb.append(", paymentLink=");
            sb.append(paymentLink);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.createTime.hashCode();
            int hashCode3 = this.status.hashCode();
            int hashCode4 = this.amount.hashCode();
            int hashCode5 = this.disclosures.hashCode();
            com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink = this.paymentLink;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (paymentLink == null ? 0 : paymentLink.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request request = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, request.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.createTime, request.createTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, request.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, request.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.disclosures, request.disclosures) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentLink, request.paymentLink);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request copy(java.lang.String id, java.lang.String createTime, java.lang.String status, com.paypal.oslo.feature.p2p.domain.model.Amount amount, java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> disclosures, com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createTime, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disclosures, "");
            return new com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request(id, createTime, status, amount, disclosures, paymentLink);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PaymentLink getPaymentLink() {
            return this.paymentLink;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> component5() {
            return this.disclosures;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCreateTime() {
            return this.createTime;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request copy$default(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request request, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.domain.model.Amount amount, java.util.List list, com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = request.id;
            }
            if ((i & 2) != 0) {
                str2 = request.createTime;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = request.status;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                amount = request.amount;
            }
            com.paypal.oslo.feature.p2p.domain.model.Amount amount2 = amount;
            if ((i & 16) != 0) {
                list = request.disclosures;
            }
            java.util.List list2 = list;
            if ((i & 32) != 0) {
                paymentLink = request.paymentLink;
            }
            return request.copy(str, str4, str5, amount2, list2, paymentLink);
        }
    }

    public /* synthetic */ PaymentTransferResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
