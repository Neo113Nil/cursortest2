package org.betup.ui.fragment.matches.details.compose;

import androidx.compose.runtime.MutableState;
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
import kotlinx.coroutines.DelayKt;

/* compiled from: MatchTopBaseItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$LiveTimerDisplay$2$1", f = "MatchTopBaseItem.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchTopBaseItemKt$LiveTimerDisplay$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $isFinished$delegate;
    final /* synthetic */ Long $matchId;
    final /* synthetic */ Function1<Long, Unit> $onPollMatchState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MatchTopBaseItemKt$LiveTimerDisplay$2$1(Long l, Function1<? super Long, Unit> function1, MutableState<Boolean> mutableState, Continuation<? super MatchTopBaseItemKt$LiveTimerDisplay$2$1> continuation) {
        super(2, continuation);
        this.$matchId = l;
        this.$onPollMatchState = function1;
        this.$isFinished$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchTopBaseItemKt$LiveTimerDisplay$2$1(this.$matchId, this.$onPollMatchState, this.$isFinished$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchTopBaseItemKt$LiveTimerDisplay$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        if (r6 != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:5:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean LiveTimerDisplay$lambda$17;
        boolean LiveTimerDisplay$lambda$172;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$matchId != null) {
                LiveTimerDisplay$lambda$17 = MatchTopBaseItemKt.LiveTimerDisplay$lambda$17(this.$isFinished$delegate);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function1<Long, Unit> function1 = this.$onPollMatchState;
        if (function1 != null) {
            function1.invoke(this.$matchId);
        }
        LiveTimerDisplay$lambda$172 = MatchTopBaseItemKt.LiveTimerDisplay$lambda$17(this.$isFinished$delegate);
        if (LiveTimerDisplay$lambda$172) {
            this.label = 1;
            if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Function1<Long, Unit> function12 = this.$onPollMatchState;
            if (function12 != null) {
            }
            LiveTimerDisplay$lambda$172 = MatchTopBaseItemKt.LiveTimerDisplay$lambda$17(this.$isFinished$delegate);
            if (LiveTimerDisplay$lambda$172) {
                return Unit.INSTANCE;
            }
        }
    }
}
