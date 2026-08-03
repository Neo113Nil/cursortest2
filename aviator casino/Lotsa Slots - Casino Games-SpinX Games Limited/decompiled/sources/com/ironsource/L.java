package com.ironsource;

/* loaded from: classes5.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final int f5809a;
    private final java.util.List<com.ironsource.J> b = new java.util.concurrent.CopyOnWriteArrayList();

    public L(int i) {
        this.f5809a = i;
    }

    private final boolean b() {
        return this.f5809a == 0;
    }

    private final boolean c() {
        return this.f5809a != -1;
    }

    public final void a(com.ironsource.J j) {
        if (b()) {
            return;
        }
        if (a()) {
            kotlin.collections.CollectionsKt.removeFirstOrNull(this.b);
        }
        if (j == null) {
            j = new com.ironsource.J(com.ironsource.C3247r0.a.NotPartOfWaterfall);
        }
        this.b.add(j);
    }

    public final java.lang.String d() {
        java.util.List<com.ironsource.J> list = this.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((com.ironsource.J) it.next()).b().ordinal()));
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    private final boolean a() {
        return c() && this.b.size() >= this.f5809a;
    }
}
