package com.plaid.internal;

/* loaded from: classes16.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.link.configuration.LinkTokenConfiguration f5893a;
    public final androidx.view.result.ActivityResultLauncher<com.plaid.link.configuration.LinkTokenConfiguration> b;
    public final kotlin.jvm.functions.Function1<com.plaid.link.configuration.LinkTokenConfiguration, kotlin.Unit> c;
    public final kotlin.jvm.functions.Function1<com.plaid.link.result.LinkExit, kotlin.Unit> d;
    public final com.plaid.internal.P0 e;
    public final com.plaid.internal.C0691y2 f;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.views.EmbeddedViewHandler$loadWebviewFromLinkToken$1", f = "EmbeddedViewHandler.kt", i = {}, l = {78, 79}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5895a;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.views.EmbeddedViewHandler$loadWebviewFromLinkToken$1$1", f = "EmbeddedViewHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ java.lang.Object f5896a;
            public final /* synthetic */ com.plaid.internal.Q0 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(java.lang.Object obj, com.plaid.internal.Q0 q0, kotlin.coroutines.Continuation<? super com.plaid.internal.Q0.b.a> continuation) {
                super(2, continuation);
                this.f5896a = obj;
                this.b = q0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.plaid.internal.Q0.b.a(this.f5896a, this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return new com.plaid.internal.Q0.b.a(this.f5896a, this.b, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Object obj2 = this.f5896a;
                com.plaid.internal.Q0 q0 = this.b;
                if (kotlin.Result.m23439exceptionOrNullimpl(obj2) != null) {
                    q0.f.getProgressBar$link_sdk_release().setVisibility(4);
                    q0.f.getWebView$link_sdk_release().setVisibility(4);
                    q0.f.getRetryContainer$link_sdk_release().setVisibility(0);
                    return kotlin.Unit.INSTANCE;
                }
                com.plaid.internal.Q0 q02 = this.b;
                com.plaid.internal.P5 webView$link_sdk_release = q02.f.getWebView$link_sdk_release();
                webView$link_sdk_release.loadUrl((java.lang.String) obj2);
                webView$link_sdk_release.setVisibility(0);
                q02.f.getProgressBar$link_sdk_release().setVisibility(4);
                q02.f.getRetryContainer$link_sdk_release().setVisibility(4);
                return kotlin.Unit.INSTANCE;
            }
        }

        public b(kotlin.coroutines.Continuation<? super com.plaid.internal.Q0.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.Q0.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.Q0.this.new b(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            if (r7 != r0) goto L12;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object a2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5895a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.Q0 q0 = com.plaid.internal.Q0.this;
                com.plaid.internal.P0 p0 = q0.e;
                java.lang.String token = q0.f5893a.getToken();
                this.f5895a = 1;
                a2 = p0.a(token, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                a2 = ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
            }
            kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
            com.plaid.internal.Q0.b.a aVar = new com.plaid.internal.Q0.b.a(a2, com.plaid.internal.Q0.this, null);
            this.f5895a = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q0(android.content.Context context, com.plaid.link.configuration.LinkTokenConfiguration linkTokenConfiguration, androidx.view.result.ActivityResultLauncher<com.plaid.link.configuration.LinkTokenConfiguration> activityResultLauncher, kotlin.jvm.functions.Function1<? super com.plaid.link.configuration.LinkTokenConfiguration, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.plaid.link.result.LinkExit, kotlin.Unit> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkTokenConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        this.f5893a = linkTokenConfiguration;
        this.b = activityResultLauncher;
        this.c = function1;
        this.d = function12;
        com.plaid.link.Plaid plaid = com.plaid.link.Plaid.INSTANCE;
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "");
        com.plaid.internal.P0 p0 = new com.plaid.internal.P0(plaid.provideLinkTokenComponent$link_sdk_release((android.app.Application) applicationContext));
        this.e = p0;
        com.plaid.internal.Q0.a aVar = new com.plaid.internal.Q0.a(context);
        kotlinx.serialization.json.Json json = p0.c;
        if (json == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            json = null;
        }
        com.plaid.internal.S0 s0 = new com.plaid.internal.S0(aVar, json);
        com.plaid.internal.C0691y2 c0691y2 = new com.plaid.internal.C0691y2(context);
        com.plaid.internal.P5 webView$link_sdk_release = c0691y2.getWebView$link_sdk_release();
        com.plaid.internal.R0 r0 = new com.plaid.internal.R0(s0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "");
        android.content.Context context2 = webView$link_sdk_release.getContext();
        if (context2 instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) context2).setBaseContext(com.plaid.internal.P5.a.a(context));
        }
        webView$link_sdk_release.c = com.plaid.internal.L5.a.f5832a;
        com.plaid.internal.C0505d4 c0505d4 = webView$link_sdk_release.f5879a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "");
        c0505d4.f6392a = r0;
        c0691y2.getRetryButton$link_sdk_release().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.plaid.internal.Q0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.plaid.internal.Q0.a(com.plaid.internal.Q0.this, view);
            }
        });
        this.f = c0691y2;
    }

    public static final void a(com.plaid.internal.Q0 q0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(q0, "");
        q0.a();
    }

    public final void a() {
        this.f.getProgressBar$link_sdk_release().setVisibility(0);
        this.f.getWebView$link_sdk_release().setVisibility(4);
        this.f.getRetryContainer$link_sdk_release().setVisibility(4);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.plaid.internal.C0705z7.a(this.f), null, null, new com.plaid.internal.Q0.b(null), 3, null);
    }

    public static final class a {
        public final /* synthetic */ android.content.Context b;

        public a(android.content.Context context) {
            this.b = context;
        }

        public final void a(com.plaid.internal.M0 m0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m0, "");
            com.plaid.link.configuration.LinkTokenConfiguration build = new com.plaid.link.configuration.LinkTokenConfiguration.Builder().embeddedSessionInfo(m0).noLoadingState(com.plaid.internal.Q0.this.f5893a.getNoLoadingState()).logLevel(com.plaid.internal.Q0.this.f5893a.getLogLevel()).build();
            com.plaid.internal.Q0 q0 = com.plaid.internal.Q0.this;
            androidx.view.result.ActivityResultLauncher<com.plaid.link.configuration.LinkTokenConfiguration> activityResultLauncher = q0.b;
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(build);
                return;
            }
            kotlin.jvm.functions.Function1<com.plaid.link.configuration.LinkTokenConfiguration, kotlin.Unit> function1 = q0.c;
            if (function1 != null) {
                function1.invoke(build);
            }
        }

        public final void a(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            androidx.browser.customtabs.CustomTabsIntent build = new androidx.browser.customtabs.CustomTabsIntent.Builder().build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            build.launchUrl(this.b, android.net.Uri.parse(str));
        }

        public final void a(com.plaid.link.result.LinkExit linkExit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkExit, "");
            com.plaid.internal.Q0.this.d.invoke(linkExit);
        }
    }
}
