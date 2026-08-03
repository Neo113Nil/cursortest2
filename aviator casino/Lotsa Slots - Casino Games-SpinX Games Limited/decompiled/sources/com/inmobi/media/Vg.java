package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Vg extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Map f5016a;
    public int b;
    public final /* synthetic */ java.util.Map c;
    public final /* synthetic */ com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vg(java.util.Map map, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig publisherConfig, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = map;
        this.d = publisherConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Vg(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Vg(this.c, this.d, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0178, code lost:
    
        if (com.inmobi.media.Xg.b(r13, r2, r0, r12) == r1) goto L70;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Map signals;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        try {
        } catch (java.lang.Exception unused) {
            com.inmobi.media.Sb.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Objects.toString(this.c);
            kotlin.Pair b = com.inmobi.media.Yg.b(this.c);
            java.util.Map map = (java.util.Map) b.component1();
            java.util.Map map2 = (java.util.Map) b.component2();
            if (!map.isEmpty()) {
                com.inmobi.media.Xg xg = com.inmobi.media.Xg.f5049a;
                org.json.JSONObject b2 = com.inmobi.media.Yg.b(com.inmobi.media.Yg.a(com.inmobi.media.Yg.d(kotlin.collections.MapsKt.plus(com.inmobi.media.Yg.a(xg.b(), com.inmobi.media.Xg.c()), map), this.d)), this.d);
                if (b2 != null) {
                    org.json.JSONObject jsonObject = com.inmobi.media.Xg.a(xg);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b2, "<this>");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                    java.util.Iterator<java.lang.String> keys = b2.keys();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        jsonObject.put(next, b2.opt(next));
                    }
                    com.inmobi.media.Xg xg2 = com.inmobi.media.Xg.f5049a;
                    this.f5016a = map2;
                    this.b = 1;
                    if (xg2.a(jsonObject, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            signals = map2;
        } else {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            signals = this.f5016a;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!signals.isEmpty()) {
            java.util.Map map3 = com.inmobi.media.Yg.f5067a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signals, "signals");
            java.util.Set keySet = signals.keySet();
            if (!(keySet instanceof java.util.Collection) || !keySet.isEmpty()) {
                java.util.Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (!kotlin.text.StringsKt.startsWith$default((java.lang.String) it.next(), "dir_", false, 2, (java.lang.Object) null)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signals, "signals");
                        java.util.Set keySet2 = signals.keySet();
                        if (!(keySet2 instanceof java.util.Collection) || !keySet2.isEmpty()) {
                            java.util.Iterator it2 = keySet2.iterator();
                            while (it2.hasNext()) {
                                if (!kotlin.text.StringsKt.startsWith$default((java.lang.String) it2.next(), "obj_", false, 2, (java.lang.Object) null)) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signals, "signals");
                                    java.util.Set keySet3 = signals.keySet();
                                    if (!(keySet3 instanceof java.util.Collection) || !keySet3.isEmpty()) {
                                        java.util.Iterator it3 = keySet3.iterator();
                                        while (it3.hasNext()) {
                                            if (!kotlin.text.StringsKt.startsWith$default((java.lang.String) it3.next(), "auto_", false, 2, (java.lang.Object) null)) {
                                                com.inmobi.media.Sb.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to unsupported or mixed keys = " + signals + ". Each call must contain only one type of new flow signals (obj_* or dir_*)");
                                                break;
                                            }
                                        }
                                    }
                                    com.inmobi.media.Xg xg3 = com.inmobi.media.Xg.f5049a;
                                    com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig publisherConfig = this.d;
                                    this.f5016a = null;
                                    this.b = 4;
                                    if (com.inmobi.media.Xg.a(xg3, signals, publisherConfig, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        }
                        com.inmobi.media.Xg xg4 = com.inmobi.media.Xg.f5049a;
                        com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig publisherConfig2 = this.d;
                        this.f5016a = null;
                        this.b = 3;
                        if (com.inmobi.media.Xg.c(xg4, signals, publisherConfig2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
            com.inmobi.media.Xg xg5 = com.inmobi.media.Xg.f5049a;
            com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig publisherConfig3 = this.d;
            this.f5016a = null;
            this.b = 2;
        }
        return kotlin.Unit.INSTANCE;
    }
}
