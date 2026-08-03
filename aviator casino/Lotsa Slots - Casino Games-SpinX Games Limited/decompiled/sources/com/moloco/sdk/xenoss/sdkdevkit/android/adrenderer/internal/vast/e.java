package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

/* loaded from: classes5.dex */
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.c i = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.c(null);
    public static final long j = 5000;
    public static final int k = 4;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i f7688a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l d;
    public final com.moloco.sdk.internal.services.u e;
    public final io.ktor.client.HttpClient f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p g;
    public final java.lang.String h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> f7689a;
        public final java.util.List<java.lang.String> b;
        public final java.util.List<java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> impressions, java.util.List<java.lang.String> errorUrls, java.util.List<? extends java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> creativesPerWrapper) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressions, "impressions");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorUrls, "errorUrls");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativesPerWrapper, "creativesPerWrapper");
            this.f7689a = impressions;
            this.b = errorUrls;
            this.c = creativesPerWrapper;
        }

        public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> a() {
            return this.f7689a;
        }

        public final java.util.List<java.lang.String> b() {
            return this.b;
        }

        public final java.util.List<java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> c() {
            return this.c;
        }

        public final java.util.List<java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> d() {
            return this.c;
        }

        public final java.util.List<java.lang.String> e() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a)) {
                return false;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f7689a, aVar.f7689a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, aVar.c);
        }

        public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> f() {
            return this.f7689a;
        }

        public int hashCode() {
            return (((this.f7689a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public java.lang.String toString() {
            return "AggregatedWrapperChainAdData(impressions=" + this.f7689a + ", errorUrls=" + this.b + ", creativesPerWrapper=" + this.c + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a a(java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> impressions, java.util.List<java.lang.String> errorUrls, java.util.List<? extends java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> creativesPerWrapper) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressions, "impressions");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorUrls, "errorUrls");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativesPerWrapper, "creativesPerWrapper");
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a(impressions, errorUrls, creativesPerWrapper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a aVar, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f7689a;
            }
            if ((i & 2) != 0) {
                list2 = aVar.b;
            }
            if ((i & 4) != 0) {
                list3 = aVar.c;
            }
            return aVar.a(list, list2, list3);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> f7690a;
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A b;
        public final java.util.List<java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l>> c;
        public final java.util.List<java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e>> d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> linearTrackingList, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A a2, java.util.List<? extends java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l>> iconsPerWrapper, java.util.List<? extends java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e>> companionsPerWrapper) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linearTrackingList, "linearTrackingList");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconsPerWrapper, "iconsPerWrapper");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionsPerWrapper, "companionsPerWrapper");
            this.f7690a = linearTrackingList;
            this.b = a2;
            this.c = iconsPerWrapper;
            this.d = companionsPerWrapper;
        }

        public final java.util.List<java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e>> a() {
            return this.d;
        }

        public final java.util.List<java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l>> b() {
            return this.c;
        }

        public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> c() {
            return this.f7690a;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A d() {
            return this.b;
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }

        public final boolean a(java.lang.String str) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "video/mp4") || kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "video/3gpp") || kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "video/webm");
        }

        public final java.util.List<java.lang.String> a(java.util.Map<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v, ? extends java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u>> map, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar) {
            java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> list = map.get(vVar);
            if (list != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u) it.next()).f());
                }
                return arrayList;
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }

        public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g> a(java.util.Map<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v, ? extends java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u>> map) {
            java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> list = map.get(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.n);
            if (list != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u uVar : list) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g gVar = uVar.e() == null ? null : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g(uVar.f(), uVar.e());
                    if (gVar != null) {
                        arrayList.add(gVar);
                    }
                }
                return arrayList;
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }

        public final java.util.List<java.lang.String> a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A a2) {
            java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z> b;
            if (a2 != null && (b = a2.b()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(b, 10));
                java.util.Iterator<T> it = b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z) it.next()).b());
                }
                return arrayList;
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar) {
            java.lang.String g = gVar.g();
            return !(g == null || kotlin.text.StringsKt.isBlank(g));
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar) {
            java.lang.String c = eVar.c();
            return !(c == null || kotlin.text.StringsKt.isBlank(c));
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar) {
            java.lang.String a2 = qVar.a();
            return !(a2 == null || kotlin.text.StringsKt.isBlank(a2));
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l lVar) {
            java.lang.String a2 = lVar.a();
            return !(a2 == null || kotlin.text.StringsKt.isBlank(a2));
        }

        public final <T> java.util.Set<T> a(java.util.Set<? extends T> set, T t) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            if (set != null) {
                kotlin.collections.CollectionsKt.addAll(linkedHashSet, set);
            }
            if (t != null) {
                linkedHashSet.add(t);
            }
            return linkedHashSet;
        }

        public final <T> java.util.List<T> a(java.util.List<? extends T> list, java.util.List<? extends T> list2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (list != null) {
                kotlin.collections.CollectionsKt.addAll(arrayList, list);
            }
            if (list2 != null) {
                kotlin.collections.CollectionsKt.addAll(arrayList, list2);
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> java.util.List<T> a(java.util.List<? extends T> list, T t) {
            java.util.List<T> a2;
            return (t == null || (a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.i.a((java.util.List) list, (java.util.List) kotlin.collections.CollectionsKt.listOf(t))) == null) ? list == 0 ? kotlin.collections.CollectionsKt.emptyList() : list : a2;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h a(java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A a2) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.Object obj : list) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v d = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u) obj).d();
                java.lang.Object obj2 = linkedHashMap.get(d);
                if (obj2 == null) {
                    obj2 = new java.util.ArrayList();
                    linkedHashMap.put(d, obj2);
                }
                ((java.util.List) obj2).add(obj);
            }
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h(a(a2), a(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f7788a), a(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.b), a(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.c), a(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.d), a(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.e), a(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f), a(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.g), a(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.h), a(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.i), a(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.k), a(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.j), a(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.m), a(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.l), a(linkedHashMap));
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f7691a;
        public final java.util.Set<java.lang.String> b;
        public final boolean c;
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a d;

        public d(int i, java.util.Set<java.lang.String> usedVastAdTagUrls, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a aggregatedWrapperChainData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(usedVastAdTagUrls, "usedVastAdTagUrls");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregatedWrapperChainData, "aggregatedWrapperChainData");
            this.f7691a = i;
            this.b = usedVastAdTagUrls;
            this.c = z;
            this.d = aggregatedWrapperChainData;
        }

        public final int a() {
            return this.f7691a;
        }

        public final java.util.Set<java.lang.String> b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a d() {
            return this.d;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a e() {
            return this.d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d)) {
                return false;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d) obj;
            return this.f7691a == dVar.f7691a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, dVar.b) && this.c == dVar.c && kotlin.jvm.internal.Intrinsics.areEqual(this.d, dVar.d);
        }

        public final boolean f() {
            return this.c;
        }

        public final java.util.Set<java.lang.String> g() {
            return this.b;
        }

        public final int h() {
            return this.f7691a;
        }

        public int hashCode() {
            return (((((this.f7691a * 31) + this.b.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.c)) * 31) + this.d.hashCode();
        }

        public java.lang.String toString() {
            return "WrapperChainParams(wrapperDepth=" + this.f7691a + ", usedVastAdTagUrls=" + this.b + ", followAdditionalWrappers=" + this.c + ", aggregatedWrapperChainData=" + this.d + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d a(int i, java.util.Set<java.lang.String> usedVastAdTagUrls, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a aggregatedWrapperChainData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(usedVastAdTagUrls, "usedVastAdTagUrls");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregatedWrapperChainData, "aggregatedWrapperChainData");
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d(i, usedVastAdTagUrls, z, aggregatedWrapperChainData);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d dVar, int i, java.util.Set set, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a aVar, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = dVar.f7691a;
            }
            if ((i2 & 2) != 0) {
                set = dVar.b;
            }
            if ((i2 & 4) != 0) {
                z = dVar.c;
            }
            if ((i2 & 8) != 0) {
                aVar = dVar.d;
            }
            return dVar.a(i, set, z, aVar);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", i = {0, 0, 0}, l = {161, 172}, m = "invoke", n = {"this", "mtid", "isStreamingEnabled"}, s = {"L$0", "L$1", "Z$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$e, reason: collision with other inner class name */
    public static final class C0282e extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7692a;
        public java.lang.Object b;
        public boolean c;
        public /* synthetic */ java.lang.Object d;
        public int f;

        public C0282e(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.C0282e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this.a((java.lang.String) null, (java.lang.String) null, false, (kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>) this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$invoke$renderAdResult$1", f = "VastAdLoader.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7693a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ java.lang.String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w wVar, boolean z, java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.f> continuation) {
            super(2, continuation);
            this.c = wVar;
            this.d = z;
            this.e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.f) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this.new f(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7693a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w wVar = this.c;
                double b = eVar.b();
                com.moloco.sdk.common_adapter_internal.ScreenData invoke = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this.g.invoke();
                boolean z = this.d;
                java.lang.String str = this.e;
                this.f7693a = 1;
                obj = eVar.a(wVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d) null, b, invoke, z, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", i = {0, 0, 1, 1, 2, 2}, l = {814, 365, 376}, m = "loadAndParseWrapperVastDocument", n = {"this", "vastErrorUrls", "this", "vastErrorUrls", "this", "vastErrorUrls"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class g extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7694a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public g(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B) null, (java.util.List<java.lang.String>) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {427}, m = "tryLoadInLineRenderAd", n = {"this", "inline", "aggregatedWrapperChainData", "screenData", "mtid", "aggregatedErrorUrls", "preparedWrapperDataForInline$delegate", "renderLinearNullable", "renderCompanion", "renderLinearError", "creative", "targetLinearFileSizeInMegabytes", "isStreamingEnabled"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$11", "D$0", "Z$0"})
    public static final class h extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7695a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public java.lang.Object f;
        public java.lang.Object g;
        public java.lang.Object h;
        public java.lang.Object i;
        public java.lang.Object j;
        public java.lang.Object k;
        public java.lang.Object l;
        public double m;
        public boolean n;
        public /* synthetic */ java.lang.Object o;
        public int q;

        public h(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.o = obj;
            this.q |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a) null, 0.0d, (com.moloco.sdk.common_adapter_internal.ScreenData) null, false, (java.lang.String) null, (kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>) this);
        }
    }

    public static final class i implements kotlinx.coroutines.flow.Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.Flow f7696a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d c;
        public final /* synthetic */ double d;
        public final /* synthetic */ com.moloco.sdk.common_adapter_internal.ScreenData e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ java.lang.String g;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef h;

        public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f7697a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d c;
            public final /* synthetic */ double d;
            public final /* synthetic */ com.moloco.sdk.common_adapter_internal.ScreenData e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ java.lang.String g;
            public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef h;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$tryLoadVastRenderAd$$inlined$mapNotNull$1$2", f = "VastAdLoader.kt", i = {0, 0, 1, 1}, l = {54, 65, 86}, m = "emit", n = {"this", "$this$mapNotNull_u24lambda_u246", "this", "$this$mapNotNull_u24lambda_u246"}, s = {"L$0", "L$1", "L$0", "L$1"})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$i$a$a, reason: collision with other inner class name */
            public static final class C0283a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ java.lang.Object f7698a;
                public int b;
                public java.lang.Object c;
                public java.lang.Object e;

                public C0283a(kotlin.coroutines.Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    this.f7698a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.i.a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.FlowCollector flowCollector, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d dVar, double d, com.moloco.sdk.common_adapter_internal.ScreenData screenData, boolean z, java.lang.String str, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
                this.f7697a = flowCollector;
                this.b = eVar;
                this.c = dVar;
                this.d = d;
                this.e = screenData;
                this.f = z;
                this.g = str;
                this.h = objectRef;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0101  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0140  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.i.a.C0283a c0283a;
                int i;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.i.a<T> aVar;
                kotlinx.coroutines.flow.FlowCollector flowCollector;
                com.moloco.sdk.internal.v vVar;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar2;
                if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.i.a.C0283a) {
                    c0283a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.i.a.C0283a) continuation;
                    int i2 = c0283a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0283a.b = i2 - Integer.MIN_VALUE;
                        java.lang.Object obj2 = c0283a.f7698a;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c0283a.b;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.f7697a;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b a2 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C3490a) obj).a();
                            if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b.C0286b) {
                                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.b.h, "Found Wrapper child element, trying load wrapper render Ad", null, false, 12, null);
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar = this.b;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B a3 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b.C0286b) a2).a();
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d dVar = this.c;
                                double d = this.d;
                                com.moloco.sdk.common_adapter_internal.ScreenData screenData = this.e;
                                boolean z = this.f;
                                java.lang.String str = this.g;
                                c0283a.c = this;
                                c0283a.e = flowCollector2;
                                c0283a.b = 1;
                                java.lang.Object a4 = eVar.a(a3, dVar, d, screenData, z, str, c0283a);
                                if (a4 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                aVar = this;
                                flowCollector = flowCollector2;
                                obj2 = a4;
                                vVar = (com.moloco.sdk.internal.v) obj2;
                            } else {
                                if (!(a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b.a)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.b.h, "Found InLine child element, trying load render Ad", null, false, 12, null);
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar2 = this.b;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o a5 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b.a) a2).a();
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d dVar2 = this.c;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a e = dVar2 != null ? dVar2.e() : null;
                                double d2 = this.d;
                                com.moloco.sdk.common_adapter_internal.ScreenData screenData2 = this.e;
                                boolean z2 = this.f;
                                java.lang.String str2 = this.g;
                                c0283a.c = this;
                                c0283a.e = flowCollector2;
                                c0283a.b = 2;
                                java.lang.Object a6 = eVar2.a(a5, e, d2, screenData2, z2, str2, c0283a);
                                if (a6 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                aVar = this;
                                flowCollector = flowCollector2;
                                obj2 = a6;
                                vVar = (com.moloco.sdk.internal.v) obj2;
                            }
                        } else if (i == 1) {
                            flowCollector = (kotlinx.coroutines.flow.FlowCollector) c0283a.e;
                            aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.i.a) c0283a.c;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            vVar = (com.moloco.sdk.internal.v) obj2;
                        } else {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                                return kotlin.Unit.INSTANCE;
                            }
                            flowCollector = (kotlinx.coroutines.flow.FlowCollector) c0283a.e;
                            aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.i.a) c0283a.c;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            vVar = (com.moloco.sdk.internal.v) obj2;
                        }
                        if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                            com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                            java.lang.String str3 = aVar.b.h;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to load the ad with error: ");
                            com.moloco.sdk.internal.v.a aVar3 = (com.moloco.sdk.internal.v.a) vVar;
                            sb.append(aVar3.a());
                            com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger, str3, sb.toString(), null, false, 12, null);
                            aVar.h.element = (T) aVar3.a();
                            aVar2 = null;
                        } else {
                            if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((com.moloco.sdk.internal.v.b) vVar).a();
                        }
                        if (aVar2 != null) {
                            c0283a.c = null;
                            c0283a.e = null;
                            c0283a.b = 3;
                            if (flowCollector.emit(aVar2, c0283a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                c0283a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.i.a.C0283a(continuation);
                java.lang.Object obj22 = c0283a.f7698a;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0283a.b;
                if (i != 0) {
                }
                if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                }
                if (aVar2 != null) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        public i(kotlinx.coroutines.flow.Flow flow, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d dVar, double d, com.moloco.sdk.common_adapter_internal.ScreenData screenData, boolean z, java.lang.String str, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
            this.f7696a = flow;
            this.b = eVar;
            this.c = dVar;
            this.d = d;
            this.e = screenData;
            this.f = z;
            this.g = str;
            this.h = objectRef;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a> flowCollector, kotlin.coroutines.Continuation continuation) {
            java.lang.Object collect = this.f7696a.collect(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.i.a(flowCollector, this.b, this.c, this.d, this.e, this.f, this.g, this.h), continuation);
            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
        }
    }

    public static final class j<T> implements java.util.Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C3490a) t).c(), ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C3490a) t2).c());
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", i = {0, 0}, l = {289}, m = "tryLoadVastRenderAd", n = {"this", "adLoadError"}, s = {"L$0", "L$1"})
    public static final class k extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7699a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public k(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d) null, 0.0d, (com.moloco.sdk.common_adapter_internal.ScreenData) null, false, (java.lang.String) null, (kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>) this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 337}, m = "tryLoadWrapperRenderAd", n = {"this", "wrapper", "wrapperChainParams", "screenData", "mtid", "aggregatedErrorUrls", "targetLinearFileSizeInMegabytes", "isStreamingEnabled", "currentWrapperDepth"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "D$0", "Z$0", "I$0"})
    public static final class l extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7700a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public java.lang.Object f;
        public double g;
        public boolean h;
        public int i;
        public /* synthetic */ java.lang.Object j;
        public int l;

        public l(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d) null, 0.0d, (com.moloco.sdk.common_adapter_internal.ScreenData) null, false, (java.lang.String) null, (kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>) this);
        }
    }

    public static final class m implements kotlinx.coroutines.flow.Flow<kotlin.Pair<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q, ? extends java.io.File>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.Flow f7701a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e c;
        public final /* synthetic */ java.lang.String d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;

        public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f7702a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e c;
            public final /* synthetic */ java.lang.String d;
            public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$tryPrepareInLineRenderLinear$$inlined$mapNotNull$1$2", f = "VastAdLoader.kt", i = {0, 0, 0, 1, 1, 1}, l = {53, 71, 82}, m = "emit", n = {"this", "$this$mapNotNull_u24lambda_u246", "vastMediaFile", "this", "$this$mapNotNull_u24lambda_u246", "vastMediaFile"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$m$a$a, reason: collision with other inner class name */
            public static final class C0284a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ java.lang.Object f7703a;
                public int b;
                public java.lang.Object c;
                public java.lang.Object e;
                public java.lang.Object f;

                public C0284a(kotlin.coroutines.Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    this.f7703a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.m.a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.FlowCollector flowCollector, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar, java.lang.String str, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
                this.f7702a = flowCollector;
                this.b = z;
                this.c = eVar;
                this.d = str;
                this.e = objectRef;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.m.a.C0284a c0284a;
                int i;
                kotlinx.coroutines.flow.FlowCollector flowCollector;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.m.a<T> aVar;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.m.a<T> aVar2;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar;
                kotlin.Pair pair;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a aVar3;
                if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.m.a.C0284a) {
                    c0284a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.m.a.C0284a) continuation;
                    int i2 = c0284a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0284a.b = i2 - Integer.MIN_VALUE;
                        java.lang.Object obj2 = c0284a.f7703a;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c0284a.b;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            flowCollector = this.f7702a;
                            qVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj;
                            if (this.b) {
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i iVar = this.c.c;
                                java.lang.String g = qVar.g();
                                java.lang.String str = this.d;
                                c0284a.c = this;
                                c0284a.e = flowCollector;
                                c0284a.f = qVar;
                                c0284a.b = 1;
                                obj2 = iVar.a(g, str, c0284a);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                aVar2 = this;
                                cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) obj2;
                                if (!(cVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a)) {
                                }
                                if (pair != null) {
                                }
                            } else {
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i iVar2 = this.c.c;
                                java.lang.String g2 = qVar.g();
                                c0284a.c = this;
                                c0284a.e = flowCollector;
                                c0284a.f = qVar;
                                c0284a.b = 2;
                                obj2 = iVar2.a(g2, c0284a);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                aVar = this;
                                aVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a) obj2;
                                if (!(aVar3 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b)) {
                                }
                            }
                        } else if (i == 1) {
                            qVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) c0284a.f;
                            flowCollector = (kotlinx.coroutines.flow.FlowCollector) c0284a.e;
                            aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.m.a) c0284a.c;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) obj2;
                            if (!(cVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a)) {
                                pair = kotlin.TuplesKt.to(qVar, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a) cVar).b());
                            } else if (cVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c) {
                                pair = kotlin.TuplesKt.to(qVar, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c) cVar).c());
                            } else {
                                if (!(cVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                aVar2.e.element = (T) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b) cVar).b());
                                pair = null;
                            }
                            if (pair != null) {
                            }
                        } else if (i == 2) {
                            qVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) c0284a.f;
                            flowCollector = (kotlinx.coroutines.flow.FlowCollector) c0284a.e;
                            aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.m.a) c0284a.c;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            aVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a) obj2;
                            if (!(aVar3 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b)) {
                                pair = kotlin.TuplesKt.to(qVar, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b) aVar3).a());
                                if (pair != null) {
                                    c0284a.c = null;
                                    c0284a.e = null;
                                    c0284a.f = null;
                                    c0284a.b = 3;
                                    if (flowCollector.emit(pair, c0284a) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (!(aVar3 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                aVar.e.element = (T) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a) aVar3);
                                pair = null;
                                if (pair != null) {
                                }
                            }
                        } else {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj2);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                c0284a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.m.a.C0284a(continuation);
                java.lang.Object obj22 = c0284a.f7703a;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0284a.b;
                if (i != 0) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        public m(kotlinx.coroutines.flow.Flow flow, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar, java.lang.String str, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
            this.f7701a = flow;
            this.b = z;
            this.c = eVar;
            this.d = str;
            this.e = objectRef;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super kotlin.Pair<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q, ? extends java.io.File>> flowCollector, kotlin.coroutines.Continuation continuation) {
            java.lang.Object collect = this.f7701a.collect(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.m.a(flowCollector, this.b, this.c, this.d, this.e), continuation);
            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", i = {0, 0, 0, 0, 0}, l = {574}, m = "tryPrepareInLineRenderLinear", n = {"this", "linear", "wrapperLinearTrackingList", "wrapperVideoClicks", "vastError"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class n extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7704a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public /* synthetic */ java.lang.Object f;
        public int h;

        public n(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p) null, (java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u>) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A) null, (java.util.List<java.lang.String>) null, 0.0d, (java.lang.Long) null, (com.moloco.sdk.common_adapter_internal.ScreenData) null, false, (java.lang.String) null, (kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>) this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", i = {0, 0}, l = {100}, m = "waitForAdLoadToStart-8Mi8wO0", n = {"this", "ad"}, s = {"L$0", "L$1"})
    public static final class o extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7705a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public o(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$waitForAdLoadToStart$streamStatus$1", f = "VastAdLoader.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7706a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a c;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$waitForAdLoadToStart$streamStatus$1$1", f = "VastAdLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7707a;
            public /* synthetic */ java.lang.Object b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.p.a> continuation) {
                super(2, continuation);
                this.c = eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.p.a) create(cVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.p.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.p.a(this.c, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7707a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) this.b;
                if (cVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c) {
                    com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                    java.lang.String str = this.c.h;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Stream status: ");
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c c0237c = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c) cVar;
                    sb.append(c0237c.d().c());
                    sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                    sb.append(c0237c.d().d());
                    sb.append(" bytes downloaded");
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str, sb.toString(), null, false, 12, null);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean((cVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a) || (cVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.p> continuation) {
            super(2, continuation);
            this.c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.p) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this.new p(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7706a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c> b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this.c.b(this.c.j().l());
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.p.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.p.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this, null);
                this.f7706a = 1;
                obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(b, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i parseVast, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l mediaConfig, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i mediaCacheRepository, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l vastTracker, com.moloco.sdk.internal.services.u connectivityService, io.ktor.client.HttpClient httpClient, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p screenService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parseVast, "parseVast");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaConfig, "mediaConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityService, "connectivityService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenService, "screenService");
        this.f7688a = parseVast;
        this.b = mediaConfig;
        this.c = mediaCacheRepository;
        this.d = vastTracker;
        this.e = connectivityService;
        this.f = httpClient;
        this.g = screenService;
        this.h = "VastAdLoaderImpl";
    }

    public final double a(long j2, int i2) {
        return (j2 * 8) / (i2 * 1000);
    }

    public final double b() {
        return !this.e.b() ? 10.0d : 2.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, long j2, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.o oVar;
        int i2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.o) {
            oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.o) continuation;
            int i3 = oVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.e = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = oVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = oVar.e;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.h, "Waiting for " + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(j2)) + " to load the vast media file: " + this.c, null, false, 12, null);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.p pVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.p(aVar, null);
                    oVar.f7705a = this;
                    oVar.b = aVar;
                    oVar.e = 1;
                    obj = kotlinx.coroutines.TimeoutKt.m12302withTimeoutOrNullKLykuaI(j2, pVar, oVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eVar = this;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) oVar.b;
                    eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e) oVar.f7705a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) obj;
                com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, eVar.h, "Either timeout occurred or media file streaming had terminal status", null, false, 12, null);
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, eVar.h, "Stream status: " + cVar + " on timeout", null, false, 12, null);
                if (cVar != null) {
                    java.io.File j3 = aVar.j().j();
                    if (j3.exists() && j3.length() != 0) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, eVar.h, "Local vast media resource exists and has some content. Checking for bitrate information", null, false, 12, null);
                        if (aVar.j().k() != null) {
                            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, eVar.h, "Checking for playability of VAST ad with bitrate: " + aVar.j().k(), null, false, 12, null);
                            double a2 = eVar.a(j3.length(), aVar.j().k().intValue());
                            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, eVar.h, "VAST ad has playable duration: " + a2 + " seconds", null, false, 12, null);
                            if (a2 < eVar.b.g()) {
                                com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger, eVar.h, "VAST does not have enough playable duration, so failing ", null, false, 12, null);
                                return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.y);
                            }
                        } else {
                            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, eVar.h, "VAST ad playable duration cannot be determined due to no bitrate information", null, false, 12, null);
                            return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.z);
                        }
                    } else {
                        com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger, eVar.h, j3.getAbsolutePath() + " does not exist or is empty", null, false, 12, null);
                        com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger, eVar.h, "Failed to start streaming media file, reporting timeout error", null, false, 12, null);
                        return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.x);
                    }
                } else {
                    if (cVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, eVar.h, "Streamed entire file successfully", null, false, 12, null);
                        return new com.moloco.sdk.internal.v.b(aVar);
                    }
                    if (cVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, eVar.h, "Failed to stream file", null, false, 12, null);
                        return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b) cVar).b()));
                    }
                }
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, eVar.h, "Media file partially exists and ready for streaming", null, false, 12, null);
                return new com.moloco.sdk.internal.v.b(aVar);
            }
        }
        oVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.o(continuation);
        java.lang.Object obj2 = oVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = oVar.e;
        if (i2 != 0) {
        }
        cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) obj2;
        com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, eVar.h, "Either timeout occurred or media file streaming had terminal status", null, false, 12, null);
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, eVar.h, "Stream status: " + cVar + " on timeout", null, false, 12, null);
        if (cVar != null) {
        }
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, eVar.h, "Media file partially exists and ready for streaming", null, false, 12, null);
        return new com.moloco.sdk.internal.v.b(aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        return this.c.a(url);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.C0282e c0282e;
        int i2;
        java.lang.String str3;
        boolean z2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar;
        com.moloco.sdk.internal.v vVar;
        com.moloco.sdk.internal.v vVar2;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.C0282e) {
            c0282e = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.C0282e) continuation;
            int i3 = c0282e.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0282e.f = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c0282e.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0282e.f;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i iVar = this.f7688a;
                    c0282e.f7692a = this;
                    c0282e.b = str2;
                    c0282e.c = z;
                    c0282e.f = 1;
                    obj = iVar.a(str, c0282e);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str2;
                    z2 = z;
                    eVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        vVar2 = (com.moloco.sdk.internal.v) obj;
                        if (!(vVar2 instanceof com.moloco.sdk.internal.v.a)) {
                            return new com.moloco.sdk.internal.v.a(((com.moloco.sdk.internal.v.a) vVar2).a());
                        }
                        if (vVar2 instanceof com.moloco.sdk.internal.v.b) {
                            return new com.moloco.sdk.internal.v.b(((com.moloco.sdk.internal.v.b) vVar2).a());
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    boolean z3 = c0282e.c;
                    java.lang.String str4 = (java.lang.String) c0282e.b;
                    eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e) c0282e.f7692a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    z2 = z3;
                    str3 = str4;
                }
                vVar = (com.moloco.sdk.internal.v) obj;
                if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                    com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                    java.lang.String str5 = eVar.h;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse vast XML: ");
                    com.moloco.sdk.internal.v.a aVar = (com.moloco.sdk.internal.v.a) vVar;
                    sb.append(aVar.a());
                    com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger, str5, sb.toString(), null, false, 12, null);
                    return new com.moloco.sdk.internal.v.a(aVar.a());
                }
                if (vVar instanceof com.moloco.sdk.internal.v.b) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w wVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w) ((com.moloco.sdk.internal.v.b) vVar).a();
                    kotlin.coroutines.CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.f fVar = eVar.new f(wVar, z2, str3, null);
                    c0282e.f7692a = null;
                    c0282e.b = null;
                    c0282e.f = 2;
                    obj = kotlinx.coroutines.BuildersKt.withContext(coroutineContext, fVar, c0282e);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    vVar2 = (com.moloco.sdk.internal.v) obj;
                    if (!(vVar2 instanceof com.moloco.sdk.internal.v.a)) {
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        c0282e = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.C0282e(continuation);
        java.lang.Object obj2 = c0282e.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0282e.f;
        if (i2 != 0) {
        }
        vVar = (com.moloco.sdk.internal.v) obj2;
        if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
        }
    }

    public static /* synthetic */ void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar, java.util.List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            xVar = null;
        }
        eVar.a((java.util.List<java.lang.String>) list, xVar);
    }

    public final void a(java.util.List<java.lang.String> list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a.a(this.d, list, xVar, null, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w wVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d dVar, double d2, com.moloco.sdk.common_adapter_internal.ScreenData screenData, boolean z, java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.k kVar;
        int i2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a e;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.k) {
            kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.k) continuation;
            int i3 = kVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.e = i3 - Integer.MIN_VALUE;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.k kVar2 = kVar;
                java.lang.Object obj = kVar2.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = kVar2.e;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.h, "Loading vast ad with wrapperChainParams: " + dVar, null, false, 12, null);
                    java.util.List<java.lang.String> a2 = i.a((java.util.List<? extends java.util.List<java.lang.String>>) ((dVar == null || (e = dVar.e()) == null) ? null : e.e()), (java.util.List<java.lang.String>) wVar.b());
                    if (wVar.a().isEmpty()) {
                        a(a2, dVar != null ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f : null);
                        return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.d);
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d a3 = dVar != null ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d.a(dVar, 0, null, false, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a.a(dVar.e(), null, a2, null, 5, null), 7, null) : null;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef2.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.F;
                    java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C3490a> a4 = wVar.a();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : a4) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C3490a c3490a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C3490a) obj2;
                        if (c3490a.c() == null || new kotlin.ranges.IntRange(0, 1).contains(c3490a.c().intValue())) {
                            arrayList.add(obj2);
                        }
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.i iVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.i(kotlinx.coroutines.flow.FlowKt.cancellable(kotlinx.coroutines.flow.FlowKt.asFlow(kotlin.collections.CollectionsKt.sortedWith(arrayList, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.j()))), this, a3, d2, screenData, z, str, objectRef2);
                    kVar2.f7699a = this;
                    kVar2.b = objectRef2;
                    kVar2.e = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(iVar, kVar2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eVar = this;
                    objectRef = objectRef2;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) kVar2.b;
                    eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e) kVar2.f7699a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) obj;
                if (aVar != null) {
                    com.moloco.sdk.internal.v.a aVar2 = new com.moloco.sdk.internal.v.a(objectRef.element);
                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, eVar.h, "Failed to load linear: " + objectRef.element, null, false, 12, null);
                    return aVar2;
                }
                return new com.moloco.sdk.internal.v.b(aVar);
            }
        }
        kVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.k(continuation);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.k kVar22 = kVar;
        java.lang.Object obj3 = kVar22.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = kVar22.e;
        if (i2 != 0) {
        }
        aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) obj3;
        if (aVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B b2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d dVar, double d2, com.moloco.sdk.common_adapter_internal.ScreenData screenData, boolean z, java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.l lVar;
        int i2;
        double d3;
        boolean z2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d dVar2;
        java.util.List<java.lang.String> list;
        java.lang.String str2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B b3;
        int i3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar;
        com.moloco.sdk.common_adapter_internal.ScreenData screenData2;
        java.util.Set<java.lang.String> g2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a e;
        com.moloco.sdk.internal.v vVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a e2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a e3;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.l) {
            lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.l) continuation;
            int i4 = lVar.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lVar.l = i4 - Integer.MIN_VALUE;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.l lVar2 = lVar;
                java.lang.Object obj = lVar2.j;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = lVar2.l;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, this.h, "Loading wrapper vast ad: " + b2.f(), null, false, 12, null);
                    int h2 = dVar != null ? dVar.h() + 1 : 0;
                    java.util.List<java.lang.String> a2 = i.a((java.util.List) ((dVar == null || (e = dVar.e()) == null) ? null : e.e()), (java.util.List) b2.c());
                    if (h2 <= 4 && ((dVar == null || (g2 = dVar.g()) == null || !g2.contains(b2.f())) && (dVar == null || dVar.f()))) {
                        lVar2.f7700a = this;
                        lVar2.b = b2;
                        lVar2.c = dVar;
                        lVar2.d = screenData;
                        lVar2.e = str;
                        lVar2.f = a2;
                        d3 = d2;
                        lVar2.g = d3;
                        z2 = z;
                        lVar2.h = z2;
                        lVar2.i = h2;
                        lVar2.l = 1;
                        java.lang.Object a3 = a(b2, a2, lVar2);
                        if (a3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dVar2 = dVar;
                        list = a2;
                        str2 = str;
                        b3 = b2;
                        i3 = h2;
                        eVar = this;
                        screenData2 = screenData;
                        obj = a3;
                    } else {
                        a(a2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.e);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k kVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.e;
                        com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger, this.h, "Failed to load wrapper vast ad: " + kVar, null, false, 12, null);
                        return new com.moloco.sdk.internal.v.a(kVar);
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = lVar2.i;
                    boolean z3 = lVar2.h;
                    d3 = lVar2.g;
                    java.util.List<java.lang.String> list2 = (java.util.List) lVar2.f;
                    java.lang.String str3 = (java.lang.String) lVar2.e;
                    screenData2 = (com.moloco.sdk.common_adapter_internal.ScreenData) lVar2.d;
                    dVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d) lVar2.c;
                    b3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B) lVar2.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e) lVar2.f7700a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = str3;
                    z2 = z3;
                    list = list2;
                    eVar = eVar2;
                }
                vVar = (com.moloco.sdk.internal.v) obj;
                if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                    com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                    java.lang.String str4 = eVar.h;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to load wrapper vast ad: ");
                    com.moloco.sdk.internal.v.a aVar = (com.moloco.sdk.internal.v.a) vVar;
                    sb.append(aVar.a());
                    com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger2, str4, sb.toString(), null, false, 12, null);
                    return new com.moloco.sdk.internal.v.a(aVar.a());
                }
                if (vVar instanceof com.moloco.sdk.internal.v.b) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w wVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w) ((com.moloco.sdk.internal.v.b) vVar).a();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.c cVar = i;
                    java.util.List a4 = cVar.a((java.util.List) ((dVar2 == null || (e3 = dVar2.e()) == null) ? null : e3.f()), (java.util.List) b3.e());
                    java.util.List a5 = cVar.a((java.util.List) ((dVar2 == null || (e2 = dVar2.e()) == null) ? null : e2.d()), kotlin.collections.CollectionsKt.listOf(b3.b()));
                    java.util.Set a6 = cVar.a(dVar2 != null ? dVar2.g() : null, (java.util.Set<java.lang.String>) b3.f());
                    java.lang.Boolean d4 = b3.d();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d dVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d(i3, a6, d4 != null ? d4.booleanValue() : true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a(a4, list, a5));
                    lVar2.f7700a = null;
                    lVar2.b = null;
                    lVar2.c = null;
                    lVar2.d = null;
                    lVar2.e = null;
                    lVar2.f = null;
                    lVar2.l = 2;
                    obj = eVar.a(wVar, dVar3, d3, screenData2, z2, str2, lVar2);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.l(continuation);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.l lVar22 = lVar;
        java.lang.Object obj2 = lVar22.j;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = lVar22.l;
        if (i2 != 0) {
        }
        vVar = (com.moloco.sdk.internal.v) obj2;
        if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B b2, java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.g gVar;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        ?? r5;
        java.lang.Exception exc;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar;
        ?? r52;
        io.ktor.client.plugins.HttpRequestTimeoutException httpRequestTimeoutException;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar2;
        ?? r53;
        java.lang.Exception exc2;
        java.util.List<java.lang.String> list2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar3;
        io.ktor.client.plugins.HttpRequestTimeoutException httpRequestTimeoutException2;
        java.util.List<java.lang.String> list3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar4;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w wVar;
        try {
            try {
                if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.g) {
                    gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.g) continuation;
                    int i2 = gVar.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        gVar.e = i2 - Integer.MIN_VALUE;
                        obj = gVar.c;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        r5 = gVar.e;
                        if (r5 != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            try {
                                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.h, "Fetching wrapper vast tag url: " + b2.f(), null, false, 12, null);
                                io.ktor.client.HttpClient httpClient = this.f;
                                java.lang.String f2 = b2.f();
                                io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                                io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, f2);
                                com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(httpRequestBuilder, 5000L);
                                httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                                io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                                gVar.f7694a = this;
                                list3 = list;
                                try {
                                    gVar.b = list3;
                                    gVar.e = 1;
                                    obj = httpStatement.execute(gVar);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    list2 = list3;
                                    eVar3 = this;
                                } catch (io.ktor.client.plugins.HttpRequestTimeoutException e) {
                                    e = e;
                                    httpRequestTimeoutException = e;
                                    eVar2 = this;
                                    r53 = list3;
                                    httpRequestTimeoutException2 = httpRequestTimeoutException;
                                    list2 = r53;
                                    eVar3 = eVar2;
                                    eVar3.a(list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.d);
                                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, eVar3.h, "Fetching wrapper vast tag url timed out", httpRequestTimeoutException2, false, 8, null);
                                    return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f);
                                } catch (java.lang.Exception e2) {
                                    e = e2;
                                    exc = e;
                                    eVar = this;
                                    r52 = list3;
                                    exc2 = exc;
                                    list2 = r52;
                                    eVar3 = eVar;
                                    eVar3.a(list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.c);
                                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, eVar3.h, "Fetching wrapper vast tag url fetch error", exc2, false, 8, null);
                                    return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.g);
                                }
                            } catch (io.ktor.client.plugins.HttpRequestTimeoutException e3) {
                                e = e3;
                                list3 = list;
                            } catch (java.lang.Exception e4) {
                                e = e4;
                                list3 = list;
                            }
                        } else if (r5 == 1) {
                            list2 = (java.util.List) gVar.b;
                            eVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e) gVar.f7694a;
                            kotlin.ResultKt.throwOnFailure(obj);
                        } else {
                            if (r5 != 2) {
                                if (r5 != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                list2 = (java.util.List) gVar.b;
                                eVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e) gVar.f7694a;
                                kotlin.ResultKt.throwOnFailure(obj);
                                com.moloco.sdk.internal.v.b bVar = !(obj instanceof com.moloco.sdk.internal.v.b) ? (com.moloco.sdk.internal.v.b) obj : null;
                                wVar = bVar != null ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w) bVar.a() : null;
                                if (wVar != null) {
                                    eVar4.a(list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.b);
                                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, eVar4.h, "Failed to create VAST object from XML", null, false, 12, null);
                                    return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.b);
                                }
                                return new com.moloco.sdk.internal.v.b(wVar);
                            }
                            list2 = (java.util.List) gVar.b;
                            eVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e) gVar.f7694a;
                            kotlin.ResultKt.throwOnFailure(obj);
                            java.lang.String str = (java.lang.String) obj;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i iVar = eVar3.f7688a;
                            gVar.f7694a = eVar3;
                            gVar.b = list2;
                            gVar.e = 3;
                            obj = iVar.a(str, gVar);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            eVar4 = eVar3;
                            if (!(obj instanceof com.moloco.sdk.internal.v.b)) {
                            }
                            if (bVar != null) {
                            }
                            if (wVar != null) {
                            }
                        }
                        gVar.f7694a = eVar3;
                        gVar.b = list2;
                        gVar.e = 2;
                        obj = io.ktor.client.statement.HttpResponseKt.bodyAsText$default((io.ktor.client.statement.HttpResponse) obj, null, gVar, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i iVar2 = eVar3.f7688a;
                        gVar.f7694a = eVar3;
                        gVar.b = list2;
                        gVar.e = 3;
                        obj = iVar2.a(str2, gVar);
                        if (obj == coroutine_suspended) {
                        }
                    }
                }
                java.lang.String str22 = (java.lang.String) obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i iVar22 = eVar3.f7688a;
                gVar.f7694a = eVar3;
                gVar.b = list2;
                gVar.e = 3;
                obj = iVar22.a(str22, gVar);
                if (obj == coroutine_suspended) {
                }
            } catch (io.ktor.client.plugins.HttpRequestTimeoutException e5) {
                httpRequestTimeoutException2 = e5;
                eVar3.a(list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.d);
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, eVar3.h, "Fetching wrapper vast tag url timed out", httpRequestTimeoutException2, false, 8, null);
                return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f);
            } catch (java.lang.Exception e6) {
                exc2 = e6;
                eVar3.a(list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.c);
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, eVar3.h, "Fetching wrapper vast tag url fetch error", exc2, false, 8, null);
                return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.g);
            }
            if (r5 != 0) {
            }
            gVar.f7694a = eVar3;
            gVar.b = list2;
            gVar.e = 2;
            obj = io.ktor.client.statement.HttpResponseKt.bodyAsText$default((io.ktor.client.statement.HttpResponse) obj, null, gVar, 1, null);
            if (obj == coroutine_suspended) {
            }
        } catch (io.ktor.client.plugins.HttpRequestTimeoutException e7) {
            httpRequestTimeoutException = e7;
            eVar2 = r5;
            r53 = "Fetching wrapper vast tag url: ";
        } catch (java.lang.Exception e8) {
            exc = e8;
            eVar = r5;
            r52 = "Fetching wrapper vast tag url: ";
        }
        gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.g(continuation);
        obj = gVar.c;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = gVar.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0214, code lost:
    
        r7 = r31;
        r16 = r5;
        r5 = r28;
        r4 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x018d -> B:10:0x019d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVar, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a aVar, double d2, com.moloco.sdk.common_adapter_internal.ScreenData screenData, boolean z, java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.h hVar;
        int i2;
        java.lang.String str2;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar;
        kotlin.Lazy lazy;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.h hVar2;
        java.util.List<java.lang.String> list;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k kVar;
        java.util.Iterator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> it;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar;
        double d3;
        final com.moloco.sdk.common_adapter_internal.ScreenData screenData2;
        boolean z2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a aVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.h) {
            hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.h) continuation;
            int i3 = hVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.q = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = hVar.o;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = hVar.q;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = hVar.n;
                    double d4 = hVar.m;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) hVar.l;
                    java.util.Iterator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> it2 = (java.util.Iterator) hVar.k;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k kVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k) hVar.j;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c) hVar.i;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) hVar.h;
                    kotlin.Lazy lazy2 = (kotlin.Lazy) hVar.g;
                    java.util.List<java.lang.String> list2 = (java.util.List) hVar.f;
                    java.lang.String str3 = (java.lang.String) hVar.e;
                    com.moloco.sdk.common_adapter_internal.ScreenData screenData3 = (com.moloco.sdk.common_adapter_internal.ScreenData) hVar.d;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a aVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a) hVar.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o) hVar.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e) hVar.f7695a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVar4 = oVar3;
                    double d5 = d4;
                    com.moloco.sdk.common_adapter_internal.ScreenData screenData4 = screenData3;
                    java.lang.String str4 = str3;
                    z2 = z3;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar3 = gVar2;
                    java.lang.Object obj2 = coroutine_suspended;
                    java.lang.Object a2 = obj;
                    aVar2 = aVar3;
                    com.moloco.sdk.internal.v vVar = (com.moloco.sdk.internal.v) a2;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVar5 = oVar4;
                    if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                        java.lang.String str5 = eVar2.h;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar3 = eVar2;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to prepare RenderLinear: ");
                        com.moloco.sdk.internal.v.a aVar4 = (com.moloco.sdk.internal.v.a) vVar;
                        sb.append(aVar4.a());
                        com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger, str5, sb.toString(), null, false, 12, null);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k kVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k) aVar4.a();
                        oVar2 = oVar5;
                        gVar = gVar3;
                        it = it2;
                        hVar2 = hVar;
                        screenData2 = screenData4;
                        str2 = str4;
                        eVar = eVar3;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar3 = cVar2;
                        kVar = kVar3;
                        list = list2;
                        lazy = lazy2;
                        fVar = fVar2;
                        cVar = cVar3;
                    } else {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar4 = eVar2;
                        if (vVar instanceof com.moloco.sdk.internal.v.b) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) ((com.moloco.sdk.internal.v.b) vVar).a();
                            oVar2 = oVar5;
                            gVar = gVar3;
                            cVar = cVar2;
                            kVar = kVar2;
                            it = it2;
                            hVar2 = hVar;
                            screenData2 = screenData4;
                            str2 = str4;
                            eVar = eVar4;
                            kotlin.Lazy lazy3 = lazy2;
                            fVar = fVar3;
                            list = list2;
                            lazy = lazy3;
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    if (cVar == null && (gVar.h() instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h.a)) {
                        cVar = eVar.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h.a) gVar.h()).a(), screenData2);
                    }
                    coroutine_suspended = obj2;
                    d3 = d5;
                    while (it.hasNext()) {
                        java.lang.Object obj3 = coroutine_suspended;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g next = it.next();
                        if (fVar != null && cVar != null) {
                            break;
                        }
                        boolean z4 = z2;
                        if (i.a(next)) {
                            z2 = z4;
                            coroutine_suspended = obj3;
                        } else if (fVar == null && (next.h() instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h.b)) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p a3 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h.b) next.h()).a();
                            java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> c2 = a((kotlin.Lazy<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.b>) lazy).c();
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A d6 = a((kotlin.Lazy<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.b>) lazy).d();
                            java.lang.Long b2 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h.b) next.h()).a().b();
                            hVar2.f7695a = eVar;
                            hVar2.b = oVar2;
                            hVar2.c = aVar2;
                            hVar2.d = screenData2;
                            hVar2.e = str2;
                            hVar2.f = list;
                            hVar2.g = lazy;
                            hVar2.h = fVar;
                            hVar2.i = cVar;
                            hVar2.j = kVar;
                            hVar2.k = it;
                            hVar2.l = next;
                            hVar2.m = d3;
                            z2 = z4;
                            hVar2.n = z2;
                            hVar2.q = 1;
                            a2 = eVar.a(a3, c2, d6, list, d3, b2, screenData2, z2, str2, hVar2);
                            d5 = d3;
                            obj2 = obj3;
                            if (a2 == obj2) {
                                return obj2;
                            }
                            gVar3 = next;
                            kotlin.Lazy lazy4 = lazy;
                            list2 = list;
                            oVar4 = oVar2;
                            eVar2 = eVar;
                            str4 = str2;
                            screenData4 = screenData2;
                            hVar = hVar2;
                            it2 = it;
                            kVar2 = kVar;
                            cVar2 = cVar;
                            fVar2 = fVar;
                            lazy2 = lazy4;
                            com.moloco.sdk.internal.v vVar2 = (com.moloco.sdk.internal.v) a2;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVar52 = oVar4;
                            if (!(vVar2 instanceof com.moloco.sdk.internal.v.a)) {
                            }
                            if (cVar == null) {
                            }
                            coroutine_suspended = obj2;
                            d3 = d5;
                            while (it.hasNext()) {
                            }
                        } else {
                            z2 = z4;
                            d5 = d3;
                            obj2 = obj3;
                            gVar = next;
                            if (cVar == null) {
                                cVar = eVar.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h.a) gVar.h()).a(), screenData2);
                            }
                            coroutine_suspended = obj2;
                            d3 = d5;
                            while (it.hasNext()) {
                            }
                        }
                    }
                    if (fVar != null) {
                        eVar.a(list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.h);
                        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, eVar.h, "Failed to load linear: " + kVar, null, false, 12, null);
                        return new com.moloco.sdk.internal.v.a(kVar);
                    }
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, eVar.h, "RenderAd loaded successfully.", null, false, 12, null);
                    if (fVar.i() == null) {
                        fVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f.a(fVar, null, null, null, null, null, null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.mapNotNull(kotlin.collections.CollectionsKt.asSequence(kotlin.collections.CollectionsKt.asReversed(a((kotlin.Lazy<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.b>) lazy).b())), new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this, (java.util.List) obj4);
                            }
                        })), 63, null);
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar4 = fVar;
                    if (cVar == null) {
                        cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.mapNotNull(kotlin.collections.CollectionsKt.asSequence(kotlin.collections.CollectionsKt.asReversed(a((kotlin.Lazy<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.b>) lazy).a())), new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this, screenData2, (java.util.List) obj4);
                            }
                        }));
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar4 = cVar;
                    java.util.List a4 = i.a((java.util.List) (aVar2 != null ? aVar2.f() : null), (java.util.List) oVar2.g());
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(a4, 10));
                    java.util.Iterator it3 = a4.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) it3.next()).b());
                    }
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, eVar.h, "Returning RenderAd", null, false, 12, null);
                    return new com.moloco.sdk.internal.v.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a(fVar4, cVar4, arrayList, list, null, 16, null));
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, this.h, "Trying to load RenderAd", null, false, 12, null);
                java.util.List<java.lang.String> a5 = i.a((java.util.List) (aVar != null ? aVar.e() : null), (java.util.List) oVar.f());
                if (oVar.d().isEmpty()) {
                    a(a5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.g);
                    com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger2, this.h, "No creatives in InLine", null, false, 12, null);
                    return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.h);
                }
                str2 = str;
                eVar = this;
                lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.this, aVar);
                    }
                });
                hVar2 = hVar;
                list = a5;
                kVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.i;
                it = oVar.d().iterator();
                cVar = null;
                fVar = null;
                d3 = d2;
                screenData2 = screenData;
                z2 = z;
                aVar2 = aVar;
                oVar2 = oVar;
                while (it.hasNext()) {
                }
                if (fVar != null) {
                }
            }
        }
        hVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.h(continuation);
        java.lang.Object obj4 = hVar.o;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = hVar.q;
        if (i2 == 0) {
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.b a(kotlin.Lazy<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.b> lazy) {
        return lazy.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a aVar) {
        return eVar.a(aVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return eVar.a((java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l>) it);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar, com.moloco.sdk.common_adapter_internal.ScreenData screenData, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return eVar.a((java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e>) it, screenData);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p pVar, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A a2, java.util.List<java.lang.String> list2, double d2, java.lang.Long l2, com.moloco.sdk.common_adapter_internal.ScreenData screenData, boolean z, java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.n nVar;
        int i2;
        java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> list3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A a3;
        java.lang.Object firstOrNull;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p pVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.Pair pair;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z a4;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.n) {
            nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.n) continuation;
            int i3 = nVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.h = i3 - Integer.MIN_VALUE;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.n nVar2 = nVar;
                java.lang.Object obj = nVar2.f;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = nVar2.h;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.h, "Preparing InLine RenderLinear with target linear size: " + d2, null, false, 12, null);
                    java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q> d3 = pVar.d();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : d3) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj2;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.c cVar = i;
                        if (!cVar.a(qVar) && qVar.k() && cVar.a(qVar.i())) {
                            arrayList.add(obj2);
                        }
                    }
                    java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.a(d2, l2, kotlin.coroutines.jvm.internal.Boxing.boxInt(screenData.getWidthPx()), kotlin.coroutines.jvm.internal.Boxing.boxInt(screenData.getHeightPx())));
                    if (sortedWith.isEmpty()) {
                        a(list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.i);
                        return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.j);
                    }
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef2.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.E;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.m mVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.m(kotlinx.coroutines.flow.FlowKt.cancellable(kotlinx.coroutines.flow.FlowKt.asFlow(sortedWith)), z, this, str, objectRef2);
                    nVar2.f7704a = this;
                    nVar2.b = pVar;
                    list3 = list;
                    nVar2.c = list3;
                    a3 = a2;
                    nVar2.d = a3;
                    nVar2.e = objectRef2;
                    nVar2.h = 1;
                    firstOrNull = kotlinx.coroutines.flow.FlowKt.firstOrNull(mVar, nVar2);
                    if (firstOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pVar2 = pVar;
                    eVar = this;
                    objectRef = objectRef2;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) nVar2.e;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A a5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A) nVar2.d;
                    java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> list4 = (java.util.List) nVar2.c;
                    pVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p) nVar2.b;
                    eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e) nVar2.f7704a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    a3 = a5;
                    list3 = list4;
                    firstOrNull = obj;
                }
                pair = (kotlin.Pair) firstOrNull;
                if (pair != null) {
                    com.moloco.sdk.internal.v.a aVar = new com.moloco.sdk.internal.v.a(objectRef.element);
                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, eVar.h, "Failed to load media file: " + objectRef.element, null, false, 12, null);
                    return aVar;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) pair.component1();
                java.io.File file = (java.io.File) pair.component2();
                com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, eVar.h, "Found a RenderLinear MediaFile: " + file.getAbsolutePath() + " for url: " + qVar2.g(), null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A g2 = pVar2.g();
                java.lang.String b2 = (g2 == null || (a4 = g2.a()) == null) ? null : a4.b();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.c cVar2 = i;
                java.util.List a6 = cVar2.a((java.util.List) pVar2.f(), (java.util.List) list3);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A g3 = pVar2.g();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z a7 = g3 != null ? g3.a() : null;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A g4 = pVar2.g();
                java.util.List a8 = cVar2.a((java.util.List) (g4 != null ? g4.b() : null), (java.util.List) (a3 != null ? a3.b() : null));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A g5 = pVar2.g();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A a9 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A(a7, a8, cVar2.a((java.util.List) (g5 != null ? g5.c() : null), (java.util.List) (a3 != null ? a3.c() : null)));
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, eVar.h, "Returning RenderLinear for url: " + qVar2.g() + ", with bitrate: " + qVar2.b() + ' ', null, false, 12, null);
                return new com.moloco.sdk.internal.v.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f(pVar2.e(), file, qVar2.b(), qVar2.g(), b2, cVar2.a((java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u>) a6, a9), eVar.a(pVar2.c())));
            }
        }
        nVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.n(continuation);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.n nVar22 = nVar;
        java.lang.Object obj3 = nVar22.f;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = nVar22.h;
        if (i2 != 0) {
        }
        pair = (kotlin.Pair) firstOrNull;
        if (pair != null) {
        }
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a aVar) {
        java.util.List<java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> d2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        if (aVar != null && (d2 = aVar.d()) != null) {
            java.util.Iterator<T> it = d2.iterator();
            while (it.hasNext()) {
                java.util.List list = (java.util.List) it.next();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.util.ArrayList<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> arrayList8 = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (!i.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) obj)) {
                        arrayList8.add(obj);
                    }
                }
                for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar : arrayList8) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h h2 = gVar.h();
                    if (h2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h.b) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p a2 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h.b) gVar.h()).a();
                        kotlin.collections.CollectionsKt.addAll(arrayList, a2.f());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A g2 = a2.g();
                        if (g2 != null) {
                            kotlin.collections.CollectionsKt.addAll(arrayList2, g2.b());
                            kotlin.collections.CollectionsKt.addAll(arrayList3, g2.c());
                        }
                        kotlin.collections.CollectionsKt.addAll(arrayList6, a2.c());
                    } else if (h2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h.a) {
                        kotlin.collections.CollectionsKt.addAll(arrayList7, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h.a) gVar.h()).a());
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                arrayList4.add(arrayList6);
                arrayList5.add(arrayList7);
            }
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.b(arrayList, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A(null, arrayList2, arrayList3), arrayList4, arrayList5);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c a(java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e> list, com.moloco.sdk.common_adapter_internal.ScreenData screenData) {
        java.util.List<java.lang.String> emptyList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!i.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e) obj) && (!r2.h().isEmpty())) {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e) kotlin.collections.CollectionsKt.firstOrNull(kotlin.collections.CollectionsKt.sortedWith(arrayList, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.a(java.lang.Integer.valueOf(screenData.getWidthPx()), java.lang.Integer.valueOf(screenData.getHeightPx()))));
        if (eVar == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) kotlin.collections.CollectionsKt.first(kotlin.collections.CollectionsKt.sortedWith(eVar.h(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.b()));
        java.lang.Integer i2 = eVar.i();
        int intValue = i2 != null ? i2.intValue() : 0;
        java.lang.Integer f2 = eVar.f();
        int intValue2 = f2 != null ? f2.intValue() : 0;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f d2 = eVar.d();
        java.lang.String a2 = d2 != null ? d2.a() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f d3 = eVar.d();
        if (d3 == null || (emptyList = d3.b()) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<java.lang.String> list2 = emptyList;
        java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> e = eVar.e();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(e, 10));
        java.util.Iterator<T> it = e.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u) it.next()).f());
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c(yVar, intValue, intValue2, a2, list2, arrayList2);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e a(java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l> list) {
        java.util.List<java.lang.String> emptyList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!i.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) obj)) {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) kotlin.collections.CollectionsKt.firstOrNull(kotlin.collections.CollectionsKt.sortedWith(arrayList, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.a()));
        if (lVar == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y g2 = lVar.g();
        java.lang.Integer i2 = lVar.i();
        int intValue = i2 != null ? i2.intValue() : 0;
        java.lang.Integer d2 = lVar.d();
        int intValue2 = d2 != null ? d2.intValue() : 0;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m b2 = lVar.b();
        java.lang.String a2 = b2 != null ? b2.a() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m b3 = lVar.b();
        if (b3 == null || (emptyList = b3.b()) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e(g2, intValue, intValue2, a2, emptyList, lVar.h(), lVar.c(), lVar.e());
    }
}
