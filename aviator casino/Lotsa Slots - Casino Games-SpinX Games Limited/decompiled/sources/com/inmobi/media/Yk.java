package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Yk extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f5070a;
    public final /* synthetic */ com.inmobi.media.core.config.models.SignalsConfig.UnifiedIdServiceConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yk(com.inmobi.media.core.config.models.SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.b = unifiedIdServiceConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Yk(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.Yk(this.b, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        if (r2.a(r4, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e2, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e0, code lost:
    
        if (r1.a(r3, r13, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r13 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5070a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String url = this.b.getUrl();
            com.inmobi.media.C2935zh c2935zh = com.inmobi.media.AbstractC2676pj.f5394a;
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
            com.inmobi.media.Te a2 = new com.inmobi.media.C2467hl(url, new com.inmobi.media.Rk(((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getIncludeIds()), com.inmobi.media.Xi.c, this.b.getMaxRetries(), this.b.getRetryInterval(), this.b.getTimeout()).a();
            java.util.HashMap hashMap = new java.util.HashMap();
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("UnifiedIdNetworkCallRequested", hashMap, com.inmobi.media.EnumC2728rk.f5431a);
            kotlinx.coroutines.Deferred a3 = ((com.inmobi.media.B9) com.inmobi.media.Pe.i.getValue()).a(a2);
            com.inmobi.media.C2282al.d = a3;
            this.f5070a = 1;
            obj = a3.await(this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.inmobi.media.Ve ve = (com.inmobi.media.Ve) obj;
        java.util.Objects.toString(ve);
        kotlin.ranges.IntRange intRange = com.inmobi.media.AbstractC2276af.f5103a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ve, "<this>");
        okio.ByteString d = ve.d();
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        d.string(charset);
        com.inmobi.media.C2282al c2282al = com.inmobi.media.C2282al.f5108a;
        com.inmobi.media.C2282al.e = new com.inmobi.media.C2362dl(ve, com.inmobi.media.C2282al.c);
        if (com.inmobi.media.AbstractC2889xl.a(ve)) {
            com.inmobi.media.C2362dl c2362dl = com.inmobi.media.C2282al.e;
            if (c2362dl != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ve, "<this>");
                org.json.JSONObject jSONObject = new org.json.JSONObject(ve.d().string(charset));
                this.f5070a = 2;
            }
            return kotlin.Unit.INSTANCE;
        }
        com.inmobi.media.C2362dl c2362dl2 = com.inmobi.media.C2282al.e;
        if (c2362dl2 != null) {
            int c = ve.c();
            java.lang.String e = ve.e();
            this.f5070a = 3;
        }
        return kotlin.Unit.INSTANCE;
    }
}
