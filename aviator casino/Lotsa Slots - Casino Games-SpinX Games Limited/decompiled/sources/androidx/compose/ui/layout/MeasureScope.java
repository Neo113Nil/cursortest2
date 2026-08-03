package androidx.compose.ui.layout;

/* compiled from: MeasureScope.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MeasureScope extends androidx.compose.ui.layout.IntrinsicMeasureScope {
    androidx.compose.ui.layout.MeasureResult layout(int width, int height, java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> placementBlock);

    /* compiled from: MeasureScope.kt */
    /* renamed from: androidx.compose.ui.layout.MeasureScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.ui.layout.MeasureResult layout$default(androidx.compose.ui.layout.MeasureScope measureScope, int i, int i2, java.util.Map map, kotlin.jvm.functions.Function1 function1, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
            }
            if ((i3 & 4) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            return measureScope.layout(i, i2, map, function1);
        }

        public static androidx.compose.ui.layout.MeasureResult $default$layout(final androidx.compose.ui.layout.MeasureScope _this, final int i, final int i2, final java.util.Map map, final kotlin.jvm.functions.Function1 function1) {
            if ((i & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & i2) == 0) {
                return new androidx.compose.ui.layout.MeasureResult(i, i2, map, _this, function1) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
                    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> $placementBlock;
                    final /* synthetic */ int $width;
                    private final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines;
                    private final int height;
                    final /* synthetic */ androidx.compose.ui.layout.MeasureScope this$0;
                    private final int width;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.$width = i;
                        this.this$0 = _this;
                        this.$placementBlock = function1;
                        this.width = i;
                        this.height = i2;
                        this.alignmentLines = map;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return this.width;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return this.height;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
                        return this.alignmentLines;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        androidx.compose.ui.layout.MeasureScope measureScope = this.this$0;
                        if (measureScope instanceof androidx.compose.ui.node.LookaheadCapablePlaceable) {
                            this.$placementBlock.invoke(((androidx.compose.ui.node.LookaheadCapablePlaceable) measureScope).getPlacementScope());
                        } else {
                            this.$placementBlock.invoke(new androidx.compose.ui.layout.SimplePlacementScope(this.$width, this.this$0.getLayoutDirection()));
                        }
                    }
                };
            }
            throw new java.lang.IllegalStateException(("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }
    }

    /* compiled from: MeasureScope.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean isLookingAhead(androidx.compose.ui.layout.MeasureScope measureScope) {
            return androidx.compose.ui.layout.IntrinsicMeasureScope.CC.$default$isLookingAhead(measureScope);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3435roundToPxR2X_6o(androidx.compose.ui.layout.MeasureScope measureScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4442$default$roundToPxR2X_6o(measureScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3436roundToPx0680j_4(androidx.compose.ui.layout.MeasureScope measureScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4443$default$roundToPx0680j_4(measureScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3437toDpGaN1DYA(androidx.compose.ui.layout.MeasureScope measureScope, long j) {
            return androidx.compose.ui.unit.FontScaling.CC.m4587$default$toDpGaN1DYA(measureScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3438toDpu2uoSUM(androidx.compose.ui.layout.MeasureScope measureScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4444$default$toDpu2uoSUM(measureScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3439toDpu2uoSUM(androidx.compose.ui.layout.MeasureScope measureScope, int i) {
            return androidx.compose.ui.unit.Density.CC.m4445$default$toDpu2uoSUM((androidx.compose.ui.unit.Density) measureScope, i);
        }

        @java.lang.Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3440toDpSizekrfVVM(androidx.compose.ui.layout.MeasureScope measureScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4446$default$toDpSizekrfVVM(measureScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3441toPxR2X_6o(androidx.compose.ui.layout.MeasureScope measureScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4447$default$toPxR2X_6o(measureScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3442toPx0680j_4(androidx.compose.ui.layout.MeasureScope measureScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4448$default$toPx0680j_4(measureScope, f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.unit.Density.CC.$default$toRect(measureScope, dpRect);
        }

        @java.lang.Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3443toSizeXkaWNTQ(androidx.compose.ui.layout.MeasureScope measureScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4449$default$toSizeXkaWNTQ(measureScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3444toSp0xMU5do(androidx.compose.ui.layout.MeasureScope measureScope, float f) {
            return androidx.compose.ui.unit.FontScaling.CC.m4588$default$toSp0xMU5do(measureScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3445toSpkPz2Gy4(androidx.compose.ui.layout.MeasureScope measureScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4450$default$toSpkPz2Gy4(measureScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3446toSpkPz2Gy4(androidx.compose.ui.layout.MeasureScope measureScope, int i) {
            return androidx.compose.ui.unit.Density.CC.m4451$default$toSpkPz2Gy4((androidx.compose.ui.unit.Density) measureScope, i);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.layout.MeasureResult layout(androidx.compose.ui.layout.MeasureScope measureScope, int i, int i2, java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> map, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> function1) {
            return androidx.compose.ui.layout.MeasureScope.CC.$default$layout(measureScope, i, i2, map, function1);
        }
    }
}
