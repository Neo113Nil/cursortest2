package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$2", f = "WebviewViewModel.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class R7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f5913a;
    public final /* synthetic */ com.plaid.internal.U7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R7(com.plaid.internal.U7 u7, kotlin.coroutines.Continuation<? super com.plaid.internal.R7> continuation) {
        super(2, continuation);
        this.b = u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.R7(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.R7(this.b, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5913a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.InterfaceC0677w6 interfaceC0677w6 = this.b.i;
            if (interfaceC0677w6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                interfaceC0677w6 = null;
            }
            this.f5913a = 1;
            obj = interfaceC0677w6.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.plaid.internal.A a2 = (com.plaid.internal.A) obj;
        if (a2 == null) {
            com.plaid.internal.C0452a6.a.e(com.plaid.internal.C0452a6.f5996a, "No Out Of Process Polling Info Available");
            return kotlin.Unit.INSTANCE;
        }
        com.plaid.internal.F f = this.b.j;
        if (f == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            f = null;
        }
        kotlinx.coroutines.CoroutineScope viewModelScope = androidx.view.ViewModelKt.getViewModelScope(this.b);
        com.plaid.internal.T7 t7 = this.b.r;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t7, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(viewModelScope, null, null, new com.plaid.internal.D(f, a2, t7, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }
}
