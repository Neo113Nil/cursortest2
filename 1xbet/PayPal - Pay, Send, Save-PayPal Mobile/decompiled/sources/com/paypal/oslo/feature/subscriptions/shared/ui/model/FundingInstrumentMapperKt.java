package com.paypal.oslo.feature.subscriptions.shared.ui.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u000b\u0010\f\u001a(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r*\b\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;", "balanceFormatter", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "balancePreference", "balanceFundingInstrument", "preferredFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentMappingResult;", "buildFundingInstrumentUiModels", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toUiModels", "(Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FundingInstrumentMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object toUiModel(com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel> continuation) {
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$toUiModel$1 fundingInstrumentMapperKt$toUiModel$1;
        int i;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Credit credit;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel fundingInstrumentTypeUiModel;
        java.lang.String id;
        java.lang.String lastDigits;
        java.lang.String thumbnailImageUrl;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$toUiModel$1) {
            fundingInstrumentMapperKt$toUiModel$1 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$toUiModel$1) continuation;
            if ((fundingInstrumentMapperKt$toUiModel$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                fundingInstrumentMapperKt$toUiModel$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = fundingInstrumentMapperKt$toUiModel$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fundingInstrumentMapperKt$toUiModel$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    switch (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt.WhenMappings.$EnumSwitchMapping$0[fundingInstrument.getType().ordinal()]) {
                        case 1:
                            credit = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Credit.INSTANCE;
                            break;
                        case 2:
                            credit = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Debit.INSTANCE;
                            break;
                        case 3:
                            credit = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Bank.Checking.INSTANCE;
                            break;
                        case 4:
                            credit = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Bank.Savings.INSTANCE;
                            break;
                        case 5:
                            credit = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPalBalance.INSTANCE;
                            break;
                        case 6:
                            credit = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Credit.INSTANCE;
                            break;
                        case 7:
                            credit = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit.INSTANCE;
                            break;
                        case 8:
                            credit = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Prepaid.INSTANCE;
                            break;
                        case 9:
                            credit = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Unknown.INSTANCE;
                            break;
                        default:
                            throw new kotlin.NoWhenBranchMatchedException();
                    }
                    fundingInstrumentTypeUiModel = credit;
                    if (fundingInstrumentTypeUiModel instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Unknown) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Funding instrument has an unrecognized type. Mapping to Unknown UI model.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("funding_instrument_id", fundingInstrument.getId()), kotlin.TuplesKt.to("name", fundingInstrument.getName())), null, 4, null);
                    }
                    id = fundingInstrument.getId();
                    java.lang.String name2 = fundingInstrument.getName();
                    lastDigits = fundingInstrument.getLastDigits();
                    thumbnailImageUrl = fundingInstrument.getThumbnailImageUrl();
                    com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance balance = fundingInstrument.getBalance();
                    fundingInstrumentMapperKt$toUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrument);
                    fundingInstrumentMapperKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatHelper);
                    fundingInstrumentMapperKt$toUiModel$1.Camera2StreamConfigurationMap = fundingInstrumentTypeUiModel;
                    fundingInstrumentMapperKt$toUiModel$1.getHighSpeedVideoSizes = id;
                    fundingInstrumentMapperKt$toUiModel$1.getHighSpeedVideoFpsRanges = name2;
                    fundingInstrumentMapperKt$toUiModel$1.getHighSpeedVideoSizesFor = lastDigits;
                    fundingInstrumentMapperKt$toUiModel$1.getInputSizeshNQ4ISI = thumbnailImageUrl;
                    fundingInstrumentMapperKt$toUiModel$1.getOutputMinFrameDuration = 1;
                    java.lang.Object formatBalance = formatHelper.formatBalance(balance, fundingInstrumentMapperKt$toUiModel$1);
                    if (formatBalance == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = name2;
                    obj = formatBalance;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str2 = (java.lang.String) fundingInstrumentMapperKt$toUiModel$1.getInputSizeshNQ4ISI;
                    lastDigits = (java.lang.String) fundingInstrumentMapperKt$toUiModel$1.getHighSpeedVideoSizesFor;
                    str = (java.lang.String) fundingInstrumentMapperKt$toUiModel$1.getHighSpeedVideoFpsRanges;
                    id = (java.lang.String) fundingInstrumentMapperKt$toUiModel$1.getHighSpeedVideoSizes;
                    fundingInstrumentTypeUiModel = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel) fundingInstrumentMapperKt$toUiModel$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    thumbnailImageUrl = str2;
                }
                return new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel(id, fundingInstrumentTypeUiModel, str, lastDigits, (java.lang.String) obj, thumbnailImageUrl);
            }
        }
        fundingInstrumentMapperKt$toUiModel$1 = new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$toUiModel$1(continuation);
        java.lang.Object obj2 = fundingInstrumentMapperKt$toUiModel$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fundingInstrumentMapperKt$toUiModel$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        return new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel(id, fundingInstrumentTypeUiModel, str, lastDigits, (java.lang.String) obj2, thumbnailImageUrl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence$NoBackup] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence$NoPaymentMethod] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object buildFundingInstrumentUiModels(com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult> continuation) {
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$buildFundingInstrumentUiModels$1 fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.util.List createListBuilder;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference2;
        int i2;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument3;
        java.util.List list;
        java.lang.Object uiModel;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.util.List list2;
        java.util.List list3;
        int i3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        java.util.List list4;
        java.util.List list5;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument4 = fundingInstrument2;
        com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper2 = formatHelper;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$buildFundingInstrumentUiModels$1) {
            fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$buildFundingInstrumentUiModels$1) continuation;
            if ((fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputSizes -= 2147483648;
                java.lang.Object obj = fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                    int i4 = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt.WhenMappings.$EnumSwitchMapping$1[balancePreference.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2 && i4 != 3 && i4 != 4) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        if (fundingInstrument4 == null) {
                            objectRef.element = com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoPaymentMethod.INSTANCE;
                            return new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult(kotlin.collections.CollectionsKt.build(createListBuilder), (com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence) objectRef.element);
                        }
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balancePreference);
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrument);
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrument2);
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatHelper);
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputMinFrameDuration = objectRef;
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getInputSizeshNQ4ISI = createListBuilder;
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createListBuilder);
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getInputFormats = createListBuilder;
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputSizes = 3;
                        java.lang.Object uiModel2 = toUiModel(fundingInstrument4, formatHelper2, fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1);
                        if (uiModel2 != coroutine_suspended) {
                            objectRef3 = objectRef;
                            list4 = createListBuilder;
                            obj = uiModel2;
                            list5 = list4;
                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(list5.add(new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition((com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority.PRIMARY)));
                        }
                    } else if (fundingInstrument != null) {
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balancePreference);
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrument);
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.Camera2StreamConfigurationMap = fundingInstrument4;
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoSizesFor = formatHelper2;
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputMinFrameDuration = objectRef;
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getInputSizeshNQ4ISI = createListBuilder;
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputFormats = createListBuilder;
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrument);
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputMinFrameDurationlomOqCM = createListBuilder;
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoSizes = 0;
                        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputSizes = 1;
                        uiModel = toUiModel(fundingInstrument, formatHelper2, fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1);
                        if (uiModel != coroutine_suspended) {
                            balancePreference2 = balancePreference;
                            objectRef2 = objectRef;
                            list2 = createListBuilder;
                            list3 = list2;
                            fundingInstrument3 = fundingInstrument;
                            i3 = 0;
                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(createListBuilder.add(new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition((com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) uiModel, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority.PRIMARY)));
                            i2 = i3;
                            list = list2;
                            createListBuilder = list3;
                            objectRef = objectRef2;
                            if (fundingInstrument4 == null) {
                            }
                        }
                    } else {
                        balancePreference2 = balancePreference;
                        i2 = 0;
                        fundingInstrument3 = fundingInstrument;
                        list = createListBuilder;
                        if (fundingInstrument4 == null) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    int i5 = fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoSizes;
                    i3 = fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.util.List list6 = (java.util.List) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputMinFrameDurationlomOqCM;
                    java.util.List list7 = (java.util.List) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputFormats;
                    java.util.List list8 = (java.util.List) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getInputSizeshNQ4ISI;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputMinFrameDuration;
                    com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper3 = (com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoSizesFor;
                    com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument5 = (com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.Camera2StreamConfigurationMap;
                    fundingInstrument3 = (com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoFpsRangesFor;
                    balancePreference2 = (com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    createListBuilder = list6;
                    fundingInstrument4 = fundingInstrument5;
                    objectRef2 = objectRef4;
                    uiModel = obj;
                    list2 = list7;
                    formatHelper2 = formatHelper3;
                    list3 = list8;
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(createListBuilder.add(new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition((com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) uiModel, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority.PRIMARY)));
                    i2 = i3;
                    list = list2;
                    createListBuilder = list3;
                    objectRef = objectRef2;
                    if (fundingInstrument4 == null) {
                        objectRef.element = com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoBackup.INSTANCE;
                        return new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult(kotlin.collections.CollectionsKt.build(createListBuilder), (com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence) objectRef.element);
                    }
                    fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balancePreference2);
                    fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrument3);
                    fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrument4);
                    fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatHelper2);
                    fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputMinFrameDuration = objectRef;
                    fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getInputSizeshNQ4ISI = createListBuilder;
                    fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getInputFormats = list;
                    fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputMinFrameDurationlomOqCM = null;
                    fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                    fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputSizes = 2;
                    java.lang.Object uiModel3 = toUiModel(fundingInstrument4, formatHelper2, fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1);
                    if (uiModel3 != coroutine_suspended) {
                        objectRef3 = objectRef;
                        obj = uiModel3;
                        list4 = createListBuilder;
                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(list.add(new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition((com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority.BACKUP)));
                    }
                    return coroutine_suspended;
                }
                if (i == 2) {
                    int i6 = fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighResolutionOutputSizeshNQ4ISI;
                    list = (java.util.List) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getInputFormats;
                    list4 = (java.util.List) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getInputSizeshNQ4ISI;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(list.add(new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition((com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority.BACKUP)));
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getHighResolutionOutputSizeshNQ4ISI;
                    list5 = (java.util.List) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getInputFormats;
                    list4 = (java.util.List) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getInputSizeshNQ4ISI;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(list5.add(new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition((com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority.PRIMARY)));
                }
                createListBuilder = list4;
                objectRef = objectRef3;
                return new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult(kotlin.collections.CollectionsKt.build(createListBuilder), (com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence) objectRef.element);
            }
        }
        fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1 = new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$buildFundingInstrumentUiModels$1(continuation);
        java.lang.Object obj2 = fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fundingInstrumentMapperKt$buildFundingInstrumentUiModels$1.getOutputSizes;
        if (i != 0) {
        }
        createListBuilder = list4;
        objectRef = objectRef3;
        return new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult(kotlin.collections.CollectionsKt.build(createListBuilder), (com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence) objectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00c5 -> B:10:0x00ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object toUiModels(java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> list, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel>> continuation) {
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$toUiModels$1 fundingInstrumentMapperKt$toUiModels$1;
        int i;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.Iterator it;
        com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper2;
        java.util.ArrayList arrayList;
        int i2;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$toUiModels$1 fundingInstrumentMapperKt$toUiModels$12;
        int i3;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$toUiModels$1) {
            fundingInstrumentMapperKt$toUiModels$1 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$toUiModels$1) continuation;
            if ((fundingInstrumentMapperKt$toUiModels$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                fundingInstrumentMapperKt$toUiModels$1.getOutputStallDuration -= 2147483648;
                java.lang.Object obj3 = fundingInstrumentMapperKt$toUiModels$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fundingInstrumentMapperKt$toUiModels$1.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> list2 = list;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    obj = list2;
                    obj2 = obj;
                    it = list2.iterator();
                    formatHelper2 = formatHelper;
                    arrayList = arrayList2;
                    i2 = 0;
                    fundingInstrumentMapperKt$toUiModels$12 = fundingInstrumentMapperKt$toUiModels$1;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = fundingInstrumentMapperKt$toUiModels$1.getHighSpeedVideoSizes;
                    int i5 = fundingInstrumentMapperKt$toUiModels$1.Camera2StreamConfigurationMap;
                    int i6 = fundingInstrumentMapperKt$toUiModels$1.getHighSpeedVideoFpsRanges;
                    java.util.Collection collection = (java.util.Collection) fundingInstrumentMapperKt$toUiModels$1.getOutputSizeshNQ4ISI;
                    java.lang.Object obj4 = fundingInstrumentMapperKt$toUiModels$1.getInputSizeshNQ4ISI;
                    java.util.Iterator it2 = (java.util.Iterator) fundingInstrumentMapperKt$toUiModels$1.getInputFormats;
                    ?? r6 = (java.util.Collection) fundingInstrumentMapperKt$toUiModels$1.getOutputFormats;
                    java.lang.Object obj5 = (java.lang.Iterable) fundingInstrumentMapperKt$toUiModels$1.getOutputMinFrameDuration;
                    java.lang.Object obj6 = (java.lang.Iterable) fundingInstrumentMapperKt$toUiModels$1.getHighSpeedVideoSizesFor;
                    com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper3 = (com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper) fundingInstrumentMapperKt$toUiModels$1.getHighSpeedVideoFpsRangesFor;
                    java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> list3 = (java.util.List) fundingInstrumentMapperKt$toUiModels$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    i2 = i5;
                    list = list3;
                    java.lang.Object obj7 = obj6;
                    java.lang.Object obj8 = obj5;
                    java.util.Iterator it3 = it2;
                    com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$toUiModels$1 fundingInstrumentMapperKt$toUiModels$13 = fundingInstrumentMapperKt$toUiModels$1;
                    i3 = i6;
                    java.util.ArrayList arrayList3 = r6;
                    collection.add((com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj3);
                    fundingInstrumentMapperKt$toUiModels$12 = fundingInstrumentMapperKt$toUiModels$13;
                    arrayList = arrayList3;
                    it = it3;
                    obj = obj8;
                    formatHelper2 = formatHelper3;
                    obj2 = obj7;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = (com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument) next;
                        fundingInstrumentMapperKt$toUiModels$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                        fundingInstrumentMapperKt$toUiModels$12.getHighSpeedVideoFpsRangesFor = formatHelper2;
                        fundingInstrumentMapperKt$toUiModels$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                        fundingInstrumentMapperKt$toUiModels$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        fundingInstrumentMapperKt$toUiModels$12.getOutputFormats = arrayList;
                        fundingInstrumentMapperKt$toUiModels$12.getInputFormats = it;
                        fundingInstrumentMapperKt$toUiModels$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        fundingInstrumentMapperKt$toUiModels$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrument);
                        fundingInstrumentMapperKt$toUiModels$12.getOutputSizeshNQ4ISI = arrayList;
                        fundingInstrumentMapperKt$toUiModels$12.getHighSpeedVideoFpsRanges = i3;
                        fundingInstrumentMapperKt$toUiModels$12.Camera2StreamConfigurationMap = i2;
                        fundingInstrumentMapperKt$toUiModels$12.getHighSpeedVideoSizes = 0;
                        fundingInstrumentMapperKt$toUiModels$12.getOutputStallDuration = 1;
                        java.lang.Object uiModel = toUiModel(fundingInstrument, formatHelper2, fundingInstrumentMapperKt$toUiModels$12);
                        if (uiModel == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj7 = obj2;
                        obj8 = obj;
                        it3 = it;
                        java.util.ArrayList arrayList4 = arrayList;
                        fundingInstrumentMapperKt$toUiModels$13 = fundingInstrumentMapperKt$toUiModels$12;
                        collection = arrayList4;
                        formatHelper3 = formatHelper2;
                        obj3 = uiModel;
                        arrayList3 = arrayList4;
                        collection.add((com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj3);
                        fundingInstrumentMapperKt$toUiModels$12 = fundingInstrumentMapperKt$toUiModels$13;
                        arrayList = arrayList3;
                        it = it3;
                        obj = obj8;
                        formatHelper2 = formatHelper3;
                        obj2 = obj7;
                        if (it.hasNext()) {
                            return arrayList;
                        }
                    }
                }
            }
        }
        fundingInstrumentMapperKt$toUiModels$1 = new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$toUiModels$1(continuation);
        java.lang.Object obj32 = fundingInstrumentMapperKt$toUiModels$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fundingInstrumentMapperKt$toUiModels$1.getOutputStallDuration;
        if (i != 0) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.CREDIT_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.DEBIT_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.BANK_CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.BANK_SAVINGS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.PAYPAL_BALANCE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.PAYPAL_CREDIT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.PAYPAL_DEBIT_CARD.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.PREPAID_CARD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.UNKNOWN.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.values().length];
            try {
                iArr2[com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.DISABLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNAVAILABLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
