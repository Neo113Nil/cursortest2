package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

/* loaded from: classes5.dex */
public final class h implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f7597a;
    public final kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a> b;
    public final kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a> c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a.C0264a b;
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a(com.facebook.share.internal.ShareConstants.VIDEO_URL, 0, "videoContainer");
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a("MRAID", 1, "mraidContainer");
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a e = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a("STATIC", 2, "staticContainer");
        public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a[] f;
        public static final /* synthetic */ kotlin.enums.EnumEntries g;

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f7598a;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h$a$a, reason: collision with other inner class name */
        public static final class C0264a {
            public /* synthetic */ C0264a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a a(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a aVar : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(aVar.c(), value)) {
                        return aVar;
                    }
                }
                return null;
            }

            public C0264a() {
            }
        }

        static {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a[] a2 = a();
            f = a2;
            g = kotlin.enums.EnumEntriesKt.enumEntries(a2);
            b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a.C0264a(null);
        }

        public a(java.lang.String str, int i, java.lang.String str2) {
            this.f7598a = str2;
        }

        public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a[] a() {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a[]{c, d, e};
        }

        public static kotlin.enums.EnumEntries<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a> b() {
            return g;
        }

        public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a valueOf(java.lang.String str) {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a) java.lang.Enum.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a.class, str);
        }

        public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a[] values() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a[]) f.clone();
        }

        public final java.lang.String c() {
            return this.f7598a;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.PlayListItemDisplayingEventHandler$handleEvent$1", f = "PlayListItemDisplayingEventHandler.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7599a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.b> continuation) {
            super(2, continuation);
            this.c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7599a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.this.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a aVar = this.c;
                this.f7599a = 1;
                if (mutableSharedFlow.emit(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public java.lang.String b() {
        return "PlayListItemDisplayingEventHandler";
    }

    public final kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a> c() {
        return this.c;
    }

    public h(kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.f7597a = scope;
        kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.b = MutableSharedFlow$default;
        this.c = MutableSharedFlow$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public java.util.Set<java.lang.String> a() {
        return kotlin.collections.SetsKt.setOf("playlistItemDisplaying");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(org.json.JSONObject event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, b(), event + " displaying.", false, 4, null);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event.getString(androidx.core.app.NotificationCompat.CATEGORY_EVENT), kotlin.collections.CollectionsKt.first(a()))) {
            com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, b(), "Event not supported: " + event.getString(androidx.core.app.NotificationCompat.CATEGORY_EVENT), false, 4, null);
            return;
        }
        java.lang.String string = event.getString("creativeType");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a.C0264a c0264a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a.b;
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a a2 = c0264a.a(string);
        com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, b(), a2 + " displaying.", false, 4, null);
        if (a2 != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f7597a, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.b(a2, null), 3, null);
        }
    }

    public /* synthetic */ h(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()) : coroutineScope);
    }
}
