package com.paypal.oslo.feature.cashin.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cashin/data/repository/HardcodedLocationRepository;", "Lcom/paypal/oslo/feature/cashin/domain/repository/LocationRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "getUserLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "", "getLocations", "()Lkotlinx/coroutines/flow/Flow;", "", "id", "getLocationById", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HardcodedLocationRepository implements com.paypal.oslo.feature.cashin.domain.repository.LocationRepository {
    public static final java.lang.String SAN_FRANCISCO_CITY_KEY = "San Francisco";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cashin.domain.model.CashInStore getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.cashin.domain.model.CashInStore("user", "My Location", "", "", new com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress("", "", "", ""), new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(37.7749d, -122.4194d), null, null, null, null, 960, null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public HardcodedLocationRepository() {
        java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cashin.domain.model.CashInStore[]{new com.paypal.oslo.feature.cashin.domain.model.CashInStore("store1", "7-Eleven Downtown", "", "", new com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress("123 Market St", SAN_FRANCISCO_CITY_KEY, "CA", "94105"), new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(37.7757d, -122.418d), "$4.95 fee", "350 m", null, null, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, null), new com.paypal.oslo.feature.cashin.domain.model.CashInStore("store2", "CVS", "", "", new com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress("601 Mission St", SAN_FRANCISCO_CITY_KEY, "CA", "94105-3503"), new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(37.7785d, -122.415d), "$3.95 fee", "600 m", null, null, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, null), new com.paypal.oslo.feature.cashin.domain.model.CashInStore("store3", "Walgreens", "", "", new com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress("789 Market St", SAN_FRANCISCO_CITY_KEY, "CA", "94103"), new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(37.78d, -122.412d), "$2.95 fee", "850 m", null, null, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, null), new com.paypal.oslo.feature.cashin.domain.model.CashInStore("atm1", "PayPal ATM - Union Square", "", "", new com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress("333 Post St", SAN_FRANCISCO_CITY_KEY, "CA", "94108"), new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(37.788d, -122.4074d), "$0.50 fee", "1.2 km", null, null, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, null), new com.paypal.oslo.feature.cashin.domain.model.CashInStore("atm2", "PayPal ATM - Financial District", "", "", new com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress("555 Montgomery St", SAN_FRANCISCO_CITY_KEY, "CA", "94111"), new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(37.794d, -122.4025d), "$1.00 fee", "1.5 km", null, null, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, null), new com.paypal.oslo.feature.cashin.domain.model.CashInStore("bank1", "PayPal Partner Bank", "", "", new com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress("100 California St", SAN_FRANCISCO_CITY_KEY, "CA", "94111"), new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(37.793d, -122.398d), "$3.15 fee", "1.8 km", null, null, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, null)});
        this.getHighResolutionOutputSizeshNQ4ISI = listOf;
        this.getHighSpeedVideoSizes = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(listOf);
    }

    @Override // com.paypal.oslo.feature.cashin.domain.repository.LocationRepository
    public final java.lang.Object getUserLocation(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore> continuation) {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.paypal.oslo.feature.cashin.domain.repository.LocationRepository
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>> getLocations() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.paypal.oslo.feature.cashin.domain.repository.LocationRepository
    public final java.lang.Object getLocationById(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore> continuation) {
        for (java.lang.Object obj : this.getHighResolutionOutputSizeshNQ4ISI) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cashin.domain.model.CashInStore) obj).getId(), str)) {
                return obj;
            }
        }
        return null;
    }
}
