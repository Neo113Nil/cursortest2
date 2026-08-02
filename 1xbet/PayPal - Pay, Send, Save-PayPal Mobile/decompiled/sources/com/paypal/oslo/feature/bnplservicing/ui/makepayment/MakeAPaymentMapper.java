package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\f*\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u000eJ\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0017\u001a\u0004\u0018\u00010\u001c*\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0082@¢\u0006\u0004\b\u0017\u0010\u001dJ\u001c\u0010\u0014\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b\u0014\u0010\u001fJ\u0013\u0010\u0014\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\u0014\u0010\"R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentMapper;", "", "Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;", "formatter", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/content/MakeAPaymentContentProvider;", "contentProvider", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/config/MakeAPaymentConfig;", "config", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/content/MakeAPaymentContentProvider;Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/config/MakeAPaymentConfig;)V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentOverview;", "overview", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;", "toMakeAPaymentUiModel", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentOverview;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentSuccess;", "success", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/uimodels/PaymentSuccessUiModel;", "toPaymentSuccess", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentSuccess;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOption;", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PaymentOption;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/Autopay;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "p0", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/Autopay;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/SupportedFundingInstrumentTypeForAddition;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$AddFundingInstrumentLink;", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/SupportedFundingInstrumentTypeForAddition;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel$AddFundingInstrumentLink;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/content/MakeAPaymentContentProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/config/MakeAPaymentConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MakeAPaymentMapper {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.MakeAPaymentConfig getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public MakeAPaymentMapper(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider makeAPaymentContentProvider, com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.MakeAPaymentConfig makeAPaymentConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentContentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentConfig, "");
        this.Camera2StreamConfigurationMap = bnplServFormatter;
        this.getHighSpeedVideoFpsRangesFor = makeAPaymentContentProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = makeAPaymentConfig;
    }

    public final java.lang.Object toMakeAPaymentUiModel(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview makeAPaymentOverview, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel> continuation) {
        if (makeAPaymentOverview == null) {
            return null;
        }
        return getHighSpeedVideoFpsRanges(makeAPaymentOverview, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toPaymentSuccess(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentSuccess makeAPaymentSuccess, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toPaymentSuccess$1 makeAPaymentMapper$toPaymentSuccess$1;
        int i;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider makeAPaymentContentProvider;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toPaymentSuccess$1) {
            makeAPaymentMapper$toPaymentSuccess$1 = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toPaymentSuccess$1) continuation;
            if ((makeAPaymentMapper$toPaymentSuccess$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                makeAPaymentMapper$toPaymentSuccess$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toPaymentSuccess$1 makeAPaymentMapper$toPaymentSuccess$12 = makeAPaymentMapper$toPaymentSuccess$1;
                java.lang.Object obj = makeAPaymentMapper$toPaymentSuccess$12.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = makeAPaymentMapper$toPaymentSuccess$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount = makeAPaymentSuccess.getAmount();
                    if (amount == null) {
                        refText = null;
                        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel(refText);
                    }
                    com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider makeAPaymentContentProvider2 = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter = this.Camera2StreamConfigurationMap;
                    makeAPaymentMapper$toPaymentSuccess$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makeAPaymentSuccess);
                    makeAPaymentMapper$toPaymentSuccess$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(amount);
                    makeAPaymentMapper$toPaymentSuccess$12.Camera2StreamConfigurationMap = makeAPaymentContentProvider2;
                    makeAPaymentMapper$toPaymentSuccess$12.getHighSpeedVideoSizes = 0;
                    makeAPaymentMapper$toPaymentSuccess$12.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter, amount, null, 0, makeAPaymentMapper$toPaymentSuccess$12, 6, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    makeAPaymentContentProvider = makeAPaymentContentProvider2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = makeAPaymentMapper$toPaymentSuccess$12.getHighSpeedVideoSizes;
                    makeAPaymentContentProvider = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider) makeAPaymentMapper$toPaymentSuccess$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                refText = makeAPaymentContentProvider.paymentSuccessText((java.lang.String) obj);
                return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel(refText);
            }
        }
        makeAPaymentMapper$toPaymentSuccess$1 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toPaymentSuccess$1(this, continuation);
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toPaymentSuccess$1 makeAPaymentMapper$toPaymentSuccess$122 = makeAPaymentMapper$toPaymentSuccess$1;
        java.lang.Object obj2 = makeAPaymentMapper$toPaymentSuccess$122.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = makeAPaymentMapper$toPaymentSuccess$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        refText = makeAPaymentContentProvider.paymentSuccessText((java.lang.String) obj2);
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel(refText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e2, code lost:
    
        if (r1 != r10) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019f  */
    /* JADX WARN: Type inference failed for: r3v73, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v27, types: [int] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x049f -> B:14:0x04b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview makeAPaymentOverview, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toUiModel$1 makeAPaymentMapper$toUiModel$1;
        int i;
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview makeAPaymentOverview2;
        java.lang.Object obj;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument;
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview makeAPaymentOverview3;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel;
        com.paypal.oslo.core.commonui.utils.RefText paymentAmountTitle;
        com.paypal.oslo.core.commonui.utils.RefText autopayOnTitle;
        com.paypal.oslo.core.commonui.utils.RefText otherAmountLabel;
        java.lang.String str;
        boolean z;
        java.lang.Object formatCurrency$default;
        java.lang.Object obj2;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        com.paypal.oslo.core.commonui.utils.RefText refText2;
        com.paypal.oslo.core.commonui.utils.RefText refText3;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel2;
        com.paypal.oslo.core.commonui.utils.RefText refText4;
        com.paypal.oslo.core.commonui.utils.RefText refText5;
        com.paypal.oslo.core.commonui.utils.RefText refText6;
        com.paypal.oslo.core.commonui.utils.RefText refText7;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider.MakeAPaymentValidationContentProvider makeAPaymentValidationContentProvider;
        com.paypal.oslo.core.commonui.utils.RefText refText8;
        com.paypal.oslo.core.commonui.utils.RefText refText9;
        com.paypal.oslo.core.commonui.utils.RefText refText10;
        com.paypal.oslo.core.commonui.utils.RefText refText11;
        com.paypal.oslo.core.commonui.utils.RefText refText12;
        com.paypal.oslo.core.commonui.utils.RefText refText13;
        com.paypal.oslo.core.commonui.utils.RefText refText14;
        java.lang.Object formatCurrency$default2;
        com.paypal.oslo.core.commonui.utils.RefText refText15;
        com.paypal.oslo.core.commonui.utils.RefText refText16;
        com.paypal.oslo.core.commonui.utils.RefText refText17;
        com.paypal.oslo.core.commonui.utils.RefText refText18;
        com.paypal.oslo.core.commonui.utils.RefText refText19;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider.MakeAPaymentValidationContentProvider makeAPaymentValidationContentProvider2;
        com.paypal.oslo.core.commonui.utils.RefText refText20;
        com.paypal.oslo.core.commonui.utils.RefText refText21;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel3;
        java.lang.String creditAccountId;
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay autopay;
        boolean z2;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption> paymentOptions;
        java.util.Iterator it;
        java.lang.Object obj3;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier;
        java.lang.String str2;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money;
        java.lang.Object obj4;
        java.util.Collection collection;
        java.lang.String str3;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel4;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent makeAPaymentContent;
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview makeAPaymentOverview4;
        int i2;
        ?? r9;
        ?? r7;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper makeAPaymentMapper = this;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toUiModel$1) {
            makeAPaymentMapper$toUiModel$1 = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toUiModel$1) continuation;
            if ((makeAPaymentMapper$toUiModel$1.coroutineBoundary & Integer.MIN_VALUE) != 0) {
                makeAPaymentMapper$toUiModel$1.coroutineBoundary -= 2147483648;
                java.lang.Object obj5 = makeAPaymentMapper$toUiModel$1.ArtificialStackFrames;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = makeAPaymentMapper$toUiModel$1.coroutineBoundary;
                java.lang.String str4 = "";
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj5);
                    com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay autopay2 = makeAPaymentOverview.getAutopay();
                    if (autopay2 != null) {
                        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument2 = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) makeAPaymentOverview.getFundingInstruments());
                        makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizes = makeAPaymentOverview;
                        makeAPaymentMapper$toUiModel$1.coroutineBoundary = 1;
                        obj5 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor(autopay2, fundingInstrument2, makeAPaymentMapper$toUiModel$1);
                        if (obj5 != coroutine_suspended) {
                            makeAPaymentOverview2 = makeAPaymentOverview;
                        }
                        obj = coroutine_suspended;
                        return obj;
                    }
                    makeAPaymentOverview2 = makeAPaymentOverview;
                    fundingInstrument = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) makeAPaymentOverview2.getFundingInstruments());
                    if (fundingInstrument != null) {
                        makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizes = makeAPaymentOverview2;
                        makeAPaymentMapper$toUiModel$1.coroutineBoundary = 2;
                        obj5 = makeAPaymentMapper.getHighSpeedVideoFpsRanges(fundingInstrument, false, makeAPaymentMapper$toUiModel$1);
                    } else {
                        makeAPaymentOverview3 = makeAPaymentOverview2;
                        fundingInstrumentUiModel = null;
                        paymentAmountTitle = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPaymentAmountTitle();
                        autopayOnTitle = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getAutopayOnTitle();
                        otherAmountLabel = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getOtherAmountLabel();
                        com.paypal.oslo.core.commonui.utils.RefText enterAmountHint = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getEnterAmountHint();
                        com.paypal.oslo.core.commonui.utils.RefText payWithTitle = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPayWithTitle();
                        com.paypal.oslo.core.commonui.utils.RefText changePaymentMethodLabel = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getChangePaymentMethodLabel();
                        com.paypal.oslo.core.commonui.utils.RefText paymentMethodEmptyMessage = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPaymentMethodEmptyMessage();
                        com.paypal.oslo.core.commonui.utils.RefText paymentMethodUnavailableMessage = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPaymentMethodUnavailableMessage();
                        com.paypal.oslo.core.commonui.utils.RefText confirmAndPayButton = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getConfirmAndPayButton();
                        com.paypal.oslo.core.commonui.utils.RefText chooseWayToPayButton = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getChooseWayToPayButton();
                        str = "";
                        com.paypal.oslo.core.commonui.utils.RefText missingAmount = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getMissingAmount();
                        com.paypal.oslo.core.commonui.utils.RefText missingFundingInstrument = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getMissingFundingInstrument();
                        com.paypal.oslo.core.commonui.utils.RefText insufficientBalance = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getInsufficientBalance();
                        com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider.MakeAPaymentValidationContentProvider validationContent = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent();
                        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter = makeAPaymentMapper.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money minRepaymentAmount = makeAPaymentOverview3.getMinRepaymentAmount();
                        makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizes = makeAPaymentOverview3;
                        makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizesFor = fundingInstrumentUiModel;
                        makeAPaymentMapper$toUiModel$1.getOutputSizes = paymentAmountTitle;
                        makeAPaymentMapper$toUiModel$1.getOutputStallDurationlomOqCM = autopayOnTitle;
                        makeAPaymentMapper$toUiModel$1.getValidOutputFormatsForInputhNQ4ISI = otherAmountLabel;
                        makeAPaymentMapper$toUiModel$1.isOutputSupportedForhNQ4ISI = enterAmountHint;
                        makeAPaymentMapper$toUiModel$1.isOutputSupportedFor = payWithTitle;
                        makeAPaymentMapper$toUiModel$1.toString = changePaymentMethodLabel;
                        makeAPaymentMapper$toUiModel$1.unwrapAs = paymentMethodEmptyMessage;
                        makeAPaymentMapper$toUiModel$1.CoroutineDebuggingKt = paymentMethodUnavailableMessage;
                        makeAPaymentMapper$toUiModel$1.getOutputFormats = confirmAndPayButton;
                        makeAPaymentMapper$toUiModel$1.getOutputMinFrameDuration = chooseWayToPayButton;
                        makeAPaymentMapper$toUiModel$1.getInputSizeshNQ4ISI = missingAmount;
                        makeAPaymentMapper$toUiModel$1.getInputFormats = missingFundingInstrument;
                        makeAPaymentMapper$toUiModel$1.getOutputSizeshNQ4ISI = insufficientBalance;
                        makeAPaymentMapper$toUiModel$1.getOutputStallDuration = validationContent;
                        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel5 = fundingInstrumentUiModel;
                        makeAPaymentMapper$toUiModel$1.coroutineBoundary = 3;
                        z = false;
                        formatCurrency$default = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter, minRepaymentAmount, null, 0, makeAPaymentMapper$toUiModel$1, 6, null);
                        if (formatCurrency$default == coroutine_suspended) {
                        }
                    }
                } else if (i == 1) {
                    makeAPaymentOverview2 = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview) makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj5);
                } else {
                    if (i == 2) {
                        makeAPaymentOverview2 = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview) makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        fundingInstrumentUiModel = (com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) obj5;
                        makeAPaymentOverview3 = makeAPaymentOverview2;
                        paymentAmountTitle = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPaymentAmountTitle();
                        autopayOnTitle = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getAutopayOnTitle();
                        otherAmountLabel = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getOtherAmountLabel();
                        com.paypal.oslo.core.commonui.utils.RefText enterAmountHint2 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getEnterAmountHint();
                        com.paypal.oslo.core.commonui.utils.RefText payWithTitle2 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPayWithTitle();
                        com.paypal.oslo.core.commonui.utils.RefText changePaymentMethodLabel2 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getChangePaymentMethodLabel();
                        com.paypal.oslo.core.commonui.utils.RefText paymentMethodEmptyMessage2 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPaymentMethodEmptyMessage();
                        com.paypal.oslo.core.commonui.utils.RefText paymentMethodUnavailableMessage2 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPaymentMethodUnavailableMessage();
                        com.paypal.oslo.core.commonui.utils.RefText confirmAndPayButton2 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getConfirmAndPayButton();
                        com.paypal.oslo.core.commonui.utils.RefText chooseWayToPayButton2 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getChooseWayToPayButton();
                        str = "";
                        com.paypal.oslo.core.commonui.utils.RefText missingAmount2 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getMissingAmount();
                        com.paypal.oslo.core.commonui.utils.RefText missingFundingInstrument2 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getMissingFundingInstrument();
                        com.paypal.oslo.core.commonui.utils.RefText insufficientBalance2 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getInsufficientBalance();
                        com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider.MakeAPaymentValidationContentProvider validationContent2 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent();
                        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter2 = makeAPaymentMapper.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money minRepaymentAmount2 = makeAPaymentOverview3.getMinRepaymentAmount();
                        makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizes = makeAPaymentOverview3;
                        makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizesFor = fundingInstrumentUiModel;
                        makeAPaymentMapper$toUiModel$1.getOutputSizes = paymentAmountTitle;
                        makeAPaymentMapper$toUiModel$1.getOutputStallDurationlomOqCM = autopayOnTitle;
                        makeAPaymentMapper$toUiModel$1.getValidOutputFormatsForInputhNQ4ISI = otherAmountLabel;
                        makeAPaymentMapper$toUiModel$1.isOutputSupportedForhNQ4ISI = enterAmountHint2;
                        makeAPaymentMapper$toUiModel$1.isOutputSupportedFor = payWithTitle2;
                        makeAPaymentMapper$toUiModel$1.toString = changePaymentMethodLabel2;
                        makeAPaymentMapper$toUiModel$1.unwrapAs = paymentMethodEmptyMessage2;
                        makeAPaymentMapper$toUiModel$1.CoroutineDebuggingKt = paymentMethodUnavailableMessage2;
                        makeAPaymentMapper$toUiModel$1.getOutputFormats = confirmAndPayButton2;
                        makeAPaymentMapper$toUiModel$1.getOutputMinFrameDuration = chooseWayToPayButton2;
                        makeAPaymentMapper$toUiModel$1.getInputSizeshNQ4ISI = missingAmount2;
                        makeAPaymentMapper$toUiModel$1.getInputFormats = missingFundingInstrument2;
                        makeAPaymentMapper$toUiModel$1.getOutputSizeshNQ4ISI = insufficientBalance2;
                        makeAPaymentMapper$toUiModel$1.getOutputStallDuration = validationContent2;
                        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel52 = fundingInstrumentUiModel;
                        makeAPaymentMapper$toUiModel$1.coroutineBoundary = 3;
                        z = false;
                        formatCurrency$default = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter2, minRepaymentAmount2, null, 0, makeAPaymentMapper$toUiModel$1, 6, null);
                        if (formatCurrency$default == coroutine_suspended) {
                            obj = coroutine_suspended;
                            return obj;
                        }
                        obj2 = coroutine_suspended;
                        refText = chooseWayToPayButton2;
                        refText2 = paymentMethodUnavailableMessage2;
                        refText3 = confirmAndPayButton2;
                        fundingInstrumentUiModel2 = fundingInstrumentUiModel52;
                        refText4 = changePaymentMethodLabel2;
                        refText5 = insufficientBalance2;
                        refText6 = payWithTitle2;
                        refText7 = paymentMethodEmptyMessage2;
                        makeAPaymentValidationContentProvider = validationContent2;
                        refText8 = missingAmount2;
                        refText9 = enterAmountHint2;
                        refText10 = missingFundingInstrument2;
                        com.paypal.oslo.core.commonui.utils.RefText amountBelowMinimum = makeAPaymentValidationContentProvider.amountBelowMinimum((java.lang.String) formatCurrency$default);
                        com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider.MakeAPaymentValidationContentProvider validationContent3 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent();
                        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter3 = makeAPaymentMapper.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money maxRepaymentAmount = makeAPaymentOverview3.getMaxRepaymentAmount();
                        makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizes = makeAPaymentOverview3;
                        makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizesFor = fundingInstrumentUiModel2;
                        makeAPaymentMapper$toUiModel$1.getOutputSizes = paymentAmountTitle;
                        makeAPaymentMapper$toUiModel$1.getOutputStallDurationlomOqCM = autopayOnTitle;
                        makeAPaymentMapper$toUiModel$1.getValidOutputFormatsForInputhNQ4ISI = otherAmountLabel;
                        makeAPaymentMapper$toUiModel$1.isOutputSupportedForhNQ4ISI = refText9;
                        makeAPaymentMapper$toUiModel$1.isOutputSupportedFor = refText6;
                        makeAPaymentMapper$toUiModel$1.toString = refText4;
                        makeAPaymentMapper$toUiModel$1.unwrapAs = refText7;
                        makeAPaymentMapper$toUiModel$1.CoroutineDebuggingKt = refText2;
                        makeAPaymentMapper$toUiModel$1.getOutputFormats = refText3;
                        makeAPaymentMapper$toUiModel$1.getOutputMinFrameDuration = refText;
                        com.paypal.oslo.core.commonui.utils.RefText refText22 = refText;
                        com.paypal.oslo.core.commonui.utils.RefText refText23 = refText8;
                        makeAPaymentMapper$toUiModel$1.getInputSizeshNQ4ISI = refText23;
                        com.paypal.oslo.core.commonui.utils.RefText refText24 = refText6;
                        makeAPaymentMapper$toUiModel$1.getInputFormats = refText10;
                        com.paypal.oslo.core.commonui.utils.RefText refText25 = refText5;
                        makeAPaymentMapper$toUiModel$1.getOutputSizeshNQ4ISI = refText25;
                        makeAPaymentMapper$toUiModel$1.getOutputStallDuration = amountBelowMinimum;
                        refText11 = refText3;
                        makeAPaymentMapper$toUiModel$1.getOutputMinFrameDurationlomOqCM = validationContent3;
                        makeAPaymentMapper$toUiModel$1.coroutineBoundary = 4;
                        com.paypal.oslo.core.commonui.utils.RefText refText26 = refText10;
                        refText12 = refText4;
                        refText13 = refText7;
                        obj = obj2;
                        refText14 = refText2;
                        formatCurrency$default2 = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter3, maxRepaymentAmount, null, 0, makeAPaymentMapper$toUiModel$1, 6, null);
                        if (formatCurrency$default2 != obj) {
                        }
                        return obj;
                    }
                    if (i == 3) {
                        com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider.MakeAPaymentValidationContentProvider makeAPaymentValidationContentProvider3 = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider.MakeAPaymentValidationContentProvider) makeAPaymentMapper$toUiModel$1.getOutputStallDuration;
                        com.paypal.oslo.core.commonui.utils.RefText refText27 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getOutputSizeshNQ4ISI;
                        com.paypal.oslo.core.commonui.utils.RefText refText28 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getInputFormats;
                        com.paypal.oslo.core.commonui.utils.RefText refText29 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getInputSizeshNQ4ISI;
                        com.paypal.oslo.core.commonui.utils.RefText refText30 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getOutputMinFrameDuration;
                        com.paypal.oslo.core.commonui.utils.RefText refText31 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getOutputFormats;
                        refText2 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.CoroutineDebuggingKt;
                        com.paypal.oslo.core.commonui.utils.RefText refText32 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.unwrapAs;
                        com.paypal.oslo.core.commonui.utils.RefText refText33 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.toString;
                        com.paypal.oslo.core.commonui.utils.RefText refText34 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.isOutputSupportedFor;
                        com.paypal.oslo.core.commonui.utils.RefText refText35 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.isOutputSupportedForhNQ4ISI;
                        com.paypal.oslo.core.commonui.utils.RefText refText36 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getValidOutputFormatsForInputhNQ4ISI;
                        com.paypal.oslo.core.commonui.utils.RefText refText37 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getOutputStallDurationlomOqCM;
                        com.paypal.oslo.core.commonui.utils.RefText refText38 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getOutputSizes;
                        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel6 = (com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview makeAPaymentOverview5 = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview) makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        refText5 = refText27;
                        z = false;
                        makeAPaymentValidationContentProvider = makeAPaymentValidationContentProvider3;
                        formatCurrency$default = obj5;
                        refText3 = refText31;
                        refText7 = refText32;
                        makeAPaymentOverview3 = makeAPaymentOverview5;
                        refText10 = refText28;
                        refText = refText30;
                        refText4 = refText33;
                        paymentAmountTitle = refText38;
                        obj2 = coroutine_suspended;
                        fundingInstrumentUiModel2 = fundingInstrumentUiModel6;
                        refText8 = refText29;
                        refText6 = refText34;
                        otherAmountLabel = refText36;
                        refText9 = refText35;
                        autopayOnTitle = refText37;
                        str = "";
                        com.paypal.oslo.core.commonui.utils.RefText amountBelowMinimum2 = makeAPaymentValidationContentProvider.amountBelowMinimum((java.lang.String) formatCurrency$default);
                        com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider.MakeAPaymentValidationContentProvider validationContent32 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent();
                        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter32 = makeAPaymentMapper.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money maxRepaymentAmount2 = makeAPaymentOverview3.getMaxRepaymentAmount();
                        makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizes = makeAPaymentOverview3;
                        makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizesFor = fundingInstrumentUiModel2;
                        makeAPaymentMapper$toUiModel$1.getOutputSizes = paymentAmountTitle;
                        makeAPaymentMapper$toUiModel$1.getOutputStallDurationlomOqCM = autopayOnTitle;
                        makeAPaymentMapper$toUiModel$1.getValidOutputFormatsForInputhNQ4ISI = otherAmountLabel;
                        makeAPaymentMapper$toUiModel$1.isOutputSupportedForhNQ4ISI = refText9;
                        makeAPaymentMapper$toUiModel$1.isOutputSupportedFor = refText6;
                        makeAPaymentMapper$toUiModel$1.toString = refText4;
                        makeAPaymentMapper$toUiModel$1.unwrapAs = refText7;
                        makeAPaymentMapper$toUiModel$1.CoroutineDebuggingKt = refText2;
                        makeAPaymentMapper$toUiModel$1.getOutputFormats = refText3;
                        makeAPaymentMapper$toUiModel$1.getOutputMinFrameDuration = refText;
                        com.paypal.oslo.core.commonui.utils.RefText refText222 = refText;
                        com.paypal.oslo.core.commonui.utils.RefText refText232 = refText8;
                        makeAPaymentMapper$toUiModel$1.getInputSizeshNQ4ISI = refText232;
                        com.paypal.oslo.core.commonui.utils.RefText refText242 = refText6;
                        makeAPaymentMapper$toUiModel$1.getInputFormats = refText10;
                        com.paypal.oslo.core.commonui.utils.RefText refText252 = refText5;
                        makeAPaymentMapper$toUiModel$1.getOutputSizeshNQ4ISI = refText252;
                        makeAPaymentMapper$toUiModel$1.getOutputStallDuration = amountBelowMinimum2;
                        refText11 = refText3;
                        makeAPaymentMapper$toUiModel$1.getOutputMinFrameDurationlomOqCM = validationContent32;
                        makeAPaymentMapper$toUiModel$1.coroutineBoundary = 4;
                        com.paypal.oslo.core.commonui.utils.RefText refText262 = refText10;
                        refText12 = refText4;
                        refText13 = refText7;
                        obj = obj2;
                        refText14 = refText2;
                        formatCurrency$default2 = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter32, maxRepaymentAmount2, null, 0, makeAPaymentMapper$toUiModel$1, 6, null);
                        if (formatCurrency$default2 != obj) {
                            refText15 = refText242;
                            refText16 = paymentAmountTitle;
                            refText17 = refText232;
                            refText18 = refText262;
                            refText19 = refText222;
                            makeAPaymentValidationContentProvider2 = validationContent32;
                            refText20 = amountBelowMinimum2;
                            refText21 = refText252;
                            fundingInstrumentUiModel3 = fundingInstrumentUiModel2;
                            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent makeAPaymentContent2 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent(refText16, autopayOnTitle, otherAmountLabel, refText9, refText15, refText12, refText13, refText14, refText11, refText19, new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent(refText17, refText18, refText21, refText20, makeAPaymentValidationContentProvider2.amountAboveMaximum((java.lang.String) formatCurrency$default2), makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getAmountExceedsInfo(), makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getAmountBelowInfo(), makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getAmountEqualsMaximum()));
                            com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus2 = makeAPaymentOverview3.getPlanStatus();
                            com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier2 = makeAPaymentOverview3.getCreditProductIdentifier();
                            creditAccountId = makeAPaymentOverview3.getCreditAccountId();
                            if (creditAccountId == null) {
                            }
                            com.paypal.oslo.feature.bnplservicing.domain.model.common.Money currentDueAmount = makeAPaymentOverview3.getCurrentDueAmount();
                            autopay = makeAPaymentOverview3.getAutopay();
                            if (autopay != null) {
                            }
                            z2 = z;
                            paymentOptions = makeAPaymentOverview3.getPaymentOptions();
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(paymentOptions, 10));
                            it = paymentOptions.iterator();
                            obj3 = obj;
                            planStatus = planStatus2;
                            creditProductIdentifier = creditProductIdentifier2;
                            str2 = creditAccountId;
                            money = currentDueAmount;
                            obj4 = paymentOptions;
                            collection = arrayList;
                            str3 = str;
                            fundingInstrumentUiModel4 = fundingInstrumentUiModel3;
                            boolean z3 = z;
                            makeAPaymentContent = makeAPaymentContent2;
                            makeAPaymentOverview4 = makeAPaymentOverview3;
                            i2 = z3 ? 1 : 0;
                            r7 = z3;
                            r9 = z2;
                            if (it.hasNext()) {
                            }
                        }
                        return obj;
                    }
                    if (i == 4) {
                        com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider.MakeAPaymentValidationContentProvider makeAPaymentValidationContentProvider4 = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider.MakeAPaymentValidationContentProvider) makeAPaymentMapper$toUiModel$1.getOutputMinFrameDurationlomOqCM;
                        com.paypal.oslo.core.commonui.utils.RefText refText39 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getOutputStallDuration;
                        com.paypal.oslo.core.commonui.utils.RefText refText40 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getOutputSizeshNQ4ISI;
                        com.paypal.oslo.core.commonui.utils.RefText refText41 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getInputFormats;
                        com.paypal.oslo.core.commonui.utils.RefText refText42 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getInputSizeshNQ4ISI;
                        refText19 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getOutputMinFrameDuration;
                        com.paypal.oslo.core.commonui.utils.RefText refText43 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getOutputFormats;
                        com.paypal.oslo.core.commonui.utils.RefText refText44 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.CoroutineDebuggingKt;
                        com.paypal.oslo.core.commonui.utils.RefText refText45 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.unwrapAs;
                        com.paypal.oslo.core.commonui.utils.RefText refText46 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.toString;
                        com.paypal.oslo.core.commonui.utils.RefText refText47 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.isOutputSupportedFor;
                        com.paypal.oslo.core.commonui.utils.RefText refText48 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.isOutputSupportedForhNQ4ISI;
                        com.paypal.oslo.core.commonui.utils.RefText refText49 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getValidOutputFormatsForInputhNQ4ISI;
                        com.paypal.oslo.core.commonui.utils.RefText refText50 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getOutputStallDurationlomOqCM;
                        com.paypal.oslo.core.commonui.utils.RefText refText51 = (com.paypal.oslo.core.commonui.utils.RefText) makeAPaymentMapper$toUiModel$1.getOutputSizes;
                        fundingInstrumentUiModel3 = (com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview makeAPaymentOverview6 = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview) makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        refText20 = refText39;
                        refText21 = refText40;
                        refText18 = refText41;
                        refText17 = refText42;
                        refText11 = refText43;
                        refText13 = refText45;
                        refText15 = refText47;
                        otherAmountLabel = refText49;
                        refText16 = refText51;
                        z = false;
                        makeAPaymentValidationContentProvider2 = makeAPaymentValidationContentProvider4;
                        refText14 = refText44;
                        makeAPaymentOverview3 = makeAPaymentOverview6;
                        formatCurrency$default2 = obj5;
                        obj = coroutine_suspended;
                        refText12 = refText46;
                        autopayOnTitle = refText50;
                        str = "";
                        refText9 = refText48;
                        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent makeAPaymentContent22 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent(refText16, autopayOnTitle, otherAmountLabel, refText9, refText15, refText12, refText13, refText14, refText11, refText19, new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent(refText17, refText18, refText21, refText20, makeAPaymentValidationContentProvider2.amountAboveMaximum((java.lang.String) formatCurrency$default2), makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getAmountExceedsInfo(), makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getAmountBelowInfo(), makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getAmountEqualsMaximum()));
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus22 = makeAPaymentOverview3.getPlanStatus();
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier22 = makeAPaymentOverview3.getCreditProductIdentifier();
                        creditAccountId = makeAPaymentOverview3.getCreditAccountId();
                        if (creditAccountId == null) {
                            creditAccountId = str;
                        }
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money currentDueAmount2 = makeAPaymentOverview3.getCurrentDueAmount();
                        autopay = makeAPaymentOverview3.getAutopay();
                        if (autopay != null) {
                            if (!autopay.getEnabled()) {
                                z2 = z;
                                paymentOptions = makeAPaymentOverview3.getPaymentOptions();
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(paymentOptions, 10));
                                it = paymentOptions.iterator();
                                obj3 = obj;
                                planStatus = planStatus22;
                                creditProductIdentifier = creditProductIdentifier22;
                                str2 = creditAccountId;
                                money = currentDueAmount2;
                                obj4 = paymentOptions;
                                collection = arrayList2;
                                str3 = str;
                                fundingInstrumentUiModel4 = fundingInstrumentUiModel3;
                                boolean z32 = z;
                                makeAPaymentContent = makeAPaymentContent22;
                                makeAPaymentOverview4 = makeAPaymentOverview3;
                                i2 = z32 ? 1 : 0;
                                r7 = z32;
                                r9 = z2;
                                if (it.hasNext()) {
                                }
                            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(makeAPaymentOverview3.getAutopay().isFundingInstrumentValid(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z))) {
                                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption> paymentOptions2 = makeAPaymentOverview3.getPaymentOptions();
                                if (!(paymentOptions2 instanceof java.util.Collection) || !paymentOptions2.isEmpty()) {
                                    java.util.Iterator it2 = paymentOptions2.iterator();
                                    while (it2.hasNext()) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption) it2.next()).getShouldShowAutopayOnText(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        z2 = z;
                        paymentOptions = makeAPaymentOverview3.getPaymentOptions();
                        java.util.ArrayList arrayList22 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(paymentOptions, 10));
                        it = paymentOptions.iterator();
                        obj3 = obj;
                        planStatus = planStatus22;
                        creditProductIdentifier = creditProductIdentifier22;
                        str2 = creditAccountId;
                        money = currentDueAmount2;
                        obj4 = paymentOptions;
                        collection = arrayList22;
                        str3 = str;
                        fundingInstrumentUiModel4 = fundingInstrumentUiModel3;
                        boolean z322 = z;
                        makeAPaymentContent = makeAPaymentContent22;
                        makeAPaymentOverview4 = makeAPaymentOverview3;
                        i2 = z322 ? 1 : 0;
                        r7 = z322;
                        r9 = z2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = makeAPaymentMapper$toUiModel$1.getHighSpeedVideoFpsRangesFor;
                        int i4 = makeAPaymentMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i5 = makeAPaymentMapper$toUiModel$1.getHighSpeedVideoFpsRanges;
                        int i6 = makeAPaymentMapper$toUiModel$1.Camera2StreamConfigurationMap;
                        collection = (java.util.Collection) makeAPaymentMapper$toUiModel$1.getInputFormats;
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2 = (com.paypal.oslo.feature.bnplservicing.domain.model.common.Money) makeAPaymentMapper$toUiModel$1.getInputSizeshNQ4ISI;
                        java.lang.String str5 = (java.lang.String) makeAPaymentMapper$toUiModel$1.getOutputMinFrameDuration;
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier3 = (com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier) makeAPaymentMapper$toUiModel$1.getOutputFormats;
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus3 = (com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus) makeAPaymentMapper$toUiModel$1.CoroutineDebuggingKt;
                        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent makeAPaymentContent3 = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent) makeAPaymentMapper$toUiModel$1.unwrapAs;
                        java.lang.Object obj6 = makeAPaymentMapper$toUiModel$1.isOutputSupportedFor;
                        java.util.Iterator it3 = (java.util.Iterator) makeAPaymentMapper$toUiModel$1.isOutputSupportedForhNQ4ISI;
                        java.util.Collection collection2 = (java.util.Collection) makeAPaymentMapper$toUiModel$1.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.Object obj7 = (java.lang.Iterable) makeAPaymentMapper$toUiModel$1.getOutputStallDurationlomOqCM;
                        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption> list = (java.lang.Iterable) makeAPaymentMapper$toUiModel$1.getOutputSizes;
                        com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel7 = (com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizesFor;
                        makeAPaymentOverview4 = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview) makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj5);
                        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toUiModel$1 makeAPaymentMapper$toUiModel$12 = makeAPaymentMapper$toUiModel$1;
                        java.lang.Object obj8 = coroutine_suspended;
                        int i7 = i3;
                        i2 = i5;
                        fundingInstrumentUiModel4 = fundingInstrumentUiModel7;
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus4 = planStatus3;
                        java.util.Iterator it4 = it3;
                        int i8 = i6;
                        obj4 = obj7;
                        java.lang.String str6 = str5;
                        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent makeAPaymentContent4 = makeAPaymentContent3;
                        collection.add((com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption) obj5);
                        obj3 = obj8;
                        money = money2;
                        r7 = i8;
                        collection = collection2;
                        r9 = i7;
                        creditProductIdentifier = creditProductIdentifier3;
                        makeAPaymentContent = makeAPaymentContent4;
                        str3 = str4;
                        it = it4;
                        makeAPaymentMapper$toUiModel$1 = makeAPaymentMapper$toUiModel$12;
                        str2 = str6;
                        paymentOptions = list;
                        planStatus = planStatus4;
                        z = false;
                        if (it.hasNext()) {
                            java.lang.Object next = it.next();
                            com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption paymentOption = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption) next;
                            makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizes = makeAPaymentOverview4;
                            makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizesFor = fundingInstrumentUiModel4;
                            com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel8 = fundingInstrumentUiModel4;
                            makeAPaymentMapper$toUiModel$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentOptions);
                            makeAPaymentMapper$toUiModel$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj4);
                            makeAPaymentMapper$toUiModel$1.getValidOutputFormatsForInputhNQ4ISI = collection;
                            makeAPaymentMapper$toUiModel$1.isOutputSupportedForhNQ4ISI = it;
                            makeAPaymentMapper$toUiModel$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                            makeAPaymentMapper$toUiModel$1.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentOption);
                            makeAPaymentMapper$toUiModel$1.unwrapAs = makeAPaymentContent;
                            makeAPaymentMapper$toUiModel$1.CoroutineDebuggingKt = planStatus;
                            makeAPaymentMapper$toUiModel$1.getOutputFormats = creditProductIdentifier;
                            makeAPaymentMapper$toUiModel$1.getOutputMinFrameDuration = str2;
                            makeAPaymentMapper$toUiModel$1.getInputSizeshNQ4ISI = money;
                            makeAPaymentMapper$toUiModel$1.getInputFormats = collection;
                            makeAPaymentMapper$toUiModel$1.getOutputSizeshNQ4ISI = null;
                            makeAPaymentMapper$toUiModel$1.getOutputStallDuration = null;
                            makeAPaymentMapper$toUiModel$1.getOutputMinFrameDurationlomOqCM = null;
                            makeAPaymentMapper$toUiModel$1.Camera2StreamConfigurationMap = r7;
                            makeAPaymentMapper$toUiModel$1.getHighSpeedVideoFpsRanges = i2;
                            makeAPaymentMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = z ? 1 : 0;
                            makeAPaymentMapper$toUiModel$1.getHighSpeedVideoFpsRangesFor = r9;
                            makeAPaymentMapper$toUiModel$1.coroutineBoundary = 5;
                            makeAPaymentMapper = this;
                            java.lang.Object highSpeedVideoFpsRangesFor = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor(paymentOption, makeAPaymentMapper$toUiModel$1);
                            makeAPaymentMapper$toUiModel$12 = makeAPaymentMapper$toUiModel$1;
                            obj8 = obj3;
                            if (highSpeedVideoFpsRangesFor == obj8) {
                                return obj8;
                            }
                            list = paymentOptions;
                            planStatus4 = planStatus;
                            i8 = r7;
                            it4 = it;
                            money2 = money;
                            obj5 = highSpeedVideoFpsRangesFor;
                            makeAPaymentContent4 = makeAPaymentContent;
                            fundingInstrumentUiModel4 = fundingInstrumentUiModel8;
                            creditProductIdentifier3 = creditProductIdentifier;
                            str6 = str2;
                            str4 = str3;
                            i7 = r9;
                            collection2 = collection;
                            collection.add((com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption) obj5);
                            obj3 = obj8;
                            money = money2;
                            r7 = i8;
                            collection = collection2;
                            r9 = i7;
                            creditProductIdentifier = creditProductIdentifier3;
                            makeAPaymentContent = makeAPaymentContent4;
                            str3 = str4;
                            it = it4;
                            makeAPaymentMapper$toUiModel$1 = makeAPaymentMapper$toUiModel$12;
                            str2 = str6;
                            paymentOptions = list;
                            planStatus = planStatus4;
                            z = false;
                            if (it.hasNext()) {
                                com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel9 = fundingInstrumentUiModel4;
                                java.util.List list2 = (java.util.List) collection;
                                com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.CustomAmountOption customAmountOption = new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.CustomAmountOption(makeAPaymentOverview4.getMinRepaymentAmount(), makeAPaymentOverview4.getMaxRepaymentAmount(), makeAPaymentOverview4.getMinRepaymentAmount());
                                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> supportingFundingInstrumentsToAdd = makeAPaymentOverview4.getSupportingFundingInstrumentsToAdd();
                                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supportingFundingInstrumentsToAdd, 10));
                                java.util.Iterator it5 = supportingFundingInstrumentsToAdd.iterator();
                                while (it5.hasNext()) {
                                    arrayList3.add(getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition) it5.next()));
                                }
                                java.util.ArrayList arrayList4 = arrayList3;
                                java.lang.String paymentAuthorizationLink = makeAPaymentOverview4.getPaymentAuthorizationLink();
                                com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions = paymentAuthorizationLink != null ? new com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions(makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPaymentAuthorizationText(), makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPaymentAuthorizationLinkText(), paymentAuthorizationLink) : null;
                                java.lang.String currencyCode = makeAPaymentOverview4.getCurrencyCode();
                                return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel(makeAPaymentContent, planStatus, creditProductIdentifier, str2, money, r9 != 0, list2, customAmountOption, null, fundingInstrumentUiModel9, arrayList4, termsAndConditions, currencyCode != null ? currencyCode : str3, null, null, false, null, null, false, null, makeAPaymentOverview4.getFundingInstruments(), makeAPaymentOverview4.getSupportingFundingInstrumentsToAdd(), makeAPaymentMapper.getHighResolutionOutputSizeshNQ4ISI.getUIs().getAmountSection().getNextPaymentAmount().getShouldShowOtherAmountOption(), makeAPaymentMapper.getHighResolutionOutputSizeshNQ4ISI.getUIs().getAmountSection().getNextPaymentAmount().getLocale(), 1040384, null);
                            }
                        }
                    }
                }
                fundingInstrumentUiModel = (com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) obj5;
                if (fundingInstrumentUiModel != null) {
                    makeAPaymentOverview3 = makeAPaymentOverview2;
                    paymentAmountTitle = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPaymentAmountTitle();
                    autopayOnTitle = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getAutopayOnTitle();
                    otherAmountLabel = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getOtherAmountLabel();
                    com.paypal.oslo.core.commonui.utils.RefText enterAmountHint22 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getEnterAmountHint();
                    com.paypal.oslo.core.commonui.utils.RefText payWithTitle22 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPayWithTitle();
                    com.paypal.oslo.core.commonui.utils.RefText changePaymentMethodLabel22 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getChangePaymentMethodLabel();
                    com.paypal.oslo.core.commonui.utils.RefText paymentMethodEmptyMessage22 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPaymentMethodEmptyMessage();
                    com.paypal.oslo.core.commonui.utils.RefText paymentMethodUnavailableMessage22 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getPaymentMethodUnavailableMessage();
                    com.paypal.oslo.core.commonui.utils.RefText confirmAndPayButton22 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getConfirmAndPayButton();
                    com.paypal.oslo.core.commonui.utils.RefText chooseWayToPayButton22 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getChooseWayToPayButton();
                    str = "";
                    com.paypal.oslo.core.commonui.utils.RefText missingAmount22 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getMissingAmount();
                    com.paypal.oslo.core.commonui.utils.RefText missingFundingInstrument22 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getMissingFundingInstrument();
                    com.paypal.oslo.core.commonui.utils.RefText insufficientBalance22 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent().getInsufficientBalance();
                    com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider.MakeAPaymentValidationContentProvider validationContent22 = makeAPaymentMapper.getHighSpeedVideoFpsRangesFor.getValidationContent();
                    com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter22 = makeAPaymentMapper.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.Money minRepaymentAmount22 = makeAPaymentOverview3.getMinRepaymentAmount();
                    makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizes = makeAPaymentOverview3;
                    makeAPaymentMapper$toUiModel$1.getHighSpeedVideoSizesFor = fundingInstrumentUiModel;
                    makeAPaymentMapper$toUiModel$1.getOutputSizes = paymentAmountTitle;
                    makeAPaymentMapper$toUiModel$1.getOutputStallDurationlomOqCM = autopayOnTitle;
                    makeAPaymentMapper$toUiModel$1.getValidOutputFormatsForInputhNQ4ISI = otherAmountLabel;
                    makeAPaymentMapper$toUiModel$1.isOutputSupportedForhNQ4ISI = enterAmountHint22;
                    makeAPaymentMapper$toUiModel$1.isOutputSupportedFor = payWithTitle22;
                    makeAPaymentMapper$toUiModel$1.toString = changePaymentMethodLabel22;
                    makeAPaymentMapper$toUiModel$1.unwrapAs = paymentMethodEmptyMessage22;
                    makeAPaymentMapper$toUiModel$1.CoroutineDebuggingKt = paymentMethodUnavailableMessage22;
                    makeAPaymentMapper$toUiModel$1.getOutputFormats = confirmAndPayButton22;
                    makeAPaymentMapper$toUiModel$1.getOutputMinFrameDuration = chooseWayToPayButton22;
                    makeAPaymentMapper$toUiModel$1.getInputSizeshNQ4ISI = missingAmount22;
                    makeAPaymentMapper$toUiModel$1.getInputFormats = missingFundingInstrument22;
                    makeAPaymentMapper$toUiModel$1.getOutputSizeshNQ4ISI = insufficientBalance22;
                    makeAPaymentMapper$toUiModel$1.getOutputStallDuration = validationContent22;
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel522 = fundingInstrumentUiModel;
                    makeAPaymentMapper$toUiModel$1.coroutineBoundary = 3;
                    z = false;
                    formatCurrency$default = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter22, minRepaymentAmount22, null, 0, makeAPaymentMapper$toUiModel$1, 6, null);
                    if (formatCurrency$default == coroutine_suspended) {
                    }
                }
                fundingInstrument = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) makeAPaymentOverview2.getFundingInstruments());
                if (fundingInstrument != null) {
                }
            }
        }
        makeAPaymentMapper$toUiModel$1 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toUiModel$1(makeAPaymentMapper, continuation);
        java.lang.Object obj52 = makeAPaymentMapper$toUiModel$1.ArtificialStackFrames;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = makeAPaymentMapper$toUiModel$1.coroutineBoundary;
        java.lang.String str42 = "";
        if (i != 0) {
        }
        fundingInstrumentUiModel = (com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) obj52;
        if (fundingInstrumentUiModel != null) {
        }
        fundingInstrument = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) makeAPaymentOverview2.getFundingInstruments());
        if (fundingInstrument != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption paymentOption, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toPaymentOption$1 makeAPaymentMapper$toPaymentOption$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toPaymentOption$1) {
            makeAPaymentMapper$toPaymentOption$1 = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toPaymentOption$1) continuation;
            if ((makeAPaymentMapper$toPaymentOption$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                makeAPaymentMapper$toPaymentOption$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toPaymentOption$1 makeAPaymentMapper$toPaymentOption$12 = makeAPaymentMapper$toPaymentOption$1;
                java.lang.Object obj = makeAPaymentMapper$toPaymentOption$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = makeAPaymentMapper$toPaymentOption$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount = paymentOption.getAmount();
                    makeAPaymentMapper$toPaymentOption$12.getHighSpeedVideoSizes = paymentOption;
                    makeAPaymentMapper$toPaymentOption$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(this.Camera2StreamConfigurationMap, amount, com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL, 0, makeAPaymentMapper$toPaymentOption$12, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    paymentOption = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption) makeAPaymentMapper$toPaymentOption$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption((java.lang.String) obj, this.getHighSpeedVideoFpsRangesFor.paymentOptionLabel(paymentOption.getType()));
            }
        }
        makeAPaymentMapper$toPaymentOption$1 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toPaymentOption$1(this, continuation);
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toPaymentOption$1 makeAPaymentMapper$toPaymentOption$122 = makeAPaymentMapper$toPaymentOption$1;
        java.lang.Object obj2 = makeAPaymentMapper$toPaymentOption$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = makeAPaymentMapper$toPaymentOption$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption((java.lang.String) obj2, this.getHighSpeedVideoFpsRangesFor.paymentOptionLabel(paymentOption.getType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay autopay, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel> continuation) {
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument2;
        boolean z = false;
        if (kotlin.jvm.internal.Intrinsics.areEqual(autopay.isFundingInstrumentValid(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)) && autopay.getFundingInstrument() != null) {
            z = true;
        }
        if (!z && (fundingInstrument2 = autopay.getFundingInstrument()) != null) {
            fundingInstrument = fundingInstrument2;
        }
        if (fundingInstrument == null) {
            return null;
        }
        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(fundingInstrument, z, continuation);
        return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : (com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) highSpeedVideoFpsRanges;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toFundingInstrumentUiModel$1 makeAPaymentMapper$toFundingInstrumentUiModel$1;
        int i;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument2;
        java.lang.String str;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toFundingInstrumentUiModel$1) {
            makeAPaymentMapper$toFundingInstrumentUiModel$1 = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toFundingInstrumentUiModel$1) continuation;
            if ((makeAPaymentMapper$toFundingInstrumentUiModel$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                makeAPaymentMapper$toFundingInstrumentUiModel$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toFundingInstrumentUiModel$1 makeAPaymentMapper$toFundingInstrumentUiModel$12 = makeAPaymentMapper$toFundingInstrumentUiModel$1;
                java.lang.Object obj = makeAPaymentMapper$toFundingInstrumentUiModel$12.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = makeAPaymentMapper$toFundingInstrumentUiModel$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount paypalBalanceAccount = fundingInstrument instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount ? (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount) fundingInstrument : null;
                    if (paypalBalanceAccount != null && (amount = paypalBalanceAccount.getAmount()) != null) {
                        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter = this.Camera2StreamConfigurationMap;
                        makeAPaymentMapper$toFundingInstrumentUiModel$12.getHighSpeedVideoFpsRanges = fundingInstrument;
                        makeAPaymentMapper$toFundingInstrumentUiModel$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(amount);
                        makeAPaymentMapper$toFundingInstrumentUiModel$12.getHighResolutionOutputSizeshNQ4ISI = z;
                        makeAPaymentMapper$toFundingInstrumentUiModel$12.getHighSpeedVideoSizes = 0;
                        makeAPaymentMapper$toFundingInstrumentUiModel$12.Camera2StreamConfigurationMap = 1;
                        obj = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter, amount, null, 0, makeAPaymentMapper$toFundingInstrumentUiModel$12, 6, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        fundingInstrument2 = fundingInstrument;
                        str = null;
                        return new com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel(fundingInstrument2, this.getHighSpeedVideoFpsRangesFor.getFundingInstrumentContent().title(fundingInstrument2), this.getHighSpeedVideoFpsRangesFor.getFundingInstrumentContent().subtitle(fundingInstrument2, str), false, z ? new com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel.Alert(com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel.Alert.AlertContext.INVALID_FUNDING_INSTRUMENT, "") : null);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = makeAPaymentMapper$toFundingInstrumentUiModel$12.getHighSpeedVideoSizes;
                    boolean z2 = makeAPaymentMapper$toFundingInstrumentUiModel$12.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument3 = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument) makeAPaymentMapper$toFundingInstrumentUiModel$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    z = z2;
                    fundingInstrument = fundingInstrument3;
                }
                str = (java.lang.String) obj;
                fundingInstrument2 = fundingInstrument;
                return new com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel(fundingInstrument2, this.getHighSpeedVideoFpsRangesFor.getFundingInstrumentContent().title(fundingInstrument2), this.getHighSpeedVideoFpsRangesFor.getFundingInstrumentContent().subtitle(fundingInstrument2, str), false, z ? new com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel.Alert(com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel.Alert.AlertContext.INVALID_FUNDING_INSTRUMENT, "") : null);
            }
        }
        makeAPaymentMapper$toFundingInstrumentUiModel$1 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toFundingInstrumentUiModel$1(this, continuation);
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toFundingInstrumentUiModel$1 makeAPaymentMapper$toFundingInstrumentUiModel$122 = makeAPaymentMapper$toFundingInstrumentUiModel$1;
        java.lang.Object obj2 = makeAPaymentMapper$toFundingInstrumentUiModel$122.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = makeAPaymentMapper$toFundingInstrumentUiModel$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        fundingInstrument2 = fundingInstrument;
        return new com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel(fundingInstrument2, this.getHighSpeedVideoFpsRangesFor.getFundingInstrumentContent().title(fundingInstrument2), this.getHighSpeedVideoFpsRangesFor.getFundingInstrumentContent().subtitle(fundingInstrument2, str), false, z ? new com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel.Alert(com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel.Alert.AlertContext.INVALID_FUNDING_INSTRUMENT, "") : null);
    }

    private static com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition supportedFundingInstrumentTypeForAddition) {
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType;
        int i = com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper.WhenMappings.$EnumSwitchMapping$0[supportedFundingInstrumentTypeForAddition.ordinal()];
        if (i == 1) {
            addFundingInstrumentType = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.BANK;
        } else if (i == 2 || i == 3 || i == 4) {
            addFundingInstrumentType = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.CARD;
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            addFundingInstrumentType = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.UNKNOWN;
        }
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.AddFundingInstrumentLink("", addFundingInstrumentType);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.BANK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.CREDIT_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.DEBIT_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.PREPAID_CARD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
