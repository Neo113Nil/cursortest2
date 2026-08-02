package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class h extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6820a;
    public final /* synthetic */ financial.atomic.muppet.inter.Page b;
    public final /* synthetic */ kotlinx.serialization.json.JsonArray c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(financial.atomic.muppet.inter.Page page, kotlin.coroutines.Continuation continuation, kotlinx.serialization.json.JsonArray jsonArray) {
        super(2, continuation);
        this.b = page;
        this.c = jsonArray;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.h(this.b, continuation, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.b.h(this.b, (kotlin.coroutines.Continuation) obj2, this.c).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6820a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return "true";
        }
        kotlin.ResultKt.throwOnFailure(obj);
        financial.atomic.muppet.inter.Page page = this.b;
        java.lang.String content = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(this.c.get(0)).getContent();
        this.f6820a = 1;
        return page.addUserScript(content, this) == coroutine_suspended ? coroutine_suspended : "true";
    }
}
