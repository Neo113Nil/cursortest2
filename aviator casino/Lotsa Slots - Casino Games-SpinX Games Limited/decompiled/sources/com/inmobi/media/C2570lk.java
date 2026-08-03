package com.inmobi.media;

/* renamed from: com.inmobi.media.lk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2570lk extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f5320a;
    public kotlinx.coroutines.sync.Mutex b;
    public int c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ java.util.Map e;
    public final /* synthetic */ com.inmobi.media.EnumC2728rk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2570lk(java.lang.String str, java.util.Map map, com.inmobi.media.EnumC2728rk enumC2728rk, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.d = str;
        this.e = map;
        this.f = enumC2728rk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2570lk(this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2570lk) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0149, code lost:
    
        if (r13.a(r1, r12) == r2) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int a2;
        java.lang.String str;
        com.inmobi.media.C2836vk c2836vk;
        kotlinx.coroutines.sync.Mutex mutex;
        ?? r0 = "toString(...)";
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        try {
            try {
            } catch (java.lang.Throwable th) {
                r0.unlock(null);
                throw th;
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            e.getMessage();
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.C2624nk c2624nk2 = com.inmobi.media.C2624nk.f5360a;
            java.util.Map map = this.e;
            com.inmobi.media.EnumC2728rk enumC2728rk = this.f;
            java.util.Objects.toString(map);
            java.util.Objects.toString(enumC2728rk);
            if (com.inmobi.media.C2624nk.h == null) {
                return kotlin.Unit.INSTANCE;
            }
            if (com.inmobi.media.C2624nk.a(this.d, this.e, this.f)) {
                return kotlin.Unit.INSTANCE;
            }
            com.inmobi.media.Ak ak = com.inmobi.media.C2624nk.h;
            if (ak == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mTelemetryValidator");
                ak = null;
            }
            com.inmobi.media.EnumC2728rk telemetryEventType = this.f;
            java.lang.String eventType = this.d;
            ak.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
            int ordinal = telemetryEventType.ordinal();
            if (ordinal == 0) {
                a2 = ak.b.a(eventType);
            } else {
                if (ordinal != 1) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                a2 = ak.c.a(eventType);
            }
            if (a2 != 0) {
                if (a2 != 1) {
                    return kotlin.Unit.INSTANCE;
                }
                if (this.e.get("samplingRate") == null) {
                    this.e.put("samplingRate", kotlin.coroutines.jvm.internal.Boxing.boxInt(100));
                }
            } else if (this.e.get("samplingRate") == null) {
                this.e.put("samplingRate", kotlin.coroutines.jvm.internal.Boxing.boxInt(kotlin.math.MathKt.roundToInt((1 - com.inmobi.media.C2624nk.b().getSamplingFactor()) * 100)));
            }
            java.lang.String str2 = this.d;
            int ordinal2 = this.f.ordinal();
            if (ordinal2 == 0) {
                str = "sdk";
            } else {
                if (ordinal2 != 1) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str = "template";
            }
            com.inmobi.media.C2836vk c2836vk2 = new com.inmobi.media.C2836vk(str2, null, str);
            this.e.put("eventType", c2836vk2.f5268a);
            java.util.Map map2 = this.e;
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            map2.put("eventId", uuid);
            this.e.put("isTemplateEvent", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.f == com.inmobi.media.EnumC2728rk.b));
            java.util.Map map3 = this.e;
            kotlin.jvm.internal.Intrinsics.checkNotNull(map3, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            java.lang.String payload = new org.json.JSONObject(map3).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(payload, "toString(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
            c2836vk2.b = payload;
            kotlinx.coroutines.sync.Mutex mutex2 = com.inmobi.media.C2624nk.b;
            this.f5320a = c2836vk2;
            this.b = mutex2;
            this.c = 1;
            if (mutex2.lock(null, this) != coroutine_suspended) {
                c2836vk = c2836vk2;
                mutex = mutex2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) this.f5320a;
            kotlin.ResultKt.throwOnFailure(obj);
            r0 = mutex3;
            com.inmobi.media.C2624nk.f5360a.a();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            r0.unlock(null);
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.sync.Mutex mutex4 = this.b;
        c2836vk = (com.inmobi.media.C2836vk) this.f5320a;
        kotlin.ResultKt.throwOnFailure(obj);
        mutex = mutex4;
        com.inmobi.media.C2624nk c2624nk3 = com.inmobi.media.C2624nk.f5360a;
        this.f5320a = mutex;
        this.b = null;
        this.c = 2;
        r0 = mutex;
    }
}
