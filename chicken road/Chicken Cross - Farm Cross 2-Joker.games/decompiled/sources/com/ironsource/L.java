package com.ironsource;

import com.ironsource.C4612r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final int f7727a;
    private final List<J> b = new CopyOnWriteArrayList();

    public L(int i) {
        this.f7727a = i;
    }

    private final boolean b() {
        return this.f7727a == 0;
    }

    private final boolean c() {
        return this.f7727a != -1;
    }

    public final void a(J j) {
        if (b()) {
            return;
        }
        if (a()) {
            CollectionsKt.removeFirstOrNull(this.b);
        }
        if (j == null) {
            j = new J(C4612r0.a.NotPartOfWaterfall);
        }
        this.b.add(j);
    }

    public final String d() {
        List<J> list = this.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((J) it.next()).b().ordinal()));
        }
        return CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    private final boolean a() {
        return c() && this.b.size() >= this.f7727a;
    }
}
