package org.betup.ui.fragment.matches.details.compose;

import androidx.compose.runtime.MutableState;
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
import org.betup.utils.UiExtensionsKt;

/* compiled from: MatchTopBaseItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$LiveTimerDisplay$1$1", f = "MatchTopBaseItem.kt", i = {}, l = {280}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchTopBaseItemKt$LiveTimerDisplay$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $isFinished$delegate;
    final /* synthetic */ String $matchDateTime;
    final /* synthetic */ MutableState<String> $timerText$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchTopBaseItemKt$LiveTimerDisplay$1$1(String str, MutableState<Boolean> mutableState, MutableState<String> mutableState2, Continuation<? super MatchTopBaseItemKt$LiveTimerDisplay$1$1> continuation) {
        super(2, continuation);
        this.$matchDateTime = str;
        this.$isFinished$delegate = mutableState;
        this.$timerText$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchTopBaseItemKt$LiveTimerDisplay$1$1(this.$matchDateTime, this.$isFinished$delegate, this.$timerText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchTopBaseItemKt$LiveTimerDisplay$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0024, code lost:
    
        if (r6 != false) goto L20;
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x002d */
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
            if (this.$matchDateTime != null) {
                LiveTimerDisplay$lambda$17 = MatchTopBaseItemKt.LiveTimerDisplay$lambda$17(this.$isFinished$delegate);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        while (!LiveTimerDisplay$lambda$172) {
            this.$timerText$delegate.setValue(UiExtensionsKt.getFormattedLiveTime(this.$matchDateTime));
            this.label = 1;
            if (DelayKt.delay(10L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
