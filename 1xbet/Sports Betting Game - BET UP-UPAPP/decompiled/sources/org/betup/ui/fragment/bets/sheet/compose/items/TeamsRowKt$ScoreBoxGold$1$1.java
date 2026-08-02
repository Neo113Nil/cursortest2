package org.betup.ui.fragment.bets.sheet.compose.items;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
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
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: TeamsRow.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt$ScoreBoxGold$1$1", f = "TeamsRow.kt", i = {}, l = {389, 393, 394}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class TeamsRowKt$ScoreBoxGold$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $highlightAnimationKey;
    final /* synthetic */ boolean $highlighted;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $scale;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TeamsRowKt$ScoreBoxGold$1$1(boolean z, int i, Animatable<Float, AnimationVector1D> animatable, Continuation<? super TeamsRowKt$ScoreBoxGold$1$1> continuation) {
        super(2, continuation);
        this.$highlighted = z;
        this.$highlightAnimationKey = i;
        this.$scale = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TeamsRowKt$ScoreBoxGold$1$1(this.$highlighted, this.$highlightAnimationKey, this.$scale, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TeamsRowKt$ScoreBoxGold$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00c4 -> B:7:0x00ca). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Animatable<Float, AnimationVector1D> animatable;
        int i;
        int i2;
        Easing easing;
        int i3;
        int i4;
        Animatable<Float, AnimationVector1D> animatable2;
        Float boxFloat;
        TweenSpec tween$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.label;
        int i6 = 2;
        Easing easing2 = null;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$highlighted || this.$highlightAnimationKey == 0) {
                this.label = 1;
                if (this.$scale.snapTo(Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                animatable = this.$scale;
                i = 0;
                i2 = 3;
                if (i < i2) {
                }
            }
        } else if (i5 == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i5 == 2) {
            int i7 = this.I$1;
            int i8 = this.I$0;
            Animatable<Float, AnimationVector1D> animatable3 = (Animatable) this.L$0;
            ResultKt.throwOnFailure(obj);
            i4 = i8;
            animatable2 = animatable3;
            easing = null;
            i3 = i7;
            boxFloat = Boxing.boxFloat(1.0f);
            tween$default = AnimationSpecKt.tween$default(180, 0, easing, 6, easing);
            this.L$0 = animatable2;
            this.I$0 = i4;
            this.I$1 = i3;
            this.label = 3;
            Animatable<Float, AnimationVector1D> animatable4 = animatable2;
            int i9 = i4;
            int i10 = i3;
            if (Animatable.animateTo$default(animatable2, boxFloat, tween$default, null, null, this, 12, null) != coroutine_suspended) {
            }
        } else {
            if (i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = this.I$1;
            int i12 = this.I$0;
            Animatable<Float, AnimationVector1D> animatable5 = (Animatable) this.L$0;
            ResultKt.throwOnFailure(obj);
            i2 = i12;
            animatable = animatable5;
            easing = null;
            i = i11 + 1;
            easing2 = easing;
            i6 = 2;
            if (i < i2) {
                Float boxFloat2 = Boxing.boxFloat(1.32f);
                TweenSpec tween$default2 = AnimationSpecKt.tween$default(Opcodes.F2L, 0, easing2, 6, easing2);
                this.L$0 = animatable;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = i6;
                int i13 = i2;
                int i14 = i;
                Animatable<Float, AnimationVector1D> animatable6 = animatable;
                easing = easing2;
                if (Animatable.animateTo$default(animatable, boxFloat2, tween$default2, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3 = i14;
                i4 = i13;
                animatable2 = animatable6;
                boxFloat = Boxing.boxFloat(1.0f);
                tween$default = AnimationSpecKt.tween$default(180, 0, easing, 6, easing);
                this.L$0 = animatable2;
                this.I$0 = i4;
                this.I$1 = i3;
                this.label = 3;
                Animatable<Float, AnimationVector1D> animatable42 = animatable2;
                int i92 = i4;
                int i102 = i3;
                if (Animatable.animateTo$default(animatable2, boxFloat, tween$default, null, null, this, 12, null) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                i11 = i102;
                i2 = i92;
                animatable = animatable42;
                i = i11 + 1;
                easing2 = easing;
                i6 = 2;
                if (i < i2) {
                    return Unit.INSTANCE;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
