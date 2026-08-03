package com.moloco.sdk.internal.publisher.nativead;

/* loaded from: classes5.dex */
public final class a implements com.moloco.sdk.publisher.NativeAd.Assets {
    public static final com.moloco.sdk.internal.publisher.nativead.a.C0191a k = new com.moloco.sdk.internal.publisher.nativead.a.C0191a(null);
    public static final int l = 8;
    public static final java.lang.String m = "NativeAdAssetsProvider";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7118a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q b;
    public final com.moloco.sdk.internal.A c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y d;
    public final kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a> e;
    public kotlin.jvm.functions.Function0<kotlin.Unit> f;
    public com.moloco.sdk.internal.publisher.nativead.model.d g;
    public final android.net.Uri h;
    public android.view.ViewGroup i;
    public com.moloco.sdk.internal.publisher.nativead.ui.d j;

    /* renamed from: com.moloco.sdk.internal.publisher.nativead.a$a, reason: collision with other inner class name */
    public static final class C0191a {
        public /* synthetic */ C0191a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0191a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q viewVisibilityTracker, com.moloco.sdk.internal.A viewLifecycleOwner, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a> vastAdPlaylistController) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastAdPlaylistController, "vastAdPlaylistController");
        this.f7118a = context;
        this.b = viewVisibilityTracker;
        this.c = viewLifecycleOwner;
        this.d = watermark;
        this.e = vastAdPlaylistController;
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        this.h = dVar != null ? dVar.b(1) : null;
    }

    public static /* synthetic */ void e() {
    }

    public final void a(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.f = function0;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> b() {
        return this.f;
    }

    public final com.moloco.sdk.internal.publisher.nativead.model.d c() {
        return this.g;
    }

    public final com.moloco.sdk.internal.publisher.nativead.ui.d d() {
        return this.j;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public java.lang.String getCallToActionText() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        if (dVar != null) {
            return dVar.a(7);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public java.lang.String getDescription() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        if (dVar != null) {
            return dVar.a(5);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public android.net.Uri getIconUri() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        if (dVar != null) {
            return dVar.b(0);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public android.net.Uri getMainImageUri() {
        return this.h;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public android.view.View getMediaView() {
        android.net.Uri b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a d;
        com.moloco.sdk.internal.publisher.nativead.ui.d dVar = this.j;
        if (dVar != null) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, m, "Using cached video view", null, false, 12, null);
            a((android.view.ViewGroup) dVar);
            return dVar;
        }
        com.moloco.sdk.internal.publisher.nativead.model.d dVar2 = this.g;
        if (dVar2 != null && (d = dVar2.d(2)) != null) {
            com.moloco.sdk.internal.publisher.nativead.ui.d a2 = a(d);
            this.j = a2;
            return a2;
        }
        android.view.ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, m, "Using cached image view", null, false, 12, null);
            a(viewGroup);
            return viewGroup;
        }
        com.moloco.sdk.internal.publisher.nativead.model.d dVar3 = this.g;
        if (dVar3 == null || (b = dVar3.b(1)) == null) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, m, "Missing video and image asset", new java.lang.Exception(), false, 8, null);
            return null;
        }
        android.view.ViewGroup a3 = a(b);
        this.i = a3;
        return a3;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public java.lang.Float getRating() {
        java.lang.String a2;
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        if (dVar == null || (a2 = dVar.a(6)) == null) {
            return null;
        }
        return kotlin.text.StringsKt.toFloatOrNull(a2);
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public java.lang.String getSponsorText() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        if (dVar != null) {
            return dVar.a(4);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public java.lang.String getTitle() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        if (dVar != null) {
            return dVar.c(3);
        }
        return null;
    }

    public final void a(com.moloco.sdk.internal.publisher.nativead.model.d dVar) {
        this.g = dVar;
    }

    public final void a(com.moloco.sdk.internal.publisher.nativead.ui.d dVar) {
        this.j = dVar;
    }

    public final com.moloco.sdk.internal.publisher.nativead.ui.d a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a invoke = this.e.invoke(aVar);
        invoke.d();
        return new com.moloco.sdk.internal.publisher.nativead.ui.d(this.f7118a, invoke, this.b, this.c, this.d, this.f);
    }

    public final android.view.ViewGroup a(android.net.Uri uri) {
        return new com.moloco.sdk.internal.publisher.nativead.ui.c(this.f7118a, uri, this.d, this.f, null, null, 48, null);
    }

    public final void a() {
        com.moloco.sdk.internal.publisher.nativead.ui.d dVar = this.j;
        if (dVar != null) {
            dVar.a();
        }
        this.j = null;
    }

    public final void a(android.view.ViewGroup viewGroup) {
        android.view.ViewParent parent = viewGroup.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, m, "Detaching view " + viewGroup.getClass().getSimpleName() + " from parent " + viewGroup2.getClass().getSimpleName(), null, false, 12, null);
            viewGroup2.removeView(viewGroup);
        }
    }
}
