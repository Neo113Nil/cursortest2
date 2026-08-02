package com.paypal.oslo.feature.bnplacquisition.paymode;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeConfig;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeConfig$UiOptions;", "uis$delegate", "Lkotlin/Lazy;", "getUis", "()Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeConfig$UiOptions;", "uis", "UiOptions", "PromoCardArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayModeConfig {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

    /* renamed from: uis$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy uis;

    @javax.inject.Inject
    public PayModeConfig(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.ctx = configContext;
        this.uis = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.$r8$lambda$gibFMGCHowtrsWLMwGDwSfcFoWc(com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.this);
            }
        });
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.UiOptions getUis() {
        return (com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.UiOptions) this.uis.getValue();
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u001b\u0010\u001b\u001a\u00020\u00168GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeConfig$UiOptions;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeConfig$UiOptions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeConfig$PromoCardArt;", "promoCardArt$delegate", "Lkotlin/Lazy;", "getPromoCardArt", "()Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeConfig$PromoCardArt;", "promoCardArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UiOptions {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        /* renamed from: promoCardArt$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy promoCardArt;

        public UiOptions(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
            this.promoCardArt = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig$UiOptions$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.UiOptions.m12277$r8$lambda$SdlXI4lGF15lw1sTSmJQvyPQ(com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.UiOptions.this);
                }
            });
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.PromoCardArt getPromoCardArt() {
            return (com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.PromoCardArt) this.promoCardArt.getValue();
        }

        /* renamed from: $r8$lambda$SdlXI4lGF15l-w-1s-TSmJQvyPQ, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.PromoCardArt m12277$r8$lambda$SdlXI4lGF15lw1sTSmJQvyPQ(com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.UiOptions uiOptions) {
            return new com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.PromoCardArt(uiOptions.ctx);
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext = this.ctx;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UiOptions(ctx=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.UiOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.UiOptions) other).ctx);
        }

        public final com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.UiOptions copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
            return new com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.UiOptions(ctx);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.UiOptions copy$default(com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.UiOptions uiOptions, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configContext = uiOptions.ctx;
            }
            return uiOptions.copy(configContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeConfig$PromoCardArt;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeConfig$PromoCardArt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "getCardArtUrl", "cardArtUrl", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PromoCardArt {
        public static final java.lang.String DE_CARD_ART_URL = "https://www.paypalobjects.com/webstatic/pl2go-online-in-store/inStore/cardArt/PL2GoDECardArtThumbnail@3x.png";
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;
        public static final int $stable = 8;

        public PromoCardArt(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final java.lang.String getCardArtUrl() {
            if (com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.PromoCardArt.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()] == 1) {
                return "https://www.paypalobjects.com/webstatic/pl2go-online-in-store/inStore/cardArt/PL2GoDECardArtThumbnail@3x.png";
            }
            return "";
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext = this.ctx;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PromoCardArt(ctx=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.PromoCardArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.PromoCardArt) other).ctx);
        }

        public final com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.PromoCardArt copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
            return new com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.PromoCardArt(ctx);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.config.Country.values().length];
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.DE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.PromoCardArt copy$default(com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.PromoCardArt promoCardArt, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configContext = promoCardArt.ctx;
            }
            return promoCardArt.copy(configContext);
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.UiOptions $r8$lambda$gibFMGCHowtrsWLMwGDwSfcFoWc(com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig payModeConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig.UiOptions(payModeConfig.ctx);
    }
}
