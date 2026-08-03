package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Xn extends com.inmobi.media.Wn {
    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xn(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi mRenderView) {
        super(mRenderView);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mRenderView, "mRenderView");
        this.d = mRenderView;
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.content.Context context, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.inmobi.media.Wn
    public final void a(java.util.Map map) {
    }

    public final void b(final android.view.View view) {
        this.d.getWebViewFactory().b(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Xn.a(view, (com.inmobi.media.C2886xi) obj);
            }
        });
    }

    @Override // com.inmobi.media.Wn
    public final android.view.View c() {
        this.b = new java.lang.ref.WeakReference(this.d);
        return this.d;
    }

    @Override // com.inmobi.media.Wn
    public final void d() {
    }

    public static final kotlin.Unit b(android.view.View view, com.inmobi.media.C2886xi it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.getViewableAd().a(view);
        com.inmobi.media.U exposureTracker = it.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(android.view.View view, com.inmobi.media.C2886xi it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.getViewableAd().a(view, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose.OTHER);
        com.inmobi.media.U exposureTracker = it.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void c(final android.view.View view) {
        this.d.getWebViewFactory().b(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Xn.b(view, (com.inmobi.media.C2886xi) obj);
            }
        });
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.view.View childView, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        com.inmobi.media.U exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(childView);
        }
        b(childView);
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.view.View childView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
        java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(childView);
        }
        com.inmobi.media.U exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(childView);
        }
        c(childView);
    }
}
