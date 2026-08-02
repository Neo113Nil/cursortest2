package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u0016\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/mapper/ReviewPaymentUiModelMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatter", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatter", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;", "args", "Ljava/time/LocalDate;", "paymentDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/uimodel/ReviewPaymentUiModel;", "toReviewPaymentUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p1", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;", "p2", "Ljava/util/Locale;", "p3", "(Ljava/time/LocalDate;ZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;Ljava/util/Locale;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReviewPaymentUiModelMapper {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ReviewPaymentUiModelMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        this.Camera2StreamConfigurationMap = currencyFormatterFacade;
        this.getHighResolutionOutputSizeshNQ4ISI = dateFormatterFacade;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toReviewPaymentUiModel(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs, java.time.LocalDate localDate, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$toReviewPaymentUiModel$1 reviewPaymentUiModelMapper$toReviewPaymentUiModel$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString highSpeedVideoFpsRanges;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs2;
        boolean z;
        java.util.Locale locale;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        java.lang.String str;
        java.lang.Object obj;
        boolean z2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty empty;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument selectedFundingInstrument;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty empty2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4;
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object obj2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString5;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs3;
        java.lang.String str2;
        boolean z3;
        boolean z4;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString6;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString7;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType;
        int i2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter;
        java.time.LocalDate localDate2 = localDate;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$toReviewPaymentUiModel$1) {
            reviewPaymentUiModelMapper$toReviewPaymentUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$toReviewPaymentUiModel$1) continuation;
            if ((reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputSizes -= 2147483648;
                java.lang.Object obj3 = reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    java.util.Locale locale2 = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(reviewPaymentArgs.getCreditProductIdentifier());
                    boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(localDate2, java.time.LocalDate.now());
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(localDate2, areEqual, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateLong.INSTANCE, locale2);
                    highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(localDate2, areEqual, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale2);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount paymentAmount = reviewPaymentArgs.getPaymentAmount();
                    reviewPaymentArgs2 = reviewPaymentArgs;
                    reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoFpsRanges = reviewPaymentArgs2;
                    reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighResolutionOutputSizeshNQ4ISI = localDate2;
                    reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale2);
                    reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.Camera2StreamConfigurationMap = highSpeedVideoFpsRanges2;
                    reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getInputSizeshNQ4ISI = highSpeedVideoFpsRanges;
                    reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getInputFormats = areEqual;
                    reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputSizes = 1;
                    java.lang.Object highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(paymentAmount, reviewPaymentUiModelMapper$toReviewPaymentUiModel$1);
                    if (highSpeedVideoFpsRanges3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = areEqual;
                    obj3 = highSpeedVideoFpsRanges3;
                    locale = locale2;
                    uiString = highSpeedVideoFpsRanges2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z4 = reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputSizeshNQ4ISI;
                        int i3 = reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoFpsRangesFor;
                        boolean z5 = reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getInputFormats;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString8 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputMinFrameDuration;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString9 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputFormats;
                        java.lang.String str3 = (java.lang.String) reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoSizesFor;
                        uiString4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString10 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.Camera2StreamConfigurationMap;
                        reviewPaymentArgs3 = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs) reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        uiString6 = uiString9;
                        str2 = str3;
                        uiString5 = uiString10;
                        uiString7 = uiString8;
                        z3 = z5;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString11 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj3;
                        java.lang.String termsAndConditionsUrl = reviewPaymentArgs3.getTermsAndConditionsUrl();
                        if (!z4) {
                            revolvingCreditPaymentType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.SCHEDULED;
                        } else {
                            revolvingCreditPaymentType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.REAL_TIME;
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType2 = revolvingCreditPaymentType;
                        if (!z3) {
                            i2 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_review_sameday_disclaimer;
                        } else {
                            i2 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_review_future_disclaimer;
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(i2, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        if (!z3) {
                            stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_review_button, new java.lang.Object[]{str2}, null, false, 12, null);
                        } else {
                            stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_review_button_scheduled, new java.lang.Object[]{str2, uiString4}, null, false, 12, null);
                        }
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel(uiString7, uiString5, uiString4, stringResWithParameter, uiString11, str2, termsAndConditionsUrl, uiString6, stringResOnly, null, null, revolvingCreditPaymentType2, 1536, null);
                    }
                    boolean z6 = reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getInputFormats;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString12 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString13 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.Camera2StreamConfigurationMap;
                    java.util.Locale locale3 = (java.util.Locale) reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoSizes;
                    java.time.LocalDate localDate3 = (java.time.LocalDate) reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    reviewPaymentArgs2 = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs) reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    z = z6;
                    localDate2 = localDate3;
                    locale = locale3;
                    uiString = uiString13;
                    highSpeedVideoFpsRanges = uiString12;
                }
                java.lang.String str4 = (java.lang.String) obj3;
                boolean z7 = reviewPaymentArgs2.getSelectedFundingInstrument() instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance;
                boolean isAfter = localDate2.isAfter(java.time.LocalDate.now());
                if (reviewPaymentArgs2.getBackupPaymentMethod() != null) {
                    str = str4;
                    obj = coroutine_suspended;
                    z2 = z;
                    uiString2 = highSpeedVideoFpsRanges;
                    empty = (z7 && isAfter) ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE : null;
                } else {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument backupPaymentMethod = reviewPaymentArgs2.getBackupPaymentMethod();
                    obj = coroutine_suspended;
                    java.lang.String str5 = "";
                    if (backupPaymentMethod instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank fundingInstrumentBank = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) backupPaymentMethod;
                        java.lang.String name2 = fundingInstrumentBank.getName();
                        if (name2 != null) {
                            sb.append(name2);
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType type = fundingInstrumentBank.getType();
                        if (type != null) {
                            if (sb.length() > 0) {
                                sb.append(" ");
                            }
                            z2 = z;
                            java.lang.String lowerCase = type.name().toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                            if (lowerCase.length() > 0) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                str = str4;
                                java.lang.String valueOf = java.lang.String.valueOf(lowerCase.charAt(0));
                                kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
                                uiString2 = highSpeedVideoFpsRanges;
                                java.lang.String upperCase = valueOf.toUpperCase(java.util.Locale.ROOT);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                                sb2.append((java.lang.Object) upperCase);
                                java.lang.String substring = lowerCase.substring(1);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                                sb2.append(substring);
                                lowerCase = sb2.toString();
                            } else {
                                str = str4;
                                uiString2 = highSpeedVideoFpsRanges;
                            }
                            sb.append(lowerCase);
                        } else {
                            str = str4;
                            z2 = z;
                            uiString2 = highSpeedVideoFpsRanges;
                        }
                        java.lang.String lastNChars = fundingInstrumentBank.getLastNChars();
                        if (lastNChars != null) {
                            if (sb.length() > 0) {
                                sb.append(" ");
                            }
                            sb.append(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConstants.SSN_MASK_CHAR.concat(java.lang.String.valueOf(lastNChars)));
                        }
                        str5 = sb.toString();
                    } else {
                        str = str4;
                        z2 = z;
                        uiString2 = highSpeedVideoFpsRanges;
                        if (backupPaymentMethod instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard fundingInstrumentCard = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard) backupPaymentMethod;
                            java.lang.String name3 = fundingInstrumentCard.getName();
                            if (name3 != null) {
                                sb3.append(name3);
                            }
                            if (sb3.length() > 0) {
                                sb3.append(" ");
                            }
                            sb3.append(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConstants.SSN_MASK_CHAR.concat(java.lang.String.valueOf(fundingInstrumentCard.getLastNChars())));
                            str5 = sb3.toString();
                        } else if (!(backupPaymentMethod instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    empty = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_has_backup_payment_method, new java.lang.Object[]{str5}, null, false, 12, null);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString14 = empty;
                selectedFundingInstrument = reviewPaymentArgs2.getSelectedFundingInstrument();
                if (!(selectedFundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank)) {
                    java.lang.String name4 = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) selectedFundingInstrument).getName();
                    if (name4 != null) {
                        plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(name4);
                        uiString3 = plainString;
                    } else {
                        empty2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                        uiString3 = empty2;
                    }
                } else {
                    if (selectedFundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) {
                        empty2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_confirmation_paypal_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    } else {
                        if (!(selectedFundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        java.lang.String name5 = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard) selectedFundingInstrument).getName();
                        if (name5 != null) {
                            plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(name5);
                            uiString3 = plainString;
                        } else {
                            empty2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                        }
                    }
                    uiString3 = empty2;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument selectedFundingInstrument2 = reviewPaymentArgs2.getSelectedFundingInstrument();
                reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoFpsRanges = reviewPaymentArgs2;
                reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(localDate2);
                reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.Camera2StreamConfigurationMap = uiString;
                uiString4 = uiString2;
                reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getInputSizeshNQ4ISI = uiString4;
                java.lang.String str6 = str;
                reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoSizesFor = str6;
                reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputFormats = uiString14;
                reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputMinFrameDuration = uiString3;
                boolean z8 = z2;
                reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getInputFormats = z8;
                reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoFpsRangesFor = z7 ? 1 : 0;
                reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputSizeshNQ4ISI = isAfter;
                reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputSizes = 2;
                highSpeedVideoSizes = getHighSpeedVideoSizes(selectedFundingInstrument2, reviewPaymentUiModelMapper$toReviewPaymentUiModel$1);
                obj2 = obj;
                if (highSpeedVideoSizes != obj2) {
                    return obj2;
                }
                uiString5 = uiString;
                reviewPaymentArgs3 = reviewPaymentArgs2;
                str2 = str6;
                obj3 = highSpeedVideoSizes;
                z3 = z8;
                z4 = isAfter;
                uiString6 = uiString14;
                uiString7 = uiString3;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString112 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj3;
                java.lang.String termsAndConditionsUrl2 = reviewPaymentArgs3.getTermsAndConditionsUrl();
                if (!z4) {
                }
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType22 = revolvingCreditPaymentType;
                if (!z3) {
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(i2, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                if (!z3) {
                }
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel(uiString7, uiString5, uiString4, stringResWithParameter, uiString112, str2, termsAndConditionsUrl2, uiString6, stringResOnly2, null, null, revolvingCreditPaymentType22, 1536, null);
            }
        }
        reviewPaymentUiModelMapper$toReviewPaymentUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$toReviewPaymentUiModel$1(this, continuation);
        java.lang.Object obj32 = reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputSizes;
        if (i != 0) {
        }
        java.lang.String str42 = (java.lang.String) obj32;
        boolean z72 = reviewPaymentArgs2.getSelectedFundingInstrument() instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance;
        boolean isAfter2 = localDate2.isAfter(java.time.LocalDate.now());
        if (reviewPaymentArgs2.getBackupPaymentMethod() != null) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString142 = empty;
        selectedFundingInstrument = reviewPaymentArgs2.getSelectedFundingInstrument();
        if (!(selectedFundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank)) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument selectedFundingInstrument22 = reviewPaymentArgs2.getSelectedFundingInstrument();
        reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoFpsRanges = reviewPaymentArgs2;
        reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(localDate2);
        reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
        reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.Camera2StreamConfigurationMap = uiString;
        uiString4 = uiString2;
        reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getInputSizeshNQ4ISI = uiString4;
        java.lang.String str62 = str;
        reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoSizesFor = str62;
        reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputFormats = uiString142;
        reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputMinFrameDuration = uiString3;
        boolean z82 = z2;
        reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getInputFormats = z82;
        reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getHighSpeedVideoFpsRangesFor = z72 ? 1 : 0;
        reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputSizeshNQ4ISI = isAfter2;
        reviewPaymentUiModelMapper$toReviewPaymentUiModel$1.getOutputSizes = 2;
        highSpeedVideoSizes = getHighSpeedVideoSizes(selectedFundingInstrument22, reviewPaymentUiModelMapper$toReviewPaymentUiModel$1);
        obj2 = obj;
        if (highSpeedVideoSizes != obj2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$getPaymentMethodDetails$1 reviewPaymentUiModelMapper$getPaymentMethodDetails$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        int i2;
        int i3;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        java.lang.Integer stringId;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$getPaymentMethodDetails$1) {
            reviewPaymentUiModelMapper$getPaymentMethodDetails$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$getPaymentMethodDetails$1) continuation;
            if ((reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getInputFormats -= 2147483648;
                java.lang.Object obj = reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank fundingInstrumentBank = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) fundingInstrument;
                        java.lang.String lastNChars = fundingInstrumentBank.getLastNChars();
                        if (lastNChars != null) {
                            int i4 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_last_four_account;
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType type = fundingInstrumentBank.getType();
                            if (type == null || (stringId = type.getStringId()) == null || (uiString2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(stringId.intValue())) == null) {
                                uiString2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                            }
                            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i4, new java.lang.Object[]{uiString2, lastNChars}, null, false, 12, null);
                        }
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                    }
                    if (fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount balance = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) fundingInstrument).getBalance();
                        if (balance != null) {
                            int i5 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_balance_available;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(balance.getCurrencyCode(), balance.getValue());
                            reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrument);
                            reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balance);
                            reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getInputSizeshNQ4ISI = objArr3;
                            reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getOutputMinFrameDuration = objArr3;
                            reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            reviewPaymentUiModelMapper$getPaymentMethodDetails$1.Camera2StreamConfigurationMap = 0;
                            reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getHighSpeedVideoSizes = i5;
                            reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getInputFormats = 1;
                            obj = getHighSpeedVideoFpsRanges(currencyAmount, reviewPaymentUiModelMapper$getPaymentMethodDetails$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = 0;
                            i3 = i5;
                            objArr = objArr3;
                            objArr2 = objArr;
                        } else {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                        }
                    } else {
                        if (!(fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        int i6 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_last_four_account;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard fundingInstrumentCard = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard) fundingInstrument;
                        java.lang.Integer stringId2 = fundingInstrumentCard.getProductClass().getStringId();
                        if (stringId2 == null || (uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(stringId2.intValue())) == null) {
                            uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                        }
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i6, new java.lang.Object[]{uiString, fundingInstrumentCard.getLastNChars()}, null, false, 12, null);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getHighSpeedVideoSizes;
                    i2 = reviewPaymentUiModelMapper$getPaymentMethodDetails$1.Camera2StreamConfigurationMap;
                    int i8 = reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getHighResolutionOutputSizeshNQ4ISI;
                    objArr = (java.lang.Object[]) reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getOutputMinFrameDuration;
                    java.lang.Object[] objArr4 = (java.lang.Object[]) reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i3 = i7;
                    objArr2 = objArr4;
                }
                objArr[i2] = obj;
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i3, objArr2, null, false, 12, null);
            }
        }
        reviewPaymentUiModelMapper$getPaymentMethodDetails$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$getPaymentMethodDetails$1(this, continuation);
        java.lang.Object obj2 = reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = reviewPaymentUiModelMapper$getPaymentMethodDetails$1.getInputFormats;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i3, objArr2, null, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$formatCurrency$1 reviewPaymentUiModelMapper$formatCurrency$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$formatCurrency$1) {
            reviewPaymentUiModelMapper$formatCurrency$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$formatCurrency$1) continuation;
            if ((reviewPaymentUiModelMapper$formatCurrency$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                reviewPaymentUiModelMapper$formatCurrency$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$formatCurrency$1 reviewPaymentUiModelMapper$formatCurrency$12 = reviewPaymentUiModelMapper$formatCurrency$1;
                java.lang.Object obj = reviewPaymentUiModelMapper$formatCurrency$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = reviewPaymentUiModelMapper$formatCurrency$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.Camera2StreamConfigurationMap;
                    reviewPaymentUiModelMapper$formatCurrency$12.Camera2StreamConfigurationMap = currencyAmount;
                    reviewPaymentUiModelMapper$formatCurrency$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, currencyAmount, null, 0, reviewPaymentUiModelMapper$formatCurrency$12, 6, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    currencyAmount = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) reviewPaymentUiModelMapper$formatCurrency$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str = (java.lang.String) obj;
                return str != null ? currencyAmount.getValue() : str;
            }
        }
        reviewPaymentUiModelMapper$formatCurrency$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$formatCurrency$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$formatCurrency$1 reviewPaymentUiModelMapper$formatCurrency$122 = reviewPaymentUiModelMapper$formatCurrency$1;
        java.lang.Object obj2 = reviewPaymentUiModelMapper$formatCurrency$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = reviewPaymentUiModelMapper$formatCurrency$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        java.lang.String str2 = (java.lang.String) obj2;
        if (str2 != null) {
        }
    }

    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getHighSpeedVideoFpsRanges(java.time.LocalDate p0, boolean p1, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat p2, java.util.Locale p3) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString uiString;
        if (p1) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_review_payment_today, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        java.lang.String format = this.getHighResolutionOutputSizeshNQ4ISI.format(p0, p2, p3);
        return (format == null || (uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(format)) == null) ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_review_payment_today, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : uiString;
    }
}
