package com.ingo.sdk.kotlin.common.features.location;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/location/LocationProviderImpl;", "Lcom/ingo/sdk/kotlin/common/features/location/LocationProvider;", "", "allowSimulators", "<init>", "(Z)V", "Landroid/content/Context;", "context", "", "initialize", "(Landroid/content/Context;)V", "Lcom/ingo/sdk/kotlin/common/features/location/LocationData;", "getLocationData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Z", "getAllowSimulators", "()Z", "Ljava/lang/ref/WeakReference;", "Camera2StreamConfigurationMap", "Ljava/lang/ref/WeakReference;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LocationProviderImpl implements com.ingo.sdk.kotlin.common.features.location.LocationProvider {
    private java.lang.ref.WeakReference<android.content.Context> Camera2StreamConfigurationMap;
    private final boolean allowSimulators;

    public LocationProviderImpl(boolean z) {
        this.allowSimulators = z;
    }

    public final boolean getAllowSimulators() {
        return this.allowSimulators;
    }

    public final void initialize(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging().d("Ingo", "Initializing Location Provider");
        this.Camera2StreamConfigurationMap = new java.lang.ref.WeakReference<>(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: TimeoutCancellationException -> 0x005c, TryCatch #0 {TimeoutCancellationException -> 0x005c, blocks: (B:10:0x0026, B:11:0x0048, B:15:0x004d, B:16:0x005b, B:21:0x0035), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.ingo.sdk.kotlin.common.features.location.LocationProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getLocationData(kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.location.LocationData> continuation) {
        com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$1 locationProviderImpl$getLocationData$1;
        int i;
        com.ingo.sdk.kotlin.common.features.location.LocationData locationData;
        try {
            if (continuation instanceof com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$1) {
                locationProviderImpl$getLocationData$1 = (com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$1) continuation;
                if ((locationProviderImpl$getLocationData$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    locationProviderImpl$getLocationData$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = locationProviderImpl$getLocationData$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = locationProviderImpl$getLocationData$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1 locationProviderImpl$getLocationData$locationResult$1 = new com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1(this, null);
                        locationProviderImpl$getLocationData$1.getHighSpeedVideoFpsRanges = 1;
                        obj = kotlinx.coroutines.TimeoutKt.withTimeout(com.google.android.gms.location.DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, locationProviderImpl$getLocationData$locationResult$1, locationProviderImpl$getLocationData$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    locationData = (com.ingo.sdk.kotlin.common.features.location.LocationData) obj;
                    if (locationData == null) {
                        return locationData;
                    }
                    throw new com.ingo.sdk.kotlin.common.features.location.LocationDataException(new java.lang.Exception("Could Not Get Location"));
                }
            }
            if (i != 0) {
            }
            locationData = (com.ingo.sdk.kotlin.common.features.location.LocationData) obj;
            if (locationData == null) {
            }
        } catch (kotlinx.coroutines.TimeoutCancellationException e) {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Timed Out Getting Location", null, e, 2, null);
            throw new com.ingo.sdk.kotlin.common.features.location.LocationDataException(new java.lang.Exception("Timed Out Getting Location"));
        }
        locationProviderImpl$getLocationData$1 = new com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$1(this, continuation);
        java.lang.Object obj2 = locationProviderImpl$getLocationData$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = locationProviderImpl$getLocationData$1.getHighSpeedVideoFpsRanges;
    }
}
