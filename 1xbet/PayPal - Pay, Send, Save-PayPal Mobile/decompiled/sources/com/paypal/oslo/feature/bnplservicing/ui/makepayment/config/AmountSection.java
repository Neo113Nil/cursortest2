package com.paypal.oslo.feature.bnplservicing.ui.makepayment.config;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/config/AmountSection;", "", "Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/config/AmountSection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;", "getCtx", "getEditableAmount", "()Z", "editableAmount", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/config/NextPaymentAmount;", "nextPaymentAmount$delegate", "Lkotlin/Lazy;", "getNextPaymentAmount", "()Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/config/NextPaymentAmount;", "nextPaymentAmount", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/config/PayOffAmount;", "payOffAmount$delegate", "getPayOffAmount", "()Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/config/PayOffAmount;", "payOffAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AmountSection {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.config.ConfigContext ctx;

    /* renamed from: nextPaymentAmount$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy nextPaymentAmount;

    /* renamed from: payOffAmount$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy payOffAmount;

    public AmountSection(com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.ctx = configContext;
        this.nextPaymentAmount = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection.$r8$lambda$0cxn_uomqn97oWQmzlE8pSq_1nE(com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection.this);
            }
        });
        this.payOffAmount = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection.m12602$r8$lambda$3fHIGDs1vvEL4X275DcOpiwKOg(com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection.this);
            }
        });
    }

    public final com.paypal.oslo.feature.bnplservicing.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final boolean getEditableAmount() {
        return com.paypal.oslo.feature.bnplservicing.config.ConfigContextKt.isAvailableFor(this.ctx.getCountry(), com.paypal.oslo.feature.bnplservicing.config.Country.US);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.NextPaymentAmount getNextPaymentAmount() {
        return (com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.NextPaymentAmount) this.nextPaymentAmount.getValue();
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.PayOffAmount getPayOffAmount() {
        return (com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.PayOffAmount) this.payOffAmount.getValue();
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.NextPaymentAmount $r8$lambda$0cxn_uomqn97oWQmzlE8pSq_1nE(com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection amountSection) {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.NextPaymentAmount(amountSection.ctx);
    }

    /* renamed from: $r8$lambda$3fHIGDs1vvEL4-X275DcOpiwKOg, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.PayOffAmount m12602$r8$lambda$3fHIGDs1vvEL4X275DcOpiwKOg(com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection amountSection) {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.PayOffAmount(amountSection.ctx);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext = this.ctx;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountSection(ctx=");
        sb.append(configContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.ctx.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection) other).ctx);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection copy(com.paypal.oslo.feature.bnplservicing.config.ConfigContext ctx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection(ctx);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.AmountSection amountSection, com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            configContext = amountSection.ctx;
        }
        return amountSection.copy(configContext);
    }
}
