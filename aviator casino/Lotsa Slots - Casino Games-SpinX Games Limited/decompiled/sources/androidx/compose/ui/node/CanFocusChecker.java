package androidx.compose.ui.node;

/* compiled from: NodeKind.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u000eR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/CanFocusChecker;", "Landroidx/compose/ui/focus/FocusProperties;", "()V", "value", "", "canFocus", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "canFocusValue", "Ljava/lang/Boolean;", "isCanFocusSet", "reset", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class CanFocusChecker implements androidx.compose.ui.focus.FocusProperties {
    public static final androidx.compose.ui.node.CanFocusChecker INSTANCE = new androidx.compose.ui.node.CanFocusChecker();
    private static java.lang.Boolean canFocusValue;

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ androidx.compose.ui.focus.FocusRequester getDown() {
        androidx.compose.ui.focus.FocusRequester focusRequester;
        focusRequester = androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault();
        return focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ androidx.compose.ui.focus.FocusRequester getEnd() {
        androidx.compose.ui.focus.FocusRequester focusRequester;
        focusRequester = androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault();
        return focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ kotlin.jvm.functions.Function1 getEnter() {
        kotlin.jvm.functions.Function1 function1;
        function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusDirection, androidx.compose.ui.focus.FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$enter$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.focus.FocusRequester invoke(androidx.compose.ui.focus.FocusDirection focusDirection) {
                return m1811invoke3ESFkO8(focusDirection.getValue());
            }

            /* renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final androidx.compose.ui.focus.FocusRequester m1811invoke3ESFkO8(int i) {
                return androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault();
            }
        };
        return function1;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ kotlin.jvm.functions.Function1 getExit() {
        kotlin.jvm.functions.Function1 function1;
        function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusDirection, androidx.compose.ui.focus.FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$exit$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.focus.FocusRequester invoke(androidx.compose.ui.focus.FocusDirection focusDirection) {
                return m1812invoke3ESFkO8(focusDirection.getValue());
            }

            /* renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final androidx.compose.ui.focus.FocusRequester m1812invoke3ESFkO8(int i) {
                return androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault();
            }
        };
        return function1;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ androidx.compose.ui.focus.FocusRequester getLeft() {
        androidx.compose.ui.focus.FocusRequester focusRequester;
        focusRequester = androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault();
        return focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ androidx.compose.ui.focus.FocusRequester getNext() {
        androidx.compose.ui.focus.FocusRequester focusRequester;
        focusRequester = androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault();
        return focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ androidx.compose.ui.focus.FocusRequester getPrevious() {
        androidx.compose.ui.focus.FocusRequester focusRequester;
        focusRequester = androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault();
        return focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ androidx.compose.ui.focus.FocusRequester getRight() {
        androidx.compose.ui.focus.FocusRequester focusRequester;
        focusRequester = androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault();
        return focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ androidx.compose.ui.focus.FocusRequester getStart() {
        androidx.compose.ui.focus.FocusRequester focusRequester;
        focusRequester = androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault();
        return focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ androidx.compose.ui.focus.FocusRequester getUp() {
        androidx.compose.ui.focus.FocusRequester focusRequester;
        focusRequester = androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault();
        return focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setDown(androidx.compose.ui.focus.FocusRequester focusRequester) {
        androidx.compose.ui.focus.FocusProperties.CC.$default$setDown(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setEnd(androidx.compose.ui.focus.FocusRequester focusRequester) {
        androidx.compose.ui.focus.FocusProperties.CC.$default$setEnd(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setEnter(kotlin.jvm.functions.Function1 function1) {
        androidx.compose.ui.focus.FocusProperties.CC.$default$setEnter(this, function1);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setExit(kotlin.jvm.functions.Function1 function1) {
        androidx.compose.ui.focus.FocusProperties.CC.$default$setExit(this, function1);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setLeft(androidx.compose.ui.focus.FocusRequester focusRequester) {
        androidx.compose.ui.focus.FocusProperties.CC.$default$setLeft(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setNext(androidx.compose.ui.focus.FocusRequester focusRequester) {
        androidx.compose.ui.focus.FocusProperties.CC.$default$setNext(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setPrevious(androidx.compose.ui.focus.FocusRequester focusRequester) {
        androidx.compose.ui.focus.FocusProperties.CC.$default$setPrevious(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setRight(androidx.compose.ui.focus.FocusRequester focusRequester) {
        androidx.compose.ui.focus.FocusProperties.CC.$default$setRight(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setStart(androidx.compose.ui.focus.FocusRequester focusRequester) {
        androidx.compose.ui.focus.FocusProperties.CC.$default$setStart(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setUp(androidx.compose.ui.focus.FocusRequester focusRequester) {
        androidx.compose.ui.focus.FocusProperties.CC.$default$setUp(this, focusRequester);
    }

    private CanFocusChecker() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        java.lang.Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new java.lang.IllegalStateException("canFocus is read before it is written".toString());
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z) {
        canFocusValue = java.lang.Boolean.valueOf(z);
    }

    public final boolean isCanFocusSet() {
        return canFocusValue != null;
    }

    public final void reset() {
        canFocusValue = null;
    }
}
