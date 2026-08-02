package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class q extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.serialization.json.JsonArray f6828a;
    public final /* synthetic */ financial.atomic.muppet.bridge.Page b;
    public final /* synthetic */ financial.atomic.muppet.inter.Page c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kotlinx.serialization.json.JsonArray jsonArray, financial.atomic.muppet.bridge.Page page, financial.atomic.muppet.inter.Page page2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6828a = jsonArray;
        this.b = page;
        this.c = page2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.q(this.f6828a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((financial.atomic.muppet.b.q) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0032 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Map map;
        java.util.Map map2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String content = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(this.f6828a.get(0)).getContent();
        kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        intRef.element = kotlin.random.Random.INSTANCE.nextInt();
        while (map.get(kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element)) != null) {
            intRef.element = kotlin.random.Random.INSTANCE.nextInt();
        }
        financial.atomic.muppet.b.p pVar = new financial.atomic.muppet.b.p(this.b, intRef, content, null);
        map2 = this.b.getHighSpeedVideoFpsRangesFor;
        map2.put(kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element), this.c.on(content, pVar));
        return java.lang.String.valueOf(intRef.element);
    }
}
