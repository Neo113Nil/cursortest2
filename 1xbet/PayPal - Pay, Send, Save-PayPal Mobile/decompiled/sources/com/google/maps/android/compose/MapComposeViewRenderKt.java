package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/google/android/gms/maps/MapView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function1;", "Landroid/view/View;", "", "onAddedToWindow", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "renderComposeViewOnce", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/ui/platform/AbstractComposeView;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/CompositionContext;)V", "Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "startRenderingComposeView", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/CompositionContext;)Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "Lcom/google/maps/android/compose/NoDrawContainerView;", "ensureContainerView", "(Lcom/google/android/gms/maps/MapView;)Lcom/google/maps/android/compose/NoDrawContainerView;", "Lcom/google/maps/android/compose/ComposeUiViewRenderer;", "rememberComposeUiViewRenderer", "(Landroidx/compose/runtime/Composer;I)Lcom/google/maps/android/compose/ComposeUiViewRenderer;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapComposeViewRenderKt {
    public static /* synthetic */ void renderComposeViewOnce$default(com.google.android.gms.maps.MapView mapView, androidx.compose.ui.platform.AbstractComposeView abstractComposeView, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.CompositionContext compositionContext, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        renderComposeViewOnce(mapView, abstractComposeView, function1, compositionContext);
    }

    public static final void renderComposeViewOnce(com.google.android.gms.maps.MapView mapView, androidx.compose.ui.platform.AbstractComposeView abstractComposeView, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> function1, androidx.compose.runtime.CompositionContext compositionContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractComposeView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compositionContext, "");
        com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle startRenderingComposeView = startRenderingComposeView(mapView, abstractComposeView, compositionContext);
        try {
            com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle renderHandle = startRenderingComposeView;
            if (function1 != null) {
                function1.invoke(abstractComposeView);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.io.CloseableKt.closeFinally(startRenderingComposeView, null);
        } finally {
        }
    }

    public static final com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle startRenderingComposeView(com.google.android.gms.maps.MapView mapView, final androidx.compose.ui.platform.AbstractComposeView abstractComposeView, androidx.compose.runtime.CompositionContext compositionContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractComposeView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compositionContext, "");
        final com.google.maps.android.compose.NoDrawContainerView ensureContainerView = ensureContainerView(mapView);
        ensureContainerView.addView(abstractComposeView);
        abstractComposeView.setParentCompositionContext(compositionContext);
        return new com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle() { // from class: com.google.maps.android.compose.MapComposeViewRenderKt$startRenderingComposeView$2
            @Override // com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle, java.io.Closeable, java.lang.AutoCloseable
            public final /* bridge */ void close() {
                super.close();
            }

            @Override // com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle
            public final void dispose() {
                com.google.maps.android.compose.NoDrawContainerView.this.removeView(abstractComposeView);
            }
        };
    }

    private static final com.google.maps.android.compose.NoDrawContainerView ensureContainerView(com.google.android.gms.maps.MapView mapView) {
        com.google.maps.android.compose.NoDrawContainerView noDrawContainerView = (com.google.maps.android.compose.NoDrawContainerView) mapView.findViewById(com.google.maps.android.compose.R.id.maps_compose_nodraw_container_view);
        if (noDrawContainerView != null) {
            return noDrawContainerView;
        }
        android.content.Context context = mapView.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        com.google.maps.android.compose.NoDrawContainerView noDrawContainerView2 = new com.google.maps.android.compose.NoDrawContainerView(context);
        noDrawContainerView2.setId(com.google.maps.android.compose.R.id.maps_compose_nodraw_container_view);
        mapView.addView(noDrawContainerView2);
        return noDrawContainerView2;
    }

    public static final com.google.maps.android.compose.ComposeUiViewRenderer rememberComposeUiViewRenderer(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(124209494, i, -1, "com.google.maps.android.compose.rememberComposeUiViewRenderer (MapComposeViewRender.kt:70)");
        }
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "");
        com.google.android.gms.maps.MapView mapView = ((com.google.maps.android.compose.MapApplier) applier).getMapView();
        androidx.compose.runtime.CompositionContext rememberCompositionContext = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(composer, 0);
        boolean changed = composer.changed(rememberCompositionContext);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.google.maps.android.compose.MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1(mapView, rememberCompositionContext);
            composer.updateRememberedValue(rememberedValue);
        }
        com.google.maps.android.compose.MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1 mapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1 = (com.google.maps.android.compose.MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return mapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1;
    }
}
