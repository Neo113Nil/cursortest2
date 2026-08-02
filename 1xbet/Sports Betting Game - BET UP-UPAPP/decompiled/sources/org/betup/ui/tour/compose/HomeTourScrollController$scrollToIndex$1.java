package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeTourScrollController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.HomeTourScrollController", f = "HomeTourScrollController.kt", i = {1, 1, 1, 2, 2, 2, 4, 4, 4, 4, 5, 5, 5, 5}, l = {329, 333, 334, 336, 339, 340, 343, 346}, m = "scrollToIndex", n = {"align", "lazyKey", "index", "align", "lazyKey", "index", "align", "lazyKey", "index", "scrollOffset", "align", "lazyKey", "index", "scrollOffset"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes4.dex */
final class HomeTourScrollController$scrollToIndex$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeTourScrollController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeTourScrollController$scrollToIndex$1(HomeTourScrollController homeTourScrollController, Continuation<? super HomeTourScrollController$scrollToIndex$1> continuation) {
        super(continuation);
        this.this$0 = homeTourScrollController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object scrollToIndex;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        scrollToIndex = this.this$0.scrollToIndex(0, null, false, null, this);
        return scrollToIndex;
    }
}
