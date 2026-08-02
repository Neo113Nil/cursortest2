package financial.atomic.muppet.http;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JF\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0014J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0014R,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0018"}, d2 = {"Lfinancial/atomic/muppet/http/Response;", "", "", "status", "", "", "", "headers", "Lkotlinx/coroutines/flow/Flow;", "", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(ILjava/util/Map;Lkotlinx/coroutines/flow/Flow;)V", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonObject;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "()Lkotlinx/serialization/json/JsonObject;", "jsonObject$core_release", "component1", "()I", "component2", "()Ljava/util/Map;", "component3", "()Lkotlinx/coroutines/flow/Flow;", "copy", "(ILjava/util/Map;Lkotlinx/coroutines/flow/Flow;)Lfinancial/atomic/muppet/http/Response;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", com.visa.cbp.getEncExpo.warmup, "getStatus", util.h.xy.cb.b.f1091, "Ljava/util/Map;", "getHeaders", "c", "Lkotlinx/coroutines/flow/Flow;", "getBody"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Response {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int status;

    /* renamed from: b, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers;

    /* renamed from: c, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.Flow<byte[]> body;

    /* JADX WARN: Multi-variable type inference failed */
    public Response(int i, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, kotlinx.coroutines.flow.Flow<byte[]> flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        this.status = i;
        this.headers = map;
        this.body = flow;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[LOOP:0: B:11:0x0048->B:13:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[LOOP:1: B:16:0x005d->B:18:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object bytes(kotlin.coroutines.Continuation<? super byte[]> continuation) {
        financial.atomic.muppet.c.s sVar;
        int i;
        java.util.Iterator it;
        if (continuation instanceof financial.atomic.muppet.c.s) {
            sVar = (financial.atomic.muppet.c.s) continuation;
            int i2 = sVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.c = i2 - 2147483648;
                java.lang.Object obj = sVar.f6856a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sVar.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow<byte[]> flow = this.body;
                    sVar.c = 1;
                    obj = kotlinx.coroutines.flow.FlowKt__CollectionKt.toList$default(flow, null, sVar, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.List<byte[]> list = (java.util.List) obj;
                it = list.iterator();
                int i3 = 0;
                int i4 = 0;
                while (it.hasNext()) {
                    i4 += ((byte[]) it.next()).length;
                }
                byte[] bArr = new byte[i4];
                for (byte[] bArr2 : list) {
                    kotlin.collections.ArraysKt.copyInto$default(bArr2, bArr, i3, 0, 0, 12, (java.lang.Object) null);
                    i3 += bArr2.length;
                }
                return bArr;
            }
        }
        sVar = new financial.atomic.muppet.c.s(this, continuation);
        java.lang.Object obj2 = sVar.f6856a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sVar.c;
        if (i != 0) {
        }
        java.util.List<byte[]> list2 = (java.util.List) obj2;
        it = list2.iterator();
        int i32 = 0;
        int i42 = 0;
        while (it.hasNext()) {
        }
        byte[] bArr3 = new byte[i42];
        while (r11.hasNext()) {
        }
        return bArr3;
    }

    public final kotlinx.coroutines.flow.Flow<byte[]> getBody() {
        return this.body;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return this.headers;
    }

    public final int getStatus() {
        return this.status;
    }

    public final kotlinx.serialization.json.JsonObject header() {
        java.util.Set set;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : this.headers.entrySet()) {
            java.lang.String lowerCase = entry.getKey().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.util.List<java.lang.String> value = entry.getValue();
            if (!value.isEmpty()) {
                java.lang.String str = !kotlin.jvm.internal.Intrinsics.areEqual("cookie", lowerCase) ? "," : ";";
                if (kotlin.jvm.internal.Intrinsics.areEqual("set-cookie", lowerCase)) {
                    java.lang.String key = entry.getKey();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(value, 10));
                    java.util.Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        arrayList.add(kotlinx.serialization.json.JsonElementKt.JsonPrimitive((java.lang.String) it.next()));
                    }
                    linkedHashMap.put(key, new kotlinx.serialization.json.JsonArray(arrayList));
                } else {
                    set = financial.atomic.muppet.c.u.getHighResolutionOutputSizeshNQ4ISI;
                    if (set.contains(lowerCase)) {
                        linkedHashMap.put(entry.getKey(), kotlinx.serialization.json.JsonElementKt.JsonPrimitive((java.lang.String) kotlin.collections.CollectionsKt.last((java.util.List) value)));
                    } else {
                        linkedHashMap.put(entry.getKey(), kotlinx.serialization.json.JsonElementKt.JsonPrimitive(kotlin.collections.CollectionsKt.joinToString$default(value, str, null, null, 0, null, null, 62, null)));
                    }
                }
            }
        }
        return new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(java.lang.Integer.valueOf(this.status))), kotlin.TuplesKt.to("headers", new kotlinx.serialization.json.JsonObject(linkedHashMap))));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object jsonObject$core_release(kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonObject> continuation) {
        financial.atomic.muppet.c.t tVar;
        int i;
        java.lang.String str;
        kotlinx.serialization.json.JsonObject jsonObject;
        if (continuation instanceof financial.atomic.muppet.c.t) {
            tVar = (financial.atomic.muppet.c.t) continuation;
            int i2 = tVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.e = i2 - 2147483648;
                java.lang.Object obj = tVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tVar.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.serialization.json.JsonObject header = header();
                    tVar.f6857a = header;
                    tVar.b = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                    tVar.e = 1;
                    java.lang.Object bytes = bytes(tVar);
                    if (bytes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                    jsonObject = header;
                    obj = bytes;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = tVar.b;
                    jsonObject = tVar.f6857a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.plus(jsonObject, kotlin.TuplesKt.to(str, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(kotlin.text.StringsKt.decodeToString((byte[]) obj)))));
            }
        }
        tVar = new financial.atomic.muppet.c.t(this, continuation);
        java.lang.Object obj2 = tVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tVar.e;
        if (i != 0) {
        }
        return new kotlinx.serialization.json.JsonObject(kotlin.collections.MapsKt.plus(jsonObject, kotlin.TuplesKt.to(str, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(kotlin.text.StringsKt.decodeToString((byte[]) obj2)))));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Response(status=");
        sb.append(this.status);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.status);
        return this.body.hashCode() + ((this.headers.hashCode() + (hashCode * 31)) * 31);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof financial.atomic.muppet.http.Response)) {
            return false;
        }
        financial.atomic.muppet.http.Response response = (financial.atomic.muppet.http.Response) other;
        return this.status == response.status && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, response.headers) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, response.body);
    }

    public final financial.atomic.muppet.http.Response copy(int status, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, kotlinx.coroutines.flow.Flow<byte[]> body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
        return new financial.atomic.muppet.http.Response(status, headers, body);
    }

    public final kotlinx.coroutines.flow.Flow<byte[]> component3() {
        return this.body;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> component2() {
        return this.headers;
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ financial.atomic.muppet.http.Response copy$default(financial.atomic.muppet.http.Response response, int i, java.util.Map map, kotlinx.coroutines.flow.Flow flow, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = response.status;
        }
        if ((i2 & 2) != 0) {
            map = response.headers;
        }
        if ((i2 & 4) != 0) {
            flow = response.body;
        }
        return response.copy(i, map, flow);
    }
}
