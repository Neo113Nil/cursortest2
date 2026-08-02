package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeTourScrollController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.HomeTourScrollController", f = "HomeTourScrollController.kt", i = {1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5}, l = {85, 87, 88, 92, 93, 94, 96, 97}, m = "scrollToLazyKey", n = {"uiState", "align", "lazyKeyForInset", "resolvedKey", "animate", "align", "lazyKeyForInset", "resolvedKey", "animate", "align", "insetKey", "index", "align", "insetKey", "index", "align", "insetKey", "index"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes4.dex */
final class HomeTourScrollController$scrollToLazyKey$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeTourScrollController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeTourScrollController$scrollToLazyKey$1(HomeTourScrollController homeTourScrollController, Continuation<? super HomeTourScrollController$scrollToLazyKey$1> continuation) {
        super(continuation);
        this.this$0 = homeTourScrollController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.scrollToLazyKey(null, null, null, false, null, this);
    }
}
