package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u0015\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u001c¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0000¢\u0006\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,RC\u00101\u001a#\u0012\u0004\u0012\u00020\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180/\u0012\u0004\u0012\u00020\r\u0018\u00010.¢\u0006\u0002\b08\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001d\u0010:\u001a\u0004\u0018\u00010\u00188GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b8\u00109R/\u0010C\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR/\u0010G\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR/\u0010K\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010>\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010BR+\u0010R\u001a\u00020L2\u0006\u0010<\u001a\u00020L8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010>\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010T\u001a\u00020S8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "", "<init>", "()V", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "softWrap", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "", "updateNonMeasureInputs", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZZLandroidx/compose/foundation/text/KeyboardOptions;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutWithNewMeasureInputs--hBUhpc", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Landroidx/compose/ui/text/TextLayoutResult;", "layoutWithNewMeasureInputs", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "coerceInVisibleBounds", "", "getOffsetForPosition-3MmeM6k", "(JZ)I", "getOffsetForPosition", "offset", "isPositionOnText-k-4lQ0M", "(J)Z", "isPositionOnText", "coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation", "(J)J", "coercedInVisibleBoundsOfInputText", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache;", "getHighSpeedVideoSizes", "Lkotlin/Function2;", "Lkotlin/Function0;", "Lkotlin/ExtensionFunctionType;", "onTextLayout", "Lkotlin/jvm/functions/Function2;", "getOnTextLayout", "()Lkotlin/jvm/functions/Function2;", "setOnTextLayout", "(Lkotlin/jvm/functions/Function2;)V", "layoutResult$delegate", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/layout/LayoutCoordinates;", "<set-?>", "textLayoutNodeCoordinates$delegate", "Landroidx/compose/runtime/MutableState;", "getTextLayoutNodeCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setTextLayoutNodeCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "textLayoutNodeCoordinates", "coreNodeCoordinates$delegate", "getCoreNodeCoordinates", "setCoreNodeCoordinates", "coreNodeCoordinates", "decoratorNodeCoordinates$delegate", "getDecoratorNodeCoordinates", "setDecoratorNodeCoordinates", "decoratorNodeCoordinates", "Landroidx/compose/ui/unit/Dp;", "minHeightForSingleLineField$delegate", "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "bringIntoViewRequester", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "getBringIntoViewRequester", "()Landroidx/compose/foundation/relocation/BringIntoViewRequester;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextLayoutState {
    public static final int $stable = 8;
    private final androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester;

    /* renamed from: coreNodeCoordinates$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState coreNodeCoordinates;

    /* renamed from: decoratorNodeCoordinates$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState decoratorNodeCoordinates;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache getHighSpeedVideoSizes;

    /* renamed from: layoutResult$delegate, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache layoutResult;

    /* renamed from: minHeightForSingleLineField$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState minHeightForSingleLineField;
    private kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> onTextLayout;

    /* renamed from: textLayoutNodeCoordinates$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState textLayoutNodeCoordinates;

    public TextLayoutState() {
        androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache textFieldLayoutStateCache = new androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache();
        this.getHighSpeedVideoSizes = textFieldLayoutStateCache;
        this.layoutResult = textFieldLayoutStateCache;
        this.textLayoutNodeCoordinates = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(null, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
        this.coreNodeCoordinates = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(null, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
        this.decoratorNodeCoordinates = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(null, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
        this.minHeightForSingleLineField = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)), null, 2, null);
        this.bringIntoViewRequester = androidx.compose.foundation.relocation.BringIntoViewRequesterKt.BringIntoViewRequester();
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> getOnTextLayout() {
        return this.onTextLayout;
    }

    public final void setOnTextLayout(kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function2) {
        this.onTextLayout = function2;
    }

    public final androidx.compose.ui.text.TextLayoutResult getLayoutResult() {
        return this.layoutResult.getValue();
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getTextLayoutNodeCoordinates() {
        return (androidx.compose.ui.layout.LayoutCoordinates) this.textLayoutNodeCoordinates.getValue();
    }

    public final void setTextLayoutNodeCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.textLayoutNodeCoordinates.setValue(layoutCoordinates);
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getCoreNodeCoordinates() {
        return (androidx.compose.ui.layout.LayoutCoordinates) this.coreNodeCoordinates.getValue();
    }

    public final void setCoreNodeCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.coreNodeCoordinates.setValue(layoutCoordinates);
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getDecoratorNodeCoordinates() {
        return (androidx.compose.ui.layout.LayoutCoordinates) this.decoratorNodeCoordinates.getValue();
    }

    public final void setDecoratorNodeCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.decoratorNodeCoordinates.setValue(layoutCoordinates);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m2258getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((androidx.compose.ui.unit.Dp) this.minHeightForSingleLineField.getValue()).m8615unboximpl();
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m2262setMinHeightForSingleLineField0680j_4(float f) {
        this.minHeightForSingleLineField.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(f));
    }

    public final androidx.compose.foundation.relocation.BringIntoViewRequester getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    public final void updateNonMeasureInputs(androidx.compose.foundation.text.input.internal.TransformedTextFieldState textFieldState, androidx.compose.ui.text.TextStyle textStyle, boolean singleLine, boolean softWrap, androidx.compose.foundation.text.KeyboardOptions keyboardOptions) {
        this.getHighSpeedVideoSizes.updateNonMeasureInputs(textFieldState, textStyle, singleLine, softWrap, keyboardOptions);
    }

    /* renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final androidx.compose.ui.text.TextLayoutResult m2261layoutWithNewMeasureInputshBUhpc(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver, long constraints) {
        androidx.compose.ui.text.TextLayoutResult m2254layoutWithNewMeasureInputshBUhpc = this.getHighSpeedVideoSizes.m2254layoutWithNewMeasureInputshBUhpc(density, layoutDirection, fontFamilyResolver, constraints);
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function2 = this.onTextLayout;
        if (function2 != null) {
            function2.invoke(density, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextLayoutState$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.ui.text.TextLayoutResult value;
                    value = androidx.compose.foundation.text.input.internal.TextLayoutState.this.getHighSpeedVideoSizes.getValue();
                    return value;
                }
            });
        }
        return m2254layoutWithNewMeasureInputshBUhpc;
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m2256getOffsetForPosition3MmeM6k$default(androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return textLayoutState.m2259getOffsetForPosition3MmeM6k(j, z);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m2259getOffsetForPosition3MmeM6k(long position, boolean coerceInVisibleBounds) {
        androidx.compose.ui.text.TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return -1;
        }
        if (coerceInVisibleBounds) {
            position = m2257coercedInVisibleBoundsOfInputTextMKHz9U$foundation(position);
        }
        return layoutResult.m8011getOffsetForPositionk4lQ0M(androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m2264fromDecorationToTextLayoutUv8p0NA(this, position));
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m2260isPositionOnTextk4lQ0M(long offset) {
        androidx.compose.ui.text.TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        long m2264fromDecorationToTextLayoutUv8p0NA = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m2264fromDecorationToTextLayoutUv8p0NA(this, m2257coercedInVisibleBoundsOfInputTextMKHz9U$foundation(offset));
        int lineForVerticalPosition = layoutResult.getLineForVerticalPosition(java.lang.Float.intBitsToFloat((int) (4294967295L & m2264fromDecorationToTextLayoutUv8p0NA)));
        int i = (int) (m2264fromDecorationToTextLayoutUv8p0NA >> 32);
        return java.lang.Float.intBitsToFloat(i) >= layoutResult.getLineLeft(lineForVerticalPosition) && java.lang.Float.intBitsToFloat(i) <= layoutResult.getLineRight(lineForVerticalPosition);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r2 == null) goto L11;
     */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m2257coercedInVisibleBoundsOfInputTextMKHz9U$foundation(long offset) {
        androidx.compose.ui.geometry.Rect zero;
        androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (textLayoutNodeCoordinates.isAttached()) {
                androidx.compose.ui.layout.LayoutCoordinates decoratorNodeCoordinates = getDecoratorNodeCoordinates();
                zero = null;
                if (decoratorNodeCoordinates != null) {
                    zero = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(decoratorNodeCoordinates, textLayoutNodeCoordinates, false, 2, null);
                }
            } else {
                zero = androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
            }
        }
        zero = androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        return androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m2263coerceIn3MmeM6k(offset, zero);
    }
}
