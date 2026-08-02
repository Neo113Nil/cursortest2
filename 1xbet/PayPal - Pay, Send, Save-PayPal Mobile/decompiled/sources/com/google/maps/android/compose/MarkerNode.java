package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\b\u0000\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0002\b\u000f\u0012\u0019\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010!\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R5\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0002\b\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R5\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0002\b\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u00100"}, d2 = {"Lcom/google/maps/android/compose/MarkerNode;", "Lcom/google/maps/android/compose/MapNode;", "Landroidx/compose/runtime/CompositionContext;", "compositionContext", "Lcom/google/android/gms/maps/model/Marker;", "marker", "Lcom/google/maps/android/compose/MarkerState;", "markerState", "Lkotlin/Function1;", "", "onMarkerClick", "", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "Landroidx/compose/runtime/Composable;", "infoWindow", "infoContent", "<init>", "(Landroidx/compose/runtime/CompositionContext;Lcom/google/android/gms/maps/model/Marker;Lcom/google/maps/android/compose/MarkerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "onAttached", "()V", "onRemoved", "onCleared", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext", "()Landroidx/compose/runtime/CompositionContext;", "Lcom/google/android/gms/maps/model/Marker;", "getMarker", "()Lcom/google/android/gms/maps/model/Marker;", "Lcom/google/maps/android/compose/MarkerState;", "getMarkerState", "()Lcom/google/maps/android/compose/MarkerState;", "Lkotlin/jvm/functions/Function1;", "getOnMarkerClick", "()Lkotlin/jvm/functions/Function1;", "setOnMarkerClick", "(Lkotlin/jvm/functions/Function1;)V", "getOnInfoWindowClick", "setOnInfoWindowClick", "getOnInfoWindowClose", "setOnInfoWindowClose", "getOnInfoWindowLongClick", "setOnInfoWindowLongClick", "Lkotlin/jvm/functions/Function3;", "getInfoWindow", "()Lkotlin/jvm/functions/Function3;", "setInfoWindow", "(Lkotlin/jvm/functions/Function3;)V", "getInfoContent", "setInfoContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MarkerNode implements com.google.maps.android.compose.MapNode {
    public static final int $stable = 8;
    private final androidx.compose.runtime.CompositionContext compositionContext;
    private kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> infoContent;
    private kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> infoWindow;
    private final com.google.android.gms.maps.model.Marker marker;
    private final com.google.maps.android.compose.MarkerState markerState;
    private kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> onInfoWindowClick;
    private kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> onInfoWindowClose;
    private kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> onInfoWindowLongClick;
    private kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> onMarkerClick;

    public MarkerNode(androidx.compose.runtime.CompositionContext compositionContext, com.google.android.gms.maps.model.Marker marker, com.google.maps.android.compose.MarkerState markerState, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function14, kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compositionContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function14, "");
        this.compositionContext = compositionContext;
        this.marker = marker;
        this.markerState = markerState;
        this.onMarkerClick = function1;
        this.onInfoWindowClick = function12;
        this.onInfoWindowClose = function13;
        this.onInfoWindowLongClick = function14;
        this.infoWindow = function3;
        this.infoContent = function32;
    }

    public final androidx.compose.runtime.CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    public final com.google.android.gms.maps.model.Marker getMarker() {
        return this.marker;
    }

    public final com.google.maps.android.compose.MarkerState getMarkerState() {
        return this.markerState;
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, java.lang.Boolean> getOnMarkerClick() {
        return this.onMarkerClick;
    }

    public final void setOnMarkerClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.onMarkerClick = function1;
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> getOnInfoWindowClick() {
        return this.onInfoWindowClick;
    }

    public final void setOnInfoWindowClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.onInfoWindowClick = function1;
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> getOnInfoWindowClose() {
        return this.onInfoWindowClose;
    }

    public final void setOnInfoWindowClose(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.onInfoWindowClose = function1;
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> getOnInfoWindowLongClick() {
        return this.onInfoWindowLongClick;
    }

    public final void setOnInfoWindowLongClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.onInfoWindowLongClick = function1;
    }

    public final kotlin.jvm.functions.Function3<com.google.android.gms.maps.model.Marker, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInfoWindow() {
        return this.infoWindow;
    }

    public final void setInfoWindow(kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.infoWindow = function3;
    }

    public final kotlin.jvm.functions.Function3<com.google.android.gms.maps.model.Marker, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInfoContent() {
        return this.infoContent;
    }

    public final void setInfoContent(kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.infoContent = function3;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onAttached() {
        this.markerState.setMarker$maps_compose_release(this.marker);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onRemoved() {
        this.markerState.setMarker$maps_compose_release(null);
        this.marker.remove();
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onCleared() {
        this.markerState.setMarker$maps_compose_release(null);
        this.marker.remove();
    }
}
