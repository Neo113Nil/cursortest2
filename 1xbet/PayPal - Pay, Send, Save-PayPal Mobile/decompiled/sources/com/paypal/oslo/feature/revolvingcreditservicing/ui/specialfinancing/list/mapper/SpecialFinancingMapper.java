package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatterFacade", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivity;", "item", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;", "mapToUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivity;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "items", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/CategorizedSpecialFinancingItems;", "categorizeItems", "(Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingMapper {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SpecialFinancingMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        this.getHighResolutionOutputSizeshNQ4ISI = currencyFormatterFacade;
        this.Camera2StreamConfigurationMap = dateFormatterFacade;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0104, code lost:
    
        if (r3 != r10) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mapToUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper$mapToUiModel$1 specialFinancingMapper$mapToUiModel$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object format$default;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount purchaseAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity3;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity4;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3;
        java.lang.String str5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount accruedInterest;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier4;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity5;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier5;
        java.lang.String str10;
        boolean z;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly;
        java.lang.String str11;
        java.lang.String str12;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        java.lang.String str13;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.Integer remainingPeriodicPaymentCount;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.lang.Integer num;
        java.lang.String str20;
        java.lang.String str21;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3;
        java.lang.String str22;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier6;
        java.lang.String str23;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferInstallment installment;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount nextPaymentAmount;
        java.lang.String str24;
        java.lang.String str25;
        java.lang.String str26;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4;
        java.lang.String str27;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity6;
        java.lang.String str28;
        java.lang.Integer num2;
        java.lang.String str29;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferInstallment installment2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails installment3;
        java.lang.String valueOf;
        java.lang.String valueOf2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper$mapToUiModel$1) {
            specialFinancingMapper$mapToUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper$mapToUiModel$1) continuation;
            if ((specialFinancingMapper$mapToUiModel$1.isOutputSupportedForhNQ4ISI & Integer.MIN_VALUE) != 0) {
                specialFinancingMapper$mapToUiModel$1.isOutputSupportedForhNQ4ISI -= 2147483648;
                java.lang.Object obj = specialFinancingMapper$mapToUiModel$1.isOutputSupportedFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = specialFinancingMapper$mapToUiModel$1.isOutputSupportedForhNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount remainingBalance = promotionalActivity.getRemainingBalance();
                    if (remainingBalance != null) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol symbol = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
                        promotionalActivity2 = promotionalActivity;
                        specialFinancingMapper$mapToUiModel$1.Camera2StreamConfigurationMap = promotionalActivity2;
                        creditProductIdentifier2 = creditProductIdentifier;
                        specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier2;
                        specialFinancingMapper$mapToUiModel$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(remainingBalance);
                        specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges = 0;
                        specialFinancingMapper$mapToUiModel$1.isOutputSupportedForhNQ4ISI = 1;
                        str = "";
                        format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, remainingBalance, symbol, 0, specialFinancingMapper$mapToUiModel$1, 4, null);
                    } else {
                        promotionalActivity2 = promotionalActivity;
                        creditProductIdentifier2 = creditProductIdentifier;
                        str = "";
                        str2 = null;
                        if (str2 == null) {
                            str2 = str;
                        }
                        purchaseAmount = promotionalActivity2.getPurchaseAmount();
                        if (purchaseAmount != null) {
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade2 = this.getHighResolutionOutputSizeshNQ4ISI;
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol symbol2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
                            specialFinancingMapper$mapToUiModel$1.Camera2StreamConfigurationMap = promotionalActivity2;
                            specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier2;
                            specialFinancingMapper$mapToUiModel$1.getOutputFormats = str2;
                            specialFinancingMapper$mapToUiModel$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(purchaseAmount);
                            specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges = 0;
                            specialFinancingMapper$mapToUiModel$1.isOutputSupportedForhNQ4ISI = 2;
                            java.lang.String str30 = str2;
                            java.lang.Object format$default2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade2, purchaseAmount, symbol2, 0, specialFinancingMapper$mapToUiModel$1, 4, null);
                            if (format$default2 != coroutine_suspended) {
                                promotionalActivity4 = promotionalActivity2;
                                obj = format$default2;
                                creditProductIdentifier3 = creditProductIdentifier2;
                                str5 = str30;
                                str3 = (java.lang.String) obj;
                                str4 = str5;
                                creditProductIdentifier2 = creditProductIdentifier3;
                                promotionalActivity3 = promotionalActivity4;
                                if (str3 == null) {
                                }
                                accruedInterest = promotionalActivity3.getAccruedInterest();
                                if (accruedInterest != null) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        java.lang.String str31 = str2;
                        promotionalActivity3 = promotionalActivity2;
                        str3 = null;
                        str4 = str31;
                        if (str3 == null) {
                        }
                        accruedInterest = promotionalActivity3.getAccruedInterest();
                        if (accruedInterest != null) {
                        }
                    }
                } else if (i == 1) {
                    int i2 = specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier7 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity7 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) specialFinancingMapper$mapToUiModel$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    creditProductIdentifier2 = creditProductIdentifier7;
                    str = "";
                    format$default = obj;
                    promotionalActivity2 = promotionalActivity7;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i3 = specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges;
                            num2 = (java.lang.Integer) specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoSizesFor;
                            num = (java.lang.Integer) specialFinancingMapper$mapToUiModel$1.getOutputMinFrameDuration;
                            str25 = (java.lang.String) specialFinancingMapper$mapToUiModel$1.getInputFormats;
                            str24 = (java.lang.String) specialFinancingMapper$mapToUiModel$1.getInputSizeshNQ4ISI;
                            uiString4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoSizes;
                            str27 = (java.lang.String) specialFinancingMapper$mapToUiModel$1.toString;
                            str26 = (java.lang.String) specialFinancingMapper$mapToUiModel$1.getOutputSizes;
                            str29 = (java.lang.String) specialFinancingMapper$mapToUiModel$1.getOutputStallDuration;
                            str23 = (java.lang.String) specialFinancingMapper$mapToUiModel$1.getOutputSizeshNQ4ISI;
                            str28 = (java.lang.String) specialFinancingMapper$mapToUiModel$1.getOutputMinFrameDurationlomOqCM;
                            str7 = (java.lang.String) specialFinancingMapper$mapToUiModel$1.getOutputFormats;
                            creditProductIdentifier6 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor;
                            promotionalActivity6 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) specialFinancingMapper$mapToUiModel$1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                            str18 = "";
                            z = false;
                            str20 = (java.lang.String) obj;
                            str16 = str26;
                            str8 = str28;
                            promotionalActivity3 = promotionalActivity6;
                            str17 = str29;
                            remainingPeriodicPaymentCount = num2;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString5 = uiString4;
                            str21 = str25;
                            uiString3 = uiString5;
                            java.lang.String str32 = str27;
                            str19 = str24;
                            str22 = str32;
                            if (str20 == null) {
                                str20 = str18;
                            }
                            if (num == null || remainingPeriodicPaymentCount != null || str20.length() > 0) {
                                int i4 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_installment_subtitle;
                                valueOf = num != null ? java.lang.String.valueOf(num.intValue()) : null;
                                if (valueOf == null) {
                                    valueOf = str18;
                                }
                                valueOf2 = remainingPeriodicPaymentCount != null ? java.lang.String.valueOf(remainingPeriodicPaymentCount.intValue()) : null;
                                if (valueOf2 == null) {
                                    valueOf2 = str18;
                                }
                                stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i4, new java.lang.Object[]{str19, valueOf, valueOf2, str20}, null, false, 12, null);
                            } else if (str21.length() > 0) {
                                stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_no_interest_subtitle, new java.lang.Object[]{str19, str21}, null, false, 12, null);
                            } else {
                                stringResWithParameter = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                            }
                            str11 = str8;
                            str12 = str17;
                            uiString = stringResWithParameter;
                            uiString2 = uiString3;
                            str14 = str22;
                            str15 = str23;
                            creditProductIdentifier4 = creditProductIdentifier6;
                            str13 = str16;
                            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel(str14, uiString2, uiString, promotionalActivity3.getIcon(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str7), str12, str11, str13, str15, promotionalActivity3.getStatus() != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus.ACTIVE ? true : z, creditProductIdentifier4 != com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_amount_subtitle, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null);
                        }
                        int i5 = specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges;
                        str10 = (java.lang.String) specialFinancingMapper$mapToUiModel$1.getOutputMinFrameDurationlomOqCM;
                        str9 = (java.lang.String) specialFinancingMapper$mapToUiModel$1.getOutputFormats;
                        creditProductIdentifier5 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor;
                        promotionalActivity5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) specialFinancingMapper$mapToUiModel$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str = "";
                        str6 = (java.lang.String) obj;
                        str8 = str10;
                        str7 = str9;
                        creditProductIdentifier4 = creditProductIdentifier5;
                        promotionalActivity3 = promotionalActivity5;
                        if (str6 == null) {
                            str6 = str;
                        }
                        java.util.Locale locale = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier4);
                        java.time.Instant purchaseDate = promotionalActivity3.getPurchaseDate();
                        java.lang.String format = purchaseDate != null ? this.Camera2StreamConfigurationMap.format(purchaseDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale) : null;
                        java.lang.String str33 = format == null ? str : format;
                        java.time.Instant expirationDate = promotionalActivity3.getExpirationDate();
                        java.lang.String format2 = expirationDate != null ? this.Camera2StreamConfigurationMap.format(expirationDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateLong.INSTANCE, locale) : null;
                        java.lang.String str34 = format2 == null ? str : format2;
                        java.lang.String obj2 = promotionalActivity3.getPromoId().toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, str);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString merchantNameUiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapperKt.toMerchantNameUiString(promotionalActivity3.getTitle());
                        if (creditProductIdentifier4 == com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC) {
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstruct offerConstruct = promotionalActivity3.getOfferConstruct();
                            java.lang.Integer periodicPaymentCount = (offerConstruct == null || (installment3 = offerConstruct.getInstallment()) == null) ? null : installment3.getPeriodicPaymentCount();
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext currentOfferContext = promotionalActivity3.getCurrentOfferContext();
                            remainingPeriodicPaymentCount = (currentOfferContext == null || (installment2 = currentOfferContext.getInstallment()) == null) ? null : installment2.getRemainingPeriodicPaymentCount();
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext currentOfferContext2 = promotionalActivity3.getCurrentOfferContext();
                            if (currentOfferContext2 != null && (installment = currentOfferContext2.getInstallment()) != null && (nextPaymentAmount = installment.getNextPaymentAmount()) != null) {
                                str18 = str;
                                com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade3 = this.getHighResolutionOutputSizeshNQ4ISI;
                                com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol symbol3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
                                specialFinancingMapper$mapToUiModel$1.Camera2StreamConfigurationMap = promotionalActivity3;
                                specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier4;
                                specialFinancingMapper$mapToUiModel$1.getOutputFormats = str7;
                                specialFinancingMapper$mapToUiModel$1.getOutputMinFrameDurationlomOqCM = str8;
                                specialFinancingMapper$mapToUiModel$1.getOutputSizeshNQ4ISI = str6;
                                specialFinancingMapper$mapToUiModel$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                                specialFinancingMapper$mapToUiModel$1.getOutputStallDuration = str33;
                                specialFinancingMapper$mapToUiModel$1.getOutputSizes = str34;
                                specialFinancingMapper$mapToUiModel$1.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(nextPaymentAmount);
                                specialFinancingMapper$mapToUiModel$1.toString = obj2;
                                specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoSizes = merchantNameUiString;
                                specialFinancingMapper$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI = this;
                                specialFinancingMapper$mapToUiModel$1.getInputSizeshNQ4ISI = str33;
                                specialFinancingMapper$mapToUiModel$1.getInputFormats = str34;
                                specialFinancingMapper$mapToUiModel$1.getOutputMinFrameDuration = periodicPaymentCount;
                                specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoSizesFor = remainingPeriodicPaymentCount;
                                specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges = 0;
                                specialFinancingMapper$mapToUiModel$1.isOutputSupportedForhNQ4ISI = 4;
                                z = false;
                                java.lang.Integer num3 = periodicPaymentCount;
                                java.lang.String str35 = str34;
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper$mapToUiModel$1 specialFinancingMapper$mapToUiModel$12 = specialFinancingMapper$mapToUiModel$1;
                                java.lang.String str36 = str33;
                                java.lang.String str37 = str6;
                                java.lang.Object format$default3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade3, nextPaymentAmount, symbol3, 0, specialFinancingMapper$mapToUiModel$12, 4, null);
                                if (format$default3 != coroutine_suspended) {
                                    str24 = str36;
                                    num = num3;
                                    str25 = str35;
                                    str26 = str25;
                                    uiString4 = merchantNameUiString;
                                    str27 = obj2;
                                    creditProductIdentifier6 = creditProductIdentifier4;
                                    promotionalActivity6 = promotionalActivity3;
                                    str23 = str37;
                                    str28 = str8;
                                    obj = format$default3;
                                    num2 = remainingPeriodicPaymentCount;
                                    str29 = str24;
                                    str20 = (java.lang.String) obj;
                                    str16 = str26;
                                    str8 = str28;
                                    promotionalActivity3 = promotionalActivity6;
                                    str17 = str29;
                                    remainingPeriodicPaymentCount = num2;
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString52 = uiString4;
                                    str21 = str25;
                                    uiString3 = uiString52;
                                    java.lang.String str322 = str27;
                                    str19 = str24;
                                    str22 = str322;
                                    if (str20 == null) {
                                    }
                                    if (num == null) {
                                    }
                                    int i42 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_installment_subtitle;
                                    if (num != null) {
                                    }
                                    if (valueOf == null) {
                                    }
                                    if (remainingPeriodicPaymentCount != null) {
                                    }
                                    if (valueOf2 == null) {
                                    }
                                    stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i42, new java.lang.Object[]{str19, valueOf, valueOf2, str20}, null, false, 12, null);
                                    str11 = str8;
                                    str12 = str17;
                                    uiString = stringResWithParameter;
                                    uiString2 = uiString3;
                                    str14 = str22;
                                    str15 = str23;
                                    creditProductIdentifier4 = creditProductIdentifier6;
                                    str13 = str16;
                                    return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel(str14, uiString2, uiString, promotionalActivity3.getIcon(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str7), str12, str11, str13, str15, promotionalActivity3.getStatus() != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus.ACTIVE ? true : z, creditProductIdentifier4 != com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_amount_subtitle, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null);
                                }
                                return coroutine_suspended;
                            }
                            str16 = str34;
                            str17 = str33;
                            java.lang.String str38 = str6;
                            str18 = str;
                            z = false;
                            str19 = str17;
                            num = periodicPaymentCount;
                            str20 = null;
                            str21 = str16;
                            uiString3 = merchantNameUiString;
                            str22 = obj2;
                            creditProductIdentifier6 = creditProductIdentifier4;
                            str23 = str38;
                            if (str20 == null) {
                            }
                            if (num == null) {
                            }
                            int i422 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_installment_subtitle;
                            if (num != null) {
                            }
                            if (valueOf == null) {
                            }
                            if (remainingPeriodicPaymentCount != null) {
                            }
                            if (valueOf2 == null) {
                            }
                            stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i422, new java.lang.Object[]{str19, valueOf, valueOf2, str20}, null, false, 12, null);
                            str11 = str8;
                            str12 = str17;
                            uiString = stringResWithParameter;
                            uiString2 = uiString3;
                            str14 = str22;
                            str15 = str23;
                            creditProductIdentifier4 = creditProductIdentifier6;
                            str13 = str16;
                            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel(str14, uiString2, uiString, promotionalActivity3.getIcon(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str7), str12, str11, str13, str15, promotionalActivity3.getStatus() != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus.ACTIVE ? true : z, creditProductIdentifier4 != com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_amount_subtitle, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null);
                        }
                        java.lang.String str39 = str34;
                        java.lang.String str40 = str33;
                        java.lang.String str41 = str6;
                        z = false;
                        if (str39.length() > 0) {
                            stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_activity_subtitle, new java.lang.Object[]{str39}, null, false, 12, null);
                        } else {
                            stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_recent_activities_special_financing, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        }
                        str11 = str8;
                        str12 = str40;
                        uiString = stringResOnly;
                        str13 = str39;
                        uiString2 = merchantNameUiString;
                        str14 = obj2;
                        str15 = str41;
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel(str14, uiString2, uiString, promotionalActivity3.getIcon(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str7), str12, str11, str13, str15, promotionalActivity3.getStatus() != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus.ACTIVE ? true : z, creditProductIdentifier4 != com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_amount_subtitle, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null);
                    }
                    int i6 = specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges;
                    str5 = (java.lang.String) specialFinancingMapper$mapToUiModel$1.getOutputFormats;
                    creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor;
                    promotionalActivity4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) specialFinancingMapper$mapToUiModel$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str = "";
                    str3 = (java.lang.String) obj;
                    str4 = str5;
                    creditProductIdentifier2 = creditProductIdentifier3;
                    promotionalActivity3 = promotionalActivity4;
                    if (str3 == null) {
                        str3 = str;
                    }
                    accruedInterest = promotionalActivity3.getAccruedInterest();
                    if (accruedInterest != null) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade4 = this.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol symbol4 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
                        specialFinancingMapper$mapToUiModel$1.Camera2StreamConfigurationMap = promotionalActivity3;
                        specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier2;
                        specialFinancingMapper$mapToUiModel$1.getOutputFormats = str4;
                        specialFinancingMapper$mapToUiModel$1.getOutputMinFrameDurationlomOqCM = str3;
                        specialFinancingMapper$mapToUiModel$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accruedInterest);
                        specialFinancingMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges = 0;
                        specialFinancingMapper$mapToUiModel$1.isOutputSupportedForhNQ4ISI = 3;
                        java.lang.String str42 = str3;
                        java.lang.Object format$default4 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade4, accruedInterest, symbol4, 0, specialFinancingMapper$mapToUiModel$1, 4, null);
                        if (format$default4 != coroutine_suspended) {
                            str9 = str4;
                            obj = format$default4;
                            promotionalActivity5 = promotionalActivity3;
                            creditProductIdentifier5 = creditProductIdentifier2;
                            str10 = str42;
                            str6 = (java.lang.String) obj;
                            str8 = str10;
                            str7 = str9;
                            creditProductIdentifier4 = creditProductIdentifier5;
                            promotionalActivity3 = promotionalActivity5;
                            if (str6 == null) {
                            }
                            java.util.Locale locale2 = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier4);
                            java.time.Instant purchaseDate2 = promotionalActivity3.getPurchaseDate();
                            if (purchaseDate2 != null) {
                            }
                            if (format == null) {
                            }
                            java.time.Instant expirationDate2 = promotionalActivity3.getExpirationDate();
                            if (expirationDate2 != null) {
                            }
                            if (format2 == null) {
                            }
                            java.lang.String obj22 = promotionalActivity3.getPromoId().toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj22, str);
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString merchantNameUiString2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapperKt.toMerchantNameUiString(promotionalActivity3.getTitle());
                            if (creditProductIdentifier4 == com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    java.lang.String str43 = str3;
                    creditProductIdentifier4 = creditProductIdentifier2;
                    str6 = null;
                    str7 = str4;
                    str8 = str43;
                    if (str6 == null) {
                    }
                    java.util.Locale locale22 = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier4);
                    java.time.Instant purchaseDate22 = promotionalActivity3.getPurchaseDate();
                    if (purchaseDate22 != null) {
                    }
                    if (format == null) {
                    }
                    java.time.Instant expirationDate22 = promotionalActivity3.getExpirationDate();
                    if (expirationDate22 != null) {
                    }
                    if (format2 == null) {
                    }
                    java.lang.String obj222 = promotionalActivity3.getPromoId().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj222, str);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString merchantNameUiString22 = com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapperKt.toMerchantNameUiString(promotionalActivity3.getTitle());
                    if (creditProductIdentifier4 == com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC) {
                    }
                }
                str2 = (java.lang.String) format$default;
                if (str2 == null) {
                }
                purchaseAmount = promotionalActivity2.getPurchaseAmount();
                if (purchaseAmount != null) {
                }
            }
        }
        specialFinancingMapper$mapToUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper$mapToUiModel$1(this, continuation);
        java.lang.Object obj3 = specialFinancingMapper$mapToUiModel$1.isOutputSupportedFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = specialFinancingMapper$mapToUiModel$1.isOutputSupportedForhNQ4ISI;
        if (i != 0) {
        }
        str2 = (java.lang.String) format$default;
        if (str2 == null) {
        }
        purchaseAmount = promotionalActivity2.getPurchaseAmount();
        if (purchaseAmount != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0203 -> B:10:0x0221). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0121 -> B:11:0x016a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object categorizeItems(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> list, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper$categorizeItems$1 specialFinancingMapper$categorizeItems$1;
        int i;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.util.Iterator it;
        int i2;
        int i3;
        int i4;
        java.util.LinkedHashMap linkedHashMap;
        java.lang.Object obj4;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper$categorizeItems$1 specialFinancingMapper$categorizeItems$12;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> list2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper specialFinancingMapper = this;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper$categorizeItems$1) {
            specialFinancingMapper$categorizeItems$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper$categorizeItems$1) continuation;
            if ((specialFinancingMapper$categorizeItems$1.getARTIFICIAL_FRAME_PACKAGE_NAME & Integer.MIN_VALUE) != 0) {
                specialFinancingMapper$categorizeItems$1.getARTIFICIAL_FRAME_PACKAGE_NAME -= 2147483648;
                java.lang.Object obj5 = specialFinancingMapper$categorizeItems$1.f5410a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = specialFinancingMapper$categorizeItems$1.getARTIFICIAL_FRAME_PACKAGE_NAME;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj5);
                    java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                    for (java.lang.Object obj6 : list) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus status = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) obj6).getStatus();
                        java.lang.Object obj7 = linkedHashMap2.get(status);
                        if (obj7 == null) {
                            obj7 = (java.util.List) new java.util.ArrayList();
                            linkedHashMap2.put(status, obj7);
                        }
                        ((java.util.List) obj7).add(obj6);
                    }
                    java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap2.size()));
                    java.util.Set entrySet = linkedHashMap2.entrySet();
                    obj = linkedHashMap2;
                    obj2 = obj;
                    obj3 = entrySet;
                    it = entrySet.iterator();
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    linkedHashMap = linkedHashMap3;
                    obj4 = linkedHashMap;
                    specialFinancingMapper$categorizeItems$12 = specialFinancingMapper$categorizeItems$1;
                    list2 = list;
                    creditProductIdentifier2 = creditProductIdentifier;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = specialFinancingMapper$categorizeItems$1.getInputSizeshNQ4ISI;
                    int i6 = specialFinancingMapper$categorizeItems$1.getOutputMinFrameDuration;
                    int i7 = specialFinancingMapper$categorizeItems$1.Camera2StreamConfigurationMap;
                    int i8 = specialFinancingMapper$categorizeItems$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i9 = specialFinancingMapper$categorizeItems$1.getHighSpeedVideoFpsRanges;
                    int i10 = specialFinancingMapper$categorizeItems$1.getHighSpeedVideoSizes;
                    int i11 = specialFinancingMapper$categorizeItems$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object obj8 = specialFinancingMapper$categorizeItems$1.unwrapAs;
                    ?? r13 = (java.util.Map) specialFinancingMapper$categorizeItems$1.getValidOutputFormatsForInputhNQ4ISI;
                    java.util.Collection collection = (java.util.Collection) specialFinancingMapper$categorizeItems$1.isOutputSupportedForhNQ4ISI;
                    java.lang.Object obj9 = specialFinancingMapper$categorizeItems$1.getOutputMinFrameDurationlomOqCM;
                    java.util.Iterator it2 = (java.util.Iterator) specialFinancingMapper$categorizeItems$1.getOutputSizes;
                    ?? r5 = (java.util.Collection) specialFinancingMapper$categorizeItems$1.getOutputStallDuration;
                    java.lang.Object obj10 = (java.lang.Iterable) specialFinancingMapper$categorizeItems$1.getOutputSizeshNQ4ISI;
                    java.lang.Object obj11 = (java.lang.Iterable) specialFinancingMapper$categorizeItems$1.getInputFormats;
                    java.util.List list3 = (java.util.List) specialFinancingMapper$categorizeItems$1.b;
                    java.lang.Object obj12 = specialFinancingMapper$categorizeItems$1.coroutineBoundary;
                    java.util.Iterator it3 = (java.util.Iterator) specialFinancingMapper$categorizeItems$1.ArtificialStackFrames;
                    java.util.LinkedHashMap linkedHashMap4 = (java.util.Map) specialFinancingMapper$categorizeItems$1.coroutineCreation;
                    java.lang.Object obj13 = (java.lang.Iterable) specialFinancingMapper$categorizeItems$1.accessartificialFrame;
                    java.lang.Object obj14 = (java.util.Map) specialFinancingMapper$categorizeItems$1.CoroutineDebuggingKt;
                    java.lang.Object obj15 = (java.util.Map) specialFinancingMapper$categorizeItems$1.toString;
                    java.lang.Object obj16 = (java.util.Map) specialFinancingMapper$categorizeItems$1.isOutputSupportedFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) specialFinancingMapper$categorizeItems$1.getOutputFormats;
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> list4 = (java.util.List) specialFinancingMapper$categorizeItems$1.getHighSpeedVideoSizesFor;
                    kotlin.ResultKt.throwOnFailure(obj5);
                    int i12 = i9;
                    int i13 = i10;
                    java.lang.Object obj17 = obj15;
                    java.util.ArrayList arrayList = r5;
                    int i14 = i7;
                    java.lang.Object obj18 = obj11;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper$categorizeItems$1 specialFinancingMapper$categorizeItems$13 = specialFinancingMapper$categorizeItems$1;
                    java.lang.Object obj19 = coroutine_suspended;
                    int i15 = i11;
                    java.lang.Object obj20 = obj16;
                    int i16 = i8;
                    java.lang.Object obj21 = obj10;
                    java.lang.Object obj22 = obj8;
                    java.util.LinkedHashMap linkedHashMap5 = r13;
                    java.lang.Object obj23 = obj13;
                    int i17 = i6;
                    collection.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel) obj5);
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> list5 = list4;
                    java.util.Iterator it4 = it2;
                    java.util.List list6 = list3;
                    java.lang.Object next = obj12;
                    java.util.Iterator it5 = it3;
                    linkedHashMap = linkedHashMap4;
                    int i18 = i17;
                    java.lang.Object obj24 = obj14;
                    int i19 = i14;
                    int i20 = i16;
                    int i21 = i13;
                    int i22 = i12;
                    java.lang.Object obj25 = obj19;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier4 = creditProductIdentifier3;
                    if (it4.hasNext()) {
                        java.lang.Object next2 = it4.next();
                        int i23 = i15;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) next2;
                        java.lang.Object obj26 = obj22;
                        specialFinancingMapper$categorizeItems$13.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list5);
                        specialFinancingMapper$categorizeItems$13.getOutputFormats = creditProductIdentifier4;
                        specialFinancingMapper$categorizeItems$13.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj20);
                        specialFinancingMapper$categorizeItems$13.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj17);
                        specialFinancingMapper$categorizeItems$13.CoroutineDebuggingKt = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj24);
                        specialFinancingMapper$categorizeItems$13.accessartificialFrame = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj23);
                        specialFinancingMapper$categorizeItems$13.coroutineCreation = linkedHashMap;
                        specialFinancingMapper$categorizeItems$13.ArtificialStackFrames = it5;
                        specialFinancingMapper$categorizeItems$13.coroutineBoundary = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        specialFinancingMapper$categorizeItems$13.b = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list6);
                        specialFinancingMapper$categorizeItems$13.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj18);
                        specialFinancingMapper$categorizeItems$13.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj21);
                        specialFinancingMapper$categorizeItems$13.getOutputStallDuration = arrayList;
                        java.util.Iterator it6 = it4;
                        specialFinancingMapper$categorizeItems$13.getOutputSizes = it6;
                        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> list7 = list5;
                        specialFinancingMapper$categorizeItems$13.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next2);
                        specialFinancingMapper$categorizeItems$13.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(promotionalActivity);
                        specialFinancingMapper$categorizeItems$13.isOutputSupportedForhNQ4ISI = arrayList;
                        specialFinancingMapper$categorizeItems$13.getValidOutputFormatsForInputhNQ4ISI = linkedHashMap5;
                        specialFinancingMapper$categorizeItems$13.unwrapAs = obj26;
                        java.util.Iterator it7 = it5;
                        specialFinancingMapper$categorizeItems$13.getHighSpeedVideoFpsRangesFor = i23;
                        specialFinancingMapper$categorizeItems$13.getHighSpeedVideoSizes = i21;
                        int i24 = i22;
                        specialFinancingMapper$categorizeItems$13.getHighSpeedVideoFpsRanges = i24;
                        specialFinancingMapper$categorizeItems$13.getHighResolutionOutputSizeshNQ4ISI = i20;
                        specialFinancingMapper$categorizeItems$13.Camera2StreamConfigurationMap = i19;
                        specialFinancingMapper$categorizeItems$13.getOutputMinFrameDuration = i18;
                        specialFinancingMapper$categorizeItems$13.getInputSizeshNQ4ISI = 0;
                        specialFinancingMapper$categorizeItems$13.getARTIFICIAL_FRAME_PACKAGE_NAME = 1;
                        java.lang.Object mapToUiModel = mapToUiModel(promotionalActivity, creditProductIdentifier4, specialFinancingMapper$categorizeItems$13);
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier5 = creditProductIdentifier4;
                        obj19 = obj25;
                        if (mapToUiModel == obj19) {
                            return obj19;
                        }
                        list3 = list6;
                        i12 = i24;
                        creditProductIdentifier3 = creditProductIdentifier5;
                        it2 = it6;
                        i13 = i21;
                        obj22 = obj26;
                        obj14 = obj24;
                        obj5 = mapToUiModel;
                        obj12 = next;
                        i15 = i23;
                        collection = arrayList;
                        i16 = i20;
                        i17 = i18;
                        it3 = it7;
                        i14 = i19;
                        linkedHashMap4 = linkedHashMap;
                        list4 = list7;
                        collection.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel) obj5);
                        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> list52 = list4;
                        java.util.Iterator it42 = it2;
                        java.util.List list62 = list3;
                        java.lang.Object next3 = obj12;
                        java.util.Iterator it52 = it3;
                        linkedHashMap = linkedHashMap4;
                        int i182 = i17;
                        java.lang.Object obj242 = obj14;
                        int i192 = i14;
                        int i202 = i16;
                        int i212 = i13;
                        int i222 = i12;
                        java.lang.Object obj252 = obj19;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier42 = creditProductIdentifier3;
                        if (it42.hasNext()) {
                            int i25 = i15;
                            linkedHashMap5.put(obj22, arrayList);
                            list2 = list52;
                            specialFinancingMapper = this;
                            specialFinancingMapper$categorizeItems$12 = specialFinancingMapper$categorizeItems$13;
                            obj = obj17;
                            obj2 = obj20;
                            obj3 = obj23;
                            obj4 = obj242;
                            i3 = i212;
                            it = it52;
                            i2 = i25;
                            i4 = i222;
                            coroutine_suspended = obj252;
                            creditProductIdentifier2 = creditProductIdentifier42;
                            if (it.hasNext()) {
                                java.util.List list8 = (java.util.List) linkedHashMap.get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus.EXPIRING);
                                if (list8 == null) {
                                    list8 = kotlin.collections.CollectionsKt.emptyList();
                                }
                                java.util.List list9 = (java.util.List) linkedHashMap.get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus.ACTIVE);
                                if (list9 == null) {
                                    list9 = kotlin.collections.CollectionsKt.emptyList();
                                }
                                java.util.List list10 = (java.util.List) linkedHashMap.get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus.PAID_OFF);
                                if (list10 == null) {
                                    list10 = kotlin.collections.CollectionsKt.emptyList();
                                }
                                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems(list8, list9, list10);
                            }
                            next3 = it.next();
                            java.util.Map.Entry entry = (java.util.Map.Entry) next3;
                            java.lang.Object key = entry.getKey();
                            list62 = (java.util.List) entry.getValue();
                            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> list11 = list2;
                            java.util.List list12 = list62;
                            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier6 = creditProductIdentifier2;
                            obj242 = obj4;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list12, 10));
                            java.util.Iterator it8 = list12.iterator();
                            i15 = i2;
                            i212 = i3;
                            i222 = i4;
                            i182 = 0;
                            i192 = 0;
                            i202 = 0;
                            linkedHashMap5 = linkedHashMap;
                            obj20 = obj2;
                            obj23 = obj3;
                            obj21 = list12;
                            obj17 = obj;
                            specialFinancingMapper$categorizeItems$13 = specialFinancingMapper$categorizeItems$12;
                            obj22 = key;
                            obj252 = coroutine_suspended;
                            it52 = it;
                            arrayList = arrayList2;
                            creditProductIdentifier42 = creditProductIdentifier6;
                            list52 = list11;
                            it42 = it8;
                            obj18 = obj21;
                            if (it42.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        specialFinancingMapper$categorizeItems$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper$categorizeItems$1(specialFinancingMapper, continuation);
        java.lang.Object obj52 = specialFinancingMapper$categorizeItems$1.f5410a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = specialFinancingMapper$categorizeItems$1.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (i != 0) {
        }
    }
}
