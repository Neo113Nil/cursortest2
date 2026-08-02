package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/google/maps/android/compose/MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1;", "Lcom/google/maps/android/compose/ComposeUiViewRenderer;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "onAddedToWindow", "renderViewOnce", "(Landroidx/compose/ui/platform/AbstractComposeView;Lkotlin/jvm/functions/Function0;)V", "Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "startRenderingView", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1 implements com.google.maps.android.compose.ComposeUiViewRenderer {
    final /* synthetic */ androidx.compose.runtime.CompositionContext $compositionContext;
    final /* synthetic */ com.google.android.gms.maps.MapView $mapView;

    MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1(com.google.android.gms.maps.MapView mapView, androidx.compose.runtime.CompositionContext compositionContext) {
        this.$mapView = mapView;
        this.$compositionContext = compositionContext;
    }

    @Override // com.google.maps.android.compose.ComposeUiViewRenderer
    public final void renderViewOnce(androidx.compose.ui.platform.AbstractComposeView view, final kotlin.jvm.functions.Function0<kotlin.Unit> onAddedToWindow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        com.google.maps.android.compose.MapComposeViewRenderKt.renderComposeViewOnce(this.$mapView, view, onAddedToWindow != null ? new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit renderViewOnce$lambda$0$0;
                renderViewOnce$lambda$0$0 = com.google.maps.android.compose.MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1.renderViewOnce$lambda$0$0(kotlin.jvm.functions.Function0.this, (android.view.View) obj);
                return renderViewOnce$lambda$0$0;
            }
        } : null, this.$compositionContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit renderViewOnce$lambda$0$0(kotlin.jvm.functions.Function0 function0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.google.maps.android.compose.ComposeUiViewRenderer
    public final com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle startRenderingView(androidx.compose.ui.platform.AbstractComposeView view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return com.google.maps.android.compose.MapComposeViewRenderKt.startRenderingComposeView(this.$mapView, view, this.$compositionContext);
    }
}
