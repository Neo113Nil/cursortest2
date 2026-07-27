package h4;

import g4.AbstractC0461f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: h4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489g extends AbstractC0461f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5820a;

    /* renamed from: b, reason: collision with root package name */
    public final C0488f f5821b;

    public C0489g(C0488f backing, int i2) {
        this.f5820a = i2;
        switch (i2) {
            case 1:
                kotlin.jvm.internal.i.e(backing, "backing");
                this.f5821b = backing;
                break;
            default:
                kotlin.jvm.internal.i.e(backing, "backing");
                this.f5821b = backing;
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f5820a) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.i.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f5820a) {
            case 0:
                kotlin.jvm.internal.i.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                kotlin.jvm.internal.i.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // g4.AbstractC0461f
    public final int c() {
        switch (this.f5820a) {
        }
        return this.f5821b.f5815i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f5820a) {
            case 0:
                this.f5821b.clear();
                break;
            default:
                this.f5821b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f5820a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.i.e(element, "element");
                return this.f5821b.g(element);
            default:
                return this.f5821b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f5820a) {
            case 0:
                kotlin.jvm.internal.i.e(elements, "elements");
                return this.f5821b.f(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f5820a) {
        }
        return this.f5821b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5820a) {
            case 0:
                C0488f c0488f = this.f5821b;
                c0488f.getClass();
                return new C0486d(c0488f, 0);
            default:
                C0488f c0488f2 = this.f5821b;
                c0488f2.getClass();
                return new C0486d(c0488f2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f5820a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry element = (Map.Entry) obj;
                    kotlin.jvm.internal.i.e(element, "element");
                    C0488f c0488f = this.f5821b;
                    c0488f.getClass();
                    c0488f.d();
                    int i2 = c0488f.i(element.getKey());
                    if (i2 >= 0) {
                        Object[] objArr = c0488f.f5808b;
                        kotlin.jvm.internal.i.b(objArr);
                        if (kotlin.jvm.internal.i.a(objArr[i2], element.getValue())) {
                            c0488f.m(i2);
                            break;
                        }
                    }
                }
                break;
            default:
                C0488f c0488f2 = this.f5821b;
                c0488f2.d();
                int i3 = c0488f2.i(obj);
                if (i3 >= 0) {
                    c0488f2.m(i3);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f5820a) {
            case 0:
                kotlin.jvm.internal.i.e(elements, "elements");
                this.f5821b.d();
                break;
            default:
                kotlin.jvm.internal.i.e(elements, "elements");
                this.f5821b.d();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f5820a) {
            case 0:
                kotlin.jvm.internal.i.e(elements, "elements");
                this.f5821b.d();
                break;
            default:
                kotlin.jvm.internal.i.e(elements, "elements");
                this.f5821b.d();
                break;
        }
        return super.retainAll(elements);
    }
}
