package P4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: P4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124c extends AbstractC0134m {

    /* renamed from: b, reason: collision with root package name */
    public final C0123b f2359b;

    public C0124c() {
        super(Q4.p.f2552a);
        N4.f elementDesc = Q4.p.f2553b;
        kotlin.jvm.internal.i.e(elementDesc, "elementDesc");
        this.f2359b = new C0123b(elementDesc);
    }

    @Override // M4.a
    public final N4.e c() {
        return this.f2359b;
    }

    @Override // P4.AbstractC0122a
    public final Object d() {
        return new ArrayList();
    }

    @Override // P4.AbstractC0122a
    public final int e(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // P4.AbstractC0122a
    public final Iterator f(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.i.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.i.e(collection, "<this>");
        return collection.size();
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        kotlin.jvm.internal.i.e(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // P4.AbstractC0122a
    public final Object k(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        return arrayList;
    }

    @Override // P4.AbstractC0134m
    public final void l(Object obj, int i2, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        arrayList.add(i2, obj2);
    }
}
