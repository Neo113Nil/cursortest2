package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockFinancialActivityRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/FinancialActivityRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/ActivitiesOverviewRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/FinancialActivitiesRequestError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/FinancialActivitiesOverview;", "getActivitiesOverview", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/ActivitiesOverviewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/ActivitiesRequest;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/activities/FinancialActivitiesPage;", "getActivitiesPage", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/ActivitiesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/activities/FinancialActivitiesPage;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/FinancialActivitiesOverview;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MockFinancialActivityRepositoryImpl implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository {

    @java.lang.Deprecated
    public static final long DELAY = 1000;

    @java.lang.Deprecated
    public static final int FAKE_OFFSET = 10000;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public MockFinancialActivityRepositoryImpl() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "123.45");
        java.time.Instant anyToInstantOrNull = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull("2025-10-21T08:37:00+00:00");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PURCHASE;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage("https://companieslogo.com/img/orig/WMT-0d8ecd74.png", null);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity transactionActivity = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity("completed-purchase-10", activityType, currencyAmount, anyToInstantOrNull, creditImage, "Walmart", bool, "3.00", "Walmart", null);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage financialActivitiesPage = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity[]{transactionActivity, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity("completed-payment-12", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PAYMENT, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "33.45"), com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull("2025-10-23T08:37:00+00:00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage("https://companieslogo.com/img/orig/PYPL-3570673e.png", null), "Payment", bool, null, "Payment", null), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity("completed-refund-13", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.REFUND, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "243.00"), com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull("2025-10-23T08:37:00+00:00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage("https://companieslogo.com/img/orig/temu-642bfc59.png", null), "Temu", bool, null, "Temu", null), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity("completed-purchase-24", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PURCHASE, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1752.00"), com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull("2025-10-27T08:37:00+00:00"), null, "Whole Foods", bool, "1.50", "Whole Foods", null)}), 10000, true);
        this.getHighSpeedVideoFpsRanges = financialActivitiesPage;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity("scheduled-payment-123", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.SCHEDULED, bool, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.UPCOMING, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "2423.00"), com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull("2025-10-21T08:37:00+00:00"), com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull("2025-10-23T08:37:00+00:00"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel.CUSTOMER_SERVICE, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument("Wells Fargo", "1234", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType.BANK, null))));
        java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity[]{new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity("pending-activity-1", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PURCHASE, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1234.56"), com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull("2025-10-21T08:37:00+00:00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage(null, null), "Whole Foods", bool2, null, "Payment", "BRN1234"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity("pending-payment-2", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PAYMENT, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "7282.25"), com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull("2025-10-23T08:37:00+00:00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage("https://companieslogo.com/img/orig/PYPL-3570673e.png", null), "Payment", bool2, null, "Payment", "BRN1234"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity("completed-purchase-1", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PURCHASE, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "2403.00"), com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull("2025-10-27T08:37:00+00:00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage("https://companieslogo.com/img/orig/PYPL-3570673e.png", null), "Walmart", bool, null, "Walmart", "BRN1234"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity("completed-payment-1", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PAYMENT, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "-728.25"), com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull("2025-10-23T08:37:00+00:00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage("https://companieslogo.com/img/orig/PYPL-3570673e.png", null), "Payment", bool, null, "Payment", null), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity("completed-refund-1", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.REFUND, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "24.00"), com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull("2025-10-27T08:37:00+00:00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage("https://companieslogo.com/img/orig/PYPL-3570673e.png", null), "Temu", bool, null, "Temu", "BRN124"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity("completed-purchase-2", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PURCHASE, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "5.00"), com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull("2025-10-27T08:37:00+00:00"), null, "Whole Foods", bool, null, "Whole Foods", "BRN1234EF")});
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> creditActivities = financialActivitiesPage.getCreditActivities();
        this.getHighSpeedVideoSizes = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview(listOf, kotlin.collections.CollectionsKt.plus((java.util.Collection) listOf2, (java.lang.Iterable) (creditActivities == null ? kotlin.collections.CollectionsKt.emptyList() : creditActivities)), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber("8882211161", 1, ""), "Monday - Friday: 6 AM - 6 PM PT", "Saturday - Sunday: 6 AM - 4:30 PM PT", "PayPal Credit", "P.O. Box 45950", "Omaha, NE 68145-0950", "PayPal Credit"), 10000, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getActivitiesOverview(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest activitiesOverviewRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl$getActivitiesOverview$1 mockFinancialActivityRepositoryImpl$getActivitiesOverview$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl$getActivitiesOverview$1) {
            mockFinancialActivityRepositoryImpl$getActivitiesOverview$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl$getActivitiesOverview$1) continuation;
            if ((mockFinancialActivityRepositoryImpl$getActivitiesOverview$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mockFinancialActivityRepositoryImpl$getActivitiesOverview$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mockFinancialActivityRepositoryImpl$getActivitiesOverview$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockFinancialActivityRepositoryImpl$getActivitiesOverview$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockFinancialActivityRepositoryImpl$getActivitiesOverview$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activitiesOverviewRequest);
                    mockFinancialActivityRepositoryImpl$getActivitiesOverview$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1000L, mockFinancialActivityRepositoryImpl$getActivitiesOverview$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return arrow.core.IorKt.rightIor(this.getHighSpeedVideoSizes);
            }
        }
        mockFinancialActivityRepositoryImpl$getActivitiesOverview$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl$getActivitiesOverview$1(this, continuation);
        java.lang.Object obj2 = mockFinancialActivityRepositoryImpl$getActivitiesOverview$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockFinancialActivityRepositoryImpl$getActivitiesOverview$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return arrow.core.IorKt.rightIor(this.getHighSpeedVideoSizes);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getActivitiesPage(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest activitiesRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl$getActivitiesPage$1 mockFinancialActivityRepositoryImpl$getActivitiesPage$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl$getActivitiesPage$1) {
            mockFinancialActivityRepositoryImpl$getActivitiesPage$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl$getActivitiesPage$1) continuation;
            if ((mockFinancialActivityRepositoryImpl$getActivitiesPage$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                mockFinancialActivityRepositoryImpl$getActivitiesPage$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = mockFinancialActivityRepositoryImpl$getActivitiesPage$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockFinancialActivityRepositoryImpl$getActivitiesPage$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockFinancialActivityRepositoryImpl$getActivitiesPage$1.getHighResolutionOutputSizeshNQ4ISI = activitiesRequest;
                    mockFinancialActivityRepositoryImpl$getActivitiesPage$1.getHighSpeedVideoSizes = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1000L, mockFinancialActivityRepositoryImpl$getActivitiesPage$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    activitiesRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest) mockFinancialActivityRepositoryImpl$getActivitiesPage$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return activitiesRequest.getOffset() >= 10000 ? arrow.core.IorKt.rightIor(this.getHighSpeedVideoFpsRanges) : arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError.Default.INSTANCE);
            }
        }
        mockFinancialActivityRepositoryImpl$getActivitiesPage$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl$getActivitiesPage$1(this, continuation);
        java.lang.Object obj2 = mockFinancialActivityRepositoryImpl$getActivitiesPage$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockFinancialActivityRepositoryImpl$getActivitiesPage$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        if (activitiesRequest.getOffset() >= 10000) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockFinancialActivityRepositoryImpl$Companion;", "", "<init>", "()V", "", "DELAY", "J", "", "FAKE_OFFSET", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
