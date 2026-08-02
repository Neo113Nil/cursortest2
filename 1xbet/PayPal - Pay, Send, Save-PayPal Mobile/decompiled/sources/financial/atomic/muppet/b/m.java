package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class m extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6824a;
    public final /* synthetic */ kotlinx.serialization.json.JsonArray b;
    public final /* synthetic */ financial.atomic.muppet.inter.Page c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(financial.atomic.muppet.inter.Page page, kotlin.coroutines.Continuation continuation, kotlinx.serialization.json.JsonArray jsonArray) {
        super(2, continuation);
        this.b = jsonArray;
        this.c = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.m(this.c, continuation, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.serialization.json.JsonArray jsonArray = this.b;
        return new financial.atomic.muppet.b.m(this.c, (kotlin.coroutines.Continuation) obj2, jsonArray).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (r11 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r11 != r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6824a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String content = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(this.b.get(0)).getContent();
            java.util.Map<java.lang.String, java.lang.String> _jsonObjectToMap = this.b.size() > 1 ? financial.atomic.muppet.bridge.PageKt._jsonObjectToMap(kotlinx.serialization.json.JsonElementKt.getJsonObject(this.b.get(1))) : kotlin.collections.MapsKt.emptyMap();
            long j = this.b.size() > 2 ? kotlinx.serialization.json.JsonElementKt.getLong(kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(this.b.get(2))) : 30000L;
            financial.atomic.muppet.inter.Page page = this.c;
            this.f6824a = 1;
            obj = page.mo23212goto(content, _jsonObjectToMap, j, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return java.lang.String.valueOf(((java.lang.Boolean) obj).booleanValue());
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f6824a = 2;
        obj = ((kotlinx.coroutines.Deferred) obj).await(this);
    }
}
