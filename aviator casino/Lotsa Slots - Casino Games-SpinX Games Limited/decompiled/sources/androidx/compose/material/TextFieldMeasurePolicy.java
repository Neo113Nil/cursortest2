package androidx.compose.material;

/* compiled from: TextField.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J<\u0010\u0011\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\"\u0010\u0014\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u0015\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J/\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u001f\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {
    private final float animationProgress;
    private final androidx.compose.foundation.layout.PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
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
        int i;
        java.lang.Object obj4;
        final int m1575calculateWidthVsPV1Ek;
        final int m1574calculateHeightO3s9Psw;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurables, "measurables");
        final int i2 = measure.mo309roundToPx0680j_4(this.paddingValues.getTop());
        int i3 = measure.mo309roundToPx0680j_4(this.paddingValues.getBottom());
        final int i4 = measure.mo309roundToPx0680j_4(androidx.compose.material.TextFieldKt.getTextFieldTopPadding());
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
        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable != null ? measurable.mo3402measureBRTryo0(m4415copyZbe2FdA$default) : null;
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
        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo02 = measurable2 != null ? measurable2.mo3402measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m4441offsetNN6EwU$default(m4415copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int i5 = -i3;
        int i6 = -(widthOrZero + androidx.compose.material.TextFieldImplKt.widthOrZero(mo3402measureBRTryo02));
        long m4440offsetNN6EwU = androidx.compose.ui.unit.ConstraintsKt.m4440offsetNN6EwU(m4415copyZbe2FdA$default, i6, i5);
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
            i = mo3402measureBRTryo03.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
            if (i == Integer.MIN_VALUE) {
                i = mo3402measureBRTryo03.getHeight();
            }
        } else {
            i = 0;
        }
        final int max = java.lang.Math.max(i, i2);
        long m4440offsetNN6EwU2 = androidx.compose.ui.unit.ConstraintsKt.m4440offsetNN6EwU(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), i6, mo3402measureBRTryo03 != null ? (i5 - i4) - max : (-i2) - i3);
        for (androidx.compose.ui.layout.Measurable measurable4 : list) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable4), androidx.compose.material.TextFieldImplKt.TextFieldId)) {
                final androidx.compose.ui.layout.Placeable mo3402measureBRTryo04 = measurable4.mo3402measureBRTryo0(m4440offsetNN6EwU2);
                long m4415copyZbe2FdA$default2 = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(m4440offsetNN6EwU2, 0, 0, 0, 0, 14, null);
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
                androidx.compose.ui.layout.Placeable mo3402measureBRTryo05 = measurable5 != null ? measurable5.mo3402measureBRTryo0(m4415copyZbe2FdA$default2) : null;
                m1575calculateWidthVsPV1Ek = androidx.compose.material.TextFieldKt.m1575calculateWidthVsPV1Ek(androidx.compose.material.TextFieldImplKt.widthOrZero(mo3402measureBRTryo0), androidx.compose.material.TextFieldImplKt.widthOrZero(mo3402measureBRTryo02), mo3402measureBRTryo04.getWidth(), androidx.compose.material.TextFieldImplKt.widthOrZero(mo3402measureBRTryo03), androidx.compose.material.TextFieldImplKt.widthOrZero(mo3402measureBRTryo05), j);
                m1574calculateHeightO3s9Psw = androidx.compose.material.TextFieldKt.m1574calculateHeightO3s9Psw(mo3402measureBRTryo04.getHeight(), mo3402measureBRTryo03 != null, max, androidx.compose.material.TextFieldImplKt.heightOrZero(mo3402measureBRTryo0), androidx.compose.material.TextFieldImplKt.heightOrZero(mo3402measureBRTryo02), androidx.compose.material.TextFieldImplKt.heightOrZero(mo3402measureBRTryo05), j, measure.getDensity(), this.paddingValues);
                final androidx.compose.ui.layout.Placeable placeable = mo3402measureBRTryo03;
                final int i7 = i;
                final androidx.compose.ui.layout.Placeable placeable2 = mo3402measureBRTryo05;
                return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measure, m1575calculateWidthVsPV1Ek, m1574calculateHeightO3s9Psw, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$measure$1
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
                        boolean z;
                        androidx.compose.foundation.layout.PaddingValues paddingValues;
                        boolean z2;
                        float f;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        if (androidx.compose.ui.layout.Placeable.this != null) {
                            int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i2 - i7, 0);
                            int i8 = m1575calculateWidthVsPV1Ek;
                            int i9 = m1574calculateHeightO3s9Psw;
                            androidx.compose.ui.layout.Placeable placeable3 = mo3402measureBRTryo04;
                            androidx.compose.ui.layout.Placeable placeable4 = androidx.compose.ui.layout.Placeable.this;
                            androidx.compose.ui.layout.Placeable placeable5 = placeable2;
                            androidx.compose.ui.layout.Placeable placeable6 = mo3402measureBRTryo0;
                            androidx.compose.ui.layout.Placeable placeable7 = mo3402measureBRTryo02;
                            z2 = this.singleLine;
                            int i10 = i4 + max;
                            f = this.animationProgress;
                            androidx.compose.material.TextFieldKt.placeWithLabel(layout, i8, i9, placeable3, placeable4, placeable5, placeable6, placeable7, z2, coerceAtLeast, i10, f, measure.getDensity());
                            return;
                        }
                        int i11 = m1575calculateWidthVsPV1Ek;
                        int i12 = m1574calculateHeightO3s9Psw;
                        androidx.compose.ui.layout.Placeable placeable8 = mo3402measureBRTryo04;
                        androidx.compose.ui.layout.Placeable placeable9 = placeable2;
                        androidx.compose.ui.layout.Placeable placeable10 = mo3402measureBRTryo0;
                        androidx.compose.ui.layout.Placeable placeable11 = mo3402measureBRTryo02;
                        z = this.singleLine;
                        float density = measure.getDensity();
                        paddingValues = this.paddingValues;
                        androidx.compose.material.TextFieldKt.placeWithoutLabel(layout, i11, i12, placeable8, placeable9, placeable10, placeable11, z, density, paddingValues);
                    }
                }, 4, null);
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> measurables, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicHeight$1
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
        return intrinsicHeight(intrinsicMeasureScope, measurables, i, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicHeight$1
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
        return intrinsicWidth(measurables, i, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicWidth$1
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
        return intrinsicWidth(measurables, i, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicWidth$1
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
        int m1575calculateWidthVsPV1Ek;
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
                m1575calculateWidthVsPV1Ek = androidx.compose.material.TextFieldKt.m1575calculateWidthVsPV1Ek(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable4 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable4, java.lang.Integer.valueOf(height)).intValue() : 0, androidx.compose.material.TextFieldImplKt.getZeroConstraints());
                return m1575calculateWidthVsPV1Ek;
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
        int m1574calculateHeightO3s9Psw;
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
                m1574calculateHeightO3s9Psw = androidx.compose.material.TextFieldKt.m1574calculateHeightO3s9Psw(intValue, intValue2 > 0, intValue2, intValue4, intValue3, intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, java.lang.Integer.valueOf(i)).intValue() : 0, androidx.compose.material.TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1574calculateHeightO3s9Psw;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
