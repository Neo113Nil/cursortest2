package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\"\b\u0000\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bR3\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/draw/DrawResult;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "getBlock$ui", "()Lkotlin/jvm/functions/Function1;", "setBlock$ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawResult {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit> block;

    public DrawResult(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit> function1) {
        this.block = function1;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit> getBlock$ui() {
        return this.block;
    }

    public final void setBlock$ui(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit> function1) {
        this.block = function1;
    }
}
