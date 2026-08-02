package androidx.datastore.preferences.protobuf;

import com.google.protobuf.C0929t0;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class Z extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f9164b;

    public /* synthetic */ Z(AbstractMap abstractMap, int i7) {
        this.f9163a = i7;
        this.f9164b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f9163a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((W) this.f9164b).put((Comparable) entry.getKey(), entry.getValue());
                    break;
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    ((C0929t0) this.f9164b).put((Comparable) entry2.getKey(), entry2.getValue());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f9163a) {
            case 0:
                ((W) this.f9164b).clear();
                break;
            default:
                ((C0929t0) this.f9164b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f9163a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((W) this.f9164b).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((C0929t0) this.f9164b).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 == value2 || (obj3 != null && obj3.equals(value2))) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f9163a) {
            case 0:
                return new Y((W) this.f9164b, 0);
            default:
                return new Y((C0929t0) this.f9164b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f9163a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((W) this.f9164b).remove(entry.getKey());
                    break;
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((C0929t0) this.f9164b).remove(entry2.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f9163a) {
            case 0:
                return ((W) this.f9164b).size();
            default:
                return ((C0929t0) this.f9164b).size();
        }
    }
}
