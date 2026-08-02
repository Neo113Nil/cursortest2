package com.ingo.sdk.kotlin.common.features.location;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/ingo/sdk/kotlin/common/features/location/LocationData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1", f = "LocationProviderImpl.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class LocationProviderImpl$getLocationData$locationResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.location.LocationData>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/ingo/sdk/kotlin/common/features/location/LocationData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1$1", f = "LocationProviderImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.ingo.sdk.kotlin.common.features.location.LocationData>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl getHighSpeedVideoSizes;

        /* JADX WARN: Type inference failed for: r10v0, types: [com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1$1$locationCallback$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.ref.WeakReference weakReference;
            java.lang.ref.WeakReference weakReference2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
                weakReference = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
                if (context != null) {
                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "requesting updated location", null, 2, null);
                    final long systemTime = com.ingo.sdk.kotlin.common.analytics.SystemTimeKt.systemTime();
                    android.content.pm.PackageManager packageManager = context.getPackageManager();
                    java.lang.Object systemService = context.getSystemService("location");
                    kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
                    android.location.LocationManager locationManager = (android.location.LocationManager) systemService;
                    if (!packageManager.hasSystemFeature("android.hardware.location.gps")) {
                        throw new com.ingo.sdk.kotlin.common.features.location.LocationDataException(new java.lang.IllegalArgumentException("Device does not have PackageManager.FEATURE_LOCATION_GPS"));
                    }
                    java.util.List<java.lang.String> allProviders = locationManager.getAllProviders();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allProviders, "");
                    if (!allProviders.contains("gps")) {
                        throw new com.ingo.sdk.kotlin.common.features.location.LocationDataException(new java.lang.IllegalArgumentException("LocationManager does not list GPS_PROVIDER. Assuming no GPS hardware or fundamental GPS software stack."));
                    }
                    if (!locationManager.isProviderEnabled("gps")) {
                        throw new com.ingo.sdk.kotlin.common.features.location.LocationDataException(new java.lang.IllegalArgumentException("LocationManager.GPS_PROVIDER is disabled"));
                    }
                    com.google.android.gms.location.LocationRequest build = new com.google.android.gms.location.LocationRequest.Builder(100, 1000L).setDurationMillis(com.google.android.gms.location.DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT).build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                    weakReference2 = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(weakReference2);
                    java.lang.Object obj2 = weakReference2.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
                    final com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient((android.content.Context) obj2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "");
                    final com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl locationProviderImpl = this.getHighSpeedVideoSizes;
                    final ?? r10 = new com.google.android.gms.location.LocationCallback() { // from class: com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1$1$locationCallback$1
                        @Override // com.google.android.gms.location.LocationCallback
                        public final void onLocationResult(com.google.android.gms.location.LocationResult p0) {
                            java.lang.Object next;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                            super.onLocationResult(p0);
                            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "onLocationResult ".concat(java.lang.String.valueOf(p0)), null, 2, null);
                            try {
                                java.util.List<android.location.Location> locations = p0.getLocations();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locations, "");
                                java.util.Iterator<T> it = locations.iterator();
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (it.hasNext()) {
                                        float accuracy = ((android.location.Location) next).getAccuracy();
                                        do {
                                            java.lang.Object next2 = it.next();
                                            float accuracy2 = ((android.location.Location) next2).getAccuracy();
                                            if (java.lang.Float.compare(accuracy, accuracy2) > 0) {
                                                next = next2;
                                                accuracy = accuracy2;
                                            }
                                        } while (it.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                kotlin.jvm.internal.Intrinsics.checkNotNull(next);
                                android.location.Location location = (android.location.Location) next;
                                boolean isMock = android.os.Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider();
                                com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append("isMock ");
                                sb.append(isMock);
                                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging, sb.toString(), null, 2, null);
                                com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
                                long time = location.getTime();
                                long j = systemTime;
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append("location age ");
                                sb2.append(time - j);
                                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging2, sb2.toString(), null, 2, null);
                                if (location.getTime() <= systemTime || !location.hasAccuracy() || location.getAccuracy() >= 50.0f || (!locationProviderImpl.getAllowSimulators() && isMock)) {
                                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                    sb3.append("Location Insufficient isMock ");
                                    sb3.append(isMock);
                                    sb3.append(" ");
                                    sb3.append(location);
                                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging3, sb3.toString(), null, 2, null);
                                    return;
                                }
                                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "got good location", null, 2, null);
                                fusedLocationProviderClient.removeLocationUpdates(this);
                                kotlinx.coroutines.channels.ChannelResult.m24079boximpl(producerScope.mo9266trySendJP2dKIU(new com.ingo.sdk.kotlin.common.features.location.LocationData(location.getLatitude(), location.getLongitude(), java.lang.String.valueOf(location.getAccuracy()), java.lang.String.valueOf(location.getVerticalAccuracyMeters()), java.lang.String.valueOf(location.getAltitude()), java.lang.String.valueOf(location.getBearing()), java.lang.String.valueOf(location.getBearingAccuracyDegrees()), java.lang.String.valueOf(location.getSpeed()), java.lang.String.valueOf(location.getSpeedAccuracyMetersPerSecond()), location.getTime())));
                            } catch (java.lang.Throwable th) {
                                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Error!", null, th, 2, null);
                                producerScope.close(new com.ingo.sdk.kotlin.common.features.location.LocationDataException(th));
                            }
                        }

                        @Override // com.google.android.gms.location.LocationCallback
                        public final void onLocationAvailability(com.google.android.gms.location.LocationAvailability p0) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                            super.onLocationAvailability(p0);
                            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "onLocationAvailability ".concat(java.lang.String.valueOf(p0)), null, 2, null);
                        }
                    };
                    fusedLocationProviderClient.requestLocationUpdates(build, (com.google.android.gms.location.LocationCallback) r10, android.os.Looper.getMainLooper());
                    this.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1.AnonymousClass1.Camera2StreamConfigurationMap(com.google.android.gms.location.FusedLocationProviderClient.this, r10);
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(producerScope.close(new com.ingo.sdk.kotlin.common.features.location.LocationDataException(new java.lang.Exception("Context Is Null"))));
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1$1$locationCallback$1 locationProviderImpl$getLocationData$locationResult$1$1$locationCallback$1) {
            fusedLocationProviderClient.removeLocationUpdates(locationProviderImpl$getLocationData$locationResult$1$1$locationCallback$1);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.ingo.sdk.kotlin.common.features.location.LocationData> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1.AnonymousClass1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1.AnonymousClass1 anonymousClass1 = new com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1.AnonymousClass1(this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl locationProviderImpl, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = locationProviderImpl;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap = 1;
        java.lang.Object firstOrNull = kotlinx.coroutines.flow.FlowKt.firstOrNull(kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, null)), this);
        return firstOrNull == coroutine_suspended ? coroutine_suspended : firstOrNull;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.location.LocationData> continuation) {
        return ((com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocationProviderImpl$getLocationData$locationResult$1(com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl locationProviderImpl, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$locationResult$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = locationProviderImpl;
    }
}
