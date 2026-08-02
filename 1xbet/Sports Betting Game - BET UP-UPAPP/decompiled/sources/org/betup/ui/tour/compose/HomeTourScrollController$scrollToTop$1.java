package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.betup.ui.MainActivity;

/* compiled from: HomeTourScrollController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.HomeTourScrollController", f = "HomeTourScrollController.kt", i = {0}, l = {231, MainActivity.CHALLENGE_TOUR, 236, 238, 239}, m = "scrollToTop", n = {"animate"}, s = {"Z$0"})
/* loaded from: classes4.dex */
final class HomeTourScrollController$scrollToTop$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeTourScrollController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeTourScrollController$scrollToTop$1(HomeTourScrollController homeTourScrollController, Continuation<? super HomeTourScrollController$scrollToTop$1> continuation) {
        super(continuation);
        this.this$0 = homeTourScrollController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.scrollToTop(false, this);
    }
}
