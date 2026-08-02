package com.paypal.oslo.feature.moneymovement.api.success;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/success/PostTransactionDisclosure;", "", "", "p0", "<init>", "(I)V", "priority", com.visa.cbp.getEncExpo.warmup, "getPriority", "()I", "PaymentLinkDisclosure", "Lcom/paypal/oslo/feature/moneymovement/api/success/PostTransactionDisclosure$PaymentLinkDisclosure;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PostTransactionDisclosure {
    public static final int $stable = 0;
    private final int priority;

    private PostTransactionDisclosure(int i) {
        this.priority = i;
    }

    public int getPriority() {
        return this.priority;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/success/PostTransactionDisclosure$PaymentLinkDisclosure;", "Lcom/paypal/oslo/feature/moneymovement/api/success/PostTransactionDisclosure;", "", "priority", "Lkotlin/time/Instant;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, "<init>", "(ILkotlin/time/Instant;)V", "component1", "()I", "component2", "()Lkotlin/time/Instant;", "copy", "(ILkotlin/time/Instant;)Lcom/paypal/oslo/feature/moneymovement/api/success/PostTransactionDisclosure$PaymentLinkDisclosure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPriority", "Lkotlin/time/Instant;", "getExpiryDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentLinkDisclosure extends com.paypal.oslo.feature.moneymovement.api.success.PostTransactionDisclosure {
        public static final int $stable = 0;
        private final kotlin.time.Instant expiryDate;
        private final int priority;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentLinkDisclosure(int i, kotlin.time.Instant instant) {
            super(i, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
            this.priority = i;
            this.expiryDate = instant;
        }

        @Override // com.paypal.oslo.feature.moneymovement.api.success.PostTransactionDisclosure
        public final int getPriority() {
            return this.priority;
        }

        public final kotlin.time.Instant getExpiryDate() {
            return this.expiryDate;
        }

        public final java.lang.String toString() {
            int i = this.priority;
            kotlin.time.Instant instant = this.expiryDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentLinkDisclosure(priority=");
            sb.append(i);
            sb.append(", expiryDate=");
            sb.append(instant);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.priority) * 31) + this.expiryDate.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.success.PostTransactionDisclosure.PaymentLinkDisclosure)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.api.success.PostTransactionDisclosure.PaymentLinkDisclosure paymentLinkDisclosure = (com.paypal.oslo.feature.moneymovement.api.success.PostTransactionDisclosure.PaymentLinkDisclosure) other;
            return this.priority == paymentLinkDisclosure.priority && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryDate, paymentLinkDisclosure.expiryDate);
        }

        public final com.paypal.oslo.feature.moneymovement.api.success.PostTransactionDisclosure.PaymentLinkDisclosure copy(int priority, kotlin.time.Instant expiryDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiryDate, "");
            return new com.paypal.oslo.feature.moneymovement.api.success.PostTransactionDisclosure.PaymentLinkDisclosure(priority, expiryDate);
        }

        /* renamed from: component2, reason: from getter */
        public final kotlin.time.Instant getExpiryDate() {
            return this.expiryDate;
        }

        /* renamed from: component1, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.success.PostTransactionDisclosure.PaymentLinkDisclosure copy$default(com.paypal.oslo.feature.moneymovement.api.success.PostTransactionDisclosure.PaymentLinkDisclosure paymentLinkDisclosure, int i, kotlin.time.Instant instant, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = paymentLinkDisclosure.priority;
            }
            if ((i2 & 2) != 0) {
                instant = paymentLinkDisclosure.expiryDate;
            }
            return paymentLinkDisclosure.copy(i, instant);
        }
    }

    public /* synthetic */ PostTransactionDisclosure(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
