package androidx.compose.foundation.relocation;

/* compiled from: BringIntoViewRequester.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0002\u0010\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "()V", "modifiers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "getModifiers", "()Landroidx/compose/runtime/collection/MutableVector;", "bringIntoView", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BringIntoViewRequesterImpl implements androidx.compose.foundation.relocation.BringIntoViewRequester {
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.relocation.BringIntoViewRequesterNode> modifiers = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.foundation.relocation.BringIntoViewRequesterNode[16], 0);

    public final androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.relocation.BringIntoViewRequesterNode> getModifiers() {
        return this.modifiers;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        if (r7 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0064 -> B:10:0x0067). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object bringIntoView(androidx.compose.ui.geometry.Rect rect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 bringIntoViewRequesterImpl$bringIntoView$1;
        int i;
        int size;
        java.lang.Object[] content;
        androidx.compose.ui.geometry.Rect rect2;
        int i2;
        if (continuation instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) {
            bringIntoViewRequesterImpl$bringIntoView$1 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) continuation;
            if ((bringIntoViewRequesterImpl$bringIntoView$1.label & Integer.MIN_VALUE) != 0) {
                bringIntoViewRequesterImpl$bringIntoView$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = bringIntoViewRequesterImpl$bringIntoView$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bringIntoViewRequesterImpl$bringIntoView$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.relocation.BringIntoViewRequesterNode> mutableVector = this.modifiers;
                    size = mutableVector.getSize();
                    if (size > 0) {
                        content = mutableVector.getContent();
                        rect2 = rect;
                        i2 = 0;
                        androidx.compose.foundation.relocation.BringIntoViewRequesterNode bringIntoViewRequesterNode = (androidx.compose.foundation.relocation.BringIntoViewRequesterNode) content[i2];
                        bringIntoViewRequesterImpl$bringIntoView$1.L$0 = rect2;
                        bringIntoViewRequesterImpl$bringIntoView$1.L$1 = content;
                        bringIntoViewRequesterImpl$bringIntoView$1.I$0 = size;
                        bringIntoViewRequesterImpl$bringIntoView$1.I$1 = i2;
                        bringIntoViewRequesterImpl$bringIntoView$1.label = 1;
                        if (bringIntoViewRequesterNode.bringIntoView(rect2, bringIntoViewRequesterImpl$bringIntoView$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2++;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = bringIntoViewRequesterImpl$bringIntoView$1.I$1;
                size = bringIntoViewRequesterImpl$bringIntoView$1.I$0;
                content = (java.lang.Object[]) bringIntoViewRequesterImpl$bringIntoView$1.L$1;
                androidx.compose.ui.geometry.Rect rect3 = (androidx.compose.ui.geometry.Rect) bringIntoViewRequesterImpl$bringIntoView$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                rect2 = rect3;
                i2++;
            }
        }
        bringIntoViewRequesterImpl$bringIntoView$1 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1(this, continuation);
        java.lang.Object obj2 = bringIntoViewRequesterImpl$bringIntoView$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bringIntoViewRequesterImpl$bringIntoView$1.label;
        if (i != 0) {
        }
    }
}
