package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010"}, d2 = {"Lcom/google/maps/android/compose/ComposeInfoWindowAdapter;", "Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;", "Lcom/google/android/gms/maps/MapView;", "mapView", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lcom/google/maps/android/compose/MarkerNode;", "markerNodeFinder", "<init>", "(Lcom/google/android/gms/maps/MapView;Lkotlin/jvm/functions/Function1;)V", "marker", "Landroid/view/View;", "getInfoContents", "(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;", "getInfoWindow", "Lcom/google/android/gms/maps/MapView;", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposeInfoWindowAdapter implements com.google.android.gms.maps.GoogleMap.InfoWindowAdapter {
    public static final int $stable = 8;
    private final com.google.android.gms.maps.MapView mapView;
    private final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, com.google.maps.android.compose.MarkerNode> markerNodeFinder;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeInfoWindowAdapter(com.google.android.gms.maps.MapView mapView, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, com.google.maps.android.compose.MarkerNode> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.mapView = mapView;
        this.markerNodeFinder = function1;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public final android.view.View getInfoContents(final com.google.android.gms.maps.model.Marker marker) {
        final kotlin.jvm.functions.Function3<com.google.android.gms.maps.model.Marker, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> infoContent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        com.google.maps.android.compose.MarkerNode invoke = this.markerNodeFinder.invoke(marker);
        if (invoke == null || (infoContent = invoke.getInfoContent()) == null) {
            return null;
        }
        android.content.Context context = this.mapView.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(context, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1508359207, true, new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.ComposeInfoWindowAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit infoContents$lambda$0$0;
                infoContents$lambda$0$0 = com.google.maps.android.compose.ComposeInfoWindowAdapter.getInfoContents$lambda$0$0(kotlin.jvm.functions.Function3.this, marker, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                return infoContents$lambda$0$0;
            }
        }));
        com.google.maps.android.compose.MapComposeViewRenderKt.renderComposeViewOnce$default(this.mapView, composeView, null, invoke.getCompositionContext(), 2, null);
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getInfoContents$lambda$0$0(kotlin.jvm.functions.Function3 function3, com.google.android.gms.maps.model.Marker marker, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1508359207, i, -1, "com.google.maps.android.compose.ComposeInfoWindowAdapter.getInfoContents.<anonymous>.<anonymous> (ComposeInfoWindowAdapter.kt:49)");
            }
            function3.invoke(marker, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public final android.view.View getInfoWindow(final com.google.android.gms.maps.model.Marker marker) {
        final kotlin.jvm.functions.Function3<com.google.android.gms.maps.model.Marker, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> infoWindow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        com.google.maps.android.compose.MarkerNode invoke = this.markerNodeFinder.invoke(marker);
        if (invoke == null || (infoWindow = invoke.getInfoWindow()) == null) {
            return null;
        }
        android.content.Context context = this.mapView.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(context, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-742372995, true, new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.ComposeInfoWindowAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit infoWindow$lambda$0$0;
                infoWindow$lambda$0$0 = com.google.maps.android.compose.ComposeInfoWindowAdapter.getInfoWindow$lambda$0$0(kotlin.jvm.functions.Function3.this, marker, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                return infoWindow$lambda$0$0;
            }
        }));
        com.google.maps.android.compose.MapComposeViewRenderKt.renderComposeViewOnce$default(this.mapView, composeView, null, invoke.getCompositionContext(), 2, null);
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getInfoWindow$lambda$0$0(kotlin.jvm.functions.Function3 function3, com.google.android.gms.maps.model.Marker marker, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-742372995, i, -1, "com.google.maps.android.compose.ComposeInfoWindowAdapter.getInfoWindow.<anonymous>.<anonymous> (ComposeInfoWindowAdapter.kt:62)");
            }
            function3.invoke(marker, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
