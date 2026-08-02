package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeTourScrollController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.HomeTourScrollController", f = "HomeTourScrollController.kt", i = {1, 1, 2, 2}, l = {430, 440, 441, 447}, m = "correctScrollIfBottomClipped", n = {"index", "minBottomInsetPx", "index", "minBottomInsetPx"}, s = {"I$0", "I$1", "I$0", "I$1"})
/* loaded from: classes4.dex */
final class HomeTourScrollController$correctScrollIfBottomClipped$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeTourScrollController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeTourScrollController$correctScrollIfBottomClipped$1(HomeTourScrollController homeTourScrollController, Continuation<? super HomeTourScrollController$correctScrollIfBottomClipped$1> continuation) {
        super(continuation);
        this.this$0 = homeTourScrollController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object correctScrollIfBottomClipped;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        correctScrollIfBottomClipped = this.this$0.correctScrollIfBottomClipped(0, null, this);
        return correctScrollIfBottomClipped;
    }
}
