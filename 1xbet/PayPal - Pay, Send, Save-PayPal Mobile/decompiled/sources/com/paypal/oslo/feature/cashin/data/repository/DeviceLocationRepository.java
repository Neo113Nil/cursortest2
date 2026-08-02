package com.paypal.oslo.feature.cashin.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/cashin/data/repository/DeviceLocationRepository;", "Lcom/paypal/oslo/feature/cashin/domain/repository/LocationRepository;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "getUserLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "", "getLocations", "()Lkotlinx/coroutines/flow/Flow;", "", "id", "getLocationById", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceLocationRepository implements com.paypal.oslo.feature.cashin.domain.repository.LocationRepository {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @Override // com.paypal.oslo.feature.cashin.domain.repository.LocationRepository
    public final java.lang.Object getLocationById(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore> continuation) {
        return null;
    }

    @javax.inject.Inject
    public DeviceLocationRepository(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context;
    }

    @Override // com.paypal.oslo.feature.cashin.domain.repository.LocationRepository
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>> getLocations() {
        return kotlinx.coroutines.flow.FlowKt.flowOf(kotlin.collections.CollectionsKt.emptyList());
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository$getUserLocation$2$listener$1] */
    @Override // com.paypal.oslo.feature.cashin.domain.repository.LocationRepository
    public final java.lang.Object getUserLocation(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        java.lang.Object systemService = this.Camera2StreamConfigurationMap.getSystemService("location");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        final android.location.LocationManager locationManager = (android.location.LocationManager) systemService;
        java.lang.String str = "gps";
        if (!locationManager.isProviderEnabled("gps")) {
            str = "network";
            if (!locationManager.isProviderEnabled("network")) {
                str = null;
            }
        }
        if (str == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(access$getFallbackLocation(this)));
        } else {
            android.location.Location lastKnownLocation = locationManager.getLastKnownLocation(str);
            if (lastKnownLocation != null) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(access$locationToStore(this, lastKnownLocation)));
            } else {
                final ?? r4 = new android.location.LocationListener() { // from class: com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository$getUserLocation$2$listener$1
                    @Override // android.location.LocationListener
                    public final void onLocationChanged(android.location.Location location) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "");
                        locationManager.removeUpdates(this);
                        kotlinx.coroutines.CancellableContinuation<com.paypal.oslo.feature.cashin.domain.model.CashInStore> cancellableContinuation = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository.access$locationToStore(this, location)));
                    }

                    @Override // android.location.LocationListener
                    public final void onProviderDisabled(java.lang.String provider) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
                        locationManager.removeUpdates(this);
                        kotlinx.coroutines.CancellableContinuation<com.paypal.oslo.feature.cashin.domain.model.CashInStore> cancellableContinuation = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository.access$getFallbackLocation(this)));
                    }

                    @Override // android.location.LocationListener
                    public final void onProviderEnabled(java.lang.String provider) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
                    }
                };
                cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository$getUserLocation$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                        locationManager.removeUpdates(r4);
                        return kotlin.Unit.INSTANCE;
                    }
                });
                locationManager.requestSingleUpdate(str, (android.location.LocationListener) r4, android.os.Looper.getMainLooper());
            }
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.cashin.domain.model.CashInStore access$getFallbackLocation(com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository deviceLocationRepository) {
        return new com.paypal.oslo.feature.cashin.domain.model.CashInStore("user", "My Location", "", "", new com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress("", "", "", ""), new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(30.3515d, -97.7553d), null, null, null, null, 960, null);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.cashin.domain.model.CashInStore access$locationToStore(com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository deviceLocationRepository, android.location.Location location) {
        return new com.paypal.oslo.feature.cashin.domain.model.CashInStore("user", "My Location", "", "", new com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress("", "", "", ""), new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(location.getLatitude(), location.getLongitude()), null, null, null, null, 960, null);
    }
}
