package com.paypal.oslo.feature.businesshome.data.repository.mock;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/data/repository/mock/DemoMerchantInsightsRepository;", "Lcom/paypal/oslo/feature/businesshome/domain/repository/MerchantInsightsRepository;", "<init>", "()V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsights;", "getMerchantInsights", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "p1", "getHighSpeedVideoFpsRanges", "(II)Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsights;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DemoMerchantInsightsRepository implements com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI = 5;

    @javax.inject.Inject
    public DemoMerchantInsightsRepository() {
    }

    @Override // com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository
    public final java.lang.Object getMerchantInsights(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError, com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights>> continuation) {
        com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights merchantInsights;
        if (com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.INSTANCE.getSimulateMerchantInsightsError()) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError.NetworkError.INSTANCE);
        }
        boolean showPipBadge = com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.INSTANCE.getShowPipBadge();
        switch (com.paypal.oslo.feature.businesshome.data.repository.mock.DemoMerchantInsightsRepository.WhenMappings.$EnumSwitchMapping$0[com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.INSTANCE.getInFocusScenario().ordinal()]) {
            case 1:
                merchantInsights = new com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights(new com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics(0, new com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics(0, new com.paypal.oslo.core.money.Money(0L, "USD"), 0, false, null, kotlin.collections.CollectionsKt.emptyList()), new com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics(0, new com.paypal.oslo.core.money.Money(0L, "USD"), 0, false, null, kotlin.collections.CollectionsKt.emptyList())), new com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics(0, 0));
                break;
            case 2:
                com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics disputeMetrics = new com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics(1, showPipBadge ? 1 : 0);
                com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics = new com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics(1, new com.paypal.oslo.core.money.Money(5000L, "USD"), showPipBadge ? 1 : 0, false, new com.paypal.oslo.feature.businesshome.domain.model.Activity("id-1", com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType.INVOICE), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.businesshome.domain.model.CounterParty("Alice Brown", "https://www.paypalobjects.com/webstatic/mktg/logo/pp_cc_mark_111x69.jpg")));
                com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics2 = new com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics(1, new com.paypal.oslo.core.money.Money(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.DELAY, "USD"), 0, false, new com.paypal.oslo.feature.businesshome.domain.model.Activity("id-2", com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType.MONEY_REQUEST), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.businesshome.domain.model.CounterParty("Bob Smith", null)));
                merchantInsights = new com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights(new com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics(pendingPaymentMetrics.getTotalCount() + pendingPaymentMetrics2.getTotalCount() + this.getHighResolutionOutputSizeshNQ4ISI, pendingPaymentMetrics, pendingPaymentMetrics2), disputeMetrics);
                break;
            case 3:
                merchantInsights = getHighSpeedVideoFpsRanges(2, showPipBadge ? 1 : 0);
                break;
            case 4:
                merchantInsights = getHighSpeedVideoFpsRanges(3, showPipBadge ? 1 : 0);
                break;
            case 5:
                merchantInsights = getHighSpeedVideoFpsRanges(4, showPipBadge ? 1 : 0);
                break;
            case 6:
                merchantInsights = getHighSpeedVideoFpsRanges(11, showPipBadge ? 1 : 0);
                break;
            case 7:
                merchantInsights = getHighSpeedVideoFpsRanges(12, showPipBadge ? 1 : 0);
                break;
            case 8:
                merchantInsights = getHighSpeedVideoFpsRanges(151, showPipBadge ? 1 : 0);
                break;
            case 9:
                com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics disputeMetrics2 = new com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics(2, showPipBadge ? 2 : 0);
                com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics3 = new com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics(5, new com.paypal.oslo.core.money.Money(25000L, "USD"), showPipBadge ? 1 : 0, false, null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businesshome.domain.model.CounterParty[]{new com.paypal.oslo.feature.businesshome.domain.model.CounterParty("Alice Brown", null), new com.paypal.oslo.feature.businesshome.domain.model.CounterParty("Carlos Davis", null), new com.paypal.oslo.feature.businesshome.domain.model.CounterParty("Eva Foster", null), new com.paypal.oslo.feature.businesshome.domain.model.CounterParty("George Hill", null), new com.paypal.oslo.feature.businesshome.domain.model.CounterParty("Isabel Jones", null)}));
                com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics4 = new com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics(2, new com.paypal.oslo.core.money.Money(7500L, "USD"), 0, false, null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businesshome.domain.model.CounterParty[]{new com.paypal.oslo.feature.businesshome.domain.model.CounterParty("George Hill", null), new com.paypal.oslo.feature.businesshome.domain.model.CounterParty("Isabel Jones", null)}));
                merchantInsights = new com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights(new com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics(pendingPaymentMetrics3.getTotalCount() + pendingPaymentMetrics4.getTotalCount() + this.getHighResolutionOutputSizeshNQ4ISI, pendingPaymentMetrics3, pendingPaymentMetrics4), disputeMetrics2);
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return arrow.core.EitherKt.right(merchantInsights);
    }

    private final com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights getHighSpeedVideoFpsRanges(int p0, int p1) {
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(1, p0);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.paypal.oslo.feature.businesshome.domain.model.CounterParty("Customer ".concat(java.lang.String.valueOf(((kotlin.collections.IntIterator) it).nextInt())), null));
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics disputeMetrics = new com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics(2, com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.INSTANCE.getShowPipBadge() ? 2 : 0);
        long j = p0;
        com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics = new com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics(p0, new com.paypal.oslo.core.money.Money(1000 * j, "USD"), p1, false, null, arrayList2);
        com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics2 = new com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics(p0, new com.paypal.oslo.core.money.Money(j * 500, "USD"), 0, false, null, arrayList2);
        return new com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights(new com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics(pendingPaymentMetrics.getTotalCount() + pendingPaymentMetrics2.getTotalCount() + this.getHighResolutionOutputSizeshNQ4ISI, pendingPaymentMetrics, pendingPaymentMetrics2), disputeMetrics);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario.Empty.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario.Single.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario.Two.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario.Three.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario.Four.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario.Eleven.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario.Twelve.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario.OverMaxDisplay.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.featureflags.mock.BusinessHomeMockController.InFocusScenario.Default.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
