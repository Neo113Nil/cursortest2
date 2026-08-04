package E3;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: E3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0151i extends C0146d implements SortedMap {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SortedSet f2051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ H f2052f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0151i(H h6, SortedMap sortedMap) {
        super(h6, sortedMap);
        this.f2052f = h6;
    }

    public SortedSet b() {
        return new C0152j(this.f2052f, d());
    }

    @Override // E3.C0146d, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f2051e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f2051e = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return this.f2045c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0151i(this.f2052f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0151i(this.f2052f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0151i(this.f2052f, d().tailMap(obj));
    }
}
