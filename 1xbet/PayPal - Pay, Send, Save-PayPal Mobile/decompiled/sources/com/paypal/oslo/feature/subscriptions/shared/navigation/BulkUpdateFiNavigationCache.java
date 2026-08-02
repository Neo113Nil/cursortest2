package com.paypal.oslo.feature.subscriptions.shared.navigation;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0015\u0010\nJ\u0019\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0003R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR(\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00040\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;", "", "<init>", "()V", "", "", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "map", "", "setAgreementsMap", "(Ljava/util/Map;)V", "getAgreementsMap", "()Ljava/util/Map;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/BulkUpdateFiResult;", "result", "setUpdateResult", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/BulkUpdateFiResult;)V", "getUpdateResult", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/BulkUpdateFiResult;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "fundingInstruments", "setSelectedFundingInstruments", "getSelectedFundingInstruments", "clearAll", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BulkUpdateFiNavigationCache {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel>> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>(null);
    private final java.util.concurrent.atomic.AtomicReference<java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel>> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>(null);

    @javax.inject.Inject
    public BulkUpdateFiNavigationCache() {
    }

    public final void setAgreementsMap(java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoFpsRanges.set(map);
    }

    public final java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> getAgreementsMap() {
        java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> map = this.getHighSpeedVideoFpsRanges.get();
        return map == null ? kotlin.collections.MapsKt.emptyMap() : map;
    }

    public final void setUpdateResult(com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        this.getHighSpeedVideoFpsRangesFor.set(result);
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult getUpdateResult() {
        return this.getHighSpeedVideoFpsRangesFor.get();
    }

    public final void setSelectedFundingInstruments(final java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel> fundingInstruments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
        this.Camera2StreamConfigurationMap.updateAndGet(new java.util.function.UnaryOperator() { // from class: com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache.$r8$lambda$oFJip5hxdQ9XReTruVXfqbHCR3Y(fundingInstruments, (java.util.Map) obj);
            }
        });
    }

    public final java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel> getSelectedFundingInstruments() {
        java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel> map = this.Camera2StreamConfigurationMap.get();
        return map == null ? kotlin.collections.MapsKt.emptyMap() : map;
    }

    public final void clearAll() {
        this.getHighSpeedVideoFpsRanges.set(null);
        this.getHighSpeedVideoFpsRangesFor.set(null);
        this.Camera2StreamConfigurationMap.set(null);
    }

    public static /* synthetic */ java.util.Map $r8$lambda$oFJip5hxdQ9XReTruVXfqbHCR3Y(java.util.Map map, java.util.Map map2) {
        if (map2 == null) {
            map2 = kotlin.collections.MapsKt.emptyMap();
        }
        return kotlin.collections.MapsKt.plus(map2, map);
    }
}
