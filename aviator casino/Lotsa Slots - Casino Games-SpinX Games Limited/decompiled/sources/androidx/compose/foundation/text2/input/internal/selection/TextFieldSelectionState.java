package androidx.compose.foundation.text2.input.internal.selection;

/* compiled from: TextFieldSelectionState.kt */
@kotlin.Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010Z\u001a\u00020[H\u0002J\u0010\u0010\\\u001a\u00020[2\b\b\u0002\u0010]\u001a\u00020\tJ\u0006\u0010^\u001a\u00020[J\u0006\u0010_\u001a\u00020[J\u0006\u0010`\u001a\u00020[J\b\u0010a\u001a\u00020\u001eH\u0002J\u001d\u0010b\u001a\u00020\u00102\u0006\u0010c\u001a\u00020\tH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u00142\u0006\u0010c\u001a\u00020\tH\u0002J<\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020:2\u0006\u0010j\u001a\u00020:2\b\u0010k\u001a\u0004\u0018\u00010h2\u0006\u0010c\u001a\u00020\t2\u0006\u0010l\u001a\u00020mH\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010oJ\b\u0010p\u001a\u00020[H\u0002J\b\u0010q\u001a\u00020[H\u0002J\u000e\u0010r\u001a\u00020[H\u0086@¢\u0006\u0002\u0010sJ\u000e\u0010t\u001a\u00020[H\u0082@¢\u0006\u0002\u0010sJ\u000e\u0010u\u001a\u00020[H\u0082@¢\u0006\u0002\u0010sJ\u0006\u0010v\u001a\u00020[J\u0010\u0010w\u001a\u00020[2\u0006\u0010x\u001a\u00020\u001eH\u0002J6\u0010y\u001a\u00020[2\u0006\u00102\u001a\u0002032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020R2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\"\u0010z\u001a\u00020[2\u0006\u0010{\u001a\u00020#2\u0006\u0010|\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b}\u0010~JN\u0010\u007f\u001a\u00020h2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020:2\u0007\u0010\u0083\u0001\u001a\u00020:2\u0006\u0010c\u001a\u00020\t2\u0006\u0010l\u001a\u00020m2\t\b\u0002\u0010\u0084\u0001\u001a\u00020\tH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u000f\u0010\u0087\u0001\u001a\u00020[2\u0006\u0010T\u001a\u00020SJ\u0015\u0010\u0088\u0001\u001a\u00020[*\u00030\u0089\u0001H\u0086@¢\u0006\u0003\u0010\u008a\u0001J\u0015\u0010\u008b\u0001\u001a\u00020[*\u00030\u0089\u0001H\u0082@¢\u0006\u0003\u0010\u008a\u0001J\u001d\u0010\u008c\u0001\u001a\u00020[*\u00030\u0089\u00012\u0006\u0010c\u001a\u00020\tH\u0082@¢\u0006\u0003\u0010\u008d\u0001J%\u0010\u008e\u0001\u001a\u00020[*\u00030\u0089\u00012\u000e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020[0\u0090\u0001H\u0082@¢\u0006\u0003\u0010\u0091\u0001J5\u0010\u0092\u0001\u001a\u00020[*\u00030\u0089\u00012\u000e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020[0\u0090\u00012\u000e\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020[0\u0090\u0001H\u0082@¢\u0006\u0003\u0010\u0094\u0001J\u0015\u0010\u0095\u0001\u001a\u00020[*\u00030\u0089\u0001H\u0082@¢\u0006\u0003\u0010\u008a\u0001J\u001d\u0010\u0096\u0001\u001a\u00020[*\u00030\u0089\u00012\u0006\u0010c\u001a\u00020\tH\u0086@¢\u0006\u0003\u0010\u008d\u0001J5\u0010\u0097\u0001\u001a\u00020[*\u00030\u0089\u00012\u000e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020[0\u0090\u00012\u000e\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020[0\u0090\u0001H\u0086@¢\u0006\u0003\u0010\u0094\u0001R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R/\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010#8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001bR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010-\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0018\u001a\u0004\b.\u0010\u0016R\u0017\u00100\u001a\u00020\u00108Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b1\u0010\u0012R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u001b\"\u0004\b4\u00105R+\u00106\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u00105R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R1\u0010=\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00108B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bA\u0010*\u001a\u0004\b>\u0010\u0012\"\u0004\b?\u0010@R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010B\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010*\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u00105R1\u0010F\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00108B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bI\u0010*\u001a\u0004\bG\u0010\u0012\"\u0004\bH\u0010@R\u001b\u0010J\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u0018\u001a\u0004\bK\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010M\u001a\u0004\u0018\u00010N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Q\u001a\u0004\u0018\u00010RX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010T\u001a\u00020S2\u0006\u0010\"\u001a\u00020S8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010*\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0098\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "density", "Landroidx/compose/ui/unit/Density;", "enabled", "", "readOnly", "isFocused", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZ)V", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "currentContentVisibleOffset", "Landroidx/compose/ui/geometry/Offset;", "getCurrentContentVisibleOffset-F1C5BW0", "()J", "cursorHandle", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;", "getCursorHandle", "()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;", "cursorHandle$delegate", "Landroidx/compose/runtime/State;", "cursorHandleInBounds", "getCursorHandleInBounds", "()Z", "cursorHandleInBounds$delegate", "cursorRect", "Landroidx/compose/ui/geometry/Rect;", "getCursorRect", "()Landroidx/compose/ui/geometry/Rect;", "cursorRect$delegate", "<set-?>", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "Landroidx/compose/runtime/MutableState;", "editable", "getEditable", "endSelectionHandle", "getEndSelectionHandle", "endSelectionHandle$delegate", "handleDragPosition", "getHandleDragPosition-F1C5BW0", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setFocused", "(Z)V", "isInTouchMode", "setInTouchMode", "isInTouchMode$delegate", "previousRawDragOffset", "", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "rawHandleDragPosition", "getRawHandleDragPosition-F1C5BW0", "setRawHandleDragPosition-k-4lQ0M", "(J)V", "rawHandleDragPosition$delegate", "showCursorHandle", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle$delegate", "startContentVisibleOffset", "getStartContentVisibleOffset-F1C5BW0", "setStartContentVisibleOffset-k-4lQ0M", "startContentVisibleOffset$delegate", "startSelectionHandle", "getStartSelectionHandle", "startSelectionHandle$delegate", "textLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getTextLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;", "textToolbarState", "getTextToolbarState", "()Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;", "setTextToolbarState", "(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V", "textToolbarState$delegate", "clearHandleDragging", "", "copy", "cancelSelection", "cut", "deselect", "dispose", "getContentRect", "getHandlePosition", "isStartHandle", "getHandlePosition-tuRUvjQ", "(Z)J", "getSelectionHandleState", "getTextFieldSelection", "Landroidx/compose/ui/text/TextRange;", "rawStartOffset", "rawEndOffset", "previousSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getTextFieldSelection-qeG_v_k", "(IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J", "hideTextToolbar", "markStartContentVisibleOffset", "observeChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeTextChanges", "observeTextToolbarVisibility", "paste", "showTextToolbar", "contentRect", "update", "updateHandleDragging", "handle", "position", "updateHandleDragging-Uv8p0NA", "(Landroidx/compose/foundation/text/Handle;J)V", "updateSelection", "textFieldCharSequence", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "startOffset", "endOffset", "allowPreviousSelectionCollapsed", "updateSelection-QNhciaU", "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "updateTextToolbarState", "cursorHandleGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectCursorHandleDragGestures", "detectSelectionHandleDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTextFieldLongPressAndAfterDrag", "requestFocus", "Lkotlin/Function0;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTextFieldTapGestures", "showKeyboard", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTouchMode", "selectionHandleGestures", "textFieldGestures", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionState {
    public static final int $stable = 8;
    private androidx.compose.ui.platform.ClipboardManager clipboardManager;
    private androidx.compose.ui.unit.Density density;
    private boolean enabled;
    private androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedBack;
    private boolean isFocused;
    private androidx.compose.foundation.text.selection.SelectionLayout previousSelectionLayout;
    private boolean readOnly;
    private final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState;
    private final androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
    private androidx.compose.ui.platform.TextToolbar textToolbar;

    /* renamed from: isInTouchMode$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isInTouchMode = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);

    /* renamed from: startContentVisibleOffset$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState startContentVisibleOffset = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0()), null, 2, null);

    /* renamed from: rawHandleDragPosition$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState rawHandleDragPosition = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0()), null, 2, null);

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState draggingHandle = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: showCursorHandle$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState showCursorHandle = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: textToolbarState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState textToolbarState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None, null, 2, null);
    private int previousRawDragOffset = -1;

    /* renamed from: cursorHandle$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State cursorHandle = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandle$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        
            if (r0 != false) goto L12;
         */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState invoke() {
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
            boolean showCursorHandle;
            boolean cursorHandleInBounds;
            transformedTextFieldState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textFieldState;
            androidx.compose.foundation.text2.input.TextFieldCharSequence text = transformedTextFieldState.getText();
            showCursorHandle = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getShowCursorHandle();
            if (showCursorHandle && androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(text.getSelectionInChars()) && text.length() > 0) {
                if (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getDraggingHandle() != androidx.compose.foundation.text.Handle.Cursor) {
                    cursorHandleInBounds = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getCursorHandleInBounds();
                }
                return new androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState(true, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getCursorRect().m1898getBottomCenterF1C5BW0(), androidx.compose.ui.text.style.ResolvedTextDirection.Ltr, false, null);
            }
            return androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState.INSTANCE.getHidden();
        }
    });

    /* renamed from: cursorHandleInBounds$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State cursorHandleInBounds = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy(), new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleInBounds$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Boolean invoke() {
            androidx.compose.ui.layout.LayoutCoordinates textLayoutCoordinates;
            androidx.compose.ui.geometry.Rect visibleBounds;
            androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this;
            androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
            try {
                androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    long m1898getBottomCenterF1C5BW0 = textFieldSelectionState.getCursorRect().m1898getBottomCenterF1C5BW0();
                    createNonObservableSnapshot.dispose();
                    textLayoutCoordinates = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getTextLayoutCoordinates();
                    return java.lang.Boolean.valueOf((textLayoutCoordinates == null || (visibleBounds = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) ? false : androidx.compose.foundation.text.selection.SelectionManagerKt.m1055containsInclusiveUv8p0NA(visibleBounds, m1898getBottomCenterF1C5BW0));
                } finally {
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                }
            } catch (java.lang.Throwable th) {
                createNonObservableSnapshot.dispose();
                throw th;
            }
        }
    });

    /* renamed from: cursorRect$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State cursorRect = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorRect$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.geometry.Rect invoke() {
            androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
            androidx.compose.ui.unit.Density density;
            float right;
            textLayoutState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textLayoutState;
            androidx.compose.ui.text.TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
            if (layoutResult == null) {
                return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
            }
            transformedTextFieldState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textFieldState;
            androidx.compose.foundation.text2.input.TextFieldCharSequence text = transformedTextFieldState.getText();
            if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(text.getSelectionInChars())) {
                return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
            }
            androidx.compose.ui.geometry.Rect cursorRect = layoutResult.getCursorRect(androidx.compose.ui.text.TextRange.m3964getStartimpl(text.getSelectionInChars()));
            density = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.density;
            float mo315toPx0680j_4 = density.mo315toPx0680j_4(androidx.compose.foundation.text.TextFieldCursorKt.getDefaultCursorThickness());
            if (layoutResult.getLayoutInput().getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                right = cursorRect.getLeft() + (mo315toPx0680j_4 / 2);
            } else {
                right = cursorRect.getRight() - (mo315toPx0680j_4 / 2);
            }
            float f = mo315toPx0680j_4 / 2;
            float coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(kotlin.ranges.RangesKt.coerceAtMost(right, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(layoutResult.getSize()) - f), f);
            return new androidx.compose.ui.geometry.Rect(coerceAtLeast - f, cursorRect.getTop(), coerceAtLeast + f, cursorRect.getBottom());
        }
    });

    /* renamed from: startSelectionHandle$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State startSelectionHandle = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$startSelectionHandle$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState invoke() {
            androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState selectionHandleState;
            selectionHandleState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getSelectionHandleState(true);
            return selectionHandleState;
        }
    });

    /* renamed from: endSelectionHandle$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State endSelectionHandle = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$endSelectionHandle$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState invoke() {
            androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState selectionHandleState;
            selectionHandleState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getSelectionHandleState(false);
            return selectionHandleState;
        }
    });

    public TextFieldSelectionState(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, androidx.compose.ui.unit.Density density, boolean z, boolean z2, boolean z3) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.enabled = z;
        this.readOnly = z2;
        this.isFocused = z3;
    }

    /* renamed from: isFocused, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    public final void setFocused(boolean z) {
        this.isFocused = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInTouchMode(boolean z) {
        this.isInTouchMode.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((java.lang.Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartContentVisibleOffset-F1C5BW0, reason: not valid java name */
    private final long m1197getStartContentVisibleOffsetF1C5BW0() {
        return ((androidx.compose.ui.geometry.Offset) this.startContentVisibleOffset.getValue()).getPackedValue();
    }

    /* renamed from: setStartContentVisibleOffset-k-4lQ0M, reason: not valid java name */
    private final void m1200setStartContentVisibleOffsetk4lQ0M(long j) {
        this.startContentVisibleOffset.setValue(androidx.compose.ui.geometry.Offset.m1860boximpl(j));
    }

    /* renamed from: getCurrentContentVisibleOffset-F1C5BW0, reason: not valid java name */
    private final long m1194getCurrentContentVisibleOffsetF1C5BW0() {
        androidx.compose.ui.geometry.Rect visibleBounds;
        androidx.compose.ui.layout.LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        return (textLayoutCoordinates == null || (visibleBounds = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) ? androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0() : visibleBounds.m1906getTopLeftF1C5BW0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getRawHandleDragPosition-F1C5BW0, reason: not valid java name */
    private final long m1196getRawHandleDragPositionF1C5BW0() {
        return ((androidx.compose.ui.geometry.Offset) this.rawHandleDragPosition.getValue()).getPackedValue();
    }

    /* renamed from: setRawHandleDragPosition-k-4lQ0M, reason: not valid java name */
    private final void m1199setRawHandleDragPositionk4lQ0M(long j) {
        this.rawHandleDragPosition.setValue(androidx.compose.ui.geometry.Offset.m1860boximpl(j));
    }

    /* renamed from: getHandleDragPosition-F1C5BW0, reason: not valid java name */
    public final long m1204getHandleDragPositionF1C5BW0() {
        if (androidx.compose.ui.geometry.OffsetKt.m1892isUnspecifiedk4lQ0M(m1196getRawHandleDragPositionF1C5BW0())) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        if (androidx.compose.ui.geometry.OffsetKt.m1892isUnspecifiedk4lQ0M(m1197getStartContentVisibleOffsetF1C5BW0())) {
            return androidx.compose.foundation.text2.input.internal.TextLayoutStateKt.m1162fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, m1196getRawHandleDragPositionF1C5BW0());
        }
        return androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(m1196getRawHandleDragPositionF1C5BW0(), m1194getCurrentContentVisibleOffsetF1C5BW0()), m1197getStartContentVisibleOffsetF1C5BW0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text.Handle getDraggingHandle() {
        return (androidx.compose.foundation.text.Handle) this.draggingHandle.getValue();
    }

    public final void setDraggingHandle(androidx.compose.foundation.text.Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((java.lang.Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text2.input.internal.selection.TextToolbarState getTextToolbarState() {
        return (androidx.compose.foundation.text2.input.internal.selection.TextToolbarState) this.textToolbarState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState textToolbarState) {
        this.textToolbarState.setValue(textToolbarState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.layout.LayoutCoordinates getTextLayoutCoordinates() {
        androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            return null;
        }
        return textLayoutNodeCoordinates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getEditable() {
        return this.enabled && !this.readOnly;
    }

    public final androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState getCursorHandle() {
        return (androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState) this.cursorHandle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getCursorHandleInBounds() {
        return ((java.lang.Boolean) this.cursorHandleInBounds.getValue()).booleanValue();
    }

    public final androidx.compose.ui.geometry.Rect getCursorRect() {
        return (androidx.compose.ui.geometry.Rect) this.cursorRect.getValue();
    }

    public final androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState getStartSelectionHandle() {
        return (androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState) this.startSelectionHandle.getValue();
    }

    public final androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState getEndSelectionHandle() {
        return (androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState) this.endSelectionHandle.getValue();
    }

    public final void update(androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedBack, androidx.compose.ui.platform.ClipboardManager clipboardManager, androidx.compose.ui.platform.TextToolbar textToolbar, androidx.compose.ui.unit.Density density, boolean enabled, boolean readOnly) {
        if (!enabled) {
            hideTextToolbar();
        }
        this.hapticFeedBack = hapticFeedBack;
        this.clipboardManager = clipboardManager;
        this.textToolbar = textToolbar;
        this.density = density;
        this.enabled = enabled;
        this.readOnly = readOnly;
    }

    public final java.lang.Object cursorHandleGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2(this, pointerInputScope, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object textFieldGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2(this, pointerInputScope, function0, function02, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object selectionHandleGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2(this, pointerInputScope, z, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object observeChanges(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$1 textFieldSelectionState$observeChanges$1;
        int i;
        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
        if (continuation instanceof androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$1) {
            textFieldSelectionState$observeChanges$1 = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$1) continuation;
            if ((textFieldSelectionState$observeChanges$1.label & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$observeChanges$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = textFieldSelectionState$observeChanges$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = textFieldSelectionState$observeChanges$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$2 textFieldSelectionState$observeChanges$2 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$2(this, null);
                        textFieldSelectionState$observeChanges$1.L$0 = this;
                        textFieldSelectionState$observeChanges$1.label = 1;
                        if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(textFieldSelectionState$observeChanges$2, textFieldSelectionState$observeChanges$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        textFieldSelectionState = this;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        textFieldSelectionState = this;
                        textFieldSelectionState.setShowCursorHandle(false);
                        if (textFieldSelectionState.getTextToolbarState() != androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None) {
                            textFieldSelectionState.hideTextToolbar();
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    textFieldSelectionState = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState) textFieldSelectionState$observeChanges$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        textFieldSelectionState.setShowCursorHandle(false);
                        if (textFieldSelectionState.getTextToolbarState() != androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None) {
                        }
                        throw th;
                    }
                }
                textFieldSelectionState.setShowCursorHandle(false);
                if (textFieldSelectionState.getTextToolbarState() != androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None) {
                    textFieldSelectionState.hideTextToolbar();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        textFieldSelectionState$observeChanges$1 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$1(this, continuation);
        java.lang.Object obj2 = textFieldSelectionState$observeChanges$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = textFieldSelectionState$observeChanges$1.label;
        if (i != 0) {
        }
        textFieldSelectionState.setShowCursorHandle(false);
        if (textFieldSelectionState.getTextToolbarState() != androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState textToolbarState) {
        setTextToolbarState(textToolbarState);
    }

    public final void dispose() {
        hideTextToolbar();
        this.textToolbar = null;
        this.clipboardManager = null;
        this.hapticFeedBack = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object detectTouchMode(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTouchMode$2(this, null), continuation);
        return awaitPointerEventScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object detectTextFieldTapGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object detectTapAndDoubleTap = androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt.detectTapAndDoubleTap(pointerInputScope, new androidx.compose.foundation.text2.input.internal.selection.TapOnPosition() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2
            @Override // androidx.compose.foundation.text2.input.internal.selection.TapOnPosition
            /* renamed from: onEvent-k-4lQ0M */
            public final void mo1177onEventk4lQ0M(long j) {
                boolean editable;
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState2;
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionStateKt.logDebug(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2.1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.String invoke() {
                        return "onTapTextField";
                    }
                });
                function0.invoke();
                editable = this.getEditable();
                if (editable && this.getIsFocused()) {
                    function02.invoke();
                    transformedTextFieldState = this.textFieldState;
                    if (transformedTextFieldState.getText().length() > 0) {
                        this.setShowCursorHandle(true);
                    }
                    this.updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None);
                    textLayoutState = this.textLayoutState;
                    int m1155getOffsetForPosition3MmeM6k$default = androidx.compose.foundation.text2.input.internal.TextLayoutState.m1155getOffsetForPosition3MmeM6k$default(textLayoutState, j, false, 2, null);
                    if (m1155getOffsetForPosition3MmeM6k$default >= 0) {
                        transformedTextFieldState2 = this.textFieldState;
                        transformedTextFieldState2.placeCursorBeforeCharAt(m1155getOffsetForPosition3MmeM6k$default);
                    }
                }
            }
        }, new androidx.compose.foundation.text2.input.internal.selection.TapOnPosition() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3
            @Override // androidx.compose.foundation.text2.input.internal.selection.TapOnPosition
            /* renamed from: onEvent-k-4lQ0M */
            public final void mo1177onEventk4lQ0M(long j) {
                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
                long m1202updateSelectionQNhciaU;
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState2;
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionStateKt.logDebug(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3.1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.String invoke() {
                        return "onDoubleTapTextField";
                    }
                });
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.setShowCursorHandle(false);
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.Selection);
                textLayoutState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textLayoutState;
                int m1155getOffsetForPosition3MmeM6k$default = androidx.compose.foundation.text2.input.internal.TextLayoutState.m1155getOffsetForPosition3MmeM6k$default(textLayoutState, j, false, 2, null);
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this;
                transformedTextFieldState = textFieldSelectionState.textFieldState;
                m1202updateSelectionQNhciaU = textFieldSelectionState.m1202updateSelectionQNhciaU(androidx.compose.foundation.text2.input.TextFieldCharSequenceKt.m1102TextFieldCharSequence3r_uNRQ$default(transformedTextFieldState.getText(), androidx.compose.ui.text.TextRange.INSTANCE.m3969getZerod9O1mEE(), null, 4, null), m1155getOffsetForPosition3MmeM6k$default, m1155getOffsetForPosition3MmeM6k$default, false, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getWord(), (r14 & 32) != 0 ? false : false);
                transformedTextFieldState2 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textFieldState;
                transformedTextFieldState2.m1171selectCharsIn5zctL8(m1202updateSelectionQNhciaU);
            }
        }, continuation);
        return detectTapAndDoubleTap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapAndDoubleTap : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$1;
        int i;
        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
        kotlin.jvm.internal.Ref.LongRef longRef;
        java.lang.Throwable th;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        if (continuation instanceof androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1) {
            textFieldSelectionState$detectCursorHandleDragGestures$1 = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1) continuation;
            if ((textFieldSelectionState$detectCursorHandleDragGestures$1.label & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$detectCursorHandleDragGestures$1.label -= Integer.MIN_VALUE;
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$12 = textFieldSelectionState$detectCursorHandleDragGestures$1;
                java.lang.Object obj = textFieldSelectionState$detectCursorHandleDragGestures$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = textFieldSelectionState$detectCursorHandleDragGestures$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.LongRef longRef3 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef3.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
                    final kotlin.jvm.internal.Ref.LongRef longRef4 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef4.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
                    try {
                        kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                                m1206invokek4lQ0M(offset.getPackedValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m1206invokek4lQ0M(long j) {
                                kotlin.jvm.internal.Ref.LongRef.this.element = androidx.compose.foundation.text.selection.SelectionHandlesKt.m1018getAdjustedCoordinatesk4lQ0M(this.getCursorRect().m1898getBottomCenterF1C5BW0());
                                longRef4.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                                this.setInTouchMode(true);
                                this.markStartContentVisibleOffset();
                                this.m1201updateHandleDraggingUv8p0NA(androidx.compose.foundation.text.Handle.Cursor, kotlin.jvm.internal.Ref.LongRef.this.element);
                            }
                        };
                        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                invoke2();
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures$onDragStop(kotlin.jvm.internal.Ref.LongRef.this, longRef4, this);
                            }
                        };
                        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                invoke2();
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures$onDragStop(kotlin.jvm.internal.Ref.LongRef.this, longRef4, this);
                            }
                        };
                        kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> function2 = new kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.geometry.Offset offset) {
                                m1207invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                            public final void m1207invokeUv8p0NA(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j) {
                                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
                                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
                                androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback;
                                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState2;
                                kotlin.jvm.internal.Ref.LongRef longRef5 = kotlin.jvm.internal.Ref.LongRef.this;
                                longRef5.element = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(longRef5.element, j);
                                this.m1201updateHandleDraggingUv8p0NA(androidx.compose.foundation.text.Handle.Cursor, androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(longRef3.element, kotlin.jvm.internal.Ref.LongRef.this.element));
                                textLayoutState = this.textLayoutState;
                                androidx.compose.ui.text.TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
                                if (layoutResult == null) {
                                    return;
                                }
                                long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(layoutResult.m3936getOffsetForPositionk4lQ0M(this.m1204getHandleDragPositionF1C5BW0()));
                                transformedTextFieldState = this.textFieldState;
                                if (androidx.compose.ui.text.TextRange.m3957equalsimpl0(TextRange, transformedTextFieldState.getText().getSelectionInChars())) {
                                    return;
                                }
                                pointerInputChange.consume();
                                hapticFeedback = this.hapticFeedBack;
                                if (hapticFeedback != null) {
                                    hapticFeedback.mo2797performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m2806getTextHandleMove5zf0vsI());
                                }
                                transformedTextFieldState2 = this.textFieldState;
                                transformedTextFieldState2.m1171selectCharsIn5zctL8(TextRange);
                            }
                        };
                        textFieldSelectionState$detectCursorHandleDragGestures$12.L$0 = this;
                        textFieldSelectionState$detectCursorHandleDragGestures$12.L$1 = longRef3;
                        textFieldSelectionState$detectCursorHandleDragGestures$12.L$2 = longRef4;
                        textFieldSelectionState$detectCursorHandleDragGestures$12.label = 1;
                        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(pointerInputScope, function1, function0, function02, function2, textFieldSelectionState$detectCursorHandleDragGestures$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        textFieldSelectionState = this;
                        longRef = longRef3;
                        longRef2 = longRef4;
                    } catch (java.lang.Throwable th2) {
                        textFieldSelectionState = this;
                        longRef = longRef3;
                        th = th2;
                        longRef2 = longRef4;
                        detectCursorHandleDragGestures$onDragStop(longRef, longRef2, textFieldSelectionState);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    longRef2 = (kotlin.jvm.internal.Ref.LongRef) textFieldSelectionState$detectCursorHandleDragGestures$12.L$2;
                    longRef = (kotlin.jvm.internal.Ref.LongRef) textFieldSelectionState$detectCursorHandleDragGestures$12.L$1;
                    textFieldSelectionState = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState) textFieldSelectionState$detectCursorHandleDragGestures$12.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        detectCursorHandleDragGestures$onDragStop(longRef, longRef2, textFieldSelectionState);
                        throw th;
                    }
                }
                detectCursorHandleDragGestures$onDragStop(longRef, longRef2, textFieldSelectionState);
                return kotlin.Unit.INSTANCE;
            }
        }
        textFieldSelectionState$detectCursorHandleDragGestures$1 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1(this, continuation);
        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$122 = textFieldSelectionState$detectCursorHandleDragGestures$1;
        java.lang.Object obj2 = textFieldSelectionState$detectCursorHandleDragGestures$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = textFieldSelectionState$detectCursorHandleDragGestures$122.label;
        if (i != 0) {
        }
        detectCursorHandleDragGestures$onDragStop(longRef, longRef2, textFieldSelectionState);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectCursorHandleDragGestures$onDragStop(kotlin.jvm.internal.Ref.LongRef longRef, kotlin.jvm.internal.Ref.LongRef longRef2, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        if (androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(longRef.element)) {
            longRef.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
            longRef2.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
            textFieldSelectionState.clearHandleDragging();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, androidx.compose.foundation.text.Handle] */
    public final java.lang.Object detectTextFieldLongPressAndAfterDrag(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        intRef.element = -1;
        final kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
        longRef.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        final kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
        longRef2.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = androidx.compose.foundation.text.Handle.SelectionEnd;
        java.lang.Object detectDragGesturesAfterLongPress = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                m1210invokek4lQ0M(offset.getPackedValue());
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m1210invokek4lQ0M(final long j) {
                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState2;
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState2;
                long m1202updateSelectionQNhciaU;
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState3;
                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState3;
                androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback;
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState4;
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionStateKt.logDebug(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.String invoke() {
                        return "onDragStart after longPress " + ((java.lang.Object) androidx.compose.ui.geometry.Offset.m1879toStringimpl(j));
                    }
                });
                function0.invoke();
                this.m1201updateHandleDraggingUv8p0NA(objectRef.element, j);
                longRef.element = j;
                longRef2.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                this.previousRawDragOffset = -1;
                textLayoutState = this.textLayoutState;
                if (!textLayoutState.m1158isPositionOnTextk4lQ0M(j)) {
                    textLayoutState3 = this.textLayoutState;
                    int m1155getOffsetForPosition3MmeM6k$default = androidx.compose.foundation.text2.input.internal.TextLayoutState.m1155getOffsetForPosition3MmeM6k$default(textLayoutState3, j, false, 2, null);
                    hapticFeedback = this.hapticFeedBack;
                    if (hapticFeedback != null) {
                        hapticFeedback.mo2797performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m2806getTextHandleMove5zf0vsI());
                    }
                    transformedTextFieldState4 = this.textFieldState;
                    transformedTextFieldState4.placeCursorBeforeCharAt(m1155getOffsetForPosition3MmeM6k$default);
                    this.setShowCursorHandle(true);
                    this.updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.Cursor);
                    return;
                }
                transformedTextFieldState = this.textFieldState;
                if (transformedTextFieldState.getText().length() == 0) {
                    return;
                }
                textLayoutState2 = this.textLayoutState;
                int m1155getOffsetForPosition3MmeM6k$default2 = androidx.compose.foundation.text2.input.internal.TextLayoutState.m1155getOffsetForPosition3MmeM6k$default(textLayoutState2, j, false, 2, null);
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState = this;
                transformedTextFieldState2 = textFieldSelectionState.textFieldState;
                m1202updateSelectionQNhciaU = textFieldSelectionState.m1202updateSelectionQNhciaU(androidx.compose.foundation.text2.input.TextFieldCharSequenceKt.m1102TextFieldCharSequence3r_uNRQ$default(transformedTextFieldState2.getText(), androidx.compose.ui.text.TextRange.INSTANCE.m3969getZerod9O1mEE(), null, 4, null), m1155getOffsetForPosition3MmeM6k$default2, m1155getOffsetForPosition3MmeM6k$default2, false, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), (r14 & 32) != 0 ? false : false);
                transformedTextFieldState3 = this.textFieldState;
                transformedTextFieldState3.m1171selectCharsIn5zctL8(m1202updateSelectionQNhciaU);
                this.updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.Selection);
                intRef.element = androidx.compose.ui.text.TextRange.m3964getStartimpl(m1202updateSelectionQNhciaU);
            }
        }, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag$onDragStop$1(kotlin.jvm.internal.Ref.LongRef.this, this, intRef, longRef2);
            }
        }, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag$onDragStop$1(kotlin.jvm.internal.Ref.LongRef.this, this, intRef, longRef2);
            }
        }, new kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.geometry.Offset offset) {
                m1211invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x00de  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00fd  */
            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m1211invokeUv8p0NA(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j) {
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
                int m1157getOffsetForPosition3MmeM6k;
                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState2;
                int m1157getOffsetForPosition3MmeM6k2;
                androidx.compose.foundation.text.selection.SelectionAdjustment word;
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState2;
                long selectionInChars;
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState3;
                long m1202updateSelectionQNhciaU;
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState4;
                T t;
                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState3;
                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState4;
                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState5;
                transformedTextFieldState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textFieldState;
                if (transformedTextFieldState.getText().length() == 0) {
                    return;
                }
                kotlin.jvm.internal.Ref.LongRef longRef3 = longRef2;
                longRef3.element = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(longRef3.element, j);
                final long m1876plusMKHz9U = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(longRef.element, longRef2.element);
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionStateKt.logDebug(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.String invoke() {
                        return "onDrag after longPress " + ((java.lang.Object) androidx.compose.ui.geometry.Offset.m1879toStringimpl(m1876plusMKHz9U));
                    }
                });
                if (intRef.element < 0) {
                    textLayoutState3 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textLayoutState;
                    if (!textLayoutState3.m1158isPositionOnTextk4lQ0M(m1876plusMKHz9U)) {
                        textLayoutState4 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textLayoutState;
                        m1157getOffsetForPosition3MmeM6k = androidx.compose.foundation.text2.input.internal.TextLayoutState.m1155getOffsetForPosition3MmeM6k$default(textLayoutState4, longRef.element, false, 2, null);
                        textLayoutState5 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textLayoutState;
                        m1157getOffsetForPosition3MmeM6k2 = androidx.compose.foundation.text2.input.internal.TextLayoutState.m1155getOffsetForPosition3MmeM6k$default(textLayoutState5, m1876plusMKHz9U, false, 2, null);
                        if (m1157getOffsetForPosition3MmeM6k == m1157getOffsetForPosition3MmeM6k2) {
                            word = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone();
                        } else {
                            word = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getWord();
                        }
                        int i = m1157getOffsetForPosition3MmeM6k;
                        int i2 = m1157getOffsetForPosition3MmeM6k2;
                        androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment = word;
                        transformedTextFieldState2 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textFieldState;
                        selectionInChars = transformedTextFieldState2.getText().getSelectionInChars();
                        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this;
                        transformedTextFieldState3 = textFieldSelectionState.textFieldState;
                        m1202updateSelectionQNhciaU = textFieldSelectionState.m1202updateSelectionQNhciaU(transformedTextFieldState3.getText(), i, i2, false, selectionAdjustment, false);
                        if (androidx.compose.ui.text.TextRange.m3963getReversedimpl(m1202updateSelectionQNhciaU)) {
                            m1202updateSelectionQNhciaU = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionStateKt.m1213reverse5zctL8(m1202updateSelectionQNhciaU);
                        }
                        if (intRef.element == -1 && !androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(m1202updateSelectionQNhciaU)) {
                            intRef.element = androidx.compose.ui.text.TextRange.m3964getStartimpl(m1202updateSelectionQNhciaU);
                        }
                        if (!androidx.compose.ui.text.TextRange.m3957equalsimpl0(m1202updateSelectionQNhciaU, selectionInChars)) {
                            kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.text.Handle> objectRef2 = objectRef;
                            if (androidx.compose.ui.text.TextRange.m3964getStartimpl(m1202updateSelectionQNhciaU) != androidx.compose.ui.text.TextRange.m3964getStartimpl(selectionInChars) && androidx.compose.ui.text.TextRange.m3959getEndimpl(m1202updateSelectionQNhciaU) == androidx.compose.ui.text.TextRange.m3959getEndimpl(selectionInChars)) {
                                t = androidx.compose.foundation.text.Handle.SelectionStart;
                            } else if (androidx.compose.ui.text.TextRange.m3964getStartimpl(m1202updateSelectionQNhciaU) == androidx.compose.ui.text.TextRange.m3964getStartimpl(selectionInChars) && androidx.compose.ui.text.TextRange.m3959getEndimpl(m1202updateSelectionQNhciaU) != androidx.compose.ui.text.TextRange.m3959getEndimpl(selectionInChars)) {
                                t = androidx.compose.foundation.text.Handle.SelectionEnd;
                            } else if ((androidx.compose.ui.text.TextRange.m3964getStartimpl(m1202updateSelectionQNhciaU) + androidx.compose.ui.text.TextRange.m3959getEndimpl(m1202updateSelectionQNhciaU)) / 2.0f > (androidx.compose.ui.text.TextRange.m3964getStartimpl(selectionInChars) + androidx.compose.ui.text.TextRange.m3959getEndimpl(selectionInChars)) / 2.0f) {
                                t = androidx.compose.foundation.text.Handle.SelectionEnd;
                            } else {
                                t = androidx.compose.foundation.text.Handle.SelectionStart;
                            }
                            objectRef2.element = t;
                        }
                        if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(selectionInChars) || !androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(m1202updateSelectionQNhciaU)) {
                            transformedTextFieldState4 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textFieldState;
                            transformedTextFieldState4.m1171selectCharsIn5zctL8(m1202updateSelectionQNhciaU);
                        }
                        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.m1201updateHandleDraggingUv8p0NA(objectRef.element, m1876plusMKHz9U);
                    }
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(intRef.element);
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    m1157getOffsetForPosition3MmeM6k = valueOf.intValue();
                } else {
                    textLayoutState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textLayoutState;
                    m1157getOffsetForPosition3MmeM6k = textLayoutState.m1157getOffsetForPosition3MmeM6k(longRef.element, false);
                }
                textLayoutState2 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textLayoutState;
                m1157getOffsetForPosition3MmeM6k2 = textLayoutState2.m1157getOffsetForPosition3MmeM6k(m1876plusMKHz9U, false);
                if (intRef.element >= 0 || m1157getOffsetForPosition3MmeM6k != m1157getOffsetForPosition3MmeM6k2) {
                    word = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getWord();
                    int i3 = m1157getOffsetForPosition3MmeM6k;
                    int i22 = m1157getOffsetForPosition3MmeM6k2;
                    androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment2 = word;
                    transformedTextFieldState2 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textFieldState;
                    selectionInChars = transformedTextFieldState2.getText().getSelectionInChars();
                    androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState2 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this;
                    transformedTextFieldState3 = textFieldSelectionState2.textFieldState;
                    m1202updateSelectionQNhciaU = textFieldSelectionState2.m1202updateSelectionQNhciaU(transformedTextFieldState3.getText(), i3, i22, false, selectionAdjustment2, false);
                    if (androidx.compose.ui.text.TextRange.m3963getReversedimpl(m1202updateSelectionQNhciaU)) {
                    }
                    if (intRef.element == -1) {
                        intRef.element = androidx.compose.ui.text.TextRange.m3964getStartimpl(m1202updateSelectionQNhciaU);
                    }
                    if (!androidx.compose.ui.text.TextRange.m3957equalsimpl0(m1202updateSelectionQNhciaU, selectionInChars)) {
                    }
                    if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(selectionInChars)) {
                    }
                    transformedTextFieldState4 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textFieldState;
                    transformedTextFieldState4.m1171selectCharsIn5zctL8(m1202updateSelectionQNhciaU);
                    androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.m1201updateHandleDraggingUv8p0NA(objectRef.element, m1876plusMKHz9U);
                }
            }
        }, continuation);
        return detectDragGesturesAfterLongPress == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectDragGesturesAfterLongPress : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectTextFieldLongPressAndAfterDrag$onDragStop$1(kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.LongRef longRef2) {
        if (androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(longRef.element)) {
            textFieldSelectionState.clearHandleDragging();
            intRef.element = -1;
            longRef.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
            longRef2.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, final boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$1;
        int i;
        androidx.compose.foundation.text.Handle handle;
        kotlin.jvm.internal.Ref.LongRef longRef;
        final androidx.compose.foundation.text.Handle handle2;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
        kotlin.jvm.internal.Ref.LongRef longRef3;
        if (continuation instanceof androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1) {
            textFieldSelectionState$detectSelectionHandleDragGestures$1 = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1) continuation;
            if ((textFieldSelectionState$detectSelectionHandleDragGestures$1.label & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$detectSelectionHandleDragGestures$1.label -= Integer.MIN_VALUE;
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$12 = textFieldSelectionState$detectSelectionHandleDragGestures$1;
                java.lang.Object obj = textFieldSelectionState$detectSelectionHandleDragGestures$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = textFieldSelectionState$detectSelectionHandleDragGestures$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.LongRef longRef4 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef4.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
                    final kotlin.jvm.internal.Ref.LongRef longRef5 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef5.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                    final androidx.compose.foundation.text.Handle handle3 = z ? androidx.compose.foundation.text.Handle.SelectionStart : androidx.compose.foundation.text.Handle.SelectionEnd;
                    try {
                        kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                                m1208invokek4lQ0M(offset.getPackedValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m1208invokek4lQ0M(long j) {
                                long m1195getHandlePositiontuRUvjQ;
                                kotlin.jvm.internal.Ref.LongRef longRef6 = kotlin.jvm.internal.Ref.LongRef.this;
                                m1195getHandlePositiontuRUvjQ = this.m1195getHandlePositiontuRUvjQ(z);
                                longRef6.element = androidx.compose.foundation.text.selection.SelectionHandlesKt.m1018getAdjustedCoordinatesk4lQ0M(m1195getHandlePositiontuRUvjQ);
                                this.m1201updateHandleDraggingUv8p0NA(handle3, kotlin.jvm.internal.Ref.LongRef.this.element);
                                longRef5.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                                this.previousRawDragOffset = -1;
                            }
                        };
                        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                invoke2();
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures$onDragStop$2(kotlin.jvm.internal.Ref.LongRef.this, this, longRef5);
                            }
                        };
                        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                invoke2();
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures$onDragStop$2(kotlin.jvm.internal.Ref.LongRef.this, this, longRef5);
                            }
                        };
                        kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> function2 = new kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.geometry.Offset offset) {
                                m1209invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                            public final void m1209invokeUv8p0NA(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j) {
                                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
                                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
                                int m3964getStartimpl;
                                int m3936getOffsetForPositionk4lQ0M;
                                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState2;
                                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState3;
                                long m1202updateSelectionQNhciaU;
                                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState4;
                                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState5;
                                kotlin.jvm.internal.Ref.LongRef longRef6 = kotlin.jvm.internal.Ref.LongRef.this;
                                longRef6.element = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(longRef6.element, j);
                                textLayoutState = this.textLayoutState;
                                androidx.compose.ui.text.TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
                                if (layoutResult == null) {
                                    return;
                                }
                                this.m1201updateHandleDraggingUv8p0NA(handle3, androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(longRef4.element, kotlin.jvm.internal.Ref.LongRef.this.element));
                                if (!z) {
                                    transformedTextFieldState = this.textFieldState;
                                    m3964getStartimpl = androidx.compose.ui.text.TextRange.m3964getStartimpl(transformedTextFieldState.getText().getSelectionInChars());
                                } else {
                                    m3964getStartimpl = layoutResult.m3936getOffsetForPositionk4lQ0M(this.m1204getHandleDragPositionF1C5BW0());
                                }
                                int i2 = m3964getStartimpl;
                                if (z) {
                                    transformedTextFieldState5 = this.textFieldState;
                                    m3936getOffsetForPositionk4lQ0M = androidx.compose.ui.text.TextRange.m3959getEndimpl(transformedTextFieldState5.getText().getSelectionInChars());
                                } else {
                                    m3936getOffsetForPositionk4lQ0M = layoutResult.m3936getOffsetForPositionk4lQ0M(this.m1204getHandleDragPositionF1C5BW0());
                                }
                                int i3 = m3936getOffsetForPositionk4lQ0M;
                                transformedTextFieldState2 = this.textFieldState;
                                long selectionInChars = transformedTextFieldState2.getText().getSelectionInChars();
                                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState2 = this;
                                transformedTextFieldState3 = textFieldSelectionState2.textFieldState;
                                m1202updateSelectionQNhciaU = textFieldSelectionState2.m1202updateSelectionQNhciaU(transformedTextFieldState3.getText(), i2, i3, z, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), (r14 & 32) != 0 ? false : false);
                                if (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(selectionInChars) || !androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(m1202updateSelectionQNhciaU)) {
                                    transformedTextFieldState4 = this.textFieldState;
                                    transformedTextFieldState4.m1171selectCharsIn5zctL8(m1202updateSelectionQNhciaU);
                                }
                            }
                        };
                        textFieldSelectionState$detectSelectionHandleDragGestures$12.L$0 = this;
                        textFieldSelectionState$detectSelectionHandleDragGestures$12.L$1 = longRef4;
                        textFieldSelectionState$detectSelectionHandleDragGestures$12.L$2 = longRef5;
                        textFieldSelectionState$detectSelectionHandleDragGestures$12.L$3 = handle3;
                        textFieldSelectionState$detectSelectionHandleDragGestures$12.label = 1;
                        handle = handle3;
                        longRef = longRef5;
                        try {
                            if (androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(pointerInputScope, function1, function0, function02, function2, textFieldSelectionState$detectSelectionHandleDragGestures$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            handle2 = handle;
                            longRef2 = longRef;
                            textFieldSelectionState = this;
                            longRef3 = longRef4;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            handle2 = handle;
                            longRef2 = longRef;
                            textFieldSelectionState = this;
                            longRef3 = longRef4;
                            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionStateKt.logDebug(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.String invoke() {
                                    return "Selection Handle drag cancelled for draggingHandle: " + androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getDraggingHandle() + " definedOn: " + handle2;
                                }
                            });
                            if (textFieldSelectionState.getDraggingHandle() == handle2) {
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        handle = handle3;
                        longRef = longRef5;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    handle2 = (androidx.compose.foundation.text.Handle) textFieldSelectionState$detectSelectionHandleDragGestures$12.L$3;
                    longRef2 = (kotlin.jvm.internal.Ref.LongRef) textFieldSelectionState$detectSelectionHandleDragGestures$12.L$2;
                    longRef3 = (kotlin.jvm.internal.Ref.LongRef) textFieldSelectionState$detectSelectionHandleDragGestures$12.L$1;
                    textFieldSelectionState = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState) textFieldSelectionState$detectSelectionHandleDragGestures$12.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionStateKt.logDebug(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.String invoke() {
                                return "Selection Handle drag cancelled for draggingHandle: " + androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getDraggingHandle() + " definedOn: " + handle2;
                            }
                        });
                        if (textFieldSelectionState.getDraggingHandle() == handle2) {
                            detectSelectionHandleDragGestures$onDragStop$2(longRef3, textFieldSelectionState, longRef2);
                        }
                        throw th;
                    }
                }
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionStateKt.logDebug(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.String invoke() {
                        return "Selection Handle drag cancelled for draggingHandle: " + androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getDraggingHandle() + " definedOn: " + handle2;
                    }
                });
                if (textFieldSelectionState.getDraggingHandle() == handle2) {
                    detectSelectionHandleDragGestures$onDragStop$2(longRef3, textFieldSelectionState, longRef2);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        textFieldSelectionState$detectSelectionHandleDragGestures$1 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1(this, continuation);
        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$122 = textFieldSelectionState$detectSelectionHandleDragGestures$1;
        java.lang.Object obj2 = textFieldSelectionState$detectSelectionHandleDragGestures$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = textFieldSelectionState$detectSelectionHandleDragGestures$122.label;
        if (i != 0) {
        }
        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionStateKt.logDebug(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.String invoke() {
                return "Selection Handle drag cancelled for draggingHandle: " + androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getDraggingHandle() + " definedOn: " + handle2;
            }
        });
        if (textFieldSelectionState.getDraggingHandle() == handle2) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectSelectionHandleDragGestures$onDragStop$2(kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.jvm.internal.Ref.LongRef longRef2) {
        if (androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(longRef.element)) {
            textFieldSelectionState.clearHandleDragging();
            longRef.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
            longRef2.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object observeTextChanges(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.drop(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0<androidx.compose.foundation.text2.input.TextFieldCharSequence>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextChanges$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.foundation.text2.input.TextFieldCharSequence invoke() {
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
                transformedTextFieldState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textFieldState;
                return transformedTextFieldState.getText();
            }
        }), androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextChanges$3.INSTANCE), 1).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextChanges$4
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((androidx.compose.foundation.text2.input.TextFieldCharSequence) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.setShowCursorHandle(false);
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None);
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object observeTextToolbarVisibility(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
            
                if (r0 == null) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
            
                r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
            
                if (r0 == null) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
            
                r2 = r6.this$0.getTextLayoutCoordinates();
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            
                if (r2 == null) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
            
                r2 = androidx.compose.ui.geometry.Offset.m1860boximpl(r2.mo3411localToRootMKHz9U(r0.m1906getTopLeftF1C5BW0()));
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
            
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
                r0 = androidx.compose.ui.geometry.RectKt.m1911Recttz77jQw(r2.getPackedValue(), r0.m1904getSizeNHjbRc());
                r2 = r6.this$0.getContentRect();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
            
                if (r0.overlaps(r2) == false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
            
                r1 = r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
            
                if (r1 == null) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
            
                r0 = r1.intersect(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
            
                if (r0 == null) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
            
                return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
            
                r2 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
            
                return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
            
                r0 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0028, code lost:
            
                if (r0 == androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.Selection) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
            
                if (r1 != androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.Cursor) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
            
                if (r6.this$0.getDraggingHandle() != null) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
            
                if (r6.this$0.isInTouchMode() == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
            
                r0 = r6.this$0.getTextLayoutCoordinates();
                r1 = null;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final androidx.compose.ui.geometry.Rect invoke() {
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
                androidx.compose.foundation.text2.input.internal.selection.TextToolbarState textToolbarState;
                androidx.compose.foundation.text2.input.internal.selection.TextToolbarState textToolbarState2;
                transformedTextFieldState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textFieldState;
                boolean m3958getCollapsedimpl = androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(transformedTextFieldState.getText().getSelectionInChars());
                if (m3958getCollapsedimpl) {
                    textToolbarState2 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getTextToolbarState();
                }
                if (!m3958getCollapsedimpl) {
                    textToolbarState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.getTextToolbarState();
                }
                return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
            }
        }).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$3
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((androidx.compose.ui.geometry.Rect) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(androidx.compose.ui.geometry.Rect rect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(rect, androidx.compose.ui.geometry.Rect.INSTANCE.getZero())) {
                    androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.hideTextToolbar();
                } else {
                    androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.showTextToolbar(rect);
                }
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.geometry.Rect getContentRect() {
        float f;
        androidx.compose.ui.geometry.Rect cursorRect;
        androidx.compose.ui.geometry.Rect cursorRect2;
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = this.textFieldState.getText();
        if (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(text.getSelectionInChars())) {
            androidx.compose.ui.layout.LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            return androidx.compose.ui.geometry.RectKt.m1911Recttz77jQw(textLayoutCoordinates != null ? textLayoutCoordinates.mo3411localToRootMKHz9U(getCursorRect().m1906getTopLeftF1C5BW0()) : androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0(), getCursorRect().m1904getSizeNHjbRc());
        }
        androidx.compose.ui.layout.LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
        long mo3411localToRootMKHz9U = textLayoutCoordinates2 != null ? textLayoutCoordinates2.mo3411localToRootMKHz9U(m1195getHandlePositiontuRUvjQ(true)) : androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        androidx.compose.ui.layout.LayoutCoordinates textLayoutCoordinates3 = getTextLayoutCoordinates();
        long mo3411localToRootMKHz9U2 = textLayoutCoordinates3 != null ? textLayoutCoordinates3.mo3411localToRootMKHz9U(m1195getHandlePositiontuRUvjQ(false)) : androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        androidx.compose.ui.layout.LayoutCoordinates textLayoutCoordinates4 = getTextLayoutCoordinates();
        float f2 = 0.0f;
        if (textLayoutCoordinates4 != null) {
            androidx.compose.ui.text.TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
            f = androidx.compose.ui.geometry.Offset.m1872getYimpl(textLayoutCoordinates4.mo3411localToRootMKHz9U(androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, (layoutResult == null || (cursorRect2 = layoutResult.getCursorRect(androidx.compose.ui.text.TextRange.m3964getStartimpl(text.getSelectionInChars()))) == null) ? 0.0f : cursorRect2.getTop())));
        } else {
            f = 0.0f;
        }
        androidx.compose.ui.layout.LayoutCoordinates textLayoutCoordinates5 = getTextLayoutCoordinates();
        if (textLayoutCoordinates5 != null) {
            androidx.compose.ui.text.TextLayoutResult layoutResult2 = this.textLayoutState.getLayoutResult();
            f2 = androidx.compose.ui.geometry.Offset.m1872getYimpl(textLayoutCoordinates5.mo3411localToRootMKHz9U(androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, (layoutResult2 == null || (cursorRect = layoutResult2.getCursorRect(androidx.compose.ui.text.TextRange.m3959getEndimpl(text.getSelectionInChars()))) == null) ? 0.0f : cursorRect.getTop())));
        }
        return new androidx.compose.ui.geometry.Rect(java.lang.Math.min(androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3411localToRootMKHz9U), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3411localToRootMKHz9U2)), java.lang.Math.min(f, f2), java.lang.Math.max(androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3411localToRootMKHz9U), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3411localToRootMKHz9U2)), java.lang.Math.max(androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3411localToRootMKHz9U), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3411localToRootMKHz9U2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState getSelectionHandleState(boolean isStartHandle) {
        androidx.compose.ui.geometry.Rect visibleBounds;
        androidx.compose.ui.layout.LayoutCoordinates textLayoutCoordinates;
        androidx.compose.ui.geometry.Rect visibleBounds2;
        androidx.compose.foundation.text.Handle handle = isStartHandle ? androidx.compose.foundation.text.Handle.SelectionStart : androidx.compose.foundation.text.Handle.SelectionEnd;
        androidx.compose.ui.text.TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState.INSTANCE.getHidden();
        }
        long selectionInChars = this.textFieldState.getText().getSelectionInChars();
        if (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(selectionInChars)) {
            return androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState.INSTANCE.getHidden();
        }
        long m1195getHandlePositiontuRUvjQ = m1195getHandlePositiontuRUvjQ(isStartHandle);
        if (getDraggingHandle() != handle && ((textLayoutCoordinates = getTextLayoutCoordinates()) == null || (visibleBounds2 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null || !androidx.compose.foundation.text.selection.SelectionManagerKt.m1055containsInclusiveUv8p0NA(visibleBounds2, m1195getHandlePositiontuRUvjQ))) {
            return androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState.INSTANCE.getHidden();
        }
        androidx.compose.ui.text.style.ResolvedTextDirection bidiRunDirection = layoutResult.getBidiRunDirection(isStartHandle ? androidx.compose.ui.text.TextRange.m3964getStartimpl(selectionInChars) : java.lang.Math.max(androidx.compose.ui.text.TextRange.m3959getEndimpl(selectionInChars) - 1, 0));
        boolean m3963getReversedimpl = androidx.compose.ui.text.TextRange.m3963getReversedimpl(selectionInChars);
        androidx.compose.ui.layout.LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
        if (textLayoutCoordinates2 != null && (visibleBounds = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(textLayoutCoordinates2)) != null) {
            m1195getHandlePositiontuRUvjQ = androidx.compose.foundation.text2.input.internal.TextLayoutStateKt.m1161coerceIn3MmeM6k(m1195getHandlePositiontuRUvjQ, visibleBounds);
        }
        return new androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState(true, m1195getHandlePositiontuRUvjQ, bidiRunDirection, m3963getReversedimpl, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getHandlePosition-tuRUvjQ, reason: not valid java name */
    public final long m1195getHandlePositiontuRUvjQ(boolean isStartHandle) {
        int m3959getEndimpl;
        androidx.compose.ui.text.TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        }
        long selectionInChars = this.textFieldState.getText().getSelectionInChars();
        if (isStartHandle) {
            m3959getEndimpl = androidx.compose.ui.text.TextRange.m3964getStartimpl(selectionInChars);
        } else {
            m3959getEndimpl = androidx.compose.ui.text.TextRange.m3959getEndimpl(selectionInChars);
        }
        return androidx.compose.foundation.text.selection.TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult, m3959getEndimpl, isStartHandle, androidx.compose.ui.text.TextRange.m3963getReversedimpl(selectionInChars));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateHandleDragging-Uv8p0NA, reason: not valid java name */
    public final void m1201updateHandleDraggingUv8p0NA(androidx.compose.foundation.text.Handle handle, long position) {
        setDraggingHandle(handle);
        m1199setRawHandleDragPositionk4lQ0M(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markStartContentVisibleOffset() {
        androidx.compose.ui.geometry.Rect visibleBounds;
        androidx.compose.ui.layout.LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        m1200setStartContentVisibleOffsetk4lQ0M((textLayoutCoordinates == null || (visibleBounds = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) ? androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0() : visibleBounds.m1906getTopLeftF1C5BW0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearHandleDragging() {
        setDraggingHandle(null);
        m1199setRawHandleDragPositionk4lQ0M(androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0());
        m1200setStartContentVisibleOffsetk4lQ0M(androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0());
    }

    public final void cut() {
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = this.textFieldState.getText();
        if (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(text.getSelectionInChars())) {
            return;
        }
        androidx.compose.ui.platform.ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(new androidx.compose.ui.text.AnnotatedString(androidx.compose.foundation.text2.input.TextFieldCharSequenceKt.getSelectedText(text).toString(), null, null, 6, null));
        }
        this.textFieldState.deleteSelectedText();
    }

    public static /* synthetic */ void copy$default(androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionState.copy(z);
    }

    public final void copy(boolean cancelSelection) {
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = this.textFieldState.getText();
        if (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(text.getSelectionInChars())) {
            return;
        }
        androidx.compose.ui.platform.ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(new androidx.compose.ui.text.AnnotatedString(androidx.compose.foundation.text2.input.TextFieldCharSequenceKt.getSelectedText(text).toString(), null, null, 6, null));
        }
        if (cancelSelection) {
            this.textFieldState.collapseSelectionToMax();
        }
    }

    public final void paste() {
        androidx.compose.ui.text.AnnotatedString text;
        java.lang.String text2;
        androidx.compose.ui.platform.ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null || (text2 = text.getText()) == null) {
            return;
        }
        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, text2, false, androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTextToolbar(androidx.compose.ui.geometry.Rect contentRect) {
        androidx.compose.ui.platform.ClipboardManager clipboardManager;
        long selectionInChars = this.textFieldState.getText().getSelectionInChars();
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = (getEditable() && (clipboardManager = this.clipboardManager) != null && clipboardManager.hasText()) ? new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$paste$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.paste();
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None);
            }
        } : null;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = !androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(selectionInChars) ? new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$copy$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.copy$default(androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this, false, 1, null);
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None);
            }
        } : null;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03 = (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(selectionInChars) || !getEditable()) ? null : new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$cut$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.cut();
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None);
            }
        };
        kotlin.jvm.functions.Function0<kotlin.Unit> function04 = androidx.compose.ui.text.TextRange.m3960getLengthimpl(selectionInChars) != this.textFieldState.getText().length() ? new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$selectAll$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
                transformedTextFieldState = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.textFieldState;
                transformedTextFieldState.selectAll();
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.Selection);
            }
        } : null;
        androidx.compose.ui.platform.TextToolbar textToolbar = this.textToolbar;
        if (textToolbar != null) {
            textToolbar.showMenu(contentRect, function02, function0, function03, function04);
        }
    }

    public final void deselect() {
        if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(this.textFieldState.getText().getSelectionInChars())) {
            this.textFieldState.collapseSelectionToEnd();
        }
        setShowCursorHandle(false);
        updateTextToolbarState(androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideTextToolbar() {
        androidx.compose.ui.platform.TextToolbar textToolbar;
        androidx.compose.ui.platform.TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != androidx.compose.ui.platform.TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-QNhciaU, reason: not valid java name */
    public final long m1202updateSelectionQNhciaU(androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence, int startOffset, int endOffset, boolean isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment, boolean allowPreviousSelectionCollapsed) {
        androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback;
        androidx.compose.ui.text.TextRange m3952boximpl = androidx.compose.ui.text.TextRange.m3952boximpl(textFieldCharSequence.getSelectionInChars());
        long packedValue = m3952boximpl.getPackedValue();
        if (!allowPreviousSelectionCollapsed && androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(packedValue)) {
            m3952boximpl = null;
        }
        long m1198getTextFieldSelectionqeG_v_k = m1198getTextFieldSelectionqeG_v_k(startOffset, endOffset, m3952boximpl, isStartHandle, adjustment);
        if (androidx.compose.ui.text.TextRange.m3957equalsimpl0(m1198getTextFieldSelectionqeG_v_k, textFieldCharSequence.getSelectionInChars())) {
            return m1198getTextFieldSelectionqeG_v_k;
        }
        boolean z = androidx.compose.ui.text.TextRange.m3963getReversedimpl(m1198getTextFieldSelectionqeG_v_k) != androidx.compose.ui.text.TextRange.m3963getReversedimpl(textFieldCharSequence.getSelectionInChars()) && androidx.compose.ui.text.TextRange.m3957equalsimpl0(androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m3959getEndimpl(m1198getTextFieldSelectionqeG_v_k), androidx.compose.ui.text.TextRange.m3964getStartimpl(m1198getTextFieldSelectionqeG_v_k)), textFieldCharSequence.getSelectionInChars());
        if (isInTouchMode() && !z && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo2797performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m2806getTextHandleMove5zf0vsI());
        }
        return m1198getTextFieldSelectionqeG_v_k;
    }

    /* renamed from: getTextFieldSelection-qeG_v_k, reason: not valid java name */
    private final long m1198getTextFieldSelectionqeG_v_k(int rawStartOffset, int rawEndOffset, androidx.compose.ui.text.TextRange previousSelection, boolean isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment) {
        androidx.compose.ui.text.TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return androidx.compose.ui.text.TextRange.INSTANCE.m3969getZerod9O1mEE();
        }
        if (previousSelection == null && kotlin.jvm.internal.Intrinsics.areEqual(adjustment, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getCharacter())) {
            return androidx.compose.ui.text.TextRangeKt.TextRange(rawStartOffset, rawEndOffset);
        }
        androidx.compose.foundation.text.selection.SelectionLayout m1021getTextFieldSelectionLayoutRcvTLA = androidx.compose.foundation.text.selection.SelectionLayoutKt.m1021getTextFieldSelectionLayoutRcvTLA(layoutResult, rawStartOffset, rawEndOffset, this.previousRawDragOffset, previousSelection != null ? previousSelection.getPackedValue() : androidx.compose.ui.text.TextRange.INSTANCE.m3969getZerod9O1mEE(), previousSelection == null, isStartHandle);
        if (previousSelection != null && !m1021getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return previousSelection.getPackedValue();
        }
        long m1009toTextRanged9O1mEE = adjustment.adjust(m1021getTextFieldSelectionLayoutRcvTLA).m1009toTextRanged9O1mEE();
        this.previousSelectionLayout = m1021getTextFieldSelectionLayoutRcvTLA;
        if (!isStartHandle) {
            rawStartOffset = rawEndOffset;
        }
        this.previousRawDragOffset = rawStartOffset;
        return m1009toTextRanged9O1mEE;
    }
}
