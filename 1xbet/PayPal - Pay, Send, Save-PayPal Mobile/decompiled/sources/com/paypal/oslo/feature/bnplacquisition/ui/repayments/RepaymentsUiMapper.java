package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001e\u001a\u00020\u001d*\u0004\u0018\u00010\u001cH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\"\u001a\u00020!*\u0004\u0018\u00010 H\u0082@¢\u0006\u0004\b\"\u0010#J\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010+\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiMapper;", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ApplicationFailureUiMapper;", "applicationFailureUiMapper", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/util/BnplAcquisitionFormatter;", "bnplAcquisitionFormatter", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsContentProvider;", "contentProvider", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContentProvider;", "exitConfirmationContentProvider", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsConfig;", "config", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ApplicationFailureUiMapper;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/util/BnplAcquisitionFormatter;Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsContentProvider;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContentProvider;Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsConfig;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "declineType", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "toDeclineContent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "errorType", "toErrorContent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", "repaymentsSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/SelectedOffer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentSchedule;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/SelectedOffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrument;", "toUiFundingInstrument", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrument;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ApplicationFailureUiMapper;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/util/BnplAcquisitionFormatter;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsContentProvider;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContentProvider;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RepaymentsUiMapper {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsContentProvider Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter getHighSpeedVideoSizes;

    @javax.inject.Inject
    public RepaymentsUiMapper(com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsContentProvider repaymentsContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider exitConfirmationContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig repaymentsConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationFailureUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsContentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exitConfirmationContentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsConfig, "");
        this.getHighResolutionOutputSizeshNQ4ISI = applicationFailureUiMapper;
        this.getHighSpeedVideoSizes = bnplAcquisitionFormatter;
        this.Camera2StreamConfigurationMap = repaymentsContentProvider;
        this.getHighSpeedVideoFpsRangesFor = exitConfirmationContentProvider;
        this.getHighSpeedVideoFpsRanges = repaymentsConfig;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel toDeclineContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType declineType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineType, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.toDeclineContent(declineType);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType errorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.toErrorContent(errorType);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toUiModel(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper$toUiModel$1 repaymentsUiMapper$toUiModel$1;
        int i;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument creditApplicationDocument;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument creditApplicationDocument2;
        java.util.List list;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink consentLink;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink consentLink2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink viewLink;
        java.lang.Object obj;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink viewLink2;
        java.lang.Object obj2;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> repaymentFundingInstruments;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper$toUiModel$1) {
            repaymentsUiMapper$toUiModel$1 = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper$toUiModel$1) continuation;
            if ((repaymentsUiMapper$toUiModel$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                repaymentsUiMapper$toUiModel$1.getOutputFormats -= 2147483648;
                java.lang.Object obj3 = repaymentsUiMapper$toUiModel$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = repaymentsUiMapper$toUiModel$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccessCreditApplication creditApplicationSuccess = repaymentsSuccess.getCreditApplicationSuccess();
                    if (creditApplicationSuccess == null || (repaymentFundingInstruments = creditApplicationSuccess.getRepaymentFundingInstruments()) == null) {
                        arrayList = null;
                    } else {
                        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> list2 = repaymentFundingInstruments;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                        java.util.Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(toUiFundingInstrument((com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument) it.next()));
                        }
                        arrayList = arrayList2;
                    }
                    java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument> documents = creditApplicationSuccess != null ? creditApplicationSuccess.getDocuments() : null;
                    if (documents != null) {
                        java.util.Iterator<T> it2 = documents.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (((com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument) obj2).getType() == com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.PAYMENT_AUTHORIZATION) {
                                break;
                            }
                        }
                        creditApplicationDocument = (com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument) obj2;
                    } else {
                        creditApplicationDocument = null;
                    }
                    com.paypal.oslo.core.commonui.utils.RefText paymentAuthorizationLinkLabel = this.Camera2StreamConfigurationMap.getPaymentAuthorizationLinkLabel();
                    java.lang.String linkString = (creditApplicationDocument == null || (viewLink2 = creditApplicationDocument.getViewLink()) == null) ? null : com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLinkKt.getLinkString(viewLink2);
                    com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink consentLink3 = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink(paymentAuthorizationLinkLabel, linkString == null ? "" : linkString, com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.PAYMENT_AUTHORIZATION.getValue(), null, 8, null);
                    if (documents != null) {
                        java.util.Iterator<T> it3 = documents.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it3.next();
                            if (((com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument) obj).getType() == com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.LOAN_AGREEMENT) {
                                break;
                            }
                        }
                        creditApplicationDocument2 = (com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument) obj;
                    } else {
                        creditApplicationDocument2 = null;
                    }
                    com.paypal.oslo.core.commonui.utils.RefText loanAgreementLinkLabel = this.Camera2StreamConfigurationMap.getLoanAgreementLinkLabel();
                    java.lang.String linkString2 = (creditApplicationDocument2 == null || (viewLink = creditApplicationDocument2.getViewLink()) == null) ? null : com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLinkKt.getLinkString(viewLink);
                    if (linkString2 == null) {
                        linkString2 = "";
                    }
                    com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink consentLink4 = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink(loanAgreementLinkLabel, linkString2, com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.LOAN_AGREEMENT.getValue(), creditApplicationDocument2 != null ? creditApplicationDocument2.getHtml() : null);
                    com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer selectedOffer = creditApplicationSuccess != null ? creditApplicationSuccess.getSelectedOffer() : null;
                    repaymentsUiMapper$toUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(repaymentsSuccess);
                    repaymentsUiMapper$toUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditApplicationSuccess);
                    repaymentsUiMapper$toUiModel$1.Camera2StreamConfigurationMap = arrayList;
                    repaymentsUiMapper$toUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documents);
                    repaymentsUiMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditApplicationDocument);
                    repaymentsUiMapper$toUiModel$1.getHighSpeedVideoSizesFor = consentLink3;
                    repaymentsUiMapper$toUiModel$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditApplicationDocument2);
                    repaymentsUiMapper$toUiModel$1.getInputSizeshNQ4ISI = consentLink4;
                    repaymentsUiMapper$toUiModel$1.getOutputFormats = 1;
                    obj3 = getHighSpeedVideoSizes(selectedOffer, repaymentsUiMapper$toUiModel$1);
                    if (obj3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = arrayList;
                    consentLink = consentLink3;
                    consentLink2 = consentLink4;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink consentLink5 = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink) repaymentsUiMapper$toUiModel$1.getInputSizeshNQ4ISI;
                    consentLink = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink) repaymentsUiMapper$toUiModel$1.getHighSpeedVideoSizesFor;
                    list = (java.util.List) repaymentsUiMapper$toUiModel$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    consentLink2 = consentLink5;
                }
                com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule repaymentSchedule = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule) obj3;
                com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpi = this.getHighSpeedVideoFpsRanges.getCtx().getCpi();
                return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel(repaymentSchedule, consentLink, list, null, null, false, false, false, this.Camera2StreamConfigurationMap.title(cpi), this.Camera2StreamConfigurationMap.subtitle(cpi, repaymentSchedule.getAmount(), repaymentSchedule.getNumberOfPayments(), repaymentSchedule.getStartDate()), this.Camera2StreamConfigurationMap.choosePaymentLabel(cpi), this.Camera2StreamConfigurationMap.getValidationErrorNoFi(), this.Camera2StreamConfigurationMap.disclaimerText(cpi), consentLink2, this.Camera2StreamConfigurationMap.continueButtonText(cpi), this.Camera2StreamConfigurationMap.getSkipButtonText(), this.Camera2StreamConfigurationMap.linkDebitCardText(cpi), null, false, false, this.getHighSpeedVideoFpsRangesFor.getExitConfirmationContent(), this.Camera2StreamConfigurationMap.getToolBarContent(), this.Camera2StreamConfigurationMap.getAgreementText(), this.Camera2StreamConfigurationMap.getAgreeToContinueErrorMessage(), this.getHighSpeedVideoFpsRanges.getUis().getFooterSection().getShowSkipOption(), this.getHighSpeedVideoFpsRanges.getUis().getFooterSection().getShowConsentCheckbox(), 917728, null);
            }
        }
        repaymentsUiMapper$toUiModel$1 = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper$toUiModel$1(this, continuation);
        java.lang.Object obj32 = repaymentsUiMapper$toUiModel$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = repaymentsUiMapper$toUiModel$1.getOutputFormats;
        if (i != 0) {
        }
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule repaymentSchedule2 = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule) obj32;
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpi2 = this.getHighSpeedVideoFpsRanges.getCtx().getCpi();
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel(repaymentSchedule2, consentLink, list, null, null, false, false, false, this.Camera2StreamConfigurationMap.title(cpi2), this.Camera2StreamConfigurationMap.subtitle(cpi2, repaymentSchedule2.getAmount(), repaymentSchedule2.getNumberOfPayments(), repaymentSchedule2.getStartDate()), this.Camera2StreamConfigurationMap.choosePaymentLabel(cpi2), this.Camera2StreamConfigurationMap.getValidationErrorNoFi(), this.Camera2StreamConfigurationMap.disclaimerText(cpi2), consentLink2, this.Camera2StreamConfigurationMap.continueButtonText(cpi2), this.Camera2StreamConfigurationMap.getSkipButtonText(), this.Camera2StreamConfigurationMap.linkDebitCardText(cpi2), null, false, false, this.getHighSpeedVideoFpsRangesFor.getExitConfirmationContent(), this.Camera2StreamConfigurationMap.getToolBarContent(), this.Camera2StreamConfigurationMap.getAgreementText(), this.Camera2StreamConfigurationMap.getAgreeToContinueErrorMessage(), this.getHighSpeedVideoFpsRanges.getUis().getFooterSection().getShowSkipOption(), this.getHighSpeedVideoFpsRanges.getUis().getFooterSection().getShowConsentCheckbox(), 917728, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer selectedOffer, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper$toRepaymentSchedule$1 repaymentsUiMapper$toRepaymentSchedule$1;
        int i;
        java.lang.String str;
        java.lang.String firstPaymentDate;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper$toRepaymentSchedule$1) {
            repaymentsUiMapper$toRepaymentSchedule$1 = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper$toRepaymentSchedule$1) continuation;
            if ((repaymentsUiMapper$toRepaymentSchedule$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                repaymentsUiMapper$toRepaymentSchedule$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = repaymentsUiMapper$toRepaymentSchedule$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = repaymentsUiMapper$toRepaymentSchedule$1.Camera2StreamConfigurationMap;
                str = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money periodicPaymentAmount = selectedOffer != null ? selectedOffer.getPeriodicPaymentAmount() : null;
                    repaymentsUiMapper$toRepaymentSchedule$1.getHighResolutionOutputSizeshNQ4ISI = selectedOffer;
                    repaymentsUiMapper$toRepaymentSchedule$1.Camera2StreamConfigurationMap = 1;
                    obj = getHighResolutionOutputSizeshNQ4ISI(periodicPaymentAmount, repaymentsUiMapper$toRepaymentSchedule$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    selectedOffer = (com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.SelectedOffer) repaymentsUiMapper$toRepaymentSchedule$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str2 = (java.lang.String) obj;
                int installmentCount = selectedOffer == null ? selectedOffer.getInstallmentCount() : 0;
                if (selectedOffer != null && (firstPaymentDate = selectedOffer.getFirstPaymentDate()) != null) {
                    str = java.time.LocalDate.parse(firstPaymentDate).format(java.time.format.DateTimeFormatter.ofPattern(com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem.INSTALLMENT_DATE_OUTPUT_PATTERN, java.util.Locale.ENGLISH));
                }
                if (str == null) {
                    str = "";
                }
                return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule(str2, installmentCount, str);
            }
        }
        repaymentsUiMapper$toRepaymentSchedule$1 = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper$toRepaymentSchedule$1(this, continuation);
        java.lang.Object obj2 = repaymentsUiMapper$toRepaymentSchedule$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = repaymentsUiMapper$toRepaymentSchedule$1.Camera2StreamConfigurationMap;
        str = null;
        if (i != 0) {
        }
        java.lang.String str22 = (java.lang.String) obj2;
        if (selectedOffer == null) {
        }
        if (selectedOffer != null) {
            str = java.time.LocalDate.parse(firstPaymentDate).format(java.time.format.DateTimeFormatter.ofPattern(com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem.INSTALLMENT_DATE_OUTPUT_PATTERN, java.util.Locale.ENGLISH));
        }
        if (str == null) {
        }
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentSchedule(str22, installmentCount, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        if (money == null) {
            return "";
        }
        double doubleOrZero = com.paypal.oslo.feature.bnplacquisition.ui.common.util.StringExtensionsKt.toDoubleOrZero(money.getValue());
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter = this.getHighSpeedVideoSizes;
        java.lang.String currencyCode = money.getCurrencyCode();
        return com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter.formatCurrency$default(bnplAcquisitionFormatter, doubleOrZero, currencyCode == null ? "" : currencyCode, null, 0, continuation, 12, null);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument toUiFundingInstrument(com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument fundingInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        if (fundingInstrument instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank fundingInstrumentBank = (com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank) fundingInstrument;
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument(fundingInstrumentBank.getId(), fundingInstrumentBank.getName(), com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentKt.getSubtitle(fundingInstrument), fundingInstrumentBank.getLogoUrl());
        }
        if (!(fundingInstrument instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard fundingInstrumentCard = (com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard) fundingInstrument;
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument(fundingInstrumentCard.getId(), fundingInstrumentCard.getName(), com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType.CARD, com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentKt.getSubtitle(fundingInstrument), fundingInstrumentCard.getLogoUrl());
    }
}
