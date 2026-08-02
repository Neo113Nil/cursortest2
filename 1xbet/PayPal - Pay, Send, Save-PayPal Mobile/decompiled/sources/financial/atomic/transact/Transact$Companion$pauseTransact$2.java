package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lfinancial/atomic/transact/PausedTransactRef;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "financial.atomic.transact.Transact$Companion$pauseTransact$2", f = "Transact.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, m = "invokeSuspend", n = {"transact"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class Transact$Companion$pauseTransact$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super financial.atomic.transact.PausedTransactRef>, java.lang.Object> {
    java.lang.Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        financial.atomic.transact.Transact transact;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            financial.atomic.transact.Transact transact2 = financial.atomic.transact.Transact.INSTANCE.get_activeTransact$transact_release();
            if (transact2 == null) {
                throw new financial.atomic.transact.Transact.PauseTransactException("No Transact is currently presented");
            }
            if (transact2.getIsPaused()) {
                throw new financial.atomic.transact.Transact.PauseTransactException("Transact is already paused");
            }
            transact2.setPaused$transact_release(true);
            financial.atomic.transact.Transact.Event event = financial.atomic.transact.Transact.Event.PAUSE_REQUEST;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            this.L$0 = transact2;
            this.label = 1;
            if (transact2.emit((java.lang.Enum) event, (financial.atomic.transact.Transact.Event) jSONObject, (kotlin.coroutines.Continuation<? super financial.atomic.transact.Emitter.Event<financial.atomic.transact.Transact.Event>>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            transact = transact2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transact = (financial.atomic.transact.Transact) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return new financial.atomic.transact.PausedTransactRef(transact);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super financial.atomic.transact.PausedTransactRef> continuation) {
        return ((financial.atomic.transact.Transact$Companion$pauseTransact$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new financial.atomic.transact.Transact$Companion$pauseTransact$2(continuation);
    }

    public Transact$Companion$pauseTransact$2(kotlin.coroutines.Continuation<? super financial.atomic.transact.Transact$Companion$pauseTransact$2> continuation) {
        super(2, continuation);
    }
}
