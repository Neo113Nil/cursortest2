package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi34;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi25;", "Landroid/view/inputmethod/InputConnection;", "p0", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "", "p1", "<init>", "(Landroid/view/inputmethod/InputConnection;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/inputmethod/HandwritingGesture;", "Ljava/util/concurrent/Executor;", "Ljava/util/function/IntConsumer;", "p2", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
class NullableInputConnectionWrapperApi34 extends androidx.compose.ui.text.input.NullableInputConnectionWrapperApi25 {
    public NullableInputConnectionWrapperApi34(android.view.inputmethod.InputConnection inputConnection, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.NullableInputConnectionWrapper, kotlin.Unit> function1) {
        super(inputConnection, function1);
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture p0, java.util.concurrent.Executor p1, java.util.function.IntConsumer p2) {
        android.view.inputmethod.InputConnection Camera2StreamConfigurationMap = getGetHighSpeedVideoSizes();
        if (Camera2StreamConfigurationMap != null) {
            Camera2StreamConfigurationMap.performHandwritingGesture(p0, p1, p2);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture p0, android.os.CancellationSignal p1) {
        android.view.inputmethod.InputConnection Camera2StreamConfigurationMap = getGetHighSpeedVideoSizes();
        if (Camera2StreamConfigurationMap != null) {
            return Camera2StreamConfigurationMap.previewHandwritingGesture(p0, p1);
        }
        return false;
    }
}
