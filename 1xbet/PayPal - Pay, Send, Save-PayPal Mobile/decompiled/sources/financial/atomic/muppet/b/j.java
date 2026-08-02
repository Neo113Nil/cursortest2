package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class j extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6822a;
    public final /* synthetic */ financial.atomic.muppet.inter.Page b;
    public final /* synthetic */ java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(financial.atomic.muppet.inter.Page page, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = page;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.j(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.b.j(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6822a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            financial.atomic.muppet.inter.Page page = this.b;
            java.lang.String str = this.c;
            this.f6822a = 1;
            obj = page.cookies(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Iterable<io.ktor.http.Cookie> iterable = (java.lang.Iterable) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (io.ktor.http.Cookie cookie : iterable) {
            kotlin.Pair pair = kotlin.TuplesKt.to("name", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(cookie.getName()));
            kotlin.Pair pair2 = kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(cookie.getValue()));
            kotlin.Pair pair3 = kotlin.TuplesKt.to("domain", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(cookie.getDomain()));
            io.ktor.util.date.GMTDate expires = cookie.getExpires();
            arrayList.add(new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, kotlin.TuplesKt.to("expires", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(expires != null ? io.ktor.http.DateUtilsKt.toHttpDate(expires) : null)), kotlin.TuplesKt.to("path", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(cookie.getPath())), kotlin.TuplesKt.to("secure", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(cookie.getSecure()))), kotlin.TuplesKt.to("maxAge", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(cookie.getMaxAgeInt())))));
        }
        return new kotlinx.serialization.json.JsonArray(arrayList).toString();
    }
}
