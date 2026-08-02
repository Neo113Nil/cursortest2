package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeTourScrollController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.HomeTourScrollController", f = "HomeTourScrollController.kt", i = {0, 0, 0}, l = {252}, m = "awaitScrollPositionSettled", n = {"stableFrames", "lastIndex", "lastOffset"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
final class HomeTourScrollController$awaitScrollPositionSettled$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeTourScrollController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeTourScrollController$awaitScrollPositionSettled$1(HomeTourScrollController homeTourScrollController, Continuation<? super HomeTourScrollController$awaitScrollPositionSettled$1> continuation) {
        super(continuation);
        this.this$0 = homeTourScrollController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitScrollPositionSettled(this);
    }
}
