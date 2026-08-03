package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

/* loaded from: classes5.dex */
public final class j {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j.a p = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j.a(null);
    public static final int q = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f7931a;
    public java.util.List<java.lang.String> b;
    public final java.util.List<java.lang.String> c;
    public final java.util.List<java.lang.String> d;
    public final java.util.List<java.lang.String> e;
    public final java.util.List<java.lang.String> f;
    public final java.util.List<java.lang.String> g;
    public final java.util.List<java.lang.String> h;
    public java.util.List<java.lang.String> i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l k;
    public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a> l;
    public int m;
    public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l> n;
    public int o;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h linearTracking, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linearTracking, "linearTracking");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j(customUserEventBuilderService, linearTracking.a(), linearTracking.d(), linearTracking.m(), linearTracking.e(), linearTracking.f(), linearTracking.n(), linearTracking.c(), linearTracking.g(), linearTracking.o(), linearTracking.h(), linearTracking.j(), linearTracking.k(), linearTracking.l(), linearTracking.b(), linearTracking.i(), null, null, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, null);
        }

        public a() {
        }
    }

    public static final class b<T> implements java.util.Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) t).a()), java.lang.Long.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) t2).a()));
        }
    }

    public static final class c<T> implements java.util.Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l) t).a()), java.lang.Integer.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l) t2).a()));
        }
    }

    public j(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3, java.util.List<java.lang.String> list4, java.util.List<java.lang.String> list5, java.util.List<java.lang.String> list6, java.util.List<java.lang.String> list7, java.util.List<java.lang.String> list8, java.util.List<java.lang.String> list9, java.util.List<java.lang.String> list10, java.util.List<java.lang.String> list11, java.util.List<java.lang.String> list12, java.util.List<java.lang.String> list13, java.util.List<java.lang.String> list14, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g> list15, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l vastTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f7931a = customUserEventBuilderService;
        this.b = list;
        this.c = list8;
        this.d = list9;
        this.e = list10;
        this.f = list11;
        this.g = list12;
        this.h = list13;
        this.i = list14;
        this.j = buttonTracker;
        this.k = vastTracker;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (list2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a((java.lang.String) it.next(), 0L));
            }
            arrayList.addAll(arrayList3);
        }
        if (list3 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            java.util.Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a((java.lang.String) it2.next(), 0L));
            }
            arrayList.addAll(arrayList4);
        }
        if (list4 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
            java.util.Iterator<T> it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l((java.lang.String) it3.next(), 25));
            }
            arrayList2.addAll(arrayList5);
        }
        if (list5 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
            java.util.Iterator<T> it4 = list5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l((java.lang.String) it4.next(), 50));
            }
            arrayList2.addAll(arrayList6);
        }
        if (list6 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list6, 10));
            java.util.Iterator<T> it5 = list6.iterator();
            while (it5.hasNext()) {
                arrayList7.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l((java.lang.String) it5.next(), 75));
            }
            arrayList2.addAll(arrayList7);
        }
        if (list7 != null) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list7, 10));
            java.util.Iterator<T> it6 = list7.iterator();
            while (it6.hasNext()) {
                arrayList8.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l((java.lang.String) it6.next(), 100));
            }
            arrayList2.addAll(arrayList8);
        }
        if (list15 != null) {
            for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g gVar : list15) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r a2 = gVar.a();
                if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b) {
                    arrayList.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a(gVar.b(), ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b) gVar.a()).b()));
                } else {
                    if (!(a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.a)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrayList2.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l(gVar.b(), ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.a) gVar.a()).b()));
                }
            }
        }
        if (arrayList.size() > 1) {
            kotlin.collections.CollectionsKt.sortWith(arrayList, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j.b());
        }
        this.l = arrayList;
        if (arrayList2.size() > 1) {
            kotlin.collections.CollectionsKt.sortWith(arrayList2, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j.c());
        }
        this.n = arrayList2;
    }

    public static /* synthetic */ void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j jVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        jVar.a(fVar, num, str);
    }

    public static /* synthetic */ void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j jVar, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.b(num, str);
    }

    public static /* synthetic */ void c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j jVar, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.c(num, str);
    }

    public static /* synthetic */ void d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j jVar, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.d(num, str);
    }

    public static /* synthetic */ void e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j jVar, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.e(num, str);
    }

    public static /* synthetic */ void f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j jVar, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.f(num, str);
    }

    public static /* synthetic */ void g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j jVar, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.g(num, str);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f lastClickPosition, java.lang.Integer num, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastClickPosition, "lastClickPosition");
        java.util.List<java.lang.String> list = this.b;
        if (list != null) {
            this.k.a(list, null, num, str, this.j.p(), this.f7931a, lastClickPosition);
            this.b = null;
        }
    }

    public final void b(java.lang.Integer num, java.lang.String str) {
        java.util.List<java.lang.String> list = this.c;
        if (list != null) {
            this.k.a(list, null, num, str);
        }
    }

    public final void c(java.lang.Integer num, java.lang.String str) {
        java.util.List<java.lang.String> list = this.e;
        if (list != null) {
            this.k.a(list, null, num, str);
        }
    }

    public final void d(java.lang.Integer num, java.lang.String str) {
        java.util.List<java.lang.String> list = this.f;
        if (list != null) {
            this.k.a(list, null, num, str);
        }
    }

    public final void e(java.lang.Integer num, java.lang.String str) {
        java.util.List<java.lang.String> list = this.g;
        if (list != null) {
            this.k.a(list, null, num, str);
        }
    }

    public final void f(java.lang.Integer num, java.lang.String str) {
        java.util.List<java.lang.String> list = this.h;
        if (list != null) {
            this.k.a(list, null, num, str);
        }
    }

    public final void g(java.lang.Integer num, java.lang.String str) {
        java.util.List<java.lang.String> list = this.d;
        if (list != null) {
            this.k.a(list, null, num, str);
        }
    }

    public static /* synthetic */ void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j jVar, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.a(num, str);
    }

    public final void a(java.lang.Integer num, java.lang.String str) {
        java.util.List<java.lang.String> list = this.i;
        if (list != null) {
            this.k.a(list, null, num, str);
            this.i = null;
        }
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c button) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        this.j.a(button);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.j.a(buttonType);
    }

    public static /* synthetic */ void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j jVar, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = null;
        }
        jVar.a(str, i, i2);
    }

    public final void a(java.lang.String str, int i, int i2) {
        double d = (i / i2) * 100;
        java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l> list = this.n;
        java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l> subList = list.subList(this.o, list.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : subList) {
            if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l) obj).a() > d) {
                break;
            } else {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l lVar = this.k;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l) it.next()).b());
        }
        lVar.a(arrayList2, null, java.lang.Integer.valueOf(i), str);
        this.o += arrayList.size();
        java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a> list2 = this.l;
        java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a> subList2 = list2.subList(this.m, list2.size());
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : subList2) {
            if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) obj2).a() > i) {
                break;
            } else {
                arrayList3.add(obj2);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l lVar2 = this.k;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) it2.next()).b());
        }
        lVar2.a(arrayList4, null, java.lang.Integer.valueOf(i), str);
        this.m += arrayList3.size();
    }

    public /* synthetic */ j(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, java.util.List list6, java.util.List list7, java.util.List list8, java.util.List list9, java.util.List list10, java.util.List list11, java.util.List list12, java.util.List list13, java.util.List list14, java.util.List list15, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l lVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, (i & 65536) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a() : hVar, (i & 131072) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n.b() : lVar);
    }
}
