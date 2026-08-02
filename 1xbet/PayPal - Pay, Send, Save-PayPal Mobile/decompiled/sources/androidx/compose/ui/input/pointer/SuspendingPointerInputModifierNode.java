package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004RC\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t8'@'X§\u000e¢\u0006\u0012\u0012\u0004\b\u000e\u0010\u0004\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0001\u0001\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "", "resetPointerInputHandler", "()V", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "getPointerInputHandler", "()Lkotlin/jvm/functions/Function2;", "setPointerInputHandler", "(Lkotlin/jvm/functions/Function2;)V", "getPointerInputHandler$annotations", "pointerInputHandler", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getPointerInputEventHandler", "()Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "setPointerInputEventHandler", "(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "pointerInputEventHandler", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SuspendingPointerInputModifierNode extends androidx.compose.ui.node.PointerInputModifierNode {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This property is deprecated. Use 'pointerInputEventHandler' instead.", replaceWith = @kotlin.ReplaceWith(expression = "pointerInputEventHandler", imports = {"androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode.pointerInputEventHandler"}))
    static /* synthetic */ void getPointerInputHandler$annotations() {
    }

    kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getPointerInputHandler();

    void resetPointerInputHandler();

    void setPointerInputHandler(kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2);

    default androidx.compose.ui.input.pointer.PointerInputEventHandler getPointerInputEventHandler() {
        throw new kotlin.NotImplementedError("An operation is not implemented: pointerInputEventHandler must be implemented (get()).");
    }

    default void setPointerInputEventHandler(androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("pointerInputEventHandler must be implemented (set(");
        sb.append(pointerInputEventHandler);
        sb.append(")).");
        throw new kotlin.NotImplementedError("An operation is not implemented: ".concat(java.lang.String.valueOf(sb.toString())));
    }
}
