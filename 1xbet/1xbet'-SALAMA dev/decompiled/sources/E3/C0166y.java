package E3;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: E3.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0166y extends AbstractC0167z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f2080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f2081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0167z f2082e;

    public C0166y(AbstractC0167z abstractC0167z, int i7, int i8) {
        this.f2082e = abstractC0167z;
        this.f2080c = i7;
        this.f2081d = i8;
    }

    @Override // E3.AbstractC0162u
    public final boolean A() {
        return true;
    }

    @Override // E3.AbstractC0167z, java.util.List
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final AbstractC0167z subList(int i7, int i8) {
        p113p3.f.o(i7, i8, this.f2081d);
        int i9 = this.f2080c;
        return this.f2082e.subList(i7 + i9, i8 + i9);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        p113p3.f.i(i7, this.f2081d);
        return this.f2082e.get(i7 + this.f2080c);
    }

    @Override // E3.AbstractC0167z, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // E3.AbstractC0167z, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2081d;
    }

    @Override // E3.AbstractC0162u
    public final Object[] t() {
        return this.f2082e.t();
    }

    @Override // E3.AbstractC0162u
    public final int y() {
        return this.f2082e.z() + this.f2080c + this.f2081d;
    }

    @Override // E3.AbstractC0162u
    public final int z() {
        return this.f2082e.z() + this.f2080c;
    }

    @Override // E3.AbstractC0167z, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
        return listIterator(i7);
    }
}
