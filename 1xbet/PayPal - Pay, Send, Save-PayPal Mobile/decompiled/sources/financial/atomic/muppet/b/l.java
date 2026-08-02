package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class l extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6823a;
    public final /* synthetic */ financial.atomic.muppet.inter.Page b;
    public final /* synthetic */ kotlinx.serialization.json.JsonArray c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(financial.atomic.muppet.inter.Page page, kotlin.coroutines.Continuation continuation, kotlinx.serialization.json.JsonArray jsonArray) {
        super(2, continuation);
        this.b = page;
        this.c = jsonArray;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.l(this.b, continuation, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.b.l(this.b, (kotlin.coroutines.Continuation) obj2, this.c).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r6 != r0) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6823a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            financial.atomic.muppet.inter.Page page = this.b;
            java.lang.String content = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(this.c.get(0)).getContent();
            this.f6823a = 1;
            obj = page.evaluate(content, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f6823a = 2;
        java.lang.Object await = ((kotlinx.coroutines.Deferred) obj).await(this);
        return await == coroutine_suspended ? coroutine_suspended : await;
    }
}
