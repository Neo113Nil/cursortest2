package com.plaid.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/plaid/internal/P7;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class P7 extends androidx.fragment.app.Fragment {
    public static final /* synthetic */ int l = 0;

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.Z5 f5884a;
    public com.plaid.internal.P5 b;
    public com.plaid.internal.U7 c;
    public com.plaid.internal.C0661v d;
    public final kotlin.Lazy e = kotlin.LazyKt.lazy(new com.plaid.internal.P7.a());
    public kotlin.jvm.internal.Lambda f = com.plaid.internal.P7.f.f5891a;
    public kotlin.jvm.functions.Function0<kotlin.Unit> g = com.plaid.internal.P7.e.f5890a;
    public final androidx.view.result.ActivityResultLauncher<java.lang.String> h;
    public final androidx.view.result.ActivityResultLauncher<java.lang.String> i;
    public androidx.view.result.ActivityResultLauncher<kotlin.Unit> j;
    public final com.plaid.internal.P7.g k;

    public static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.plaid.internal.C0551i5> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.plaid.internal.C0551i5 invoke() {
            com.plaid.internal.U7 u7 = com.plaid.internal.P7.this.c;
            if (u7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                u7 = null;
            }
            com.plaid.internal.C0551i5 c0551i5 = u7.d;
            if (c0551i5 != null) {
                return c0551i5;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$2", f = "WebviewFragment.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5886a;

        public b(kotlin.coroutines.Continuation<? super com.plaid.internal.P7.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.P7.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.P7.this.new b(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5886a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.P5 p5 = com.plaid.internal.P7.this.b;
                if (p5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    p5 = null;
                }
                this.f5886a = 1;
                java.lang.Object collect = p5.b.d.collect(new com.plaid.internal.Q5(new com.plaid.internal.T5(p5)), this);
                if (collect != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    collect = kotlin.Unit.INSTANCE;
                }
                if (collect != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    collect = kotlin.Unit.INSTANCE;
                }
                if (collect == coroutine_suspended) {
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$4", f = "WebviewFragment.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5887a;

        public c(kotlin.coroutines.Continuation<? super com.plaid.internal.P7.c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.P7.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.P7.this.new c(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5887a;
            com.plaid.internal.Z5 z5 = null;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.U7 u7 = com.plaid.internal.P7.this.c;
                if (u7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    u7 = null;
                }
                this.f5887a = 1;
                com.plaid.internal.A6 a6 = u7.f;
                if (a6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    a6 = null;
                }
                obj = a6.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                com.plaid.internal.Z5 z52 = com.plaid.internal.P7.this.f5884a;
                if (z52 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    z52 = null;
                }
                z52.f5988a.setBackground(androidx.core.content.ContextCompat.getDrawable(com.plaid.internal.P7.this.requireContext(), com.plaid.link.R.drawable.plaid_transparent_webview_animation));
                com.plaid.internal.Z5 z53 = com.plaid.internal.P7.this.f5884a;
                if (z53 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    z5 = z53;
                }
                android.graphics.drawable.Drawable background = z5.f5988a.getBackground();
                kotlin.jvm.internal.Intrinsics.checkNotNull(background, "");
                android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) background;
                animationDrawable.setOneShot(true);
                animationDrawable.start();
            } else {
                com.plaid.internal.Z5 z54 = com.plaid.internal.P7.this.f5884a;
                if (z54 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    z5 = z54;
                }
                z5.f5988a.setBackgroundColor(-1);
                androidx.fragment.app.FragmentActivity activity = com.plaid.internal.P7.this.getActivity();
                if (activity != null) {
                    com.plaid.internal.C0598n7.a(activity);
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$5", f = "WebviewFragment.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes16.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5888a;

        public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.plaid.internal.P7 f5889a;

            public a(com.plaid.internal.P7 p7) {
                this.f5889a = p7;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                java.lang.String str = (java.lang.String) obj;
                com.plaid.internal.P5 p5 = this.f5889a.b;
                com.plaid.internal.P5 p52 = null;
                if (p5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    p5 = null;
                }
                if (!p5.f.get()) {
                    com.plaid.internal.U7 u7 = this.f5889a.c;
                    if (u7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        u7 = null;
                    }
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(u7), null, null, new com.plaid.internal.W7(u7, null), 3, null);
                    com.plaid.internal.P5 p53 = this.f5889a.b;
                    if (p53 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        p53 = null;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(p53.getUrl(), str)) {
                        com.plaid.internal.P5 p54 = this.f5889a.b;
                        if (p54 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        } else {
                            p52 = p54;
                        }
                        p52.loadUrl(str);
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        public d(kotlin.coroutines.Continuation<? super com.plaid.internal.P7.d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.P7.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.P7.this.new d(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5888a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.U7 u7 = com.plaid.internal.P7.this.c;
                if (u7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    u7 = null;
                }
                kotlinx.coroutines.flow.SharedFlow asSharedFlow = kotlinx.coroutines.flow.FlowKt.asSharedFlow(u7.m);
                com.plaid.internal.P7.d.a aVar = new com.plaid.internal.P7.d.a(com.plaid.internal.P7.this);
                this.f5888a = 1;
                if (asSharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new kotlin.KotlinNothingValueException();
        }
    }

    public static final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.P7.e f5890a = new com.plaid.internal.P7.e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class f extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.P7.f f5891a = new com.plaid.internal.P7.f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            return kotlin.Unit.INSTANCE;
        }
    }

    public P7() {
        androidx.view.result.ActivityResultLauncher<java.lang.String> registerForActivityResult = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.RequestPermission(), new androidx.view.result.ActivityResultCallback() { // from class: com.plaid.internal.P7$$ExternalSyntheticLambda0
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                com.plaid.internal.P7.a(com.plaid.internal.P7.this, (java.lang.Boolean) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "");
        this.h = registerForActivityResult;
        androidx.view.result.ActivityResultLauncher<java.lang.String> registerForActivityResult2 = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents(), new androidx.view.result.ActivityResultCallback() { // from class: com.plaid.internal.P7$$ExternalSyntheticLambda1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                com.plaid.internal.P7.a(com.plaid.internal.P7.this, (java.util.List) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "");
        this.i = registerForActivityResult2;
        this.k = new com.plaid.internal.P7.g();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.KeyEventDispatcher.Component activity = getActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNull(activity, "");
        this.c = (com.plaid.internal.U7) new androidx.view.ViewModelProvider(this, ((com.plaid.internal.w8) activity).a()).get(com.plaid.internal.U7.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.os.Bundle arguments = getArguments();
        com.plaid.internal.Z5 z5 = null;
        com.plaid.internal.EnumC0508d7 enumC0508d7 = (com.plaid.internal.EnumC0508d7) (arguments != null ? arguments.get("smsAutofillType") : null);
        com.plaid.internal.P7.g gVar = this.k;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "");
        com.plaid.internal.C0661v c0526f7 = (enumC0508d7 != null && com.plaid.internal.C0652u.f6585a[enumC0508d7.ordinal()] == 1) ? new com.plaid.internal.C0526f7(gVar) : new com.plaid.internal.C0661v();
        this.d = c0526f7;
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        c0526f7.a(requireContext);
        android.view.View inflate = layoutInflater.inflate(com.plaid.link.R.layout.plaid_webview_fragment, viewGroup, false);
        if (inflate == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
        com.plaid.internal.Z5 z52 = new com.plaid.internal.Z5(frameLayout, frameLayout);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(z52, "");
        this.f5884a = z52;
        androidx.view.result.ActivityResultLauncher<kotlin.Unit> registerForActivityResult = registerForActivityResult(new com.plaid.internal.C0589m7((com.plaid.internal.C0551i5) this.e.getValue()), new androidx.view.result.ActivityResultCallback() { // from class: com.plaid.internal.P7$$ExternalSyntheticLambda2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                com.plaid.internal.P7.a(com.plaid.internal.P7.this, (android.net.Uri) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "");
        this.j = registerForActivityResult;
        com.plaid.internal.U7 u7 = this.c;
        if (u7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            u7 = null;
        }
        com.plaid.internal.N5 n5 = u7.h;
        if (n5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            n5 = null;
        }
        com.plaid.internal.P5 c2 = n5.c();
        this.b = c2;
        android.content.Context requireContext2 = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext2, "");
        com.plaid.internal.U7 u72 = this.c;
        if (u72 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            u72 = null;
        }
        com.plaid.internal.U7 u73 = this.c;
        if (u73 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            u73 = null;
        }
        androidx.view.result.ActivityResultLauncher<java.lang.String> activityResultLauncher = this.i;
        androidx.view.result.ActivityResultLauncher<kotlin.Unit> activityResultLauncher2 = this.j;
        if (activityResultLauncher2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            activityResultLauncher2 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requireContext2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u72, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u73, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "");
        android.content.Context context = c2.getContext();
        if (context instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) context).setBaseContext(com.plaid.internal.P5.a.a(requireContext2));
        }
        c2.c = u73;
        com.plaid.internal.C0505d4 c0505d4 = c2.f5879a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u72, "");
        c0505d4.f6392a = u72;
        c2.setWebChromeClient(new com.plaid.internal.R4(activityResultLauncher, activityResultLauncher2, u73, this));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.LifecycleOwnerKt.getLifecycleScope(this), null, null, new com.plaid.internal.P7.b(null), 3, null);
        com.plaid.internal.Z5 z53 = this.f5884a;
        if (z53 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            z53 = null;
        }
        android.widget.FrameLayout frameLayout2 = z53.b;
        com.plaid.internal.P5 p5 = this.b;
        if (p5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            p5 = null;
        }
        frameLayout2.addView(p5);
        com.plaid.internal.Z5 z54 = this.f5884a;
        if (z54 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            z54 = null;
        }
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(z54.b, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.plaid.internal.P7$$ExternalSyntheticLambda3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                return com.plaid.internal.P7.a(com.plaid.internal.P7.this, view, windowInsetsCompat);
            }
        });
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.LifecycleOwnerKt.getLifecycleScope(this), null, null, new com.plaid.internal.P7.c(null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.LifecycleOwnerKt.getLifecycleScope(this), null, null, new com.plaid.internal.P7.d(null), 3, null);
        com.plaid.internal.Z5 z55 = this.f5884a;
        if (z55 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            z5 = z55;
        }
        android.widget.FrameLayout frameLayout3 = z5.f5988a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
        return frameLayout3;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.plaid.internal.P5 p5 = this.b;
        com.plaid.internal.C0661v c0661v = null;
        if (p5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            p5 = null;
        }
        if (!p5.f.getAndSet(true)) {
            com.plaid.internal.Z5 z5 = this.f5884a;
            if (z5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                z5 = null;
            }
            z5.f5988a.setBackground(androidx.core.content.ContextCompat.getDrawable(requireContext(), com.plaid.link.R.drawable.plaid_transparent_webview_animation_fade_out));
            com.plaid.internal.Z5 z52 = this.f5884a;
            if (z52 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                z52 = null;
            }
            if (z52.f5988a.getBackground() instanceof android.graphics.drawable.AnimationDrawable) {
                com.plaid.internal.Z5 z53 = this.f5884a;
                if (z53 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    z53 = null;
                }
                android.graphics.drawable.Drawable background = z53.f5988a.getBackground();
                kotlin.jvm.internal.Intrinsics.checkNotNull(background, "");
                android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) background;
                animationDrawable.setOneShot(true);
                animationDrawable.start();
            }
            com.plaid.internal.Z5 z54 = this.f5884a;
            if (z54 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                z54 = null;
            }
            android.widget.FrameLayout frameLayout = z54.b;
            com.plaid.internal.P5 p52 = this.b;
            if (p52 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                p52 = null;
            }
            frameLayout.removeView(p52);
            com.plaid.internal.P5 p53 = this.b;
            if (p53 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                p53 = null;
            }
            p53.destroy();
        }
        com.plaid.internal.C0661v c0661v2 = this.d;
        if (c0661v2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            c0661v = c0661v2;
        }
        c0661v.b(getContext());
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public static final void a(com.plaid.internal.P7 p7, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        if (bool.booleanValue()) {
            p7.f.invoke();
        } else {
            android.widget.Toast.makeText(p7.getContext(), p7.getResources().getString(com.plaid.link.R.string.grant_camera_permission_to_continue), 0).show();
            p7.g.invoke();
        }
    }

    public static final void a(com.plaid.internal.P7 p7, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "");
        com.plaid.internal.U7 u7 = p7.c;
        if (u7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            u7 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        u7.a(list);
    }

    public static final void a(com.plaid.internal.P7 p7, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "");
        com.plaid.internal.U7 u7 = p7.c;
        if (u7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            u7 = null;
        }
        u7.a(kotlin.collections.CollectionsKt.listOf(uri));
    }

    public static final androidx.core.view.WindowInsetsCompat a(com.plaid.internal.P7 p7, android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insets, "");
        if (p7.requireContext().getApplicationInfo().targetSdkVersion >= 35) {
            view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        } else {
            view.setPadding(insets.left, insets.top, insets.right, 0);
        }
        return androidx.core.view.WindowInsetsCompat.CONSUMED;
    }

    public static final class g implements com.plaid.internal.InterfaceC0517e7 {
        public g() {
        }

        @Override // com.plaid.internal.InterfaceC0517e7
        public final void a(java.lang.String str) {
            final java.lang.String str2;
            java.lang.String value;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.plaid.internal.P5 p5 = null;
            kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(new kotlin.text.Regex("[:]\\s?[\\d]{4,8}\\s?[.]?"), str, 0, 2, null);
            if (find$default != null && find$default.getValue().length() < 7) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("No OTP code found in SMS message.", "");
                com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "No OTP code found in SMS message.");
                com.plaid.internal.J5 j5 = com.plaid.internal.Y6.f5982a;
                if (j5 != null) {
                    j5.a("No OTP code found in SMS message.");
                    return;
                }
                return;
            }
            if (find$default == null || (value = find$default.getValue()) == null) {
                str2 = null;
            } else {
                str2 = value.substring(2, find$default.getValue().length() - 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
            }
            com.plaid.internal.P5 p52 = com.plaid.internal.P7.this.b;
            if (p52 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                p5 = p52;
            }
            final com.plaid.internal.P7 p7 = com.plaid.internal.P7.this;
            p5.post(new java.lang.Runnable() { // from class: com.plaid.internal.P7$g$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.plaid.internal.P7.g.a(com.plaid.internal.P7.this, str2);
                }
            });
        }

        public static final void a(com.plaid.internal.P7 p7, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "");
            com.plaid.internal.P5 p5 = p7.b;
            if (p5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                p5 = null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("javascript:window.SdkJsBridge.send('{\"message_type\": \"rm-otp-code-input\", \"data\": {\"otpCode\": \"");
            sb.append(str);
            sb.append("\"}}')");
            p5.loadUrl(sb.toString());
            com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "JSBridge - sent rm-otp-code-input");
        }

        @Override // com.plaid.internal.InterfaceC0517e7
        public final void a() {
            com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
            com.plaid.internal.C0452a6.a.a("OTP TimeOut", true);
        }
    }

    public final boolean a() {
        return androidx.core.content.PermissionChecker.checkSelfPermission(requireContext(), "android.permission.CAMERA") == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.f = (kotlin.jvm.internal.Lambda) function0;
        this.g = function02;
        this.h.launch("android.permission.CAMERA");
    }
}
