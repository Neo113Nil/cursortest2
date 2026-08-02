package androidx.compose.ui.graphics.vector;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0011@\u0011X\u0090\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0010\u0011\u0012"}, d2 = {"Landroidx/compose/ui/graphics/vector/VNode;", "", "<init>", "()V", "", "invalidate", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Lkotlin/Function1;", "invalidateListener", "Lkotlin/jvm/functions/Function1;", "getInvalidateListener$ui", "()Lkotlin/jvm/functions/Function1;", "setInvalidateListener$ui", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VectorComponent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class VNode {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.vector.VNode, kotlin.Unit> invalidateListener;

    public abstract void draw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope);

    private VNode() {
    }

    public kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.vector.VNode, kotlin.Unit> getInvalidateListener$ui() {
        return this.invalidateListener;
    }

    public void setInvalidateListener$ui(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.vector.VNode, kotlin.Unit> function1) {
        this.invalidateListener = function1;
    }

    public final void invalidate() {
        kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.vector.VNode, kotlin.Unit> invalidateListener$ui = getInvalidateListener$ui();
        if (invalidateListener$ui != null) {
            invalidateListener$ui.invoke(this);
        }
    }

    public /* synthetic */ VNode(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
