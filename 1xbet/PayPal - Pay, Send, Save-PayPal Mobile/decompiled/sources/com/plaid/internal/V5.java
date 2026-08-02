package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$onBridgeReadyOnce$job$1", f = "PlaidWebview.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class V5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f5954a;
    public final /* synthetic */ com.plaid.internal.P5 b;
    public final /* synthetic */ com.plaid.internal.C0543h6.a c;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$onBridgeReadyOnce$job$1$1", f = "PlaidWebview.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f5955a;

        public a(kotlin.coroutines.Continuation<? super com.plaid.internal.V5.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.plaid.internal.V5.a aVar = new com.plaid.internal.V5.a(continuation);
            aVar.f5955a = ((java.lang.Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            com.plaid.internal.V5.a aVar = new com.plaid.internal.V5.a(continuation);
            aVar.f5955a = bool.booleanValue();
            return aVar.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.f5955a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5(com.plaid.internal.P5 p5, com.plaid.internal.C0543h6.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = p5;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.V5(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.V5(this.b, this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5954a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> stateFlow = this.b.b.d;
            com.plaid.internal.V5.a aVar = new com.plaid.internal.V5.a(null);
            this.f5954a = 1;
            if (kotlinx.coroutines.flow.FlowKt.first(stateFlow, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!this.b.f.get()) {
            this.c.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }
}
