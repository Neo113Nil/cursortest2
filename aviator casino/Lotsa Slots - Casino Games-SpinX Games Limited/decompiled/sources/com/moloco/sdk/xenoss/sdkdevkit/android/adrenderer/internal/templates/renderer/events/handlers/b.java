package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.s f7586a;
    public final kotlinx.coroutines.CoroutineScope b;
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> c;
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> d;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.ClickthroughEventHandler$handleEvent$1", f = "ClickthroughEventHandler.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7587a;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b.a> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7587a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.services.s sVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b.this.f7586a;
                java.lang.String str = this.c;
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b.this.c;
                this.f7587a = 1;
                if (sVar.a(str, mutableSharedFlow, this) == coroutine_suspended) {
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

    public b(com.moloco.sdk.internal.services.s clickthroughService, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.f7586a = clickthroughService;
        this.b = scope;
        kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.c = MutableSharedFlow$default;
        this.d = MutableSharedFlow$default;
    }

    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> c() {
        return this.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public java.util.Set<java.lang.String> a() {
        return kotlin.collections.SetsKt.setOf("clickthrough");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public java.lang.String b() {
        return "ClickthroughEventHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(org.json.JSONObject event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event.getString(androidx.core.app.NotificationCompat.CATEGORY_EVENT), kotlin.collections.CollectionsKt.first(a()))) {
            com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, b(), "Event not supported: " + event.getString(androidx.core.app.NotificationCompat.CATEGORY_EVENT), false, 4, null);
            return;
        }
        java.lang.String string = event.getString(com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE);
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, b(), "Ad clicked on " + string, false, 4, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b.a(event.getString("url"), null), 3, null);
    }

    public /* synthetic */ b(com.moloco.sdk.internal.services.s sVar, kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(sVar, (i & 2) != 0 ? kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()) : coroutineScope);
    }
}
