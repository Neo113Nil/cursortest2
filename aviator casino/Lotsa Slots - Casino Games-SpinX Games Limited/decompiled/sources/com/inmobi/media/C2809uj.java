package com.inmobi.media;

/* renamed from: com.inmobi.media.uj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2809uj extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public kotlinx.coroutines.sync.Mutex f5491a;
    public com.inmobi.media.AbstractC2861wj b;
    public com.inmobi.media.InterfaceC2782tj c;
    public com.inmobi.media.InterfaceC2782tj d;
    public int e;
    public final /* synthetic */ com.inmobi.media.AbstractC2861wj f;
    public final /* synthetic */ com.inmobi.media.InterfaceC2782tj g;
    public final /* synthetic */ com.inmobi.media.InterfaceC2782tj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2809uj(com.inmobi.media.AbstractC2861wj abstractC2861wj, com.inmobi.media.InterfaceC2782tj interfaceC2782tj, com.inmobi.media.InterfaceC2782tj interfaceC2782tj2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f = abstractC2861wj;
        this.g = interfaceC2782tj;
        this.h = interfaceC2782tj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2809uj(this.f, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2809uj) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj;
        com.inmobi.media.AbstractC2861wj abstractC2861wj;
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.AbstractC2861wj abstractC2861wj2 = this.f;
            mutex = abstractC2861wj2.b;
            interfaceC2782tj = this.g;
            com.inmobi.media.InterfaceC2782tj interfaceC2782tj3 = this.h;
            this.f5491a = mutex;
            this.b = abstractC2861wj2;
            this.c = interfaceC2782tj;
            this.d = interfaceC2782tj3;
            this.e = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            abstractC2861wj = abstractC2861wj2;
            interfaceC2782tj2 = interfaceC2782tj3;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2782tj2 = this.d;
            interfaceC2782tj = this.c;
            abstractC2861wj = this.b;
            mutex = this.f5491a;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            abstractC2861wj.b(interfaceC2782tj, interfaceC2782tj2);
            return kotlin.Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
