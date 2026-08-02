package org.betup.ui.tour.compose;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeTourScrollController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.HomeTourScrollController", f = "HomeTourScrollController.kt", i = {0, 0}, l = {310, 313, 315, TypedValues.AttributesType.TYPE_EASING}, m = "scrollToOffset", n = {"pixels", "animate"}, s = {"F$0", "Z$0"})
/* loaded from: classes4.dex */
final class HomeTourScrollController$scrollToOffset$1 extends ContinuationImpl {
    float F$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeTourScrollController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeTourScrollController$scrollToOffset$1(HomeTourScrollController homeTourScrollController, Continuation<? super HomeTourScrollController$scrollToOffset$1> continuation) {
        super(continuation);
        this.this$0 = homeTourScrollController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.scrollToOffset(0.0f, false, this);
    }
}
