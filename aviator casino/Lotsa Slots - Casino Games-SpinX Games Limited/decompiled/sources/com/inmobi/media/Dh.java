package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Dh extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f4664a;
    public kotlin.jvm.internal.Ref.ObjectRef b;
    public int c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.inmobi.media.Eh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dh(com.inmobi.media.Eh eh, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.e = eh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Dh dh = new com.inmobi.media.Dh(this.e, continuation);
        dh.d = obj;
        return dh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.Dh dh = new com.inmobi.media.Dh(this.e, (kotlin.coroutines.Continuation) obj2);
        dh.d = (kotlinx.coroutines.flow.FlowCollector) obj;
        return dh.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        java.lang.String str;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.d;
            str = com.inmobi.media.Xi.c;
            if (str == null) {
                return kotlin.Unit.INSTANCE;
            }
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef.element = com.inmobi.media.Eh.a(this.e);
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = this.b;
            str = this.f4664a;
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String accountId = str;
        kotlinx.coroutines.flow.FlowCollector flowCollector2 = flowCollector;
        while (!((java.util.Collection) objectRef.element).isEmpty()) {
            java.util.List configRequestContexts = (java.util.List) objectRef.element;
            objectRef.element = kotlin.collections.CollectionsKt.emptyList();
            com.inmobi.media.Kh kh = (com.inmobi.media.Kh) this.e.b.getValue();
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
            com.inmobi.media.core.config.models.RootConfig rootConfig = (com.inmobi.media.core.config.models.RootConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.RootConfig.class);
            kh.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "accountId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootConfig, "rootConfig");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configRequestContexts, "configRequestContexts");
            kotlinx.coroutines.flow.Flow channelFlow = kotlinx.coroutines.flow.FlowKt.channelFlow(new com.inmobi.media.Hh(configRequestContexts, kh, accountId, rootConfig, null));
            com.inmobi.media.Ch ch = new com.inmobi.media.Ch(this.e, flowCollector2, objectRef);
            this.d = flowCollector2;
            this.f4664a = accountId;
            this.b = objectRef;
            this.c = 1;
            if (channelFlow.collect(ch, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
