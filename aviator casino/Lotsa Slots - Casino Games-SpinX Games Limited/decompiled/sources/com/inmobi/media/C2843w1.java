package com.inmobi.media;

/* renamed from: com.inmobi.media.w1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2843w1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2894y1 f5519a;
    public final /* synthetic */ com.inmobi.media.C2919z1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2843w1(com.inmobi.media.C2894y1 c2894y1, com.inmobi.media.C2919z1 c2919z1, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f5519a = c2894y1;
        this.b = c2919z1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2843w1(this.f5519a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.C2843w1(this.f5519a, this.b, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        this.f5519a.f5542a.a(this.b);
        return kotlin.Unit.INSTANCE;
    }
}
