package androidx.compose.ui.text.input;

@kotlin.Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011JI\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010!R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010,R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010,R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u00102\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010,R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u0018\u0010%\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010#\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00109\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010(\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010<R\u0018\u0010+\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010<R\u0014\u00105\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010>R\u0014\u0010:\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010?R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010A"}, d2 = {"Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "", "Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;", "rootPositionCalculator", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "<init>", "(Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;Landroidx/compose/ui/text/input/InputMethodManager;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "", "requestUpdate", "(ZZZZZZ)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "textFieldToRootTransform", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "invalidate", "()V", "getHighResolutionOutputSizeshNQ4ISI", "getOutputSizeshNQ4ISI", "Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;", "getOutputMinFrameDuration", "Landroidx/compose/ui/text/input/InputMethodManager;", "Camera2StreamConfigurationMap", "getOutputStallDuration", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDurationlomOqCM", "Z", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getInputFormats", "getHighSpeedVideoSizesFor", "getOutputFormats", "getInputSizeshNQ4ISI", "getValidOutputFormatsForInputhNQ4ISI", "Landroidx/compose/ui/text/input/TextFieldValue;", "toString", "Landroidx/compose/ui/text/TextLayoutResult;", "getOutputStallDurationlomOqCM", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOutputSizes", "unwrapAs", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/geometry/Rect;", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "[F", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "isOutputSupportedForhNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CursorAnchorInfoController {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.geometry.Rect getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.geometry.Rect getOutputStallDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.ui.text.input.InputMethodManager Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.input.pointer.MatrixPositionCalculator getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private androidx.compose.ui.text.input.OffsetMapping getOutputSizes;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.text.input.TextFieldValue getOutputMinFrameDuration;

    /* renamed from: toString, reason: from kotlin metadata */
    private androidx.compose.ui.text.TextLayoutResult getOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Matrix, kotlin.Unit> getOutputStallDurationlomOqCM = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.Matrix, kotlin.Unit>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        public final void getHighSpeedVideoFpsRangesFor(float[] fArr) {
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.Matrix matrix) {
            getHighSpeedVideoFpsRangesFor(matrix.m6246unboximpl());
            return kotlin.Unit.INSTANCE;
        }
    };

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.view.inputmethod.CursorAnchorInfo.Builder toString = new android.view.inputmethod.CursorAnchorInfo.Builder();

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final float[] unwrapAs = androidx.compose.ui.graphics.Matrix.m6223constructorimpl$default(null, 1, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.graphics.Matrix isOutputSupportedForhNQ4ISI = new android.graphics.Matrix();

    public CursorAnchorInfoController(androidx.compose.ui.input.pointer.MatrixPositionCalculator matrixPositionCalculator, androidx.compose.ui.text.input.InputMethodManager inputMethodManager) {
        this.getHighResolutionOutputSizeshNQ4ISI = matrixPositionCalculator;
        this.Camera2StreamConfigurationMap = inputMethodManager;
    }

    public final void requestUpdate(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoSizesFor = includeInsertionMarker;
            this.getInputFormats = includeCharacterBounds;
            this.getInputSizeshNQ4ISI = includeEditorBounds;
            this.getOutputFormats = includeLineBounds;
            if (immediate) {
                this.getHighSpeedVideoFpsRangesFor = true;
                if (this.getOutputMinFrameDuration != null) {
                    getHighResolutionOutputSizeshNQ4ISI();
                }
            }
            this.getHighSpeedVideoSizes = monitor;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void updateTextLayoutResult(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Matrix, kotlin.Unit> textFieldToRootTransform, androidx.compose.ui.geometry.Rect innerTextFieldBounds, androidx.compose.ui.geometry.Rect decorationBoxBounds) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getOutputMinFrameDuration = textFieldValue;
            this.getOutputSizes = offsetMapping;
            this.getOutputSizeshNQ4ISI = textLayoutResult;
            this.getOutputStallDurationlomOqCM = textFieldToRootTransform;
            this.getOutputStallDuration = innerTextFieldBounds;
            this.getOutputMinFrameDurationlomOqCM = decorationBoxBounds;
            if (this.getHighSpeedVideoFpsRangesFor || this.getHighSpeedVideoSizes) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void invalidate() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getOutputMinFrameDuration = null;
            this.getOutputSizes = null;
            this.getOutputSizeshNQ4ISI = null;
            this.getOutputStallDurationlomOqCM = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.Matrix, kotlin.Unit>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$invalidate$1$1
                public final void getHighSpeedVideoSizes(float[] fArr) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.Matrix matrix) {
                    getHighSpeedVideoSizes(matrix.m6246unboximpl());
                    return kotlin.Unit.INSTANCE;
                }
            };
            this.getOutputStallDuration = null;
            this.getOutputMinFrameDurationlomOqCM = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.Camera2StreamConfigurationMap.isActive()) {
            this.getOutputStallDurationlomOqCM.invoke(androidx.compose.ui.graphics.Matrix.m6221boximpl(this.unwrapAs));
            this.getHighResolutionOutputSizeshNQ4ISI.mo7162localToScreen58bKbWc(this.unwrapAs);
            androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m5864setFromEL8BTi8(this.isOutputSupportedForhNQ4ISI, this.unwrapAs);
            androidx.compose.ui.text.input.InputMethodManager inputMethodManager = this.Camera2StreamConfigurationMap;
            android.view.inputmethod.CursorAnchorInfo.Builder builder = this.toString;
            androidx.compose.ui.text.input.TextFieldValue textFieldValue = this.getOutputMinFrameDuration;
            kotlin.jvm.internal.Intrinsics.checkNotNull(textFieldValue);
            androidx.compose.ui.text.input.OffsetMapping offsetMapping = this.getOutputSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(offsetMapping);
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.getOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(textLayoutResult);
            android.graphics.Matrix matrix = this.isOutputSupportedForhNQ4ISI;
            androidx.compose.ui.geometry.Rect rect = this.getOutputStallDuration;
            kotlin.jvm.internal.Intrinsics.checkNotNull(rect);
            androidx.compose.ui.geometry.Rect rect2 = this.getOutputMinFrameDurationlomOqCM;
            kotlin.jvm.internal.Intrinsics.checkNotNull(rect2);
            inputMethodManager.updateCursorAnchorInfo(androidx.compose.ui.text.input.CursorAnchorInfoBuilder_androidKt.build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, this.getHighSpeedVideoSizesFor, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getOutputFormats));
            this.getHighSpeedVideoFpsRangesFor = false;
        }
    }
}
