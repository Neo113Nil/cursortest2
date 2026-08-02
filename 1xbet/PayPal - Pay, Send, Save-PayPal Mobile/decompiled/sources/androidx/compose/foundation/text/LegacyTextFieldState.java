package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJi\u0010#\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\u00020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R+\u0010A\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010@R+\u0010H\u001a\u00020B2\u0006\u0010;\u001a\u00020B8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR(\u0010R\u001a\u0004\u0018\u00010I2\b\u0010M\u001a\u0004\u0018\u00010I8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001c\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T0S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bU\u0010=R(\u0010Z\u001a\u0004\u0018\u00010T2\b\u0010M\u001a\u0004\u0018\u00010T8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R+\u0010f\u001a\u00020`2\u0006\u0010;\u001a\u00020`8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010=\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR+\u0010j\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010=\u001a\u0004\bh\u0010\f\"\u0004\bi\u0010@R+\u0010n\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bk\u0010=\u001a\u0004\bl\u0010\f\"\u0004\bm\u0010@R+\u0010r\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bo\u0010=\u001a\u0004\bp\u0010\f\"\u0004\bq\u0010@R+\u0010v\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bs\u0010=\u001a\u0004\bt\u0010\f\"\u0004\bu\u0010@R$\u0010x\u001a\u00020\n2\u0006\u0010w\u001a\u00020\n8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bx\u0010\fR+\u0010{\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bz\u0010=\u001a\u0004\b{\u0010\f\"\u0004\b|\u0010@R\u0014\u0010~\u001a\u00020}8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR/\u0010\u0083\u0001\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010=\u001a\u0005\b\u0081\u0001\u0010\f\"\u0005\b\u0082\u0001\u0010@R/\u0010\u0087\u0001\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010=\u001a\u0005\b\u0085\u0001\u0010\f\"\u0005\b\u0086\u0001\u0010@R$\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R)\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0007X\u0087\u0004¢\u0006\u000f\n\u0005\b\u001a\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R,\u0010\u008d\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0004\u0012\u00020\u00190\u00178\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u0089\u0001\u001a\u0006\b\u008e\u0001\u0010\u008b\u0001R,\u0010\u008f\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0004\u0012\u00020\n0\u00178\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0089\u0001\u001a\u0006\b\u0090\u0001\u0010\u008b\u0001R \u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R'\u0010 \u001a\u00020\u001f8\u0007@\u0007X\u0087\u000e¢\u0006\u0017\n\u0005\b \u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R3\u0010\u009f\u0001\u001a\u00030\u009b\u00012\u0007\u0010;\u001a\u00030\u009b\u00018G@GX\u0087\u008e\u0002¢\u0006\u0017\n\u0005\b\u009c\u0001\u0010=\u001a\u0006\b\u009d\u0001\u0010\u0098\u0001\"\u0006\b\u009e\u0001\u0010\u009a\u0001R3\u0010£\u0001\u001a\u00030\u009b\u00012\u0007\u0010;\u001a\u00030\u009b\u00018G@GX\u0087\u008e\u0002¢\u0006\u0017\n\u0005\b \u0001\u0010=\u001a\u0006\b¡\u0001\u0010\u0098\u0001\"\u0006\b¢\u0001\u0010\u009a\u0001"}, d2 = {"Landroidx/compose/foundation/text/LegacyTextFieldState;", "", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "<init>", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/runtime/RecomposeScope;Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "", "hasHighlight", "()Z", "Landroidx/compose/ui/text/AnnotatedString;", "untransformedText", "visualText", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "softWrap", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "", "onValueChange", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "update-fnh65Uc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/focus/FocusManager;J)V", "update", "Landroidx/compose/foundation/text/TextDelegate;", "getTextDelegate", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Landroidx/compose/ui/text/input/EditProcessor;", "processor", "Landroidx/compose/ui/text/input/EditProcessor;", "getProcessor", "()Landroidx/compose/ui/text/input/EditProcessor;", "Landroidx/compose/ui/text/input/TextInputSession;", "inputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "<set-?>", "hasFocus$delegate", "Landroidx/compose/runtime/MutableState;", "getHasFocus", "setHasFocus", "(Z)V", "hasFocus", "Landroidx/compose/ui/unit/Dp;", "minHeightForSingleLineField$delegate", "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getHighResolutionOutputSizeshNQ4ISI", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layoutCoordinates", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "getHighSpeedVideoFpsRanges", "getLayoutResult", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setLayoutResult", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "layoutResult", "Landroidx/compose/ui/text/AnnotatedString;", "getUntransformedText", "()Landroidx/compose/ui/text/AnnotatedString;", "setUntransformedText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/foundation/text/HandleState;", "handleState$delegate", "getHandleState", "()Landroidx/compose/foundation/text/HandleState;", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "handleState", "showFloatingToolbar$delegate", "getShowFloatingToolbar", "setShowFloatingToolbar", "showFloatingToolbar", "showSelectionHandleStart$delegate", "getShowSelectionHandleStart", "setShowSelectionHandleStart", "showSelectionHandleStart", "showSelectionHandleEnd$delegate", "getShowSelectionHandleEnd", "setShowSelectionHandleEnd", "showSelectionHandleEnd", "showCursorHandle$delegate", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle", "p0", "isLayoutResultStale", "Z", "isInTouchMode$delegate", "isInTouchMode", "setInTouchMode", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "autofillHighlightOn$delegate", "getAutofillHighlightOn", "setAutofillHighlightOn", "autofillHighlightOn", "justAutofilled$delegate", "getJustAutofilled", "setJustAutofilled", "justAutofilled", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getOnValueChange", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "getOnImeActionPerformed", "onImeActionPerformedWithResult", "getOnImeActionPerformedWithResult", "Landroidx/compose/ui/graphics/Paint;", "highlightPaint", "Landroidx/compose/ui/graphics/Paint;", "getHighlightPaint", "()Landroidx/compose/ui/graphics/Paint;", "J", "getSelectionBackgroundColor-0d7_KjU", "()J", "setSelectionBackgroundColor-8_81llA", "(J)V", "Landroidx/compose/ui/text/TextRange;", "selectionPreviewHighlightRange$delegate", "getSelectionPreviewHighlightRange-d9O1mEE", "setSelectionPreviewHighlightRange-5zc-tL8", "selectionPreviewHighlightRange", "deletionPreviewHighlightRange$delegate", "getDeletionPreviewHighlightRange-d9O1mEE", "setDeletionPreviewHighlightRange-5zc-tL8", "deletionPreviewHighlightRange"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegacyTextFieldState {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: autofillHighlightOn$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState autofillHighlightOn;

    /* renamed from: deletionPreviewHighlightRange$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState deletionPreviewHighlightRange;
    private final androidx.compose.runtime.MutableState<androidx.compose.foundation.text.TextLayoutResultProxy> getHighSpeedVideoFpsRanges;
    private final androidx.compose.foundation.text.KeyboardActionRunner getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.layout.LayoutCoordinates getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: handleState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState handleState;

    /* renamed from: hasFocus$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState hasFocus;
    private final androidx.compose.ui.graphics.Paint highlightPaint;
    private androidx.compose.ui.text.input.TextInputSession inputSession;

    /* renamed from: isInTouchMode$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isInTouchMode;
    private boolean isLayoutResultStale;

    /* renamed from: justAutofilled$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState justAutofilled;
    private final androidx.compose.ui.platform.SoftwareKeyboardController keyboardController;

    /* renamed from: minHeightForSingleLineField$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState minHeightForSingleLineField;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> onImeActionPerformed;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, java.lang.Boolean> onImeActionPerformedWithResult;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange;
    private final androidx.compose.ui.text.input.EditProcessor processor = new androidx.compose.ui.text.input.EditProcessor();
    private final androidx.compose.runtime.RecomposeScope recomposeScope;
    private long selectionBackgroundColor;

    /* renamed from: selectionPreviewHighlightRange$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState selectionPreviewHighlightRange;

    /* renamed from: showCursorHandle$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState showCursorHandle;

    /* renamed from: showFloatingToolbar$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState showFloatingToolbar;

    /* renamed from: showSelectionHandleEnd$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState showSelectionHandleEnd;

    /* renamed from: showSelectionHandleStart$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState showSelectionHandleStart;
    private androidx.compose.foundation.text.TextDelegate textDelegate;
    private androidx.compose.ui.text.AnnotatedString untransformedText;

    public LegacyTextFieldState(androidx.compose.foundation.text.TextDelegate textDelegate, androidx.compose.runtime.RecomposeScope recomposeScope, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController) {
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.keyboardController = softwareKeyboardController;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.hasFocus = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.minHeightForSingleLineField = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)), null, 2, null);
        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.handleState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.foundation.text.HandleState.None, null, 2, null);
        this.showFloatingToolbar = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleStart = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleEnd = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showCursorHandle = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLayoutResultStale = true;
        this.isInTouchMode = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
        this.getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.text.KeyboardActionRunner(softwareKeyboardController);
        this.autofillHighlightOn = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.justAutofilled = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.getHighSpeedVideoSizes = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.LegacyTextFieldState.getHighResolutionOutputSizeshNQ4ISI();
                return highResolutionOutputSizeshNQ4ISI;
            }
        };
        this.onValueChange = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.text.LegacyTextFieldState.getHighSpeedVideoSizes(androidx.compose.foundation.text.LegacyTextFieldState.this, (androidx.compose.ui.text.input.TextFieldValue) obj);
                return highSpeedVideoSizes;
            }
        };
        this.onImeActionPerformed = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.text.LegacyTextFieldState.Camera2StreamConfigurationMap(androidx.compose.foundation.text.LegacyTextFieldState.this, (androidx.compose.ui.text.input.ImeAction) obj);
                return Camera2StreamConfigurationMap;
            }
        };
        this.onImeActionPerformedWithResult = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.LegacyTextFieldState.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.LegacyTextFieldState.this, (androidx.compose.ui.text.input.ImeAction) obj);
                return java.lang.Boolean.valueOf(highSpeedVideoFpsRangesFor);
            }
        };
        this.highlightPaint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
        this.selectionBackgroundColor = androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU();
        this.selectionPreviewHighlightRange = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.text.TextRange.m8027boximpl(androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE()), null, 2, null);
        this.deletionPreviewHighlightRange = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.text.TextRange.m8027boximpl(androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE()), null, 2, null);
    }

    public final androidx.compose.foundation.text.TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final void setTextDelegate(androidx.compose.foundation.text.TextDelegate textDelegate) {
        this.textDelegate = textDelegate;
    }

    public final androidx.compose.runtime.RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    public final androidx.compose.ui.platform.SoftwareKeyboardController getKeyboardController() {
        return this.keyboardController;
    }

    public final androidx.compose.ui.text.input.EditProcessor getProcessor() {
        return this.processor;
    }

    public final androidx.compose.ui.text.input.TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final void setInputSession(androidx.compose.ui.text.input.TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((java.lang.Boolean) this.hasFocus.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m2070getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((androidx.compose.ui.unit.Dp) this.minHeightForSingleLineField.getValue()).m8615unboximpl();
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m2074setMinHeightForSingleLineField0680j_4(float f) {
        this.minHeightForSingleLineField.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(f));
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getLayoutCoordinates() {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.getHighResolutionOutputSizeshNQ4ISI;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final void setLayoutCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.getHighResolutionOutputSizeshNQ4ISI = layoutCoordinates;
    }

    public final androidx.compose.foundation.text.TextLayoutResultProxy getLayoutResult() {
        return this.getHighSpeedVideoFpsRanges.getValue();
    }

    public final void setLayoutResult(androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy) {
        this.getHighSpeedVideoFpsRanges.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    public final androidx.compose.ui.text.AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final void setUntransformedText(androidx.compose.ui.text.AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text.HandleState getHandleState() {
        return (androidx.compose.foundation.text.HandleState) this.handleState.getValue();
    }

    public final void setHandleState(androidx.compose.foundation.text.HandleState handleState) {
        this.handleState.setValue(handleState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowFloatingToolbar() {
        return ((java.lang.Boolean) this.showFloatingToolbar.getValue()).booleanValue();
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.showFloatingToolbar.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleStart() {
        return ((java.lang.Boolean) this.showSelectionHandleStart.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.showSelectionHandleStart.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleEnd() {
        return ((java.lang.Boolean) this.showSelectionHandleEnd.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.showSelectionHandleEnd.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((java.lang.Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle.setValue(java.lang.Boolean.valueOf(z));
    }

    /* renamed from: isLayoutResultStale, reason: from getter */
    public final boolean getIsLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((java.lang.Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    public final void setInTouchMode(boolean z) {
        this.isInTouchMode.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutofillHighlightOn() {
        return ((java.lang.Boolean) this.autofillHighlightOn.getValue()).booleanValue();
    }

    public final void setAutofillHighlightOn(boolean z) {
        this.autofillHighlightOn.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getJustAutofilled() {
        return ((java.lang.Boolean) this.justAutofilled.getValue()).booleanValue();
    }

    public final void setJustAutofilled(boolean z) {
        this.justAutofilled.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> getOnValueChange() {
        return this.onValueChange;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        java.lang.String text = textFieldValue.getText();
        androidx.compose.ui.text.AnnotatedString annotatedString = legacyTextFieldState.untransformedText;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(text, annotatedString != null ? annotatedString.getText() : null)) {
            legacyTextFieldState.setHandleState(androidx.compose.foundation.text.HandleState.None);
            if (legacyTextFieldState.getJustAutofilled()) {
                legacyTextFieldState.setJustAutofilled(false);
            } else {
                legacyTextFieldState.setAutofillHighlightOn(false);
            }
        }
        legacyTextFieldState.m2076setSelectionPreviewHighlightRange5zctL8(androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE());
        legacyTextFieldState.m2073setDeletionPreviewHighlightRange5zctL8(androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE());
        legacyTextFieldState.getHighSpeedVideoSizes.invoke(textFieldValue);
        legacyTextFieldState.recomposeScope.invalidate();
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.ui.text.input.ImeAction imeAction) {
        legacyTextFieldState.getHighSpeedVideoFpsRangesFor.m2056runActionKlQnJC8(imeAction.getGetHighSpeedVideoFpsRanges());
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, java.lang.Boolean> getOnImeActionPerformedWithResult() {
        return this.onImeActionPerformedWithResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.ui.text.input.ImeAction imeAction) {
        return legacyTextFieldState.getHighSpeedVideoFpsRangesFor.m2056runActionKlQnJC8(imeAction.getGetHighSpeedVideoFpsRanges());
    }

    public final androidx.compose.ui.graphics.Paint getHighlightPaint() {
        return this.highlightPaint;
    }

    /* renamed from: getSelectionBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }

    /* renamed from: setSelectionBackgroundColor-8_81llA, reason: not valid java name */
    public final void m2075setSelectionBackgroundColor8_81llA(long j) {
        this.selectionBackgroundColor = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSelectionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m2072getSelectionPreviewHighlightRanged9O1mEE() {
        return ((androidx.compose.ui.text.TextRange) this.selectionPreviewHighlightRange.getValue()).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: setSelectionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m2076setSelectionPreviewHighlightRange5zctL8(long j) {
        this.selectionPreviewHighlightRange.setValue(androidx.compose.ui.text.TextRange.m8027boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDeletionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m2069getDeletionPreviewHighlightRanged9O1mEE() {
        return ((androidx.compose.ui.text.TextRange) this.deletionPreviewHighlightRange.getValue()).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: setDeletionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m2073setDeletionPreviewHighlightRange5zctL8(long j) {
        this.deletionPreviewHighlightRange.setValue(androidx.compose.ui.text.TextRange.m8027boximpl(j));
    }

    public final boolean hasHighlight() {
        return (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2072getSelectionPreviewHighlightRanged9O1mEE()) && androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2069getDeletionPreviewHighlightRanged9O1mEE())) ? false : true;
    }

    /* renamed from: update-fnh65Uc, reason: not valid java name */
    public final void m2077updatefnh65Uc(androidx.compose.ui.text.AnnotatedString untransformedText, androidx.compose.ui.text.AnnotatedString visualText, androidx.compose.ui.text.TextStyle textStyle, boolean softWrap, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange, androidx.compose.foundation.text.KeyboardActions keyboardActions, androidx.compose.ui.focus.FocusManager focusManager, long selectionBackgroundColor) {
        androidx.compose.foundation.text.TextDelegate m2101updateTextDelegaterm0N8CA;
        this.getHighSpeedVideoSizes = onValueChange;
        this.selectionBackgroundColor = selectionBackgroundColor;
        androidx.compose.foundation.text.KeyboardActionRunner keyboardActionRunner = this.getHighSpeedVideoFpsRangesFor;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        this.untransformedText = untransformedText;
        m2101updateTextDelegaterm0N8CA = androidx.compose.foundation.text.TextDelegateKt.m2101updateTextDelegaterm0N8CA(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, (r23 & 32) != 0 ? true : softWrap, (r23 & 64) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8() : 0, (r23 & 128) != 0 ? Integer.MAX_VALUE : 0, (r23 & 256) != 0 ? 1 : 0, kotlin.collections.CollectionsKt.emptyList());
        if (this.textDelegate != m2101updateTextDelegaterm0N8CA) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = m2101updateTextDelegaterm0N8CA;
    }
}
