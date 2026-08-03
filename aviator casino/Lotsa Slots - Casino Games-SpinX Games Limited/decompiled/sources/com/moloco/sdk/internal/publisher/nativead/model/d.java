package com.moloco.sdk.internal.publisher.nativead.model;

/* loaded from: classes5.dex */
public final class d {
    public static final int g = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.a> f7143a;
    public final java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.b> b;
    public final java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.C0198c> c;
    public final java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.d> d;
    public final java.util.List<kotlin.Pair<com.moloco.sdk.internal.publisher.nativead.model.b.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> e;
    public final kotlin.Lazy f;

    /* JADX WARN: Multi-variable type inference failed */
    public d(java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.a> data, java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.b> images, java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.C0198c> titles, java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.d> videos, java.util.List<? extends kotlin.Pair<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> failedAssets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(images, "images");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(titles, "titles");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videos, "videos");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedAssets, "failedAssets");
        this.f7143a = data;
        this.b = images;
        this.c = titles;
        this.d = videos;
        this.e = failedAssets;
        this.f = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.model.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.publisher.nativead.model.d.a(com.moloco.sdk.internal.publisher.nativead.model.d.this);
            }
        });
    }

    public final java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.a> a() {
        return this.f7143a;
    }

    public final java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.b> b() {
        return this.b;
    }

    public final java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.C0198c> c() {
        return this.c;
    }

    public final java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.d> d() {
        return this.d;
    }

    public final java.util.List<kotlin.Pair<com.moloco.sdk.internal.publisher.nativead.model.b.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.publisher.nativead.model.d)) {
            return false;
        }
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = (com.moloco.sdk.internal.publisher.nativead.model.d) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7143a, dVar.f7143a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, dVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, dVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, dVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, dVar.e);
    }

    public final java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c> f() {
        return (java.util.Map) this.f.getValue();
    }

    public int hashCode() {
        return (((((((this.f7143a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public java.lang.String toString() {
        return "PreparedNativeAssets(data=" + this.f7143a + ", images=" + this.b + ", titles=" + this.c + ", videos=" + this.d + ", failedAssets=" + this.e + ')';
    }

    public final com.moloco.sdk.internal.publisher.nativead.model.d a(java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.a> data, java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.b> images, java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.C0198c> titles, java.util.Map<java.lang.Integer, com.moloco.sdk.internal.publisher.nativead.model.c.d> videos, java.util.List<? extends kotlin.Pair<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> failedAssets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(images, "images");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(titles, "titles");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videos, "videos");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedAssets, "failedAssets");
        return new com.moloco.sdk.internal.publisher.nativead.model.d(data, images, titles, videos, failedAssets);
    }

    public final android.net.Uri b(int i) {
        com.moloco.sdk.internal.publisher.nativead.model.c.b bVar = this.b.get(java.lang.Integer.valueOf(i));
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public final java.lang.String c(int i) {
        com.moloco.sdk.internal.publisher.nativead.model.c.C0198c c0198c = this.c.get(java.lang.Integer.valueOf(i));
        if (c0198c != null) {
            return c0198c.d();
        }
        return null;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a d(int i) {
        com.moloco.sdk.internal.publisher.nativead.model.c.d dVar = this.d.get(java.lang.Integer.valueOf(i));
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public static /* synthetic */ com.moloco.sdk.internal.publisher.nativead.model.d a(com.moloco.sdk.internal.publisher.nativead.model.d dVar, java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = dVar.f7143a;
        }
        if ((i & 2) != 0) {
            map2 = dVar.b;
        }
        java.util.Map map5 = map2;
        if ((i & 4) != 0) {
            map3 = dVar.c;
        }
        java.util.Map map6 = map3;
        if ((i & 8) != 0) {
            map4 = dVar.d;
        }
        java.util.Map map7 = map4;
        if ((i & 16) != 0) {
            list = dVar.e;
        }
        return dVar.a(map, map5, map6, map7, list);
    }

    public static final java.util.Map a(com.moloco.sdk.internal.publisher.nativead.model.d dVar) {
        return kotlin.collections.MapsKt.plus(kotlin.collections.MapsKt.plus(kotlin.collections.MapsKt.plus(dVar.f7143a, dVar.b), dVar.c), dVar.d);
    }

    public final java.lang.String a(int i) {
        com.moloco.sdk.internal.publisher.nativead.model.c.a aVar = this.f7143a.get(java.lang.Integer.valueOf(i));
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }
}
