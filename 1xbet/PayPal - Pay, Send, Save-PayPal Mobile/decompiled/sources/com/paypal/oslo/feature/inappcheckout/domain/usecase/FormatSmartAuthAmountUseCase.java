package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatSmartAuthAmountUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "entity", "invoke", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormatSmartAuthAmountUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public FormatSmartAuthAmountUseCase(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = formatCurrencyUseCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0148 -> B:10:0x014e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity> continuation) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase$invoke$1 formatSmartAuthAmountUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity2;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        int i2;
        int i3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument;
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument copy;
        com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase formatSmartAuthAmountUseCase = this;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase$invoke$1) {
            formatSmartAuthAmountUseCase$invoke$1 = (com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase$invoke$1) continuation;
            if ((formatSmartAuthAmountUseCase$invoke$1.isOutputSupportedForhNQ4ISI & Integer.MIN_VALUE) != 0) {
                formatSmartAuthAmountUseCase$invoke$1.isOutputSupportedForhNQ4ISI -= 2147483648;
                java.lang.Object obj3 = formatSmartAuthAmountUseCase$invoke$1.toString;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = formatSmartAuthAmountUseCase$invoke$1.isOutputSupportedForhNQ4ISI;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> fundingInstruments = fundingSelectionEntity.getFundingInstruments();
                    fundingSelectionEntity2 = fundingSelectionEntity;
                    obj = fundingInstruments;
                    obj2 = obj;
                    arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fundingInstruments, 10));
                    it = fundingInstruments.iterator();
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = formatSmartAuthAmountUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    i2 = formatSmartAuthAmountUseCase$invoke$1.Camera2StreamConfigurationMap;
                    i3 = formatSmartAuthAmountUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    ?? r8 = (java.util.Collection) formatSmartAuthAmountUseCase$invoke$1.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) formatSmartAuthAmountUseCase$invoke$1.getOutputSizes;
                    java.lang.Object obj4 = formatSmartAuthAmountUseCase$invoke$1.getOutputStallDuration;
                    it = (java.util.Iterator) formatSmartAuthAmountUseCase$invoke$1.getOutputMinFrameDuration;
                    ?? r11 = (java.util.Collection) formatSmartAuthAmountUseCase$invoke$1.getInputFormats;
                    java.lang.Object obj5 = (java.lang.Iterable) formatSmartAuthAmountUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    java.lang.Object obj6 = (java.lang.Iterable) formatSmartAuthAmountUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity3 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity) formatSmartAuthAmountUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    java.lang.Object obj7 = obj6;
                    com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity4 = fundingSelectionEntity3;
                    boolean z2 = true;
                    java.lang.Object obj8 = obj5;
                    com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument3 = fundingInstrument2;
                    arrayList = r11;
                    java.util.ArrayList arrayList2 = r8;
                    java.lang.String str = (java.lang.String) ((arrow.core.Either) obj3).getOrNull();
                    if (str == null) {
                        copy = fundingInstrument3.copy((r30 & 1) != 0 ? fundingInstrument3.id : null, (r30 & 2) != 0 ? fundingInstrument3.type : null, (r30 & 4) != 0 ? fundingInstrument3.label : null, (r30 & 8) != 0 ? fundingInstrument3.imageUrl : null, (r30 & 16) != 0 ? fundingInstrument3.usability : null, (r30 & 32) != 0 ? fundingInstrument3.contingency : null, (r30 & 64) != 0 ? fundingInstrument3.lastDigits : null, (r30 & 128) != 0 ? fundingInstrument3.bankSubtype : null, (r30 & 256) != 0 ? fundingInstrument3.cardSubtype : null, (r30 & 512) != 0 ? fundingInstrument3.cardBrand : null, (r30 & 1024) != 0 ? fundingInstrument3.creditOffer : null, (r30 & 2048) != 0 ? fundingInstrument3.smartAuthAmount : null, (r30 & 4096) != 0 ? fundingInstrument3.contingencies : null, (r30 & 8192) != 0 ? fundingInstrument3.formattedSmartAuthAmount : str);
                        fundingInstrument = copy;
                    } else {
                        fundingInstrument = fundingInstrument3;
                    }
                    obj = obj8;
                    obj2 = obj7;
                    java.util.ArrayList arrayList3 = arrayList;
                    arrayList = arrayList2;
                    fundingSelectionEntity2 = fundingSelectionEntity4;
                    arrayList.add(fundingInstrument);
                    formatSmartAuthAmountUseCase = this;
                    arrayList = arrayList3;
                    z = z2;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        fundingInstrument = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) next;
                        com.paypal.oslo.feature.inappcheckout.domain.entity.SmartAuthAmount smartAuthRawAmount = fundingInstrument.getSmartAuthRawAmount();
                        if (smartAuthRawAmount == null) {
                            z2 = z;
                            arrayList3 = arrayList;
                        } else {
                            java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(smartAuthRawAmount.getAmount());
                            if (bigDecimalOrNull != null) {
                                try {
                                } catch (java.lang.Throwable th) {
                                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                }
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase formatSmartAuthAmountUseCase2 = formatSmartAuthAmountUseCase;
                                m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11383boximpl(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(smartAuthRawAmount.getCurrencyCode())));
                                if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                    m23436constructorimpl = null;
                                }
                                com.paypal.oslo.core.i18n.domain.model.CurrencyCode currencyCode = (com.paypal.oslo.core.i18n.domain.model.CurrencyCode) m23436constructorimpl;
                                java.lang.String m11389unboximpl = currencyCode != null ? currencyCode.m11389unboximpl() : null;
                                if (m11389unboximpl != null) {
                                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(m11389unboximpl, com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL, 0, null, null, 28, null);
                                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = formatSmartAuthAmountUseCase.getHighSpeedVideoFpsRangesFor;
                                    formatSmartAuthAmountUseCase$invoke$1.getHighSpeedVideoSizes = fundingSelectionEntity2;
                                    formatSmartAuthAmountUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                                    formatSmartAuthAmountUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    formatSmartAuthAmountUseCase$invoke$1.getInputFormats = arrayList;
                                    formatSmartAuthAmountUseCase$invoke$1.getOutputMinFrameDuration = it;
                                    formatSmartAuthAmountUseCase$invoke$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                                    formatSmartAuthAmountUseCase$invoke$1.getOutputSizes = fundingInstrument;
                                    formatSmartAuthAmountUseCase$invoke$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimalOrNull);
                                    formatSmartAuthAmountUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(smartAuthRawAmount);
                                    formatSmartAuthAmountUseCase$invoke$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11389unboximpl);
                                    formatSmartAuthAmountUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyConfiguration);
                                    formatSmartAuthAmountUseCase$invoke$1.getInputSizeshNQ4ISI = arrayList;
                                    formatSmartAuthAmountUseCase$invoke$1.getHighSpeedVideoFpsRanges = i3;
                                    formatSmartAuthAmountUseCase$invoke$1.Camera2StreamConfigurationMap = i2;
                                    formatSmartAuthAmountUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                    z2 = true;
                                    formatSmartAuthAmountUseCase$invoke$1.isOutputSupportedForhNQ4ISI = 1;
                                    obj3 = formatCurrencyUseCase.invoke(bigDecimalOrNull, currencyConfiguration, formatSmartAuthAmountUseCase$invoke$1);
                                    if (obj3 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    fundingSelectionEntity4 = fundingSelectionEntity2;
                                    arrayList2 = arrayList;
                                    obj8 = obj;
                                    obj7 = obj2;
                                    fundingInstrument3 = fundingInstrument;
                                    java.lang.String str2 = (java.lang.String) ((arrow.core.Either) obj3).getOrNull();
                                    if (str2 == null) {
                                    }
                                    obj = obj8;
                                    obj2 = obj7;
                                    java.util.ArrayList arrayList32 = arrayList;
                                    arrayList = arrayList2;
                                    fundingSelectionEntity2 = fundingSelectionEntity4;
                                }
                            }
                            z2 = true;
                            arrayList32 = arrayList;
                        }
                        arrayList.add(fundingInstrument);
                        formatSmartAuthAmountUseCase = this;
                        arrayList = arrayList32;
                        z = z2;
                        if (it.hasNext()) {
                            return com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity.copy$default(fundingSelectionEntity2, arrayList, null, null, false, 14, null);
                        }
                    }
                }
            }
        }
        formatSmartAuthAmountUseCase$invoke$1 = new com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase$invoke$1(formatSmartAuthAmountUseCase, continuation);
        java.lang.Object obj32 = formatSmartAuthAmountUseCase$invoke$1.toString;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = formatSmartAuthAmountUseCase$invoke$1.isOutputSupportedForhNQ4ISI;
        boolean z3 = true;
        if (i != 0) {
        }
    }
}
