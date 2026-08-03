package androidx.compose.foundation.layout;

/* compiled from: Box.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J,\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/BoxMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "alignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "", "(Landroidx/compose/ui/Alignment;Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class BoxMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {
    private final androidx.compose.ui.Alignment alignment;
    private final boolean propagateMinConstraints;

    /* renamed from: component1, reason: from getter */
    private final androidx.compose.ui.Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getPropagateMinConstraints() {
        return this.propagateMinConstraints;
    }

    public static /* synthetic */ androidx.compose.foundation.layout.BoxMeasurePolicy copy$default(androidx.compose.foundation.layout.BoxMeasurePolicy boxMeasurePolicy, androidx.compose.ui.Alignment alignment, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            alignment = boxMeasurePolicy.alignment;
        }
        if ((i & 2) != 0) {
            z = boxMeasurePolicy.propagateMinConstraints;
        }
        return boxMeasurePolicy.copy(alignment, z);
    }

    public final androidx.compose.foundation.layout.BoxMeasurePolicy copy(androidx.compose.ui.Alignment alignment, boolean propagateMinConstraints) {
        return new androidx.compose.foundation.layout.BoxMeasurePolicy(alignment, propagateMinConstraints);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.layout.BoxMeasurePolicy)) {
            return false;
        }
        androidx.compose.foundation.layout.BoxMeasurePolicy boxMeasurePolicy = (androidx.compose.foundation.layout.BoxMeasurePolicy) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.propagateMinConstraints);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i) {
        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    public java.lang.String toString() {
        return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
    }

    public BoxMeasurePolicy(androidx.compose.ui.Alignment alignment, boolean z) {
        this.alignment = alignment;
        this.propagateMinConstraints = z;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, final java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        boolean matchesParentSize;
        boolean matchesParentSize2;
        boolean matchesParentSize3;
        int m4426getMinWidthimpl;
        int m4425getMinHeightimpl;
        androidx.compose.ui.layout.Placeable mo3402measureBRTryo0;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return kotlin.Unit.INSTANCE;
                }
            }, 4, null);
        }
        long m4415copyZbe2FdA$default = this.propagateMinConstraints ? j : androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        if (list.size() == 1) {
            final androidx.compose.ui.layout.Measurable measurable = list.get(0);
            matchesParentSize3 = androidx.compose.foundation.layout.BoxKt.getMatchesParentSize(measurable);
            if (!matchesParentSize3) {
                mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(m4415copyZbe2FdA$default);
                m4426getMinWidthimpl = java.lang.Math.max(androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), mo3402measureBRTryo0.getWidth());
                m4425getMinHeightimpl = java.lang.Math.max(androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), mo3402measureBRTryo0.getHeight());
            } else {
                m4426getMinWidthimpl = androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j);
                m4425getMinHeightimpl = androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j);
                mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m4432fixedJhjzzOo(androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j)));
            }
            final int i = m4426getMinWidthimpl;
            final int i2 = m4425getMinHeightimpl;
            final androidx.compose.ui.layout.Placeable placeable = mo3402measureBRTryo0;
            return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, i, i2, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    androidx.compose.ui.Alignment alignment;
                    androidx.compose.ui.layout.Placeable placeable2 = androidx.compose.ui.layout.Placeable.this;
                    androidx.compose.ui.layout.Measurable measurable2 = measurable;
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                    int i3 = i;
                    int i4 = i2;
                    alignment = this.alignment;
                    androidx.compose.foundation.layout.BoxKt.placeInBox(placementScope, placeable2, measurable2, layoutDirection, i3, i4, alignment);
                }
            }, 4, null);
        }
        final androidx.compose.ui.layout.Placeable[] placeableArr = new androidx.compose.ui.layout.Placeable[list.size()];
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        intRef.element = androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j);
        final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
        intRef2.element = androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.Measurable measurable2 = list.get(i3);
            matchesParentSize2 = androidx.compose.foundation.layout.BoxKt.getMatchesParentSize(measurable2);
            if (matchesParentSize2) {
                z = true;
            } else {
                androidx.compose.ui.layout.Placeable mo3402measureBRTryo02 = measurable2.mo3402measureBRTryo0(m4415copyZbe2FdA$default);
                placeableArr[i3] = mo3402measureBRTryo02;
                intRef.element = java.lang.Math.max(intRef.element, mo3402measureBRTryo02.getWidth());
                intRef2.element = java.lang.Math.max(intRef2.element, mo3402measureBRTryo02.getHeight());
            }
        }
        if (z) {
            long Constraints = androidx.compose.ui.unit.ConstraintsKt.Constraints(intRef.element != Integer.MAX_VALUE ? intRef.element : 0, intRef.element, intRef2.element != Integer.MAX_VALUE ? intRef2.element : 0, intRef2.element);
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                androidx.compose.ui.layout.Measurable measurable3 = list.get(i4);
                matchesParentSize = androidx.compose.foundation.layout.BoxKt.getMatchesParentSize(measurable3);
                if (matchesParentSize) {
                    placeableArr[i4] = measurable3.mo3402measureBRTryo0(Constraints);
                }
            }
        }
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, intRef.element, intRef2.element, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.ui.Alignment alignment;
                androidx.compose.ui.layout.Placeable[] placeableArr2 = placeableArr;
                java.util.List<androidx.compose.ui.layout.Measurable> list2 = list;
                androidx.compose.ui.layout.MeasureScope measureScope2 = measureScope;
                kotlin.jvm.internal.Ref.IntRef intRef3 = intRef;
                kotlin.jvm.internal.Ref.IntRef intRef4 = intRef2;
                androidx.compose.foundation.layout.BoxMeasurePolicy boxMeasurePolicy = this;
                int length = placeableArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    androidx.compose.ui.layout.Placeable placeable2 = placeableArr2[i5];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(placeable2, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    androidx.compose.ui.layout.Measurable measurable4 = list2.get(i6);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = measureScope2.getLayoutDirection();
                    int i7 = intRef3.element;
                    int i8 = intRef4.element;
                    alignment = boxMeasurePolicy.alignment;
                    androidx.compose.foundation.layout.BoxKt.placeInBox(placementScope, placeable2, measurable4, layoutDirection, i7, i8, alignment);
                    i5++;
                    i6++;
                }
            }
        }, 4, null);
    }
}
