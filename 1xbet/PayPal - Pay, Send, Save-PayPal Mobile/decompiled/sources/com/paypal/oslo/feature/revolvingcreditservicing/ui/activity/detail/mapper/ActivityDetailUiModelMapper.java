package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/mapper/ActivityDetailUiModelMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatter", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatter", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;", "phoneNumberFormatterFacade", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel;", "mapToActivityDetailUiModel$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "Ljava/util/Locale;", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel$SummarySectionUiModel;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;Ljava/util/Locale;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel$StatusUiModel;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel$StatusUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityDetailUiModelMapper {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ActivityDetailUiModelMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade phoneNumberFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberFormatterFacade, "");
        this.getHighSpeedVideoFpsRangesFor = dateFormatterFacade;
        this.getHighSpeedVideoFpsRanges = currencyFormatterFacade;
        this.getHighSpeedVideoSizes = phoneNumberFormatterFacade;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mapToActivityDetailUiModel$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper$mapToActivityDetailUiModel$1 activityDetailUiModelMapper$mapToActivityDetailUiModel$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument transactionFundingInstrument;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.SourceSectionUiModel sourceSectionUiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact servicingContact;
        boolean isCancellable;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.HelpSectionUiModel helpSectionUiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString plainString;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper$mapToActivityDetailUiModel$1) {
            activityDetailUiModelMapper$mapToActivityDetailUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper$mapToActivityDetailUiModel$1) continuation;
            if ((activityDetailUiModelMapper$mapToActivityDetailUiModel$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                activityDetailUiModelMapper$mapToActivityDetailUiModel$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = activityDetailUiModelMapper$mapToActivityDetailUiModel$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityDetailUiModelMapper$mapToActivityDetailUiModel$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    transaction = activityDetailDestinationArgs.getTransaction();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString transactionTitle = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionTypeToTitleUiStringKt.getTransactionTitle(transaction.getTransactionType());
                    java.util.Locale locale = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(activityDetailDestinationArgs.getCreditProductIdentifier());
                    activityDetailUiModelMapper$mapToActivityDetailUiModel$1.Camera2StreamConfigurationMap = activityDetailDestinationArgs;
                    activityDetailUiModelMapper$mapToActivityDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI = transaction;
                    activityDetailUiModelMapper$mapToActivityDetailUiModel$1.getHighSpeedVideoFpsRangesFor = transactionTitle;
                    activityDetailUiModelMapper$mapToActivityDetailUiModel$1.getHighSpeedVideoFpsRanges = 1;
                    java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(transaction, locale, activityDetailUiModelMapper$mapToActivityDetailUiModel$1);
                    if (Camera2StreamConfigurationMap == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    uiString = transactionTitle;
                    obj = Camera2StreamConfigurationMap;
                    activityDetailDestinationArgs2 = activityDetailDestinationArgs;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) activityDetailUiModelMapper$mapToActivityDetailUiModel$1.getHighSpeedVideoFpsRangesFor;
                    transaction = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction) activityDetailUiModelMapper$mapToActivityDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    activityDetailDestinationArgs2 = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs) activityDetailUiModelMapper$mapToActivityDetailUiModel$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    uiString = uiString3;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.SummarySectionUiModel summarySectionUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.SummarySectionUiModel) obj;
                java.lang.String transactionCashbackPercentage = transaction.getTransactionCashbackPercentage();
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter = transactionCashbackPercentage != null ? null : new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_activity_detail_cashback_earned_format, new java.lang.Object[]{transactionCashbackPercentage}, null, false, 12, null);
                java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> transactionFundingInstruments = transaction.getTransactionFundingInstruments();
                transactionFundingInstrument = transactionFundingInstruments == null ? (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) transactionFundingInstruments) : null;
                if (transactionFundingInstrument != null) {
                    sourceSectionUiModel = null;
                } else {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_from, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    java.lang.String name2 = transactionFundingInstrument.getName();
                    if (name2 == null) {
                        name2 = "";
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(name2);
                    int i2 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_card_digits_format;
                    java.lang.String lastCardDigits = transactionFundingInstrument.getLastCardDigits();
                    sourceSectionUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.SourceSectionUiModel(stringResOnly2, plainString2, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i2, new java.lang.Object[]{lastCardDigits != null ? lastCardDigits : ""}, null, false, 12, null), transactionFundingInstrument.getLogoUrl());
                }
                java.lang.String referenceId = transaction.getReferenceId();
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.IdentifierSectionUiModel identifierSectionUiModel = referenceId != null ? null : new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.IdentifierSectionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_activity_detail_transaction_id, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(referenceId));
                servicingContact = activityDetailDestinationArgs2.getServicingContact();
                isCancellable = transaction.getIsCancellable();
                stringResOnly = transaction.getTransactionType() != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PURCHASE ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_activity_detail_special_financing_help_text, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null;
                if (isCancellable && servicingContact == null && stringResOnly == null) {
                    helpSectionUiModel = null;
                } else {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_activity_detail_help_section_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    boolean z = servicingContact == null;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly4 = servicingContact == null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_contact_us_call_us_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly5 = servicingContact == null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_activity_detail_support_operation_hours, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null;
                    if (servicingContact != null && (phoneNumber = servicingContact.getPhoneNumber()) != null) {
                        java.lang.String format = this.getHighSpeedVideoSizes.format(phoneNumber, false, com.paypal.oslo.core.i18n.domain.model.Style.NATIONAL);
                        plainString = format != null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(format) : null;
                        if (plainString != null) {
                            uiString2 = plainString;
                            helpSectionUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.HelpSectionUiModel(stringResOnly3, isCancellable, z, stringResOnly4, stringResOnly5, uiString2, stringResOnly);
                        }
                    }
                    uiString2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                    helpSectionUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.HelpSectionUiModel(stringResOnly3, isCancellable, z, stringResOnly4, stringResOnly5, uiString2, stringResOnly);
                }
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel(uiString, summarySectionUiModel, stringResWithParameter, sourceSectionUiModel, identifierSectionUiModel, helpSectionUiModel, transaction.getIsCancellable());
            }
        }
        activityDetailUiModelMapper$mapToActivityDetailUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper$mapToActivityDetailUiModel$1(this, continuation);
        java.lang.Object obj2 = activityDetailUiModelMapper$mapToActivityDetailUiModel$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityDetailUiModelMapper$mapToActivityDetailUiModel$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.SummarySectionUiModel summarySectionUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.SummarySectionUiModel) obj2;
        java.lang.String transactionCashbackPercentage2 = transaction.getTransactionCashbackPercentage();
        if (transactionCashbackPercentage2 != null) {
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> transactionFundingInstruments2 = transaction.getTransactionFundingInstruments();
        if (transactionFundingInstruments2 == null) {
        }
        if (transactionFundingInstrument != null) {
        }
        java.lang.String referenceId2 = transaction.getReferenceId();
        if (referenceId2 != null) {
        }
        servicingContact = activityDetailDestinationArgs2.getServicingContact();
        isCancellable = transaction.getIsCancellable();
        if (transaction.getTransactionType() != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PURCHASE) {
        }
        if (isCancellable) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly32 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_activity_detail_help_section_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        if (servicingContact == null) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly42 = servicingContact == null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_contact_us_call_us_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly52 = servicingContact == null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_activity_detail_support_operation_hours, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null;
        if (servicingContact != null) {
            java.lang.String format2 = this.getHighSpeedVideoSizes.format(phoneNumber, false, com.paypal.oslo.core.i18n.domain.model.Style.NATIONAL);
            if (format2 != null) {
            }
            if (plainString != null) {
            }
        }
        uiString2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
        helpSectionUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.HelpSectionUiModel(stringResOnly32, isCancellable, z, stringResOnly42, stringResOnly52, uiString2, stringResOnly);
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel(uiString, summarySectionUiModel2, stringResWithParameter, sourceSectionUiModel, identifierSectionUiModel, helpSectionUiModel, transaction.getIsCancellable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction, java.util.Locale locale, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.SummarySectionUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper$buildSummarySection$1 activityDetailUiModelMapper$buildSummarySection$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.StatusUiModel statusUiModel;
        java.lang.String str2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper$buildSummarySection$1) {
            activityDetailUiModelMapper$buildSummarySection$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper$buildSummarySection$1) continuation;
            if ((activityDetailUiModelMapper$buildSummarySection$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                activityDetailUiModelMapper$buildSummarySection$1.getOutputFormats -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper$buildSummarySection$1 activityDetailUiModelMapper$buildSummarySection$12 = activityDetailUiModelMapper$buildSummarySection$1;
                java.lang.Object obj = activityDetailUiModelMapper$buildSummarySection$12.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityDetailUiModelMapper$buildSummarySection$12.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString resolveTitle = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionTypeToTitleUiStringKt.resolveTitle(transaction);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage transactionImage = transaction.getTransactionImage();
                    java.lang.String url = transactionImage != null ? transactionImage.getUrl() : null;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.StatusUiModel highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(transaction);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount camera2StreamConfigurationMap = transaction.getCamera2StreamConfigurationMap();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol symbol = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
                    activityDetailUiModelMapper$buildSummarySection$12.getHighSpeedVideoSizes = transaction;
                    activityDetailUiModelMapper$buildSummarySection$12.Camera2StreamConfigurationMap = locale;
                    activityDetailUiModelMapper$buildSummarySection$12.getHighSpeedVideoFpsRanges = resolveTitle;
                    activityDetailUiModelMapper$buildSummarySection$12.getHighResolutionOutputSizeshNQ4ISI = url;
                    activityDetailUiModelMapper$buildSummarySection$12.getHighSpeedVideoFpsRangesFor = highResolutionOutputSizeshNQ4ISI;
                    activityDetailUiModelMapper$buildSummarySection$12.getOutputFormats = 1;
                    java.lang.Object format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, camera2StreamConfigurationMap, symbol, 0, activityDetailUiModelMapper$buildSummarySection$12, 4, null);
                    if (format$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    uiString = resolveTitle;
                    obj = format$default;
                    str = url;
                    statusUiModel = highResolutionOutputSizeshNQ4ISI;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.StatusUiModel statusUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.StatusUiModel) activityDetailUiModelMapper$buildSummarySection$12.getHighSpeedVideoFpsRangesFor;
                    java.lang.String str3 = (java.lang.String) activityDetailUiModelMapper$buildSummarySection$12.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) activityDetailUiModelMapper$buildSummarySection$12.getHighSpeedVideoFpsRanges;
                    java.util.Locale locale2 = (java.util.Locale) activityDetailUiModelMapper$buildSummarySection$12.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction) activityDetailUiModelMapper$buildSummarySection$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    statusUiModel = statusUiModel2;
                    str = str3;
                    uiString = uiString2;
                    locale = locale2;
                    transaction = transaction2;
                }
                str2 = (java.lang.String) obj;
                if (str2 == null) {
                    str2 = "";
                }
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.SummarySectionUiModel(uiString, str, statusUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str2), getHighSpeedVideoFpsRangesFor(transaction, locale));
            }
        }
        activityDetailUiModelMapper$buildSummarySection$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper$buildSummarySection$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper$buildSummarySection$1 activityDetailUiModelMapper$buildSummarySection$122 = activityDetailUiModelMapper$buildSummarySection$1;
        java.lang.Object obj2 = activityDetailUiModelMapper$buildSummarySection$122.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityDetailUiModelMapper$buildSummarySection$122.getOutputFormats;
        if (i != 0) {
        }
        str2 = (java.lang.String) obj2;
        if (str2 == null) {
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.SummarySectionUiModel(uiString, str, statusUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str2), getHighSpeedVideoFpsRangesFor(transaction, locale));
    }

    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction, java.util.Locale locale) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateAndTimeMonthDayShort dateAndTimeMonthDayShort;
        if (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper.WhenMappings.$EnumSwitchMapping$0[transaction.getTransactionType().ordinal()] == 1) {
            dateAndTimeMonthDayShort = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE;
        } else {
            dateAndTimeMonthDayShort = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateAndTimeMonthDayShort.INSTANCE;
        }
        java.lang.String format = this.getHighSpeedVideoFpsRangesFor.format(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionKt.getDisplayTimestamp(transaction), dateAndTimeMonthDayShort, locale);
        if (format == null) {
            format = "";
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(format);
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.StatusUiModel getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction) {
        if (transaction.getTransactionType() != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.SCHEDULED_PAYMENT || !transaction.getIsCancellable()) {
            return null;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.StatusUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_activity_type_scheduled, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.paypal.pds.components.BadgeStyle.Info.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.SCHEDULED_PAYMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
