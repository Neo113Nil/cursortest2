package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J#\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u001d\u001a\u00020\u0018H&¢\u0006\u0004\b\u001d\u0010\u001aJ\u0011\u0010$\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H&¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H&¢\u0006\u0004\b(\u0010'J'\u0010/\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060+H&¢\u0006\u0004\b-\u0010.J\u0017\u00102\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H&¢\u0006\u0004\b0\u00101J'\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u0002032\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060+H&¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00062\u0006\u00104\u001a\u000207H&¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0018H&¢\u0006\u0004\b:\u0010\u001aJ\u000f\u0010;\u001a\u00020\u0018H&¢\u0006\u0004\b;\u0010\u001aJ\u0017\u0010=\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\fH&¢\u0006\u0004\b=\u0010>J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010<\u001a\u00020?H&¢\u0006\u0004\b=\u0010@J\u000f\u0010A\u001a\u00020\u0018H&¢\u0006\u0004\bA\u0010\u001aR\u0014\u0010E\u001a\u00020B8'X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020G0F8'X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8'X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001e\u0010R\u001a\u0004\u0018\u00010\f8'@'X¦\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010>R\u001c\u0010S\u001a\u00020\u00068'@'X¦\u000e¢\u0006\f\u001a\u0004\bS\u0010'\"\u0004\bT\u0010Uø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/focus/FocusManager;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "", "requestOwnerFocus-7o62pno", "(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", "requestOwnerFocus", "focusedRect", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "focusSearch-ULY8qGw", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "focusSearch", "wrapAroundForOneDimensionalFocus", "moveFocus-aToIllA", "(IZ)Z", "moveFocus", "takeFocus-aToIllA", "(ILandroidx/compose/ui/geometry/Rect;)Z", "takeFocus", "", "releaseFocus", "()V", "force", "refreshFocusEvents", "clearOwnerFocus", "clearFocus-I7lrPNg", "(ZZZI)Z", "clearFocus", "resetFocus-3ESFkO8", "(I)Z", "resetFocus", "getFocusRect", "()Landroidx/compose/ui/geometry/Rect;", "hasFocusableContent", "()Z", "hasNonInteropFocusableContent", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "Lkotlin/Function0;", "onFocusedItem", "dispatchKeyEvent-YhN2O0w", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "dispatchKeyEvent", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchInterceptedSoftKeyboardEvent", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "event", "dispatchRotaryEvent", "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;Lkotlin/jvm/functions/Function0;)Z", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "dispatchIndirectPointerEvent", "(Landroidx/compose/ui/input/indirect/IndirectPointerEvent;)Z", "dispatchIndirectPointerCancel", "focusTargetAvailable", "node", "scheduleInvalidation", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "scheduleInvalidationForOwner", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/focus/FocusListener;", "getListeners", "()Landroidx/collection/MutableObjectList;", "listeners", "Landroidx/compose/ui/focus/FocusState;", "getRootState", "()Landroidx/compose/ui/focus/FocusState;", "rootState", "getActiveFocusTargetNode", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setActiveFocusTargetNode", "activeFocusTargetNode", "isFocusCaptured", "setFocusCaptured", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FocusOwner extends androidx.compose.ui.focus.FocusManager {
    /* renamed from: clearFocus-I7lrPNg, reason: not valid java name */
    boolean mo5661clearFocusI7lrPNg(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection);

    void clearOwnerFocus();

    void dispatchIndirectPointerCancel();

    boolean dispatchIndirectPointerEvent(androidx.compose.ui.input.indirect.IndirectPointerEvent event);

    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo, reason: not valid java name */
    boolean mo5662dispatchInterceptedSoftKeyboardEventZmokQxo(android.view.KeyEvent keyEvent);

    /* renamed from: dispatchKeyEvent-YhN2O0w, reason: not valid java name */
    boolean mo5663dispatchKeyEventYhN2O0w(android.view.KeyEvent keyEvent, kotlin.jvm.functions.Function0<java.lang.Boolean> onFocusedItem);

    boolean dispatchRotaryEvent(androidx.compose.ui.input.rotary.RotaryScrollEvent event, kotlin.jvm.functions.Function0<java.lang.Boolean> onFocusedItem);

    /* renamed from: focusSearch-ULY8qGw, reason: not valid java name */
    java.lang.Boolean mo5664focusSearchULY8qGw(int focusDirection, androidx.compose.ui.geometry.Rect focusedRect, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> onFound);

    void focusTargetAvailable();

    androidx.compose.ui.focus.FocusTargetNode getActiveFocusTargetNode();

    androidx.compose.ui.geometry.Rect getFocusRect();

    androidx.collection.MutableObjectList<androidx.compose.ui.focus.FocusListener> getListeners();

    androidx.compose.ui.Modifier getModifier();

    androidx.compose.ui.focus.FocusState getRootState();

    boolean hasFocusableContent();

    boolean hasNonInteropFocusableContent();

    boolean isFocusCaptured();

    /* renamed from: moveFocus-aToIllA, reason: not valid java name */
    boolean mo5665moveFocusaToIllA(int focusDirection, boolean wrapAroundForOneDimensionalFocus);

    void releaseFocus();

    /* renamed from: requestOwnerFocus-7o62pno, reason: not valid java name */
    boolean mo5666requestOwnerFocus7o62pno(androidx.compose.ui.focus.FocusDirection focusDirection, androidx.compose.ui.geometry.Rect previouslyFocusedRect);

    /* renamed from: resetFocus-3ESFkO8, reason: not valid java name */
    boolean mo5667resetFocus3ESFkO8(int focusDirection);

    void scheduleInvalidation(androidx.compose.ui.focus.FocusEventModifierNode node);

    void scheduleInvalidation(androidx.compose.ui.focus.FocusTargetNode node);

    void scheduleInvalidationForOwner();

    void setActiveFocusTargetNode(androidx.compose.ui.focus.FocusTargetNode focusTargetNode);

    void setFocusCaptured(boolean z);

    /* renamed from: takeFocus-aToIllA, reason: not valid java name */
    boolean mo5668takeFocusaToIllA(int focusDirection, androidx.compose.ui.geometry.Rect previouslyFocusedRect);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: dispatchKeyEvent-YhN2O0w$default, reason: not valid java name */
    static /* synthetic */ boolean m5660dispatchKeyEventYhN2O0w$default(androidx.compose.ui.focus.FocusOwner focusOwner, android.view.KeyEvent keyEvent, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke() {
                    return java.lang.Boolean.FALSE;
                }
            };
        }
        return focusOwner.mo5663dispatchKeyEventYhN2O0w(keyEvent, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean dispatchRotaryEvent$default(androidx.compose.ui.focus.FocusOwner focusOwner, androidx.compose.ui.input.rotary.RotaryScrollEvent rotaryScrollEvent, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchRotaryEvent");
        }
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchRotaryEvent$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke() {
                    return java.lang.Boolean.FALSE;
                }
            };
        }
        return focusOwner.dispatchRotaryEvent(rotaryScrollEvent, function0);
    }
}
