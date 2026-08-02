package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012\u001a;\u0010\u001c\u001a\u00020\u001b*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\"\u0018\u0010!\u001a\u00020\u001e*\u00020\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/unit/Dp;", "before", "after", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "paddingFrom", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/MeasureScope;", "p0", "p1", "p2", "Landroidx/compose/ui/layout/Measurable;", "p3", "Landroidx/compose/ui/unit/Constraints;", "p4", "Landroidx/compose/ui/layout/MeasureResult;", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1582paddingFrom4j6BHR0$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.AlignmentLine alignmentLine, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        return m1581paddingFrom4j6BHR0(modifier, alignmentLine, f, f2);
    }

    /* renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1584paddingFromY_r0B1c$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.AlignmentLine alignmentLine, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE();
        }
        return m1583paddingFromY_r0B1c(modifier, alignmentLine, j3, j2);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1586paddingFromBaselineVpY3zN4$default(androidx.compose.ui.Modifier modifier, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM();
        }
        return m1585paddingFromBaselineVpY3zN4(modifier, f, f2);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1588paddingFromBaselinewCyjxdI$default(androidx.compose.ui.Modifier modifier, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE();
        }
        if ((i & 2) != 0) {
            j2 = androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE();
        }
        return m1587paddingFromBaselinewCyjxdI(modifier, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.MeasureResult getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.MeasureScope measureScope, final androidx.compose.ui.layout.AlignmentLine alignmentLine, final float f, float f2, androidx.compose.ui.layout.Measurable measurable, long j) {
        int max;
        int height;
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(getHighSpeedVideoSizes(alignmentLine) ? androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null) : androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
        int i = mo7353measureBRTryo0.get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        int height2 = getHighSpeedVideoSizes(alignmentLine) ? mo7353measureBRTryo0.getHeight() : mo7353measureBRTryo0.getWidth();
        int m8553getMaxHeightimpl = (getHighSpeedVideoSizes(alignmentLine) ? androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) : androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j)) - height2;
        final int coerceIn = kotlin.ranges.RangesKt.coerceIn((!java.lang.Float.isNaN(f) ? measureScope.mo1412roundToPx0680j_4(f) : 0) - i, 0, m8553getMaxHeightimpl);
        final int coerceIn2 = kotlin.ranges.RangesKt.coerceIn(((!java.lang.Float.isNaN(f2) ? measureScope.mo1412roundToPx0680j_4(f2) : 0) - height2) + i, 0, m8553getMaxHeightimpl - coerceIn);
        if (getHighSpeedVideoSizes(alignmentLine)) {
            max = mo7353measureBRTryo0.getWidth();
        } else {
            max = java.lang.Math.max(mo7353measureBRTryo0.getWidth() + coerceIn + coerceIn2, androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j));
        }
        if (getHighSpeedVideoSizes(alignmentLine)) {
            height = java.lang.Math.max(mo7353measureBRTryo0.getHeight() + coerceIn + coerceIn2, androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j));
        } else {
            height = mo7353measureBRTryo0.getHeight();
        }
        final int i2 = height;
        final int i3 = max;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, max, i2, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.AlignmentLineKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.AlignmentLine.this, f, coerceIn, i3, coerceIn2, mo7353measureBRTryo0, i2, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.AlignmentLine alignmentLine, float f, int i, int i2, int i3, androidx.compose.ui.layout.Placeable placeable, int i4, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int width;
        int height;
        if (getHighSpeedVideoSizes(alignmentLine)) {
            width = 0;
        } else {
            width = !androidx.compose.ui.unit.Dp.m8606equalsimpl0(f, androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM()) ? i : (i2 - i3) - placeable.getWidth();
        }
        if (getHighSpeedVideoSizes(alignmentLine)) {
            height = androidx.compose.ui.unit.Dp.m8606equalsimpl0(f, androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM()) ? (i4 - i3) - placeable.getHeight() : i;
        } else {
            height = 0;
        }
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, height, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    private static final boolean getHighSpeedVideoSizes(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        return alignmentLine instanceof androidx.compose.ui.layout.HorizontalAlignmentLine;
    }

    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1581paddingFrom4j6BHR0(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.layout.AlignmentLine alignmentLine, final float f, final float f2) {
        return modifier.then(new androidx.compose.foundation.layout.AlignmentLineOffsetDpElement(alignmentLine, f, f2, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", androidx.compose.ui.layout.AlignmentLine.this);
                inspectorInfo.getProperties().set("before", androidx.compose.ui.unit.Dp.m8599boximpl(f));
                inspectorInfo.getProperties().set("after", androidx.compose.ui.unit.Dp.m8599boximpl(f2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1583paddingFromY_r0B1c(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.layout.AlignmentLine alignmentLine, final long j, final long j2) {
        return modifier.then(new androidx.compose.foundation.layout.AlignmentLineOffsetTextUnitElement(alignmentLine, j, j2, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", androidx.compose.ui.layout.AlignmentLine.this);
                inspectorInfo.getProperties().set("before", androidx.compose.ui.unit.TextUnit.m8785boximpl(j));
                inspectorInfo.getProperties().set("after", androidx.compose.ui.unit.TextUnit.m8785boximpl(j2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1585paddingFromBaselineVpY3zN4(androidx.compose.ui.Modifier modifier, float f, float f2) {
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.Modifier.Companion companion2;
        if (!java.lang.Float.isNaN(f)) {
            companion = m1582paddingFrom4j6BHR0$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f, 0.0f, 4, null);
        } else {
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        androidx.compose.ui.Modifier then = modifier.then(companion);
        if (!java.lang.Float.isNaN(f2)) {
            companion2 = m1582paddingFrom4j6BHR0$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f2, 2, null);
        } else {
            companion2 = androidx.compose.ui.Modifier.INSTANCE;
        }
        return then.then(companion2);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1587paddingFromBaselinewCyjxdI(androidx.compose.ui.Modifier modifier, long j, long j2) {
        androidx.compose.ui.Modifier.Companion m1584paddingFromY_r0B1c$default;
        androidx.compose.ui.Modifier then = modifier.then(androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(j) == 0 ? androidx.compose.ui.Modifier.INSTANCE : m1584paddingFromY_r0B1c$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j, 0L, 4, null));
        if (androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(j2) != 0) {
            m1584paddingFromY_r0B1c$default = m1584paddingFromY_r0B1c$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j2, 2, null);
        } else {
            m1584paddingFromY_r0B1c$default = androidx.compose.ui.Modifier.INSTANCE;
        }
        return then.then(m1584paddingFromY_r0B1c$default);
    }
}
