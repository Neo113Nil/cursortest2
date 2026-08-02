package androidx.compose.ui.input.key;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000bR$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Landroidx/compose/ui/input/key/InterceptedKeyInputNode;", "Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onInterceptKeyBeforeSoftKeyboard-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onInterceptKeyBeforeSoftKeyboard", "onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo", "onPreInterceptKeyBeforeSoftKeyboard", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InterceptedKeyInputNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> getHighSpeedVideoFpsRanges;

    public InterceptedKeyInputNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> function12) {
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoFpsRanges = function12;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public final boolean mo6776onInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent p0) {
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> function1 = this.getHighSpeedVideoFpsRangesFor;
        if (function1 != null) {
            return function1.invoke(androidx.compose.ui.input.key.KeyEvent.m7072boximpl(p0)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public final boolean mo6777onPreInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent p0) {
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> function1 = this.getHighSpeedVideoFpsRanges;
        if (function1 != null) {
            return function1.invoke(androidx.compose.ui.input.key.KeyEvent.m7072boximpl(p0)).booleanValue();
        }
        return false;
    }
}
