package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lfinancial/atomic/transact/Emitter$Event;", "Lorg/json/JSONObject;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "financial.atomic.transact.Transact$setupEvents$6", f = "Transact.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class Transact$setupEvents$6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<financial.atomic.transact.Emitter.Event<org.json.JSONObject>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ financial.atomic.transact.Transact this$0;

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(financial.atomic.transact.Emitter.Event<org.json.JSONObject> event, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((financial.atomic.transact.Transact$setupEvents$6) create(event, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String unused;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        financial.atomic.transact.Emitter.Event event = (financial.atomic.transact.Emitter.Event) this.L$0;
        unused = this.this$0.d;
        event.getType();
        java.util.Objects.toString(event.getData());
        org.json.JSONObject jSONObject = (org.json.JSONObject) event.getData();
        if (jSONObject != null) {
            this.this$0.dispatchEvent$transact_release(financial.atomic.transact.Transact.Event.NETWORK_RESPONSE.getValue(), jSONObject);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        financial.atomic.transact.Transact$setupEvents$6 transact$setupEvents$6 = new financial.atomic.transact.Transact$setupEvents$6(this.this$0, continuation);
        transact$setupEvents$6.L$0 = obj;
        return transact$setupEvents$6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transact$setupEvents$6(financial.atomic.transact.Transact transact, kotlin.coroutines.Continuation<? super financial.atomic.transact.Transact$setupEvents$6> continuation) {
        super(2, continuation);
        this.this$0 = transact;
    }
}
