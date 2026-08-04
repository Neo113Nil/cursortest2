package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends AbstractC0822b implements F, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11716b;

    static {
        new E(10).f11754a = false;
    }

    public E(int i7) {
        this(new ArrayList(i7));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0845z
    public final InterfaceC0845z a(int i7) {
        ArrayList arrayList = this.f11716b;
        if (i7 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i7);
        arrayList2.addAll(arrayList);
        return new E(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        l();
        this.f11716b.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0822b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f11716b.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final List b() {
        return Collections.unmodifiableList(this.f11716b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final F c() {
        return this.f11754a ? new j0(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0822b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        this.f11716b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final Object d(int i7) {
        return this.f11716b.get(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        String str;
        ArrayList arrayList = this.f11716b;
        Object obj = arrayList.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0829i) {
            AbstractC0829i abstractC0829i = (AbstractC0829i) obj;
            abstractC0829i.getClass();
            Charset charset = A.f11702a;
            if (abstractC0829i.size() == 0) {
                str = "";
            } else {
                C0828h c0828h = (C0828h) abstractC0829i;
                str = new String(c0828h.f11777d, c0828h.A(), c0828h.size(), charset);
            }
            C0828h c0828h2 = (C0828h) abstractC0829i;
            int iA = c0828h2.A();
            if (r0.f11823a.J(c0828h2.f11777d, iA, c0828h2.size() + iA) == 0) {
                arrayList.set(i7, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, A.f11702a);
            Q0.a aVar = r0.f11823a;
            if (r0.f11823a.J(bArr, 0, bArr.length) == 0) {
                arrayList.set(i7, str);
            }
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final void p(AbstractC0829i abstractC0829i) {
        l();
        this.f11716b.add(abstractC0829i);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0822b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        l();
        Object objRemove = this.f11716b.remove(i7);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC0829i)) {
            return new String((byte[]) objRemove, A.f11702a);
        }
        AbstractC0829i abstractC0829i = (AbstractC0829i) objRemove;
        abstractC0829i.getClass();
        Charset charset = A.f11702a;
        if (abstractC0829i.size() == 0) {
            return "";
        }
        C0828h c0828h = (C0828h) abstractC0829i;
        return new String(c0828h.f11777d, c0828h.A(), c0828h.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        l();
        Object obj2 = this.f11716b.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC0829i)) {
            return new String((byte[]) obj2, A.f11702a);
        }
        AbstractC0829i abstractC0829i = (AbstractC0829i) obj2;
        abstractC0829i.getClass();
        Charset charset = A.f11702a;
        if (abstractC0829i.size() == 0) {
            return "";
        }
        C0828h c0828h = (C0828h) abstractC0829i;
        return new String(c0828h.f11777d, c0828h.A(), c0828h.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11716b.size();
    }

    public E(ArrayList arrayList) {
        this.f11716b = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0822b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        l();
        if (collection instanceof F) {
            collection = ((F) collection).b();
        }
        boolean zAddAll = this.f11716b.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
