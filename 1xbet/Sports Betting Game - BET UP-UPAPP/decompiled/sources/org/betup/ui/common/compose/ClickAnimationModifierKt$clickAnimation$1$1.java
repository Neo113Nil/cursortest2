package org.betup.ui.common.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableIntState;
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

/* compiled from: ClickAnimationModifier.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.common.compose.ClickAnimationModifierKt$clickAnimation$1$1", f = "ClickAnimationModifier.kt", i = {}, l = {75, 76, 80, 84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ClickAnimationModifierKt$clickAnimation$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $bounceScale;
    final /* synthetic */ MutableIntState $clickAnimationKey$delegate;
    final /* synthetic */ int $downMs;
    final /* synthetic */ boolean $hasOvershoot;
    final /* synthetic */ int $overshootMs;
    final /* synthetic */ float $overshootScale;
    final /* synthetic */ float $scaleFactor;
    final /* synthetic */ int $settleMs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickAnimationModifierKt$clickAnimation$1$1(boolean z, Animatable<Float, AnimationVector1D> animatable, float f, int i, float f2, int i2, int i3, MutableIntState mutableIntState, Continuation<? super ClickAnimationModifierKt$clickAnimation$1$1> continuation) {
        super(2, continuation);
        this.$hasOvershoot = z;
        this.$bounceScale = animatable;
        this.$scaleFactor = f;
        this.$downMs = i;
        this.$overshootScale = f2;
        this.$overshootMs = i2;
        this.$settleMs = i3;
        this.$clickAnimationKey$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClickAnimationModifierKt$clickAnimation$1$1(this.$hasOvershoot, this.$bounceScale, this.$scaleFactor, this.$downMs, this.$overshootScale, this.$overshootMs, this.$settleMs, this.$clickAnimationKey$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClickAnimationModifierKt$clickAnimation$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int clickAnimation$lambda$2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            clickAnimation$lambda$2 = ClickAnimationModifierKt.clickAnimation$lambda$2(this.$clickAnimationKey$delegate);
            if (clickAnimation$lambda$2 > 0 && this.$hasOvershoot) {
                this.label = 1;
                if (this.$bounceScale.snapTo(Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.label = 2;
                if (Animatable.animateTo$default(this.$bounceScale, Boxing.boxFloat(this.$scaleFactor), AnimationSpecKt.tween$default(this.$downMs, 0, null, 6, null), null, null, this, 12, null) == coroutine_suspended) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            this.label = 2;
            if (Animatable.animateTo$default(this.$bounceScale, Boxing.boxFloat(this.$scaleFactor), AnimationSpecKt.tween$default(this.$downMs, 0, null, 6, null), null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                this.label = 4;
                if (Animatable.animateTo$default(this.$bounceScale, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(this.$settleMs, 0, null, 6, null), null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.label = 3;
        if (Animatable.animateTo$default(this.$bounceScale, Boxing.boxFloat(this.$overshootScale), AnimationSpecKt.tween$default(this.$overshootMs, 0, null, 6, null), null, null, this, 12, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.label = 4;
        if (Animatable.animateTo$default(this.$bounceScale, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(this.$settleMs, 0, null, 6, null), null, null, this, 12, null) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
