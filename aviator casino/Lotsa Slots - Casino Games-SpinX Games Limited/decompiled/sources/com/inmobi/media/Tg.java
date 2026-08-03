package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Tg extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4978a;

    public Tg(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Tg(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Tg((kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4978a;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.Xg xg = com.inmobi.media.Xg.f5049a;
                xg.getClass();
                android.content.Context context = com.inmobi.media.Xi.f5051a;
                org.json.JSONObject jSONObject = null;
                if (context != null) {
                    xg.getClass();
                    if (com.inmobi.media.Xg.d == null) {
                        com.inmobi.media.Xg.d = new com.inmobi.media.Ig(context, "pub_signals_store");
                    }
                    com.inmobi.media.Ig ig = com.inmobi.media.Xg.d;
                    if (ig == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        ig = null;
                    }
                    java.lang.String a2 = ig.a("saved_signals");
                    if (a2 != null) {
                        jSONObject = new org.json.JSONObject(a2);
                    }
                }
                if (jSONObject == null) {
                    return kotlin.Unit.INSTANCE;
                }
                com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig c = com.inmobi.media.Xg.c();
                org.json.JSONObject a3 = com.inmobi.media.Yg.a(com.inmobi.media.Yg.a(com.inmobi.media.Yg.a(jSONObject, "obj_", c.getObj().getExpiry()), "auto_", c.getAuto().getExpiry()), "dir_", c.getDirect().getExpiry());
                this.f4978a = 1;
                if (xg.a(a3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
        return kotlin.Unit.INSTANCE;
    }
}
