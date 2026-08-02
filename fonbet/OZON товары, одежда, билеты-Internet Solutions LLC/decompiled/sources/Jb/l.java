package Jb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class l<T> implements e<Set<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final List<Pc.a<T>> f14340a;

    /* renamed from: b, reason: collision with root package name */
    private final List<Pc.a<Collection<T>>> f14341b;

    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final List<Pc.a<T>> f14342a;

        /* renamed from: b, reason: collision with root package name */
        private final List<Pc.a<Collection<T>>> f14343b;

        a(int i11) {
            this.f14342a = i11 == 0 ? Collections.EMPTY_LIST : new ArrayList(i11);
            this.f14343b = Collections.EMPTY_LIST;
        }

        public final void a(Pc.a aVar) {
            this.f14342a.add(aVar);
        }

        public final l<T> b() {
            return new l<>(this.f14342a, this.f14343b);
        }
    }

    static {
        f.a(Collections.EMPTY_SET);
    }

    l(List list, List list2) {
        this.f14340a = list;
        this.f14341b = list2;
    }

    public static a a(int i11) {
        return new a(i11);
    }

    @Override // Pc.a
    public final Object get() {
        List<Pc.a<T>> list = this.f14340a;
        int size = list.size();
        List<Pc.a<Collection<T>>> list2 = this.f14341b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Collection<T> collection = list2.get(i11).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            T t2 = list.get(i12).get();
            t2.getClass();
            hashSet.add(t2);
        }
        int size4 = arrayList.size();
        for (int i13 = 0; i13 < size4; i13++) {
            for (Object obj : (Collection) arrayList.get(i13)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
