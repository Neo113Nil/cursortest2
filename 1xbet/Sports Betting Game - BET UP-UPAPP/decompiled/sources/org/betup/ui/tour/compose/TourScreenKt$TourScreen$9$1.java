package org.betup.ui.tour.compose;

import android.graphics.Rect;
import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TourScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.TourScreenKt$TourScreen$9$1", f = "TourScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class TourScreenKt$TourScreen$9$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TourStep $currentStep;
    final /* synthetic */ boolean $isOverlayVisible;
    final /* synthetic */ TourManager $tourManager;
    final /* synthetic */ TourState $tourState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TourScreenKt$TourScreen$9$1(boolean z, TourStep tourStep, TourManager tourManager, TourState tourState, Continuation<? super TourScreenKt$TourScreen$9$1> continuation) {
        super(2, continuation);
        this.$isOverlayVisible = z;
        this.$currentStep = tourStep;
        this.$tourManager = tourManager;
        this.$tourState = tourState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TourScreenKt$TourScreen$9$1(this.$isOverlayVisible, this.$currentStep, this.$tourManager, this.$tourState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TourScreenKt$TourScreen$9$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isOverlayVisible && this.$currentStep == TourStep.SELECT_BET) {
            Function0<Rect> getBetSectionBounds = this.$tourManager.getGetBetSectionBounds();
            Rect invoke = getBetSectionBounds != null ? getBetSectionBounds.invoke() : null;
            this.$tourState.setBetSectionBounds(invoke);
            Log.d("TourFlow", "TourScreen - Bet section bounds: " + invoke);
        }
        return Unit.INSTANCE;
    }
}
