package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u001b\u0010\u001b\u001a\u00020\u00168GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/UIs;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/UIs;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/BillingAddressSection;", "billingAddressSection$delegate", "Lkotlin/Lazy;", "getBillingAddressSection", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/BillingAddressSection;", "billingAddressSection", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/FormSection;", "formSection$delegate", "getFormSection", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/FormSection;", "formSection", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/FooterSection;", "footerSection$delegate", "getFooterSection", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/FooterSection;", "footerSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UIs {
    public static final int $stable = 8;

    /* renamed from: billingAddressSection$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy billingAddressSection;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

    /* renamed from: footerSection$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy footerSection;

    /* renamed from: formSection$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy formSection;

    public UIs(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.ctx = configContext;
        this.billingAddressSection = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs.m12434$r8$lambda$kXPpAOh1X4vN4jrfbnI8bBCfkM(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs.this);
            }
        });
        this.formSection = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs.m12433$r8$lambda$8qAvyVT3Wi9FX23zXLotUFQfMw(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs.this);
            }
        });
        this.footerSection = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs.$r8$lambda$u2gwkFG_UP_iGCTFXz9XYT4JHtY(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs.this);
            }
        });
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.BillingAddressSection getBillingAddressSection() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.BillingAddressSection) this.billingAddressSection.getValue();
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection getFormSection() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection) this.formSection.getValue();
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FooterSection getFooterSection() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FooterSection) this.footerSection.getValue();
    }

    /* renamed from: $r8$lambda$8qAvyVT3Wi9FX23zXL-otUFQfMw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection m12433$r8$lambda$8qAvyVT3Wi9FX23zXLotUFQfMw(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs uIs) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FormSection(uIs.ctx);
    }

    /* renamed from: $r8$lambda$kXPpAOh1X4vN4jrfbn-I8bBCfkM, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.BillingAddressSection m12434$r8$lambda$kXPpAOh1X4vN4jrfbnI8bBCfkM(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs uIs) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.BillingAddressSection(uIs.ctx);
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FooterSection $r8$lambda$u2gwkFG_UP_iGCTFXz9XYT4JHtY(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs uIs) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FooterSection(uIs.ctx);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext = this.ctx;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UIs(ctx=");
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
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs) other).ctx);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs(ctx);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs uIs, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            configContext = uIs.ctx;
        }
        return uIs.copy(configContext);
    }
}
