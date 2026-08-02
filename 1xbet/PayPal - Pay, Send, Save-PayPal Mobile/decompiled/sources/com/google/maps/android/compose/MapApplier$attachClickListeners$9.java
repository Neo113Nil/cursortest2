package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/MapApplier$attachClickListeners$9;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;", "Lcom/google/android/gms/maps/model/Marker;", "marker", "", "onMarkerDragStart", "(Lcom/google/android/gms/maps/model/Marker;)V", "onMarkerDrag", "onMarkerDragEnd"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MapApplier$attachClickListeners$9 implements com.google.android.gms.maps.GoogleMap.OnMarkerDragListener {
    final /* synthetic */ com.google.maps.android.compose.MapApplier this$0;

    MapApplier$attachClickListeners$9(com.google.maps.android.compose.MapApplier mapApplier) {
        this.this$0 = mapApplier;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDragStart(com.google.android.gms.maps.model.Marker marker) {
        java.util.List<com.google.maps.android.compose.MapNode> list;
        kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> onMarkerDragStart;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        list = this.this$0.decorations;
        for (com.google.maps.android.compose.MapNode mapNode : list) {
            if (mapNode instanceof com.google.maps.android.compose.MarkerNode) {
                final com.google.maps.android.compose.MarkerNode markerNode = (com.google.maps.android.compose.MarkerNode) mapNode;
                if (kotlin.jvm.internal.Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MapApplier$attachClickListeners$9$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit onMarkerDragStart$lambda$1$0;
                            onMarkerDragStart$lambda$1$0 = com.google.maps.android.compose.MapApplier$attachClickListeners$9.onMarkerDragStart$lambda$1$0(com.google.maps.android.compose.MarkerNode.this, (com.google.android.gms.maps.model.Marker) obj);
                            return onMarkerDragStart$lambda$1$0;
                        }
                    }.invoke(marker), java.lang.Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if ((mapNode instanceof com.google.maps.android.compose.InputHandlerNode) && (onMarkerDragStart = ((com.google.maps.android.compose.InputHandlerNode) mapNode).getOnMarkerDragStart()) != null && kotlin.jvm.internal.Intrinsics.areEqual(onMarkerDragStart.invoke(marker), java.lang.Boolean.TRUE)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onMarkerDragStart$lambda$1$0(com.google.maps.android.compose.MarkerNode markerNode, com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        com.google.android.gms.maps.model.LatLng position = marker.getPosition();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(position, "");
        markerNode.getMarkerState().setDragging$maps_compose_release(true);
        markerNode.getMarkerState().setPosition(position);
        markerNode.getMarkerState().setDragState$maps_compose_release(com.google.maps.android.compose.DragState.START);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDrag(com.google.android.gms.maps.model.Marker marker) {
        java.util.List<com.google.maps.android.compose.MapNode> list;
        kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> onMarkerDrag;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        list = this.this$0.decorations;
        for (com.google.maps.android.compose.MapNode mapNode : list) {
            if (mapNode instanceof com.google.maps.android.compose.MarkerNode) {
                final com.google.maps.android.compose.MarkerNode markerNode = (com.google.maps.android.compose.MarkerNode) mapNode;
                if (kotlin.jvm.internal.Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MapApplier$attachClickListeners$9$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit onMarkerDrag$lambda$4$0;
                            onMarkerDrag$lambda$4$0 = com.google.maps.android.compose.MapApplier$attachClickListeners$9.onMarkerDrag$lambda$4$0(com.google.maps.android.compose.MarkerNode.this, (com.google.android.gms.maps.model.Marker) obj);
                            return onMarkerDrag$lambda$4$0;
                        }
                    }.invoke(marker), java.lang.Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if ((mapNode instanceof com.google.maps.android.compose.InputHandlerNode) && (onMarkerDrag = ((com.google.maps.android.compose.InputHandlerNode) mapNode).getOnMarkerDrag()) != null && kotlin.jvm.internal.Intrinsics.areEqual(onMarkerDrag.invoke(marker), java.lang.Boolean.TRUE)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onMarkerDrag$lambda$4$0(com.google.maps.android.compose.MarkerNode markerNode, com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        com.google.android.gms.maps.model.LatLng position = marker.getPosition();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(position, "");
        markerNode.getMarkerState().setDragging$maps_compose_release(true);
        markerNode.getMarkerState().setPosition(position);
        markerNode.getMarkerState().setDragState$maps_compose_release(com.google.maps.android.compose.DragState.DRAG);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDragEnd(com.google.android.gms.maps.model.Marker marker) {
        java.util.List<com.google.maps.android.compose.MapNode> list;
        kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> onMarkerDragEnd;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        list = this.this$0.decorations;
        for (com.google.maps.android.compose.MapNode mapNode : list) {
            if (mapNode instanceof com.google.maps.android.compose.MarkerNode) {
                final com.google.maps.android.compose.MarkerNode markerNode = (com.google.maps.android.compose.MarkerNode) mapNode;
                if (kotlin.jvm.internal.Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MapApplier$attachClickListeners$9$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit onMarkerDragEnd$lambda$7$0;
                            onMarkerDragEnd$lambda$7$0 = com.google.maps.android.compose.MapApplier$attachClickListeners$9.onMarkerDragEnd$lambda$7$0(com.google.maps.android.compose.MarkerNode.this, (com.google.android.gms.maps.model.Marker) obj);
                            return onMarkerDragEnd$lambda$7$0;
                        }
                    }.invoke(marker), java.lang.Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if ((mapNode instanceof com.google.maps.android.compose.InputHandlerNode) && (onMarkerDragEnd = ((com.google.maps.android.compose.InputHandlerNode) mapNode).getOnMarkerDragEnd()) != null && kotlin.jvm.internal.Intrinsics.areEqual(onMarkerDragEnd.invoke(marker), java.lang.Boolean.TRUE)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onMarkerDragEnd$lambda$7$0(com.google.maps.android.compose.MarkerNode markerNode, com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        com.google.android.gms.maps.model.LatLng position = marker.getPosition();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(position, "");
        markerNode.getMarkerState().setDragging$maps_compose_release(true);
        markerNode.getMarkerState().setPosition(position);
        markerNode.getMarkerState().setDragging$maps_compose_release(false);
        markerNode.getMarkerState().setDragState$maps_compose_release(com.google.maps.android.compose.DragState.END);
        return kotlin.Unit.INSTANCE;
    }
}
