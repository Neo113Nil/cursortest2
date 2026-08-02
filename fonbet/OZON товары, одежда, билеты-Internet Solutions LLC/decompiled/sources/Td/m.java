package Td;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class m extends AbstractList<String> implements RandomAccess, n {

    /* renamed from: b, reason: collision with root package name */
    public static final w f27096b = new w(new m());

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f27097a;

    public m() {
        this.f27097a = new ArrayList();
    }

    @Override // Td.n
    public final void L0(c cVar) {
        this.f27097a.add(cVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        this.f27097a.add(i11, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f27097a.size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f27097a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        ArrayList arrayList = this.f27097a;
        Object obj = arrayList.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String s11 = cVar.s();
            if (cVar.k()) {
                arrayList.set(i11, s11);
            }
            return s11;
        }
        byte[] bArr = (byte[]) obj;
        String b11 = i.b(bArr);
        if (i.a(bArr)) {
            arrayList.set(i11, b11);
        }
        return b11;
    }

    @Override // Td.n
    public final c getByteString(int i11) {
        c oVar;
        ArrayList arrayList = this.f27097a;
        Object obj = arrayList.get(i11);
        if (obj instanceof c) {
            oVar = (c) obj;
        } else if (obj instanceof String) {
            oVar = c.e((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            c cVar = c.f27045a;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            oVar = new o(bArr2);
        }
        if (oVar != obj) {
            arrayList.set(i11, oVar);
        }
        return oVar;
    }

    @Override // Td.n
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f27097a);
    }

    @Override // Td.n
    public final w getUnmodifiableView() {
        return new w(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        Object remove = this.f27097a.remove(i11);
        ((AbstractList) this).modCount++;
        return remove instanceof String ? (String) remove : remove instanceof c ? ((c) remove).s() : i.b((byte[]) remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        Object obj2 = this.f27097a.set(i11, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof c ? ((c) obj2).s() : i.b((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27097a.size();
    }

    public m(n nVar) {
        this.f27097a = new ArrayList(nVar.size());
        addAll(nVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection<? extends String> collection) {
        if (collection instanceof n) {
            collection = ((n) collection).getUnderlyingElements();
        }
        boolean addAll = this.f27097a.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
