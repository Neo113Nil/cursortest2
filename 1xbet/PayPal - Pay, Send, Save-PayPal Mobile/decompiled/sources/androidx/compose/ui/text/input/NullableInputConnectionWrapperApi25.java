package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi25;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi24;", "Landroid/view/inputmethod/InputConnection;", "p0", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "", "p1", "<init>", "(Landroid/view/inputmethod/InputConnection;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/inputmethod/InputContentInfo;", "", "Landroid/os/Bundle;", "p2", "", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
class NullableInputConnectionWrapperApi25 extends androidx.compose.ui.text.input.NullableInputConnectionWrapperApi24 {
    public NullableInputConnectionWrapperApi25(android.view.inputmethod.InputConnection inputConnection, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.NullableInputConnectionWrapper, kotlin.Unit> function1) {
        super(inputConnection, function1);
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2) {
        android.view.inputmethod.InputConnection Camera2StreamConfigurationMap = getGetHighSpeedVideoSizes();
        if (Camera2StreamConfigurationMap != null) {
            return Camera2StreamConfigurationMap.commitContent(p0, p1, p2);
        }
        return false;
    }
}
