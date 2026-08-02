package com.plaid.internal;

/* renamed from: com.plaid.internal.p6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0615p6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0505d4 f6532a;
    public final kotlinx.serialization.json.Json b;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> c;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> d;

    /* renamed from: com.plaid.internal.p6$a */
    public static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.C0615p6.a f6533a = new com.plaid.internal.C0615p6.a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final kotlin.Unit invoke(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
            kotlinx.serialization.json.JsonBuilder jsonBuilder2 = jsonBuilder;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder2, "");
            jsonBuilder2.setIgnoreUnknownKeys(true);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.core.webview.PreloadWebViewJSInterface$postMessage$1", f = "PreloadWebViewJSInterface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.p6$b */
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public b(kotlin.coroutines.Continuation<? super com.plaid.internal.C0615p6.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.C0615p6.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.C0615p6.this.new b(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.C0615p6.this.c.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            return kotlin.Unit.INSTANCE;
        }
    }

    public C0615p6(com.plaid.internal.C0505d4 c0505d4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0505d4, "");
        this.f6532a = c0505d4;
        this.b = kotlinx.serialization.json.JsonKt.Json$default(null, com.plaid.internal.C0615p6.a.f6533a, 1, null);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.c = MutableStateFlow;
        this.d = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @android.webkit.JavascriptInterface
    public final void postMessage(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            kotlinx.serialization.json.Json json = this.b;
            com.plaid.internal.C0445a.b.a();
            com.plaid.internal.C0445a c0445a = (com.plaid.internal.C0445a) json.decodeFromString(com.plaid.internal.C0445a.C0158a.f5991a, str);
            java.lang.String a2 = c0445a.a();
            if (kotlin.jvm.internal.Intrinsics.areEqual(a2, "ready")) {
                com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                com.plaid.internal.C0452a6.a.a("JS received Link is ready", true);
                com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "JSBridge - received ready");
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, null, null, new com.plaid.internal.C0615p6.b(null), 3, null);
                return;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(a2, "open-webview")) {
                java.lang.String a3 = c0445a.a();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("JS sent unknown action: ");
                sb.append(a3);
                com.plaid.internal.Y6.a.a(sb.toString());
                com.plaid.internal.F6.a.a(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", c0445a.a())), "JSBridge - received unknown action");
                return;
            }
            com.plaid.internal.AbstractC0639s4 a4 = com.plaid.internal.AbstractC0639s4.a.a(str);
            com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("JS received open webview message : ");
            sb2.append(a4);
            com.plaid.internal.C0452a6.a.a(sb2.toString(), true);
            com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "JSBridge - received open-webview");
            this.f6532a.a(a4);
        } catch (java.lang.Exception e) {
            com.plaid.internal.Y6.a.a(e, "Error parsing message: ".concat(java.lang.String.valueOf(str)));
            kotlin.Pair pair = kotlin.TuplesKt.to("message", str);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "unknown";
            }
            com.plaid.internal.F6.a.a(kotlin.collections.MapsKt.mapOf(pair, kotlin.TuplesKt.to("error", message)), "JSBridge - error parsing message");
        }
    }
}
