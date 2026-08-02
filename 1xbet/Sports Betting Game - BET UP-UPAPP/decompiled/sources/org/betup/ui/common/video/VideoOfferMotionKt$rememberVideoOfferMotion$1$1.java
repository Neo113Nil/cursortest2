package org.betup.ui.common.video;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.MutableState;
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

/* compiled from: VideoOfferMotion.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.common.video.VideoOfferMotionKt$rememberVideoOfferMotion$1$1", f = "VideoOfferMotion.kt", i = {}, l = {45, 46, 47, 49}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class VideoOfferMotionKt$rememberVideoOfferMotion$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ VideoOfferAvailabilityPhase $phase;
    final /* synthetic */ MutableState<VideoOfferAvailabilityPhase> $previousPhase$delegate;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $readyScale;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoOfferMotionKt$rememberVideoOfferMotion$1$1(VideoOfferAvailabilityPhase videoOfferAvailabilityPhase, Animatable<Float, AnimationVector1D> animatable, MutableState<VideoOfferAvailabilityPhase> mutableState, Continuation<? super VideoOfferMotionKt$rememberVideoOfferMotion$1$1> continuation) {
        super(2, continuation);
        this.$phase = videoOfferAvailabilityPhase;
        this.$readyScale = animatable;
        this.$previousPhase$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoOfferMotionKt$rememberVideoOfferMotion$1$1(this.$phase, this.$readyScale, this.$previousPhase$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VideoOfferMotionKt$rememberVideoOfferMotion$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        VideoOfferAvailabilityPhase rememberVideoOfferMotion$lambda$3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            rememberVideoOfferMotion$lambda$3 = VideoOfferMotionKt.rememberVideoOfferMotion$lambda$3(this.$previousPhase$delegate);
            boolean z = rememberVideoOfferMotion$lambda$3 == VideoOfferAvailabilityPhase.CHECKING && this.$phase == VideoOfferAvailabilityPhase.READY;
            this.$previousPhase$delegate.setValue(this.$phase);
            if (z) {
                this.label = 1;
                if (this.$readyScale.snapTo(Boxing.boxFloat(0.98f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.label = 2;
                if (Animatable.animateTo$default(this.$readyScale, Boxing.boxFloat(1.025f), AnimationSpecKt.tween$default(150, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
            } else {
                if (this.$phase != VideoOfferAvailabilityPhase.READY) {
                    this.label = 4;
                    if (this.$readyScale.snapTo(Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            this.label = 2;
            if (Animatable.animateTo$default(this.$readyScale, Boxing.boxFloat(1.025f), AnimationSpecKt.tween$default(150, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.label = 3;
        if (Animatable.animateTo$default(this.$readyScale, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(180, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
