package org.betup.ui.common.video;

import androidx.compose.runtime.MutableIntState;
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

/* compiled from: VideoOfferMotion.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.common.video.VideoOfferMotionKt$rememberVideoOfferMotion$2$1", f = "VideoOfferMotion.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class VideoOfferMotionKt$rememberVideoOfferMotion$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $dots$delegate;
    final /* synthetic */ boolean $isChecking;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoOfferMotionKt$rememberVideoOfferMotion$2$1(boolean z, MutableIntState mutableIntState, Continuation<? super VideoOfferMotionKt$rememberVideoOfferMotion$2$1> continuation) {
        super(2, continuation);
        this.$isChecking = z;
        this.$dots$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoOfferMotionKt$rememberVideoOfferMotion$2$1(this.$isChecking, this.$dots$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VideoOfferMotionKt$rememberVideoOfferMotion$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002e -> B:5:0x0031). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int rememberVideoOfferMotion$lambda$7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$dots$delegate.setIntValue(1);
            if (this.$isChecking) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableIntState mutableIntState = this.$dots$delegate;
            rememberVideoOfferMotion$lambda$7 = VideoOfferMotionKt.rememberVideoOfferMotion$lambda$7(mutableIntState);
            mutableIntState.setIntValue((rememberVideoOfferMotion$lambda$7 % 3) + 1);
            if (this.$isChecking) {
                this.label = 1;
                if (DelayKt.delay(420L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                MutableIntState mutableIntState2 = this.$dots$delegate;
                rememberVideoOfferMotion$lambda$7 = VideoOfferMotionKt.rememberVideoOfferMotion$lambda$7(mutableIntState2);
                mutableIntState2.setIntValue((rememberVideoOfferMotion$lambda$7 % 3) + 1);
                if (this.$isChecking) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
