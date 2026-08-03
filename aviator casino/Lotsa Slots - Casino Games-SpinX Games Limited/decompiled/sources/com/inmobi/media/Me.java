package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Me {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f4837a;
    public final com.inmobi.media.Ln b;
    public final com.inmobi.media.Je c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public final java.util.ArrayList e;

    public Me(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.Ln viewabilityModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        this.f4837a = coroutineScope;
        this.b = viewabilityModel;
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.e = new java.util.ArrayList();
        com.inmobi.media.Ne ne = new com.inmobi.media.Ne(new com.inmobi.media.Nn(viewabilityModel.f4825a, viewabilityModel.c), new com.inmobi.media.Nn(viewabilityModel.b, viewabilityModel.d));
        android.view.ViewGroup parentView = viewabilityModel.e.f5125a.getParentView();
        android.widget.ImageView iconView = viewabilityModel.e.f5125a.getIconView();
        com.inmobi.media.C2304bh c2304bh = viewabilityModel.e;
        com.inmobi.media.ads.nativeAd.MediaView mediaView = c2304bh.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c2304bh, "<this>");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        com.inmobi.media.ads.nativeAd.MediaView mediaView2 = c2304bh.b;
        if (mediaView2 != null) {
            linkedHashSet.add(mediaView2);
        }
        android.view.View view = c2304bh.c;
        if (view != null) {
            linkedHashSet.add(view);
        }
        android.view.View ctaView = c2304bh.f5125a.getCtaView();
        if (ctaView != null) {
            linkedHashSet.add(ctaView);
        }
        android.widget.ImageView iconView2 = c2304bh.f5125a.getIconView();
        if (iconView2 != null) {
            linkedHashSet.add(iconView2);
        }
        android.view.View titleView = c2304bh.f5125a.getTitleView();
        if (titleView != null) {
            linkedHashSet.add(titleView);
        }
        android.view.View descriptionView = c2304bh.f5125a.getDescriptionView();
        if (descriptionView != null) {
            linkedHashSet.add(descriptionView);
        }
        android.view.View ratingView = c2304bh.f5125a.getRatingView();
        if (ratingView != null) {
            linkedHashSet.add(ratingView);
        }
        android.view.View advertiserView = c2304bh.f5125a.getAdvertiserView();
        if (advertiserView != null) {
            linkedHashSet.add(advertiserView);
        }
        linkedHashSet.addAll(c2304bh.f5125a.getExtraViews$media_release());
        this.c = new com.inmobi.media.Je(parentView, iconView, mediaView, kotlin.collections.CollectionsKt.toList(linkedHashSet), ne);
    }

    public static final kotlin.Unit b(com.inmobi.media.Me me, boolean z) {
        me.c.e.b.b = z;
        return kotlin.Unit.INSTANCE;
    }

    public final void a() {
        if (this.d.getAndSet(true)) {
            return;
        }
        android.view.ViewGroup parentView = this.b.e.f5125a.getParentView();
        a(this.b.e.f5125a.getIconView(), parentView, this.b.f4825a, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Me$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Me.a(com.inmobi.media.Me.this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        com.inmobi.media.Ln ln = this.b;
        a(ln.e.b, parentView, ln.b, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Me$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Me.b(com.inmobi.media.Me.this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public final void b() {
        if (this.d.getAndSet(false)) {
            java.util.ArrayList arrayList = this.e;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "<this>");
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.inmobi.media.L6.a((kotlinx.coroutines.Job) it.next());
            }
            arrayList.clear();
            this.e.clear();
        }
    }

    public static final kotlin.Unit a(com.inmobi.media.Me me, boolean z) {
        me.c.e.f4856a.b = z;
        return kotlin.Unit.INSTANCE;
    }

    public final void a(android.view.View view, android.view.ViewGroup parentView, boolean z, kotlin.jvm.functions.Function1 function1) {
        kotlinx.coroutines.Job launch$default;
        if (view == null || !z) {
            return;
        }
        kotlinx.coroutines.CoroutineScope coroutineScope = this.f4837a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentView, "parentView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f4837a, null, null, new com.inmobi.media.Le(kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.inmobi.media.Kn(view, parentView, null)), kotlinx.coroutines.Dispatchers.getMain()), coroutineScope, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getLazily(), java.lang.Boolean.valueOf(com.inmobi.media.Mn.b(view, parentView))), null, function1), 3, null);
        this.e.add(launch$default);
    }
}
