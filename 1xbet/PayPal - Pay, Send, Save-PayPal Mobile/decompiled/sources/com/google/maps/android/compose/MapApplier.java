package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lcom/google/maps/android/compose/MapApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lcom/google/android/gms/maps/MapView;", "mapView", "Lcom/google/maps/android/compose/MapClickListeners;", "mapClickListeners", "<init>", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/MapView;Lcom/google/maps/android/compose/MapClickListeners;)V", "", "onClear", "()V", "", "index", "instance", "insertBottomUp", "(ILcom/google/maps/android/compose/MapNode;)V", "insertTopDown", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "move", "(III)V", "remove", "(II)V", "attachClickListeners$maps_compose_release", "Lcom/google/android/gms/maps/GoogleMap;", "getMap", "()Lcom/google/android/gms/maps/GoogleMap;", "Lcom/google/android/gms/maps/MapView;", "getMapView$maps_compose_release", "()Lcom/google/android/gms/maps/MapView;", "Lcom/google/maps/android/compose/MapClickListeners;", "getMapClickListeners", "()Lcom/google/maps/android/compose/MapClickListeners;", "", "decorations", "Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MapApplier extends androidx.compose.runtime.AbstractApplier<com.google.maps.android.compose.MapNode> {
    public static final int $stable = 8;
    private final java.util.List<com.google.maps.android.compose.MapNode> decorations;
    private final com.google.android.gms.maps.GoogleMap map;
    private final com.google.maps.android.compose.MapClickListeners mapClickListeners;
    private final com.google.android.gms.maps.MapView mapView;

    public final com.google.android.gms.maps.GoogleMap getMap() {
        return this.map;
    }

    /* renamed from: getMapView$maps_compose_release, reason: from getter */
    public final com.google.android.gms.maps.MapView getMapView() {
        return this.mapView;
    }

    public final com.google.maps.android.compose.MapClickListeners getMapClickListeners() {
        return this.mapClickListeners;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapApplier(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.MapView mapView, com.google.maps.android.compose.MapClickListeners mapClickListeners) {
        super(com.google.maps.android.compose.MapNodeRoot.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapClickListeners, "");
        this.map = googleMap;
        this.mapView = mapView;
        this.mapClickListeners = mapClickListeners;
        this.decorations = new java.util.ArrayList();
        attachClickListeners$maps_compose_release();
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void onClear() {
        this.map.clear();
        java.util.Iterator<T> it = this.decorations.iterator();
        while (it.hasNext()) {
            ((com.google.maps.android.compose.MapNode) it.next()).onCleared();
        }
        this.decorations.clear();
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertBottomUp(int index, com.google.maps.android.compose.MapNode instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
        this.decorations.add(index, instance);
        instance.onAttached();
    }

    @Override // androidx.compose.runtime.Applier
    public final void move(int from, int to, int count) {
        move(this.decorations, from, to, count);
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int index, int count) {
        for (int i = 0; i < count; i++) {
            this.decorations.get(index + i).onRemoved();
        }
        remove(this.decorations, index, count);
    }

    public final void attachClickListeners$maps_compose_release() {
        this.map.setOnCircleClickListener(new com.google.android.gms.maps.GoogleMap.OnCircleClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.maps.GoogleMap.OnCircleClickListener
            public final void onCircleClick(com.google.android.gms.maps.model.Circle circle) {
                com.google.maps.android.compose.MapApplier.attachClickListeners$lambda$0(com.google.maps.android.compose.MapApplier.this, circle);
            }
        });
        this.map.setOnGroundOverlayClickListener(new com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
            public final void onGroundOverlayClick(com.google.android.gms.maps.model.GroundOverlay groundOverlay) {
                com.google.maps.android.compose.MapApplier.attachClickListeners$lambda$1(com.google.maps.android.compose.MapApplier.this, groundOverlay);
            }
        });
        this.map.setOnPolygonClickListener(new com.google.android.gms.maps.GoogleMap.OnPolygonClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
            public final void onPolygonClick(com.google.android.gms.maps.model.Polygon polygon) {
                com.google.maps.android.compose.MapApplier.attachClickListeners$lambda$2(com.google.maps.android.compose.MapApplier.this, polygon);
            }
        });
        this.map.setOnPolylineClickListener(new com.google.android.gms.maps.GoogleMap.OnPolylineClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
            public final void onPolylineClick(com.google.android.gms.maps.model.Polyline polyline) {
                com.google.maps.android.compose.MapApplier.attachClickListeners$lambda$3(com.google.maps.android.compose.MapApplier.this, polyline);
            }
        });
        this.map.setOnMarkerClickListener(new com.google.android.gms.maps.GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public final boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
                boolean attachClickListeners$lambda$4;
                attachClickListeners$lambda$4 = com.google.maps.android.compose.MapApplier.attachClickListeners$lambda$4(com.google.maps.android.compose.MapApplier.this, marker);
                return attachClickListeners$lambda$4;
            }
        });
        this.map.setOnInfoWindowClickListener(new com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda5
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public final void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
                com.google.maps.android.compose.MapApplier.attachClickListeners$lambda$5(com.google.maps.android.compose.MapApplier.this, marker);
            }
        });
        this.map.setOnInfoWindowCloseListener(new com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda6
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener
            public final void onInfoWindowClose(com.google.android.gms.maps.model.Marker marker) {
                com.google.maps.android.compose.MapApplier.attachClickListeners$lambda$6(com.google.maps.android.compose.MapApplier.this, marker);
            }
        });
        this.map.setOnInfoWindowLongClickListener(new com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda7
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
            public final void onInfoWindowLongClick(com.google.android.gms.maps.model.Marker marker) {
                com.google.maps.android.compose.MapApplier.attachClickListeners$lambda$7(com.google.maps.android.compose.MapApplier.this, marker);
            }
        });
        this.map.setOnMarkerDragListener(new com.google.maps.android.compose.MapApplier$attachClickListeners$9(this));
        this.map.setInfoWindowAdapter(new com.google.maps.android.compose.ComposeInfoWindowAdapter(this.mapView, new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.google.maps.android.compose.MarkerNode attachClickListeners$lambda$8;
                attachClickListeners$lambda$8 = com.google.maps.android.compose.MapApplier.attachClickListeners$lambda$8(com.google.maps.android.compose.MapApplier.this, (com.google.android.gms.maps.model.Marker) obj);
                return attachClickListeners$lambda$8;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$0(com.google.maps.android.compose.MapApplier mapApplier, com.google.android.gms.maps.model.Circle circle) {
        kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Circle, kotlin.Unit> onCircleClick;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(circle, "");
        for (com.google.maps.android.compose.MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof com.google.maps.android.compose.CircleNode) {
                com.google.maps.android.compose.CircleNode circleNode = (com.google.maps.android.compose.CircleNode) mapNode;
                if (kotlin.jvm.internal.Intrinsics.areEqual(circleNode.getCircle(), circle)) {
                    kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Circle, kotlin.Unit> onCircleClick2 = circleNode.getOnCircleClick();
                    if (onCircleClick2 != null && kotlin.jvm.internal.Intrinsics.areEqual(onCircleClick2.invoke(circle), java.lang.Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if ((mapNode instanceof com.google.maps.android.compose.InputHandlerNode) && (onCircleClick = ((com.google.maps.android.compose.InputHandlerNode) mapNode).getOnCircleClick()) != null && kotlin.jvm.internal.Intrinsics.areEqual(onCircleClick.invoke(circle), java.lang.Boolean.TRUE)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$1(com.google.maps.android.compose.MapApplier mapApplier, com.google.android.gms.maps.model.GroundOverlay groundOverlay) {
        kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.GroundOverlay, kotlin.Unit> onGroundOverlayClick;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(groundOverlay, "");
        for (com.google.maps.android.compose.MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof com.google.maps.android.compose.GroundOverlayNode) {
                com.google.maps.android.compose.GroundOverlayNode groundOverlayNode = (com.google.maps.android.compose.GroundOverlayNode) mapNode;
                if (kotlin.jvm.internal.Intrinsics.areEqual(groundOverlayNode.getGroundOverlay(), groundOverlay)) {
                    kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.GroundOverlay, kotlin.Unit> onGroundOverlayClick2 = groundOverlayNode.getOnGroundOverlayClick();
                    if (onGroundOverlayClick2 != null && kotlin.jvm.internal.Intrinsics.areEqual(onGroundOverlayClick2.invoke(groundOverlay), java.lang.Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if ((mapNode instanceof com.google.maps.android.compose.InputHandlerNode) && (onGroundOverlayClick = ((com.google.maps.android.compose.InputHandlerNode) mapNode).getOnGroundOverlayClick()) != null && kotlin.jvm.internal.Intrinsics.areEqual(onGroundOverlayClick.invoke(groundOverlay), java.lang.Boolean.TRUE)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$2(com.google.maps.android.compose.MapApplier mapApplier, com.google.android.gms.maps.model.Polygon polygon) {
        kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Polygon, kotlin.Unit> onPolygonClick;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(polygon, "");
        for (com.google.maps.android.compose.MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof com.google.maps.android.compose.PolygonNode) {
                com.google.maps.android.compose.PolygonNode polygonNode = (com.google.maps.android.compose.PolygonNode) mapNode;
                if (kotlin.jvm.internal.Intrinsics.areEqual(polygonNode.getPolygon(), polygon)) {
                    kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Polygon, kotlin.Unit> onPolygonClick2 = polygonNode.getOnPolygonClick();
                    if (onPolygonClick2 != null && kotlin.jvm.internal.Intrinsics.areEqual(onPolygonClick2.invoke(polygon), java.lang.Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if ((mapNode instanceof com.google.maps.android.compose.InputHandlerNode) && (onPolygonClick = ((com.google.maps.android.compose.InputHandlerNode) mapNode).getOnPolygonClick()) != null && kotlin.jvm.internal.Intrinsics.areEqual(onPolygonClick.invoke(polygon), java.lang.Boolean.TRUE)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$3(com.google.maps.android.compose.MapApplier mapApplier, com.google.android.gms.maps.model.Polyline polyline) {
        kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Polyline, kotlin.Unit> onPolylineClick;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(polyline, "");
        for (com.google.maps.android.compose.MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof com.google.maps.android.compose.PolylineNode) {
                com.google.maps.android.compose.PolylineNode polylineNode = (com.google.maps.android.compose.PolylineNode) mapNode;
                if (kotlin.jvm.internal.Intrinsics.areEqual(polylineNode.getPolyline(), polyline)) {
                    kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Polyline, kotlin.Unit> onPolylineClick2 = polylineNode.getOnPolylineClick();
                    if (onPolylineClick2 != null && kotlin.jvm.internal.Intrinsics.areEqual(onPolylineClick2.invoke(polyline), java.lang.Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if ((mapNode instanceof com.google.maps.android.compose.InputHandlerNode) && (onPolylineClick = ((com.google.maps.android.compose.InputHandlerNode) mapNode).getOnPolylineClick()) != null && kotlin.jvm.internal.Intrinsics.areEqual(onPolylineClick.invoke(polyline), java.lang.Boolean.TRUE)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachClickListeners$lambda$4(com.google.maps.android.compose.MapApplier mapApplier, com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, java.lang.Boolean> onMarkerClick;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        for (com.google.maps.android.compose.MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof com.google.maps.android.compose.MarkerNode) {
                com.google.maps.android.compose.MarkerNode markerNode = (com.google.maps.android.compose.MarkerNode) mapNode;
                if (kotlin.jvm.internal.Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                    kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, java.lang.Boolean> onMarkerClick2 = markerNode.getOnMarkerClick();
                    if (onMarkerClick2 != null && kotlin.jvm.internal.Intrinsics.areEqual(onMarkerClick2.invoke(marker), java.lang.Boolean.TRUE)) {
                        return true;
                    }
                }
            }
            if ((mapNode instanceof com.google.maps.android.compose.InputHandlerNode) && (onMarkerClick = ((com.google.maps.android.compose.InputHandlerNode) mapNode).getOnMarkerClick()) != null && kotlin.jvm.internal.Intrinsics.areEqual(onMarkerClick.invoke(marker), java.lang.Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$5(com.google.maps.android.compose.MapApplier mapApplier, com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> onInfoWindowClick;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        for (com.google.maps.android.compose.MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof com.google.maps.android.compose.MarkerNode) {
                com.google.maps.android.compose.MarkerNode markerNode = (com.google.maps.android.compose.MarkerNode) mapNode;
                if (kotlin.jvm.internal.Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                    kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> onInfoWindowClick2 = markerNode.getOnInfoWindowClick();
                    if (onInfoWindowClick2 != null && kotlin.jvm.internal.Intrinsics.areEqual(onInfoWindowClick2.invoke(marker), java.lang.Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if ((mapNode instanceof com.google.maps.android.compose.InputHandlerNode) && (onInfoWindowClick = ((com.google.maps.android.compose.InputHandlerNode) mapNode).getOnInfoWindowClick()) != null && kotlin.jvm.internal.Intrinsics.areEqual(onInfoWindowClick.invoke(marker), java.lang.Boolean.TRUE)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$6(com.google.maps.android.compose.MapApplier mapApplier, com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> onInfoWindowClose;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        for (com.google.maps.android.compose.MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof com.google.maps.android.compose.MarkerNode) {
                com.google.maps.android.compose.MarkerNode markerNode = (com.google.maps.android.compose.MarkerNode) mapNode;
                if (kotlin.jvm.internal.Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                    kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> onInfoWindowClose2 = markerNode.getOnInfoWindowClose();
                    if (onInfoWindowClose2 != null && kotlin.jvm.internal.Intrinsics.areEqual(onInfoWindowClose2.invoke(marker), java.lang.Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if ((mapNode instanceof com.google.maps.android.compose.InputHandlerNode) && (onInfoWindowClose = ((com.google.maps.android.compose.InputHandlerNode) mapNode).getOnInfoWindowClose()) != null && kotlin.jvm.internal.Intrinsics.areEqual(onInfoWindowClose.invoke(marker), java.lang.Boolean.TRUE)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$7(com.google.maps.android.compose.MapApplier mapApplier, com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> onInfoWindowLongClick;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        for (com.google.maps.android.compose.MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof com.google.maps.android.compose.MarkerNode) {
                com.google.maps.android.compose.MarkerNode markerNode = (com.google.maps.android.compose.MarkerNode) mapNode;
                if (kotlin.jvm.internal.Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                    kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> onInfoWindowLongClick2 = markerNode.getOnInfoWindowLongClick();
                    if (onInfoWindowLongClick2 != null && kotlin.jvm.internal.Intrinsics.areEqual(onInfoWindowLongClick2.invoke(marker), java.lang.Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if ((mapNode instanceof com.google.maps.android.compose.InputHandlerNode) && (onInfoWindowLongClick = ((com.google.maps.android.compose.InputHandlerNode) mapNode).getOnInfoWindowLongClick()) != null && kotlin.jvm.internal.Intrinsics.areEqual(onInfoWindowLongClick.invoke(marker), java.lang.Boolean.TRUE)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.maps.android.compose.MarkerNode attachClickListeners$lambda$8(com.google.maps.android.compose.MapApplier mapApplier, com.google.android.gms.maps.model.Marker marker) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        java.util.Iterator<T> it = mapApplier.decorations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.google.maps.android.compose.MapNode mapNode = (com.google.maps.android.compose.MapNode) obj;
            if ((mapNode instanceof com.google.maps.android.compose.MarkerNode) && kotlin.jvm.internal.Intrinsics.areEqual(((com.google.maps.android.compose.MarkerNode) mapNode).getMarker(), marker)) {
                break;
            }
        }
        return (com.google.maps.android.compose.MarkerNode) obj;
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertTopDown(int index, com.google.maps.android.compose.MapNode instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
    }
}
