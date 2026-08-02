package org.betup.ui.common.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableIntState;
import com.google.logging.type.LogSeverity;
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

/* compiled from: FavoriteStarButton.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.common.compose.FavoriteStarButtonKt$FavoriteStarButton$2$1", f = "FavoriteStarButton.kt", i = {}, l = {80, 81}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class FavoriteStarButtonKt$FavoriteStarButton$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $pulseAlpha;
    final /* synthetic */ MutableIntState $pulseKey$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteStarButtonKt$FavoriteStarButton$2$1(Animatable<Float, AnimationVector1D> animatable, MutableIntState mutableIntState, Continuation<? super FavoriteStarButtonKt$FavoriteStarButton$2$1> continuation) {
        super(2, continuation);
        this.$pulseAlpha = animatable;
        this.$pulseKey$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavoriteStarButtonKt$FavoriteStarButton$2$1(this.$pulseAlpha, this.$pulseKey$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FavoriteStarButtonKt$FavoriteStarButton$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int FavoriteStarButton_Fbr4GWI$lambda$2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FavoriteStarButton_Fbr4GWI$lambda$2 = FavoriteStarButtonKt.FavoriteStarButton_Fbr4GWI$lambda$2(this.$pulseKey$delegate);
            if (FavoriteStarButton_Fbr4GWI$lambda$2 > 0) {
                this.label = 1;
                if (this.$pulseAlpha.snapTo(Boxing.boxFloat(0.45f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.label = 2;
                if (Animatable.animateTo$default(this.$pulseAlpha, Boxing.boxFloat(0.0f), AnimationSpecKt.tween$default(LogSeverity.WARNING_VALUE, 0, null, 6, null), null, null, this, 12, null) == coroutine_suspended) {
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            this.label = 2;
            if (Animatable.animateTo$default(this.$pulseAlpha, Boxing.boxFloat(0.0f), AnimationSpecKt.tween$default(LogSeverity.WARNING_VALUE, 0, null, 6, null), null, null, this, 12, null) == coroutine_suspended) {
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
