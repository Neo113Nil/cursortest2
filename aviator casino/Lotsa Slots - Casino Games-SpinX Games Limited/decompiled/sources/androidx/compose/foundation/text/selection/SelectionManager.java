package androidx.compose.foundation.text.selection;

/* compiled from: SelectionManager.kt */
@kotlin.Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010r\u001a\u00020O2\u0006\u0010s\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\bt\u0010$J\"\u0010u\u001a\u00020\u00182\u0006\u0010v\u001a\u00020\u00112\u0006\u0010w\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\bx\u0010yJ\r\u0010z\u001a\u00020OH\u0000¢\u0006\u0002\b{J\u0018\u0010|\u001a\u0004\u0018\u00010}2\u0006\u0010~\u001a\u00020\u007fH\u0000¢\u0006\u0003\b\u0080\u0001J\f\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0002J\u0012\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0000¢\u0006\u0003\b\u0085\u0001J/\u0010\u0086\u0001\u001a\u00020W2\u0006\u0010s\u001a\u00020\u00182\u0007\u0010\u0087\u0001\u001a\u00020\u00182\u0007\u0010\u0088\u0001\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0011\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u0088\u0001\u001a\u00020\u0007J\u000f\u0010\u008d\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0003\b\u008e\u0001J\u000f\u0010\u008f\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0003\b\u0090\u0001J\u0007\u0010\u0091\u0001\u001a\u00020OJ\u000f\u0010\u0092\u0001\u001a\u00020\u0011H\u0000¢\u0006\u0003\b\u0093\u0001JA\u0010\u0094\u0001\u001a\u001f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u00030\u0097\u0001\u0012\u0004\u0012\u00020\t0\u0096\u00010\u0095\u00012\b\u0010\u0098\u0001\u001a\u00030\u0097\u00012\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0003\b\u009a\u0001J\u001b\u0010\u009b\u0001\u001a\u00020O2\u0007\u0010\u009c\u0001\u001a\u00020W2\u0007\u0010\u009d\u0001\u001a\u00020\tH\u0002J\u000f\u0010\u009e\u0001\u001a\u00020\u0007H\u0001¢\u0006\u0003\b\u009f\u0001J0\u0010 \u0001\u001a\u00020O2\u0006\u0010s\u001a\u00020\u00182\u0007\u0010\u0088\u0001\u001a\u00020\u00072\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b£\u0001\u0010¤\u0001J\t\u0010¥\u0001\u001a\u00020OH\u0002J\t\u0010¦\u0001\u001a\u00020OH\u0002J9\u0010§\u0001\u001a\u00020\u00072\u0006\u0010s\u001a\u00020\u00182\u0007\u0010\u0087\u0001\u001a\u00020\u00182\u0007\u0010\u0088\u0001\u001a\u00020\u00072\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b¨\u0001\u0010©\u0001J;\u0010§\u0001\u001a\u00020\u00072\t\u0010ª\u0001\u001a\u0004\u0018\u00010\u00182\u0006\u0010U\u001a\u00020\u00182\u0007\u0010\u0088\u0001\u001a\u00020\u00072\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b«\u0001\u0010¬\u0001J\t\u0010\u00ad\u0001\u001a\u00020OH\u0002J*\u0010®\u0001\u001a\u00020O*\u00030¯\u00012\u0013\u0010°\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020O0NH\u0082@¢\u0006\u0003\u0010±\u0001J\u001d\u0010²\u0001\u001a\u00020J*\u00020J2\u000e\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020O0´\u0001H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R5\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00188F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR1\u0010 \u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R1\u0010&\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R/\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u0017\u001a\u0004\u0018\u00010*8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u001f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R5\u00101\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00188F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b4\u0010\u001f\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001dR\u001a\u00105\u001a\u000206X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R+\u0010A\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010\u001f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010G\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER\u0011\u0010I\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR@\u0010P\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020O0N2\u0014\u0010M\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020O0N@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0016\u0010U\u001a\u0004\u0018\u00010\u0018X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R&\u0010V\u001a\u0004\u0018\u00010W8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R(\u0010^\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010c\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010CR$\u0010e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010C\"\u0004\bg\u0010ER5\u0010h\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00188F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bk\u0010\u001f\u001a\u0004\bi\u0010\u001b\"\u0004\bj\u0010\u001dR\u001c\u0010l\u001a\u0004\u0018\u00010mX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006µ\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "_isInTouchMode", "Landroidx/compose/runtime/MutableState;", "", "_selection", "Landroidx/compose/foundation/text/selection/Selection;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "value", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "getContainerLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "currentDragPosition", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "currentDragPosition$delegate", "Landroidx/compose/runtime/MutableState;", "dragBeginPosition", "getDragBeginPosition-F1C5BW0$foundation_release", "()J", "setDragBeginPosition-k-4lQ0M", "(J)V", "dragBeginPosition$delegate", "dragTotalDistance", "getDragTotalDistance-F1C5BW0$foundation_release", "setDragTotalDistance-k-4lQ0M", "dragTotalDistance$delegate", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "endHandlePosition", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "endHandlePosition$delegate", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "hasFocus", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus$delegate", "isInTouchMode", "setInTouchMode", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "newOnSelectionChange", "Lkotlin/Function1;", "", "onSelectionChange", "getOnSelectionChange", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChange", "(Lkotlin/jvm/functions/Function1;)V", "previousPosition", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getPreviousSelectionLayout$foundation_release$annotations", "()V", "getPreviousSelectionLayout$foundation_release", "()Landroidx/compose/foundation/text/selection/SelectionLayout;", "setPreviousSelectionLayout$foundation_release", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)V", "selection", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "shouldShowMagnifier", "getShouldShowMagnifier", "showToolbar", "getShowToolbar$foundation_release", "setShowToolbar$foundation_release", "startHandlePosition", "getStartHandlePosition-_m7T9-E", "setStartHandlePosition-_kEHs6E", "startHandlePosition$delegate", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "contextMenuOpenAdjustment", "position", "contextMenuOpenAdjustment-k-4lQ0M", "convertToContainerCoordinates", "layoutCoordinates", "offset", "convertToContainerCoordinates-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "copy", "copy$foundation_release", "getAnchorSelectable", "Landroidx/compose/foundation/text/selection/Selectable;", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getAnchorSelectable$foundation_release", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation_release", "getSelectionLayout", "previousHandlePosition", "isStartHandle", "getSelectionLayout-Wko1d7g", "(JJZ)Landroidx/compose/foundation/text/selection/SelectionLayout;", "handleDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "isNonEmptySelection", "isNonEmptySelection$foundation_release", "isTriviallyCollapsedSelection", "isTriviallyCollapsedSelection$foundation_release", "onRelease", "requireContainerCoordinates", "requireContainerCoordinates$foundation_release", "selectAll", "Lkotlin/Pair;", "", "", "selectableId", "previousSelection", "selectAll$foundation_release", "selectionChanged", "selectionLayout", "newSelection", "shouldPerformHaptics", "shouldPerformHaptics$foundation_release", "startSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "startSelection-9KIMszo", "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "toolbarCopy", "updateHandleOffsets", "updateSelection", "updateSelection-jyLRC_s$foundation_release", "(JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "newPosition", "updateSelection-qNKwrvQ$foundation_release", "(Landroidx/compose/ui/geometry/Offset;JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "updateSelectionToolbar", "detectNonConsumingTap", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onTap", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClearSelectionRequested", "block", "Lkotlin/Function0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionManager {
    public static final int $stable = 8;
    private androidx.compose.ui.platform.ClipboardManager clipboardManager;
    private androidx.compose.ui.layout.LayoutCoordinates containerLayoutCoordinates;
    private androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedBack;
    private androidx.compose.ui.geometry.Offset previousPosition;
    private androidx.compose.foundation.text.selection.SelectionLayout previousSelectionLayout;
    private final androidx.compose.foundation.text.selection.SelectionRegistrarImpl selectionRegistrar;
    private boolean showToolbar;
    private androidx.compose.ui.platform.TextToolbar textToolbar;
    private final androidx.compose.runtime.MutableState<androidx.compose.foundation.text.selection.Selection> _selection = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> _isInTouchMode = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.selection.Selection, kotlin.Unit> onSelectionChange = new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.Selection, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.text.selection.Selection selection) {
            invoke2(selection);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.compose.foundation.text.selection.Selection selection) {
            androidx.compose.foundation.text.selection.SelectionManager.this.setSelection(selection);
        }
    };
    private androidx.compose.ui.focus.FocusRequester focusRequester = new androidx.compose.ui.focus.FocusRequester();

    /* renamed from: hasFocus$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState hasFocus = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: dragBeginPosition$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState dragBeginPosition = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0()), null, 2, null);

    /* renamed from: dragTotalDistance$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState dragTotalDistance = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0()), null, 2, null);

    /* renamed from: startHandlePosition$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState startHandlePosition = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: endHandlePosition$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState endHandlePosition = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState draggingHandle = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentDragPosition = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public static /* synthetic */ void getPreviousSelectionLayout$foundation_release$annotations() {
    }

    public SelectionManager(androidx.compose.foundation.text.selection.SelectionRegistrarImpl selectionRegistrarImpl) {
        this.selectionRegistrar = selectionRegistrarImpl;
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation_release(new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
                invoke(l.longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(long j) {
                if (androidx.compose.foundation.text.selection.SelectionManager.this.selectionRegistrar.getSubselections().containsKey(java.lang.Long.valueOf(j))) {
                    androidx.compose.foundation.text.selection.SelectionManager.this.updateHandleOffsets();
                    androidx.compose.foundation.text.selection.SelectionManager.this.updateSelectionToolbar();
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation_release(new kotlin.jvm.functions.Function4<java.lang.Boolean, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Offset, androidx.compose.foundation.text.selection.SelectionAdjustment, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.2
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Offset offset, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment) {
                m1050invokeRg1IO4c(bool.booleanValue(), layoutCoordinates, offset.getPackedValue(), selectionAdjustment);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke-Rg1IO4c, reason: not valid java name */
            public final void m1050invokeRg1IO4c(boolean z, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, long j, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment) {
                long mo3409getSizeYbymL2g = layoutCoordinates.mo3409getSizeYbymL2g();
                androidx.compose.ui.geometry.Rect rect = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(mo3409getSizeYbymL2g), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(mo3409getSizeYbymL2g));
                if (!androidx.compose.foundation.text.selection.SelectionManagerKt.m1055containsInclusiveUv8p0NA(rect, j)) {
                    j = androidx.compose.foundation.text2.input.internal.TextLayoutStateKt.m1161coerceIn3MmeM6k(j, rect);
                }
                long m1034convertToContainerCoordinatesR5De75A = androidx.compose.foundation.text.selection.SelectionManager.this.m1034convertToContainerCoordinatesR5De75A(layoutCoordinates, j);
                if (androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(m1034convertToContainerCoordinatesR5De75A)) {
                    androidx.compose.foundation.text.selection.SelectionManager.this.setInTouchMode(z);
                    androidx.compose.foundation.text.selection.SelectionManager.this.m1041startSelection9KIMszo(m1034convertToContainerCoordinatesR5De75A, false, selectionAdjustment);
                    androidx.compose.foundation.text.selection.SelectionManager.this.getFocusRequester().requestFocus();
                    androidx.compose.foundation.text.selection.SelectionManager.this.setShowToolbar$foundation_release(false);
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation_release(new kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.3
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool, java.lang.Long l) {
                invoke(bool.booleanValue(), l.longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(boolean z, long j) {
                androidx.compose.foundation.text.selection.SelectionManager selectionManager = androidx.compose.foundation.text.selection.SelectionManager.this;
                kotlin.Pair<androidx.compose.foundation.text.selection.Selection, java.util.Map<java.lang.Long, androidx.compose.foundation.text.selection.Selection>> selectAll$foundation_release = selectionManager.selectAll$foundation_release(j, selectionManager.getSelection());
                androidx.compose.foundation.text.selection.Selection component1 = selectAll$foundation_release.component1();
                java.util.Map<java.lang.Long, androidx.compose.foundation.text.selection.Selection> component2 = selectAll$foundation_release.component2();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(component1, androidx.compose.foundation.text.selection.SelectionManager.this.getSelection())) {
                    androidx.compose.foundation.text.selection.SelectionManager.this.selectionRegistrar.setSubselections(component2);
                    androidx.compose.foundation.text.selection.SelectionManager.this.getOnSelectionChange().invoke(component1);
                }
                androidx.compose.foundation.text.selection.SelectionManager.this.setInTouchMode(z);
                androidx.compose.foundation.text.selection.SelectionManager.this.getFocusRequester().requestFocus();
                androidx.compose.foundation.text.selection.SelectionManager.this.setShowToolbar$foundation_release(false);
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation_release(new kotlin.jvm.functions.Function6<java.lang.Boolean, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset, java.lang.Boolean, androidx.compose.foundation.text.selection.SelectionAdjustment, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.4
            {
                super(6);
            }

            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Offset offset, androidx.compose.ui.geometry.Offset offset2, java.lang.Boolean bool2, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment) {
                return m1051invokepGV3PM0(bool.booleanValue(), layoutCoordinates, offset.getPackedValue(), offset2.getPackedValue(), bool2.booleanValue(), selectionAdjustment);
            }

            /* renamed from: invoke-pGV3PM0, reason: not valid java name */
            public final java.lang.Boolean m1051invokepGV3PM0(boolean z, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, long j, long j2, boolean z2, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment) {
                long m1034convertToContainerCoordinatesR5De75A = androidx.compose.foundation.text.selection.SelectionManager.this.m1034convertToContainerCoordinatesR5De75A(layoutCoordinates, j);
                long m1034convertToContainerCoordinatesR5De75A2 = androidx.compose.foundation.text.selection.SelectionManager.this.m1034convertToContainerCoordinatesR5De75A(layoutCoordinates, j2);
                androidx.compose.foundation.text.selection.SelectionManager.this.setInTouchMode(z);
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.selection.SelectionManager.this.m1049updateSelectionqNKwrvQ$foundation_release(androidx.compose.ui.geometry.Offset.m1860boximpl(m1034convertToContainerCoordinatesR5De75A), m1034convertToContainerCoordinatesR5De75A2, z2, selectionAdjustment));
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation_release(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.5
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
                androidx.compose.foundation.text.selection.SelectionManager.this.setShowToolbar$foundation_release(true);
                androidx.compose.foundation.text.selection.SelectionManager.this.setDraggingHandle(null);
                androidx.compose.foundation.text.selection.SelectionManager.this.m1036setCurrentDragPosition_kEHs6E(null);
            }
        });
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation_release(new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
                invoke(l.longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(long j) {
                if (androidx.compose.foundation.text.selection.SelectionManager.this.selectionRegistrar.getSubselections().containsKey(java.lang.Long.valueOf(j))) {
                    androidx.compose.foundation.text.selection.SelectionManager.this.onRelease();
                    androidx.compose.foundation.text.selection.SelectionManager.this.setSelection(null);
                }
            }
        });
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation_release(new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
                invoke(l.longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(long j) {
                androidx.compose.foundation.text.selection.Selection.AnchorInfo end;
                androidx.compose.foundation.text.selection.Selection.AnchorInfo start;
                androidx.compose.foundation.text.selection.Selection selection = androidx.compose.foundation.text.selection.SelectionManager.this.getSelection();
                if (selection != null && (start = selection.getStart()) != null && j == start.getSelectableId()) {
                    androidx.compose.foundation.text.selection.SelectionManager.this.m1040setStartHandlePosition_kEHs6E(null);
                }
                androidx.compose.foundation.text.selection.Selection selection2 = androidx.compose.foundation.text.selection.SelectionManager.this.getSelection();
                if (selection2 != null && (end = selection2.getEnd()) != null && j == end.getSelectableId()) {
                    androidx.compose.foundation.text.selection.SelectionManager.this.m1039setEndHandlePosition_kEHs6E(null);
                }
                if (androidx.compose.foundation.text.selection.SelectionManager.this.selectionRegistrar.getSubselections().containsKey(java.lang.Long.valueOf(j))) {
                    androidx.compose.foundation.text.selection.SelectionManager.this.updateSelectionToolbar();
                }
            }
        });
    }

    public final androidx.compose.foundation.text.selection.Selection getSelection() {
        return this._selection.getValue();
    }

    public final void setSelection(androidx.compose.foundation.text.selection.Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final boolean isInTouchMode() {
        return this._isInTouchMode.getValue().booleanValue();
    }

    public final void setInTouchMode(boolean z) {
        if (this._isInTouchMode.getValue().booleanValue() != z) {
            this._isInTouchMode.setValue(java.lang.Boolean.valueOf(z));
            updateSelectionToolbar();
        }
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.Selection, kotlin.Unit> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final void setOnSelectionChange(final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.selection.Selection, kotlin.Unit> function1) {
        this.onSelectionChange = new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.Selection, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.text.selection.Selection selection) {
                invoke2(selection);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.foundation.text.selection.Selection selection) {
                androidx.compose.foundation.text.selection.SelectionManager.this.setSelection(selection);
                function1.invoke(selection);
            }
        };
    }

    public final androidx.compose.ui.hapticfeedback.HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final androidx.compose.ui.platform.ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    public final void setClipboardManager(androidx.compose.ui.platform.ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final androidx.compose.ui.platform.TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(androidx.compose.ui.platform.TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final androidx.compose.ui.focus.FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((java.lang.Boolean) this.hasFocus.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus.setValue(java.lang.Boolean.valueOf(z));
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return androidx.compose.ui.input.key.KeyInputModifierKt.onKeyEvent(androidx.compose.foundation.text.selection.SelectionGesturesKt.updateSelectionTouchMode(androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged(androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$1
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
                androidx.compose.foundation.text.selection.SelectionManager.this.onRelease();
            }
        }), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                androidx.compose.foundation.text.selection.SelectionManager.this.setContainerLayoutCoordinates(layoutCoordinates);
            }
        }), this.focusRequester), new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusState, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusState focusState) {
                invoke2(focusState);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.focus.FocusState focusState) {
                if (!focusState.isFocused() && androidx.compose.foundation.text.selection.SelectionManager.this.getHasFocus()) {
                    androidx.compose.foundation.text.selection.SelectionManager.this.onRelease();
                }
                androidx.compose.foundation.text.selection.SelectionManager.this.setHasFocus(focusState.isFocused());
            }
        }), false, null, 3, null), new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                invoke(bool.booleanValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                androidx.compose.foundation.text.selection.SelectionManager.this.setInTouchMode(z);
            }
        }), new kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.key.KeyEvent keyEvent) {
                return m1052invokeZmokQxo(keyEvent.m3123unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final java.lang.Boolean m1052invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                if (androidx.compose.foundation.text.selection.SelectionManager_androidKt.m1057isCopyKeyEventZmokQxo(keyEvent)) {
                    androidx.compose.foundation.text.selection.SelectionManager.this.copy$foundation_release();
                    z = true;
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }).then(getShouldShowMagnifier() ? androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier(androidx.compose.ui.Modifier.INSTANCE, this) : androidx.compose.ui.Modifier.INSTANCE);
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    public final void setContainerLayoutCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        androidx.compose.ui.geometry.Offset m1860boximpl = layoutCoordinates != null ? androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.layout.LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.previousPosition, m1860boximpl)) {
            return;
        }
        this.previousPosition = m1860boximpl;
        updateHandleOffsets();
        updateSelectionToolbar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m1037setDragBeginPositionk4lQ0M(long j) {
        this.dragBeginPosition.setValue(androidx.compose.ui.geometry.Offset.m1860boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1044getDragBeginPositionF1C5BW0$foundation_release() {
        return ((androidx.compose.ui.geometry.Offset) this.dragBeginPosition.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m1038setDragTotalDistancek4lQ0M(long j) {
        this.dragTotalDistance.setValue(androidx.compose.ui.geometry.Offset.m1860boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1045getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((androidx.compose.ui.geometry.Offset) this.dragTotalDistance.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m1040setStartHandlePosition_kEHs6E(androidx.compose.ui.geometry.Offset offset) {
        this.startHandlePosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final androidx.compose.ui.geometry.Offset m1047getStartHandlePosition_m7T9E() {
        return (androidx.compose.ui.geometry.Offset) this.startHandlePosition.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m1039setEndHandlePosition_kEHs6E(androidx.compose.ui.geometry.Offset offset) {
        this.endHandlePosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final androidx.compose.ui.geometry.Offset m1046getEndHandlePosition_m7T9E() {
        return (androidx.compose.ui.geometry.Offset) this.endHandlePosition.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(androidx.compose.foundation.text.Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text.Handle getDraggingHandle() {
        return (androidx.compose.foundation.text.Handle) this.draggingHandle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m1036setCurrentDragPosition_kEHs6E(androidx.compose.ui.geometry.Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final androidx.compose.ui.geometry.Offset m1043getCurrentDragPosition_m7T9E() {
        return (androidx.compose.ui.geometry.Offset) this.currentDragPosition.getValue();
    }

    private final boolean getShouldShowMagnifier() {
        return (getDraggingHandle() == null || !isInTouchMode() || isTriviallyCollapsedSelection$foundation_release()) ? false : true;
    }

    /* renamed from: getPreviousSelectionLayout$foundation_release, reason: from getter */
    public final androidx.compose.foundation.text.selection.SelectionLayout getPreviousSelectionLayout() {
        return this.previousSelectionLayout;
    }

    public final void setPreviousSelectionLayout$foundation_release(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
        this.previousSelectionLayout = selectionLayout;
    }

    public final androidx.compose.foundation.text.selection.Selectable getAnchorSelectable$foundation_release(androidx.compose.foundation.text.selection.Selection.AnchorInfo anchor) {
        return this.selectionRegistrar.getSelectableMap$foundation_release().get(java.lang.Long.valueOf(anchor.getSelectableId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionManagerKt.m1055containsInclusiveUv8p0NA(r7, r8) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateHandleOffsets() {
        androidx.compose.ui.geometry.Offset offset;
        androidx.compose.foundation.text.selection.Selection.AnchorInfo end;
        androidx.compose.foundation.text.selection.Selection.AnchorInfo start;
        androidx.compose.foundation.text.selection.Selection selection = getSelection();
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        androidx.compose.ui.geometry.Offset offset2 = null;
        androidx.compose.foundation.text.selection.Selectable anchorSelectable$foundation_release = (selection == null || (start = selection.getStart()) == null) ? null : getAnchorSelectable$foundation_release(start);
        androidx.compose.foundation.text.selection.Selectable anchorSelectable$foundation_release2 = (selection == null || (end = selection.getEnd()) == null) ? null : getAnchorSelectable$foundation_release(end);
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = anchorSelectable$foundation_release != null ? anchorSelectable$foundation_release.getLayoutCoordinates() : null;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates3 = anchorSelectable$foundation_release2 != null ? anchorSelectable$foundation_release2.getLayoutCoordinates() : null;
        if (selection == null || layoutCoordinates == null || !layoutCoordinates.isAttached() || (layoutCoordinates2 == null && layoutCoordinates3 == null)) {
            m1040setStartHandlePosition_kEHs6E(null);
            m1039setEndHandlePosition_kEHs6E(null);
            return;
        }
        androidx.compose.ui.geometry.Rect visibleBounds = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(layoutCoordinates);
        if (layoutCoordinates2 != null) {
            long mo1003getHandlePositiondBAh8RU = anchorSelectable$foundation_release.mo1003getHandlePositiondBAh8RU(selection, true);
            if (!androidx.compose.ui.geometry.OffsetKt.m1892isUnspecifiedk4lQ0M(mo1003getHandlePositiondBAh8RU)) {
                offset = androidx.compose.ui.geometry.Offset.m1860boximpl(layoutCoordinates.mo3410localPositionOfR5De75A(layoutCoordinates2, mo1003getHandlePositiondBAh8RU));
                long packedValue = offset.getPackedValue();
                if (getDraggingHandle() != androidx.compose.foundation.text.Handle.SelectionStart) {
                }
                m1040setStartHandlePosition_kEHs6E(offset);
                if (layoutCoordinates3 != null) {
                    long mo1003getHandlePositiondBAh8RU2 = anchorSelectable$foundation_release2.mo1003getHandlePositiondBAh8RU(selection, false);
                    if (!androidx.compose.ui.geometry.OffsetKt.m1892isUnspecifiedk4lQ0M(mo1003getHandlePositiondBAh8RU2)) {
                        androidx.compose.ui.geometry.Offset m1860boximpl = androidx.compose.ui.geometry.Offset.m1860boximpl(layoutCoordinates.mo3410localPositionOfR5De75A(layoutCoordinates3, mo1003getHandlePositiondBAh8RU2));
                        long packedValue2 = m1860boximpl.getPackedValue();
                        if (getDraggingHandle() == androidx.compose.foundation.text.Handle.SelectionEnd || androidx.compose.foundation.text.selection.SelectionManagerKt.m1055containsInclusiveUv8p0NA(visibleBounds, packedValue2)) {
                            offset2 = m1860boximpl;
                        }
                    }
                }
                m1039setEndHandlePosition_kEHs6E(offset2);
            }
        }
        offset = null;
        m1040setStartHandlePosition_kEHs6E(offset);
        if (layoutCoordinates3 != null) {
        }
        m1039setEndHandlePosition_kEHs6E(offset2);
    }

    public final androidx.compose.ui.layout.LayoutCoordinates requireContainerCoordinates$foundation_release() {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null) {
            throw new java.lang.IllegalArgumentException("null coordinates".toString());
        }
        if (layoutCoordinates.isAttached()) {
            return layoutCoordinates;
        }
        throw new java.lang.IllegalArgumentException("unattached coordinates".toString());
    }

    public final kotlin.Pair<androidx.compose.foundation.text.selection.Selection, java.util.Map<java.lang.Long, androidx.compose.foundation.text.selection.Selection>> selectAll$foundation_release(long selectableId, androidx.compose.foundation.text.selection.Selection previousSelection) {
        androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        androidx.compose.foundation.text.selection.Selection selection = null;
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.text.selection.Selectable selectable = sort.get(i);
            androidx.compose.foundation.text.selection.Selection selectAllSelection = selectable.getSelectableId() == selectableId ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                linkedHashMap.put(java.lang.Long.valueOf(selectable.getSelectableId()), selectAllSelection);
            }
            selection = androidx.compose.foundation.text.selection.SelectionManagerKt.merge(selection, selectAllSelection);
        }
        if (isInTouchMode() && !kotlin.jvm.internal.Intrinsics.areEqual(selection, previousSelection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo2797performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m2806getTextHandleMove5zf0vsI());
        }
        return new kotlin.Pair<>(selection, linkedHashMap);
    }

    public final boolean isTriviallyCollapsedSelection$foundation_release() {
        androidx.compose.foundation.text.selection.Selection selection = getSelection();
        if (selection == null) {
            return true;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(selection.getStart(), selection.getEnd());
    }

    public final boolean isNonEmptySelection$foundation_release() {
        androidx.compose.foundation.text.selection.Selection selection = getSelection();
        if (selection == null || kotlin.jvm.internal.Intrinsics.areEqual(selection.getStart(), selection.getEnd())) {
            return false;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return true;
        }
        java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.text.selection.Selection selection2 = this.selectionRegistrar.getSubselections().get(java.lang.Long.valueOf(sort.get(i).getSelectableId()));
            if (selection2 != null && selection2.getStart().getOffset() != selection2.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final androidx.compose.ui.text.AnnotatedString getSelectedText$foundation_release() {
        androidx.compose.ui.text.AnnotatedString subSequence;
        if (getSelection() == null || this.selectionRegistrar.getSubselections().isEmpty()) {
            return null;
        }
        androidx.compose.ui.text.AnnotatedString.Builder builder = new androidx.compose.ui.text.AnnotatedString.Builder(0, 1, null);
        java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.text.selection.Selectable selectable = sort.get(i);
            androidx.compose.foundation.text.selection.Selection selection = this.selectionRegistrar.getSubselections().get(java.lang.Long.valueOf(selectable.getSelectableId()));
            if (selection != null) {
                androidx.compose.ui.text.AnnotatedString text = selectable.getText();
                if (selection.getHandlesCrossed()) {
                    subSequence = text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset());
                } else {
                    subSequence = text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset());
                }
                builder.append(subSequence);
            }
        }
        return builder.toAnnotatedString();
    }

    public final void copy$foundation_release() {
        androidx.compose.ui.platform.ClipboardManager clipboardManager;
        androidx.compose.ui.text.AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release != null) {
            if (selectedText$foundation_release.length() <= 0) {
                selectedText$foundation_release = null;
            }
            if (selectedText$foundation_release == null || (clipboardManager = this.clipboardManager) == null) {
                return;
            }
            clipboardManager.setText(selectedText$foundation_release);
        }
    }

    /* renamed from: getShowToolbar$foundation_release, reason: from getter */
    public final boolean getShowToolbar() {
        return this.showToolbar;
    }

    public final void setShowToolbar$foundation_release(boolean z) {
        this.showToolbar = z;
        updateSelectionToolbar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toolbarCopy() {
        copy$foundation_release();
        onRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbar() {
        androidx.compose.ui.platform.TextToolbar textToolbar;
        if (getHasFocus() && (textToolbar = this.textToolbar) != null) {
            if (this.showToolbar && isInTouchMode() && isNonEmptySelection$foundation_release()) {
                androidx.compose.ui.geometry.Rect contentRect = getContentRect();
                if (contentRect == null) {
                    return;
                }
                androidx.compose.ui.platform.TextToolbar.CC.showMenu$default(textToolbar, contentRect, new androidx.compose.foundation.text.selection.SelectionManager$updateSelectionToolbar$1(this), null, null, null, 28, null);
                return;
            }
            if (textToolbar.getStatus() == androidx.compose.ui.platform.TextToolbarStatus.Shown) {
                textToolbar.hide();
            }
        }
    }

    private final androidx.compose.ui.geometry.Rect getContentRect() {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        java.util.List firstAndLast;
        androidx.compose.ui.geometry.Rect rect;
        if (getSelection() == null || (layoutCoordinates = this.containerLayoutCoordinates) == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        java.util.ArrayList arrayList = new java.util.ArrayList(sort.size());
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.text.selection.Selectable selectable = sort.get(i);
            androidx.compose.foundation.text.selection.Selection selection = this.selectionRegistrar.getSubselections().get(java.lang.Long.valueOf(selectable.getSelectableId()));
            kotlin.Pair pair = selection != null ? kotlin.TuplesKt.to(selectable, selection) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        firstAndLast = androidx.compose.foundation.text.selection.SelectionManagerKt.firstAndLast(arrayList);
        if (firstAndLast.isEmpty()) {
            return null;
        }
        androidx.compose.ui.geometry.Rect selectedRegionRect = androidx.compose.foundation.text.selection.SelectionManagerKt.getSelectedRegionRect(firstAndLast, layoutCoordinates);
        rect = androidx.compose.foundation.text.selection.SelectionManagerKt.invertedInfiniteRect;
        if (kotlin.jvm.internal.Intrinsics.areEqual(selectedRegionRect, rect)) {
            return null;
        }
        androidx.compose.ui.geometry.Rect intersect = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(layoutCoordinates).intersect(selectedRegionRect);
        if (intersect.getWidth() < 0.0f || intersect.getHeight() < 0.0f) {
            return null;
        }
        return androidx.compose.ui.geometry.Rect.copy$default(intersect.m1908translatek4lQ0M(androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(layoutCoordinates)), 0.0f, 0.0f, 0.0f, intersect.getBottom() + (androidx.compose.foundation.text.selection.SelectionHandlesKt.getHandleHeight() * 4), 7, null);
    }

    public final void onRelease() {
        androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback;
        this.selectionRegistrar.setSubselections(kotlin.collections.MapsKt.emptyMap());
        setShowToolbar$foundation_release(false);
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            if (!isInTouchMode() || (hapticFeedback = this.hapticFeedBack) == null) {
                return;
            }
            hapticFeedback.mo2797performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m2806getTextHandleMove5zf0vsI());
        }
    }

    public final androidx.compose.foundation.text.TextDragObserver handleDragObserver(final boolean isStartHandle) {
        return new androidx.compose.foundation.text.TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo918onDownk4lQ0M(long point) {
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
                androidx.compose.ui.geometry.Offset m1047getStartHandlePosition_m7T9E = isStartHandle ? this.m1047getStartHandlePosition_m7T9E() : this.m1046getEndHandlePosition_m7T9E();
                if (m1047getStartHandlePosition_m7T9E != null) {
                    m1047getStartHandlePosition_m7T9E.getPackedValue();
                    androidx.compose.foundation.text.selection.Selection selection = this.getSelection();
                    if (selection == null) {
                        return;
                    }
                    androidx.compose.foundation.text.selection.Selectable anchorSelectable$foundation_release = this.getAnchorSelectable$foundation_release(isStartHandle ? selection.getStart() : selection.getEnd());
                    if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                        return;
                    }
                    long mo1003getHandlePositiondBAh8RU = anchorSelectable$foundation_release.mo1003getHandlePositiondBAh8RU(selection, isStartHandle);
                    if (androidx.compose.ui.geometry.OffsetKt.m1892isUnspecifiedk4lQ0M(mo1003getHandlePositiondBAh8RU)) {
                        return;
                    }
                    long m1018getAdjustedCoordinatesk4lQ0M = androidx.compose.foundation.text.selection.SelectionHandlesKt.m1018getAdjustedCoordinatesk4lQ0M(mo1003getHandlePositiondBAh8RU);
                    androidx.compose.foundation.text.selection.SelectionManager selectionManager = this;
                    selectionManager.m1036setCurrentDragPosition_kEHs6E(androidx.compose.ui.geometry.Offset.m1860boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo3410localPositionOfR5De75A(layoutCoordinates, m1018getAdjustedCoordinatesk4lQ0M)));
                    this.setDraggingHandle(isStartHandle ? androidx.compose.foundation.text.Handle.SelectionStart : androidx.compose.foundation.text.Handle.SelectionEnd);
                    this.setShowToolbar$foundation_release(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo920onStartk4lQ0M(long startPoint) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                androidx.compose.foundation.text.selection.Selection selection = this.getSelection();
                kotlin.jvm.internal.Intrinsics.checkNotNull(selection);
                androidx.compose.foundation.text.selection.Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get(java.lang.Long.valueOf((isStartHandle ? selection.getStart() : selection.getEnd()).getSelectableId()));
                if (selectable == null) {
                    throw new java.lang.IllegalStateException("SelectionRegistrar should contain the current selection's selectableIds".toString());
                }
                androidx.compose.foundation.text.selection.Selectable selectable2 = selectable;
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = selectable2.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    throw new java.lang.IllegalStateException("Current selectable should have layout coordinates.".toString());
                }
                long mo1003getHandlePositiondBAh8RU = selectable2.mo1003getHandlePositiondBAh8RU(selection, isStartHandle);
                if (androidx.compose.ui.geometry.OffsetKt.m1892isUnspecifiedk4lQ0M(mo1003getHandlePositiondBAh8RU)) {
                    return;
                }
                long m1018getAdjustedCoordinatesk4lQ0M = androidx.compose.foundation.text.selection.SelectionHandlesKt.m1018getAdjustedCoordinatesk4lQ0M(mo1003getHandlePositiondBAh8RU);
                androidx.compose.foundation.text.selection.SelectionManager selectionManager = this;
                selectionManager.m1037setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().mo3410localPositionOfR5De75A(layoutCoordinates, m1018getAdjustedCoordinatesk4lQ0M));
                this.m1038setDragTotalDistancek4lQ0M(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo919onDragk4lQ0M(long delta) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                androidx.compose.foundation.text.selection.SelectionManager selectionManager = this;
                selectionManager.m1038setDragTotalDistancek4lQ0M(androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(selectionManager.m1045getDragTotalDistanceF1C5BW0$foundation_release(), delta));
                long m1876plusMKHz9U = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(this.m1044getDragBeginPositionF1C5BW0$foundation_release(), this.m1045getDragTotalDistanceF1C5BW0$foundation_release());
                if (this.m1049updateSelectionqNKwrvQ$foundation_release(androidx.compose.ui.geometry.Offset.m1860boximpl(m1876plusMKHz9U), this.m1044getDragBeginPositionF1C5BW0$foundation_release(), isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate())) {
                    this.m1037setDragBeginPositionk4lQ0M(m1876plusMKHz9U);
                    this.m1038setDragTotalDistancek4lQ0M(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
                }
            }

            private final void done() {
                this.setShowToolbar$foundation_release(true);
                this.setDraggingHandle(null);
                this.m1036setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                done();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object detectNonConsumingTap(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2(function1, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }

    private final androidx.compose.ui.Modifier onClearSelectionRequested(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        return getHasFocus() ? androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifier, kotlin.Unit.INSTANCE, new androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1(this, function0, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToContainerCoordinates-R5De75A, reason: not valid java name */
    public final long m1034convertToContainerCoordinatesR5De75A(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, long offset) {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        return requireContainerCoordinates$foundation_release().mo3410localPositionOfR5De75A(layoutCoordinates, offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSelection-9KIMszo, reason: not valid java name */
    public final void m1041startSelection9KIMszo(long position, boolean isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment) {
        this.previousSelectionLayout = null;
        m1048updateSelectionjyLRC_s$foundation_release(position, androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0(), isStartHandle, adjustment);
    }

    /* renamed from: updateSelection-qNKwrvQ$foundation_release, reason: not valid java name */
    public final boolean m1049updateSelectionqNKwrvQ$foundation_release(androidx.compose.ui.geometry.Offset newPosition, long previousPosition, boolean isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment) {
        if (newPosition == null) {
            return false;
        }
        return m1048updateSelectionjyLRC_s$foundation_release(newPosition.getPackedValue(), previousPosition, isStartHandle, adjustment);
    }

    /* renamed from: updateSelection-jyLRC_s$foundation_release, reason: not valid java name */
    public final boolean m1048updateSelectionjyLRC_s$foundation_release(long position, long previousHandlePosition, boolean isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment) {
        setDraggingHandle(isStartHandle ? androidx.compose.foundation.text.Handle.SelectionStart : androidx.compose.foundation.text.Handle.SelectionEnd);
        m1036setCurrentDragPosition_kEHs6E(androidx.compose.ui.geometry.Offset.m1860boximpl(position));
        androidx.compose.foundation.text.selection.SelectionLayout m1035getSelectionLayoutWko1d7g = m1035getSelectionLayoutWko1d7g(position, previousHandlePosition, isStartHandle);
        if (!m1035getSelectionLayoutWko1d7g.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return false;
        }
        androidx.compose.foundation.text.selection.Selection adjust = adjustment.adjust(m1035getSelectionLayoutWko1d7g);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(adjust, getSelection())) {
            selectionChanged(m1035getSelectionLayoutWko1d7g, adjust);
        }
        this.previousSelectionLayout = m1035getSelectionLayoutWko1d7g;
        return true;
    }

    /* renamed from: getSelectionLayout-Wko1d7g, reason: not valid java name */
    private final androidx.compose.foundation.text.selection.SelectionLayout m1035getSelectionLayoutWko1d7g(long position, long previousHandlePosition, boolean isStartHandle) {
        androidx.compose.ui.layout.LayoutCoordinates requireContainerCoordinates$foundation_release = requireContainerCoordinates$foundation_release();
        java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release);
        final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            linkedHashMap.put(java.lang.Long.valueOf(sort.get(i).getSelectableId()), java.lang.Integer.valueOf(i));
        }
        androidx.compose.foundation.text.selection.SelectionLayoutBuilder selectionLayoutBuilder = new androidx.compose.foundation.text.selection.SelectionLayoutBuilder(position, previousHandlePosition, requireContainerCoordinates$foundation_release, isStartHandle, androidx.compose.ui.geometry.OffsetKt.m1892isUnspecifiedk4lQ0M(previousHandlePosition) ? null : getSelection(), new java.util.Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Comparable) linkedHashMap.get(java.lang.Long.valueOf(((java.lang.Number) t).longValue())), (java.lang.Comparable) linkedHashMap.get(java.lang.Long.valueOf(((java.lang.Number) t2).longValue())));
            }
        }, null);
        int size2 = sort.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sort.get(i2).appendSelectableInfoToBuilder(selectionLayoutBuilder);
        }
        return selectionLayoutBuilder.build();
    }

    private final void selectionChanged(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout, androidx.compose.foundation.text.selection.Selection newSelection) {
        androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback;
        if (shouldPerformHaptics$foundation_release() && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo2797performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m2806getTextHandleMove5zf0vsI());
        }
        this.selectionRegistrar.setSubselections(selectionLayout.createSubSelections(newSelection));
        this.onSelectionChange.invoke(newSelection);
    }

    public final boolean shouldPerformHaptics$foundation_release() {
        if (!isInTouchMode()) {
            return false;
        }
        java.util.List<androidx.compose.foundation.text.selection.Selectable> selectables$foundation_release = this.selectionRegistrar.getSelectables$foundation_release();
        int size = selectables$foundation_release.size();
        for (int i = 0; i < size; i++) {
            if (selectables$foundation_release.get(i).getText().length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m1042contextMenuOpenAdjustmentk4lQ0M(long position) {
        androidx.compose.foundation.text.selection.Selection selection = getSelection();
        if (selection == null || androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(selection.m1009toTextRanged9O1mEE())) {
            m1041startSelection9KIMszo(position, true, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getWord());
        }
    }
}
