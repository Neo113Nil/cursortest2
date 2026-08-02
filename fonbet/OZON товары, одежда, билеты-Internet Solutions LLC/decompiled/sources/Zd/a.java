package Zd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C7714v;
import td.InterfaceC9835a;
import td.p0;
import te.b;

/* loaded from: classes10.dex */
final class a implements b.c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35894a = new a();

    @Override // te.b.c
    public final Iterable a(Object obj) {
        int i11 = e.f35896a;
        Collection<? extends InterfaceC9835a> o11 = ((p0) obj).o();
        ArrayList arrayList = new ArrayList(C7714v.z(o11, 10));
        Iterator<T> it = o11.iterator();
        while (it.hasNext()) {
            arrayList.add(((p0) it.next()).n0());
        }
        return arrayList;
    }
}
