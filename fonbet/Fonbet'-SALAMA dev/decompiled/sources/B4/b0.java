package B4;

import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0909j;
import com.google.protobuf.C0924q0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1137a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1138b;

    /* renamed from: c, reason: collision with root package name */
    public Iterable f1139c;

    public b0(c0 c0Var, E3.F f7) {
        this.f1139c = c0Var;
        this.f1138b = f7;
    }

    public C0909j a() {
        C0909j c0909j;
        C0909j c0909j2 = (C0909j) this.f1139c;
        if (c0909j2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = (ArrayDeque) this.f1138b;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                c0909j = null;
                break;
            }
            AbstractC0911k abstractC0911k = ((C0924q0) arrayDeque.pop()).f12265f;
            while (abstractC0911k instanceof C0924q0) {
                C0924q0 c0924q0 = (C0924q0) abstractC0911k;
                arrayDeque.push(c0924q0);
                abstractC0911k = c0924q0.f12264e;
            }
            c0909j = (C0909j) abstractC0911k;
        } while (c0909j.isEmpty());
        this.f1139c = c0909j;
        return c0909j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1137a) {
            case 0:
                return ((Iterator) ((E3.F) this.f1138b).f1994b).hasNext();
            default:
                return ((C0909j) this.f1139c) != null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1137a) {
            case 0:
                H4.k kVar = (H4.k) ((E3.F) this.f1138b).next();
                c0 c0Var = (c0) this.f1139c;
                E4.O o7 = c0Var.f1141b;
                return new a0(c0Var.f1142c, kVar.f3323a, kVar, o7.f2160e, o7.f2161f.f14775a.l(kVar.f3323a));
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1137a) {
            case 0:
                throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
            default:
                throw new UnsupportedOperationException();
        }
    }

    public b0(AbstractC0911k abstractC0911k) {
        if (abstractC0911k instanceof C0924q0) {
            C0924q0 c0924q0 = (C0924q0) abstractC0911k;
            ArrayDeque arrayDeque = new ArrayDeque(c0924q0.f12267y);
            this.f1138b = arrayDeque;
            arrayDeque.push(c0924q0);
            AbstractC0911k abstractC0911k2 = c0924q0.f12264e;
            while (abstractC0911k2 instanceof C0924q0) {
                C0924q0 c0924q02 = (C0924q0) abstractC0911k2;
                ((ArrayDeque) this.f1138b).push(c0924q02);
                abstractC0911k2 = c0924q02.f12264e;
            }
            this.f1139c = (C0909j) abstractC0911k2;
            return;
        }
        this.f1138b = null;
        this.f1139c = (C0909j) abstractC0911k;
    }
}
