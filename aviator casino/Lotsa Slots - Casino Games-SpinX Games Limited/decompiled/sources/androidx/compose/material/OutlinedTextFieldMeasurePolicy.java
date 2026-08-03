package androidx.compose.material;

/* compiled from: OutlinedTextField.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B4\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ8\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0014H\u0002J<\u0010\u0015\u001a\u00020\u000e*\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0017\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0014H\u0002J\"\u0010\u0018\u001a\u00020\u000e*\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\"\u0010\u0019\u001a\u00020\u000e*\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J/\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\"\u0010\"\u001a\u00020\u000e*\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\"\u0010#\u001a\u00020\u000e*\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "onLabelMeasured", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lkotlin/jvm/functions/Function1;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {
    private final float animationProgress;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Size, kotlin.Unit> onLabelMeasured;
    private final androidx.compose.foundation.layout.PaddingValues paddingValues;
    private final boolean singleLine;

    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldMeasurePolicy(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Size, kotlin.Unit> onLabelMeasured, boolean z, float f, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.onLabelMeasured = onLabelMeasured;
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measure, java.util.List<? extends androidx.compose.ui.layout.Measurable> measurables, long j) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        final int m1449calculateWidthVsPV1Ek;
        final int m1448calculateHeightzUg2_y0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurables, "measurables");
        int i = measure.mo309roundToPx0680j_4(this.paddingValues.getBottom());
        long m4415copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list = measurables;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId((androidx.compose.ui.layout.Measurable) obj), androidx.compose.material.TextFieldImplKt.LeadingId)) {
                break;
            }
        }
        androidx.compose.ui.layout.Measurable measurable = (androidx.compose.ui.layout.Measurable) obj;
        androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable != null ? measurable.mo3402measureBRTryo0(m4415copyZbe2FdA$default) : null;
        int widthOrZero = androidx.compose.material.TextFieldImplKt.widthOrZero(mo3402measureBRTryo0);
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId((androidx.compose.ui.layout.Measurable) obj2), androidx.compose.material.TextFieldImplKt.TrailingId)) {
                break;
            }
        }
        androidx.compose.ui.layout.Measurable measurable2 = (androidx.compose.ui.layout.Measurable) obj2;
        androidx.compose.ui.layout.Placeable mo3402measureBRTryo02 = measurable2 != null ? measurable2.mo3402measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m4441offsetNN6EwU$default(m4415copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int i2 = -(widthOrZero + androidx.compose.material.TextFieldImplKt.widthOrZero(mo3402measureBRTryo02));
        int i3 = -i;
        long m4440offsetNN6EwU = androidx.compose.ui.unit.ConstraintsKt.m4440offsetNN6EwU(m4415copyZbe2FdA$default, (i2 - measure.mo309roundToPx0680j_4(this.paddingValues.mo519calculateLeftPaddingu2uoSUM(measure.getLayoutDirection()))) - measure.mo309roundToPx0680j_4(this.paddingValues.mo520calculateRightPaddingu2uoSUM(measure.getLayoutDirection())), i3);
        java.util.Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId((androidx.compose.ui.layout.Measurable) obj3), androidx.compose.material.TextFieldImplKt.LabelId)) {
                break;
            }
        }
        androidx.compose.ui.layout.Measurable measurable3 = (androidx.compose.ui.layout.Measurable) obj3;
        androidx.compose.ui.layout.Placeable mo3402measureBRTryo03 = measurable3 != null ? measurable3.mo3402measureBRTryo0(m4440offsetNN6EwU) : null;
        if (mo3402measureBRTryo03 != null) {
            this.onLabelMeasured.invoke(androidx.compose.ui.geometry.Size.m1928boximpl(androidx.compose.ui.geometry.SizeKt.Size(mo3402measureBRTryo03.getWidth(), mo3402measureBRTryo03.getHeight())));
        }
        long m4415copyZbe2FdA$default2 = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(androidx.compose.ui.unit.ConstraintsKt.m4440offsetNN6EwU(j, i2, i3 - java.lang.Math.max(androidx.compose.material.TextFieldImplKt.heightOrZero(mo3402measureBRTryo03) / 2, measure.mo309roundToPx0680j_4(this.paddingValues.getTop()))), 0, 0, 0, 0, 11, null);
        for (androidx.compose.ui.layout.Measurable measurable4 : list) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable4), androidx.compose.material.TextFieldImplKt.TextFieldId)) {
                final androidx.compose.ui.layout.Placeable mo3402measureBRTryo04 = measurable4.mo3402measureBRTryo0(m4415copyZbe2FdA$default2);
                long m4415copyZbe2FdA$default3 = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(m4415copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                java.util.Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it4.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId((androidx.compose.ui.layout.Measurable) obj4), androidx.compose.material.TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                }
                androidx.compose.ui.layout.Measurable measurable5 = (androidx.compose.ui.layout.Measurable) obj4;
                androidx.compose.ui.layout.Placeable mo3402measureBRTryo05 = measurable5 != null ? measurable5.mo3402measureBRTryo0(m4415copyZbe2FdA$default3) : null;
                m1449calculateWidthVsPV1Ek = androidx.compose.material.OutlinedTextFieldKt.m1449calculateWidthVsPV1Ek(androidx.compose.material.TextFieldImplKt.widthOrZero(mo3402measureBRTryo0), androidx.compose.material.TextFieldImplKt.widthOrZero(mo3402measureBRTryo02), mo3402measureBRTryo04.getWidth(), androidx.compose.material.TextFieldImplKt.widthOrZero(mo3402measureBRTryo03), androidx.compose.material.TextFieldImplKt.widthOrZero(mo3402measureBRTryo05), j);
                m1448calculateHeightzUg2_y0 = androidx.compose.material.OutlinedTextFieldKt.m1448calculateHeightzUg2_y0(androidx.compose.material.TextFieldImplKt.heightOrZero(mo3402measureBRTryo0), androidx.compose.material.TextFieldImplKt.heightOrZero(mo3402measureBRTryo02), mo3402measureBRTryo04.getHeight(), androidx.compose.material.TextFieldImplKt.heightOrZero(mo3402measureBRTryo03), androidx.compose.material.TextFieldImplKt.heightOrZero(mo3402measureBRTryo05), j, measure.getDensity(), this.paddingValues);
                for (androidx.compose.ui.layout.Measurable measurable6 : list) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable6), androidx.compose.material.OutlinedTextFieldKt.BorderId)) {
                        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo06 = measurable6.mo3402measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.Constraints(m1449calculateWidthVsPV1Ek != Integer.MAX_VALUE ? m1449calculateWidthVsPV1Ek : 0, m1449calculateWidthVsPV1Ek, m1448calculateHeightzUg2_y0 != Integer.MAX_VALUE ? m1448calculateHeightzUg2_y0 : 0, m1448calculateHeightzUg2_y0));
                        final androidx.compose.ui.layout.Placeable placeable = mo3402measureBRTryo0;
                        final androidx.compose.ui.layout.Placeable placeable2 = mo3402measureBRTryo02;
                        final androidx.compose.ui.layout.Placeable placeable3 = mo3402measureBRTryo03;
                        final androidx.compose.ui.layout.Placeable placeable4 = mo3402measureBRTryo05;
                        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measure, m1449calculateWidthVsPV1Ek, m1448calculateHeightzUg2_y0, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$measure$2
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
                            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                                float f;
                                boolean z;
                                androidx.compose.foundation.layout.PaddingValues paddingValues;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                int i4 = m1448calculateHeightzUg2_y0;
                                int i5 = m1449calculateWidthVsPV1Ek;
                                androidx.compose.ui.layout.Placeable placeable5 = placeable;
                                androidx.compose.ui.layout.Placeable placeable6 = placeable2;
                                androidx.compose.ui.layout.Placeable placeable7 = mo3402measureBRTryo04;
                                androidx.compose.ui.layout.Placeable placeable8 = placeable3;
                                androidx.compose.ui.layout.Placeable placeable9 = placeable4;
                                androidx.compose.ui.layout.Placeable placeable10 = mo3402measureBRTryo06;
                                f = this.animationProgress;
                                z = this.singleLine;
                                float density = measure.getDensity();
                                androidx.compose.ui.unit.LayoutDirection layoutDirection = measure.getLayoutDirection();
                                paddingValues = this.paddingValues;
                                androidx.compose.material.OutlinedTextFieldKt.place(layout, i4, i5, placeable5, placeable6, placeable7, placeable8, placeable9, placeable10, f, z, density, layoutDirection, paddingValues);
                            }
                        }, 4, null);
                    }
                }
                throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return java.lang.Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(measurables, i, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(measurables, i, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return java.lang.Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i2));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int intrinsicWidth(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int height, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> intrinsicMeasurer) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int m1449calculateWidthVsPV1Ek;
        java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list = measurables;
        for (java.lang.Object obj5 : list) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material.TextFieldImplKt.getLayoutId((androidx.compose.ui.layout.IntrinsicMeasurable) obj5), androidx.compose.material.TextFieldImplKt.TextFieldId)) {
                int intValue = intrinsicMeasurer.invoke(obj5, java.lang.Integer.valueOf(height)).intValue();
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material.TextFieldImplKt.getLayoutId((androidx.compose.ui.layout.IntrinsicMeasurable) obj2), androidx.compose.material.TextFieldImplKt.LabelId)) {
                        break;
                    }
                }
                androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) obj2;
                int intValue2 = intrinsicMeasurable != null ? intrinsicMeasurer.invoke(intrinsicMeasurable, java.lang.Integer.valueOf(height)).intValue() : 0;
                java.util.Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material.TextFieldImplKt.getLayoutId((androidx.compose.ui.layout.IntrinsicMeasurable) obj3), androidx.compose.material.TextFieldImplKt.TrailingId)) {
                        break;
                    }
                }
                androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = (androidx.compose.ui.layout.IntrinsicMeasurable) obj3;
                int intValue3 = intrinsicMeasurable2 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable2, java.lang.Integer.valueOf(height)).intValue() : 0;
                java.util.Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it3.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material.TextFieldImplKt.getLayoutId((androidx.compose.ui.layout.IntrinsicMeasurable) obj4), androidx.compose.material.TextFieldImplKt.LeadingId)) {
                        break;
                    }
                }
                androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable3 = (androidx.compose.ui.layout.IntrinsicMeasurable) obj4;
                int intValue4 = intrinsicMeasurable3 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable3, java.lang.Integer.valueOf(height)).intValue() : 0;
                java.util.Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it4.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material.TextFieldImplKt.getLayoutId((androidx.compose.ui.layout.IntrinsicMeasurable) next), androidx.compose.material.TextFieldImplKt.PlaceholderId)) {
                        obj = next;
                        break;
                    }
                }
                androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable4 = (androidx.compose.ui.layout.IntrinsicMeasurable) obj;
                m1449calculateWidthVsPV1Ek = androidx.compose.material.OutlinedTextFieldKt.m1449calculateWidthVsPV1Ek(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable4 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable4, java.lang.Integer.valueOf(height)).intValue() : 0, androidx.compose.material.TextFieldImplKt.getZeroConstraints());
                return m1449calculateWidthVsPV1Ek;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int intrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> function2) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int m1448calculateHeightzUg2_y0;
        java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list2 = list;
        for (java.lang.Object obj5 : list2) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material.TextFieldImplKt.getLayoutId((androidx.compose.ui.layout.IntrinsicMeasurable) obj5), androidx.compose.material.TextFieldImplKt.TextFieldId)) {
                int intValue = function2.invoke(obj5, java.lang.Integer.valueOf(i)).intValue();
                java.util.Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material.TextFieldImplKt.getLayoutId((androidx.compose.ui.layout.IntrinsicMeasurable) obj2), androidx.compose.material.TextFieldImplKt.LabelId)) {
                        break;
                    }
                }
                androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) obj2;
                int intValue2 = intrinsicMeasurable != null ? function2.invoke(intrinsicMeasurable, java.lang.Integer.valueOf(i)).intValue() : 0;
                java.util.Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material.TextFieldImplKt.getLayoutId((androidx.compose.ui.layout.IntrinsicMeasurable) obj3), androidx.compose.material.TextFieldImplKt.TrailingId)) {
                        break;
                    }
                }
                androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = (androidx.compose.ui.layout.IntrinsicMeasurable) obj3;
                int intValue3 = intrinsicMeasurable2 != null ? function2.invoke(intrinsicMeasurable2, java.lang.Integer.valueOf(i)).intValue() : 0;
                java.util.Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it3.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material.TextFieldImplKt.getLayoutId((androidx.compose.ui.layout.IntrinsicMeasurable) obj4), androidx.compose.material.TextFieldImplKt.LeadingId)) {
                        break;
                    }
                }
                androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable3 = (androidx.compose.ui.layout.IntrinsicMeasurable) obj4;
                int intValue4 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, java.lang.Integer.valueOf(i)).intValue() : 0;
                java.util.Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it4.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material.TextFieldImplKt.getLayoutId((androidx.compose.ui.layout.IntrinsicMeasurable) next), androidx.compose.material.TextFieldImplKt.PlaceholderId)) {
                        obj = next;
                        break;
                    }
                }
                androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable4 = (androidx.compose.ui.layout.IntrinsicMeasurable) obj;
                m1448calculateHeightzUg2_y0 = androidx.compose.material.OutlinedTextFieldKt.m1448calculateHeightzUg2_y0(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, java.lang.Integer.valueOf(i)).intValue() : 0, androidx.compose.material.TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1448calculateHeightzUg2_y0;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
