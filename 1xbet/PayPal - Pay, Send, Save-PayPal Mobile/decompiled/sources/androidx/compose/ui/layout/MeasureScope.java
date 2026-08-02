package androidx.compose.ui.layout;

@androidx.compose.ui.layout.MeasureScopeMarker
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JN\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJk\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u001b\b\u0002\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/RulerScope;", "rulers", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MeasureScope extends androidx.compose.ui.layout.IntrinsicMeasureScope {

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean isLookingAhead(androidx.compose.ui.layout.MeasureScope measureScope) {
            return androidx.compose.ui.layout.MeasureScope.super.isLookingAhead();
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m7393roundToPxR2X_6o(androidx.compose.ui.layout.MeasureScope measureScope, long j) {
            return androidx.compose.ui.layout.MeasureScope.super.mo1411roundToPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m7394roundToPx0680j_4(androidx.compose.ui.layout.MeasureScope measureScope, float f) {
            return androidx.compose.ui.layout.MeasureScope.super.mo1412roundToPx0680j_4(f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7395toDpGaN1DYA(androidx.compose.ui.layout.MeasureScope measureScope, long j) {
            return androidx.compose.ui.layout.MeasureScope.super.mo1413toDpGaN1DYA(j);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7396toDpu2uoSUM(androidx.compose.ui.layout.MeasureScope measureScope, float f) {
            return androidx.compose.ui.layout.MeasureScope.super.mo1414toDpu2uoSUM(f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7397toDpu2uoSUM(androidx.compose.ui.layout.MeasureScope measureScope, int i) {
            return androidx.compose.ui.layout.MeasureScope.super.mo1415toDpu2uoSUM(i);
        }

        @java.lang.Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m7398toDpSizekrfVVM(androidx.compose.ui.layout.MeasureScope measureScope, long j) {
            return androidx.compose.ui.layout.MeasureScope.super.mo1416toDpSizekrfVVM(j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m7399toPxR2X_6o(androidx.compose.ui.layout.MeasureScope measureScope, long j) {
            return androidx.compose.ui.layout.MeasureScope.super.mo1417toPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m7400toPx0680j_4(androidx.compose.ui.layout.MeasureScope measureScope, float f) {
            return androidx.compose.ui.layout.MeasureScope.super.mo1418toPx0680j_4(f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.layout.MeasureScope.super.toRect(dpRect);
        }

        @java.lang.Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m7401toSizeXkaWNTQ(androidx.compose.ui.layout.MeasureScope measureScope, long j) {
            return androidx.compose.ui.layout.MeasureScope.super.mo1419toSizeXkaWNTQ(j);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7402toSp0xMU5do(androidx.compose.ui.layout.MeasureScope measureScope, float f) {
            return androidx.compose.ui.layout.MeasureScope.super.mo1420toSp0xMU5do(f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7403toSpkPz2Gy4(androidx.compose.ui.layout.MeasureScope measureScope, float f) {
            return androidx.compose.ui.layout.MeasureScope.super.mo1421toSpkPz2Gy4(f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7404toSpkPz2Gy4(androidx.compose.ui.layout.MeasureScope measureScope, int i) {
            return androidx.compose.ui.layout.MeasureScope.super.mo1422toSpkPz2Gy4(i);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.layout.MeasureResult layout(androidx.compose.ui.layout.MeasureScope measureScope, int i, int i2, java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> map, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> function1) {
            return androidx.compose.ui.layout.MeasureScope.super.layout(i, i2, map, function1);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.layout.MeasureResult layout(androidx.compose.ui.layout.MeasureScope measureScope, int i, int i2, java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> map, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.RulerScope, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> function12) {
            return androidx.compose.ui.layout.MeasureScope.super.layout(i, i2, map, function1, function12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.compose.ui.layout.MeasureResult layout$default(androidx.compose.ui.layout.MeasureScope measureScope, int i, int i2, java.util.Map map, kotlin.jvm.functions.Function1 function1, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return measureScope.layout(i, i2, map, function1);
    }

    default androidx.compose.ui.layout.MeasureResult layout(int width, int height, java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> placementBlock) {
        return layout(width, height, alignmentLines, null, placementBlock);
    }

    static /* synthetic */ androidx.compose.ui.layout.MeasureResult layout$default(androidx.compose.ui.layout.MeasureScope measureScope, int i, int i2, java.util.Map map, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Map map2 = map;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        return measureScope.layout(i, i2, map2, function1, function12);
    }

    default androidx.compose.ui.layout.MeasureResult layout(final int width, final int height, final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.RulerScope, kotlin.Unit> rulers, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> placementBlock) {
        if ((width & (-16777216)) != 0 || ((-16777216) & height) != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Size(");
            sb.append(width);
            sb.append(" x ");
            sb.append(height);
            sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        return new androidx.compose.ui.layout.MeasureResult(width, height, alignmentLines, rulers, this, placementBlock) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
            final /* synthetic */ int Camera2StreamConfigurationMap;
            private final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines;
            final /* synthetic */ androidx.compose.ui.layout.MeasureScope getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> getHighSpeedVideoSizes;
            private final int height;
            private final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.RulerScope, kotlin.Unit> rulers;
            private final int width;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.Camera2StreamConfigurationMap = width;
                this.getHighSpeedVideoFpsRangesFor = this;
                this.getHighSpeedVideoSizes = placementBlock;
                this.width = width;
                this.height = height;
                this.alignmentLines = alignmentLines;
                this.rulers = rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.RulerScope, kotlin.Unit> getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void placeChildren() {
                androidx.compose.ui.layout.MeasureScope measureScope = this.getHighSpeedVideoFpsRangesFor;
                if (measureScope instanceof androidx.compose.ui.node.LookaheadCapablePlaceable) {
                    this.getHighSpeedVideoSizes.invoke(((androidx.compose.ui.node.LookaheadCapablePlaceable) measureScope).getPlacementScope());
                } else {
                    this.getHighSpeedVideoSizes.invoke(new androidx.compose.ui.layout.SimplePlacementScope(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.getLayoutDirection(), this.getHighSpeedVideoFpsRangesFor.getCamera2StreamConfigurationMap(), this.getHighSpeedVideoFpsRangesFor.getGetHighSpeedVideoSizes()));
                }
            }
        };
    }
}
