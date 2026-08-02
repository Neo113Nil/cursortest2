package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1", f = "AndroidDragAndDropSource.android.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class DragAndDropSourceDefaults$DefaultStartDetector$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope dragAndDropStartDetectorScope = (androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope) this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(dragAndDropStartDetectorScope, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope.this, (androidx.compose.ui.geometry.Offset) obj2);
                }
            }, null, null, this, 13, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope dragAndDropStartDetectorScope, androidx.compose.ui.geometry.Offset offset) {
        dragAndDropStartDetectorScope.mo1410requestDragAndDropTransferk4lQ0M(offset.m5762unboximpl());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope dragAndDropStartDetectorScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1) create(dragAndDropStartDetectorScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1 dragAndDropSourceDefaults$DefaultStartDetector$1 = new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1(continuation);
        dragAndDropSourceDefaults$DefaultStartDetector$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return dragAndDropSourceDefaults$DefaultStartDetector$1;
    }

    DragAndDropSourceDefaults$DefaultStartDetector$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1> continuation) {
        super(2, continuation);
    }
}
