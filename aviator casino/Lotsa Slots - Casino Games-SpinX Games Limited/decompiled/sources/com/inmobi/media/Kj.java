package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Kj extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4802a;
    public final /* synthetic */ java.util.List b;
    public final /* synthetic */ com.inmobi.media.Nj c;
    public final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef d;
    public final /* synthetic */ android.widget.ImageView e;
    public final /* synthetic */ android.graphics.Bitmap.Config f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kj(java.util.List list, com.inmobi.media.Nj nj, kotlin.jvm.internal.Ref.BooleanRef booleanRef, android.widget.ImageView imageView, android.graphics.Bitmap.Config config, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = nj;
        this.d = booleanRef;
        this.e = imageView;
        this.f = config;
    }

    public static final void a(com.inmobi.media.Nj nj, android.widget.ImageView imageView, kotlin.Pair pair) {
        com.inmobi.media.C2799u9 c2799u9 = nj.e;
        if (c2799u9 != null) {
            c2799u9.a("StaticExperienceManager", "loadImagesIntoImageView - setting bitmap to ImageView");
        }
        nj.a(imageView, (com.inmobi.media.ads.network.inmobiJson.model.Image) pair.getSecond());
        imageView.setImageBitmap((android.graphics.Bitmap) pair.getFirst());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Kj kj = new com.inmobi.media.Kj(this.b, this.c, this.d, this.e, this.f, continuation);
        kj.f4802a = obj;
        return kj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Kj) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlin.Pair pair;
        java.lang.Object m10798constructorimpl;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List list = this.b;
        com.inmobi.media.Nj nj = this.c;
        android.graphics.Bitmap.Config config = this.f;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef = this.d;
        java.util.Iterator it = list.iterator();
        do {
            pair = null;
            if (!it.hasNext()) {
                break;
            }
            com.inmobi.media.ads.network.inmobiJson.model.Image image = (com.inmobi.media.ads.network.inmobiJson.model.Image) it.next();
            com.inmobi.media.C2799u9 c2799u9 = nj.e;
            if (c2799u9 != null) {
                c2799u9.a("StaticExperienceManager", "loadImagesIntoImageView - trying to load image from URL: " + image.getUrl());
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.squareup.picasso.Picasso picasso = com.inmobi.media.Yf.f5066a;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(com.inmobi.media.Yf.b(nj.f5284a).load(image.getUrl()).tag(nj.f).transform(new com.inmobi.media.Tf(config)).get());
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
            if (m10801exceptionOrNullimpl != null) {
                com.inmobi.media.C2799u9 c2799u92 = nj.e;
                if (c2799u92 != null) {
                    c2799u92.a("StaticExperienceManager", "Bitmap Failure " + image.getUrl() + io.ktor.sse.ServerSentEventKt.SPACE + m10801exceptionOrNullimpl.getMessage());
                }
                if (m10801exceptionOrNullimpl instanceof com.inmobi.media.C2483ib) {
                    booleanRef.element = true;
                }
            }
            if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                m10798constructorimpl = null;
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) m10798constructorimpl;
            if (bitmap != null) {
                pair = new kotlin.Pair(bitmap, image);
            }
        } while (pair == null);
        if (pair != null) {
            final android.widget.ImageView imageView = this.e;
            final com.inmobi.media.Nj nj2 = this.c;
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(imageView.post(new java.lang.Runnable() { // from class: com.inmobi.media.Kj$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.Kj.a(com.inmobi.media.Nj.this, imageView, pair);
                }
            }));
        }
        com.inmobi.media.C2799u9 c2799u93 = this.c.e;
        if (c2799u93 != null) {
            c2799u93.b("StaticExperienceManager", "Bitmap Load Failure - no images could be loaded");
        }
        com.inmobi.media.Nj nj3 = this.c;
        boolean z = this.d.element;
        nj3.getClass();
        short s = z ? (short) 81 : (short) 82;
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(com.inmobi.media.AbstractC2938zk.a(nj3.c.b.f5000a));
        mutableMap.put("errorCode", java.lang.Short.valueOf(s));
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("MainImageLoadFailure", mutableMap, com.inmobi.media.EnumC2728rk.f5431a);
        throw new com.inmobi.media.C2562lc();
    }
}
