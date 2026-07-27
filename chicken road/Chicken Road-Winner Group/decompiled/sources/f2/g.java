package f2;

import e2.AbstractC0287b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class g extends AbstractC0287b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4921a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4922b;

    public /* synthetic */ g(f fVar, int i3) {
        this.f4921a = i3;
        this.f4922b = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f4921a) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                j.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f4921a) {
            case 0:
                j.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                j.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // e2.AbstractC0287b
    public final int b() {
        switch (this.f4921a) {
        }
        return this.f4922b.f4916i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f4921a) {
            case 0:
                this.f4922b.clear();
                break;
            default:
                this.f4922b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f4921a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                j.e(element, "element");
                return this.f4922b.e(element);
            default:
                return this.f4922b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f4921a) {
            case 0:
                j.e(elements, "elements");
                return this.f4922b.d(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f4921a) {
        }
        return this.f4922b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4921a) {
            case 0:
                f fVar = this.f4922b;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.f4922b;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f4921a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry element = (Map.Entry) obj;
                    j.e(element, "element");
                    f fVar = this.f4922b;
                    fVar.getClass();
                    fVar.b();
                    int g3 = fVar.g(element.getKey());
                    if (g3 >= 0) {
                        Object[] objArr = fVar.f4910b;
                        j.b(objArr);
                        if (j.a(objArr[g3], element.getValue())) {
                            fVar.k(g3);
                            break;
                        }
                    }
                }
                break;
            default:
                f fVar2 = this.f4922b;
                fVar2.b();
                int g4 = fVar2.g(obj);
                if (g4 >= 0) {
                    fVar2.k(g4);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f4921a) {
            case 0:
                j.e(elements, "elements");
                this.f4922b.b();
                break;
            default:
                j.e(elements, "elements");
                this.f4922b.b();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f4921a) {
            case 0:
                j.e(elements, "elements");
                this.f4922b.b();
                break;
            default:
                j.e(elements, "elements");
                this.f4922b.b();
                break;
        }
        return super.retainAll(elements);
    }
}
