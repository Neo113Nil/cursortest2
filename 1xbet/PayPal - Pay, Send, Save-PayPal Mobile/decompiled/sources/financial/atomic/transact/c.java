package financial.atomic.transact;

/* loaded from: classes17.dex */
public final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6895a;
    public final /* synthetic */ financial.atomic.a.f b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ org.json.JSONObject d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(financial.atomic.a.f fVar, java.lang.String str, org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = fVar;
        this.c = str;
        this.d = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        financial.atomic.transact.Transact transact;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6895a;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                transact = this.b.f6733a;
                financial.atomic.transact.Transact.Event byValue = financial.atomic.transact.Transact.Event.INSTANCE.byValue(this.c);
                org.json.JSONObject jSONObject = this.d;
                this.f6895a = 1;
                if (transact.emit((java.lang.Enum) byValue, (financial.atomic.transact.Transact.Event) jSONObject, (kotlin.coroutines.Continuation<? super financial.atomic.transact.Emitter.Event<financial.atomic.transact.Transact.Event>>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((financial.atomic.transact.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new financial.atomic.transact.c(this.b, this.c, this.d, continuation);
    }
}
