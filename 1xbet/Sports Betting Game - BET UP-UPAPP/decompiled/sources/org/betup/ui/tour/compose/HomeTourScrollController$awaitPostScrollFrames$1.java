package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeTourScrollController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.HomeTourScrollController", f = "HomeTourScrollController.kt", i = {}, l = {523}, m = "awaitPostScrollFrames", n = {}, s = {})
/* loaded from: classes4.dex */
final class HomeTourScrollController$awaitPostScrollFrames$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeTourScrollController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeTourScrollController$awaitPostScrollFrames$1(HomeTourScrollController homeTourScrollController, Continuation<? super HomeTourScrollController$awaitPostScrollFrames$1> continuation) {
        super(continuation);
        this.this$0 = homeTourScrollController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitPostScrollFrames;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitPostScrollFrames = this.this$0.awaitPostScrollFrames(this);
        return awaitPostScrollFrames;
    }
}
