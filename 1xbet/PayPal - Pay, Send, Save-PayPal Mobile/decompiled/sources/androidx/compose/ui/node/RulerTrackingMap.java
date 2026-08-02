package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ?\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000f2 \u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0015J\r\u0010\b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010 R\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/ui/node/RulerTrackingMap;", "", "<init>", "()V", "Landroidx/compose/ui/layout/Ruler;", "p0", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/layout/Ruler;)F", "", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/layout/Ruler;F)V", "", "(Landroidx/compose/ui/layout/Ruler;)Z", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/node/WeakReference;", "Landroidx/compose/ui/node/LayoutNode;", "p2", "(ZLandroidx/compose/ui/node/LookaheadCapablePlaceable;Landroidx/collection/MutableScatterMap;)V", "", com.visa.cbp.getEncExpo.warmup, "", "Camera2StreamConfigurationMap", "[Landroidx/compose/ui/layout/Ruler;", "", "getOutputFormats", "[F", "getHighSpeedVideoSizes", "", "[B", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableScatterSet;", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RulerTrackingMap {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.layout.Ruler[] getHighSpeedVideoFpsRanges = new androidx.compose.ui.layout.Ruler[32];

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private float[] getHighSpeedVideoSizes = new float[32];

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private byte[] getHighSpeedVideoFpsRangesFor = new byte[32];

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.collection.MutableScatterSet<androidx.compose.ui.node.WeakReference<androidx.compose.ui.node.LayoutNode>> Camera2StreamConfigurationMap = androidx.collection.ScatterSetKt.mutableScatterSetOf();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterSet<androidx.compose.ui.layout.Ruler> getInputSizeshNQ4ISI = androidx.collection.ScatterSetKt.mutableScatterSetOf();

    public final float getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Ruler ruler) {
        int indexOf = kotlin.collections.ArraysKt.indexOf(this.getHighSpeedVideoFpsRanges, ruler);
        if (indexOf < 0) {
            return Float.NaN;
        }
        return this.getHighSpeedVideoSizes[indexOf];
    }

    public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Ruler p0, float p1) {
        int indexOf = kotlin.collections.ArraysKt.indexOf(this.getHighSpeedVideoFpsRanges, p0);
        if (indexOf < 0) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.ui.layout.Ruler[] rulerArr = this.getHighSpeedVideoFpsRanges;
            if (i == rulerArr.length) {
                int i2 = i * 2;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(rulerArr, i2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                this.getHighSpeedVideoFpsRanges = (androidx.compose.ui.layout.Ruler[]) copyOf;
                float[] copyOf2 = java.util.Arrays.copyOf(this.getHighSpeedVideoSizes, i2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
                this.getHighSpeedVideoSizes = copyOf2;
                byte[] copyOf3 = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRangesFor, i2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf3, "");
                this.getHighSpeedVideoFpsRangesFor = copyOf3;
            }
            this.getHighSpeedVideoFpsRanges[i] = p0;
            this.getHighSpeedVideoFpsRangesFor[i] = 3;
            this.getHighSpeedVideoSizes[i] = p1;
            this.getHighResolutionOutputSizeshNQ4ISI++;
            return;
        }
        float[] fArr = this.getHighSpeedVideoSizes;
        if (fArr[indexOf] != p1) {
            fArr[indexOf] = p1;
            this.getHighSpeedVideoFpsRangesFor[indexOf] = 1;
        } else {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            if (bArr[indexOf] == 2) {
                bArr[indexOf] = 0;
            }
        }
    }

    public final boolean getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Ruler p0) {
        return kotlin.collections.ArraysKt.contains(this.getHighSpeedVideoFpsRanges, p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getHighSpeedVideoFpsRanges(boolean p0, androidx.compose.ui.node.LookaheadCapablePlaceable p1, androidx.collection.MutableScatterMap<androidx.compose.ui.layout.Ruler, androidx.collection.MutableScatterSet<androidx.compose.ui.node.WeakReference<androidx.compose.ui.node.LayoutNode>>> p2) {
        androidx.compose.ui.node.LayoutNode layoutNode;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = this.getHighSpeedVideoFpsRangesFor[i2];
            if (b == 3) {
                androidx.collection.MutableScatterSet<androidx.compose.ui.layout.Ruler> mutableScatterSet = this.getInputSizeshNQ4ISI;
                androidx.compose.ui.layout.Ruler ruler = this.getHighSpeedVideoFpsRanges[i2];
                kotlin.jvm.internal.Intrinsics.checkNotNull(ruler);
                mutableScatterSet.plusAssign((androidx.collection.MutableScatterSet<androidx.compose.ui.layout.Ruler>) ruler);
            } else if (b != 0 && p2 != null) {
                androidx.compose.ui.layout.Ruler ruler2 = this.getHighSpeedVideoFpsRanges[i2];
                kotlin.jvm.internal.Intrinsics.checkNotNull(ruler2);
                androidx.collection.MutableScatterSet<androidx.compose.ui.node.WeakReference<androidx.compose.ui.node.LayoutNode>> remove = p2.remove(ruler2);
                if (remove != null) {
                    this.Camera2StreamConfigurationMap.plusAssign(remove);
                }
            }
        }
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            if (bArr[i5] == 2) {
                i4++;
            } else if (i4 > 0) {
                androidx.compose.ui.layout.Ruler[] rulerArr = this.getHighSpeedVideoFpsRanges;
                rulerArr[i5 - i4] = rulerArr[i5];
            }
            bArr[i5] = 2;
        }
        int i6 = this.getHighResolutionOutputSizeshNQ4ISI;
        for (int i7 = i6 - i4; i7 < i6; i7++) {
            this.getHighSpeedVideoFpsRanges[i7] = null;
        }
        this.getHighResolutionOutputSizeshNQ4ISI -= i4;
        androidx.compose.ui.node.LookaheadCapablePlaceable parent = p1.getParent();
        androidx.collection.MutableScatterSet<androidx.compose.ui.layout.Ruler> mutableScatterSet2 = this.getInputSizeshNQ4ISI;
        java.lang.Object[] objArr = mutableScatterSet2.elements;
        long[] jArr = mutableScatterSet2.metadata;
        int length = jArr.length - 2;
        long j = 255;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j2 = jArr[i8];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j2 & j) < 128) {
                            (parent == null ? p1 : parent).invalidateChildrenOfDefiningRuler$ui((androidx.compose.ui.layout.Ruler) objArr[(i8 << 3) + i10]);
                        }
                        j2 >>= 8;
                        i10++;
                        j = 255;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                j = 255;
            }
        }
        this.getInputSizeshNQ4ISI.clear();
        androidx.collection.MutableScatterSet<androidx.compose.ui.node.WeakReference<androidx.compose.ui.node.LayoutNode>> mutableScatterSet3 = this.Camera2StreamConfigurationMap;
        java.lang.Object[] objArr2 = mutableScatterSet3.elements;
        long[] jArr2 = mutableScatterSet3.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i11 = 0;
            while (true) {
                long j3 = jArr2[i11];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j3 & 255) < 128 && (layoutNode = (androidx.compose.ui.node.LayoutNode) ((androidx.compose.ui.node.WeakReference) objArr2[(i11 << 3) + i13]).get()) != null) {
                            if (p0) {
                                layoutNode.requestLookaheadRelayout$ui(false);
                            } else {
                                layoutNode.requestRelayout$ui(false);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length2) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.Camera2StreamConfigurationMap.clear();
    }

    public final void getHighResolutionOutputSizeshNQ4ISI() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        for (int i2 = 0; i2 < i; i2++) {
            this.getHighSpeedVideoFpsRanges[i2] = null;
            this.getHighSpeedVideoSizes[i2] = Float.NaN;
            this.getHighSpeedVideoFpsRangesFor[i2] = 0;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }
}
