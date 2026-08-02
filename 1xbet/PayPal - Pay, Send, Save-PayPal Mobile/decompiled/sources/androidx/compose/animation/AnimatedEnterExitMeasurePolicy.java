package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u0011*\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\n\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\u0011*\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\n\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J)\u0010\u0015\u001a\u00020\u0011*\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\n\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\n\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "p0", "<init>", "(Landroidx/compose/animation/AnimatedVisibilityScopeImpl;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "getHighSpeedVideoFpsRanges", "Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AnimatedEnterExitMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public boolean getHighSpeedVideoSizes;
    private final androidx.compose.animation.AnimatedVisibilityScopeImpl getHighSpeedVideoFpsRanges;

    public AnimatedEnterExitMeasurePolicy(androidx.compose.animation.AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
        this.getHighSpeedVideoFpsRanges = animatedVisibilityScopeImpl;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = list.get(i3).mo7353measureBRTryo0(j);
            i = java.lang.Math.max(i, mo7353measureBRTryo0.getWidth());
            i2 = java.lang.Math.max(i2, mo7353measureBRTryo0.getHeight());
            arrayList.add(mo7353measureBRTryo0);
        }
        final java.util.ArrayList arrayList2 = arrayList;
        if (measureScope.isLookingAhead()) {
            this.getHighSpeedVideoSizes = true;
            this.getHighSpeedVideoFpsRanges.getTargetSize$animation().setValue(androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.ui.unit.IntSize.m8767constructorimpl((i << 32) | (4294967295L & i2))));
        } else if (!this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoFpsRanges.getTargetSize$animation().setValue(androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.ui.unit.IntSize.m8767constructorimpl((i << 32) | (4294967295L & i2))));
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, i, i2, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            public final void getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                java.util.List<androidx.compose.ui.layout.Placeable> list2 = arrayList2;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, list2.get(i4), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                getHighSpeedVideoSizes(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int minIntrinsicWidth = list.get(0).minIntrinsicWidth(i);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex > 0) {
            int i2 = 1;
            while (true) {
                int minIntrinsicWidth2 = list.get(i2).minIntrinsicWidth(i);
                if (minIntrinsicWidth2 > minIntrinsicWidth) {
                    minIntrinsicWidth = minIntrinsicWidth2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return minIntrinsicWidth;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int minIntrinsicHeight = list.get(0).minIntrinsicHeight(i);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex > 0) {
            int i2 = 1;
            while (true) {
                int minIntrinsicHeight2 = list.get(i2).minIntrinsicHeight(i);
                if (minIntrinsicHeight2 > minIntrinsicHeight) {
                    minIntrinsicHeight = minIntrinsicHeight2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return minIntrinsicHeight;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int maxIntrinsicWidth = list.get(0).maxIntrinsicWidth(i);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex > 0) {
            int i2 = 1;
            while (true) {
                int maxIntrinsicWidth2 = list.get(i2).maxIntrinsicWidth(i);
                if (maxIntrinsicWidth2 > maxIntrinsicWidth) {
                    maxIntrinsicWidth = maxIntrinsicWidth2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return maxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int maxIntrinsicHeight = list.get(0).maxIntrinsicHeight(i);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex > 0) {
            int i2 = 1;
            while (true) {
                int maxIntrinsicHeight2 = list.get(i2).maxIntrinsicHeight(i);
                if (maxIntrinsicHeight2 > maxIntrinsicHeight) {
                    maxIntrinsicHeight = maxIntrinsicHeight2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return maxIntrinsicHeight;
    }
}
