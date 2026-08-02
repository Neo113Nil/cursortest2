package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper;

@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aH\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010\u001d\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a(\u0010#\u001a\u0004\u0018\u00010\"*\u0004\u0018\u00010\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0080@¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010&\u001a\u00020%*\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010)\u001a\u00020\u0019*\u00020(H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010,\u001a\u00020+*\u00020\u0004H\u0000¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010/\u001a\u00020.*\u00020\u0004H\u0000¢\u0006\u0004\b/\u00100\u001a/\u00103\u001a\u0004\u0018\u000102*\u00020\u00042\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b3\u00104\u001a\u001b\u00106\u001a\u000205*\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b6\u00107\u001a\u001d\u00109\u001a\u0004\u0018\u000108*\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b9\u0010:"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentsResponse;", "debitInstrumentsResponse", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "currentInstrument", "Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardI18nFormatter;", "debitCardI18nFormatter", "Landroid/content/Context;", "context", "", "isAdditionalCardholderManagementEnabled", "", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", "mapDebitInstrumentsToUiSections", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentsResponse;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardI18nFormatter;Landroid/content/Context;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "debitInstrument", "mapSecondaryCardToUiSections", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroid/content/Context;)Ljava/util/List;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$ManageCardholderDropdown;", "toCardholderDropdownSection", "(Ljava/util/List;Landroid/content/Context;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$ManageCardholderDropdown;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardArt;", "toCardArtSection", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroid/content/Context;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardArt;", "", "toCardArtAccessibilityContent", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardOperations;", "toCardOperationsSection", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroid/content/Context;Z)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardOperations;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentVariant;", "variant", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$FundedBySection;", "toFundedBySection", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentBalances;Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardI18nFormatter;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentVariant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$DailyLimits;", "toDailyLimitsSection", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroid/content/Context;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$DailyLimits;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;", "formatLimit", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$BillingAddress;", "toBillingAddressSection", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$BillingAddress;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$HelpLinks;", "toHelpLinksSection", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$HelpLinks;", "allInstruments", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardBanner;", "toCardBanner", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Ljava/util/List;Z)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardBanner;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitSecondaryCardArt;", "toSecondaryCardArtData", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroid/content/Context;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitSecondaryCardArt;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardStatus;", "toCardStatus", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroid/content/Context;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardStatus;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitInstrumentsToUiMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object mapDebitInstrumentsToUiSections(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse debitInstrumentsResponse, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter debitCardI18nFormatter, android.content.Context context, boolean z, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection>> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1 debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1;
        int i;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress billingAddress;
        com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant fundingOptionsComponentVariant;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.FundedBySection fundedBySection;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.ManageCardholderDropdown cardholderDropdownSection;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner cardBanner;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardOperations cardOperationsSection;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits dailyLimitsSection;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress billingAddressSection;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1) {
            debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1) continuation;
            if ((debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getInputSizeshNQ4ISI;
                billingAddress = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.hasOperation(debitInstrument, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.FUNDING_OPTIONS)) {
                        fundingOptionsComponentVariant = com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant.PRIMARY_AND_SECONDARY_FUNDING_OPTIONS;
                    } else {
                        fundingOptionsComponentVariant = com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.hasOperation(debitInstrument, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.FUNDED_BY_PAYPAL_BALANCE) ? com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant.PRIMARY_FUNDING_OPTION_BALANCE : null;
                    }
                    if (fundingOptionsComponentVariant != null) {
                        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances balances = debitInstrumentsResponse.getBalances();
                        debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getHighResolutionOutputSizeshNQ4ISI = debitCardProductName;
                        debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getHighSpeedVideoSizes = debitInstrumentsResponse;
                        debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.Camera2StreamConfigurationMap = debitInstrument;
                        debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardI18nFormatter);
                        debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getInputFormats = context;
                        debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingOptionsComponentVariant);
                        debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingOptionsComponentVariant);
                        debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getOutputFormats = z;
                        debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getHighSpeedVideoFpsRangesFor = 0;
                        debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getInputSizeshNQ4ISI = 1;
                        obj = toFundedBySection(balances, debitCardI18nFormatter, fundingOptionsComponentVariant, debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        fundedBySection = null;
                        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                        cardholderDropdownSection = toCardholderDropdownSection(debitInstrumentsResponse.getInstruments(), context);
                        if (!com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.shouldShowSecondaryCardholderDropdown(debitInstrumentsResponse.getInstruments(), debitCardProductName, z)) {
                            cardholderDropdownSection = null;
                        }
                        if (cardholderDropdownSection != null) {
                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(createListBuilder.add(cardholderDropdownSection));
                        }
                        createListBuilder.add(toCardArtSection(debitInstrument, context));
                        cardBanner = toCardBanner(debitInstrument, debitInstrumentsResponse.getInstruments(), z);
                        if (cardBanner != null) {
                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(createListBuilder.add(cardBanner));
                        }
                        cardOperationsSection = toCardOperationsSection(debitInstrument, context, z);
                        if (cardOperationsSection.getOperations().isEmpty()) {
                            cardOperationsSection = null;
                        }
                        if (cardOperationsSection != null) {
                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(createListBuilder.add(cardOperationsSection));
                        }
                        if (fundedBySection != null) {
                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(createListBuilder.add(fundedBySection));
                        }
                        dailyLimitsSection = toDailyLimitsSection(debitInstrument, context);
                        if (com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.hasOperation(debitInstrument, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.DAILY_LIMITS) || dailyLimitsSection.getDailyLimits().isEmpty()) {
                            dailyLimitsSection = null;
                        }
                        if (dailyLimitsSection != null) {
                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(createListBuilder.add(dailyLimitsSection));
                        }
                        billingAddressSection = toBillingAddressSection(debitInstrument);
                        if (com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.hasOperation(debitInstrument, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.CHANGE_BILLING_ADDRESS) && !billingAddressSection.getAddress().isEmpty()) {
                            billingAddress = billingAddressSection;
                        }
                        if (billingAddress != null) {
                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(createListBuilder.add(billingAddress));
                        }
                        createListBuilder.add(toHelpLinksSection(debitInstrument));
                        return kotlin.collections.CollectionsKt.build(createListBuilder);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getHighSpeedVideoFpsRangesFor;
                    boolean z2 = debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getOutputFormats;
                    android.content.Context context2 = (android.content.Context) debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getInputFormats;
                    debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse debitInstrumentsResponse2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse) debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName2 = (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    z = z2;
                    debitCardProductName = debitCardProductName2;
                    context = context2;
                    debitInstrumentsResponse = debitInstrumentsResponse2;
                }
                fundedBySection = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.FundedBySection) obj;
                java.util.List createListBuilder2 = kotlin.collections.CollectionsKt.createListBuilder();
                cardholderDropdownSection = toCardholderDropdownSection(debitInstrumentsResponse.getInstruments(), context);
                if (!com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.shouldShowSecondaryCardholderDropdown(debitInstrumentsResponse.getInstruments(), debitCardProductName, z)) {
                }
                if (cardholderDropdownSection != null) {
                }
                createListBuilder2.add(toCardArtSection(debitInstrument, context));
                cardBanner = toCardBanner(debitInstrument, debitInstrumentsResponse.getInstruments(), z);
                if (cardBanner != null) {
                }
                cardOperationsSection = toCardOperationsSection(debitInstrument, context, z);
                if (cardOperationsSection.getOperations().isEmpty()) {
                }
                if (cardOperationsSection != null) {
                }
                if (fundedBySection != null) {
                }
                dailyLimitsSection = toDailyLimitsSection(debitInstrument, context);
                if (com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.hasOperation(debitInstrument, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.DAILY_LIMITS)) {
                }
                dailyLimitsSection = null;
                if (dailyLimitsSection != null) {
                }
                billingAddressSection = toBillingAddressSection(debitInstrument);
                if (com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.hasOperation(debitInstrument, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.CHANGE_BILLING_ADDRESS)) {
                    billingAddress = billingAddressSection;
                }
                if (billingAddress != null) {
                }
                createListBuilder2.add(toHelpLinksSection(debitInstrument));
                return kotlin.collections.CollectionsKt.build(createListBuilder2);
            }
        }
        debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1(continuation);
        java.lang.Object obj2 = debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1.getInputSizeshNQ4ISI;
        billingAddress = null;
        if (i != 0) {
        }
        fundedBySection = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.FundedBySection) obj2;
        java.util.List createListBuilder22 = kotlin.collections.CollectionsKt.createListBuilder();
        cardholderDropdownSection = toCardholderDropdownSection(debitInstrumentsResponse.getInstruments(), context);
        if (!com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.shouldShowSecondaryCardholderDropdown(debitInstrumentsResponse.getInstruments(), debitCardProductName, z)) {
        }
        if (cardholderDropdownSection != null) {
        }
        createListBuilder22.add(toCardArtSection(debitInstrument, context));
        cardBanner = toCardBanner(debitInstrument, debitInstrumentsResponse.getInstruments(), z);
        if (cardBanner != null) {
        }
        cardOperationsSection = toCardOperationsSection(debitInstrument, context, z);
        if (cardOperationsSection.getOperations().isEmpty()) {
        }
        if (cardOperationsSection != null) {
        }
        if (fundedBySection != null) {
        }
        dailyLimitsSection = toDailyLimitsSection(debitInstrument, context);
        if (com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.hasOperation(debitInstrument, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.DAILY_LIMITS)) {
        }
        dailyLimitsSection = null;
        if (dailyLimitsSection != null) {
        }
        billingAddressSection = toBillingAddressSection(debitInstrument);
        if (com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.hasOperation(debitInstrument, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.CHANGE_BILLING_ADDRESS)) {
        }
        if (billingAddress != null) {
        }
        createListBuilder22.add(toHelpLinksSection(debitInstrument));
        return kotlin.collections.CollectionsKt.build(createListBuilder22);
    }

    public static /* synthetic */ java.lang.Object mapDebitInstrumentsToUiSections$default(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse debitInstrumentsResponse, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter debitCardI18nFormatter, android.content.Context context, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        return mapDebitInstrumentsToUiSections(debitCardProductName, debitInstrumentsResponse, debitInstrument, debitCardI18nFormatter, context, z, continuation);
    }

    public static final java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> mapSecondaryCardToUiSections(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.add(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.SecondaryCardArt(toSecondaryCardArtData(debitInstrument, context)));
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardOperations cardOperationsSection$default = toCardOperationsSection$default(debitInstrument, context, false, 2, null);
        if (cardOperationsSection$default.getOperations().isEmpty()) {
            cardOperationsSection$default = null;
        }
        if (cardOperationsSection$default != null) {
            createListBuilder.add(cardOperationsSection$default);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits dailyLimitsSection = toDailyLimitsSection(debitInstrument, context);
        if (dailyLimitsSection.getDailyLimits().isEmpty()) {
            dailyLimitsSection = null;
        }
        if (dailyLimitsSection != null) {
            createListBuilder.add(dailyLimitsSection);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress billingAddressSection = toBillingAddressSection(debitInstrument);
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress billingAddress = billingAddressSection.getAddress().isEmpty() ? null : billingAddressSection;
        if (billingAddress != null) {
            createListBuilder.add(billingAddress);
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.ManageCardholderDropdown toCardholderDropdownSection(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list, android.content.Context context) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument : list2) {
            if (debitInstrument.getPrimary()) {
                string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_cardholder_status_primary_card);
            } else if (debitInstrument.getShipmentDetails().getStatus() == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus.NOT_SHIPPED) {
                string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_status_ordered);
            } else if (debitInstrument.getShipmentDetails().getStatus() == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus.ON_THE_WAY) {
                string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_status_shipped);
            } else {
                string = debitInstrument.getShipmentDetails().getStatus() == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus.ARRIVED ? context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate) : "";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(string);
            java.lang.String fullName = debitInstrument.getCardHolder().getFullName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConstants.SSN_MASK_CHAR.concat(java.lang.String.valueOf(debitInstrument.getLastNChars())));
            if (!kotlin.text.StringsKt.isBlank(string)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" (");
                sb2.append(string);
                sb2.append(")");
                sb.append(sb2.toString());
            }
            arrayList.add(new com.paypal.pds.components.MenuItem(null, fullName, debitInstrument.getId(), sb.toString(), null, 17, null));
        }
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.ManageCardholderDropdown(arrayList, com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.canAddSecondaryCardholder(list));
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardArt toCardArtSection(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardArt(new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt(debitInstrument.getProductDetails().getLargeImage().getFront().getUrl(), toCardArtAccessibilityContent(debitInstrument), debitInstrument.getLastNChars(), null, com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.hasOperation(debitInstrument, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.SHOW_CARD) ? com.paypal.pds.core.Icon.Eye.INSTANCE : null, context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_show_card_title), null, 72, null));
    }

    public static final java.lang.String toCardArtAccessibilityContent(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        java.lang.String lastNChars = debitInstrument.getLastNChars();
        java.util.ArrayList arrayList = new java.util.ArrayList(lastNChars.length());
        for (int i = 0; i < lastNChars.length(); i++) {
            arrayList.add(java.lang.Character.valueOf(lastNChars.charAt(i)));
        }
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{debitInstrument.getProductDetails().getLegalName(), kotlin.collections.CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, null, 62, null)});
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : listOf) {
            if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj)) {
                arrayList2.add(obj);
            }
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList2, " ", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardOperations toCardOperationsSection$default(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, android.content.Context context, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return toCardOperationsSection(debitInstrument, context, z);
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardOperations toCardOperationsSection(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, android.content.Context context, boolean z) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem cardOperationItem;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> operations = debitInstrument.getOperations();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation : operations) {
            java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> operations2 = debitInstrument.getOperations();
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus pinStatus = debitInstrument.getPinStatus();
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin pinOrigin = debitInstrument.getPinOrigin();
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem cardOperationItem2 = null;
            switch (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[debitInstrumentOperation.ordinal()]) {
                case 1:
                case 2:
                    int i2 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_lock_card;
                    com.paypal.pds.core.Icon.LockLocked lockLocked = com.paypal.pds.core.Icon.LockLocked.INSTANCE;
                    java.lang.String string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_lock_card);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                    cardOperationItem2 = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i2), lockLocked, string, null, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle(debitInstrumentOperation == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.UNLOCK, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit unit;
                            ((java.lang.Boolean) obj).booleanValue();
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    }), null, 8, null);
                    break;
                case 3:
                    int i3 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_add_to_google_pay;
                    com.paypal.pds.core.Icon.Mobile mobile = com.paypal.pds.core.Icon.Mobile.INSTANCE;
                    java.lang.String string2 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_add_to_wallet);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                    cardOperationItem = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i3), mobile, string2, null, null, null, 24, null);
                    cardOperationItem2 = cardOperationItem;
                    break;
                case 4:
                    int i4 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_change_pin;
                    com.paypal.pds.core.Icon.Shield shield = com.paypal.pds.core.Icon.Shield.INSTANCE;
                    if (com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.isCreatePinFlow(pinStatus, pinOrigin)) {
                        i = com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_creation_cta;
                    } else {
                        i = com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_change_pin;
                    }
                    java.lang.String string3 = context.getString(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                    cardOperationItem = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i4), shield, string3, null, null, null, 24, null);
                    cardOperationItem2 = cardOperationItem;
                    break;
                case 5:
                    int i5 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_view_pin;
                    com.paypal.pds.core.Icon.Shield shield2 = com.paypal.pds.core.Icon.Shield.INSTANCE;
                    java.lang.String string4 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_view_pin);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
                    cardOperationItem = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i5), shield2, string4, null, null, null, 24, null);
                    cardOperationItem2 = cardOperationItem;
                    break;
                case 6:
                    int i6 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_find_atm;
                    com.paypal.pds.core.Icon.MapPin mapPin = com.paypal.pds.core.Icon.MapPin.INSTANCE;
                    java.lang.String string5 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_find_atm);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
                    cardOperationItem = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i6), mapPin, string5, context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_find_atm_subtitle), null, null, 16, null);
                    cardOperationItem2 = cardOperationItem;
                    break;
                case 7:
                case 8:
                    int i7 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_request_physical_card;
                    com.paypal.pds.core.Icon.Card card = com.paypal.pds.core.Icon.Card.INSTANCE;
                    java.lang.String string6 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_request_physical_card);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "");
                    cardOperationItem = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i7), card, string6, null, null, null, 24, null);
                    cardOperationItem2 = cardOperationItem;
                    break;
                case 9:
                    int i8 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_replace_digital_card;
                    com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
                    java.lang.String string7 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_replace_digital_card);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "");
                    cardOperationItem = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i8), warning, string7, null, null, null, 24, null);
                    cardOperationItem2 = cardOperationItem;
                    break;
                case 10:
                    if (operations2.contains(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.REISSUE_DAMAGED_CARD)) {
                        int i9 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_report_card;
                        com.paypal.pds.core.Icon.Warning warning2 = com.paypal.pds.core.Icon.Warning.INSTANCE;
                        java.lang.String string8 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_report_card);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "");
                        cardOperationItem = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i9), warning2, string8, null, null, null, 24, null);
                    } else {
                        int i10 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_report_lost_stolen;
                        com.paypal.pds.core.Icon.Warning warning3 = com.paypal.pds.core.Icon.Warning.INSTANCE;
                        java.lang.String string9 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_report_card_lost);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "");
                        cardOperationItem = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i10), warning3, string9, null, null, null, 24, null);
                    }
                    cardOperationItem2 = cardOperationItem;
                    break;
                case 11:
                    int i11 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_cancel_card;
                    com.paypal.pds.core.Icon.Trash trash = com.paypal.pds.core.Icon.Trash.INSTANCE;
                    java.lang.String string10 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_cancel_card);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string10, "");
                    cardOperationItem = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i11), trash, string10, null, null, null, 24, null);
                    cardOperationItem2 = cardOperationItem;
                    break;
                case 12:
                    int i12 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_activate_and_deactivate_contactless;
                    com.paypal.pds.core.Icon.Contactless contactless = com.paypal.pds.core.Icon.Contactless.INSTANCE;
                    java.lang.String string11 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_activate_contactless_payments);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string11, "");
                    cardOperationItem = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i12), contactless, string11, null, null, null, 24, null);
                    cardOperationItem2 = cardOperationItem;
                    break;
                case 13:
                case 14:
                    if (z) {
                        int i13 = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[debitInstrumentOperation.ordinal()];
                        if (i13 == 13) {
                            int i14 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_add_secondary_cardholder;
                            com.paypal.pds.core.Icon.Person person = com.paypal.pds.core.Icon.Person.INSTANCE;
                            java.lang.String string12 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_add_secondary_cardholder);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string12, "");
                            cardOperationItem = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i14), person, string12, null, null, null, 24, null);
                        } else if (i13 == 14) {
                            int i15 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_manage_secondary_cardholder;
                            com.paypal.pds.core.Icon.Person person2 = com.paypal.pds.core.Icon.Person.INSTANCE;
                            java.lang.String string13 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_manage_secondary_cardholders);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string13, "");
                            cardOperationItem = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i15), person2, string13, null, null, null, 24, null);
                        }
                        cardOperationItem2 = cardOperationItem;
                        break;
                    }
                    break;
            }
            if (cardOperationItem2 != null) {
                arrayList.add(cardOperationItem2);
            }
        }
        createListBuilder.addAll(arrayList);
        int i16 = com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_card_connect;
        com.paypal.pds.core.Icon.Store store = com.paypal.pds.core.Icon.Store.INSTANCE;
        java.lang.String string14 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_connect_entry_point);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string14, "");
        createListBuilder.add(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(java.lang.String.valueOf(i16), store, string14, null, null, null, 24, null));
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        final java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_lock_card), java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_add_to_google_pay), java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_add_secondary_cardholder), java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_manage_secondary_cardholder), java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_card_connect), java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_view_pin), java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_change_pin), java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_find_atm), java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_request_physical_card), java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_replace_digital_card), java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_report_lost_stolen), java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_report_card), java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_activate_and_deactivate_contactless), java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_cancel_card)});
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardOperations(kotlin.collections.CollectionsKt.sortedWith(build, new java.util.Comparator() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt$toCardOperationsSection$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(listOf.indexOf(((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem) t).getId()));
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : Integer.MAX_VALUE);
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(listOf.indexOf(((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem) t2).getId()));
                java.lang.Integer num = valueOf3.intValue() >= 0 ? valueOf3 : null;
                return kotlin.comparisons.ComparisonsKt.compareValues(valueOf2, java.lang.Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE));
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object toFundedBySection(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBalances debitInstrumentBalances, com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter debitCardI18nFormatter, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant fundingOptionsComponentVariant, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.FundedBySection> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt$toFundedBySection$1 debitInstrumentsToUiMapperKt$toFundedBySection$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount totalAvailableAmount;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount;
        java.lang.String currencyCode;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt$toFundedBySection$1) {
            debitInstrumentsToUiMapperKt$toFundedBySection$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt$toFundedBySection$1) continuation;
            if ((debitInstrumentsToUiMapperKt$toFundedBySection$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                debitInstrumentsToUiMapperKt$toFundedBySection$1.getInputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt$toFundedBySection$1 debitInstrumentsToUiMapperKt$toFundedBySection$12 = debitInstrumentsToUiMapperKt$toFundedBySection$1;
                java.lang.Object obj = debitInstrumentsToUiMapperKt$toFundedBySection$12.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitInstrumentsToUiMapperKt$toFundedBySection$12.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (debitInstrumentBalances != null && (totalAvailableAmount = debitInstrumentBalances.getTotalAvailableAmount()) != null) {
                        java.lang.String value = totalAvailableAmount.getValue();
                        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount2 = (value == null || kotlin.text.StringsKt.isBlank(value) || (currencyCode = totalAvailableAmount.getCurrencyCode()) == null || kotlin.text.StringsKt.isBlank(currencyCode)) ? null : totalAvailableAmount;
                        if (debitInstrumentMoneyAmount2 != null) {
                            java.lang.String value2 = debitInstrumentMoneyAmount2.getValue();
                            if (value2 == null) {
                                value2 = "";
                            }
                            java.lang.String currencyCode2 = debitInstrumentMoneyAmount2.getCurrencyCode();
                            if (currencyCode2 == null) {
                                currencyCode2 = "";
                            }
                            debitInstrumentsToUiMapperKt$toFundedBySection$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitInstrumentBalances);
                            debitInstrumentsToUiMapperKt$toFundedBySection$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardI18nFormatter);
                            debitInstrumentsToUiMapperKt$toFundedBySection$12.Camera2StreamConfigurationMap = fundingOptionsComponentVariant;
                            debitInstrumentsToUiMapperKt$toFundedBySection$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitInstrumentMoneyAmount2);
                            debitInstrumentsToUiMapperKt$toFundedBySection$12.getHighSpeedVideoSizes = debitInstrumentMoneyAmount2;
                            debitInstrumentsToUiMapperKt$toFundedBySection$12.getInputSizeshNQ4ISI = 1;
                            obj = com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter.formatCurrency$default(debitCardI18nFormatter, value2, currencyCode2, null, 0, debitInstrumentsToUiMapperKt$toFundedBySection$12, 12, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            debitInstrumentMoneyAmount = debitInstrumentMoneyAmount2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount) debitInstrumentsToUiMapperKt$toFundedBySection$12.getHighSpeedVideoSizes;
                fundingOptionsComponentVariant = (com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant) debitInstrumentsToUiMapperKt$toFundedBySection$12.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                debitInstrumentMoneyAmount = debitInstrumentMoneyAmount3;
                return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.FundedBySection(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount.copy$default(debitInstrumentMoneyAmount, null, null, (java.lang.String) obj, 3, null), fundingOptionsComponentVariant);
            }
        }
        debitInstrumentsToUiMapperKt$toFundedBySection$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt$toFundedBySection$1(continuation);
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt$toFundedBySection$1 debitInstrumentsToUiMapperKt$toFundedBySection$122 = debitInstrumentsToUiMapperKt$toFundedBySection$1;
        java.lang.Object obj2 = debitInstrumentsToUiMapperKt$toFundedBySection$122.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitInstrumentsToUiMapperKt$toFundedBySection$122.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.FundedBySection(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount.copy$default(debitInstrumentMoneyAmount, null, null, (java.lang.String) obj2, 3, null), fundingOptionsComponentVariant);
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits toDailyLimitsSection(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits limits = debitInstrument.getLimits();
        if (limits != null) {
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount posLimit = limits.getPosLimit();
            if (posLimit != null) {
                java.lang.String string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_daily_limits_purchases);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.String formatLimit = formatLimit(posLimit);
                java.lang.String string2 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_daily_limits_purchases_desc);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                createListBuilder.add(kotlin.TuplesKt.to(new com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit(string, formatLimit, string2, false, 8, null), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DAILY_LIMITS_PURCHASES_TOOLTIP_ICON));
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount otcLimit = limits.getOtcLimit();
            if (otcLimit != null) {
                java.lang.String string3 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_daily_limits_other);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                java.lang.String formatLimit2 = formatLimit(otcLimit);
                java.lang.String string4 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_daily_limits_other_desc);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
                createListBuilder.add(kotlin.TuplesKt.to(new com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit(string3, formatLimit2, string4, false, 8, null), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DAILY_LIMITS_OTHER_CASH_WITHDRAWALS_TOOLTIP_ICON));
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount atmLimit = limits.getAtmLimit();
            if (atmLimit != null) {
                java.lang.String string5 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_daily_limits_atm);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
                createListBuilder.add(kotlin.TuplesKt.to(new com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit(string5, formatLimit(atmLimit), "", false), ""));
            }
        }
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(build, 10));
        java.util.Iterator it = build.iterator();
        while (it.hasNext()) {
            arrayList.add((com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit) ((kotlin.Pair) it.next()).getFirst());
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(build, 10));
        java.util.Iterator it2 = build.iterator();
        while (it2.hasNext()) {
            arrayList3.add((java.lang.String) ((kotlin.Pair) it2.next()).getSecond());
        }
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits(arrayList2, arrayList3);
    }

    public static final java.lang.String formatLimit(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentMoneyAmount, "");
        java.lang.String value = debitInstrumentMoneyAmount.getValue();
        return value == null ? "" : value;
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress toBillingAddressSection(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBillingAddress billingAddress = debitInstrument.getCardHolder().getBillingAddress();
        java.util.List<java.lang.String> displayAddress = billingAddress != null ? billingAddress.getDisplayAddress() : null;
        if (displayAddress == null) {
            displayAddress = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : displayAddress) {
            if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress(arrayList);
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.HelpLinks toHelpLinksSection(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        java.lang.String url;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> links = debitInstrument.getProductDetails().getLinks();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : links) {
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails debitInstrumentLinkDetails = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails) obj;
            if (kotlin.collections.ArraysKt.contains(new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType[]{com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.HELP, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.LEARN_MORE}, debitInstrumentLinkDetails.getType()) && (url = debitInstrumentLinkDetails.getUrl()) != null && !kotlin.text.StringsKt.isBlank(url)) {
                arrayList.add(obj);
            }
        }
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.HelpLinks(arrayList);
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner toCardBanner$default(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return toCardBanner(debitInstrument, list, z);
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner toCardBanner(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list, boolean z) {
        java.lang.String url;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        int i = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt.WhenMappings.$EnumSwitchMapping$1[debitInstrument.getStatus().getDisplayState().ordinal()];
        java.lang.Object obj = null;
        if (i == 1 || i == 2 || i == 3) {
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState displayState = debitInstrument.getStatus().getDisplayState();
            java.lang.String estimatedArrivalDate = debitInstrument.getShipmentDetails().getEstimatedArrivalDate();
            java.util.Iterator<T> it = debitInstrument.getProductDetails().getLinks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails debitInstrumentLinkDetails = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails) next;
                if (debitInstrumentLinkDetails.getType() == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.HELP && (url = debitInstrumentLinkDetails.getUrl()) != null && !kotlin.text.StringsKt.isBlank(url)) {
                    obj = next;
                    break;
                }
            }
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner(displayState, estimatedArrivalDate, (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails) obj, false, 8, null);
        }
        if (com.paypal.oslo.feature.debitcard.shared.util.DebitInstrumentCommonDataExtensionsKt.shouldCheckSecondaryCardActivation(debitInstrument, z) && com.paypal.oslo.feature.debitcard.shared.util.DebitInstrumentCommonDataExtensionsKt.hasSecondaryCardPendingActivation(list)) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.ACTIVATE, null, null, true, 6, null);
        }
        return null;
    }

    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt toSecondaryCardArtData(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt(debitInstrument.getProductDetails().getSmallImage().getFront().getUrl(), debitInstrument.getLastNChars(), toCardStatus(debitInstrument, context), kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState[]{com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.ORDERED, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.SHIPPED}).contains(debitInstrument.getStatus().getDisplayState()), com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.hasOperation(debitInstrument, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.REPORT_CARD_LOST_REPLACE));
    }

    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus toCardStatus(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, android.content.Context context) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState displayState = debitInstrument.getStatus().getDisplayState();
        java.lang.String estimatedArrivalDate = debitInstrument.getShipmentDetails().getEstimatedArrivalDate();
        java.lang.String formatToMonthDayYear = estimatedArrivalDate != null ? com.paypal.oslo.feature.debitcard.shared.util.DateFormattingExtensionsKt.formatToMonthDayYear(estimatedArrivalDate) : null;
        switch (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt.WhenMappings.$EnumSwitchMapping$1[displayState.ordinal()]) {
            case 1:
                com.paypal.pds.components.BadgeStyle.Info info = com.paypal.pds.components.BadgeStyle.Info.INSTANCE;
                java.lang.String string3 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus(info, string3, null, 4, null);
            case 2:
                com.paypal.pds.components.BadgeStyle.Warning warning = com.paypal.pds.components.BadgeStyle.Warning.INSTANCE;
                java.lang.String string4 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_locked);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
                return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus(warning, string4, null, 4, null);
            case 3:
                com.paypal.pds.components.BadgeStyle.Negative negative = com.paypal.pds.components.BadgeStyle.Negative.INSTANCE;
                java.lang.String string5 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_status_deactivated);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
                return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus(negative, string5, null, 4, null);
            case 4:
                com.paypal.pds.components.BadgeStyle.Info info2 = com.paypal.pds.components.BadgeStyle.Info.INSTANCE;
                java.lang.String string6 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_status_ordered);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "");
                if (formatToMonthDayYear != null && (string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_widget_ordered_state_description, formatToMonthDayYear)) != null) {
                    str = string;
                }
                return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus(info2, string6, str);
            case 5:
                com.paypal.pds.components.BadgeStyle.Info info3 = com.paypal.pds.components.BadgeStyle.Info.INSTANCE;
                java.lang.String string7 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_status_shipped);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "");
                if (formatToMonthDayYear != null && (string2 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_card_delivery_description, formatToMonthDayYear)) != null) {
                    str = string2;
                }
                return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus(info3, string7, str);
            case 6:
            case 7:
                return null;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.LOCK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.UNLOCK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.PUSH_PROVISION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.CHANGE_PIN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.SHOW_PIN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.FIND_ATM.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.REQUEST_PHYSICAL_CARD.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.REQUEST_PHYSICAL_CARD_WITH_FEE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.REPORT_DIGITAL_CARD_LOST.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.REPORT_CARD_LOST_REPLACE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.CLOSE.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.PUSH_PROVISION_DIGITIZATION_TOKEN_PAYPAL.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.ADD_SECONDARY_CARDHOLDER.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.MANAGE_SECONDARY_CARDHOLDER.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.values().length];
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.ACTIVATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.LOCKED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.DEACTIVATED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.ORDERED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.SHIPPED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.ACTIVE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
