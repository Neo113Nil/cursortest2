package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0086\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "onDependencyRemoved", "Lkotlin/Function0;", "block", "withTracking", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "graphicsLayer", "", "onDependencyAdded", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)Z", "removeDependencies", "(Lkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/collection/MutableScatterSet;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableScatterSet;", "getHighSpeedVideoFpsRangesFor", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChildLayerDependenciesTracker {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.collection.MutableScatterSet<androidx.compose.ui.graphics.layer.GraphicsLayer> getHighSpeedVideoFpsRanges;
    private androidx.compose.ui.graphics.layer.GraphicsLayer getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.collection.MutableScatterSet<androidx.compose.ui.graphics.layer.GraphicsLayer> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.layer.GraphicsLayer Camera2StreamConfigurationMap;

    public final void withTracking(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> onDependencyRemoved, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        this.Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.collection.MutableScatterSet mutableScatterSet = this.getHighSpeedVideoFpsRangesFor;
        if (mutableScatterSet != null && mutableScatterSet.isNotEmpty()) {
            androidx.collection.MutableScatterSet mutableScatterSet2 = this.getHighSpeedVideoFpsRanges;
            if (mutableScatterSet2 == null) {
                mutableScatterSet2 = androidx.collection.ScatterSetKt.mutableScatterSetOf();
                this.getHighSpeedVideoFpsRanges = mutableScatterSet2;
            }
            mutableScatterSet2.addAll(mutableScatterSet);
            mutableScatterSet.clear();
        }
        this.getHighSpeedVideoSizes = true;
        block.invoke();
        this.getHighSpeedVideoSizes = false;
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.Camera2StreamConfigurationMap;
        if (graphicsLayer != null) {
            onDependencyRemoved.invoke(graphicsLayer);
        }
        androidx.collection.MutableScatterSet mutableScatterSet3 = this.getHighSpeedVideoFpsRanges;
        if (mutableScatterSet3 == null || !mutableScatterSet3.isNotEmpty()) {
            return;
        }
        androidx.collection.MutableScatterSet mutableScatterSet4 = mutableScatterSet3;
        java.lang.Object[] objArr = mutableScatterSet4.elements;
        long[] jArr = mutableScatterSet4.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            onDependencyRemoved.invoke(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        mutableScatterSet3.clear();
    }

    public final boolean onDependencyAdded(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer) {
        if (!this.getHighSpeedVideoSizes) {
            androidx.compose.ui.graphics.InlineClassHelperKt.throwIllegalArgumentException("Only add dependencies during a tracking");
        }
        androidx.collection.MutableScatterSet<androidx.compose.ui.graphics.layer.GraphicsLayer> mutableScatterSet = this.getHighSpeedVideoFpsRangesFor;
        if (mutableScatterSet != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(mutableScatterSet);
            mutableScatterSet.add(graphicsLayer);
        } else if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            androidx.collection.MutableScatterSet<androidx.compose.ui.graphics.layer.GraphicsLayer> mutableScatterSetOf = androidx.collection.ScatterSetKt.mutableScatterSetOf();
            androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer2 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(graphicsLayer2);
            mutableScatterSetOf.add(graphicsLayer2);
            mutableScatterSetOf.add(graphicsLayer);
            this.getHighSpeedVideoFpsRangesFor = mutableScatterSetOf;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = graphicsLayer;
        }
        androidx.collection.MutableScatterSet<androidx.compose.ui.graphics.layer.GraphicsLayer> mutableScatterSet2 = this.getHighSpeedVideoFpsRanges;
        if (mutableScatterSet2 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(mutableScatterSet2);
            return !mutableScatterSet2.remove(graphicsLayer);
        }
        if (this.Camera2StreamConfigurationMap != graphicsLayer) {
            return true;
        }
        this.Camera2StreamConfigurationMap = null;
        return false;
    }

    public final void removeDependencies(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> block) {
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (graphicsLayer != null) {
            block.invoke(graphicsLayer);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        androidx.collection.MutableScatterSet mutableScatterSet = this.getHighSpeedVideoFpsRangesFor;
        if (mutableScatterSet != null) {
            androidx.collection.MutableScatterSet mutableScatterSet2 = mutableScatterSet;
            java.lang.Object[] objArr = mutableScatterSet2.elements;
            long[] jArr = mutableScatterSet2.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                block.invoke(objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            mutableScatterSet.clear();
        }
    }
}
