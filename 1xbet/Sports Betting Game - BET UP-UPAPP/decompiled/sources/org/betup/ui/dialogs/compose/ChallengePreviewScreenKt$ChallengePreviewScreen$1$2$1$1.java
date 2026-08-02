package org.betup.ui.dialogs.compose;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.remote.entity.challenges.NewChallengeDetailsResponseModelP;
import org.betup.ui.common.compose.HapticFeedbackEffect;
import org.betup.ui.common.compose.HapticFeedbackType;

/* compiled from: ChallengePreviewScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$1$1", f = "ChallengePreviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NewChallengeDetailsResponseModelP $challengeDetails;
    final /* synthetic */ Integer $effectiveState;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ Function1<HapticFeedbackType, Unit> $performHaptic;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$1$1(boolean z, NewChallengeDetailsResponseModelP newChallengeDetailsResponseModelP, Integer num, Function1<? super HapticFeedbackType, Unit> function1, Continuation<? super ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$1$1> continuation) {
        super(2, continuation);
        this.$isLoading = z;
        this.$challengeDetails = newChallengeDetailsResponseModelP;
        this.$effectiveState = num;
        this.$performHaptic = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$1$1(this.$isLoading, this.$challengeDetails, this.$effectiveState, this.$performHaptic, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HapticFeedbackType forChallengeEffectiveState;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!this.$isLoading && this.$challengeDetails != null && (forChallengeEffectiveState = HapticFeedbackEffect.forChallengeEffectiveState(this.$effectiveState)) != null) {
            this.$performHaptic.invoke(forChallengeEffectiveState);
        }
        return Unit.INSTANCE;
    }
}
