package org.betup.ui.tour.compose;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: TourOverlay.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.TourOverlayKt$TourWelcomeScreen$1$1", f = "TourOverlay.kt", i = {}, l = {1007}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class TourOverlayKt$TourWelcomeScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $bubbleVisible$delegate;
    final /* synthetic */ MutableState<Boolean> $characterVisible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TourOverlayKt$TourWelcomeScreen$1$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super TourOverlayKt$TourWelcomeScreen$1$1> continuation) {
        super(2, continuation);
        this.$characterVisible$delegate = mutableState;
        this.$bubbleVisible$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TourOverlayKt$TourWelcomeScreen$1$1(this.$characterVisible$delegate, this.$bubbleVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TourOverlayKt$TourWelcomeScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TourOverlayKt.TourWelcomeScreen$lambda$80(this.$characterVisible$delegate, true);
            this.label = 1;
            if (DelayKt.delay(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        TourOverlayKt.TourWelcomeScreen$lambda$83(this.$bubbleVisible$delegate, true);
        return Unit.INSTANCE;
    }
}
