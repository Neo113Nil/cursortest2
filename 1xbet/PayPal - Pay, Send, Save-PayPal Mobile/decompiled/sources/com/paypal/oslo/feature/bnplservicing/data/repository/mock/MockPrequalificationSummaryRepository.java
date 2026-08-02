package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\r\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@¢\u0006\u0004\b\r\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockPrequalificationSummaryRepository;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PrequalificationSummaryRepository;", "<init>", "()V", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifiers", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationSummary;", "getPrequalificationSummary", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationAmount;", "getPrequalificationAmount", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockPrequalificationSummaryRepository implements com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockPrequalificationSummaryRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPrequalificationSummary(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationSummary>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository$getPrequalificationSummary$1 mockPrequalificationSummaryRepository$getPrequalificationSummary$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository$getPrequalificationSummary$1) {
            mockPrequalificationSummaryRepository$getPrequalificationSummary$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository$getPrequalificationSummary$1) continuation;
            if ((mockPrequalificationSummaryRepository$getPrequalificationSummary$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mockPrequalificationSummaryRepository$getPrequalificationSummary$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mockPrequalificationSummaryRepository$getPrequalificationSummary$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockPrequalificationSummaryRepository$getPrequalificationSummary$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockPrequalificationSummaryRepository$getPrequalificationSummary$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    mockPrequalificationSummaryRepository$getPrequalificationSummary$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockPrequalificationSummaryRepository$getPrequalificationSummary$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationSummary(new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "1500.00"), null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq[]{new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq("What is pre-approved credit?", "Pre-approved credit is an amount you're eligible to borrow for purchases using PayPal Pay Later."), new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq("How can I use my pre-approved credit?", "You can use your pre-approved credit at checkout when shopping online or in-store with participating merchants."), new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq("Does this affect my credit score?", "Checking your pre-approved amount won't affect your credit score. Only accepting an offer may impact your score.")}), null, false, 26, null));
            }
        }
        mockPrequalificationSummaryRepository$getPrequalificationSummary$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository$getPrequalificationSummary$1(this, continuation);
        java.lang.Object obj2 = mockPrequalificationSummaryRepository$getPrequalificationSummary$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockPrequalificationSummaryRepository$getPrequalificationSummary$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationSummary(new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "1500.00"), null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq[]{new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq("What is pre-approved credit?", "Pre-approved credit is an amount you're eligible to borrow for purchases using PayPal Pay Later."), new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq("How can I use my pre-approved credit?", "You can use your pre-approved credit at checkout when shopping online or in-store with participating merchants."), new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq("Does this affect my credit score?", "Checking your pre-approved amount won't affect your credit score. Only accepting an offer may impact your score.")}), null, false, 26, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPrequalificationAmount(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository$getPrequalificationAmount$1 mockPrequalificationSummaryRepository$getPrequalificationAmount$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository$getPrequalificationAmount$1) {
            mockPrequalificationSummaryRepository$getPrequalificationAmount$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository$getPrequalificationAmount$1) continuation;
            if ((mockPrequalificationSummaryRepository$getPrequalificationAmount$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                mockPrequalificationSummaryRepository$getPrequalificationAmount$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = mockPrequalificationSummaryRepository$getPrequalificationAmount$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockPrequalificationSummaryRepository$getPrequalificationAmount$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockPrequalificationSummaryRepository$getPrequalificationAmount$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    mockPrequalificationSummaryRepository$getPrequalificationAmount$1.getHighSpeedVideoFpsRanges = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockPrequalificationSummaryRepository$getPrequalificationAmount$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount(new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "2000.00"), false, null, null, 14, null));
            }
        }
        mockPrequalificationSummaryRepository$getPrequalificationAmount$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository$getPrequalificationAmount$1(this, continuation);
        java.lang.Object obj2 = mockPrequalificationSummaryRepository$getPrequalificationAmount$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockPrequalificationSummaryRepository$getPrequalificationAmount$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount(new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "2000.00"), false, null, null, 14, null));
    }
}
