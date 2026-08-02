package org.betup.ui.dialogs.compose;

import android.util.Log;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChallengeAcceptScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$ChallengeAcceptScreen$1$1", f = "ChallengeAcceptScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ChallengeAcceptScreenKt$ChallengeAcceptScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Boolean> $isUserCreator$delegate;
    final /* synthetic */ State<String> $secondUserPhoto$delegate;
    final /* synthetic */ State<Long> $userId$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeAcceptScreenKt$ChallengeAcceptScreen$1$1(State<Long> state, State<String> state2, State<Boolean> state3, Continuation<? super ChallengeAcceptScreenKt$ChallengeAcceptScreen$1$1> continuation) {
        super(2, continuation);
        this.$userId$delegate = state;
        this.$secondUserPhoto$delegate = state2;
        this.$isUserCreator$delegate = state3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChallengeAcceptScreenKt$ChallengeAcceptScreen$1$1(this.$userId$delegate, this.$secondUserPhoto$delegate, this.$isUserCreator$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChallengeAcceptScreenKt$ChallengeAcceptScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long ChallengeAcceptScreen$lambda$0;
        String ChallengeAcceptScreen$lambda$6;
        boolean ChallengeAcceptScreen$lambda$7;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ChallengeAcceptScreen$lambda$0 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$0(this.$userId$delegate);
            ChallengeAcceptScreen$lambda$6 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$6(this.$secondUserPhoto$delegate);
            ChallengeAcceptScreen$lambda$7 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$7(this.$isUserCreator$delegate);
            Log.d("ChallengeAcceptScreen", "UI state updated: userId=" + ChallengeAcceptScreen$lambda$0 + ", secondUserPhoto=" + ChallengeAcceptScreen$lambda$6 + ", isUserCreator=" + ChallengeAcceptScreen$lambda$7);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
