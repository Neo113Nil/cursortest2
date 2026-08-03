package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class z extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> {
    public static final int n = 8;
    public final android.content.Context h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i k;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m l;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y m;

    public /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
        public a(java.lang.Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.class, "loadAndReadyMraid", "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m) this.receiver).b(continuation);
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        public b(java.lang.Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z.class, "detachMraidViewFromAdViewWrapper", "detachMraidViewFromAdViewWrapper()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z) this.receiver).p();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        public c(java.lang.Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z.class, "attachMraidViewToAdViewWrapper", "attachMraidViewToAdViewWrapper()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z) this.receiver).n();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ z(android.content.Context context, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d dVar, kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, rVar, yVar, (i & 16) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d() : dVar, coroutineScope);
    }

    public static final kotlin.Unit c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z zVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e adShowListener = zVar.getAdShowListener();
        if (adShowListener != null) {
            adShowListener.b();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        super.destroy();
        this.l.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void k() {
        android.widget.FrameLayout a2 = this.j.a(this.h, this.l.c());
        this.i.a(a2);
        setAdView(a2);
    }

    public final void n() {
        k();
    }

    public final void p() {
        setAdView(null);
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z zVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e adShowListener = zVar.getAdShowListener();
        if (adShowListener != null) {
            adShowListener.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.a(it));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y getAdLoader() {
        return this.m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, java.lang.String adm, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d webViewWrapper, kotlinx.coroutines.CoroutineScope scope) {
        super(context, scope);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewWrapper, "webViewWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.h = context;
        this.i = watermark;
        this.j = webViewWrapper;
        setTag("MolocoMraidBannerView");
        this.k = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m mVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m(context, adm, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z.b(this), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z.c(this), new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z.this);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z.this, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj);
            }
        }, true, externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h.a(context, scope, false), null, null, 1536, null);
        this.l = mVar;
        this.m = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y(scope, null, com.moloco.sdk.service_locator.a.C0211a.f7342a.a(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z.a(mVar));
    }
}
