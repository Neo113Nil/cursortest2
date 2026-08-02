package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/detail/mapper/SpecialFinancingDetailMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatterFacade", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivity;", "activity", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/detail/uimodel/SpecialFinancingDetailUiModel;", "toDetailUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivity;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingDetailMapper {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SpecialFinancingDetailMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        this.getHighResolutionOutputSizeshNQ4ISI = currencyFormatterFacade;
        this.getHighSpeedVideoFpsRanges = dateFormatterFacade;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toDetailUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.uimodel.SpecialFinancingDetailUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper$toDetailUiModel$1 specialFinancingDetailMapper$toDetailUiModel$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        java.lang.String str;
        java.lang.Object obj;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount purchaseAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier4;
        java.lang.String str2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity3;
        java.lang.String str3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity4;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier5;
        java.lang.String str4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount accruedInterest;
        java.lang.String str5;
        java.lang.String str6;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier6;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity5;
        java.lang.String str7;
        java.lang.String format;
        java.lang.String format2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty empty;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper$toDetailUiModel$1) {
            specialFinancingDetailMapper$toDetailUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper$toDetailUiModel$1) continuation;
            if ((specialFinancingDetailMapper$toDetailUiModel$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                specialFinancingDetailMapper$toDetailUiModel$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj2 = specialFinancingDetailMapper$toDetailUiModel$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = specialFinancingDetailMapper$toDetailUiModel$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount remainingBalance = promotionalActivity.getRemainingBalance();
                    if (remainingBalance != null) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol symbol = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
                        promotionalActivity2 = promotionalActivity;
                        specialFinancingDetailMapper$toDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI = promotionalActivity2;
                        specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier;
                        specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(remainingBalance);
                        specialFinancingDetailMapper$toDetailUiModel$1.Camera2StreamConfigurationMap = 0;
                        specialFinancingDetailMapper$toDetailUiModel$1.getOutputMinFrameDuration = 1;
                        java.lang.Object format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, remainingBalance, symbol, 0, specialFinancingDetailMapper$toDetailUiModel$1, 4, null);
                        if (format$default != coroutine_suspended) {
                            obj = format$default;
                            creditProductIdentifier3 = creditProductIdentifier;
                        }
                        return coroutine_suspended;
                    }
                    promotionalActivity2 = promotionalActivity;
                    creditProductIdentifier2 = creditProductIdentifier;
                    str = null;
                    java.lang.String str8 = str == null ? "" : str;
                    purchaseAmount = promotionalActivity2.getPurchaseAmount();
                    if (purchaseAmount != null) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol symbol2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
                        specialFinancingDetailMapper$toDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI = promotionalActivity2;
                        specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier2;
                        specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoFpsRanges = str8;
                        specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(purchaseAmount);
                        specialFinancingDetailMapper$toDetailUiModel$1.Camera2StreamConfigurationMap = 0;
                        specialFinancingDetailMapper$toDetailUiModel$1.getOutputMinFrameDuration = 2;
                        java.lang.String str9 = str8;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier7 = creditProductIdentifier2;
                        java.lang.Object format$default2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade2, purchaseAmount, symbol2, 0, specialFinancingDetailMapper$toDetailUiModel$1, 4, null);
                        if (format$default2 != coroutine_suspended) {
                            promotionalActivity4 = promotionalActivity2;
                            obj2 = format$default2;
                            creditProductIdentifier5 = creditProductIdentifier7;
                            str4 = str9;
                            str3 = (java.lang.String) obj2;
                            str2 = str4;
                            creditProductIdentifier4 = creditProductIdentifier5;
                            promotionalActivity3 = promotionalActivity4;
                            if (str3 == null) {
                            }
                            accruedInterest = promotionalActivity3.getAccruedInterest();
                            if (accruedInterest != null) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    java.lang.String str10 = str8;
                    creditProductIdentifier4 = creditProductIdentifier2;
                    str2 = str10;
                    promotionalActivity3 = promotionalActivity2;
                    str3 = null;
                    if (str3 == null) {
                    }
                    accruedInterest = promotionalActivity3.getAccruedInterest();
                    if (accruedInterest != null) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i2 = specialFinancingDetailMapper$toDetailUiModel$1.Camera2StreamConfigurationMap;
                            str5 = (java.lang.String) specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoSizes;
                            str7 = (java.lang.String) specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoFpsRanges;
                            creditProductIdentifier6 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoFpsRangesFor;
                            promotionalActivity5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) specialFinancingDetailMapper$toDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            str6 = (java.lang.String) obj2;
                            promotionalActivity3 = promotionalActivity5;
                            str2 = str7;
                            creditProductIdentifier4 = creditProductIdentifier6;
                            if (str6 == null) {
                                str6 = "";
                            }
                            java.util.Locale locale = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier4);
                            java.time.Instant purchaseDate = promotionalActivity3.getPurchaseDate();
                            format = purchaseDate != null ? this.getHighSpeedVideoFpsRanges.format(purchaseDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateLong.INSTANCE, locale) : null;
                            if (format == null) {
                                format = "";
                            }
                            java.time.Instant expirationDate = promotionalActivity3.getExpirationDate();
                            format2 = expirationDate != null ? this.getHighSpeedVideoFpsRanges.format(expirationDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateLong.INSTANCE, locale) : null;
                            if (format2 == null) {
                                format2 = "";
                            }
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString merchantNameUiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapperKt.toMerchantNameUiString(promotionalActivity3.getTitle());
                            java.lang.String icon = promotionalActivity3.getIcon();
                            if (format2.length() > 0) {
                                empty = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_special_financing_activity_subtitle, new java.lang.Object[]{format2}, null, false, 12, null);
                            } else {
                                empty = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                            }
                            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.uimodel.SpecialFinancingDetailUiModel(merchantNameUiString, icon, empty, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str2), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(format), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str5), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(format2), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str6), promotionalActivity3.getStatus() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus.ACTIVE, null, 512, null);
                        }
                        int i3 = specialFinancingDetailMapper$toDetailUiModel$1.Camera2StreamConfigurationMap;
                        str4 = (java.lang.String) specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoFpsRanges;
                        creditProductIdentifier5 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoFpsRangesFor;
                        promotionalActivity4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) specialFinancingDetailMapper$toDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        str3 = (java.lang.String) obj2;
                        str2 = str4;
                        creditProductIdentifier4 = creditProductIdentifier5;
                        promotionalActivity3 = promotionalActivity4;
                        if (str3 == null) {
                            str3 = "";
                        }
                        accruedInterest = promotionalActivity3.getAccruedInterest();
                        if (accruedInterest != null) {
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade3 = this.getHighResolutionOutputSizeshNQ4ISI;
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol symbol3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
                            specialFinancingDetailMapper$toDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI = promotionalActivity3;
                            specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier4;
                            specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoFpsRanges = str2;
                            specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoSizes = str3;
                            specialFinancingDetailMapper$toDetailUiModel$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accruedInterest);
                            specialFinancingDetailMapper$toDetailUiModel$1.Camera2StreamConfigurationMap = 0;
                            specialFinancingDetailMapper$toDetailUiModel$1.getOutputMinFrameDuration = 3;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper$toDetailUiModel$1 specialFinancingDetailMapper$toDetailUiModel$12 = specialFinancingDetailMapper$toDetailUiModel$1;
                            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier8 = creditProductIdentifier4;
                            java.lang.String str11 = str2;
                            java.lang.Object format$default3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade3, accruedInterest, symbol3, 0, specialFinancingDetailMapper$toDetailUiModel$12, 4, null);
                            if (format$default3 != coroutine_suspended) {
                                creditProductIdentifier6 = creditProductIdentifier8;
                                promotionalActivity5 = promotionalActivity3;
                                str7 = str11;
                                str5 = str3;
                                obj2 = format$default3;
                                str6 = (java.lang.String) obj2;
                                promotionalActivity3 = promotionalActivity5;
                                str2 = str7;
                                creditProductIdentifier4 = creditProductIdentifier6;
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
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString merchantNameUiString2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapperKt.toMerchantNameUiString(promotionalActivity3.getTitle());
                                java.lang.String icon2 = promotionalActivity3.getIcon();
                                if (format2.length() > 0) {
                                }
                                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.uimodel.SpecialFinancingDetailUiModel(merchantNameUiString2, icon2, empty, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str2), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(format), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str5), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(format2), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str6), promotionalActivity3.getStatus() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus.ACTIVE, null, 512, null);
                            }
                            return coroutine_suspended;
                        }
                        str5 = str3;
                        str6 = null;
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
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString merchantNameUiString22 = com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapperKt.toMerchantNameUiString(promotionalActivity3.getTitle());
                        java.lang.String icon22 = promotionalActivity3.getIcon();
                        if (format2.length() > 0) {
                        }
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.uimodel.SpecialFinancingDetailUiModel(merchantNameUiString22, icon22, empty, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str2), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(format), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str5), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(format2), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str6), promotionalActivity3.getStatus() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus.ACTIVE, null, 512, null);
                    }
                    int i4 = specialFinancingDetailMapper$toDetailUiModel$1.Camera2StreamConfigurationMap;
                    creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) specialFinancingDetailMapper$toDetailUiModel$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity6 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) specialFinancingDetailMapper$toDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    obj = obj2;
                    promotionalActivity2 = promotionalActivity6;
                }
                str = (java.lang.String) obj;
                creditProductIdentifier2 = creditProductIdentifier3;
                if (str == null) {
                }
                purchaseAmount = promotionalActivity2.getPurchaseAmount();
                if (purchaseAmount != null) {
                }
            }
        }
        specialFinancingDetailMapper$toDetailUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper$toDetailUiModel$1(this, continuation);
        java.lang.Object obj22 = specialFinancingDetailMapper$toDetailUiModel$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = specialFinancingDetailMapper$toDetailUiModel$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        str = (java.lang.String) obj;
        creditProductIdentifier2 = creditProductIdentifier3;
        if (str == null) {
        }
        purchaseAmount = promotionalActivity2.getPurchaseAmount();
        if (purchaseAmount != null) {
        }
    }
}
