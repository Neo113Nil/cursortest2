package com.plaid.internal;

/* loaded from: classes16.dex */
public final class T7 extends com.plaid.internal.G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.U7 f5927a;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$linkResultCallback$1$onRequestSilentNetworkAuth$1", f = "WebviewViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5928a;
        public final /* synthetic */ com.plaid.internal.AbstractC0544h7 b;
        public final /* synthetic */ com.plaid.internal.U7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.plaid.internal.AbstractC0544h7 abstractC0544h7, com.plaid.internal.U7 u7, kotlin.coroutines.Continuation<? super com.plaid.internal.T7.a> continuation) {
            super(2, continuation);
            this.b = abstractC0544h7;
            this.c = u7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.plaid.internal.T7.a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new com.plaid.internal.T7.a(this.b, this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5928a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.AbstractC0544h7 abstractC0544h7 = this.b;
                com.plaid.internal.C0651t7 c0651t7 = null;
                com.plaid.internal.C0632r6 c0632r6 = null;
                if (abstractC0544h7 instanceof com.plaid.internal.C0650t6) {
                    com.plaid.internal.C0632r6 c0632r62 = this.c.f5942o;
                    if (c0632r62 != null) {
                        c0632r6 = c0632r62;
                    } else {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    c0632r6.a((com.plaid.internal.C0650t6) this.b);
                } else if (abstractC0544h7 instanceof com.plaid.internal.C0660u7) {
                    com.plaid.internal.C0651t7 c0651t72 = this.c.k;
                    if (c0651t72 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        c0651t7 = c0651t72;
                    }
                    com.plaid.internal.C0660u7 c0660u7 = (com.plaid.internal.C0660u7) this.b;
                    this.f5928a = 1;
                    if (c0651t7.a(c0660u7, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public T7(com.plaid.internal.U7 u7) {
        this.f5927a = u7;
    }

    @Override // com.plaid.internal.G
    public final void a(com.plaid.internal.AbstractC0544h7 abstractC0544h7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractC0544h7, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this.f5927a), kotlinx.coroutines.Dispatchers.getIO(), null, new com.plaid.internal.T7.a(abstractC0544h7, this.f5927a, null), 2, null);
    }
}
