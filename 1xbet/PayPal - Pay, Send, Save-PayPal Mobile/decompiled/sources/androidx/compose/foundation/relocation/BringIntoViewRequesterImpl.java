package androidx.compose.foundation.relocation;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "<init>", "()V", "Landroidx/compose/ui/geometry/Rect;", "p0", "", "bringIntoView", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/collection/MutableVector;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/runtime/collection/MutableVector;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BringIntoViewRequesterImpl implements androidx.compose.foundation.relocation.BringIntoViewRequester {
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.relocation.BringIntoViewRequesterNode> getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.foundation.relocation.BringIntoViewRequesterNode[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRangesFor(androidx.compose.ui.geometry.Rect rect) {
        return rect;
    }

    public final androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.relocation.BringIntoViewRequesterNode> getHighSpeedVideoFpsRangesFor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006c -> B:10:0x006f). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object bringIntoView(androidx.compose.ui.geometry.Rect rect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 bringIntoViewRequesterImpl$bringIntoView$1;
        int i;
        final androidx.compose.ui.geometry.Rect rect2;
        int i2;
        java.lang.Object[] objArr;
        int i3;
        if (continuation instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) {
            bringIntoViewRequesterImpl$bringIntoView$1 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) continuation;
            if ((bringIntoViewRequesterImpl$bringIntoView$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                bringIntoViewRequesterImpl$bringIntoView$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = bringIntoViewRequesterImpl$bringIntoView$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bringIntoViewRequesterImpl$bringIntoView$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.relocation.BringIntoViewRequesterNode> mutableVector = this.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.compose.foundation.relocation.BringIntoViewRequesterNode[] bringIntoViewRequesterNodeArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    rect2 = rect;
                    i2 = size;
                    objArr = bringIntoViewRequesterNodeArr;
                    i3 = 0;
                    if (i3 < i2) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = bringIntoViewRequesterImpl$bringIntoView$1.Camera2StreamConfigurationMap;
                    i3 = bringIntoViewRequesterImpl$bringIntoView$1.getHighSpeedVideoFpsRangesFor;
                    objArr = (java.lang.Object[]) bringIntoViewRequesterImpl$bringIntoView$1.getHighSpeedVideoSizes;
                    androidx.compose.ui.geometry.Rect rect3 = (androidx.compose.ui.geometry.Rect) bringIntoViewRequesterImpl$bringIntoView$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    rect2 = rect3;
                    i3++;
                    if (i3 < i2) {
                        androidx.compose.foundation.relocation.BringIntoViewRequesterNode bringIntoViewRequesterNode = (androidx.compose.foundation.relocation.BringIntoViewRequesterNode) objArr[i3];
                        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                androidx.compose.ui.geometry.Rect highSpeedVideoFpsRangesFor;
                                highSpeedVideoFpsRangesFor = androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.geometry.Rect.this);
                                return highSpeedVideoFpsRangesFor;
                            }
                        };
                        bringIntoViewRequesterImpl$bringIntoView$1.getHighResolutionOutputSizeshNQ4ISI = rect2;
                        bringIntoViewRequesterImpl$bringIntoView$1.getHighSpeedVideoSizes = objArr;
                        bringIntoViewRequesterImpl$bringIntoView$1.getHighSpeedVideoFpsRangesFor = i3;
                        bringIntoViewRequesterImpl$bringIntoView$1.Camera2StreamConfigurationMap = i2;
                        bringIntoViewRequesterImpl$bringIntoView$1.getHighSpeedVideoFpsRanges = 1;
                        if (androidx.compose.ui.relocation.BringIntoViewModifierNodeKt.bringIntoView(bringIntoViewRequesterNode, function0, bringIntoViewRequesterImpl$bringIntoView$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i3++;
                        if (i3 < i2) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        bringIntoViewRequesterImpl$bringIntoView$1 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1(this, continuation);
        java.lang.Object obj2 = bringIntoViewRequesterImpl$bringIntoView$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bringIntoViewRequesterImpl$bringIntoView$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }
}
