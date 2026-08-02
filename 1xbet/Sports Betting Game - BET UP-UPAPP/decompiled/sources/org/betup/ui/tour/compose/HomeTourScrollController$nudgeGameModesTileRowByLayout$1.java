package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeTourScrollController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.HomeTourScrollController", f = "HomeTourScrollController.kt", i = {0, 0, 1, 1}, l = {487, 488}, m = "nudgeGameModesTileRowByLayout", n = {"gameModesIndex", "minimalBottomClearance", "gameModesIndex", "minimalBottomClearance"}, s = {"I$0", "Z$0", "I$0", "Z$0"})
/* loaded from: classes4.dex */
final class HomeTourScrollController$nudgeGameModesTileRowByLayout$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeTourScrollController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeTourScrollController$nudgeGameModesTileRowByLayout$1(HomeTourScrollController homeTourScrollController, Continuation<? super HomeTourScrollController$nudgeGameModesTileRowByLayout$1> continuation) {
        super(continuation);
        this.this$0 = homeTourScrollController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object nudgeGameModesTileRowByLayout;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        nudgeGameModesTileRowByLayout = this.this$0.nudgeGameModesTileRowByLayout(0, false, this);
        return nudgeGameModesTileRowByLayout;
    }
}
