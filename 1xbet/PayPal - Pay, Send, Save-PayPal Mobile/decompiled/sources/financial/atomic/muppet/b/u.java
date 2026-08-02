package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class u extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public financial.atomic.muppet.inter.Page f6832a;
    public java.util.Collection b;
    public java.util.Iterator c;
    public java.util.Collection d;
    public int e;
    public final /* synthetic */ kotlinx.serialization.json.JsonArray f;
    public final /* synthetic */ financial.atomic.muppet.inter.Page g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(financial.atomic.muppet.inter.Page page, kotlin.coroutines.Continuation continuation, kotlinx.serialization.json.JsonArray jsonArray) {
        super(2, continuation);
        this.f = jsonArray;
        this.g = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.u(this.g, continuation, this.f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.serialization.json.JsonArray jsonArray = this.f;
        return new financial.atomic.muppet.b.u(this.g, (kotlin.coroutines.Continuation) obj2, jsonArray).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x011b -> B:7:0x0126). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        financial.atomic.muppet.inter.Page page;
        java.util.Collection arrayList;
        java.util.Iterator<kotlinx.serialization.json.JsonElement> it;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.serialization.json.JsonArray jsonArray = this.f;
            page = this.g;
            arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray, 10));
            it = jsonArray.iterator();
            java.lang.Integer num = null;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = this.d;
            it = this.c;
            java.util.Collection collection = this.b;
            page = this.f6832a;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Exception e) {
                financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
                new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.b.u$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        java.lang.String obj2;
                        obj2 = e.toString();
                        return obj2;
                    }
                };
            }
            arrayList.add(kotlin.Unit.INSTANCE);
            arrayList = collection;
            java.lang.Integer num2 = null;
            if (it.hasNext()) {
                kotlinx.serialization.json.JsonObject jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(it.next());
                try {
                } catch (java.lang.Exception e2) {
                    collection = arrayList;
                    financial.atomic.muppet.g.a aVar2 = financial.atomic.muppet.g.f6869a;
                    new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.b.u$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            java.lang.String obj2;
                            obj2 = e2.toString();
                            return obj2;
                        }
                    };
                }
                kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "expires");
                java.lang.Long longOrNull = (jsonElement == null || (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getLongOrNull(jsonPrimitive4);
                java.lang.Object obj2 = jsonObject.get((java.lang.Object) "name");
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
                java.lang.String content = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive((kotlinx.serialization.json.JsonElement) obj2).getContent();
                java.lang.Object obj3 = jsonObject.get((java.lang.Object) com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                java.lang.String content2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive((kotlinx.serialization.json.JsonElement) obj3).getContent();
                java.lang.Object obj4 = jsonObject.get((java.lang.Object) "domain");
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj4);
                java.lang.String content3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive((kotlinx.serialization.json.JsonElement) obj4).getContent();
                io.ktor.util.date.GMTDate GMTDate = longOrNull != null ? io.ktor.util.date.DateJvmKt.GMTDate(longOrNull) : null;
                kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "path");
                java.lang.String contentOrNull = (jsonElement2 == null || (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getContentOrNull(jsonPrimitive3);
                kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "secure");
                boolean z = (jsonElement3 == null || (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? false : kotlinx.serialization.json.JsonElementKt.getBoolean(jsonPrimitive2);
                kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "maxAge");
                if (jsonElement4 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) != null) {
                    num2 = kotlinx.serialization.json.JsonElementKt.getIntOrNull(jsonPrimitive);
                }
                final io.ktor.http.Cookie cookie = new io.ktor.http.Cookie(content, content2, io.ktor.http.CookieEncoding.RAW, num2, GMTDate, content3, contentOrNull, z, false, (java.util.Map) null, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                financial.atomic.muppet.g.a aVar3 = financial.atomic.muppet.g.f6869a;
                new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.b.u$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        java.lang.String concat;
                        concat = "Page.setCookie set: ".concat(java.lang.String.valueOf(io.ktor.http.Cookie.this));
                        return concat;
                    }
                };
                new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.b.u$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return financial.atomic.muppet.b.u.$r8$lambda$e1U41K5_z_7PJ4biGaD0IN2ljzU();
                    }
                };
                this.f6832a = page;
                this.b = arrayList;
                this.c = it;
                this.d = arrayList;
                this.e = 1;
                if (page.setCookie(cookie, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                collection = arrayList;
                arrayList.add(kotlin.Unit.INSTANCE);
                arrayList = collection;
                java.lang.Integer num22 = null;
                if (it.hasNext()) {
                    return null;
                }
            }
        }
    }

    public static /* synthetic */ java.lang.String $r8$lambda$e1U41K5_z_7PJ4biGaD0IN2ljzU() {
        return "Page.setCookie";
    }
}
