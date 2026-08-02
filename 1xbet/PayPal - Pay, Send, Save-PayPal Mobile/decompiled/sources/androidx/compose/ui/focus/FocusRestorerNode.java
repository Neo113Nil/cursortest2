package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\u00020\u00058\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\bR%\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0012¢\u0006\u0002\b\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R%\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0012¢\u0006\u0002\b\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016"}, d2 = {"Landroidx/compose/ui/focus/FocusRestorerNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusRequester;", "fallback", "<init>", "(Landroidx/compose/ui/focus/FocusRequester;)V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "", "applyFocusProperties", "(Landroidx/compose/ui/focus/FocusProperties;)V", "Landroidx/compose/ui/focus/FocusRequester;", "getFallback", "()Landroidx/compose/ui/focus/FocusRequester;", "setFallback", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "Lkotlin/ExtensionFunctionType;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FocusRestorerNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.focus.FocusPropertiesModifierNode, androidx.compose.ui.focus.FocusRequesterModifierNode {
    public static final int $stable = 8;
    private androidx.compose.ui.focus.FocusRequester fallback;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusEnterExitScope, kotlin.Unit> getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusEnterExitScope, kotlin.Unit>() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onExit$1
        public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.focus.FocusEnterExitScope focusEnterExitScope) {
            androidx.compose.ui.focus.FocusRequesterModifierNodeKt.saveFocusedChild(androidx.compose.ui.focus.FocusRestorerNode.this);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusEnterExitScope focusEnterExitScope) {
            getHighResolutionOutputSizeshNQ4ISI(focusEnterExitScope);
            return kotlin.Unit.INSTANCE;
        }

        {
            super(1);
        }
    };

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusEnterExitScope, kotlin.Unit> getHighSpeedVideoSizes = new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusEnterExitScope, kotlin.Unit>() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onEnter$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusEnterExitScope focusEnterExitScope) {
            getHighResolutionOutputSizeshNQ4ISI(focusEnterExitScope);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.focus.FocusEnterExitScope focusEnterExitScope) {
            if (androidx.compose.ui.focus.FocusRequesterModifierNodeKt.restoreFocusedChild(androidx.compose.ui.focus.FocusRestorerNode.this) || kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.focus.FocusRestorerNode.this.getFallback(), androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault())) {
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.focus.FocusRestorerNode.this.getFallback(), androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel())) {
                focusEnterExitScope.cancelFocusChange();
            } else {
                androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(androidx.compose.ui.focus.FocusRestorerNode.this.getFallback(), 0, 1, null);
            }
        }

        {
            super(1);
        }
    };

    public FocusRestorerNode(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }

    public final androidx.compose.ui.focus.FocusRequester getFallback() {
        return this.fallback;
    }

    public final void setFallback(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(androidx.compose.ui.focus.FocusProperties focusProperties) {
        focusProperties.setOnEnter(this.getHighSpeedVideoSizes);
        focusProperties.setOnExit(this.getHighSpeedVideoFpsRangesFor);
    }
}
