package E3;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: E3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0152j extends C0147e implements SortedSet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f2053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0152j(H h6, SortedMap sortedMap) {
        super(h6, sortedMap);
        this.f2053c = h6;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return l().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return l().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0152j(this.f2053c, l().headMap(obj));
    }

    public SortedMap l() {
        return this.f2047a;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return l().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0152j(this.f2053c, l().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0152j(this.f2053c, l().tailMap(obj));
    }
}
