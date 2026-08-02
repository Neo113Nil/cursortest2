package com.paypal.oslo.feature.bnplservicing.ui.makepayment.config;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001e\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/config/NextPaymentAmount;", "", "Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/config/NextPaymentAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;", "getCtx", "getShouldShow", "()Z", "shouldShow", "getShouldShowOtherAmountOption", "shouldShowOtherAmountOption", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "locale"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NextPaymentAmount {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.config.ConfigContext ctx;

    public NextPaymentAmount(com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.ctx = configContext;
    }

    public final com.paypal.oslo.feature.bnplservicing.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final boolean getShouldShow() {
        return com.paypal.oslo.feature.bnplservicing.config.ConfigContextKt.isAvailableFor(this.ctx.getCountry(), com.paypal.oslo.feature.bnplservicing.config.Country.US);
    }

    public final boolean getShouldShowOtherAmountOption() {
        return !com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifierKt.isAvailableFor(this.ctx.getCpi(), com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_PAY_IN_1_DE, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_PAY_IN_1_AT);
    }

    public final java.util.Locale getLocale() {
        switch (com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.NextPaymentAmount.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()]) {
            case 1:
                java.util.Locale locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                return locale;
            case 2:
                java.util.Locale locale2 = java.util.Locale.GERMANY;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
                return locale2;
            case 3:
                java.util.Locale locale3 = java.util.Locale.FRANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale3, "");
                return locale3;
            case 4:
                java.util.Locale locale4 = java.util.Locale.ITALY;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale4, "");
                return locale4;
            case 5:
                java.util.Locale build = new java.util.Locale.Builder().setLanguage("en").setRegion("AU").build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                return build;
            case 6:
                java.util.Locale locale5 = java.util.Locale.CANADA;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale5, "");
                return locale5;
            case 7:
                java.util.Locale locale6 = java.util.Locale.UK;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale6, "");
                return locale6;
            case 8:
                java.util.Locale build2 = new java.util.Locale.Builder().setLanguage("es").setRegion("ES").build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
                return build2;
            case 9:
                java.util.Locale build3 = new java.util.Locale.Builder().setLanguage("de").setRegion("AT").build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build3, "");
                return build3;
            case 10:
                java.util.Locale locale7 = java.util.Locale.getDefault();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale7, "");
                return locale7;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext = this.ctx;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NextPaymentAmount(ctx=");
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
        return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.NextPaymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.NextPaymentAmount) other).ctx);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.NextPaymentAmount copy(com.paypal.oslo.feature.bnplservicing.config.ConfigContext ctx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.NextPaymentAmount(ctx);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.config.Country.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.config.Country.US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.config.Country.DE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.config.Country.FR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.config.Country.IT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.config.Country.AU.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.config.Country.CA.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.config.Country.GB.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.config.Country.ES.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.config.Country.AT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.config.Country.UNKNOWN.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.NextPaymentAmount copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.NextPaymentAmount nextPaymentAmount, com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            configContext = nextPaymentAmount.ctx;
        }
        return nextPaymentAmount.copy(configContext);
    }
}
