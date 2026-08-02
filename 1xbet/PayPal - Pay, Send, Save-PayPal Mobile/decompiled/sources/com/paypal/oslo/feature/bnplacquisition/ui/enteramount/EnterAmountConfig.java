package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\r\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "nfcLockScreenConfig", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$UiOptions;", "uis$delegate", "Lkotlin/Lazy;", "getUis", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$UiOptions;", "uis", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$Actions;", "actions$delegate", "getActions", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$Actions;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "UiOptions", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveScreenTestTag.HOW_IT_WORKS, "Actions", "LoanConstraintsApiConfig", "InitializeApplicationApi", "NavigateToOffers", "NavigateToPersonalInfo", "CurrencyInput", "EvaluateProductOffersApiConfig", "EvaluateProductOffersApiRequestParameters", "RequestParameters", "OffersCreditApplication", "CreateCreditApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnterAmountConfig {
    public static final int $stable = 8;

    /* renamed from: actions$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy actions;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig getHighSpeedVideoSizes;

    /* renamed from: uis$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy uis;

    @javax.inject.Inject
    public EnterAmountConfig(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcLockScreenConfig, "");
        this.ctx = configContext;
        this.getHighSpeedVideoSizes = nfcLockScreenConfig;
        this.uis = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.$r8$lambda$xPPv0hguVSNgBg0PWqUJ8hwmSu0(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.this);
            }
        });
        this.actions = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.$r8$lambda$bsNHObW0R5tTwiCSH8LvOw6pBDU(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.this);
            }
        });
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions getUis() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions) this.uis.getValue();
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions getActions() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions) this.actions.getValue();
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$UiOptions;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$UiOptions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "getShowPrequal", "()Z", "showPrequal", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$CurrencyInput;", "currencyInput$delegate", "Lkotlin/Lazy;", "getCurrencyInput", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$CurrencyInput;", "currencyInput", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$HowItWorks;", "howItWorks$delegate", "getHowItWorks", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$HowItWorks;", "howItWorks"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UiOptions {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        /* renamed from: currencyInput$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy currencyInput;

        /* renamed from: howItWorks$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy howItWorks;

        public UiOptions(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
            this.currencyInput = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig$UiOptions$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions.$r8$lambda$YxPVmJGIRvMVtwAyhaNNNTxfHjM(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions.this);
                }
            });
            this.howItWorks = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig$UiOptions$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions.m12391$r8$lambda$_0mJhNssuR_R5GJfGGUOK94HV4(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions.this);
                }
            });
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final boolean getShowPrequal() {
            return com.paypal.oslo.feature.bnplacquisition.config.CountryKt.isAvailableFor(this.ctx.getCountry(), com.paypal.oslo.feature.bnplacquisition.config.Country.DE);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CurrencyInput getCurrencyInput() {
            return (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CurrencyInput) this.currencyInput.getValue();
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.HowItWorks getHowItWorks() {
            return (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.HowItWorks) this.howItWorks.getValue();
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CurrencyInput $r8$lambda$YxPVmJGIRvMVtwAyhaNNNTxfHjM(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions uiOptions) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CurrencyInput(uiOptions.ctx);
        }

        /* renamed from: $r8$lambda$_0mJhN-ssuR_R5GJfGGUOK94HV4, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.HowItWorks m12391$r8$lambda$_0mJhNssuR_R5GJfGGUOK94HV4(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions uiOptions) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.HowItWorks(uiOptions.ctx);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions) other).ctx);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions(ctx);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions uiOptions, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configContext = uiOptions.ctx;
            }
            return uiOptions.copy(configContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$HowItWorks;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$HowItWorks;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "getSmallPaddingFromHeaderToList", "()Z", "smallPaddingFromHeaderToList", "getUseNumericBadges", "useNumericBadges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HowItWorks {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        public HowItWorks(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final boolean getSmallPaddingFromHeaderToList() {
            return com.paypal.oslo.feature.bnplacquisition.config.CountryKt.isAvailableFor(this.ctx.getCountry(), com.paypal.oslo.feature.bnplacquisition.config.Country.DE);
        }

        public final boolean getUseNumericBadges() {
            return com.paypal.oslo.feature.bnplacquisition.config.CountryKt.isAvailableFor(this.ctx.getCountry(), com.paypal.oslo.feature.bnplacquisition.config.Country.US);
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext = this.ctx;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HowItWorks(ctx=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.HowItWorks) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.HowItWorks) other).ctx);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.HowItWorks copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.HowItWorks(ctx);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.HowItWorks copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.HowItWorks howItWorks, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configContext = howItWorks.ctx;
            }
            return howItWorks.copy(configContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b9\u0010 \u001a\u0004\b:\u0010;R\u0011\u0010?\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b=\u0010>"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$Actions;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "nfcLockScreenConfig", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$Actions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "Camera2StreamConfigurationMap", "getShouldIncludePrequalification", "()Z", "shouldIncludePrequalification", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$EvaluateProductOffersApiConfig;", "evaluateProductOffersApiConfig$delegate", "Lkotlin/Lazy;", "getEvaluateProductOffersApiConfig", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$EvaluateProductOffersApiConfig;", "evaluateProductOffersApiConfig", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$InitializeApplicationApi;", "initializeApplicationApi$delegate", "getInitializeApplicationApi", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$InitializeApplicationApi;", "initializeApplicationApi", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$NavigateToOffers;", "navigateToOffers$delegate", "getNavigateToOffers", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$NavigateToOffers;", "navigateToOffers", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$LoanConstraintsApiConfig;", "loanConstraintsApi$delegate", "getLoanConstraintsApi", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$LoanConstraintsApiConfig;", "loanConstraintsApi", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$OffersCreditApplication;", "offersCreditApplication$delegate", "getOffersCreditApplication", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$OffersCreditApplication;", "offersCreditApplication", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$CreateCreditApplication;", "createCreditApplication$delegate", "getCreateCreditApplication", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$CreateCreditApplication;", "createCreditApplication", "getScreenLock", "()Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "screenLock"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Actions {
        public static final int $stable = 8;

        /* renamed from: createCreditApplication$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy createCreditApplication;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        /* renamed from: evaluateProductOffersApiConfig$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy evaluateProductOffersApiConfig;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig Camera2StreamConfigurationMap;

        /* renamed from: initializeApplicationApi$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy initializeApplicationApi;

        /* renamed from: loanConstraintsApi$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy loanConstraintsApi;

        /* renamed from: navigateToOffers$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy navigateToOffers;

        /* renamed from: offersCreditApplication$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy offersCreditApplication;

        public Actions(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcLockScreenConfig, "");
            this.ctx = configContext;
            this.Camera2StreamConfigurationMap = nfcLockScreenConfig;
            this.evaluateProductOffersApiConfig = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig$Actions$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions.$r8$lambda$ZOAptO4YeTD6LuKGyvbWdWdWOwg(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions.this);
                }
            });
            this.initializeApplicationApi = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig$Actions$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions.$r8$lambda$3iXoHfgfJydv9RxZlIY9OjEiuDg(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions.this);
                }
            });
            this.navigateToOffers = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig$Actions$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions.$r8$lambda$CNS1sy3IRSE676LOGh6EVqUI3M4(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions.this);
                }
            });
            this.loanConstraintsApi = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig$Actions$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions.m12388$r8$lambda$yZsQrIc5wN4dPxUq9XNJUjpR6E(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions.this);
                }
            });
            this.offersCreditApplication = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig$Actions$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions.m12387$r8$lambda$Baa5eVoxLVtw_5C32qDxDuzk0(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions.this);
                }
            });
            this.createCreditApplication = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig$Actions$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions.m12389$r8$lambda$zzbSOQE8PFz1TwQ55hPdEVX5C0(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions.this);
                }
            });
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final boolean getShouldIncludePrequalification() {
            return com.paypal.oslo.feature.bnplacquisition.config.CountryKt.isAvailableFor(this.ctx.getCountry(), com.paypal.oslo.feature.bnplacquisition.config.Country.DE);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.EvaluateProductOffersApiConfig getEvaluateProductOffersApiConfig() {
            return (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.EvaluateProductOffersApiConfig) this.evaluateProductOffersApiConfig.getValue();
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.InitializeApplicationApi getInitializeApplicationApi() {
            return (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.InitializeApplicationApi) this.initializeApplicationApi.getValue();
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToOffers getNavigateToOffers() {
            return (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToOffers) this.navigateToOffers.getValue();
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.LoanConstraintsApiConfig getLoanConstraintsApi() {
            return (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.LoanConstraintsApiConfig) this.loanConstraintsApi.getValue();
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.OffersCreditApplication getOffersCreditApplication() {
            return (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.OffersCreditApplication) this.offersCreditApplication.getValue();
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CreateCreditApplication getCreateCreditApplication() {
            return (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CreateCreditApplication) this.createCreditApplication.getValue();
        }

        /* renamed from: getScreenLock, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        /* renamed from: $r8$lambda$-Baa5eVoxL-Vtw_5C32qDxDuzk0, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.OffersCreditApplication m12387$r8$lambda$Baa5eVoxLVtw_5C32qDxDuzk0(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions actions) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.OffersCreditApplication(actions.ctx);
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.InitializeApplicationApi $r8$lambda$3iXoHfgfJydv9RxZlIY9OjEiuDg(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions actions) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.InitializeApplicationApi(actions.ctx);
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToOffers $r8$lambda$CNS1sy3IRSE676LOGh6EVqUI3M4(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions actions) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToOffers(actions.ctx);
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.EvaluateProductOffersApiConfig $r8$lambda$ZOAptO4YeTD6LuKGyvbWdWdWOwg(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions actions) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.EvaluateProductOffersApiConfig(actions.ctx);
        }

        /* renamed from: $r8$lambda$yZsQrIc5wN4dPxU-q9XNJUjpR6E, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.LoanConstraintsApiConfig m12388$r8$lambda$yZsQrIc5wN4dPxUq9XNJUjpR6E(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions actions) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.LoanConstraintsApiConfig(actions.ctx);
        }

        /* renamed from: $r8$lambda$zzbSO-QE8PFz1TwQ55hPdEVX5C0, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CreateCreditApplication m12389$r8$lambda$zzbSOQE8PFz1TwQ55hPdEVX5C0(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions actions) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CreateCreditApplication(actions.ctx);
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext = this.ctx;
            com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Actions(ctx=");
            sb.append(configContext);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(nfcLockScreenConfig);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.ctx.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions actions = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, actions.ctx) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, actions.Camera2StreamConfigurationMap);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx, com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcLockScreenConfig, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions(ctx, nfcLockScreenConfig);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions actions, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configContext = actions.ctx;
            }
            if ((i & 2) != 0) {
                nfcLockScreenConfig = actions.Camera2StreamConfigurationMap;
            }
            return actions.copy(configContext, nfcLockScreenConfig);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$LoanConstraintsApiConfig;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$RequestParameters;", "requestParameters$delegate", "Lkotlin/Lazy;", "getRequestParameters", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$RequestParameters;", "requestParameters"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LoanConstraintsApiConfig {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        /* renamed from: requestParameters$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy requestParameters;

        public LoanConstraintsApiConfig(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
            this.requestParameters = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig$LoanConstraintsApiConfig$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.LoanConstraintsApiConfig.m12390$r8$lambda$qPxmb7A5uwGh1gY6fTuqpfzKU8(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.LoanConstraintsApiConfig.this);
                }
            });
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.RequestParameters getRequestParameters() {
            return (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.RequestParameters) this.requestParameters.getValue();
        }

        /* renamed from: $r8$lambda$qPxmb7A5uwG-h1gY6fTuqpfzKU8, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.RequestParameters m12390$r8$lambda$qPxmb7A5uwGh1gY6fTuqpfzKU8(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.LoanConstraintsApiConfig loanConstraintsApiConfig) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.RequestParameters(loanConstraintsApiConfig.ctx);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001e\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$InitializeApplicationApi;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$InitializeApplicationApi;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "getIncludeNationalIdentification", "()Z", "includeNationalIdentification", "getIncludeAnnualIncome", "includeAnnualIncome", "getIncludePaymentFundingInstruments", "includePaymentFundingInstruments", "getIncludeSelectedPaymentFundingInstrument", "includeSelectedPaymentFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitializeApplicationApi {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        public final boolean getIncludePaymentFundingInstruments() {
            return false;
        }

        public final boolean getIncludeSelectedPaymentFundingInstrument() {
            return false;
        }

        public InitializeApplicationApi(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final boolean getIncludeNationalIdentification() {
            int i = com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.InitializeApplicationApi.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
            return i == 1 || i != 2;
        }

        public final boolean getIncludeAnnualIncome() {
            int i = com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.InitializeApplicationApi.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
            return i == 1 || i != 2;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext = this.ctx;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializeApplicationApi(ctx=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.InitializeApplicationApi) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.InitializeApplicationApi) other).ctx);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.InitializeApplicationApi copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.InitializeApplicationApi(ctx);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.config.Country.values().length];
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.US.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.DE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.InitializeApplicationApi copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.InitializeApplicationApi initializeApplicationApi, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configContext = initializeApplicationApi.ctx;
            }
            return initializeApplicationApi.copy(configContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$NavigateToOffers;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$NavigateToOffers;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "getShouldNavigateToOffers", "()Z", "shouldNavigateToOffers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToOffers {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        public NavigateToOffers(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final boolean getShouldNavigateToOffers() {
            int i = com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToOffers.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
            return i != 1 && i == 2;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext = this.ctx;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToOffers(ctx=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToOffers) other).ctx);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToOffers copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToOffers(ctx);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.config.Country.values().length];
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.US.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.DE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToOffers copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToOffers navigateToOffers, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configContext = navigateToOffers.ctx;
            }
            return navigateToOffers.copy(configContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$NavigateToPersonalInfo;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$NavigateToPersonalInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "getShouldNavigateToPersonalInfo", "()Z", "shouldNavigateToPersonalInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPersonalInfo {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        public NavigateToPersonalInfo(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final boolean getShouldNavigateToPersonalInfo() {
            return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToPersonalInfo.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()] == 1;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext = this.ctx;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPersonalInfo(ctx=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToPersonalInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToPersonalInfo) other).ctx);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToPersonalInfo copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToPersonalInfo(ctx);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.config.Country.values().length];
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.US.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.DE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToPersonalInfo copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.NavigateToPersonalInfo navigateToPersonalInfo, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configContext = navigateToPersonalInfo.ctx;
            }
            return navigateToPersonalInfo.copy(configContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$CurrencyInput;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$CurrencyInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "isCurrencySymbolAtStart", "()Z", "getLocale", "locale", "getCurrencyCode", "currencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrencyInput {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        public CurrencyInput(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final boolean isCurrencySymbolAtStart() {
            int i = com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CurrencyInput.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
            if (i != 1) {
                return (i == 2 || i == 3) ? false : true;
            }
            return true;
        }

        public final java.lang.String getLocale() {
            int i = com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CurrencyInput.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
            if (i == 1) {
                return "en_US";
            }
            if (i != 2) {
                return i != 3 ? "en_US" : "it_IT";
            }
            return "de_DE";
        }

        public final java.lang.String getCurrencyCode() {
            int i = com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CurrencyInput.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
            return i != 1 ? (i == 2 || i == 3) ? com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR : "USD" : "USD";
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext = this.ctx;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyInput(ctx=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CurrencyInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CurrencyInput) other).ctx);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CurrencyInput copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CurrencyInput(ctx);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.config.Country.values().length];
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.US.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.DE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.IT.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CurrencyInput copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.CurrencyInput currencyInput, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configContext = currencyInput.ctx;
            }
            return currencyInput.copy(configContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$EvaluateProductOffersApiConfig;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$EvaluateProductOffersApiRequestParameters;", "requestParameters$delegate", "Lkotlin/Lazy;", "getRequestParameters", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$EvaluateProductOffersApiRequestParameters;", "requestParameters"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EvaluateProductOffersApiConfig {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        /* renamed from: requestParameters$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy requestParameters;

        public EvaluateProductOffersApiConfig(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
            this.requestParameters = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig$EvaluateProductOffersApiConfig$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.EvaluateProductOffersApiConfig.$r8$lambda$Nd7q79QyNN6A7H1Fqv0JV0SWeSY(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.EvaluateProductOffersApiConfig.this);
                }
            });
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.EvaluateProductOffersApiRequestParameters getRequestParameters() {
            return (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.EvaluateProductOffersApiRequestParameters) this.requestParameters.getValue();
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.EvaluateProductOffersApiRequestParameters $r8$lambda$Nd7q79QyNN6A7H1Fqv0JV0SWeSY(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.EvaluateProductOffersApiConfig evaluateProductOffersApiConfig) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.EvaluateProductOffersApiRequestParameters(evaluateProductOffersApiConfig.ctx);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$EvaluateProductOffersApiRequestParameters;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "", "getIncludeOffers", "()Z", "includeOffers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EvaluateProductOffersApiRequestParameters {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        public EvaluateProductOffersApiRequestParameters(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final boolean getIncludeOffers() {
            int i = com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.EvaluateProductOffersApiRequestParameters.WhenMappings.$EnumSwitchMapping$0[this.ctx.getCountry().ordinal()];
            return i != 1 && i == 2;
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.config.Country.values().length];
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.US.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.config.Country.DE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$RequestParameters;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "", "getIncludePrequalSummary", "()Z", "includePrequalSummary"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RequestParameters {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        public RequestParameters(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final boolean getIncludePrequalSummary() {
            return this.ctx.getCountry() == com.paypal.oslo.feature.bnplacquisition.config.Country.DE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$OffersCreditApplication;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "", "getShouldCall", "()Z", "shouldCall"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OffersCreditApplication {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        public OffersCreditApplication(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final boolean getShouldCall() {
            return this.ctx.getCountry() == com.paypal.oslo.feature.bnplacquisition.config.Country.DE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig$CreateCreditApplication;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "", "getShouldCall", "()Z", "shouldCall"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CreateCreditApplication {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        public CreateCreditApplication(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final boolean getShouldCall() {
            return this.ctx.getCountry() == com.paypal.oslo.feature.bnplacquisition.config.Country.US;
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions $r8$lambda$bsNHObW0R5tTwiCSH8LvOw6pBDU(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig enterAmountConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.Actions(enterAmountConfig.ctx, enterAmountConfig.getHighSpeedVideoSizes);
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions $r8$lambda$xPPv0hguVSNgBg0PWqUJ8hwmSu0(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig enterAmountConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig.UiOptions(enterAmountConfig.ctx);
    }
}
