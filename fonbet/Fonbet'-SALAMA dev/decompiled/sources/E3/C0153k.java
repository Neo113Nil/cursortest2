package E3;

import java.util.List;
import java.util.ListIterator;

/* renamed from: E3.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0153k extends C0145c implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0154l f2054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153k(C0154l c0154l) {
        super(c0154l);
        this.f2054e = c0154l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0154l c0154l = this.f2054e;
        boolean isEmpty = c0154l.isEmpty();
        b().add(obj);
        c0154l.f2060f.f1997e++;
        if (isEmpty) {
            c0154l.l();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f2040b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153k(C0154l c0154l, int i7) {
        super(c0154l, ((List) c0154l.f2056b).listIterator(i7));
        this.f2054e = c0154l;
    }
}
