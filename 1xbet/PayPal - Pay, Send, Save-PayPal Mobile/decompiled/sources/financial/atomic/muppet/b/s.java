package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class s extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6830a;
    public final /* synthetic */ kotlinx.serialization.json.JsonArray b;
    public final /* synthetic */ financial.atomic.muppet.inter.Page c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(financial.atomic.muppet.inter.Page page, kotlin.coroutines.Continuation continuation, kotlinx.serialization.json.JsonArray jsonArray) {
        super(2, continuation);
        this.b = jsonArray;
        this.c = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.s(this.c, continuation, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.serialization.json.JsonArray jsonArray = this.b;
        return new financial.atomic.muppet.b.s(this.c, (kotlin.coroutines.Continuation) obj2, jsonArray).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        java.lang.String content;
        java.lang.String str;
        java.lang.Object request$default;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
        java.lang.Object jsonObject$core_release;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6830a;
        try {
        } catch (java.lang.Exception e) {
            financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
            new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.b.s$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    java.lang.String obj2;
                    obj2 = e.toString();
                    return obj2;
                }
            };
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.serialization.json.JsonObject jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(this.b.get(0));
            kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "url");
            if (jsonElement != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) != null && (content = jsonPrimitive.getContent()) != null) {
                kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "method");
                if (jsonElement2 == null || (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) == null || (str = jsonPrimitive4.getContent()) == null) {
                    str = "GET";
                }
                kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "headers");
                java.util.Map<java.lang.String, java.lang.String> _jsonObjectToMap = financial.atomic.muppet.bridge.PageKt._jsonObjectToMap(jsonElement3 != null ? kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement3) : null);
                kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                java.lang.String content2 = (jsonElement4 == null || (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) == null) ? null : jsonPrimitive3.getContent();
                kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "followRedirects");
                boolean z = (jsonElement5 == null || (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement5)) == null) ? true : kotlinx.serialization.json.JsonElementKt.getBoolean(jsonPrimitive2);
                financial.atomic.muppet.inter.Page page = this.c;
                this.f6830a = 1;
                request$default = financial.atomic.muppet.inter.Page.DefaultImpls.request$default(page, str, content, content2, _jsonObjectToMap, z, null, this, 32, null);
                if (request$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            jsonObject$core_release = obj;
            return ((kotlinx.serialization.json.JsonObject) jsonObject$core_release).toString();
        }
        kotlin.ResultKt.throwOnFailure(obj);
        request$default = obj;
        this.f6830a = 2;
        jsonObject$core_release = ((financial.atomic.muppet.http.Response) request$default).jsonObject$core_release(this);
        if (jsonObject$core_release == coroutine_suspended) {
            return coroutine_suspended;
        }
        return ((kotlinx.serialization.json.JsonObject) jsonObject$core_release).toString();
    }
}
