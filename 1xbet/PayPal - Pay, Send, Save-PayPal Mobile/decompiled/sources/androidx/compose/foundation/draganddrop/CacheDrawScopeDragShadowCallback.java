package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "", "drawDragShadow", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/ui/draw/CacheDrawScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Landroidx/compose/ui/draw/DrawResult;", "cachePicture", "(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheDrawScopeDragShadowCallback {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.layer.GraphicsLayer getHighSpeedVideoFpsRanges;

    public final void drawDragShadow(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.getHighSpeedVideoFpsRanges;
        if (graphicsLayer == null) {
            throw new java.lang.IllegalArgumentException("No cached drag shadow. Check if the drag source node was rendered first");
        }
        androidx.compose.ui.graphics.layer.GraphicsLayerKt.drawLayer(drawScope, graphicsLayer);
    }

    public final androidx.compose.ui.draw.DrawResult cachePicture(androidx.compose.ui.draw.CacheDrawScope scope) {
        androidx.compose.ui.graphics.layer.GraphicsLayer obtainGraphicsLayer = scope.obtainGraphicsLayer();
        androidx.compose.ui.draw.CacheDrawScope.m5553recordTdoYBX4$default(scope, obtainGraphicsLayer, null, null, 0L, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback.$r8$lambda$Uc502JhJAN_At3kmQ4ortvfz2kc((androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj);
            }
        }, 7, null);
        this.getHighSpeedVideoFpsRanges = obtainGraphicsLayer;
        return scope.onDrawWithContent(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback.m1406$r8$lambda$WcrtWHLv1feneYDi8FHqUXWkTs(androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback.this, (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Uc502JhJAN_At3kmQ4ortvfz2kc(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WcrtWHLv1feneYDi8FHqUX-WkTs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1406$r8$lambda$WcrtWHLv1feneYDi8FHqUXWkTs(androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback, androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = cacheDrawScopeDragShadowCallback.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(graphicsLayer);
        androidx.compose.ui.graphics.layer.GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer);
        return kotlin.Unit.INSTANCE;
    }
}
