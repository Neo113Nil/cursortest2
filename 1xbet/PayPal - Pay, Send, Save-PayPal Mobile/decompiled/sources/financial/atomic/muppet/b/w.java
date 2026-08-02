package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class w extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6834a;
    public final /* synthetic */ kotlinx.serialization.json.JsonArray b;
    public final /* synthetic */ financial.atomic.muppet.inter.Page c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(financial.atomic.muppet.inter.Page page, kotlin.coroutines.Continuation continuation, kotlinx.serialization.json.JsonArray jsonArray) {
        super(2, continuation);
        this.b = jsonArray;
        this.c = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.w(this.c, continuation, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.serialization.json.JsonArray jsonArray = this.b;
        return new financial.atomic.muppet.b.w(this.c, (kotlin.coroutines.Continuation) obj2, jsonArray).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.Boolean booleanOrNull;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6834a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return null;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.b);
        boolean booleanValue = (jsonElement == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null || (booleanOrNull = kotlinx.serialization.json.JsonElementKt.getBooleanOrNull(jsonPrimitive)) == null) ? true : booleanOrNull.booleanValue();
        financial.atomic.muppet.inter.Page page = this.c;
        this.f6834a = 1;
        if (page.show(booleanValue, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return null;
    }
}
