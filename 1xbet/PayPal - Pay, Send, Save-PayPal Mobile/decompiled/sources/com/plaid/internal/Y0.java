package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.network.ExponentialBackoffRetry$doNetworkCallWithRetries$2", f = "ExponentialBackoffRetry.kt", i = {}, l = {32, 33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class Y0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.Ref.ObjectRef f5977a;
    public int b;
    public final /* synthetic */ kotlin.jvm.internal.Ref.IntRef c;
    public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.plaid.internal.AbstractC0550i4<java.lang.Object, java.lang.Object>> d;
    public final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.plaid.internal.AbstractC0550i4<java.lang.Object, ? extends java.lang.Object>>, java.lang.Object> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Y0(kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.ObjectRef<com.plaid.internal.AbstractC0550i4<java.lang.Object, java.lang.Object>> objectRef, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.plaid.internal.AbstractC0550i4<java.lang.Object, ? extends java.lang.Object>>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super com.plaid.internal.Y0> continuation) {
        super(2, continuation);
        this.c = intRef;
        this.d = objectRef;
        this.e = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.Y0(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.plaid.internal.Y0) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r8) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007d -> B:6:0x0080). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.ObjectRef<com.plaid.internal.AbstractC0550i4<java.lang.Object, java.lang.Object>> objectRef;
        com.plaid.internal.AbstractC0550i4<java.lang.Object, java.lang.Object> abstractC0550i4;
        T t;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.c.element < 4) {
                abstractC0550i4 = this.d.element;
                if (abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.a) {
                }
                long pow = ((long) java.lang.Math.pow(2.0d, this.c.element)) * 1000;
                long min = java.lang.Math.min(kotlin.random.Random.INSTANCE.nextLong(0L, pow) + pow, 32000L);
                this.f5977a = null;
                this.b = 1;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = this.f5977a;
            kotlin.ResultKt.throwOnFailure(obj);
            t = obj;
            objectRef.element = t;
            this.c.element++;
            if (this.c.element < 4 && this.d.element.a()) {
                abstractC0550i4 = this.d.element;
                if ((abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.a) || ((com.plaid.internal.AbstractC0550i4.a) abstractC0550i4).b != 400) {
                    long pow2 = ((long) java.lang.Math.pow(2.0d, this.c.element)) * 1000;
                    long min2 = java.lang.Math.min(kotlin.random.Random.INSTANCE.nextLong(0L, pow2) + pow2, 32000L);
                    this.f5977a = null;
                    this.b = 1;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        objectRef = this.d;
        kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.plaid.internal.AbstractC0550i4<java.lang.Object, ? extends java.lang.Object>>, java.lang.Object> function1 = this.e;
        this.f5977a = objectRef;
        this.b = 2;
        java.lang.Object invoke = function1.invoke(this);
        t = invoke;
    }
}
