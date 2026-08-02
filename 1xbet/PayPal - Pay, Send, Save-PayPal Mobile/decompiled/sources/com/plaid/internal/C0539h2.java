package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel$onActivityReady$1", f = "LinkActivityViewModel.kt", i = {}, l = {64, 65, 70}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0539h2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f6426a;
    public final /* synthetic */ com.plaid.internal.D6 b;
    public final /* synthetic */ com.plaid.internal.C0557j2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0539h2(com.plaid.internal.D6 d6, com.plaid.internal.C0557j2 c0557j2, kotlin.coroutines.Continuation<? super com.plaid.internal.C0539h2> continuation) {
        super(2, continuation);
        this.b = d6;
        this.c = c0557j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0539h2(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.C0539h2(this.b, this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r2.b(r7) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        if (r8.awaitPreload$link_sdk_release(r7) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r2.a(r8, r7) == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6426a;
        com.plaid.internal.InterfaceC0655u2 interfaceC0655u2 = null;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.D6 d6 = this.b;
            if (d6 == null) {
                com.plaid.link.Plaid plaid = com.plaid.link.Plaid.INSTANCE;
                this.f6426a = 1;
            } else {
                if (d6 instanceof com.plaid.internal.D6.e) {
                    return kotlin.Unit.INSTANCE;
                }
                com.plaid.internal.InterfaceC0655u2 interfaceC0655u22 = this.c.c;
                if (interfaceC0655u22 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    interfaceC0655u2 = interfaceC0655u22;
                }
                com.plaid.internal.D6 d62 = this.b;
                this.f6426a = 3;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.plaid.internal.InterfaceC0655u2 interfaceC0655u23 = this.c.c;
        if (interfaceC0655u23 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            interfaceC0655u2 = interfaceC0655u23;
        }
        this.f6426a = 2;
    }
}
