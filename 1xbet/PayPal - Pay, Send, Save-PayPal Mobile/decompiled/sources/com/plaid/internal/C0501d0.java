package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$clear$2", f = "CrashStorage.kt", i = {}, l = {47, 47}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0501d0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C0537h0 f6390a;
    public java.util.Iterator b;
    public int c;
    public final /* synthetic */ com.plaid.internal.C0537h0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0501d0(com.plaid.internal.C0537h0 c0537h0, kotlin.coroutines.Continuation<? super com.plaid.internal.C0501d0> continuation) {
        super(2, continuation);
        this.d = c0537h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0501d0(this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.C0501d0(this.d, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r6 != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.plaid.internal.C0537h0 c0537h0;
        java.util.Iterator it;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.C0537h0 c0537h02 = this.d;
            this.c = 1;
            obj = c0537h02.f6424a.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.b;
                c0537h0 = this.f6390a;
                kotlin.ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    com.plaid.internal.C0551i5 c0551i5 = c0537h0.f6424a;
                    this.f6390a = c0537h0;
                    this.b = it;
                    this.c = 2;
                    if (c0551i5.a(str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        c0537h0 = this.d;
        it = ((java.lang.Iterable) obj).iterator();
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
