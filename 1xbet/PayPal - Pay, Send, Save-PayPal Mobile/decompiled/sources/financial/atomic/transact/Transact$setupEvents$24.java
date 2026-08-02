package financial.atomic.transact;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class Transact$setupEvents$24 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function2<financial.atomic.transact.Emitter.Event<org.json.JSONObject>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(financial.atomic.transact.Emitter.Event<org.json.JSONObject> event, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return financial.atomic.transact.Transact.access$setupEvents$broadcast$10((financial.atomic.transact.Transact) this.receiver, event, continuation);
    }

    public Transact$setupEvents$24(java.lang.Object obj) {
        super(2, obj, financial.atomic.transact.Transact.class, "broadcast", "broadcast(Lfinancial/atomic/transact/Emitter$Event;)V", 4);
    }
}
