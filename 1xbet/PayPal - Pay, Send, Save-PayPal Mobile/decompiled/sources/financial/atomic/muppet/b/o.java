package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class o extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.serialization.json.JsonArray f6826a;
    public final /* synthetic */ financial.atomic.muppet.bridge.Page b;
    public final /* synthetic */ financial.atomic.muppet.inter.Page c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kotlinx.serialization.json.JsonArray jsonArray, financial.atomic.muppet.bridge.Page page, financial.atomic.muppet.inter.Page page2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6826a = jsonArray;
        this.b = page;
        this.c = page2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.o(this.f6826a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((financial.atomic.muppet.b.o) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Map map;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(this.f6826a.get(0)).getContent();
        int i = kotlinx.serialization.json.JsonElementKt.getInt(kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(this.f6826a.get(1)));
        map = this.b.getHighSpeedVideoFpsRangesFor;
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) map.remove(kotlin.coroutines.jvm.internal.Boxing.boxInt(i));
        if (job == null) {
            return "false";
        }
        this.c.off(job);
        return "true";
    }
}
