package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0929t0 extends AbstractMap {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f12274x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f12275a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12278d;

    /* renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.Z f12279e;

    /* renamed from: b, reason: collision with root package name */
    public List f12276b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public Map f12277c = Collections.emptyMap();

    /* renamed from: f, reason: collision with root package name */
    public Map f12280f = Collections.emptyMap();

    public C0929t0(int i7) {
        this.f12275a = i7;
    }

    public final int a(Comparable comparable) {
        int i7;
        int size = this.f12276b.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((x0) this.f12276b.get(i8)).f12293a);
            if (compareTo > 0) {
                i7 = size + 1;
                return -i7;
            }
            if (compareTo == 0) {
                return i8;
            }
        }
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int compareTo2 = comparable.compareTo(((x0) this.f12276b.get(i10)).f12293a);
            if (compareTo2 < 0) {
                i8 = i10 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        i7 = i9 + 1;
        return -i7;
    }

    public final void b() {
        if (this.f12278d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i7) {
        return (Map.Entry) this.f12276b.get(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f12276b.isEmpty()) {
            this.f12276b.clear();
        }
        if (this.f12277c.isEmpty()) {
            return;
        }
        this.f12277c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f12277c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f12277c.isEmpty() ? w0.f12287b : this.f12277c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f12277c.isEmpty() && !(this.f12277c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f12277c = treeMap;
            this.f12280f = treeMap.descendingMap();
        }
        return (SortedMap) this.f12277c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f12279e == null) {
            this.f12279e = new androidx.datastore.preferences.protobuf.Z(this, 1);
        }
        return this.f12279e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0929t0)) {
            return super.equals(obj);
        }
        C0929t0 c0929t0 = (C0929t0) obj;
        int size = size();
        if (size != c0929t0.size()) {
            return false;
        }
        int size2 = this.f12276b.size();
        if (size2 != c0929t0.f12276b.size()) {
            return ((AbstractSet) entrySet()).equals(c0929t0.entrySet());
        }
        for (int i7 = 0; i7 < size2; i7++) {
            if (!c(i7).equals(c0929t0.c(i7))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f12277c.equals(c0929t0.f12277c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((x0) this.f12276b.get(a2)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f12276b.isEmpty();
        int i7 = this.f12275a;
        if (isEmpty && !(this.f12276b instanceof ArrayList)) {
            this.f12276b = new ArrayList(i7);
        }
        int i8 = -(a2 + 1);
        if (i8 >= i7) {
            return e().put(comparable, obj);
        }
        if (this.f12276b.size() == i7) {
            x0 x0Var = (x0) this.f12276b.remove(i7 - 1);
            e().put(x0Var.f12293a, x0Var.f12294b);
        }
        this.f12276b.add(i8, new x0(this, comparable, obj));
        return null;
    }

    public final Object g(int i7) {
        b();
        Object obj = ((x0) this.f12276b.remove(i7)).f12294b;
        if (!this.f12277c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f12276b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new x0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? ((x0) this.f12276b.get(a2)).f12294b : this.f12277c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f12276b.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += ((x0) this.f12276b.get(i8)).hashCode();
        }
        return this.f12277c.size() > 0 ? i7 + this.f12277c.hashCode() : i7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return g(a2);
        }
        if (this.f12277c.isEmpty()) {
            return null;
        }
        return this.f12277c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12277c.size() + this.f12276b.size();
    }
}
