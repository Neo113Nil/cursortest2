package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class v extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f6833a;
    public int b;
    public final /* synthetic */ kotlinx.serialization.json.JsonArray c;
    public final /* synthetic */ financial.atomic.muppet.inter.Page d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(financial.atomic.muppet.inter.Page page, kotlin.coroutines.Continuation continuation, kotlinx.serialization.json.JsonArray jsonArray) {
        super(2, continuation);
        this.c = jsonArray;
        this.d = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.v(this.d, continuation, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.serialization.json.JsonArray jsonArray = this.c;
        return new financial.atomic.muppet.b.v(this.d, (kotlin.coroutines.Continuation) obj2, jsonArray).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String content = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(this.c.get(0)).getContent();
            financial.atomic.muppet.inter.Page page = this.d;
            this.f6833a = content;
            this.b = 1;
            if (page.setUserAgent(content, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = content;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f6833a;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
        companion.getSerializersModule();
        return companion.encodeToString(kotlinx.serialization.internal.StringSerializer.INSTANCE, str);
    }
}
