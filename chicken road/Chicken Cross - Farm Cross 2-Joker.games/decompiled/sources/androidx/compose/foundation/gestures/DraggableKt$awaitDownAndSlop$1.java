package androidx.compose.foundation.gestures;

import com.ironsource.U3;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Draggable.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 3}, l = {Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 324, 333, 335}, m = "awaitDownAndSlop", n = {"$this$awaitDownAndSlop", "canDrag", "startDragImmediately", "velocityTracker", U3.i.n, "$this$awaitDownAndSlop", "velocityTracker", U3.i.n, "initialDelta", "initialDelta"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$0"})
/* loaded from: classes.dex */
final class DraggableKt$awaitDownAndSlop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    DraggableKt$awaitDownAndSlop$1(Continuation<? super DraggableKt$awaitDownAndSlop$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitDownAndSlop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitDownAndSlop = DraggableKt.awaitDownAndSlop(null, null, null, null, null, this);
        return awaitDownAndSlop;
    }
}
