package com.google.maps.android.ktx;

@kotlin.Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086H¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\u0000H\u0086H¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0004\u001a\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0004\u001a\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\"\u0010\u0013\u001a\u0004\u0018\u00010\u0011*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086H¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0004\u001a\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0004\u001a\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u0004\u001a\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0001*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u0004\u001a\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u0004\u001a\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u0004\u001a\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u0004\u001a\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0001*\u00020\u0000¢\u0006\u0004\b!\u0010\u0004\u001a\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u0001*\u00020\u0000¢\u0006\u0004\b\"\u0010\u0004\u001a\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b#\u0010\u0004\u001a\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0001*\u00020\u0000¢\u0006\u0004\b%\u0010\u0004\u001a\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b&\u0010\u0004\u001a\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0001*\u00020\u0000¢\u0006\u0004\b(\u0010\u0004\u001a\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0001*\u00020\u0000¢\u0006\u0004\b*\u0010\u0004\u001a\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0001*\u00020\u0000¢\u0006\u0004\b,\u0010\u0004\u001a\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0001*\u00020\u0000¢\u0006\u0004\b.\u0010\u0004\u001a,\u00103\u001a\u0002002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a0\u00106\u001a\u00020\u0016*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a2\u00109\u001a\u0004\u0018\u00010\u0018*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a2\u0010<\u001a\u0004\u0018\u00010\u001c*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a0\u0010?\u001a\u00020+*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a0\u0010B\u001a\u00020-*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a2\u0010F\u001a\u0004\u0018\u00010E*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/google/android/gms/maps/GoogleMap;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/maps/android/ktx/CameraEvent;", "cameraEvents", "(Lcom/google/android/gms/maps/GoogleMap;)Lkotlinx/coroutines/flow/Flow;", "Lcom/google/android/gms/maps/CameraUpdate;", "cameraUpdate", "", "durationMs", "", "awaitAnimateCamera", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/CameraUpdate;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitMapLoad", "(Lcom/google/android/gms/maps/GoogleMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cameraIdleEvents", "cameraMoveCanceledEvents", "cameraMoveEvents", "Landroid/graphics/Bitmap;", "bitmap", "awaitSnapshot", "(Lcom/google/android/gms/maps/GoogleMap;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cameraMoveStartedEvents", "Lcom/google/android/gms/maps/model/Circle;", "circleClickEvents", "Lcom/google/android/gms/maps/model/GroundOverlay;", "groundOverlayClicks", "Lcom/google/maps/android/ktx/IndoorChangeEvent;", "indoorStateChangeEvents", "Lcom/google/android/gms/maps/model/Marker;", "infoWindowClickEvents", "infoWindowCloseEvents", "infoWindowLongClickEvents", "Lcom/google/android/gms/maps/model/LatLng;", "mapClickEvents", "mapLongClickEvents", "markerClickEvents", "Lcom/google/maps/android/ktx/OnMarkerDragEvent;", "markerDragEvents", "myLocationButtonClickEvents", "Landroid/location/Location;", "myLocationClickEvents", "Lcom/google/android/gms/maps/model/PointOfInterest;", "poiClickEvents", "Lcom/google/android/gms/maps/model/Polygon;", "polygonClickEvents", "Lcom/google/android/gms/maps/model/Polyline;", "polylineClickEvents", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/GoogleMapOptions;", "Lkotlin/ExtensionFunctionType;", "optionsActions", "buildGoogleMapOptions", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/gms/maps/GoogleMapOptions;", "Lcom/google/android/gms/maps/model/CircleOptions;", "addCircle", "(Lcom/google/android/gms/maps/GoogleMap;Lkotlin/jvm/functions/Function1;)Lcom/google/android/gms/maps/model/Circle;", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "addGroundOverlay", "(Lcom/google/android/gms/maps/GoogleMap;Lkotlin/jvm/functions/Function1;)Lcom/google/android/gms/maps/model/GroundOverlay;", "Lcom/google/android/gms/maps/model/MarkerOptions;", "addMarker", "(Lcom/google/android/gms/maps/GoogleMap;Lkotlin/jvm/functions/Function1;)Lcom/google/android/gms/maps/model/Marker;", "Lcom/google/android/gms/maps/model/PolygonOptions;", "addPolygon", "(Lcom/google/android/gms/maps/GoogleMap;Lkotlin/jvm/functions/Function1;)Lcom/google/android/gms/maps/model/Polygon;", "Lcom/google/android/gms/maps/model/PolylineOptions;", "addPolyline", "(Lcom/google/android/gms/maps/GoogleMap;Lkotlin/jvm/functions/Function1;)Lcom/google/android/gms/maps/model/Polyline;", "Lcom/google/android/gms/maps/model/TileOverlayOptions;", "Lcom/google/android/gms/maps/model/TileOverlay;", "addTileOverlay", "(Lcom/google/android/gms/maps/GoogleMap;Lkotlin/jvm/functions/Function1;)Lcom/google/android/gms/maps/model/TileOverlay;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GoogleMapKt {
    @kotlin.Deprecated(message = "Use cameraIdleEvents(), cameraMoveCanceledEvents(), cameraMoveEvents() or cameraMoveStartedEvents")
    public static final kotlinx.coroutines.flow.Flow<com.google.maps.android.ktx.CameraEvent> cameraEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$cameraEvents$1(googleMap, null));
    }

    public static final java.lang.Object awaitMapLoad(com.google.android.gms.maps.GoogleMap googleMap, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        googleMap.setOnMapLoadedCallback(new com.google.maps.android.ktx.GoogleMapKt$awaitMapLoad$2$1(safeContinuation));
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : kotlin.Unit.INSTANCE;
    }

    private static final java.lang.Object awaitMapLoad$$forInline(com.google.android.gms.maps.GoogleMap googleMap, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        googleMap.setOnMapLoadedCallback(new com.google.maps.android.ktx.GoogleMapKt$awaitMapLoad$2$1(safeContinuation));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        if (safeContinuation.getOrThrow() == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlinx.coroutines.flow.Flow<kotlin.Unit> cameraIdleEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$cameraIdleEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<kotlin.Unit> cameraMoveCanceledEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$cameraMoveCanceledEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<kotlin.Unit> cameraMoveEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$cameraMoveEvents$1(googleMap, null));
    }

    public static final java.lang.Object awaitSnapshot(com.google.android.gms.maps.GoogleMap googleMap, android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        googleMap.snapshot(new com.google.maps.android.ktx.GoogleMapKt$awaitSnapshot$2$1(safeContinuation), bitmap);
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private static final java.lang.Object awaitSnapshot$$forInline(com.google.android.gms.maps.GoogleMap googleMap, android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        googleMap.snapshot(new com.google.maps.android.ktx.GoogleMapKt$awaitSnapshot$2$1(safeContinuation), bitmap);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static /* synthetic */ java.lang.Object awaitSnapshot$default(com.google.android.gms.maps.GoogleMap googleMap, android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bitmap = null;
        }
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        googleMap.snapshot(new com.google.maps.android.ktx.GoogleMapKt$awaitSnapshot$2$1(safeContinuation), bitmap);
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static final kotlinx.coroutines.flow.Flow<java.lang.Integer> cameraMoveStartedEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$cameraMoveStartedEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.Circle> circleClickEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$circleClickEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.GroundOverlay> groundOverlayClicks(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$groundOverlayClicks$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.maps.android.ktx.IndoorChangeEvent> indoorStateChangeEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$indoorStateChangeEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.Marker> infoWindowClickEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.Marker> infoWindowCloseEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$infoWindowCloseEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.Marker> infoWindowLongClickEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$infoWindowLongClickEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.LatLng> mapClickEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$mapClickEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.LatLng> mapLongClickEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$mapLongClickEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.Marker> markerClickEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.maps.android.ktx.OnMarkerDragEvent> markerDragEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$markerDragEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<kotlin.Unit> myLocationButtonClickEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$myLocationButtonClickEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<android.location.Location> myLocationClickEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$myLocationClickEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.PointOfInterest> poiClickEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$poiClickEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.Polygon> polygonClickEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$polygonClickEvents$1(googleMap, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.Polyline> polylineClickEvents(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.GoogleMapKt$polylineClickEvents$1(googleMap, null));
    }

    public static final com.google.android.gms.maps.GoogleMapOptions buildGoogleMapOptions(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.GoogleMapOptions, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.android.gms.maps.GoogleMapOptions googleMapOptions = new com.google.android.gms.maps.GoogleMapOptions();
        function1.invoke(googleMapOptions);
        return googleMapOptions;
    }

    private static final java.lang.Object awaitAnimateCamera$$forInline(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.CameraUpdate cameraUpdate, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        googleMap.animateCamera(cameraUpdate, i, new com.google.maps.android.ktx.GoogleMapKt$awaitAnimateCamera$2$1(cancellableContinuationImpl));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        if (cancellableContinuationImpl.getResult() == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object awaitAnimateCamera(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.CameraUpdate cameraUpdate, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        googleMap.animateCamera(cameraUpdate, i, new com.google.maps.android.ktx.GoogleMapKt$awaitAnimateCamera$2$1(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object awaitAnimateCamera$default(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.CameraUpdate cameraUpdate, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 3000;
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        googleMap.animateCamera(cameraUpdate, i, new com.google.maps.android.ktx.GoogleMapKt$awaitAnimateCamera$2$1(cancellableContinuationImpl));
        if (cancellableContinuationImpl.getResult() == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final com.google.android.gms.maps.model.Circle addCircle(com.google.android.gms.maps.GoogleMap googleMap, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.CircleOptions, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.android.gms.maps.model.CircleOptions circleOptions = new com.google.android.gms.maps.model.CircleOptions();
        function1.invoke(circleOptions);
        com.google.android.gms.maps.model.Circle addCircle = googleMap.addCircle(circleOptions);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addCircle, "");
        return addCircle;
    }

    public static final com.google.android.gms.maps.model.GroundOverlay addGroundOverlay(com.google.android.gms.maps.GoogleMap googleMap, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.GroundOverlayOptions, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.android.gms.maps.model.GroundOverlayOptions groundOverlayOptions = new com.google.android.gms.maps.model.GroundOverlayOptions();
        function1.invoke(groundOverlayOptions);
        return googleMap.addGroundOverlay(groundOverlayOptions);
    }

    public static final com.google.android.gms.maps.model.Marker addMarker(com.google.android.gms.maps.GoogleMap googleMap, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.MarkerOptions, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.android.gms.maps.model.MarkerOptions markerOptions = new com.google.android.gms.maps.model.MarkerOptions();
        function1.invoke(markerOptions);
        return googleMap.addMarker(markerOptions);
    }

    public static final com.google.android.gms.maps.model.Polygon addPolygon(com.google.android.gms.maps.GoogleMap googleMap, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.PolygonOptions, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.android.gms.maps.model.PolygonOptions polygonOptions = new com.google.android.gms.maps.model.PolygonOptions();
        function1.invoke(polygonOptions);
        com.google.android.gms.maps.model.Polygon addPolygon = googleMap.addPolygon(polygonOptions);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addPolygon, "");
        return addPolygon;
    }

    public static final com.google.android.gms.maps.model.Polyline addPolyline(com.google.android.gms.maps.GoogleMap googleMap, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.PolylineOptions, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.android.gms.maps.model.PolylineOptions polylineOptions = new com.google.android.gms.maps.model.PolylineOptions();
        function1.invoke(polylineOptions);
        com.google.android.gms.maps.model.Polyline addPolyline = googleMap.addPolyline(polylineOptions);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addPolyline, "");
        return addPolyline;
    }

    public static final com.google.android.gms.maps.model.TileOverlay addTileOverlay(com.google.android.gms.maps.GoogleMap googleMap, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.TileOverlayOptions, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions = new com.google.android.gms.maps.model.TileOverlayOptions();
        function1.invoke(tileOverlayOptions);
        return googleMap.addTileOverlay(tileOverlayOptions);
    }
}
