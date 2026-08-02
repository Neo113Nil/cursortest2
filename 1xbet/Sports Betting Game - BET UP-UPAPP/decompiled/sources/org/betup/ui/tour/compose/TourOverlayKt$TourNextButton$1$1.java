package org.betup.ui.tour.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.KeyframesSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TourOverlay.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.TourOverlayKt$TourNextButton$1$1", f = "TourOverlay.kt", i = {}, l = {1225, 1226}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class TourOverlayKt$TourNextButton$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $shakeOffset;
    final /* synthetic */ int $shakeTrigger;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TourOverlayKt$TourNextButton$1$1(int i, Animatable<Float, AnimationVector1D> animatable, Continuation<? super TourOverlayKt$TourNextButton$1$1> continuation) {
        super(2, continuation);
        this.$shakeTrigger = i;
        this.$shakeOffset = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TourOverlayKt$TourNextButton$1$1(this.$shakeTrigger, this.$shakeOffset, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TourOverlayKt$TourNextButton$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Animatable<Float, AnimationVector1D> animatable;
        Float boxFloat;
        KeyframesSpec keyframesSpec;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$shakeTrigger > 0) {
                this.label = 1;
                if (this.$shakeOffset.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                animatable = this.$shakeOffset;
                boxFloat = Boxing.boxFloat(0.0f);
                keyframesSpec = TourOverlayKt.shakeAnimationSpec;
                this.label = 2;
                if (Animatable.animateTo$default(animatable, boxFloat, keyframesSpec, null, null, this, 12, null) == coroutine_suspended) {
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            animatable = this.$shakeOffset;
            boxFloat = Boxing.boxFloat(0.0f);
            keyframesSpec = TourOverlayKt.shakeAnimationSpec;
            this.label = 2;
            if (Animatable.animateTo$default(animatable, boxFloat, keyframesSpec, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
