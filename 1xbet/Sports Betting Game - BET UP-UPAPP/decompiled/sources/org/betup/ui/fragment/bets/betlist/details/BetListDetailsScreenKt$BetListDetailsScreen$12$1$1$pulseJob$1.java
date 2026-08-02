package org.betup.ui.fragment.bets.betlist.details;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import com.explorestack.protobuf.openrtb.LossReason;
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
import kotlinx.coroutines.DelayKt;

/* compiled from: BetListDetailsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$12$1$1$pulseJob$1", f = "BetListDetailsScreen.kt", i = {}, l = {202, 203, 207, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 215, 219}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class BetListDetailsScreenKt$BetListDetailsScreen$12$1$1$pulseJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CubicBezierEasing $balloonEase;
    final /* synthetic */ int $entranceMs;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $singleBetBalloonPulse;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BetListDetailsScreenKt$BetListDetailsScreen$12$1$1$pulseJob$1(int i, Animatable<Float, AnimationVector1D> animatable, CubicBezierEasing cubicBezierEasing, Continuation<? super BetListDetailsScreenKt$BetListDetailsScreen$12$1$1$pulseJob$1> continuation) {
        super(2, continuation);
        this.$entranceMs = i;
        this.$singleBetBalloonPulse = animatable;
        this.$balloonEase = cubicBezierEasing;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetListDetailsScreenKt$BetListDetailsScreen$12$1$1$pulseJob$1(this.$entranceMs, this.$singleBetBalloonPulse, this.$balloonEase, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetListDetailsScreenKt$BetListDetailsScreen$12$1$1$pulseJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay((long) (this.$entranceMs * 0.55f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.label = 2;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.034f), AnimationSpecKt.tween$default(200, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.label = 3;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(0.992f), AnimationSpecKt.tween$default(190, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.label = 4;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(180, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.label = 5;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0028f), AnimationSpecKt.tween$default(95, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.label = 6;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(130, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                this.label = 2;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.034f), AnimationSpecKt.tween$default(200, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 3;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(0.992f), AnimationSpecKt.tween$default(190, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 4;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(180, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 5;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0028f), AnimationSpecKt.tween$default(95, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 6;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(130, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                this.label = 3;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(0.992f), AnimationSpecKt.tween$default(190, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 4;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(180, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 5;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0028f), AnimationSpecKt.tween$default(95, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 6;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(130, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                this.label = 4;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(180, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 5;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0028f), AnimationSpecKt.tween$default(95, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 6;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(130, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                this.label = 5;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0028f), AnimationSpecKt.tween$default(95, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 6;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(130, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                this.label = 6;
                if (Animatable.animateTo$default(this.$singleBetBalloonPulse, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(130, 0, this.$balloonEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
