package financial.atomic.c;

/* loaded from: classes17.dex */
public abstract class c {
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|(1:(1:(3:10|11|12)(2:14|15))(1:16))(1:30)|17|18|19|(1:21)(1:28)|22|23|24))|32|6|(0)(0)|17|18|19|(0)(0)|22|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        if (r11.emit((java.lang.Enum) r1, (financial.atomic.transact.Transact.Event) r12, (kotlin.coroutines.Continuation<? super financial.atomic.transact.Emitter.Event<financial.atomic.transact.Transact.Event>>) r0) != r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (r13 != r7) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r1v3, types: [org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object storageGet(financial.atomic.transact.Transact transact, org.json.JSONObject jSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        financial.atomic.c.b bVar;
        int i;
        java.lang.String string;
        if (continuation instanceof financial.atomic.c.b) {
            bVar = (financial.atomic.c.b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - 2147483648;
                java.lang.Object obj = bVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    string = jSONObject.getString("key");
                    financial.atomic.a.e eVar = transact.get_storage$transact_release();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                    bVar.f6740a = transact;
                    bVar.b = string;
                    bVar.d = 1;
                    obj = financial.atomic.a.e.get$default(eVar, string, null, bVar, 2, null);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    java.lang.String str = bVar.b;
                    financial.atomic.transact.Transact transact2 = bVar.f6740a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    string = str;
                    transact = transact2;
                }
                java.lang.String str2 = (java.lang.String) obj;
                str2 = new org.json.JSONObject(str2 != null ? "" : str2);
                financial.atomic.transact.Transact.Event event = financial.atomic.transact.Transact.Event.STORAGE_RESPONSE;
                org.json.JSONObject put = new org.json.JSONObject().put("key", string).put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, str2);
                bVar.f6740a = null;
                bVar.b = null;
                bVar.d = 2;
            }
        }
        bVar = new financial.atomic.c.b(continuation);
        java.lang.Object obj2 = bVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
        if (i != 0) {
        }
        java.lang.String str22 = (java.lang.String) obj2;
        str22 = new org.json.JSONObject(str22 != null ? "" : str22);
        financial.atomic.transact.Transact.Event event2 = financial.atomic.transact.Transact.Event.STORAGE_RESPONSE;
        org.json.JSONObject put2 = new org.json.JSONObject().put("key", string).put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, str22);
        bVar.f6740a = null;
        bVar.b = null;
        bVar.d = 2;
    }

    public static final java.lang.Object storagePut(financial.atomic.transact.Transact transact, org.json.JSONObject jSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.String string;
        java.lang.String string2 = jSONObject.getString("key");
        try {
            string = jSONObject.getJSONObject(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE).toString();
        } catch (org.json.JSONException unused) {
            string = jSONObject.getString(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        }
        financial.atomic.a.e eVar = transact.get_storage$transact_release();
        kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
        java.lang.Object obj = eVar.set(string2, string, continuation);
        return obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : kotlin.Unit.INSTANCE;
    }
}
