package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0007@GX\u0086\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/draw/ScopedGraphicsContext;", "Landroidx/compose/ui/graphics/GraphicsContext;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "createGraphicsLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "p0", "", "releaseGraphicsLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableObjectList;", "Camera2StreamConfigurationMap", "Landroidx/collection/MutableObjectList;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/graphics/GraphicsContext;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/shadow/ShadowContext;", "getShadowContext", "()Landroidx/compose/ui/graphics/shadow/ShadowContext;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ScopedGraphicsContext implements androidx.compose.ui.graphics.GraphicsContext {
    private androidx.collection.MutableObjectList<androidx.compose.ui.graphics.layer.GraphicsLayer> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    androidx.compose.ui.graphics.GraphicsContext getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final androidx.compose.ui.graphics.layer.GraphicsLayer createGraphicsLayer() {
        androidx.compose.ui.graphics.GraphicsContext graphicsContext = this.getHighSpeedVideoSizes;
        if (graphicsContext == null) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("GraphicsContext not provided");
        }
        androidx.compose.ui.graphics.layer.GraphicsLayer createGraphicsLayer = graphicsContext.createGraphicsLayer();
        androidx.collection.MutableObjectList<androidx.compose.ui.graphics.layer.GraphicsLayer> mutableObjectList = this.Camera2StreamConfigurationMap;
        if (mutableObjectList == null) {
            this.Camera2StreamConfigurationMap = androidx.collection.ObjectListKt.mutableObjectListOf(createGraphicsLayer);
            return createGraphicsLayer;
        }
        mutableObjectList.add(createGraphicsLayer);
        return createGraphicsLayer;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final void releaseGraphicsLayer(androidx.compose.ui.graphics.layer.GraphicsLayer p0) {
        androidx.compose.ui.graphics.GraphicsContext graphicsContext = this.getHighSpeedVideoSizes;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(p0);
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final androidx.compose.ui.graphics.shadow.ShadowContext getShadowContext() {
        androidx.compose.ui.graphics.GraphicsContext graphicsContext = this.getHighSpeedVideoSizes;
        if (graphicsContext == null) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("GraphicsContext not provided");
        }
        return graphicsContext.getShadowContext();
    }

    public final void getHighSpeedVideoFpsRangesFor() {
        androidx.collection.MutableObjectList<androidx.compose.ui.graphics.layer.GraphicsLayer> mutableObjectList = this.Camera2StreamConfigurationMap;
        if (mutableObjectList != null) {
            androidx.collection.MutableObjectList<androidx.compose.ui.graphics.layer.GraphicsLayer> mutableObjectList2 = mutableObjectList;
            java.lang.Object[] objArr = mutableObjectList2.content;
            int i = mutableObjectList2._size;
            for (int i2 = 0; i2 < i; i2++) {
                releaseGraphicsLayer((androidx.compose.ui.graphics.layer.GraphicsLayer) objArr[i2]);
            }
            mutableObjectList.clear();
        }
    }
}
