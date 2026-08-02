package com.plaid.internal;

/* loaded from: classes16.dex */
public final class Q5<T> implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f5899a;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$notifyWebViewShown$$inlined$filter$1$2", f = "PlaidWebview.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ java.lang.Object f5900a;
        public int b;

        public a(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f5900a = obj;
            this.b |= Integer.MIN_VALUE;
            return com.plaid.internal.Q5.this.emit(null, this);
        }
    }

    public Q5(kotlinx.coroutines.flow.FlowCollector flowCollector) {
        this.f5899a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.plaid.internal.Q5.a aVar;
        int i;
        if (continuation instanceof com.plaid.internal.Q5.a) {
            aVar = (com.plaid.internal.Q5.a) continuation;
            int i2 = aVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.b = i2 - 2147483648;
                java.lang.Object obj2 = aVar.f5900a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.f5899a;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        aVar.b = 1;
                        if (flowCollector.emit(obj, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        aVar = new com.plaid.internal.Q5.a(continuation);
        java.lang.Object obj22 = aVar.f5900a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.b;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
