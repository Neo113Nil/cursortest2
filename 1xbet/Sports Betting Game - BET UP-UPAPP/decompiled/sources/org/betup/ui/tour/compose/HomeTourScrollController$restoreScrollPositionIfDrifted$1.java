package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeTourScrollController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.HomeTourScrollController", f = "HomeTourScrollController.kt", i = {0}, l = {300, 301, 302}, m = "restoreScrollPositionIfDrifted", n = {"expectedIndex"}, s = {"I$0"})
/* loaded from: classes4.dex */
final class HomeTourScrollController$restoreScrollPositionIfDrifted$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeTourScrollController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeTourScrollController$restoreScrollPositionIfDrifted$1(HomeTourScrollController homeTourScrollController, Continuation<? super HomeTourScrollController$restoreScrollPositionIfDrifted$1> continuation) {
        super(continuation);
        this.this$0 = homeTourScrollController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.restoreScrollPositionIfDrifted(0, 0, this);
    }
}
