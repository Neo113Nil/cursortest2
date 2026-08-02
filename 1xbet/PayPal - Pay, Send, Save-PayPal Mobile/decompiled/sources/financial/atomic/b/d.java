package financial.atomic.b;

/* loaded from: classes17.dex */
public final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6736a;
    public final /* synthetic */ financial.atomic.transact.activity.TransactActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(financial.atomic.transact.activity.TransactActivity transactActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = transactActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        financial.atomic.b.d dVar = new financial.atomic.b.d(this.b, continuation);
        dVar.f6736a = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(financial.atomic.transact.Emitter.Event<org.json.JSONObject> event, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((financial.atomic.b.d) create(event, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        financial.atomic.transact.Emitter.Event event = (financial.atomic.transact.Emitter.Event) this.f6736a;
        financial.atomic.transact.activity.TransactActivity transactActivity = this.b;
        android.content.Intent intent = new android.content.Intent();
        org.json.JSONObject jSONObject = (org.json.JSONObject) event.getData();
        intent.putExtra("taskId", jSONObject != null ? jSONObject.optString("taskId") : null);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        transactActivity.setResult(-1, intent);
        this.b.finish();
        return unit;
    }
}
