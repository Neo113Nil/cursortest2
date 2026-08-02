package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeTourScrollController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.HomeTourScrollController", f = "HomeTourScrollController.kt", i = {0, 2, 3, 4, 5, 6, 7}, l = {107, 108, 112, 113, 114, 153, 154, 155, 157, 158}, m = "scrollGameModesForTour", n = {"uiState", "gameModesIndex", "gameModesIndex", "gameModesIndex", "gameModesIndex", "gameModesIndex", "gameModesIndex"}, s = {"L$0", "I$0", "I$0", "I$0", "I$0", "I$0", "I$0"})
/* loaded from: classes4.dex */
final class HomeTourScrollController$scrollGameModesForTour$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeTourScrollController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeTourScrollController$scrollGameModesForTour$1(HomeTourScrollController homeTourScrollController, Continuation<? super HomeTourScrollController$scrollGameModesForTour$1> continuation) {
        super(continuation);
        this.this$0 = homeTourScrollController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object scrollGameModesForTour;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        scrollGameModesForTour = this.this$0.scrollGameModesForTour(null, this);
        return scrollGameModesForTour;
    }
}
