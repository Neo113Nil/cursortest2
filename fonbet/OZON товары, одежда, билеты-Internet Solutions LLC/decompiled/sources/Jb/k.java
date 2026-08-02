package Jb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class k<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f14339a;

    private k(int i11) {
        this.f14339a = new ArrayList(i11);
    }

    public static <T> k<T> d(int i11) {
        return new k<>(i11);
    }

    public final void a(Object obj) {
        ArrayList arrayList = this.f14339a;
        j.b(obj, "Set contributions cannot be null");
        arrayList.add(obj);
    }

    public final void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j.b(it.next(), "Set contributions cannot be null");
        }
        this.f14339a.addAll(collection);
    }

    public final Set<T> c() {
        ArrayList arrayList = this.f14339a;
        return arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
    }
}
