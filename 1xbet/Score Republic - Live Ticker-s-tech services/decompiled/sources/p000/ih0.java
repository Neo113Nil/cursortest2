package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ih0 extends AbstractC0490n0 implements jh0, RandomAccess {

    /* JADX INFO: renamed from: k */
    public final List f3569k;

    static {
        new ih0();
    }

    public ih0() {
        super(false);
        this.f3569k = Collections.EMPTY_LIST;
    }

    @Override // p000.jh0
    /* JADX INFO: renamed from: a */
    public final void mo2637a(C0762ud c0762ud) {
        m3456b();
        this.f3569k.add(c0762ud);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m3456b();
        this.f3569k.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC0490n0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m3456b();
        if (collection instanceof jh0) {
            collection = ((jh0) collection).mo2640o();
        }
        boolean zAddAll = this.f3569k.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p000.AbstractC0490n0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3456b();
        this.f3569k.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f3569k;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C0762ud)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, fe0.f2381a);
            if (wg1.f8548a.mo4524k(bArr, 0, bArr.length) == 0) {
                list.set(i, str);
            }
            return str;
        }
        C0762ud c0762ud = (C0762ud) obj;
        String str2 = c0762ud.size() == 0 ? "" : new String(c0762ud.f7800k, c0762ud.mo4065e(), c0762ud.size(), fe0.f2381a);
        int iMo4065e = c0762ud.mo4065e();
        if (wg1.f8548a.mo4524k(c0762ud.f7800k, iMo4065e, c0762ud.size() + iMo4065e) == 0) {
            list.set(i, str2);
        }
        return str2;
    }

    @Override // p000.de0
    /* JADX INFO: renamed from: i */
    public final de0 mo1171i(int i) {
        List list = this.f3569k;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new ih0(arrayList);
    }

    @Override // p000.jh0
    /* JADX INFO: renamed from: k */
    public final jh0 mo2638k() {
        return this.f5220j ? new vf1(this) : this;
    }

    @Override // p000.jh0
    /* JADX INFO: renamed from: n */
    public final Object mo2639n(int i) {
        return this.f3569k.get(i);
    }

    @Override // p000.jh0
    /* JADX INFO: renamed from: o */
    public final List mo2640o() {
        return Collections.unmodifiableList(this.f3569k);
    }

    @Override // p000.AbstractC0490n0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m3456b();
        Object objRemove = this.f3569k.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C0762ud)) {
            return new String((byte[]) objRemove, fe0.f2381a);
        }
        C0762ud c0762ud = (C0762ud) objRemove;
        return c0762ud.size() == 0 ? "" : new String(c0762ud.f7800k, c0762ud.mo4065e(), c0762ud.size(), fe0.f2381a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3456b();
        Object obj2 = this.f3569k.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0762ud)) {
            return new String((byte[]) obj2, fe0.f2381a);
        }
        C0762ud c0762ud = (C0762ud) obj2;
        return c0762ud.size() == 0 ? "" : new String(c0762ud.f7800k, c0762ud.mo4065e(), c0762ud.size(), fe0.f2381a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3569k.size();
    }

    public ih0(ArrayList arrayList) {
        super(true);
        this.f3569k = arrayList;
    }

    public ih0(int i) {
        this(new ArrayList(i));
    }

    @Override // p000.AbstractC0490n0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f3569k.size(), collection);
    }
}
