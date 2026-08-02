package financial.atomic.b;

/* loaded from: classes17.dex */
public final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6735a;
    public final /* synthetic */ financial.atomic.transact.activity.TransactActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(financial.atomic.transact.activity.TransactActivity transactActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = transactActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        financial.atomic.b.c cVar = new financial.atomic.b.c(this.b, continuation);
        cVar.f6735a = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(financial.atomic.transact.Emitter.Event<org.json.JSONObject> event, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((financial.atomic.b.c) create(event, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        financial.atomic.transact.Emitter.Event event = (financial.atomic.transact.Emitter.Event) this.f6735a;
        financial.atomic.transact.activity.TransactActivity transactActivity = this.b;
        android.content.Intent intent = new android.content.Intent();
        org.json.JSONObject jSONObject = (org.json.JSONObject) event.getData();
        intent.putExtra("reason", jSONObject != null ? jSONObject.optString("reason") : null);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        transactActivity.setResult(0, intent);
        this.b.finish();
        return unit;
    }
}
