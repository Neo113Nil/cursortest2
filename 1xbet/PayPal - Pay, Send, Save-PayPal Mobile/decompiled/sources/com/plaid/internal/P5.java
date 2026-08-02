package com.plaid.internal;

/* loaded from: classes16.dex */
public final class P5 extends android.webkit.WebView {
    public static final /* synthetic */ int g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0505d4 f5879a;
    public final com.plaid.internal.C0615p6 b;
    public com.plaid.internal.L5 c;
    public kotlinx.coroutines.Job d;
    public final java.util.ArrayList e;
    public final java.util.concurrent.atomic.AtomicBoolean f;

    public static final class a {
        public static final android.content.Context a(android.content.Context context) {
            int i = com.plaid.internal.P5.g;
            if (android.os.Build.VERSION.SDK_INT < 29) {
                return context;
            }
            context.setTheme(android.R.style.Theme.DeviceDefault.DayNight);
            return context;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$submit$1", f = "PlaidWebview.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5880a;
        public final /* synthetic */ java.lang.String c;

        public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.plaid.internal.P5 f5881a;
            public final /* synthetic */ java.lang.String b;

            public a(com.plaid.internal.P5 p5, java.lang.String str) {
                this.f5881a = p5;
                this.b = str;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.plaid.internal.W5(this.f5881a, this.b, null), continuation);
                return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str, kotlin.coroutines.Continuation<? super com.plaid.internal.P5.b> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.P5.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.P5.this.new b(this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5880a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.P5 p5 = com.plaid.internal.P5.this;
                kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> stateFlow = p5.b.d;
                com.plaid.internal.P5.b.a aVar = new com.plaid.internal.P5.b.a(p5, this.c);
                this.f5880a = 1;
                java.lang.Object collect = stateFlow.collect(new com.plaid.internal.X5(aVar), this);
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

    public static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonObjectBuilder, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f5882a;
        public final /* synthetic */ java.lang.String b;
        public final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
            super(1);
            this.f5882a = str;
            this.b = str2;
            this.c = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final kotlin.Unit invoke(kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder) {
            kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder2 = jsonObjectBuilder;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObjectBuilder2, "");
            java.lang.String str = this.f5882a;
            if (str != null) {
                kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder2, "phone_number", str);
            } else {
                jsonObjectBuilder2.put("phone_number", kotlinx.serialization.json.JsonNull.INSTANCE);
            }
            java.lang.String str2 = this.b;
            if (str2 != null) {
                kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder2, "date_of_birth", str2);
            } else {
                jsonObjectBuilder2.put("date_of_birth", kotlinx.serialization.json.JsonNull.INSTANCE);
            }
            kotlinx.serialization.json.JsonElementBuildersKt.putJsonObject(jsonObjectBuilder2, "params", new com.plaid.internal.Y5(this.c));
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P5(android.content.Context context) {
        super(new android.content.MutableContextWrapper(com.plaid.internal.P5.a.a(context)), null, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.plaid.internal.C0505d4 c0505d4 = new com.plaid.internal.C0505d4();
        this.f5879a = c0505d4;
        com.plaid.internal.C0615p6 c0615p6 = new com.plaid.internal.C0615p6(c0505d4);
        this.b = c0615p6;
        this.e = new java.util.ArrayList();
        this.f = new java.util.concurrent.atomic.AtomicBoolean(false);
        setRendererPriorityPolicy(2, false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setBackgroundColor(0);
        addJavascriptInterface(c0615p6, "PlaidAndroid");
        setWebViewClient(new com.plaid.internal.K5(c0505d4));
    }

    public final java.util.concurrent.atomic.AtomicBoolean a() {
        return this.f;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f5879a.f6392a = null;
        kotlinx.coroutines.Job job = this.d;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        java.util.Iterator it = this.e.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) it.next(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.e.clear();
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyEvent, "");
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (canGoBack()) {
            goBack();
            return true;
        }
        com.plaid.internal.L5 l5 = this.c;
        com.plaid.internal.L5 l52 = null;
        if (l5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            l5 = null;
        }
        l5.a();
        com.plaid.internal.L5 l53 = this.c;
        if (l53 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            l52 = l53;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(l52, com.plaid.internal.L5.a.f5832a)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final void a(final com.plaid.internal.C0543h6.a aVar) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "");
        if (this.b.d.getValue().booleanValue()) {
            post(new java.lang.Runnable() { // from class: com.plaid.internal.P5$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.plaid.internal.P5.a(kotlin.jvm.functions.Function0.this);
                }
            });
            return;
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()), null, null, new com.plaid.internal.V5(this, aVar, null), 3, null);
        this.e.add(launch$default);
        launch$default.invokeOnCompletion(new com.plaid.internal.U5(this, launch$default));
    }

    public static final void a(kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
    }

    public final void a(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlinx.coroutines.Job launch$default;
        if (str == null && str2 == null && (map == null || map.isEmpty())) {
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "null phone number && null DOB && null/empty params passed to submit -- noop");
            return;
        }
        kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, "submit");
        kotlinx.serialization.json.JsonElementBuildersKt.putJsonObject(jsonObjectBuilder, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new com.plaid.internal.P5.c(str, str2, map));
        java.lang.String obj = jsonObjectBuilder.build().toString();
        kotlinx.coroutines.Job job = this.d;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO()), null, null, new com.plaid.internal.P5.b(obj, null), 3, null);
        this.d = launch$default;
    }
}
