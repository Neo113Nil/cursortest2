package androidx.compose.ui.input.pointer;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0 implements androidx.compose.ui.input.pointer.PointerInputEventHandler, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function2<P1, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation continuation) {
        return this.getHighSpeedVideoFpsRanges.invoke(pointerInputScope, continuation);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.compose.ui.input.pointer.PointerInputEventHandler) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(kotlin.jvm.functions.Function2<? super P1, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        this.getHighSpeedVideoFpsRanges = function2;
    }
}
