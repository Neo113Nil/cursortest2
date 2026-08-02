package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0080@¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u001a\u0010\u000fJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u001b\u0010\u000fR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/builder/ManageCardActionItemsBuilder;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;", "productConfigurations", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "manageCardDetails", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardActionUiModel;", "build", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "autopayOverview", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getAutopaySubtitleRepaymentOption$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAutopaySubtitleChannel$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/builder/AutopayChannelComponents;", "getAutopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/builder/AutopayChannelComponents;", "getAutopayDescription$revolvingcredit_servicing_prodRelease", "getAutopayAccessibilityDescription$revolvingcredit_servicing_prodRelease", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ManageCardActionItemsBuilder {
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    public ManageCardActionItemsBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoFpsRangesFor = productConfigurations;
        this.getHighResolutionOutputSizeshNQ4ISI = currencyFormatterFacade;
        this.Camera2StreamConfigurationMap = featureGateManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x01d7 -> B:10:0x01dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object build(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$build$1 manageCardActionItemsBuilder$build$1;
        int i;
        java.util.List listOfNotNull;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        java.lang.Iterable iterable3;
        java.util.Collection arrayList;
        int i2;
        int i3;
        java.util.Iterator it;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails2;
        int i4;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$build$1) {
            manageCardActionItemsBuilder$build$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$build$1) continuation;
            if ((manageCardActionItemsBuilder$build$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                manageCardActionItemsBuilder$build$1.getOutputSizes -= 2147483648;
                java.lang.Object obj = manageCardActionItemsBuilder$build$1.toString;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageCardActionItemsBuilder$build$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations = this.getHighSpeedVideoFpsRangesFor;
                    if (productConfigurations == null) {
                        listOfNotNull = kotlin.collections.CollectionsKt.emptyList();
                    } else {
                        final boolean isTestFeatureEnabled = this.Camera2StreamConfigurationMap.isTestFeatureEnabled();
                        com.paypal.oslo.feature.revolvingcreditservicing.utils.CardItemBuilder[] cardItemBuilderArr = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CardItemBuilder[17];
                        cardItemBuilderArr[0] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.LOCK_CARD, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.m18482$r8$lambda$YJkCH2Uj1W3fqZXbJbbcYMdS4g((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        cardItemBuilderArr[1] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.SET_PAYMENT_INSTRUMENT_AS_PREFERRED, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.$r8$lambda$uyyaTxWQeWE4je27Re6Yan97DmM(isTestFeatureEnabled, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        cardItemBuilderArr[2] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.MANAGE_CREDIT_LIMIT, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.$r8$lambda$EIli2cFGTDpJSPr253pXT8iuh_U(isTestFeatureEnabled, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        cardItemBuilderArr[3] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.PUSH_TO_WALLET, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.m18480$r8$lambda$2ct10dJ9a1Uy7hvzO1zOh2ckk(isTestFeatureEnabled, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        cardItemBuilderArr[4] = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getCardItemBuilders$5(this);
                        cardItemBuilderArr[5] = isTestFeatureEnabled ? new com.paypal.oslo.feature.revolvingcreditservicing.utils.CardItemBuilder() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getCardItemBuilders$6
                            @Override // com.paypal.oslo.feature.revolvingcreditservicing.utils.CardItemBuilder
                            public final java.lang.Object build(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> continuation2) {
                                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.AddAuthorizedUsers(null, 1, null);
                            }
                        } : null;
                        cardItemBuilderArr[6] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.MANAGE_PAYMENT_SECURITY, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.$r8$lambda$yGGYtXGAA1UJi5PTGWpeX2LWmQ0(isTestFeatureEnabled, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        cardItemBuilderArr[7] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.MANAGE_NOTIFICATIONS, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.m18485$r8$lambda$pxq3f7dZUrT5snfKuZXSCq7dVQ(isTestFeatureEnabled, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        cardItemBuilderArr[8] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.MANAGE_STATEMENT_DELIVERY, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.$r8$lambda$XI1zzmZgViUPZx3WNA8GOYUtl70((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        cardItemBuilderArr[9] = isTestFeatureEnabled ? new com.paypal.oslo.feature.revolvingcreditservicing.utils.CardItemBuilder() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getCardItemBuilders$10
                            @Override // com.paypal.oslo.feature.revolvingcreditservicing.utils.CardItemBuilder
                            public final java.lang.Object build(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> continuation2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.UpdateIncome.INSTANCE;
                            }
                        } : null;
                        cardItemBuilderArr[10] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.VIEW_CARD_BENEFITS, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.m18483$r8$lambda$bNNrEEWdAnfNgInXDqTrfdll1w((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        cardItemBuilderArr[11] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.REPORT_LOST_STOLEN_VIA_CUSTOMER_SERVICE, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.m18484$r8$lambda$gHx0QCfRvIiTTUg6WtqwL2EE04((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        cardItemBuilderArr[12] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.REPORT_LOST_STOLEN, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.$r8$lambda$2v_njdgbU5dbcnc42IWMg0L_keA((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        cardItemBuilderArr[13] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.SHARE_FEEDBACK, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.m18481$r8$lambda$Prql3Iwcepe8h_WkEdCoHadiRU(isTestFeatureEnabled, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        cardItemBuilderArr[14] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.CONTACT_CUSTOMER_SUPPORT, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.$r8$lambda$DNIha7cXu27DAtopm8aNzfdvABc((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        cardItemBuilderArr[15] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.ACCESS_HELP_CENTER, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.$r8$lambda$J62rauCndIUXvnebPekwDgqeJH8(isTestFeatureEnabled, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        cardItemBuilderArr[16] = new com.paypal.oslo.feature.revolvingcreditservicing.utils.CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.MANAGE_PIN, productConfigurations, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.$r8$lambda$e5cWgM0dSxq5owvQMCCG0yt70ps((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) obj2);
                            }
                        });
                        listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) cardItemBuilderArr);
                    }
                    java.util.List list = listOfNotNull;
                    iterable = list;
                    iterable2 = iterable;
                    iterable3 = iterable2;
                    arrayList = new java.util.ArrayList();
                    i2 = 0;
                    i3 = 0;
                    it = list.iterator();
                    manageCardDetails2 = manageCardDetails;
                    i4 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = manageCardActionItemsBuilder$build$1.getHighSpeedVideoFpsRangesFor;
                    int i6 = manageCardActionItemsBuilder$build$1.getHighSpeedVideoSizes;
                    i2 = manageCardActionItemsBuilder$build$1.getHighSpeedVideoFpsRanges;
                    i4 = manageCardActionItemsBuilder$build$1.getHighResolutionOutputSizeshNQ4ISI;
                    i3 = manageCardActionItemsBuilder$build$1.Camera2StreamConfigurationMap;
                    java.lang.Object obj2 = manageCardActionItemsBuilder$build$1.getOutputSizeshNQ4ISI;
                    java.lang.Object obj3 = manageCardActionItemsBuilder$build$1.getOutputMinFrameDurationlomOqCM;
                    it = (java.util.Iterator) manageCardActionItemsBuilder$build$1.getOutputStallDurationlomOqCM;
                    iterable = (java.lang.Iterable) manageCardActionItemsBuilder$build$1.getInputFormats;
                    arrayList = (java.util.Collection) manageCardActionItemsBuilder$build$1.getOutputFormats;
                    iterable2 = (java.lang.Iterable) manageCardActionItemsBuilder$build$1.getHighSpeedVideoSizesFor;
                    iterable3 = (java.lang.Iterable) manageCardActionItemsBuilder$build$1.getOutputMinFrameDuration;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) manageCardActionItemsBuilder$build$1.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel manageCardActionUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel) obj;
                    if (manageCardActionUiModel != null) {
                        arrayList.add(manageCardActionUiModel);
                    }
                    manageCardDetails2 = manageCardDetails3;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.revolvingcreditservicing.utils.CardItemBuilder cardItemBuilder = (com.paypal.oslo.feature.revolvingcreditservicing.utils.CardItemBuilder) next;
                        manageCardActionItemsBuilder$build$1.getInputSizeshNQ4ISI = manageCardDetails2;
                        manageCardActionItemsBuilder$build$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable3);
                        manageCardActionItemsBuilder$build$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                        manageCardActionItemsBuilder$build$1.getOutputFormats = arrayList;
                        manageCardActionItemsBuilder$build$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                        manageCardActionItemsBuilder$build$1.getOutputStallDurationlomOqCM = it;
                        manageCardActionItemsBuilder$build$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        manageCardActionItemsBuilder$build$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        manageCardActionItemsBuilder$build$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardItemBuilder);
                        manageCardActionItemsBuilder$build$1.Camera2StreamConfigurationMap = i3;
                        manageCardActionItemsBuilder$build$1.getHighResolutionOutputSizeshNQ4ISI = i4;
                        manageCardActionItemsBuilder$build$1.getHighSpeedVideoFpsRanges = i2;
                        manageCardActionItemsBuilder$build$1.getHighSpeedVideoSizes = 0;
                        manageCardActionItemsBuilder$build$1.getHighSpeedVideoFpsRangesFor = 0;
                        manageCardActionItemsBuilder$build$1.getOutputSizes = 1;
                        java.lang.Object build = cardItemBuilder.build(manageCardDetails2, manageCardActionItemsBuilder$build$1);
                        if (build == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        manageCardDetails3 = manageCardDetails2;
                        obj = build;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel manageCardActionUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel) obj;
                        if (manageCardActionUiModel2 != null) {
                        }
                        manageCardDetails2 = manageCardDetails3;
                        if (it.hasNext()) {
                            return (java.util.List) arrayList;
                        }
                    }
                }
            }
        }
        manageCardActionItemsBuilder$build$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$build$1(this, continuation);
        java.lang.Object obj4 = manageCardActionItemsBuilder$build$1.toString;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageCardActionItemsBuilder$build$1.getOutputSizes;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAutopaySubtitleRepaymentOption$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1 manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1;
        int i;
        int i2;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        int i3;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1) {
            manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1) continuation;
            if ((manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1.getInputFormats -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1 manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12 = manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1;
                java.lang.Object obj = manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption repaymentOption = autopayOverview != null ? autopayOverview.getRepaymentOption() : null;
                    int i4 = repaymentOption == null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder.WhenMappings.$EnumSwitchMapping$0[repaymentOption.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_card_min_payment, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        }
                        if (i4 != 3) {
                            return null;
                        }
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_description_statement_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    }
                    int i5 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_description_custom_amount_with_amount;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount customAmount = autopayOverview.getCustomAmount();
                    manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyFormatterFacade);
                    manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autopayOverview);
                    manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12.Camera2StreamConfigurationMap = objArr3;
                    manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12.getHighSpeedVideoSizesFor = objArr3;
                    manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12.getHighSpeedVideoFpsRanges = i5;
                    manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12.getHighSpeedVideoSizes = 0;
                    manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12.getInputFormats = 1;
                    java.lang.Object format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, customAmount, null, 0, manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12, 6, null);
                    if (format$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = i5;
                    objArr = objArr3;
                    objArr2 = objArr;
                    obj = format$default;
                    i3 = 0;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12.getHighSpeedVideoSizes;
                    int i6 = manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12.getHighSpeedVideoFpsRanges;
                    objArr = (java.lang.Object[]) manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12.getHighSpeedVideoSizesFor;
                    java.lang.Object[] objArr4 = (java.lang.Object[]) manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objArr2 = objArr4;
                    i2 = i6;
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    str = "";
                }
                objArr[i3] = str;
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i2, objArr2, null, false, 12, null);
            }
        }
        manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1 manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$122 = manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1;
        java.lang.Object obj2 = manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$122.getInputFormats;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
        objArr[i3] = str;
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i2, objArr2, null, false, 12, null);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getAutopaySubtitleChannel$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> fundingInstruments;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = manageCardDetails.getAutopayOverview();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter = null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument eligiblePaymentInstrument = (autopayOverview == null || (fundingInstruments = autopayOverview.getFundingInstruments()) == null) ? null : (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) fundingInstruments);
        if (eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_paypal_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        if (eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank bank = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) eligiblePaymentInstrument;
            java.lang.String bankName = bank.getBankName();
            if (bankName == null || kotlin.text.StringsKt.isBlank(bankName)) {
                bankName = null;
            }
            java.lang.String lastDigits = bank.getLastDigits();
            if (lastDigits == null || kotlin.text.StringsKt.isBlank(lastDigits)) {
                lastDigits = null;
            }
            if (bankName != null && lastDigits != null) {
                stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_last_four_account, new java.lang.Object[]{bankName, lastDigits}, null, false, 12, null);
            }
            return stringResWithParameter;
        }
        if (!(eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card)) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card card = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card) eligiblePaymentInstrument;
        java.lang.String cardType = card.getCardType();
        if (cardType == null || kotlin.text.StringsKt.isBlank(cardType)) {
            cardType = null;
        }
        java.lang.String lastDigits2 = card.getLastDigits();
        if (lastDigits2 == null || kotlin.text.StringsKt.isBlank(lastDigits2)) {
            lastDigits2 = null;
        }
        if (cardType != null && lastDigits2 != null) {
            stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_last_four_account, new java.lang.Object[]{cardType, lastDigits2}, null, false, 12, null);
        }
        return stringResWithParameter;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.AutopayChannelComponents getAutopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> fundingInstruments;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = manageCardDetails.getAutopayOverview();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument eligiblePaymentInstrument = (autopayOverview == null || (fundingInstruments = autopayOverview.getFundingInstruments()) == null) ? null : (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) fundingInstruments);
        if (eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.AutopayChannelComponents("PayPal Balance", null);
        }
        if (eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank bank = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) eligiblePaymentInstrument;
            java.lang.String bankName = bank.getBankName();
            if (bankName == null || kotlin.text.StringsKt.isBlank(bankName)) {
                bankName = null;
            }
            java.lang.String lastDigits = bank.getLastDigits();
            if (lastDigits == null || kotlin.text.StringsKt.isBlank(lastDigits)) {
                lastDigits = null;
            }
            if (bankName == null || lastDigits == null) {
                return null;
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.AutopayChannelComponents(bankName, com.paypal.oslo.feature.revolvingcreditservicing.utils.StringExtensionsKt.toAccessibleDigits(lastDigits));
        }
        if (!(eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card)) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card card = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card) eligiblePaymentInstrument;
        java.lang.String cardType = card.getCardType();
        if (cardType == null || kotlin.text.StringsKt.isBlank(cardType)) {
            cardType = null;
        }
        java.lang.String lastDigits2 = card.getLastDigits();
        if (lastDigits2 == null || kotlin.text.StringsKt.isBlank(lastDigits2)) {
            lastDigits2 = null;
        }
        if (cardType == null || lastDigits2 == null) {
            return null;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.AutopayChannelComponents(cardType, com.paypal.oslo.feature.revolvingcreditservicing.utils.StringExtensionsKt.toAccessibleDigits(lastDigits2));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAutopayDescription$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopayDescription$1 manageCardActionItemsBuilder$getAutopayDescription$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopayDescription$1) {
            manageCardActionItemsBuilder$getAutopayDescription$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopayDescription$1) continuation;
            if ((manageCardActionItemsBuilder$getAutopayDescription$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                manageCardActionItemsBuilder$getAutopayDescription$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = manageCardActionItemsBuilder$getAutopayDescription$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageCardActionItemsBuilder$getAutopayDescription$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!manageCardDetails.getIsAutopayEnabled()) {
                        return null;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = manageCardDetails.getAutopayOverview();
                    manageCardActionItemsBuilder$getAutopayDescription$1.getHighSpeedVideoFpsRanges = manageCardDetails;
                    manageCardActionItemsBuilder$getAutopayDescription$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getAutopaySubtitleRepaymentOption$revolvingcredit_servicing_prodRelease(currencyFormatterFacade, autopayOverview, manageCardActionItemsBuilder$getAutopayDescription$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    manageCardDetails = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) manageCardActionItemsBuilder$getAutopayDescription$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                uiString = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString autopaySubtitleChannel$revolvingcredit_servicing_prodRelease = getAutopaySubtitleChannel$revolvingcredit_servicing_prodRelease(manageCardDetails);
                if (uiString == null && autopaySubtitleChannel$revolvingcredit_servicing_prodRelease != null) {
                    return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_card_manage_contact, new java.lang.Object[]{uiString, autopaySubtitleChannel$revolvingcredit_servicing_prodRelease}, null, false, 12, null);
                }
                if (uiString == null) {
                    return uiString;
                }
                if (autopaySubtitleChannel$revolvingcredit_servicing_prodRelease == null) {
                    return null;
                }
                return autopaySubtitleChannel$revolvingcredit_servicing_prodRelease;
            }
        }
        manageCardActionItemsBuilder$getAutopayDescription$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopayDescription$1(this, continuation);
        java.lang.Object obj2 = manageCardActionItemsBuilder$getAutopayDescription$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageCardActionItemsBuilder$getAutopayDescription$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        uiString = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString autopaySubtitleChannel$revolvingcredit_servicing_prodRelease2 = getAutopaySubtitleChannel$revolvingcredit_servicing_prodRelease(manageCardDetails);
        if (uiString == null) {
        }
        if (uiString == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAutopayAccessibilityDescription$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopayAccessibilityDescription$1 manageCardActionItemsBuilder$getAutopayAccessibilityDescription$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopayAccessibilityDescription$1) {
            manageCardActionItemsBuilder$getAutopayAccessibilityDescription$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopayAccessibilityDescription$1) continuation;
            if ((manageCardActionItemsBuilder$getAutopayAccessibilityDescription$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                manageCardActionItemsBuilder$getAutopayAccessibilityDescription$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = manageCardActionItemsBuilder$getAutopayAccessibilityDescription$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageCardActionItemsBuilder$getAutopayAccessibilityDescription$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!manageCardDetails.getIsAutopayEnabled()) {
                        return null;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = manageCardDetails.getAutopayOverview();
                    manageCardActionItemsBuilder$getAutopayAccessibilityDescription$1.getHighSpeedVideoFpsRanges = manageCardDetails;
                    manageCardActionItemsBuilder$getAutopayAccessibilityDescription$1.getHighSpeedVideoSizes = 1;
                    obj = getAutopaySubtitleRepaymentOption$revolvingcredit_servicing_prodRelease(currencyFormatterFacade, autopayOverview, manageCardActionItemsBuilder$getAutopayAccessibilityDescription$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    manageCardDetails2 = manageCardDetails;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    manageCardDetails2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) manageCardActionItemsBuilder$getAutopayAccessibilityDescription$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                uiString = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.AutopayChannelComponents autopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease = getAutopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease(manageCardDetails2);
                if (uiString == null && autopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease != null) {
                    if (autopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease.getLastDigits() != null) {
                        stringResWithParameter2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_tile_accessibility_label, new java.lang.Object[]{uiString, autopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease.getChannelName(), autopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease.getLastDigits()}, null, false, 12, null);
                    } else {
                        stringResWithParameter2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_tile_balance_accessibility_label, new java.lang.Object[]{uiString}, null, false, 12, null);
                    }
                    return stringResWithParameter2;
                }
                if (uiString == null) {
                    return uiString;
                }
                if (autopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease == null) {
                    return null;
                }
                if (autopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease.getLastDigits() != null) {
                    stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_tile_accessibility_label, new java.lang.Object[]{"", autopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease.getChannelName(), autopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease.getLastDigits()}, null, false, 12, null);
                } else {
                    stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_tile_balance_accessibility_label, new java.lang.Object[]{""}, null, false, 12, null);
                }
                return stringResWithParameter;
            }
        }
        manageCardActionItemsBuilder$getAutopayAccessibilityDescription$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopayAccessibilityDescription$1(this, continuation);
        java.lang.Object obj2 = manageCardActionItemsBuilder$getAutopayAccessibilityDescription$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageCardActionItemsBuilder$getAutopayAccessibilityDescription$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        uiString = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.AutopayChannelComponents autopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease2 = getAutopaySubtitleChannelAccessibility$revolvingcredit_servicing_prodRelease(manageCardDetails2);
        if (uiString == null) {
        }
        if (uiString == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$2ct10dJ-9a1Uy7h-vzO1zOh2ckk, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel m18480$r8$lambda$2ct10dJ9a1Uy7hvzO1zOh2ckk(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet pushToWallet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet pushToWallet2 = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        java.lang.Object[] objArr6 = 0;
        if (!manageCardDetails.getHasVirtualOrPhysicalCard() || !z) {
            return null;
        }
        int i = 2;
        if (manageCardDetails.getIsPushToWalletEligible()) {
            pushToWallet = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet.CardType.NOT_ENROLLED, objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0);
        } else if (manageCardDetails.getIsPushToWalletCardActive()) {
            pushToWallet = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet.CardType.ACTIVE, objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
        } else {
            if (!manageCardDetails.getIsPushToWalletFinishSetupRequired()) {
                if (manageCardDetails.getIsPushToWalletErrorState()) {
                    pushToWallet = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet.CardType.ERROR, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_card_actions_generic_error, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE));
                }
                return pushToWallet2;
            }
            pushToWallet = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet.CardType.PENDING, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        }
        pushToWallet2 = pushToWallet;
        return pushToWallet2;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel $r8$lambda$2v_njdgbU5dbcnc42IWMg0L_keA(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ReportLostOrStolen.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel $r8$lambda$DNIha7cXu27DAtopm8aNzfdvABc(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ContactUs.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel $r8$lambda$EIli2cFGTDpJSPr253pXT8iuh_U(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        if (z) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ManageCreditLimit.INSTANCE;
        }
        return null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel $r8$lambda$J62rauCndIUXvnebPekwDgqeJH8(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        if (z) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Help.INSTANCE;
        }
        return null;
    }

    /* renamed from: $r8$lambda$P-rql3Iwcepe8h_WkEdCoHadiRU, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel m18481$r8$lambda$Prql3Iwcepe8h_WkEdCoHadiRU(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        if (z) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ShareFeedback.INSTANCE;
        }
        return null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel $r8$lambda$XI1zzmZgViUPZx3WNA8GOYUtl70(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.StatementDelivery(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferencesKt.getChannels(manageCardDetails.getStatementDeliveryInfo(), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId.STATEMENT_DELIVERY_CHANNELS).contains(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel.PAPER), manageCardDetails.getIsStatementDeliveryErrorState());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$YJkCH2Uj1W3fqZXbJbbc-YMdS4g, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel m18482$r8$lambda$YJkCH2Uj1W3fqZXbJbbcYMdS4g(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument = manageCardDetails.getCreditInstrument();
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.LockCard((creditInstrument != null ? creditInstrument.getStatus() : null) == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.FROZEN, null, 2, 0 == true ? 1 : 0);
    }

    /* renamed from: $r8$lambda$bNNrEEWdAnfNgInXDqTrfd-ll1w, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel m18483$r8$lambda$bNNrEEWdAnfNgInXDqTrfdll1w(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        java.lang.String pdfUrl = manageCardDetails.getPdfUrl();
        if (pdfUrl == null || pdfUrl.length() == 0) {
            return null;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Benefits(manageCardDetails.isWorldUser());
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel $r8$lambda$e5cWgM0dSxq5owvQMCCG0yt70ps(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        if (!manageCardDetails.getHasVirtualOrPhysicalCard() || manageCardDetails.getIsCardFrozen()) {
            return null;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ManagePin(manageCardDetails.getHasPhysicalCard());
    }

    /* renamed from: $r8$lambda$gHx0QCfRvIiTTUg6Wtq-wL2EE04, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel m18484$r8$lambda$gHx0QCfRvIiTTUg6WtqwL2EE04(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ReportLostOrStolen.INSTANCE;
    }

    /* renamed from: $r8$lambda$pxq3f7dZUrT5snfKuZ-XSCq7dVQ, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel m18485$r8$lambda$pxq3f7dZUrT5snfKuZXSCq7dVQ(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        if (z) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Notifications.INSTANCE;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel $r8$lambda$uyyaTxWQeWE4je27Re6Yan97DmM(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel contextualAlertUiModel = null;
        java.lang.Object[] objArr = 0;
        if (z) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.SetAsPreferred(false, contextualAlertUiModel, 2, objArr == true ? 1 : 0);
        }
        return null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel $r8$lambda$yGGYtXGAA1UJi5PTGWpeX2LWmQ0(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus paymentSecurityEnrollmentStatus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        if (!z) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo paymentSecurityInfo = manageCardDetails.getPaymentSecurityInfo();
        if (paymentSecurityInfo == null || (paymentSecurityEnrollmentStatus = paymentSecurityInfo.getEnrollmentStatus()) == null) {
            paymentSecurityEnrollmentStatus = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus.UNENROLLED;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo paymentSecurityInfo2 = manageCardDetails.getPaymentSecurityInfo();
        boolean z2 = false;
        if (paymentSecurityInfo2 != null && paymentSecurityInfo2.getEnrollmentEligible()) {
            z2 = true;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PaymentSecurity(paymentSecurityEnrollmentStatus, z2);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
