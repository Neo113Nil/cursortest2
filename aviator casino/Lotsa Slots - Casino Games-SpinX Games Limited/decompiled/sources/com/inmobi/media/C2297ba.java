package com.inmobi.media;

/* renamed from: com.inmobi.media.ba, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2297ba extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5120a;
    public final /* synthetic */ com.inmobi.media.C2324ca b;
    public final /* synthetic */ java.util.ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2297ba(com.inmobi.media.C2324ca c2324ca, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2324ca;
        this.c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2297ba(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2297ba(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.inmobi.media.C2351da c2351da;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5120a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Fb fb = (com.inmobi.media.Fb) com.inmobi.media.Gb.f4724a.getValue();
            this.f5120a = 1;
            obj = fb.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.ArrayList arrayList = this.c;
        for (com.inmobi.media.C2904yb c2904yb : (java.lang.Iterable) obj) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.inmobi.media.Ub.f4994a;
            if (!com.inmobi.media.Tb.a(c2904yb.f5568a)) {
                java.lang.String b = com.inmobi.media.AbstractC2299bc.b(c2904yb.f5568a);
                if (b != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(b);
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("vitals");
                    org.json.JSONArray jSONArray = jSONObject.getJSONArray("log");
                    kotlin.jvm.internal.Intrinsics.checkNotNull(jSONObject2);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(jSONArray);
                    c2351da = new com.inmobi.media.C2351da(jSONObject2, jSONArray, c2904yb);
                } else {
                    c2351da = null;
                }
                if (c2351da != null) {
                    arrayList.add(c2351da);
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
