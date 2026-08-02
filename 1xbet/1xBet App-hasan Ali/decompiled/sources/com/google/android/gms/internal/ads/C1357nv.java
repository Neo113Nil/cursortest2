package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.nv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1357nv extends Kv implements ListIterator {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14729l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractList f14730m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1357nv(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f14729l = i;
        this.f14730m = abstractList;
    }

    @Override // com.google.android.gms.internal.ads.Kv
    public final Object a(Object obj) {
        switch (this.f14729l) {
            case 0:
                return ((C1447pv) this.f14730m).f15062l.apply(obj);
            default:
                return ((C1492qv) this.f14730m).f15186l.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f10280k).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f10280k).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f10280k).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f10280k).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
