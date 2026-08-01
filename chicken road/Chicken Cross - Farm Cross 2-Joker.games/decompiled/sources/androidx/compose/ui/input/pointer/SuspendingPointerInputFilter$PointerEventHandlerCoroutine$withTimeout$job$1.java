package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputFilter;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, 618}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $timeMillis;
    int label;
    final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(long j, SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, Continuation<? super SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1> continuation) {
        super(2, continuation);
        this.$timeMillis = j;
        this.this$0 = pointerEventHandlerCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(this.$timeMillis, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CancellableContinuation cancellableContinuation;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(this.$timeMillis - 1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    cancellableContinuation = ((SuspendingPointerInputFilter.PointerEventHandlerCoroutine) this.this$0).pointerAwaiter;
                    if (cancellableContinuation != null) {
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m8079constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(this.$timeMillis))));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        if (DelayKt.delay(1L, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        cancellableContinuation = ((SuspendingPointerInputFilter.PointerEventHandlerCoroutine) this.this$0).pointerAwaiter;
        if (cancellableContinuation != null) {
        }
        return Unit.INSTANCE;
    }
}
