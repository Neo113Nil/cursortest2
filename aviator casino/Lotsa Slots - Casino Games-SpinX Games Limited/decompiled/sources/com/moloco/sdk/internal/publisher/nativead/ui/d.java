package com.moloco.sdk.internal.publisher.nativead.ui;

/* loaded from: classes5.dex */
public final class d extends android.widget.FrameLayout {
    public static final com.moloco.sdk.internal.publisher.nativead.ui.d.a d = new com.moloco.sdk.internal.publisher.nativead.ui.d.a(null);
    public static final int e = 8;
    public static final java.lang.String f = "VideoContainer";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f7160a;
    public final com.moloco.sdk.internal.A b;
    public androidx.compose.ui.platform.ComposeView c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y f7161a;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.ui.d b;
        public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q d;

        public static final class a implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.ui.d f7162a;
            public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> b;
            public final /* synthetic */ androidx.compose.ui.Modifier c;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q d;

            public a(com.moloco.sdk.internal.publisher.nativead.ui.d dVar, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q q) {
                this.f7162a = dVar;
                this.b = function0;
                this.c = modifier;
                this.d = q;
            }

            public final void a(androidx.compose.runtime.Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1035844210, i, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdVideoContainer.videoView.<anonymous>.<anonymous> (NativeAdVideoContainer.kt:57)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f7162a.f7160a;
                long m2139getBlack0d7_KjU = androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU();
                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i(function0, function0, function0);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.a(aVar, this.c, m2139getBlack0d7_KjU, com.moloco.sdk.internal.publisher.nativead.ui.e.a(composer, 0), null, null, null, null, iVar, null, null, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(com.moloco.sdk.internal.publisher.nativead.ui.f.a(), composer, 6, 0), this.d, false, composer, 818110848, 0, 9280);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                a(composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }
        }

        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, com.moloco.sdk.internal.publisher.nativead.ui.d dVar, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q q) {
            this.f7161a = yVar;
            this.b = dVar;
            this.c = function0;
            this.d = q;
        }

        public final void a(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "modifier");
            if ((i & 6) == 0) {
                i |= composer.changed(modifier) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1867022133, i, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdVideoContainer.videoView.<anonymous> (NativeAdVideoContainer.kt:56)");
            }
            this.f7161a.a(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, 1035844210, true, new com.moloco.sdk.internal.publisher.nativead.ui.d.b.a(this.b, this.c, modifier, this.d)), composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(modifier, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a vastAdController, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q viewVisibilityTracker, com.moloco.sdk.internal.A viewLifecycleOwner, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastAdController, "vastAdController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        this.f7160a = vastAdController;
        this.b = viewLifecycleOwner;
        androidx.compose.ui.platform.ComposeView a2 = com.moloco.sdk.internal.publisher.nativead.ui.b.a(context, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1867022133, true, new com.moloco.sdk.internal.publisher.nativead.ui.d.b(watermark, this, function0, viewVisibilityTracker)));
        addView(a2, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.c = a2;
    }

    public static /* synthetic */ void getVideoView$annotations() {
    }

    public final void b() {
        removeAllViews();
        androidx.compose.ui.platform.ComposeView composeView = this.c;
        if (composeView != null) {
            composeView.disposeComposition();
        }
        this.c = null;
    }

    public final androidx.compose.ui.platform.ComposeView getVideoView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "onAttachedToWindow", null, false, 12, null);
        this.b.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "onDetachedFromWindow", null, false, 12, null);
        this.b.b(this);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.b.d(this);
        } else {
            this.b.c(this);
        }
    }

    public final void setVideoView(androidx.compose.ui.platform.ComposeView composeView) {
        this.c = composeView;
    }

    public final void a() {
        this.f7160a.destroy();
        b();
    }
}
