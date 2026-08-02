package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u001a\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/BalanceModuleUiMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/mapper/ScheduledPaymentInfoMapper;", "scheduledPaymentInfoMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/PersistentDebtUiMapper;", "persistentDebtUiMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/mapper/ScheduledPaymentInfoMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/PersistentDebtUiMapper;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "accountSummaryOverview", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/BalanceModuleUiModel;", "mapToBalanceModuleUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "autopayOverview", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/Billing;", "billing", "", "formattedCustomAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopaystatus/autopayRow/AutopayRowUiModel;", "mapAutopayStatus", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/Billing;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopaystatus/autopayRow/AutopayRowUiModel;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/mapper/ScheduledPaymentInfoMapper;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/PersistentDebtUiMapper;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BalanceModuleUiMapper {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PersistentDebtUiMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public BalanceModuleUiMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper scheduledPaymentInfoMapper, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PersistentDebtUiMapper persistentDebtUiMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduledPaymentInfoMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentDebtUiMapper, "");
        this.getHighSpeedVideoSizes = currencyFormatterFacade;
        this.getHighResolutionOutputSizeshNQ4ISI = dateFormatterFacade;
        this.Camera2StreamConfigurationMap = scheduledPaymentInfoMapper;
        this.getHighSpeedVideoFpsRanges = persistentDebtUiMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mapToBalanceModuleUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper$mapToBalanceModuleUiModel$1 balanceModuleUiMapper$mapToBalanceModuleUiModel$1;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview;
        java.util.Locale locale;
        java.lang.Object format$default;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount temporaryCreditLine;
        java.lang.Object format$default2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object format$default3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView3;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier4;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Object format$default4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview4;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount minimumPaymentToAvoidInterest;
        java.lang.String str10;
        java.lang.String str11;
        java.util.Locale locale2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing4;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier6;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.util.Locale locale3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview6;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing5;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier7;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.Object format$default5;
        java.lang.String str19;
        java.lang.String str20;
        java.lang.String str21;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier8;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView6;
        java.lang.String str22;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing6;
        java.util.Locale locale4;
        java.lang.String str23;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview5;
        java.lang.String str24;
        java.lang.String str25;
        java.lang.String str26;
        java.lang.String str27;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel minimumPaymentUiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount temporaryCreditLine2;
        java.lang.Double doubleOrNull;
        double d;
        java.lang.String value;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel autopayRowUiModel;
        boolean z;
        float coerceIn;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper balanceModuleUiMapper;
        java.lang.Object map;
        java.lang.String str28;
        float f;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel autopayRowUiModel2;
        boolean z2;
        java.lang.String str29;
        java.lang.String str30;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel minimumPaymentUiModel2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier9;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview7;
        java.lang.String value2;
        java.lang.String value3;
        java.lang.Double doubleOrNull2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalance;
        java.lang.String value4;
        java.lang.Double doubleOrNull3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView7 = accountSummaryOverView;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper$mapToBalanceModuleUiModel$1) {
            balanceModuleUiMapper$mapToBalanceModuleUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper$mapToBalanceModuleUiModel$1) continuation;
            if ((balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs & Integer.MIN_VALUE) != 0) {
                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs -= 2147483648;
                java.lang.Object obj = balanceModuleUiMapper$mapToBalanceModuleUiModel$1.isOutputSupportedForhNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview8 = accountSummaryOverView7 != null ? accountSummaryOverView.getAccountOverview() : null;
                        if (accountOverview8 == null || (billing = accountOverview8.getBilling()) == null) {
                            return null;
                        }
                        autopayOverview = accountSummaryOverView.getAutopayOverview();
                        locale = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier);
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalance2 = billing.getCurrentBalance();
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = accountSummaryOverView7;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview8;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = billing;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = autopayOverview;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = locale;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 1;
                        format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, currentBalance2, null, 0, balanceModuleUiMapper$mapToBalanceModuleUiModel$1, 6, null);
                        if (format$default != coroutine_suspended) {
                            accountOverview = accountOverview8;
                            creditProductIdentifier2 = creditProductIdentifier;
                            java.lang.String str31 = (java.lang.String) format$default;
                            java.lang.String str32 = str31 != null ? "" : str31;
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade2 = this.getHighSpeedVideoSizes;
                            temporaryCreditLine = billing.getTemporaryCreditLine();
                            if (temporaryCreditLine == null) {
                                temporaryCreditLine = billing.getCreditLine();
                            }
                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = accountSummaryOverView7;
                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier2;
                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview;
                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = billing;
                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = autopayOverview;
                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = locale;
                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str32;
                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 2;
                            java.lang.String str33 = str32;
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview9 = accountOverview;
                            format$default2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade2, temporaryCreditLine, null, 0, balanceModuleUiMapper$mapToBalanceModuleUiModel$1, 6, null);
                            if (format$default2 != coroutine_suspended) {
                                accountSummaryOverView2 = accountSummaryOverView7;
                                creditProductIdentifier3 = creditProductIdentifier2;
                                obj = format$default2;
                                accountOverview2 = accountOverview9;
                                str = str33;
                                str2 = (java.lang.String) obj;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade3 = this.getHighSpeedVideoSizes;
                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount openToBuy = billing.getOpenToBuy();
                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = accountSummaryOverView2;
                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier3;
                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview2;
                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = billing;
                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = autopayOverview;
                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = locale;
                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str;
                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM = str2;
                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 3;
                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView8 = accountSummaryOverView2;
                                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier10 = creditProductIdentifier3;
                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview10 = accountOverview2;
                                format$default3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade3, openToBuy, null, 0, balanceModuleUiMapper$mapToBalanceModuleUiModel$1, 6, null);
                                if (format$default3 != coroutine_suspended) {
                                    billing2 = billing;
                                    accountOverview3 = accountOverview10;
                                    accountSummaryOverView3 = accountSummaryOverView8;
                                    creditProductIdentifier4 = creditProductIdentifier10;
                                    str3 = str;
                                    str4 = str2;
                                    obj = format$default3;
                                    str5 = (java.lang.String) obj;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade4 = this.getHighSpeedVideoSizes;
                                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount minimumPaymentDue = billing2.getMinimumPaymentDue();
                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = accountSummaryOverView3;
                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier4;
                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview3;
                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = billing2;
                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = autopayOverview;
                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = locale;
                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str3;
                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM = str4;
                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI = str5;
                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 4;
                                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView9 = accountSummaryOverView3;
                                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier11 = creditProductIdentifier4;
                                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview11 = accountOverview3;
                                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing7 = billing2;
                                    format$default4 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade4, minimumPaymentDue, null, 0, balanceModuleUiMapper$mapToBalanceModuleUiModel$1, 6, null);
                                    if (format$default4 != coroutine_suspended) {
                                        autopayOverview2 = autopayOverview;
                                        creditProductIdentifier5 = creditProductIdentifier11;
                                        billing3 = billing7;
                                        accountSummaryOverView4 = accountSummaryOverView9;
                                        accountOverview4 = accountOverview11;
                                        str6 = str3;
                                        str7 = str4;
                                        str8 = str5;
                                        obj = format$default4;
                                        str9 = (java.lang.String) obj;
                                        if (str9 == null) {
                                            str9 = "";
                                        }
                                        minimumPaymentToAvoidInterest = billing3.getMinimumPaymentToAvoidInterest();
                                        if (minimumPaymentToAvoidInterest == null) {
                                            com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade5 = this.getHighSpeedVideoSizes;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = accountSummaryOverView4;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier5;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview4;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = billing3;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = autopayOverview2;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = locale;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str6;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM = str7;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI = str8;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.toString = str9;
                                            java.lang.String str34 = str8;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(minimumPaymentToAvoidInterest);
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 5;
                                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView10 = accountSummaryOverView4;
                                            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier12 = creditProductIdentifier5;
                                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview12 = accountOverview4;
                                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing8 = billing3;
                                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview6 = autopayOverview2;
                                            java.lang.Object format$default6 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade5, minimumPaymentToAvoidInterest, null, 0, balanceModuleUiMapper$mapToBalanceModuleUiModel$1, 6, null);
                                            if (format$default6 != coroutine_suspended) {
                                                str15 = str7;
                                                str16 = str6;
                                                locale3 = locale;
                                                accountOverview6 = accountOverview12;
                                                autopayOverview4 = autopayOverview6;
                                                accountSummaryOverView5 = accountSummaryOverView10;
                                                billing5 = billing8;
                                                creditProductIdentifier7 = creditProductIdentifier12;
                                                str17 = str9;
                                                obj = format$default6;
                                                str18 = str34;
                                                str14 = (java.lang.String) obj;
                                                accountOverview5 = accountOverview6;
                                                locale2 = locale3;
                                                str10 = str15;
                                                str11 = str16;
                                                accountSummaryOverView4 = accountSummaryOverView5;
                                                creditProductIdentifier6 = creditProductIdentifier7;
                                                str12 = str17;
                                                str13 = str18;
                                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing9 = billing5;
                                                autopayOverview3 = autopayOverview4;
                                                billing4 = billing9;
                                                com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade6 = this.getHighSpeedVideoSizes;
                                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount customAmount = autopayOverview3 != null ? autopayOverview3.getCustomAmount() : null;
                                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = accountSummaryOverView4;
                                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier6;
                                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview5;
                                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = billing4;
                                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = autopayOverview3;
                                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = locale2;
                                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str11;
                                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM = str10;
                                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI = str13;
                                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.toString = str12;
                                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizes = str14;
                                                java.lang.String str35 = str13;
                                                balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 6;
                                                java.lang.String str36 = str11;
                                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = customAmount;
                                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView11 = accountSummaryOverView4;
                                                java.lang.String str37 = str10;
                                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing10 = billing4;
                                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview7 = autopayOverview3;
                                                java.util.Locale locale5 = locale2;
                                                format$default5 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade6, currencyAmount, null, 0, balanceModuleUiMapper$mapToBalanceModuleUiModel$1, 6, null);
                                                if (format$default5 != coroutine_suspended) {
                                                    str19 = str37;
                                                    str20 = str14;
                                                    obj = format$default5;
                                                    str21 = str12;
                                                    creditProductIdentifier8 = creditProductIdentifier6;
                                                    accountSummaryOverView6 = accountSummaryOverView11;
                                                    str22 = str35;
                                                    billing6 = billing10;
                                                    locale4 = locale5;
                                                    str23 = str36;
                                                    autopayOverview5 = autopayOverview7;
                                                    str24 = (java.lang.String) obj;
                                                    if (str24 != null) {
                                                        str24 = "";
                                                        str25 = str24;
                                                    } else {
                                                        str25 = "";
                                                    }
                                                    java.lang.String str38 = str20;
                                                    java.lang.String format = this.getHighResolutionOutputSizeshNQ4ISI.format(billing6.getNextPaymentDueTime(), com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale4);
                                                    java.lang.String str39 = format != null ? str25 : format;
                                                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations = accountSummaryOverView6.getProductConfigurations();
                                                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls contentUrls = accountSummaryOverView6.getContentUrls();
                                                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl avoidInterestOnNextStatementGuide = contentUrls == null ? contentUrls.getAvoidInterestOnNextStatementGuide() : null;
                                                    if (billing6.getMinimumPaymentDue() != null) {
                                                        str26 = str22;
                                                        minimumPaymentUiModel = null;
                                                    } else {
                                                        str26 = str22;
                                                        if (productConfigurations != null && productConfigurations.checkCapability(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.REPAY_AMOUNT_TO_AVOID_INTEREST)) {
                                                            str27 = str38;
                                                            minimumPaymentUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel(str21, str39, str27, avoidInterestOnNextStatementGuide);
                                                        }
                                                        str27 = null;
                                                        minimumPaymentUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel(str21, str39, str27, avoidInterestOnNextStatementGuide);
                                                    }
                                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel mapAutopayStatus = mapAutopayStatus(autopayOverview5, billing6, str24, creditProductIdentifier8);
                                                    boolean z3 = (billing6 != null || (currentBalance = billing6.getCurrentBalance()) == null || (value4 = currentBalance.getValue()) == null || (doubleOrNull3 = kotlin.text.StringsKt.toDoubleOrNull(value4)) == null || doubleOrNull3.doubleValue() <= 0.0d) ? false : true;
                                                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalance3 = billing6.getCurrentBalance();
                                                    double doubleValue = (currentBalance3 != null || (value3 = currentBalance3.getValue()) == null || (doubleOrNull2 = kotlin.text.StringsKt.toDoubleOrNull(value3)) == null) ? 0.0d : doubleOrNull2.doubleValue();
                                                    temporaryCreditLine2 = billing6.getTemporaryCreditLine();
                                                    if (temporaryCreditLine2 != null || (value2 = temporaryCreditLine2.getValue()) == null || (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(value2)) == null) {
                                                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount creditLine = billing6.getCreditLine();
                                                        doubleOrNull = (creditLine != null || (value = creditLine.getValue()) == null) ? null : kotlin.text.StringsKt.toDoubleOrNull(value);
                                                        if (doubleOrNull == null) {
                                                            d = 0.0d;
                                                            if (d > 0.0d && doubleValue >= 0.0d) {
                                                                autopayRowUiModel = mapAutopayStatus;
                                                                z = z3;
                                                                coerceIn = kotlin.ranges.RangesKt.coerceIn((float) ((doubleValue / d) * 100.0d), 0.0f, 100.0f);
                                                            } else {
                                                                autopayRowUiModel = mapAutopayStatus;
                                                                z = z3;
                                                                coerceIn = 0.0f;
                                                            }
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSummaryOverView6);
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier8;
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview5;
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(billing6);
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autopayOverview5);
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale4);
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str23;
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM = str19;
                                                            java.lang.String str40 = str26;
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI = str40;
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str21);
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str38);
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str24);
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str39);
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDuration = minimumPaymentUiModel;
                                                            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel autopayRowUiModel3 = autopayRowUiModel;
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizesFor = autopayRowUiModel3;
                                                            boolean z4 = z;
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.isOutputSupportedFor = z4;
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRanges = coerceIn;
                                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 7;
                                                            balanceModuleUiMapper = this;
                                                            map = balanceModuleUiMapper.Camera2StreamConfigurationMap.map(accountSummaryOverView6 == null ? accountSummaryOverView6.getRepayments() : null, creditProductIdentifier8, balanceModuleUiMapper$mapToBalanceModuleUiModel$1);
                                                            if (map != coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                            str28 = str40;
                                                            f = coerceIn;
                                                            autopayRowUiModel2 = autopayRowUiModel3;
                                                            obj = map;
                                                            z2 = z4;
                                                            str29 = str23;
                                                            str30 = str19;
                                                            minimumPaymentUiModel2 = minimumPaymentUiModel;
                                                            creditProductIdentifier9 = creditProductIdentifier8;
                                                            accountOverview7 = accountOverview5;
                                                            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj;
                                                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon cardDisplayLogo = accountOverview7.getCardDisplayLogo();
                                                            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel(str29, str30, str28, minimumPaymentUiModel2, autopayRowUiModel2, z2, uiString, f, cardDisplayLogo == null ? cardDisplayLogo.getContentDeliveryNetwork() : null, accountOverview7.getBilling().getPaymentStatus() != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus.PAST_DUE, balanceModuleUiMapper.getHighSpeedVideoFpsRanges.toUiModel$revolvingcredit_servicing_prodRelease(accountOverview7.getPersistentDebt(), creditProductIdentifier9));
                                                        }
                                                    }
                                                    d = doubleOrNull.doubleValue();
                                                    if (d > 0.0d) {
                                                        autopayRowUiModel = mapAutopayStatus;
                                                        z = z3;
                                                        coerceIn = kotlin.ranges.RangesKt.coerceIn((float) ((doubleValue / d) * 100.0d), 0.0f, 100.0f);
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSummaryOverView6);
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier8;
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview5;
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(billing6);
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autopayOverview5);
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale4);
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str23;
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM = str19;
                                                        java.lang.String str402 = str26;
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI = str402;
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str21);
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str38);
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str24);
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str39);
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDuration = minimumPaymentUiModel;
                                                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel autopayRowUiModel32 = autopayRowUiModel;
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizesFor = autopayRowUiModel32;
                                                        boolean z42 = z;
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.isOutputSupportedFor = z42;
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRanges = coerceIn;
                                                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 7;
                                                        balanceModuleUiMapper = this;
                                                        map = balanceModuleUiMapper.Camera2StreamConfigurationMap.map(accountSummaryOverView6 == null ? accountSummaryOverView6.getRepayments() : null, creditProductIdentifier8, balanceModuleUiMapper$mapToBalanceModuleUiModel$1);
                                                        if (map != coroutine_suspended) {
                                                        }
                                                    }
                                                    autopayRowUiModel = mapAutopayStatus;
                                                    z = z3;
                                                    coerceIn = 0.0f;
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSummaryOverView6);
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier8;
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview5;
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(billing6);
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autopayOverview5);
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale4);
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str23;
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM = str19;
                                                    java.lang.String str4022 = str26;
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI = str4022;
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str21);
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str38);
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str24);
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str39);
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDuration = minimumPaymentUiModel;
                                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel autopayRowUiModel322 = autopayRowUiModel;
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizesFor = autopayRowUiModel322;
                                                    boolean z422 = z;
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.isOutputSupportedFor = z422;
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRanges = coerceIn;
                                                    balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 7;
                                                    balanceModuleUiMapper = this;
                                                    map = balanceModuleUiMapper.Camera2StreamConfigurationMap.map(accountSummaryOverView6 == null ? accountSummaryOverView6.getRepayments() : null, creditProductIdentifier8, balanceModuleUiMapper$mapToBalanceModuleUiModel$1);
                                                    if (map != coroutine_suspended) {
                                                    }
                                                }
                                            }
                                        } else {
                                            java.lang.String str41 = str8;
                                            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier13 = creditProductIdentifier5;
                                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing11 = billing3;
                                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview8 = autopayOverview2;
                                            str10 = str7;
                                            str11 = str6;
                                            locale2 = locale;
                                            accountOverview5 = accountOverview4;
                                            autopayOverview3 = autopayOverview8;
                                            billing4 = billing11;
                                            creditProductIdentifier6 = creditProductIdentifier13;
                                            str12 = str9;
                                            str13 = str41;
                                            str14 = null;
                                            com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade62 = this.getHighSpeedVideoSizes;
                                            if (autopayOverview3 != null) {
                                            }
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = accountSummaryOverView4;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier6;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview5;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = billing4;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = autopayOverview3;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = locale2;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str11;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM = str10;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI = str13;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.toString = str12;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizes = str14;
                                            java.lang.String str352 = str13;
                                            balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 6;
                                            java.lang.String str362 = str11;
                                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = customAmount;
                                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView112 = accountSummaryOverView4;
                                            java.lang.String str372 = str10;
                                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing102 = billing4;
                                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview72 = autopayOverview3;
                                            java.util.Locale locale52 = locale2;
                                            format$default5 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade62, currencyAmount2, null, 0, balanceModuleUiMapper$mapToBalanceModuleUiModel$1, 6, null);
                                            if (format$default5 != coroutine_suspended) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        java.util.Locale locale6 = (java.util.Locale) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview9 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing12 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview13 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier14 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView12 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        locale = locale6;
                        autopayOverview = autopayOverview9;
                        billing = billing12;
                        accountOverview = accountOverview13;
                        accountSummaryOverView7 = accountSummaryOverView12;
                        format$default = obj;
                        creditProductIdentifier2 = creditProductIdentifier14;
                        java.lang.String str312 = (java.lang.String) format$default;
                        if (str312 != null) {
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade22 = this.getHighSpeedVideoSizes;
                        temporaryCreditLine = billing.getTemporaryCreditLine();
                        if (temporaryCreditLine == null) {
                        }
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = accountSummaryOverView7;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier2;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = billing;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = autopayOverview;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = locale;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str32;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 2;
                        java.lang.String str332 = str32;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview92 = accountOverview;
                        format$default2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade22, temporaryCreditLine, null, 0, balanceModuleUiMapper$mapToBalanceModuleUiModel$1, 6, null);
                        if (format$default2 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        str = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes;
                        java.util.Locale locale7 = (java.util.Locale) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview10 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing13 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview14 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier15 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView13 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        locale = locale7;
                        autopayOverview = autopayOverview10;
                        billing = billing13;
                        accountOverview2 = accountOverview14;
                        creditProductIdentifier3 = creditProductIdentifier15;
                        accountSummaryOverView2 = accountSummaryOverView13;
                        str2 = (java.lang.String) obj;
                        if (str2 == null) {
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade32 = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount openToBuy2 = billing.getOpenToBuy();
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = accountSummaryOverView2;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier3;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview2;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = billing;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = autopayOverview;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = locale;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM = str2;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 3;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView82 = accountSummaryOverView2;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier102 = creditProductIdentifier3;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview102 = accountOverview2;
                        format$default3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade32, openToBuy2, null, 0, balanceModuleUiMapper$mapToBalanceModuleUiModel$1, 6, null);
                        if (format$default3 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        str4 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM;
                        java.lang.String str42 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes;
                        java.util.Locale locale8 = (java.util.Locale) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview11 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing14 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview15 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier16 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView14 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str3 = str42;
                        locale = locale8;
                        autopayOverview = autopayOverview11;
                        billing2 = billing14;
                        accountSummaryOverView3 = accountSummaryOverView14;
                        accountOverview3 = accountOverview15;
                        creditProductIdentifier4 = creditProductIdentifier16;
                        str5 = (java.lang.String) obj;
                        if (str5 == null) {
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade42 = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount minimumPaymentDue2 = billing2.getMinimumPaymentDue();
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = accountSummaryOverView3;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier4;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview3;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = billing2;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = autopayOverview;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = locale;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str3;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM = str4;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI = str5;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 4;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView92 = accountSummaryOverView3;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier112 = creditProductIdentifier4;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview112 = accountOverview3;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing72 = billing2;
                        format$default4 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade42, minimumPaymentDue2, null, 0, balanceModuleUiMapper$mapToBalanceModuleUiModel$1, 6, null);
                        if (format$default4 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 4:
                        str8 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.String str43 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM;
                        java.lang.String str44 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes;
                        java.util.Locale locale9 = (java.util.Locale) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview12 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing15 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview16 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier17 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView15 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str6 = str44;
                        locale = locale9;
                        accountSummaryOverView4 = accountSummaryOverView15;
                        str7 = str43;
                        autopayOverview2 = autopayOverview12;
                        creditProductIdentifier5 = creditProductIdentifier17;
                        billing3 = billing15;
                        accountOverview4 = accountOverview16;
                        str9 = (java.lang.String) obj;
                        if (str9 == null) {
                        }
                        minimumPaymentToAvoidInterest = billing3.getMinimumPaymentToAvoidInterest();
                        if (minimumPaymentToAvoidInterest == null) {
                        }
                        break;
                    case 5:
                        int i = balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                        str17 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.toString;
                        str18 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI;
                        str15 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM;
                        str16 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes;
                        locale3 = (java.util.Locale) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM;
                        autopayOverview4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration;
                        billing5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI;
                        accountOverview6 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI;
                        creditProductIdentifier7 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor;
                        accountSummaryOverView5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str14 = (java.lang.String) obj;
                        accountOverview5 = accountOverview6;
                        locale2 = locale3;
                        str10 = str15;
                        str11 = str16;
                        accountSummaryOverView4 = accountSummaryOverView5;
                        creditProductIdentifier6 = creditProductIdentifier7;
                        str12 = str17;
                        str13 = str18;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing92 = billing5;
                        autopayOverview3 = autopayOverview4;
                        billing4 = billing92;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade622 = this.getHighSpeedVideoSizes;
                        if (autopayOverview3 != null) {
                        }
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = accountSummaryOverView4;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier6;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview5;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = billing4;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = autopayOverview3;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = locale2;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str11;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM = str10;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI = str13;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.toString = str12;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizes = str14;
                        java.lang.String str3522 = str13;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 6;
                        java.lang.String str3622 = str11;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount22 = customAmount;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView1122 = accountSummaryOverView4;
                        java.lang.String str3722 = str10;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing1022 = billing4;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview722 = autopayOverview3;
                        java.util.Locale locale522 = locale2;
                        format$default5 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade622, currencyAmount22, null, 0, balanceModuleUiMapper$mapToBalanceModuleUiModel$1, 6, null);
                        if (format$default5 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 6:
                        str20 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizes;
                        str21 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.toString;
                        java.lang.String str45 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI;
                        str19 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM;
                        java.lang.String str46 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes;
                        locale4 = (java.util.Locale) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM;
                        autopayOverview5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration;
                        billing6 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI;
                        accountOverview5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI;
                        creditProductIdentifier8 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor;
                        accountSummaryOverView6 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str22 = str45;
                        str23 = str46;
                        str24 = (java.lang.String) obj;
                        if (str24 != null) {
                        }
                        java.lang.String str382 = str20;
                        java.lang.String format2 = this.getHighResolutionOutputSizeshNQ4ISI.format(billing6.getNextPaymentDueTime(), com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale4);
                        if (format2 != null) {
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations2 = accountSummaryOverView6.getProductConfigurations();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls contentUrls2 = accountSummaryOverView6.getContentUrls();
                        if (contentUrls2 == null) {
                        }
                        if (billing6.getMinimumPaymentDue() != null) {
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel mapAutopayStatus2 = mapAutopayStatus(autopayOverview5, billing6, str24, creditProductIdentifier8);
                        if (billing6 != null) {
                            break;
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalance32 = billing6.getCurrentBalance();
                        if (currentBalance32 != null) {
                            break;
                        }
                        temporaryCreditLine2 = billing6.getTemporaryCreditLine();
                        if (temporaryCreditLine2 != null) {
                            break;
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount creditLine2 = billing6.getCreditLine();
                        if (creditLine2 != null) {
                            break;
                        }
                        if (doubleOrNull == null) {
                        }
                        d = doubleOrNull.doubleValue();
                        if (d > 0.0d) {
                        }
                        autopayRowUiModel = mapAutopayStatus2;
                        z = z3;
                        coerceIn = 0.0f;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSummaryOverView6);
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier8;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI = accountOverview5;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(billing6);
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autopayOverview5);
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale4);
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes = str23;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM = str19;
                        java.lang.String str40222 = str26;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI = str40222;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str21);
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str382);
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str24);
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str39);
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDuration = minimumPaymentUiModel;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel autopayRowUiModel3222 = autopayRowUiModel;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizesFor = autopayRowUiModel3222;
                        boolean z4222 = z;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.isOutputSupportedFor = z4222;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRanges = coerceIn;
                        balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs = 7;
                        balanceModuleUiMapper = this;
                        map = balanceModuleUiMapper.Camera2StreamConfigurationMap.map(accountSummaryOverView6 == null ? accountSummaryOverView6.getRepayments() : null, creditProductIdentifier8, balanceModuleUiMapper$mapToBalanceModuleUiModel$1);
                        if (map != coroutine_suspended) {
                        }
                        break;
                    case 7:
                        float f2 = balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRanges;
                        boolean z5 = balanceModuleUiMapper$mapToBalanceModuleUiModel$1.isOutputSupportedFor;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel autopayRowUiModel4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel minimumPaymentUiModel3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.MinimumPaymentUiModel) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputMinFrameDuration;
                        java.lang.String str47 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.String str48 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputStallDurationlomOqCM;
                        java.lang.String str49 = (java.lang.String) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getOutputSizes;
                        accountOverview7 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getInputSizeshNQ4ISI;
                        creditProductIdentifier9 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) balanceModuleUiMapper$mapToBalanceModuleUiModel$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        f = f2;
                        z2 = z5;
                        autopayRowUiModel2 = autopayRowUiModel4;
                        minimumPaymentUiModel2 = minimumPaymentUiModel3;
                        str28 = str47;
                        str30 = str48;
                        str29 = str49;
                        balanceModuleUiMapper = this;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon cardDisplayLogo2 = accountOverview7.getCardDisplayLogo();
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel(str29, str30, str28, minimumPaymentUiModel2, autopayRowUiModel2, z2, uiString2, f, cardDisplayLogo2 == null ? cardDisplayLogo2.getContentDeliveryNetwork() : null, accountOverview7.getBilling().getPaymentStatus() != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus.PAST_DUE, balanceModuleUiMapper.getHighSpeedVideoFpsRanges.toUiModel$revolvingcredit_servicing_prodRelease(accountOverview7.getPersistentDebt(), creditProductIdentifier9));
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        balanceModuleUiMapper$mapToBalanceModuleUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper$mapToBalanceModuleUiModel$1(this, continuation);
        java.lang.Object obj2 = balanceModuleUiMapper$mapToBalanceModuleUiModel$1.isOutputSupportedForhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (balanceModuleUiMapper$mapToBalanceModuleUiModel$1.unwrapAs) {
        }
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel mapAutopayStatus(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing, java.lang.String formattedCustomAmount, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.StatementBalance statementBalance;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel autopayMethodUiModel;
        java.lang.String str = formattedCustomAmount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, creditProductIdentifier, true);
        if (autopayOverview == null) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.PartialError(null, stringResOnly, 1, null);
        }
        boolean enrolled = autopayOverview.getEnrolled();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext autopayAlertContext = (billing != null ? billing.getPaymentStatus() : null) == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus.PAST_DUE ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext.PaymentPastDue : null;
        if (enrolled) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption repaymentOption = autopayOverview.getRepaymentOption();
            int i = repaymentOption == null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper.WhenMappings.$EnumSwitchMapping$0[repaymentOption.ordinal()];
            if (i == 1) {
                statementBalance = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.StatementBalance.INSTANCE;
            } else {
                if (i == 2) {
                    if (str == null) {
                        str = "";
                    }
                    autopayMethodUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.CustomAmount(str);
                    return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Enabled(autopayMethodUiModel, autopayAlertContext, null, stringResOnly, 4, null);
                }
                statementBalance = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.MinimumPaymentDue(creditProductIdentifier);
            }
            autopayMethodUiModel = statementBalance;
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Enabled(autopayMethodUiModel, autopayAlertContext, null, stringResOnly, 4, null);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Disabled(autopayAlertContext, null, stringResOnly, 2, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
