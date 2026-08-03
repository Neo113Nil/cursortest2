package com.inmobi.media;

/* renamed from: com.inmobi.media.l6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2556l6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2478i6 f5310a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ com.inmobi.media.C2662p6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2556l6(com.inmobi.media.C2478i6 c2478i6, boolean z, com.inmobi.media.C2662p6 c2662p6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5310a = c2478i6;
        this.b = z;
        this.c = c2662p6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2556l6(this.f5310a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2556l6) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.Unit.INSTANCE;
    }
}
