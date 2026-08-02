package com.paypal.oslo.feature.bnplservicing.ui.prequal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualMapper;", "", "Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;", "formatter", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;)V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationSummary;", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;", "toPreQualUiModel", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationSummary;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "amount", "", "formatSpendingPower", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PreQualMapper {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PreQualMapper(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServFormatter, "");
        this.Camera2StreamConfigurationMap = bnplServFormatter;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toPreQualUiModel(com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationSummary prequalificationSummary, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper$toPreQualUiModel$1 preQualMapper$toPreQualUiModel$1;
        int i;
        java.lang.String str;
        com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationSummary prequalificationSummary2;
        java.lang.String spendingPowerDisclaimerText;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper$toPreQualUiModel$1) {
            preQualMapper$toPreQualUiModel$1 = (com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper$toPreQualUiModel$1) continuation;
            if ((preQualMapper$toPreQualUiModel$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                preQualMapper$toPreQualUiModel$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper$toPreQualUiModel$1 preQualMapper$toPreQualUiModel$12 = preQualMapper$toPreQualUiModel$1;
                java.lang.Object obj = preQualMapper$toPreQualUiModel$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = preQualMapper$toPreQualUiModel$12.getHighSpeedVideoSizes;
                int i2 = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.Money spendingPower = prequalificationSummary.getSpendingPower();
                    if (spendingPower != null) {
                        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter = this.Camera2StreamConfigurationMap;
                        preQualMapper$toPreQualUiModel$12.getHighSpeedVideoFpsRangesFor = prequalificationSummary;
                        preQualMapper$toPreQualUiModel$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(spendingPower);
                        preQualMapper$toPreQualUiModel$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        preQualMapper$toPreQualUiModel$12.getHighSpeedVideoSizes = 1;
                        obj = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter, spendingPower, null, 0, preQualMapper$toPreQualUiModel$12, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        prequalificationSummary2 = prequalificationSummary;
                    } else {
                        str = null;
                        prequalificationSummary2 = prequalificationSummary;
                        spendingPowerDisclaimerText = prequalificationSummary2.getSpendingPowerDisclaimerText();
                        if (spendingPowerDisclaimerText == null) {
                            spendingPowerDisclaimerText = "";
                        }
                        java.lang.String str2 = spendingPowerDisclaimerText;
                        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq> faqs = prequalificationSummary2.getFaqs();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(faqs, 10));
                        for (java.lang.Object obj2 : faqs) {
                            if (i2 < 0) {
                                kotlin.collections.CollectionsKt.throwIndexOverflow();
                            }
                            com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq faq = (com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq) obj2;
                            arrayList.add(new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel.FaqItem(java.lang.String.valueOf(i2), faq.getQuestion(), faq.getAnswer(), false, 8, null));
                            i2++;
                        }
                        return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel(str, str2, arrayList, prequalificationSummary2.getLegalMessage(), prequalificationSummary2.getPreQualificationEligible(), null, 32, null);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = preQualMapper$toPreQualUiModel$12.getHighResolutionOutputSizeshNQ4ISI;
                    prequalificationSummary2 = (com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationSummary) preQualMapper$toPreQualUiModel$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                spendingPowerDisclaimerText = prequalificationSummary2.getSpendingPowerDisclaimerText();
                if (spendingPowerDisclaimerText == null) {
                }
                java.lang.String str22 = spendingPowerDisclaimerText;
                java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq> faqs2 = prequalificationSummary2.getFaqs();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(faqs2, 10));
                while (r1.hasNext()) {
                }
                return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel(str, str22, arrayList2, prequalificationSummary2.getLegalMessage(), prequalificationSummary2.getPreQualificationEligible(), null, 32, null);
            }
        }
        preQualMapper$toPreQualUiModel$1 = new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper$toPreQualUiModel$1(this, continuation);
        com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper$toPreQualUiModel$1 preQualMapper$toPreQualUiModel$122 = preQualMapper$toPreQualUiModel$1;
        java.lang.Object obj3 = preQualMapper$toPreQualUiModel$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = preQualMapper$toPreQualUiModel$122.getHighSpeedVideoSizes;
        int i22 = 0;
        if (i != 0) {
        }
        str = (java.lang.String) obj3;
        spendingPowerDisclaimerText = prequalificationSummary2.getSpendingPowerDisclaimerText();
        if (spendingPowerDisclaimerText == null) {
        }
        java.lang.String str222 = spendingPowerDisclaimerText;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq> faqs22 = prequalificationSummary2.getFaqs();
        java.util.ArrayList arrayList22 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(faqs22, 10));
        while (r1.hasNext()) {
        }
        return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel(str, str222, arrayList22, prequalificationSummary2.getLegalMessage(), prequalificationSummary2.getPreQualificationEligible(), null, 32, null);
    }

    public final java.lang.Object formatSpendingPower(com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        if (money == null) {
            return null;
        }
        java.lang.Object formatCurrency$default = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(this.Camera2StreamConfigurationMap, money, null, 0, continuation, 2, null);
        return formatCurrency$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? formatCurrency$default : (java.lang.String) formatCurrency$default;
    }
}
