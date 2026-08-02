package com.plaid.internal;

/* loaded from: classes16.dex */
public final class U7 extends androidx.view.ViewModel implements com.plaid.internal.L5, com.plaid.internal.M5, com.plaid.internal.C0647t3.a {

    /* renamed from: a, reason: collision with root package name */
    @javax.inject.Inject
    public final kotlinx.serialization.json.Json f5941a;

    @javax.inject.Inject
    public final com.plaid.internal.InterfaceC0655u2 b;

    @javax.inject.Inject
    public final com.plaid.internal.C6 c;

    @javax.inject.Inject
    public final com.plaid.internal.C0551i5 d;

    @javax.inject.Inject
    public final com.plaid.internal.B6 e;

    @javax.inject.Inject
    public final com.plaid.internal.A6 f;

    @javax.inject.Inject
    public final com.plaid.internal.I7 g;

    @javax.inject.Inject
    public final com.plaid.internal.N5 h;

    @javax.inject.Inject
    public final com.plaid.internal.InterfaceC0677w6 i;

    @javax.inject.Inject
    public final com.plaid.internal.F j;

    @javax.inject.Inject
    public final com.plaid.internal.C0651t7 k;
    public final com.plaid.internal.C0647t3 l;
    public final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> m;
    public android.webkit.ValueCallback<android.net.Uri[]> n;

    /* renamed from: o, reason: collision with root package name */
    @javax.inject.Inject
    public final com.plaid.internal.C0632r6 f5942o;

    @javax.inject.Inject
    public final com.plaid.internal.H6 p;
    public java.lang.String q;
    public final com.plaid.internal.T7 r;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$onCleared$1", f = "WebviewViewModel.kt", i = {}, l = {142, 143}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public com.plaid.internal.U7 f5943a;
        public java.util.Iterator b;
        public int c;

        public a(kotlin.coroutines.Continuation<? super com.plaid.internal.U7.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.U7.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.U7.this.new a(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0038, code lost:
        
            if (r8 != r0) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.plaid.internal.U7 u7;
            java.util.Iterator it;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.C0551i5 c0551i5 = com.plaid.internal.U7.this.d;
                if (c0551i5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    c0551i5 = null;
                }
                this.c = 1;
                obj = c0551i5.a(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.b;
                    u7 = this.f5943a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        com.plaid.internal.C0551i5 c0551i52 = u7.d;
                        if (c0551i52 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            c0551i52 = null;
                        }
                        this.f5943a = u7;
                        this.b = it;
                        this.c = 2;
                        if (c0551i52.a(str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            u7 = com.plaid.internal.U7.this;
            it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$onWebviewCancelled$1", f = "WebviewViewModel.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5944a;

        public b(kotlin.coroutines.Continuation<? super com.plaid.internal.U7.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.U7.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.U7.this.new b(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5944a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.InterfaceC0655u2 b = com.plaid.internal.U7.this.b();
                this.f5944a = 1;
                if (b.a(this) == coroutine_suspended) {
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

    public U7(com.plaid.internal.H1 h1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h1, "");
        this.m = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.r = new com.plaid.internal.T7(this);
        com.plaid.internal.C0591n0 c0591n0 = (com.plaid.internal.C0591n0) h1;
        kotlinx.serialization.json.Json json = c0591n0.f6501a.e.get();
        this.f5941a = json;
        this.b = c0591n0.n.get();
        this.c = c0591n0.f6502o.get();
        this.d = c0591n0.p.get();
        this.e = c0591n0.q.get();
        this.f = c0591n0.r.get();
        this.g = c0591n0.s.get();
        this.h = c0591n0.f6501a.f6526o.get();
        this.i = c0591n0.t.get();
        this.j = c0591n0.u.get();
        this.k = c0591n0.w.get();
        this.f5942o = c0591n0.x.get();
        this.p = c0591n0.b.m.get();
        if (json == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            json = null;
        }
        this.l = new com.plaid.internal.C0647t3(this, json);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.Q7(this, null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.R7(this, null), 3, null);
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void a(com.plaid.internal.C0447a1 c0447a1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0447a1, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.S7(this, null), 3, null);
        b().a(com.plaid.internal.L2.b(c0447a1, null));
    }

    public final com.plaid.internal.InterfaceC0655u2 b() {
        com.plaid.internal.InterfaceC0655u2 interfaceC0655u2 = this.b;
        if (interfaceC0655u2 != null) {
            return interfaceC0655u2;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        b().a(str);
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, null, null, new com.plaid.internal.U7.a(null), 3, null);
        super.onCleared();
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.q, str)) {
            return;
        }
        this.q = str;
        com.plaid.internal.H6 h6 = this.p;
        if (h6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            h6 = null;
        }
        h6.f5801a.a(str);
        h6.a();
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void a(com.plaid.link.result.LinkExit linkExit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkExit, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.S7(this, null), 3, null);
        b().a(linkExit);
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void a(com.plaid.link.result.LinkSuccess linkSuccess) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkSuccess, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.S7(this, null), 3, null);
        b().a(linkSuccess);
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void a(java.util.LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.V7(this, linkedHashMap, null), 3, null);
    }

    @Override // com.plaid.internal.M5
    public final boolean a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.l.a(str);
        return true;
    }

    @Override // com.plaid.internal.L5
    public final void a() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.U7.b(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        android.webkit.ValueCallback<android.net.Uri[]> valueCallback = this.n;
        if (valueCallback != 0) {
            valueCallback.onReceiveValue(list.toArray(new android.net.Uri[0]));
        }
    }

    @Override // com.plaid.internal.M5
    public final void a(com.plaid.internal.AbstractC0639s4 abstractC0639s4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractC0639s4, "");
        b().a(abstractC0639s4);
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void a(com.plaid.link.event.LinkEvent linkEvent, com.plaid.internal.I2 i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkEvent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i2, "");
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Event: ".concat(java.lang.String.valueOf(linkEvent.getEventName())), true);
        kotlin.jvm.functions.Function2<com.plaid.link.event.LinkEvent, com.plaid.internal.I2, kotlin.Unit> linkEventListenerInternal$link_sdk_release = com.plaid.link.Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(linkEvent, i2);
        }
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void a(java.lang.String str, com.plaid.link.event.LinkEventMetadata linkEventMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkEventMetadata, "");
        kotlin.jvm.functions.Function2<com.plaid.link.event.LinkEvent, com.plaid.internal.I2, kotlin.Unit> linkEventListenerInternal$link_sdk_release = com.plaid.link.Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.plaid.link.event.LinkEventName fromString$link_sdk_release = com.plaid.link.event.LinkEventName.INSTANCE.fromString$link_sdk_release(str);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromString$link_sdk_release, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkEventMetadata, "");
            linkEventListenerInternal$link_sdk_release.invoke(new com.plaid.link.event.LinkEvent(fromString$link_sdk_release, linkEventMetadata), com.plaid.internal.I2.d.f5810a);
        }
    }
}
