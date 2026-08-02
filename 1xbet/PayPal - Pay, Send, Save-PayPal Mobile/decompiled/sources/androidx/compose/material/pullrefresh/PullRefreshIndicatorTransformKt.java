package androidx.compose.material.pullrefresh;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "state", "", "scale", "pullRefreshIndicatorTransform", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/pullrefresh/PullRefreshState;Z)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PullRefreshIndicatorTransformKt {
    public static /* synthetic */ androidx.compose.ui.Modifier pullRefreshIndicatorTransform$default(androidx.compose.ui.Modifier modifier, androidx.compose.material.pullrefresh.PullRefreshState pullRefreshState, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return pullRefreshIndicatorTransform(modifier, pullRefreshState, z);
    }

    public static final androidx.compose.ui.Modifier pullRefreshIndicatorTransform(androidx.compose.ui.Modifier modifier, final androidx.compose.material.pullrefresh.PullRefreshState pullRefreshState, final boolean z) {
        return androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(androidx.compose.ui.draw.DrawModifierKt.drawWithContent(modifier, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt.m2846$r8$lambda$Vk4sP6skgIQuH2m6ghYlw_dGg0(androidx.compose.material.pullrefresh.PullRefreshState.this, z, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        int m5985getIntersectrtfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = contentDrawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6456clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, m5985getIntersectrtfAjoo);
            contentDrawScope.drawContent();
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            throw th;
        }
    }

    /* renamed from: $r8$lambda$Vk4sP6skgIQuH2m6ghY-lw_dGg0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2846$r8$lambda$Vk4sP6skgIQuH2m6ghYlw_dGg0(androidx.compose.material.pullrefresh.PullRefreshState pullRefreshState, boolean z, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setTranslationY(pullRefreshState.getPosition$material() - java.lang.Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L)));
        if (z && !pullRefreshState.getRefreshing$material()) {
            float transform = androidx.compose.animation.core.EasingKt.getLinearOutSlowInEasing().transform(pullRefreshState.getPosition$material() / pullRefreshState.getThreshold$material());
            if (transform < 0.0f) {
                transform = 0.0f;
            }
            if (transform > 1.0f) {
                transform = 1.0f;
            }
            graphicsLayerScope.setScaleX(transform);
            graphicsLayerScope.setScaleY(transform);
        }
        return kotlin.Unit.INSTANCE;
    }
}
