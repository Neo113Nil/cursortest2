package com.inmobi.media;

/* renamed from: com.inmobi.media.rc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2720rc extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2775tc f5425a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2720rc(com.inmobi.media.C2775tc c2775tc, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5425a = c2775tc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2720rc(this.f5425a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2720rc(this.f5425a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2799u9 c2799u9 = this.f5425a.f5464a;
        if (c2799u9 != null) {
            c2799u9.a("MediaViewManager", "destroy called");
        }
        com.inmobi.media.AbstractC2525k2 abstractC2525k2 = this.f5425a.b;
        if (abstractC2525k2 != null) {
            abstractC2525k2.a();
        }
        this.f5425a.b = null;
        return kotlin.Unit.INSTANCE;
    }
}
