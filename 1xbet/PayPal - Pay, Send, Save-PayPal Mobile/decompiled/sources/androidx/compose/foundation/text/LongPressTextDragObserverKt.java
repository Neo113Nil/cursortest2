package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\b\u0010\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/foundation/text/TextDragObserver;", "observer", "", "detectDownAndDragGesturesWithObserver", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LongPressTextDragObserverKt {
    public static final java.lang.Object detectDownAndDragGesturesWithObserver(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.text.TextDragObserver textDragObserver, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(pointerInputScope, textDragObserver, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.text.TextDragObserver textDragObserver, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(textDragObserver, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, final androidx.compose.foundation.text.TextDragObserver textDragObserver, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object detectDragGestures = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(pointerInputScope, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.LongPressTextDragObserverKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.TextDragObserver.this, (androidx.compose.ui.geometry.Offset) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.LongPressTextDragObserverKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.TextDragObserver.this);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.text.LongPressTextDragObserverKt.getHighSpeedVideoSizes(androidx.compose.foundation.text.TextDragObserver.this);
                return highSpeedVideoSizes;
            }
        }, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.text.LongPressTextDragObserverKt.getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.TextDragObserver.this, (androidx.compose.ui.geometry.Offset) obj2);
                return highSpeedVideoFpsRanges;
            }
        }, continuation);
        return detectDragGestures == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectDragGestures : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.TextDragObserver textDragObserver) {
        textDragObserver.onStop();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.TextDragObserver textDragObserver, androidx.compose.ui.geometry.Offset offset) {
        textDragObserver.mo2104onDragk4lQ0M(offset.m5762unboximpl());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.TextDragObserver textDragObserver, androidx.compose.ui.geometry.Offset offset) {
        textDragObserver.mo2105onStart3MmeM6k(offset.m5762unboximpl(), androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.text.TextDragObserver textDragObserver) {
        textDragObserver.onCancel();
        return kotlin.Unit.INSTANCE;
    }
}
