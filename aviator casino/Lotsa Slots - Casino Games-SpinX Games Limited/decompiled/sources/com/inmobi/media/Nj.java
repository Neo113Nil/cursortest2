package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Nj extends com.inmobi.media.AbstractC2525k2 {
    public final kotlinx.coroutines.CoroutineScope b;
    public final com.inmobi.media.Oj c;
    public final kotlinx.coroutines.flow.MutableSharedFlow d;
    public final com.inmobi.media.C2799u9 e;
    public final java.lang.String f;
    public final com.inmobi.media.Tj g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nj(android.content.Context context, kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.Oj staticExperienceModel, kotlinx.coroutines.flow.MutableSharedFlow mediaEventFlow, com.inmobi.media.C2799u9 c2799u9) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(staticExperienceModel, "staticExperienceModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.b = coroutineScope;
        this.c = staticExperienceModel;
        this.d = mediaEventFlow;
        this.e = c2799u9;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.f = "Static-Image-" + uuid;
        int i = com.inmobi.media.Tj.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.g = new com.inmobi.media.Tj(context);
    }

    @Override // com.inmobi.media.AbstractC2525k2
    public final void a(kotlinx.coroutines.flow.MutableStateFlow windowFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
    }

    @Override // com.inmobi.media.AbstractC2525k2
    public final void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.inmobi.media.Nj] */
    @Override // com.inmobi.media.AbstractC2525k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Ij ij;
        int i;
        com.inmobi.media.C2799u9 c2799u9;
        if (continuationImpl instanceof com.inmobi.media.Ij) {
            ij = (com.inmobi.media.Ij) continuationImpl;
            int i2 = ij.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ij.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = ij.f4768a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ij.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2799u9 c2799u92 = this.e;
                    if (c2799u92 != null) {
                        c2799u92.a("StaticExperienceManager", "load Called - imageAssets count: " + this.c.f4880a.size());
                    }
                    java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(this.c.b.f5000a);
                    com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                    com.inmobi.media.C2624nk.b("MainImageLoadStarted", a2, com.inmobi.media.EnumC2728rk.f5431a);
                    java.util.List images = this.c.f4880a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(images, "images");
                    java.util.ArrayList images2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : images) {
                        com.inmobi.media.ads.network.inmobiJson.model.Image image = (com.inmobi.media.ads.network.inmobiJson.model.Image) obj2;
                        if (android.webkit.URLUtil.isHttpUrl(image.getUrl()) || android.webkit.URLUtil.isHttpsUrl(image.getUrl())) {
                            images2.add(obj2);
                        }
                    }
                    if (images2.isEmpty()) {
                        com.inmobi.media.C2799u9 c2799u93 = this.e;
                        if (c2799u93 != null) {
                            c2799u93.a("StaticExperienceManager", "Sanitized Images Empty - no valid images to load");
                        }
                        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(com.inmobi.media.AbstractC2938zk.a(this.c.b.f5000a));
                        mutableMap.put("errorCode", (short) 2351);
                        com.inmobi.media.C2624nk c2624nk2 = com.inmobi.media.C2624nk.f5360a;
                        com.inmobi.media.C2624nk.b("MainImageLoadFailure", mutableMap, com.inmobi.media.EnumC2728rk.f5431a);
                        throw new com.inmobi.media.C2562lc();
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(images2, "images");
                    int size = images2.size();
                    java.util.ArrayList arrayList = images2;
                    if (size > 1) {
                        int a3 = com.inmobi.media.C5.a();
                        int ordinal = com.inmobi.media.C4.a().ordinal();
                        arrayList = ordinal != 2 ? ordinal != 3 ? kotlin.collections.CollectionsKt.sortedWith(images2, new com.inmobi.media.Rj()) : a3 > 720 ? kotlin.collections.CollectionsKt.sortedWith(images2, new com.inmobi.media.Sj()) : kotlin.collections.CollectionsKt.sortedWith(images2, new com.inmobi.media.Pj(a3)) : kotlin.collections.CollectionsKt.sortedWith(images2, new com.inmobi.media.Qj(a3));
                    }
                    com.inmobi.media.Tj tj = this.g;
                    ij.c = 1;
                    if (a(arrayList, tj, ij) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                c2799u9 = this.e;
                if (c2799u9 != null) {
                    c2799u9.a("StaticExperienceManager", "Static Load Success");
                }
                java.util.Map a4 = com.inmobi.media.AbstractC2938zk.a(this.c.b.f5000a);
                com.inmobi.media.C2624nk c2624nk3 = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("MainImageLoadSuccess", a4, com.inmobi.media.EnumC2728rk.f5431a);
                return kotlin.Unit.INSTANCE;
            }
        }
        ij = new com.inmobi.media.Ij(this, continuationImpl);
        java.lang.Object obj3 = ij.f4768a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ij.c;
        if (i != 0) {
        }
        c2799u9 = this.e;
        if (c2799u9 != null) {
        }
        java.util.Map a42 = com.inmobi.media.AbstractC2938zk.a(this.c.b.f5000a);
        com.inmobi.media.C2624nk c2624nk32 = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("MainImageLoadSuccess", a42, com.inmobi.media.EnumC2728rk.f5431a);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC2525k2
    public final java.lang.Object a(android.widget.FrameLayout frameLayout, com.inmobi.media.C2747sc c2747sc) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.inmobi.media.Hj(this, frameLayout, null), c2747sc);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC2525k2
    public final void a() {
        android.view.ViewParent parent = this.g.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        com.squareup.picasso.Picasso picasso = com.inmobi.media.Yf.f5066a;
        com.inmobi.media.Yf.b(this.f5284a).cancelTag(this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r12, r13, r8) != r9) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.util.List list, android.widget.ImageView imageView, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Jj jj;
        int i;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        java.util.List list2;
        android.widget.ImageView imageView2;
        if (continuationImpl instanceof com.inmobi.media.Jj) {
            jj = (com.inmobi.media.Jj) continuationImpl;
            int i2 = jj.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jj.f = i2 - Integer.MIN_VALUE;
                com.inmobi.media.Jj jj2 = jj;
                java.lang.Object obj = jj2.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jj2.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2799u9 c2799u9 = this.e;
                    if (c2799u9 != null) {
                        c2799u9.a("StaticExperienceManager", "loadImagesIntoImageView - attempting to load " + list.size() + " images");
                    }
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                    kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
                    com.inmobi.media.Lj lj = new com.inmobi.media.Lj(this, null);
                    jj2.f4785a = list;
                    jj2.b = imageView;
                    jj2.c = booleanRef2;
                    jj2.f = 1;
                    java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(main, lj, jj2);
                    if (withContext != coroutine_suspended) {
                        booleanRef = booleanRef2;
                        obj = withContext;
                        list2 = list;
                        imageView2 = imageView;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.jvm.internal.Ref.BooleanRef booleanRef3 = jj2.c;
                android.widget.ImageView imageView3 = jj2.b;
                java.util.List list3 = jj2.f4785a;
                kotlin.ResultKt.throwOnFailure(obj);
                imageView2 = imageView3;
                booleanRef = booleanRef3;
                list2 = list3;
                kotlinx.coroutines.CoroutineDispatcher io2 = kotlinx.coroutines.Dispatchers.getIO();
                com.inmobi.media.Kj kj = new com.inmobi.media.Kj(list2, this, booleanRef, imageView2, (android.graphics.Bitmap.Config) obj, null);
                jj2.f4785a = null;
                jj2.b = null;
                jj2.c = null;
                jj2.f = 2;
            }
        }
        jj = new com.inmobi.media.Jj(this, continuationImpl);
        com.inmobi.media.Jj jj22 = jj;
        java.lang.Object obj2 = jj22.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jj22.f;
        if (i != 0) {
        }
        kotlinx.coroutines.CoroutineDispatcher io22 = kotlinx.coroutines.Dispatchers.getIO();
        com.inmobi.media.Kj kj2 = new com.inmobi.media.Kj(list2, this, booleanRef, imageView2, (android.graphics.Bitmap.Config) obj2, null);
        jj22.f4785a = null;
        jj22.b = null;
        jj22.c = null;
        jj22.f = 2;
    }

    public final void a(android.widget.ImageView imageView, final com.inmobi.media.ads.network.inmobiJson.model.Image image) {
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.inmobi.media.Nj$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.inmobi.media.Nj.a(com.inmobi.media.Nj.this, image, view);
            }
        });
    }

    public static final void a(com.inmobi.media.Nj nj, com.inmobi.media.ads.network.inmobiJson.model.Image image, android.view.View view) {
        com.inmobi.media.C2799u9 c2799u9 = nj.e;
        if (c2799u9 != null) {
            c2799u9.a("StaticExperienceManager", "Static Click Event");
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(nj.b, null, null, new com.inmobi.media.Mj(image, nj, null), 3, null);
    }
}
