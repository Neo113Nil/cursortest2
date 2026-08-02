package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0080@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\n\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/mapper/FundingInstrumentUiModelMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatter", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstrument", "selectedFundingInstrument", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;", "toUiModel$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "eligibleInstrument", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FundingInstrumentUiModelMapper {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public FundingInstrumentUiModelMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        this.getHighResolutionOutputSizeshNQ4ISI = currencyFormatterFacade;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toUiModel$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$toUiModel$1 fundingInstrumentUiModelMapper$toUiModel$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty empty;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString;
        java.lang.Object highSpeedVideoSizes;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument3;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument4 = fundingInstrument;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$toUiModel$1) {
            fundingInstrumentUiModelMapper$toUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$toUiModel$1) continuation;
            if ((fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = fundingInstrumentUiModelMapper$toUiModel$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String id = fundingInstrument.getId();
                    if (fundingInstrument4 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) {
                        java.lang.String name2 = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) fundingInstrument4).getName();
                        if (name2 != null) {
                            plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(name2);
                            empty = plainString;
                            fundingInstrumentUiModelMapper$toUiModel$1.Camera2StreamConfigurationMap = fundingInstrument4;
                            fundingInstrumentUiModelMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = fundingInstrument2;
                            fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRangesFor = id;
                            fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoSizes = empty;
                            fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges = 1;
                            highSpeedVideoSizes = getHighSpeedVideoSizes(fundingInstrument4, fundingInstrumentUiModelMapper$toUiModel$1);
                            if (highSpeedVideoSizes == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            uiString = empty;
                            fundingInstrument3 = fundingInstrument2;
                            str = id;
                            obj = highSpeedVideoSizes;
                        } else {
                            empty = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                            fundingInstrumentUiModelMapper$toUiModel$1.Camera2StreamConfigurationMap = fundingInstrument4;
                            fundingInstrumentUiModelMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = fundingInstrument2;
                            fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRangesFor = id;
                            fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoSizes = empty;
                            fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges = 1;
                            highSpeedVideoSizes = getHighSpeedVideoSizes(fundingInstrument4, fundingInstrumentUiModelMapper$toUiModel$1);
                            if (highSpeedVideoSizes == coroutine_suspended) {
                            }
                        }
                    } else {
                        if (fundingInstrument4 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) {
                            empty = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_paypal_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        } else {
                            if (!(fundingInstrument4 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            java.lang.String name3 = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard) fundingInstrument4).getName();
                            if (name3 != null) {
                                plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(name3);
                                empty = plainString;
                            } else {
                                empty = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                            }
                        }
                        fundingInstrumentUiModelMapper$toUiModel$1.Camera2StreamConfigurationMap = fundingInstrument4;
                        fundingInstrumentUiModelMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = fundingInstrument2;
                        fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRangesFor = id;
                        fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoSizes = empty;
                        fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges = 1;
                        highSpeedVideoSizes = getHighSpeedVideoSizes(fundingInstrument4, fundingInstrumentUiModelMapper$toUiModel$1);
                        if (highSpeedVideoSizes == coroutine_suspended) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoSizes;
                    java.lang.String str2 = (java.lang.String) fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRangesFor;
                    fundingInstrument3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) fundingInstrumentUiModelMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) fundingInstrumentUiModelMapper$toUiModel$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    uiString = uiString2;
                    fundingInstrument4 = fundingInstrument5;
                    str = str2;
                }
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel(str, uiString, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj, fundingInstrument4.getIcon(), null, null, null, null, kotlin.jvm.internal.Intrinsics.areEqual(fundingInstrument3 == null ? fundingInstrument3.getId() : null, fundingInstrument4.getId()), null, null, null, null, 7920, null);
            }
        }
        fundingInstrumentUiModelMapper$toUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$toUiModel$1(this, continuation);
        java.lang.Object obj2 = fundingInstrumentUiModelMapper$toUiModel$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fundingInstrumentUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel(str, uiString, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj2, fundingInstrument4.getIcon(), null, null, null, null, kotlin.jvm.internal.Intrinsics.areEqual(fundingInstrument3 == null ? fundingInstrument3.getId() : null, fundingInstrument4.getId()), null, null, null, null, 7920, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00dc, code lost:
    
        if (r1 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00df, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0113, code lost:
    
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel(r8, r9, r10, r6, null, null, null, null, false, null, null, null, null, 8176, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00eb, code lost:
    
        if (r1 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f8, code lost:
    
        if (r1 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r2 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r2 = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) r1).getBankName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        r8 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        r3.getHighSpeedVideoFpsRanges = r1;
        r3.getHighSpeedVideoSizes = r5;
        r3.Camera2StreamConfigurationMap = r2;
        r3.getHighSpeedVideoFpsRangesFor = 1;
        r3 = getHighResolutionOutputSizeshNQ4ISI(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        if (r3 != r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
    
        r9 = r2;
        r2 = r3;
        r8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
    
        r2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
    
        if ((r1 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
    
        r2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_paypal_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        if ((r1 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
    
        r2 = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card) r1).getCardType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
    
        if (r2 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        r8 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
    
        r2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0077, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0066, code lost:
    
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0074, code lost:
    
        if (r5 != null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toUiModel$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument eligiblePaymentInstrument, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$toUiModel$2 fundingInstrumentUiModelMapper$toUiModel$2;
        int i;
        java.lang.String id;
        java.lang.String artUrl;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument eligiblePaymentInstrument2 = eligiblePaymentInstrument;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$toUiModel$2) {
            fundingInstrumentUiModelMapper$toUiModel$2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$toUiModel$2) continuation;
            if ((fundingInstrumentUiModelMapper$toUiModel$2.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                fundingInstrumentUiModelMapper$toUiModel$2.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = fundingInstrumentUiModelMapper$toUiModel$2.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fundingInstrumentUiModelMapper$toUiModel$2.getHighSpeedVideoFpsRangesFor;
                java.lang.String str = "";
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    boolean z = eligiblePaymentInstrument2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank;
                    if (z) {
                        id = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) eligiblePaymentInstrument2).getId();
                    } else if (eligiblePaymentInstrument2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) {
                        id = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) eligiblePaymentInstrument2).getId();
                    } else {
                        if (!(eligiblePaymentInstrument2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        id = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card) eligiblePaymentInstrument2).getId();
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) fundingInstrumentUiModelMapper$toUiModel$2.Camera2StreamConfigurationMap;
                    java.lang.String str2 = (java.lang.String) fundingInstrumentUiModelMapper$toUiModel$2.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument eligiblePaymentInstrument3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument) fundingInstrumentUiModelMapper$toUiModel$2.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = uiString;
                    eligiblePaymentInstrument2 = eligiblePaymentInstrument3;
                    java.lang.String str3 = str2;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj;
                if (!(eligiblePaymentInstrument2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank)) {
                    artUrl = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) eligiblePaymentInstrument2).getArtUrl();
                } else if (eligiblePaymentInstrument2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) {
                    artUrl = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) eligiblePaymentInstrument2).getArtUrl();
                } else {
                    if (!(eligiblePaymentInstrument2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    artUrl = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card) eligiblePaymentInstrument2).getArtUrl();
                }
            }
        }
        fundingInstrumentUiModelMapper$toUiModel$2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$toUiModel$2(this, continuation);
        java.lang.Object obj2 = fundingInstrumentUiModelMapper$toUiModel$2.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fundingInstrumentUiModelMapper$toUiModel$2.getHighSpeedVideoFpsRangesFor;
        java.lang.String str4 = "";
        if (i != 0) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString32 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj2;
        if (!(eligiblePaymentInstrument2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetails$1 fundingInstrumentUiModelMapper$paymentMethodDetails$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        int i2;
        int i3;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        java.lang.Integer stringId;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetails$1) {
            fundingInstrumentUiModelMapper$paymentMethodDetails$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetails$1) continuation;
            if ((fundingInstrumentUiModelMapper$paymentMethodDetails$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                fundingInstrumentUiModelMapper$paymentMethodDetails$1.getInputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetails$1 fundingInstrumentUiModelMapper$paymentMethodDetails$12 = fundingInstrumentUiModelMapper$paymentMethodDetails$1;
                java.lang.Object obj = fundingInstrumentUiModelMapper$paymentMethodDetails$12.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fundingInstrumentUiModelMapper$paymentMethodDetails$12.getInputSizeshNQ4ISI;
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
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighResolutionOutputSizeshNQ4ISI;
                            fundingInstrumentUiModelMapper$paymentMethodDetails$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrument);
                            fundingInstrumentUiModelMapper$paymentMethodDetails$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balance);
                            fundingInstrumentUiModelMapper$paymentMethodDetails$12.getOutputMinFrameDuration = objArr3;
                            fundingInstrumentUiModelMapper$paymentMethodDetails$12.getInputFormats = objArr3;
                            fundingInstrumentUiModelMapper$paymentMethodDetails$12.getHighSpeedVideoFpsRangesFor = 0;
                            fundingInstrumentUiModelMapper$paymentMethodDetails$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                            fundingInstrumentUiModelMapper$paymentMethodDetails$12.getHighSpeedVideoSizes = i5;
                            fundingInstrumentUiModelMapper$paymentMethodDetails$12.getInputSizeshNQ4ISI = 1;
                            obj = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, balance, null, 0, fundingInstrumentUiModelMapper$paymentMethodDetails$12, 6, null);
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
                    int i7 = fundingInstrumentUiModelMapper$paymentMethodDetails$12.getHighSpeedVideoSizes;
                    i2 = fundingInstrumentUiModelMapper$paymentMethodDetails$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i8 = fundingInstrumentUiModelMapper$paymentMethodDetails$12.getHighSpeedVideoFpsRangesFor;
                    objArr = (java.lang.Object[]) fundingInstrumentUiModelMapper$paymentMethodDetails$12.getInputFormats;
                    java.lang.Object[] objArr4 = (java.lang.Object[]) fundingInstrumentUiModelMapper$paymentMethodDetails$12.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objArr2 = objArr4;
                    i3 = i7;
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    str = "";
                }
                objArr[i2] = str;
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i3, objArr2, null, false, 12, null);
            }
        }
        fundingInstrumentUiModelMapper$paymentMethodDetails$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetails$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetails$1 fundingInstrumentUiModelMapper$paymentMethodDetails$122 = fundingInstrumentUiModelMapper$paymentMethodDetails$1;
        java.lang.Object obj2 = fundingInstrumentUiModelMapper$paymentMethodDetails$122.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fundingInstrumentUiModelMapper$paymentMethodDetails$122.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
        objArr[i2] = str;
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i3, objArr2, null, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument eligiblePaymentInstrument, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1 fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1;
        int i;
        int i2;
        int i3;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1) {
            fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1) continuation;
            if ((fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1.getInputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1 fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12 = fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1;
                java.lang.Object obj = fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank bank = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) eligiblePaymentInstrument;
                        java.lang.String lastDigits = bank.getLastDigits();
                        if (lastDigits != null) {
                            int i4 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_last_four_account;
                            java.lang.String accountType = bank.getAccountType();
                            if (accountType == null || (uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(accountType)) == null) {
                                uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                            }
                            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i4, new java.lang.Object[]{uiString, lastDigits}, null, false, 12, null);
                        }
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                    }
                    if (eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) eligiblePaymentInstrument).getAmount();
                        if (amount != null) {
                            int i5 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_balance_available;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighResolutionOutputSizeshNQ4ISI;
                            fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(eligiblePaymentInstrument);
                            fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(amount);
                            fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.getOutputFormats = objArr3;
                            fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.getHighSpeedVideoSizesFor = objArr3;
                            fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.getHighSpeedVideoFpsRangesFor = 0;
                            fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                            fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.Camera2StreamConfigurationMap = i5;
                            fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.getInputSizeshNQ4ISI = 1;
                            obj = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, amount, null, 0, fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12, 6, null);
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
                        if (!(eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card card = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card) eligiblePaymentInstrument;
                        java.lang.String lastDigits2 = card.getLastDigits();
                        if (lastDigits2 != null) {
                            int i6 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_last_four_account;
                            java.lang.String cardType = card.getCardType();
                            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i6, new java.lang.Object[]{cardType != null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(cardType) : com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE, lastDigits2}, null, false, 12, null);
                        }
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.Camera2StreamConfigurationMap;
                    i2 = fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i8 = fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.getHighSpeedVideoFpsRangesFor;
                    objArr = (java.lang.Object[]) fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.getHighSpeedVideoSizesFor;
                    java.lang.Object[] objArr4 = (java.lang.Object[]) fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$12.getOutputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objArr2 = objArr4;
                    i3 = i7;
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    str = "";
                }
                objArr[i2] = str;
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i3, objArr2, null, false, 12, null);
            }
        }
        fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1 fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$122 = fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1;
        java.lang.Object obj2 = fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$122.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
        objArr[i2] = str;
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i3, objArr2, null, false, 12, null);
    }
}
