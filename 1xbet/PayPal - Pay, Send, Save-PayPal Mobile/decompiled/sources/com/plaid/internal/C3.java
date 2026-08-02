package com.plaid.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/plaid/internal/C3;", "Landroidx/fragment/app/Fragment;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class C3 extends androidx.fragment.app.Fragment {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.D3 f5761a;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.panes.loading.LoadingFragment$onCreateView$1", f = "LoadingFragment.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5762a;
        public final /* synthetic */ com.plaid.internal.C0614p5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.plaid.internal.C0614p5 c0614p5, kotlin.coroutines.Continuation<? super com.plaid.internal.C3.a> continuation) {
            super(2, continuation);
            this.c = c0614p5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.C3.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.C3.this.new a(this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5762a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.D3 d3 = com.plaid.internal.C3.this.f5761a;
                com.plaid.internal.W4 w4 = null;
                if (d3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    d3 = null;
                }
                this.f5762a = 1;
                com.plaid.internal.W4 w42 = d3.f5768a;
                if (w42 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    w4 = w42;
                }
                obj = w4.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.plaid.internal.S4 s4 = (com.plaid.internal.S4) obj;
            if (s4 != null) {
                this.c.f6531a.setVisibility(s4.f5919a ? 4 : 0);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.KeyEventDispatcher.Component activity = getActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNull(activity, "");
        this.f5761a = (com.plaid.internal.D3) new androidx.view.ViewModelProvider(this, ((com.plaid.internal.w8) activity).b()).get(com.plaid.internal.D3.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.view.View inflate = layoutInflater.inflate(com.plaid.link.R.layout.plaid_loading_fragment, viewGroup, false);
        if (inflate == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
        com.plaid.internal.C0614p5 c0614p5 = new com.plaid.internal.C0614p5(frameLayout);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c0614p5, "");
        com.plaid.internal.D3 d3 = this.f5761a;
        if (d3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            d3 = null;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(d3), null, null, new com.plaid.internal.C3.a(c0614p5, null), 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        return frameLayout;
    }
}
