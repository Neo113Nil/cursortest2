package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Gh extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4727a;
    public final /* synthetic */ java.util.List b;
    public final /* synthetic */ com.inmobi.media.Kh c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ com.inmobi.media.core.config.models.RootConfig e;
    public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gh(java.util.List list, com.inmobi.media.Kh kh, java.lang.String str, com.inmobi.media.core.config.models.RootConfig rootConfig, kotlinx.coroutines.channels.ProducerScope producerScope, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = kh;
        this.d = str;
        this.e = rootConfig;
        this.f = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Gh gh = new com.inmobi.media.Gh(this.b, this.c, this.d, this.e, this.f, continuation);
        gh.f4727a = obj;
        return gh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Gh) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.f4727a;
        java.util.List list = this.b;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : list) {
            java.lang.String str = ((com.inmobi.media.C2687q4) obj2).f5405a;
            java.lang.Object obj3 = linkedHashMap.get(str);
            if (obj3 == null) {
                obj3 = new java.util.ArrayList();
                linkedHashMap.put(str, obj3);
            }
            ((java.util.List) obj3).add(obj2);
        }
        com.inmobi.media.Kh kh = this.c;
        java.lang.String str2 = this.d;
        com.inmobi.media.core.config.models.RootConfig rootConfig = this.e;
        kotlinx.coroutines.channels.ProducerScope producerScope = this.f;
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.inmobi.media.Fh(kh, (java.lang.String) entry.getKey(), str2, rootConfig, (java.util.List) entry.getValue(), producerScope, null), 3, null);
            rootConfig = rootConfig;
            producerScope = producerScope;
            str2 = str2;
        }
        return kotlin.Unit.INSTANCE;
    }
}
