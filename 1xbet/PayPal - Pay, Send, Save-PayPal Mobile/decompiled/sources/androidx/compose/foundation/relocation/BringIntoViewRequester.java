package androidx.compose.foundation.relocation;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "bringIntoView", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BringIntoViewRequester {
    java.lang.Object bringIntoView(androidx.compose.ui.geometry.Rect rect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    static /* synthetic */ java.lang.Object bringIntoView$default(androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester, androidx.compose.ui.geometry.Rect rect, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i & 1) != 0) {
            rect = null;
        }
        return bringIntoViewRequester.bringIntoView(rect, continuation);
    }
}
