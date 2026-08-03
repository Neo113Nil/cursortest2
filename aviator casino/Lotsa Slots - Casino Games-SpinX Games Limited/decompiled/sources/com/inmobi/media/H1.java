package com.inmobi.media;

/* loaded from: classes5.dex */
public final class H1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.I1 f4735a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(com.inmobi.media.I1 i1, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4735a = i1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.H1(this.f4735a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.H1(this.f4735a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.inmobi.media.I1 i1;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z = 0;
        z = 0;
        try {
            try {
                com.inmobi.media.I1 i12 = this.f4735a;
                i12.c = i12.f4754a.invoke();
                i1 = this.f4735a;
            } catch (java.lang.Exception e) {
                e.getMessage();
                i1 = this.f4735a;
            }
            i1.d.set(false);
            z = kotlin.Unit.INSTANCE;
            return z;
        } catch (java.lang.Throwable th) {
            this.f4735a.d.set(z);
            throw th;
        }
    }
}
