package com.plaid.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/plaid/internal/k1;", "Lcom/plaid/internal/p8;", "Lcom/plaid/internal/l1;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.plaid.internal.k1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0565k1 extends com.plaid.internal.p8<com.plaid.internal.C0574l1> {
    public static final /* synthetic */ int e = 0;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthFragment$onCreate$1", f = "HeadlessOAuthFragment.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.k1$a */
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6457a;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthFragment$onCreate$1$1", f = "HeadlessOAuthFragment.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.plaid.internal.k1$a$a, reason: collision with other inner class name */
        public static final class C0195a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f6458a;
            public final /* synthetic */ com.plaid.internal.C0565k1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0195a(com.plaid.internal.C0565k1 c0565k1, kotlin.coroutines.Continuation<? super com.plaid.internal.C0565k1.a.C0195a> continuation) {
                super(2, continuation);
                this.b = c0565k1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.plaid.internal.C0565k1.a.C0195a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return new com.plaid.internal.C0565k1.a.C0195a(this.b, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f6458a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.C0565k1 c0565k1 = this.b;
                    int i2 = com.plaid.internal.C0565k1.e;
                    java.lang.Object obj2 = c0565k1.b;
                    if (obj2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        obj2 = null;
                    }
                    this.f6458a = 1;
                    if (((com.plaid.internal.C0574l1) obj2).a(this) == coroutine_suspended) {
                        return coroutine_suspended;
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

        public a(kotlin.coroutines.Continuation<? super com.plaid.internal.C0565k1.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.C0565k1.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.C0565k1.this.new a(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6457a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.C0565k1 c0565k1 = com.plaid.internal.C0565k1.this;
                androidx.lifecycle.Lifecycle.State state = androidx.lifecycle.Lifecycle.State.STARTED;
                com.plaid.internal.C0565k1.a.C0195a c0195a = new com.plaid.internal.C0565k1.a.C0195a(c0565k1, null);
                this.f6457a = 1;
                if (androidx.view.RepeatOnLifecycleKt.repeatOnLifecycle(c0565k1, state, c0195a, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    @Override // com.plaid.internal.p8
    public final com.plaid.internal.C0574l1 a(com.plaid.internal.r8 r8Var, com.plaid.internal.J4 j4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j4, "");
        return new com.plaid.internal.C0574l1(r8Var, j4);
    }

    @Override // com.plaid.internal.p8, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.LifecycleOwnerKt.getLifecycleScope(this), null, null, new com.plaid.internal.C0565k1.a(null), 3, null);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "");
        return null;
    }
}
