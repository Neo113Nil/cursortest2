package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR,\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR,\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\rRB\u0010\u0016\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u0015\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u0015\u0012\u0004\u0012\u00020\t0\u00130\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rRA\u0010\u001a\u001a)\u0012%\u0012#\b\u0001\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR2\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR8\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u000b\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b!\u0010\rR2\u0010$\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\rR7\u0010&\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0015\u0012\u0013\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u0015\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\rR>\u0010)\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0(0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u000b\u001a\u0004\b*\u0010\rR2\u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u000b\u001a\u0004\b,\u0010\rR2\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\b.\u0010\rR2\u0010/\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u000b\u001a\u0004\b0\u0010\rR,\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u000b\u001a\u0004\b2\u0010\rR2\u00103\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u000b\u001a\u0004\b4\u0010\rR,\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u000b\u001a\u0004\b6\u0010\rR2\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010\u000b\u0012\u0004\b9\u0010\u0003\u001a\u0004\b8\u0010\rR,\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR,\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u000b\u001a\u0004\b=\u0010\rR,\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u000b\u001a\u0004\b?\u0010\rR,\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u000b\u001a\u0004\bA\u0010\rR,\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010\u000b\u001a\u0004\bC\u0010\rR,\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\u000b\u001a\u0004\bE\u0010\rR,\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u000b\u001a\u0004\bG\u0010\rR&\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0H0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010\u000b\u001a\u0004\bK\u0010\rR,\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010\u000b\u001a\u0004\bM\u0010\rR,\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010\u000b\u001a\u0004\bO\u0010\rR,\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010\u000b\u001a\u0004\bQ\u0010\rR,\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010\u000b\u001a\u0004\bS\u0010\rR8\u0010T\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010\u000b\u001a\u0004\bU\u0010\r"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", "GetTextLayoutResult", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getGetTextLayoutResult", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "OnClick", "getOnClick", "OnLongClick", "getOnLongClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "ScrollBy", "getScrollBy", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "ScrollByOffset", "getScrollByOffset", "", "ScrollToIndex", "getScrollToIndex", "Landroidx/compose/ui/text/AnnotatedString;", "OnAutofillText", "getOnAutofillText", "getOnAutofillText$annotations", "Landroidx/compose/ui/autofill/FillableData;", "OnFillData", "getOnFillData", "SetProgress", "getSetProgress", "Lkotlin/Function3;", "SetSelection", "getSetSelection", "SetText", "getSetText", "SetTextSubstitution", "getSetTextSubstitution", "ShowTextSubstitution", "getShowTextSubstitution", "ClearTextSubstitution", "getClearTextSubstitution", "InsertTextAtCursor", "getInsertTextAtCursor", "OnImeAction", "getOnImeAction", "PerformImeAction", "getPerformImeAction", "getPerformImeAction$annotations", "CopyText", "getCopyText", "CutText", "getCutText", "PasteText", "getPasteText", "Expand", "getExpand", "Collapse", "getCollapse", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, "getDismiss", "RequestFocus", "getRequestFocus", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "CustomActions", "getCustomActions", "PageUp", "getPageUp", "PageLeft", "getPageLeft", "PageDown", "getPageDown", "PageRight", "getPageRight", "GetScrollViewportLength", "getGetScrollViewportLength"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsActions {
    public static final androidx.compose.ui.semantics.SemanticsActions INSTANCE = new androidx.compose.ui.semantics.SemanticsActions();
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.text.TextLayoutResult>, java.lang.Boolean>>> GetTextLayoutResult = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("GetTextLayoutResult", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> OnClick = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("OnClick", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> OnLongClick = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("OnLongClick", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function2<java.lang.Float, java.lang.Float, java.lang.Boolean>>> ScrollBy = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("ScrollBy", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset>, java.lang.Object>> ScrollByOffset = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("ScrollByOffset", (kotlin.jvm.functions.Function2) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean>>> ScrollToIndex = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("ScrollToIndex", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>>> OnAutofillText = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("OnAutofillText", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<androidx.compose.ui.autofill.FillableData, java.lang.Boolean>>> OnFillData = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("OnFillData", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Boolean>>> SetProgress = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("SetProgress", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean>>> SetSelection = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("SetSelection", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>>> SetText = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("SetText", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>>> SetTextSubstitution = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("SetTextSubstitution", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>>> ShowTextSubstitution = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("ShowTextSubstitution", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> ClearTextSubstitution = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("ClearTextSubstitution", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>>> InsertTextAtCursor = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("InsertTextAtCursor", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> OnImeAction = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("PerformImeAction", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> PerformImeAction = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("PerformImeAction", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> CopyText = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("CopyText", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> CutText = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("CutText", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> PasteText = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("PasteText", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> Expand = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("Expand", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> Collapse = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("Collapse", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> Dismiss = new androidx.compose.ui.semantics.SemanticsPropertyKey<>(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> RequestFocus = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("RequestFocus", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.util.List<androidx.compose.ui.semantics.CustomAccessibilityAction>> CustomActions = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("CustomActions", true, new kotlin.jvm.functions.Function2<java.util.List<? extends androidx.compose.ui.semantics.CustomAccessibilityAction>, java.util.List<? extends androidx.compose.ui.semantics.CustomAccessibilityAction>, java.util.List<? extends androidx.compose.ui.semantics.CustomAccessibilityAction>>() { // from class: androidx.compose.ui.semantics.SemanticsActions$CustomActions$1
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final java.util.List<androidx.compose.ui.semantics.CustomAccessibilityAction> invoke(java.util.List<androidx.compose.ui.semantics.CustomAccessibilityAction> list, java.util.List<androidx.compose.ui.semantics.CustomAccessibilityAction> list2) {
            if (list == null) {
                list = kotlin.collections.CollectionsKt.emptyList();
            }
            return kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) list2);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> PageUp = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("PageUp", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> PageLeft = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("PageLeft", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> PageDown = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("PageDown", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> PageRight = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("PageRight", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<java.util.List<java.lang.Float>, java.lang.Boolean>>> GetScrollViewportLength = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("GetScrollViewportLength", true, new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
            java.lang.String label;
            T action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
        }
    }, null, 8, null);
    public static final int $stable = 8;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use `SemanticsActions.OnFillData` instead.", replaceWith = @kotlin.ReplaceWith(expression = "OnFillData", imports = {"androidx.compose.ui.semantics.SemanticsActions.OnFillData"}))
    public static /* synthetic */ void getOnAutofillText$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use `SemanticsActions.OnImeAction` instead.", replaceWith = @kotlin.ReplaceWith(expression = "OnImeAction", imports = {"androidx.compose.ui.semantics.SemanticsActions.OnImeAction"}))
    public static /* synthetic */ void getPerformImeAction$annotations() {
    }

    private SemanticsActions() {
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<java.util.List<androidx.compose.ui.text.TextLayoutResult>, java.lang.Boolean>>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getOnClick() {
        return OnClick;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getOnLongClick() {
        return OnLongClick;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function2<java.lang.Float, java.lang.Float, java.lang.Boolean>>> getScrollBy() {
        return ScrollBy;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset>, java.lang.Object>> getScrollByOffset() {
        return ScrollByOffset;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean>>> getScrollToIndex() {
        return ScrollToIndex;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>>> getOnAutofillText() {
        return OnAutofillText;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<androidx.compose.ui.autofill.FillableData, java.lang.Boolean>>> getOnFillData() {
        return OnFillData;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Boolean>>> getSetProgress() {
        return SetProgress;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean>>> getSetSelection() {
        return SetSelection;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>>> getSetText() {
        return SetText;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>>> getSetTextSubstitution() {
        return SetTextSubstitution;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>>> getShowTextSubstitution() {
        return ShowTextSubstitution;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getClearTextSubstitution() {
        return ClearTextSubstitution;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, java.lang.Boolean>>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getOnImeAction() {
        return OnImeAction;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getPerformImeAction() {
        return PerformImeAction;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getCopyText() {
        return CopyText;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getCutText() {
        return CutText;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getPasteText() {
        return PasteText;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getExpand() {
        return Expand;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getCollapse() {
        return Collapse;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getDismiss() {
        return Dismiss;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getRequestFocus() {
        return RequestFocus;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.util.List<androidx.compose.ui.semantics.CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getPageUp() {
        return PageUp;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getPageLeft() {
        return PageLeft;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getPageDown() {
        return PageDown;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function0<java.lang.Boolean>>> getPageRight() {
        return PageRight;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<kotlin.jvm.functions.Function1<java.util.List<java.lang.Float>, java.lang.Boolean>>> getGetScrollViewportLength() {
        return GetScrollViewportLength;
    }
}
