package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/PlanSnapshotConverters;", "", "Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;", "formatter", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/PlanListHelpers;", "helpers", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/content/PayLaterHubContentProvider;", "contentProvider", "Lcom/paypal/oslo/feature/bnplservicing/config/paylaterhub/PayLaterHubConfig;", "payLaterHubConfig", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/PlanListHelpers;Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/content/PayLaterHubContentProvider;Lcom/paypal/oslo/feature/bnplservicing/config/paylaterhub/PayLaterHubConfig;)V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;", "plan", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/components/ReadyToUsePlanModel;", "toReadyToUseModel", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/components/AfterPurchasePlanModel;", "toCompletedModel", "toInProgressModel", "toProblemModel", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/PlanListHelpers;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/content/PayLaterHubContentProvider;", "Lcom/paypal/oslo/feature/bnplservicing/config/paylaterhub/PayLaterHubConfig;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanSnapshotConverters {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PlanSnapshotConverters(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers planListHelpers, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider payLaterHubContentProvider, com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig payLaterHubConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planListHelpers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubContentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubConfig, "");
        this.getHighSpeedVideoSizes = bnplServFormatter;
        this.Camera2StreamConfigurationMap = planListHelpers;
        this.getHighSpeedVideoFpsRanges = payLaterHubContentProvider;
        this.getHighSpeedVideoFpsRangesFor = payLaterHubConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
    
        if (r14 != r8) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toReadyToUseModel(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toReadyToUseModel$1 planSnapshotConverters$toReadyToUseModel$1;
        int i;
        com.paypal.oslo.core.commonui.utils.RefText inStoreOnly;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        java.lang.String str;
        java.lang.String validityDuration;
        com.paypal.oslo.core.commonui.utils.RefText refText2;
        com.paypal.oslo.core.commonui.utils.RefText refText3;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot2;
        java.lang.String str2;
        java.lang.String creditAccountId;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toReadyToUseModel$1) {
            planSnapshotConverters$toReadyToUseModel$1 = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toReadyToUseModel$1) continuation;
            if ((planSnapshotConverters$toReadyToUseModel$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                planSnapshotConverters$toReadyToUseModel$1.getInputFormats -= 2147483648;
                java.lang.Object obj = planSnapshotConverters$toReadyToUseModel$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = planSnapshotConverters$toReadyToUseModel$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!(planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan)) {
                        throw new java.lang.IllegalArgumentException("Plan must be a ReadyToUsePlan".toString());
                    }
                    com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan readyToUsePlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan) planListSnapshot;
                    int i2 = com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters.WhenMappings.$EnumSwitchMapping$0[readyToUsePlan.getVariantPolicy().getUsageChannel().ordinal()];
                    if (i2 == 1) {
                        inStoreOnly = this.getHighSpeedVideoFpsRanges.getPlanContentProvider().getInStoreOnly();
                    } else if (i2 == 2) {
                        inStoreOnly = this.getHighSpeedVideoFpsRanges.getPlanContentProvider().getOnlineOnly();
                    } else {
                        inStoreOnly = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(readyToUsePlan.getProductName());
                    }
                    refText = inStoreOnly;
                    com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money(readyToUsePlan.getCurrencyCode(), readyToUsePlan.getRawValue());
                    planSnapshotConverters$toReadyToUseModel$1.getHighSpeedVideoFpsRangesFor = planListSnapshot;
                    planSnapshotConverters$toReadyToUseModel$1.Camera2StreamConfigurationMap = refText;
                    planSnapshotConverters$toReadyToUseModel$1.getInputFormats = 1;
                    obj = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter, money, null, 0, planSnapshotConverters$toReadyToUseModel$1, 6, null);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = planSnapshotConverters$toReadyToUseModel$1.getHighSpeedVideoFpsRanges;
                        str2 = (java.lang.String) planSnapshotConverters$toReadyToUseModel$1.getHighSpeedVideoSizes;
                        refText3 = (com.paypal.oslo.core.commonui.utils.RefText) planSnapshotConverters$toReadyToUseModel$1.Camera2StreamConfigurationMap;
                        planListSnapshot2 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot) planSnapshotConverters$toReadyToUseModel$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        refText2 = this.getHighSpeedVideoFpsRanges.getPlanContentProvider().validityText(kotlin.text.StringsKt.replace$default((java.lang.String) obj, " ", "", false, 4, (java.lang.Object) null));
                        str = str2;
                        planListSnapshot = planListSnapshot2;
                        refText = refText3;
                        creditAccountId = ((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan) planListSnapshot).getCreditAccountId();
                        if (creditAccountId == null) {
                            creditAccountId = "";
                        }
                        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel(creditAccountId, str, refText, refText2);
                    }
                    com.paypal.oslo.core.commonui.utils.RefText refText4 = (com.paypal.oslo.core.commonui.utils.RefText) planSnapshotConverters$toReadyToUseModel$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot3 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot) planSnapshotConverters$toReadyToUseModel$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    refText = refText4;
                    planListSnapshot = planListSnapshot3;
                }
                str = (java.lang.String) obj;
                validityDuration = ((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan) planListSnapshot).getValidityDuration();
                refText2 = null;
                if (validityDuration != null) {
                    java.lang.String str3 = kotlin.text.StringsKt.isBlank(validityDuration) ? null : validityDuration;
                    if (str3 != null) {
                        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter2 = this.getHighSpeedVideoSizes;
                        planSnapshotConverters$toReadyToUseModel$1.getHighSpeedVideoFpsRangesFor = planListSnapshot;
                        planSnapshotConverters$toReadyToUseModel$1.Camera2StreamConfigurationMap = refText;
                        planSnapshotConverters$toReadyToUseModel$1.getHighSpeedVideoSizes = str;
                        planSnapshotConverters$toReadyToUseModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        planSnapshotConverters$toReadyToUseModel$1.getHighSpeedVideoFpsRanges = 0;
                        planSnapshotConverters$toReadyToUseModel$1.getInputFormats = 2;
                        java.lang.Object formatDuration$default = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatDuration$default(bnplServFormatter2, str3, null, planSnapshotConverters$toReadyToUseModel$1, 2, null);
                        if (formatDuration$default != coroutine_suspended) {
                            refText3 = refText;
                            planListSnapshot2 = planListSnapshot;
                            str2 = str;
                            obj = formatDuration$default;
                            refText2 = this.getHighSpeedVideoFpsRanges.getPlanContentProvider().validityText(kotlin.text.StringsKt.replace$default((java.lang.String) obj, " ", "", false, 4, (java.lang.Object) null));
                            str = str2;
                            planListSnapshot = planListSnapshot2;
                            refText = refText3;
                        }
                        return coroutine_suspended;
                    }
                }
                creditAccountId = ((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan) planListSnapshot).getCreditAccountId();
                if (creditAccountId == null) {
                }
                return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel(creditAccountId, str, refText, refText2);
            }
        }
        planSnapshotConverters$toReadyToUseModel$1 = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toReadyToUseModel$1(this, continuation);
        java.lang.Object obj2 = planSnapshotConverters$toReadyToUseModel$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = planSnapshotConverters$toReadyToUseModel$1.getInputFormats;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        validityDuration = ((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan) planListSnapshot).getValidityDuration();
        refText2 = null;
        if (validityDuration != null) {
        }
        creditAccountId = ((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan) planListSnapshot).getCreditAccountId();
        if (creditAccountId == null) {
        }
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel(creditAccountId, str, refText, refText2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toCompletedModel(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toCompletedModel$1 planSnapshotConverters$toCompletedModel$1;
        int i;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.CompletedPlanInfo extractCompletionSpecificInfo;
        java.lang.Object formatCurrency$default;
        java.lang.String str;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        com.paypal.oslo.core.commonui.utils.RefText completedOn;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.InstallmentInfo installments;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot2 = planListSnapshot;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toCompletedModel$1) {
            planSnapshotConverters$toCompletedModel$1 = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toCompletedModel$1) continuation;
            if ((planSnapshotConverters$toCompletedModel$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                planSnapshotConverters$toCompletedModel$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toCompletedModel$1 planSnapshotConverters$toCompletedModel$12 = planSnapshotConverters$toCompletedModel$1;
                java.lang.Object obj = planSnapshotConverters$toCompletedModel$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = planSnapshotConverters$toCompletedModel$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    extractCompletionSpecificInfo = this.Camera2StreamConfigurationMap.extractCompletionSpecificInfo(planListSnapshot2);
                    if (planListSnapshot.getContextualLabel() != com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD) {
                        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter = this.getHighSpeedVideoSizes;
                        java.lang.String currencyCode = planListSnapshot.getCurrencyCode();
                        java.lang.String extractFormattedAmount = this.Camera2StreamConfigurationMap.extractFormattedAmount(planListSnapshot2);
                        if (extractFormattedAmount == null) {
                            extractFormattedAmount = "";
                        }
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money(currencyCode, extractFormattedAmount);
                        planSnapshotConverters$toCompletedModel$12.getHighSpeedVideoFpsRangesFor = planListSnapshot2;
                        planSnapshotConverters$toCompletedModel$12.getHighResolutionOutputSizeshNQ4ISI = extractCompletionSpecificInfo;
                        planSnapshotConverters$toCompletedModel$12.Camera2StreamConfigurationMap = 1;
                        formatCurrency$default = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter, money, null, 0, planSnapshotConverters$toCompletedModel$12, 6, null);
                        if (formatCurrency$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        str = null;
                        java.lang.String creditAccountId = planListSnapshot2.getCreditAccountId();
                        java.lang.String str2 = creditAccountId == null ? "" : creditAccountId;
                        java.lang.String extractMerchantName = this.Camera2StreamConfigurationMap.extractMerchantName(planListSnapshot2);
                        java.lang.String extractProductName = this.Camera2StreamConfigurationMap.extractProductName(planListSnapshot2);
                        java.lang.String extractMerchantLogoUrl = this.Camera2StreamConfigurationMap.extractMerchantLogoUrl(planListSnapshot2);
                        if (planListSnapshot2.getContextualLabel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD) {
                            completedOn = this.getHighSpeedVideoFpsRanges.getPlanContentProvider().getStatusInReview();
                        } else if (extractCompletionSpecificInfo.isRefundPending()) {
                            completedOn = this.getHighSpeedVideoFpsRanges.getPlanContentProvider().getRefundPending();
                        } else {
                            java.lang.String completedDateTime = extractCompletionSpecificInfo.getCompletedDateTime();
                            if (completedDateTime != null) {
                                completedOn = this.getHighSpeedVideoFpsRanges.getPlanContentProvider().completedOn(completedDateTime);
                            } else {
                                refText = null;
                                return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel(str2, null, extractMerchantLogoUrl, !extractCompletionSpecificInfo.isRefundPending() ? com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.Refund : com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.Completed, extractMerchantName, !this.getHighSpeedVideoFpsRangesFor.getUIs().getPlansSection().getShouldShowProductName() ? extractProductName : null, str, refText, (!extractCompletionSpecificInfo.isRefundPending() || (installments = extractCompletionSpecificInfo.getInstallments()) == null) ? null : new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel(installments.getPaid(), installments.getTotal()), 2, null);
                            }
                        }
                        refText = completedOn;
                        if (extractCompletionSpecificInfo.isRefundPending()) {
                        }
                        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel(str2, null, extractMerchantLogoUrl, !extractCompletionSpecificInfo.isRefundPending() ? com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.Refund : com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.Completed, extractMerchantName, !this.getHighSpeedVideoFpsRangesFor.getUIs().getPlansSection().getShouldShowProductName() ? extractProductName : null, str, refText, (!extractCompletionSpecificInfo.isRefundPending() || (installments = extractCompletionSpecificInfo.getInstallments()) == null) ? null : new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel(installments.getPaid(), installments.getTotal()), 2, null);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.CompletedPlanInfo completedPlanInfo = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.CompletedPlanInfo) planSnapshotConverters$toCompletedModel$12.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot3 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot) planSnapshotConverters$toCompletedModel$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    formatCurrency$default = obj;
                    extractCompletionSpecificInfo = completedPlanInfo;
                    planListSnapshot2 = planListSnapshot3;
                }
                str = (java.lang.String) formatCurrency$default;
                java.lang.String creditAccountId2 = planListSnapshot2.getCreditAccountId();
                if (creditAccountId2 == null) {
                }
                java.lang.String extractMerchantName2 = this.Camera2StreamConfigurationMap.extractMerchantName(planListSnapshot2);
                java.lang.String extractProductName2 = this.Camera2StreamConfigurationMap.extractProductName(planListSnapshot2);
                java.lang.String extractMerchantLogoUrl2 = this.Camera2StreamConfigurationMap.extractMerchantLogoUrl(planListSnapshot2);
                if (planListSnapshot2.getContextualLabel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD) {
                }
                refText = completedOn;
                if (extractCompletionSpecificInfo.isRefundPending()) {
                }
                return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel(str2, null, extractMerchantLogoUrl2, !extractCompletionSpecificInfo.isRefundPending() ? com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.Refund : com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.Completed, extractMerchantName2, !this.getHighSpeedVideoFpsRangesFor.getUIs().getPlansSection().getShouldShowProductName() ? extractProductName2 : null, str, refText, (!extractCompletionSpecificInfo.isRefundPending() || (installments = extractCompletionSpecificInfo.getInstallments()) == null) ? null : new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel(installments.getPaid(), installments.getTotal()), 2, null);
            }
        }
        planSnapshotConverters$toCompletedModel$1 = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toCompletedModel$1(this, continuation);
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toCompletedModel$1 planSnapshotConverters$toCompletedModel$122 = planSnapshotConverters$toCompletedModel$1;
        java.lang.Object obj2 = planSnapshotConverters$toCompletedModel$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = planSnapshotConverters$toCompletedModel$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        str = (java.lang.String) formatCurrency$default;
        java.lang.String creditAccountId22 = planListSnapshot2.getCreditAccountId();
        if (creditAccountId22 == null) {
        }
        java.lang.String extractMerchantName22 = this.Camera2StreamConfigurationMap.extractMerchantName(planListSnapshot2);
        java.lang.String extractProductName22 = this.Camera2StreamConfigurationMap.extractProductName(planListSnapshot2);
        java.lang.String extractMerchantLogoUrl22 = this.Camera2StreamConfigurationMap.extractMerchantLogoUrl(planListSnapshot2);
        if (planListSnapshot2.getContextualLabel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD) {
        }
        refText = completedOn;
        if (extractCompletionSpecificInfo.isRefundPending()) {
        }
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel(str2, null, extractMerchantLogoUrl22, !extractCompletionSpecificInfo.isRefundPending() ? com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.Refund : com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.Completed, extractMerchantName22, !this.getHighSpeedVideoFpsRangesFor.getUIs().getPlansSection().getShouldShowProductName() ? extractProductName22 : null, str, refText, (!extractCompletionSpecificInfo.isRefundPending() || (installments = extractCompletionSpecificInfo.getInstallments()) == null) ? null : new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel(installments.getPaid(), installments.getTotal()), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toInProgressModel(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toInProgressModel$1 planSnapshotConverters$toInProgressModel$1;
        int i;
        int intValue;
        int intValue2;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        java.lang.String str;
        int i2;
        com.paypal.oslo.core.commonui.utils.RefText refText2;
        java.lang.String creditAccountId;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot2 = planListSnapshot;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toInProgressModel$1) {
            planSnapshotConverters$toInProgressModel$1 = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toInProgressModel$1) continuation;
            if ((planSnapshotConverters$toInProgressModel$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                planSnapshotConverters$toInProgressModel$1.getOutputMinFrameDuration -= 2147483648;
                com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toInProgressModel$1 planSnapshotConverters$toInProgressModel$12 = planSnapshotConverters$toInProgressModel$1;
                java.lang.Object obj = planSnapshotConverters$toInProgressModel$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = planSnapshotConverters$toInProgressModel$12.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Triple<java.lang.Integer, java.lang.Integer, com.paypal.oslo.core.commonui.utils.RefText> extractInProgressSpecificInfo = this.Camera2StreamConfigurationMap.extractInProgressSpecificInfo(planListSnapshot2);
                    intValue = extractInProgressSpecificInfo.component1().intValue();
                    intValue2 = extractInProgressSpecificInfo.component2().intValue();
                    com.paypal.oslo.core.commonui.utils.RefText component3 = extractInProgressSpecificInfo.component3();
                    boolean z = planListSnapshot2 instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan;
                    java.lang.Object[] objArr = planListSnapshot.getContextualLabel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD;
                    if (!z && objArr == false) {
                        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter = this.getHighSpeedVideoSizes;
                        java.lang.String currencyCode = planListSnapshot.getCurrencyCode();
                        java.lang.String extractFormattedAmount = this.Camera2StreamConfigurationMap.extractFormattedAmount(planListSnapshot2);
                        if (extractFormattedAmount == null) {
                            extractFormattedAmount = "";
                        }
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money(currencyCode, extractFormattedAmount);
                        planSnapshotConverters$toInProgressModel$12.getHighSpeedVideoFpsRanges = planListSnapshot2;
                        planSnapshotConverters$toInProgressModel$12.getHighSpeedVideoSizesFor = component3;
                        planSnapshotConverters$toInProgressModel$12.getHighSpeedVideoFpsRangesFor = intValue;
                        planSnapshotConverters$toInProgressModel$12.getHighSpeedVideoSizes = intValue2;
                        planSnapshotConverters$toInProgressModel$12.getHighResolutionOutputSizeshNQ4ISI = z ? 1 : 0;
                        planSnapshotConverters$toInProgressModel$12.Camera2StreamConfigurationMap = 0;
                        planSnapshotConverters$toInProgressModel$12.getOutputMinFrameDuration = 1;
                        java.lang.Object formatCurrency$default = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter, money, null, 0, planSnapshotConverters$toInProgressModel$12, 6, null);
                        if (formatCurrency$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2 = intValue;
                        refText2 = component3;
                        obj = formatCurrency$default;
                    } else {
                        refText = component3;
                        str = null;
                        creditAccountId = planListSnapshot2.getCreditAccountId();
                        if (creditAccountId == null) {
                            creditAccountId = "";
                        }
                        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel(creditAccountId, null, this.Camera2StreamConfigurationMap.extractMerchantLogoUrl(planListSnapshot2), com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.InProgress, this.Camera2StreamConfigurationMap.extractMerchantName(planListSnapshot2), this.getHighSpeedVideoFpsRangesFor.getUIs().getPlansSection().getShouldShowProductName() ? this.Camera2StreamConfigurationMap.extractProductName(planListSnapshot2) : null, str, refText, new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel(intValue, intValue2), 2, null);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = planSnapshotConverters$toInProgressModel$12.Camera2StreamConfigurationMap;
                    int i4 = planSnapshotConverters$toInProgressModel$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = planSnapshotConverters$toInProgressModel$12.getHighSpeedVideoSizes;
                    i2 = planSnapshotConverters$toInProgressModel$12.getHighSpeedVideoFpsRangesFor;
                    refText2 = (com.paypal.oslo.core.commonui.utils.RefText) planSnapshotConverters$toInProgressModel$12.getHighSpeedVideoSizesFor;
                    com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot3 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot) planSnapshotConverters$toInProgressModel$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    intValue2 = i5;
                    planListSnapshot2 = planListSnapshot3;
                }
                str = (java.lang.String) obj;
                intValue = i2;
                refText = refText2;
                creditAccountId = planListSnapshot2.getCreditAccountId();
                if (creditAccountId == null) {
                }
                return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel(creditAccountId, null, this.Camera2StreamConfigurationMap.extractMerchantLogoUrl(planListSnapshot2), com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.InProgress, this.Camera2StreamConfigurationMap.extractMerchantName(planListSnapshot2), this.getHighSpeedVideoFpsRangesFor.getUIs().getPlansSection().getShouldShowProductName() ? this.Camera2StreamConfigurationMap.extractProductName(planListSnapshot2) : null, str, refText, new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel(intValue, intValue2), 2, null);
            }
        }
        planSnapshotConverters$toInProgressModel$1 = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toInProgressModel$1(this, continuation);
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toInProgressModel$1 planSnapshotConverters$toInProgressModel$122 = planSnapshotConverters$toInProgressModel$1;
        java.lang.Object obj2 = planSnapshotConverters$toInProgressModel$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = planSnapshotConverters$toInProgressModel$122.getOutputMinFrameDuration;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        intValue = i2;
        refText = refText2;
        creditAccountId = planListSnapshot2.getCreditAccountId();
        if (creditAccountId == null) {
        }
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel(creditAccountId, null, this.Camera2StreamConfigurationMap.extractMerchantLogoUrl(planListSnapshot2), com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.InProgress, this.Camera2StreamConfigurationMap.extractMerchantName(planListSnapshot2), this.getHighSpeedVideoFpsRangesFor.getUIs().getPlansSection().getShouldShowProductName() ? this.Camera2StreamConfigurationMap.extractProductName(planListSnapshot2) : null, str, refText, new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel(intValue, intValue2), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toProblemModel(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toProblemModel$1 planSnapshotConverters$toProblemModel$1;
        int i;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.Quadruple<java.lang.Integer, java.lang.Integer, java.lang.Integer, com.paypal.oslo.core.commonui.utils.RefText> extractProblemSpecificInfo;
        java.lang.Object formatCurrency$default;
        java.lang.String str;
        com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType afterPurchasePlanType;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot2 = planListSnapshot;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toProblemModel$1) {
            planSnapshotConverters$toProblemModel$1 = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toProblemModel$1) continuation;
            if ((planSnapshotConverters$toProblemModel$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                planSnapshotConverters$toProblemModel$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toProblemModel$1 planSnapshotConverters$toProblemModel$12 = planSnapshotConverters$toProblemModel$1;
                java.lang.Object obj = planSnapshotConverters$toProblemModel$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = planSnapshotConverters$toProblemModel$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    extractProblemSpecificInfo = this.Camera2StreamConfigurationMap.extractProblemSpecificInfo(planListSnapshot2);
                    if (planListSnapshot.getContextualLabel() != com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD) {
                        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter = this.getHighSpeedVideoSizes;
                        java.lang.String currencyCode = planListSnapshot.getCurrencyCode();
                        java.lang.String extractFormattedAmount = this.Camera2StreamConfigurationMap.extractFormattedAmount(planListSnapshot2);
                        if (extractFormattedAmount == null) {
                            extractFormattedAmount = "";
                        }
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money(currencyCode, extractFormattedAmount);
                        planSnapshotConverters$toProblemModel$12.getHighSpeedVideoSizes = planListSnapshot2;
                        planSnapshotConverters$toProblemModel$12.getHighResolutionOutputSizeshNQ4ISI = extractProblemSpecificInfo;
                        planSnapshotConverters$toProblemModel$12.getHighSpeedVideoFpsRangesFor = 1;
                        formatCurrency$default = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter, money, null, 0, planSnapshotConverters$toProblemModel$12, 6, null);
                        if (formatCurrency$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        str = null;
                        java.lang.String creditAccountId = planListSnapshot2.getCreditAccountId();
                        java.lang.String str2 = creditAccountId == null ? "" : creditAccountId;
                        java.lang.String extractMerchantName = this.Camera2StreamConfigurationMap.extractMerchantName(planListSnapshot2);
                        java.lang.String extractProductName = this.Camera2StreamConfigurationMap.extractProductName(planListSnapshot2);
                        int intValue = extractProblemSpecificInfo.getFirst().intValue();
                        int intValue2 = extractProblemSpecificInfo.getSecond().intValue();
                        extractProblemSpecificInfo.getThird();
                        com.paypal.oslo.core.commonui.utils.RefText fourth = extractProblemSpecificInfo.getFourth();
                        java.lang.String extractMerchantLogoUrl = this.Camera2StreamConfigurationMap.extractMerchantLogoUrl(planListSnapshot2);
                        if (planListSnapshot2.getContextualLabel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD) {
                            afterPurchasePlanType = com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.InProgress;
                        } else {
                            afterPurchasePlanType = com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.PastDue;
                        }
                        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel(str2, null, extractMerchantLogoUrl, afterPurchasePlanType, extractMerchantName, this.getHighSpeedVideoFpsRangesFor.getUIs().getPlansSection().getShouldShowProductName() ? extractProductName : null, str, fourth, new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel(intValue, intValue2), 2, null);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.Quadruple<java.lang.Integer, java.lang.Integer, java.lang.Integer, com.paypal.oslo.core.commonui.utils.RefText> quadruple = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.Quadruple) planSnapshotConverters$toProblemModel$12.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot3 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot) planSnapshotConverters$toProblemModel$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    formatCurrency$default = obj;
                    extractProblemSpecificInfo = quadruple;
                    planListSnapshot2 = planListSnapshot3;
                }
                str = (java.lang.String) formatCurrency$default;
                java.lang.String creditAccountId2 = planListSnapshot2.getCreditAccountId();
                if (creditAccountId2 == null) {
                }
                java.lang.String extractMerchantName2 = this.Camera2StreamConfigurationMap.extractMerchantName(planListSnapshot2);
                java.lang.String extractProductName2 = this.Camera2StreamConfigurationMap.extractProductName(planListSnapshot2);
                int intValue3 = extractProblemSpecificInfo.getFirst().intValue();
                int intValue22 = extractProblemSpecificInfo.getSecond().intValue();
                extractProblemSpecificInfo.getThird();
                com.paypal.oslo.core.commonui.utils.RefText fourth2 = extractProblemSpecificInfo.getFourth();
                java.lang.String extractMerchantLogoUrl2 = this.Camera2StreamConfigurationMap.extractMerchantLogoUrl(planListSnapshot2);
                if (planListSnapshot2.getContextualLabel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD) {
                }
                return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel(str2, null, extractMerchantLogoUrl2, afterPurchasePlanType, extractMerchantName2, this.getHighSpeedVideoFpsRangesFor.getUIs().getPlansSection().getShouldShowProductName() ? extractProductName2 : null, str, fourth2, new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel(intValue3, intValue22), 2, null);
            }
        }
        planSnapshotConverters$toProblemModel$1 = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toProblemModel$1(this, continuation);
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toProblemModel$1 planSnapshotConverters$toProblemModel$122 = planSnapshotConverters$toProblemModel$1;
        java.lang.Object obj2 = planSnapshotConverters$toProblemModel$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = planSnapshotConverters$toProblemModel$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        str = (java.lang.String) formatCurrency$default;
        java.lang.String creditAccountId22 = planListSnapshot2.getCreditAccountId();
        if (creditAccountId22 == null) {
        }
        java.lang.String extractMerchantName22 = this.Camera2StreamConfigurationMap.extractMerchantName(planListSnapshot2);
        java.lang.String extractProductName22 = this.Camera2StreamConfigurationMap.extractProductName(planListSnapshot2);
        int intValue32 = extractProblemSpecificInfo.getFirst().intValue();
        int intValue222 = extractProblemSpecificInfo.getSecond().intValue();
        extractProblemSpecificInfo.getThird();
        com.paypal.oslo.core.commonui.utils.RefText fourth22 = extractProblemSpecificInfo.getFourth();
        java.lang.String extractMerchantLogoUrl22 = this.Camera2StreamConfigurationMap.extractMerchantLogoUrl(planListSnapshot2);
        if (planListSnapshot2.getContextualLabel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD) {
        }
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel(str2, null, extractMerchantLogoUrl22, afterPurchasePlanType, extractMerchantName22, this.getHighSpeedVideoFpsRangesFor.getUIs().getPlansSection().getShouldShowProductName() ? extractProductName22 : null, str, fourth22, new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel(intValue32, intValue222), 2, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.CONTACTLESS_MOBILE_WALLET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.EXTERNAL_ECOMMERCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
