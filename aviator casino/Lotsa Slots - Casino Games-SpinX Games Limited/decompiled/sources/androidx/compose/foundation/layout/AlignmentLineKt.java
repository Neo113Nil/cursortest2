package androidx.compose.foundation.layout;

/* compiled from: AlignmentLine.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a>\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {com.helpshift.proactive.InAppViewConstants.ORIENTATION_HORIZONTAL, "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", "before", "Landroidx/compose/ui/unit/Dp;", "after", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m445paddingFrom4j6BHR0$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.AlignmentLine alignmentLine, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        return m444paddingFrom4j6BHR0(modifier, alignmentLine, f, f2);
    }

    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m444paddingFrom4j6BHR0(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.layout.AlignmentLine alignmentLine, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.AlignmentLineOffsetDpElement(alignmentLine, f, f2, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", androidx.compose.ui.layout.AlignmentLine.this);
                inspectorInfo.getProperties().set("before", androidx.compose.ui.unit.Dp.m4476boximpl(f));
                inspectorInfo.getProperties().set("after", androidx.compose.ui.unit.Dp.m4476boximpl(f2));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m447paddingFromY_r0B1c$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.AlignmentLine alignmentLine, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE();
        }
        return m446paddingFromY_r0B1c(modifier, alignmentLine, j3, j2);
    }

    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m446paddingFromY_r0B1c(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.layout.AlignmentLine alignmentLine, final long j, final long j2) {
        return modifier.then(new androidx.compose.foundation.layout.AlignmentLineOffsetTextUnitElement(alignmentLine, j, j2, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", androidx.compose.ui.layout.AlignmentLine.this);
                inspectorInfo.getProperties().set("before", androidx.compose.ui.unit.TextUnit.m4663boximpl(j));
                inspectorInfo.getProperties().set("after", androidx.compose.ui.unit.TextUnit.m4663boximpl(j2));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m449paddingFromBaselineVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM();
        }
        return m448paddingFromBaselineVpY3zN4(modifier, f, f2);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m448paddingFromBaselineVpY3zN4(androidx.compose.ui.Modifier modifier, float f, float f2) {
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.Modifier.Companion companion2;
        if (!androidx.compose.ui.unit.Dp.m4483equalsimpl0(f, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM())) {
            companion = m445paddingFrom4j6BHR0$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f, 0.0f, 4, null);
        } else {
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        androidx.compose.ui.Modifier then = modifier.then(companion);
        if (!androidx.compose.ui.unit.Dp.m4483equalsimpl0(f2, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM())) {
            companion2 = m445paddingFrom4j6BHR0$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f2, 2, null);
        } else {
            companion2 = androidx.compose.ui.Modifier.INSTANCE;
        }
        return then.then(companion2);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m451paddingFromBaselinewCyjxdI$default(androidx.compose.ui.Modifier modifier, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE();
        }
        if ((i & 2) != 0) {
            j2 = androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE();
        }
        return m450paddingFromBaselinewCyjxdI(modifier, j, j2);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m450paddingFromBaselinewCyjxdI(androidx.compose.ui.Modifier modifier, long j, long j2) {
        return modifier.then(!androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j) ? m447paddingFromY_r0B1c$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j, 0L, 4, null) : androidx.compose.ui.Modifier.INSTANCE).then(!androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j2) ? m447paddingFromY_r0B1c$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j2, 2, null) : androidx.compose.ui.Modifier.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final androidx.compose.ui.layout.MeasureResult m443alignmentLineOffsetMeasuretjqqzMA(androidx.compose.ui.layout.MeasureScope measureScope, final androidx.compose.ui.layout.AlignmentLine alignmentLine, final float f, float f2, androidx.compose.ui.layout.Measurable measurable, long j) {
        int max;
        int height;
        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(getHorizontal(alignmentLine) ? androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null) : androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
        int i = mo3402measureBRTryo0.get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        int height2 = getHorizontal(alignmentLine) ? mo3402measureBRTryo0.getHeight() : mo3402measureBRTryo0.getWidth();
        int m4423getMaxHeightimpl = (getHorizontal(alignmentLine) ? androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) : androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j)) - height2;
        final int coerceIn = kotlin.ranges.RangesKt.coerceIn((!androidx.compose.ui.unit.Dp.m4483equalsimpl0(f, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) ? measureScope.mo309roundToPx0680j_4(f) : 0) - i, 0, m4423getMaxHeightimpl);
        final int coerceIn2 = kotlin.ranges.RangesKt.coerceIn(((!androidx.compose.ui.unit.Dp.m4483equalsimpl0(f2, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) ? measureScope.mo309roundToPx0680j_4(f2) : 0) - height2) + i, 0, m4423getMaxHeightimpl - coerceIn);
        if (getHorizontal(alignmentLine)) {
            max = mo3402measureBRTryo0.getWidth();
        } else {
            max = java.lang.Math.max(mo3402measureBRTryo0.getWidth() + coerceIn + coerceIn2, androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j));
        }
        final int i2 = max;
        if (getHorizontal(alignmentLine)) {
            height = java.lang.Math.max(mo3402measureBRTryo0.getHeight() + coerceIn + coerceIn2, androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j));
        } else {
            height = mo3402measureBRTryo0.getHeight();
        }
        final int i3 = height;
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, i2, i3, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
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
                boolean horizontal;
                int width;
                boolean horizontal2;
                int height3;
                horizontal = androidx.compose.foundation.layout.AlignmentLineKt.getHorizontal(androidx.compose.ui.layout.AlignmentLine.this);
                if (horizontal) {
                    width = 0;
                } else {
                    width = !androidx.compose.ui.unit.Dp.m4483equalsimpl0(f, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) ? coerceIn : (i2 - coerceIn2) - mo3402measureBRTryo0.getWidth();
                }
                horizontal2 = androidx.compose.foundation.layout.AlignmentLineKt.getHorizontal(androidx.compose.ui.layout.AlignmentLine.this);
                if (horizontal2) {
                    height3 = !androidx.compose.ui.unit.Dp.m4483equalsimpl0(f, androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM()) ? coerceIn : (i3 - coerceIn2) - mo3402measureBRTryo0.getHeight();
                } else {
                    height3 = 0;
                }
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, mo3402measureBRTryo0, width, height3, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        return alignmentLine instanceof androidx.compose.ui.layout.HorizontalAlignmentLine;
    }
}
