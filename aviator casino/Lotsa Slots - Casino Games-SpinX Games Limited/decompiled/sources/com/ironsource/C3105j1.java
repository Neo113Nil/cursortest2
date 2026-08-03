package com.ironsource;

/* renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3105j1 implements com.ironsource.InterfaceC3245qf<org.json.JSONArray> {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List<com.ironsource.C3088i1> f6317a = new java.util.ArrayList();

    /* renamed from: com.ironsource.j1$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6318a;

        static {
            int[] iArr = new int[com.ironsource.EnumC3227pf.values().length];
            try {
                iArr[com.ironsource.EnumC3227pf.FullHistory.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.EnumC3227pf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f6318a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC3004d7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.json.JSONArray a(com.ironsource.EnumC3227pf mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        int i = com.ironsource.C3105j1.a.f6318a[mode.ordinal()];
        if (i == 1) {
            java.util.List<com.ironsource.C3088i1> b = b();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(b, 10));
            java.util.Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.ironsource.C3088i1) it.next()).d());
            }
            return new org.json.JSONArray((java.util.Collection) arrayList);
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<com.ironsource.C3088i1> a2 = a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(a2, 10));
        java.util.Iterator<T> it2 = a2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((com.ironsource.C3088i1) it2.next()).c());
        }
        return new org.json.JSONArray((java.util.Collection) arrayList2);
    }

    public final void a(com.ironsource.C3088i1 event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        this.f6317a.add(event);
    }

    private final java.util.List<com.ironsource.C3088i1> a() {
        java.util.List<com.ironsource.C3088i1> list = this.f6317a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            com.ironsource.C3088i1 c3088i1 = (com.ironsource.C3088i1) obj;
            if (c3088i1.e() != com.ironsource.EnumC3191nf.LoadSuccess && c3088i1.e() != com.ironsource.EnumC3191nf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.ironsource.C3088i1) it.next()).a());
        }
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList2);
        java.util.List<com.ironsource.C3088i1> list2 = this.f6317a;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            com.ironsource.C3088i1 c3088i12 = (com.ironsource.C3088i1) obj2;
            if (c3088i12.e() == com.ironsource.EnumC3191nf.LoadSuccess && !set.contains(c3088i12.a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    private final java.util.List<com.ironsource.C3088i1> b() {
        java.util.List<com.ironsource.C3088i1> list = this.f6317a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.ironsource.C3088i1) obj).e() != com.ironsource.EnumC3191nf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
