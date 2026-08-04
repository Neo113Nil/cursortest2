package B4;

import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0865j;
import com.google.protobuf.C0880q0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1137a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterable f1139c;

    public b0(c0 c0Var, E3.F f7) {
        this.f1139c = c0Var;
        this.f1138b = f7;
    }

    public C0865j a() {
        C0865j c0865j;
        C0865j c0865j2 = (C0865j) this.f1139c;
        if (c0865j2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = (ArrayDeque) this.f1138b;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                c0865j = null;
                break;
            }
            AbstractC0867k abstractC0867k = ((C0880q0) arrayDeque.pop()).f12265f;
            while (abstractC0867k instanceof C0880q0) {
                C0880q0 c0880q0 = (C0880q0) abstractC0867k;
                arrayDeque.push(c0880q0);
                abstractC0867k = c0880q0.f12264e;
            }
            c0865j = (C0865j) abstractC0867k;
        } while (c0865j.isEmpty());
        this.f1139c = c0865j;
        return c0865j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1137a) {
            case 0:
                return ((Iterator) ((E3.F) this.f1138b).f1994b).hasNext();
            default:
                return ((C0865j) this.f1139c) != null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1137a) {
            case 0:
                H4.k kVar = (H4.k) ((E3.F) this.f1138b).next();
                c0 c0Var = (c0) this.f1139c;
                E4.O o7 = c0Var.f1141b;
                return new a0(c0Var.f1142c, kVar.f3323a, kVar, o7.f2160e, o7.f2161f.f14781a.l(kVar.f3323a));
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

    public b0(AbstractC0867k abstractC0867k) {
        if (abstractC0867k instanceof C0880q0) {
            C0880q0 c0880q0 = (C0880q0) abstractC0867k;
            ArrayDeque arrayDeque = new ArrayDeque(c0880q0.f12267y);
            this.f1138b = arrayDeque;
            arrayDeque.push(c0880q0);
            AbstractC0867k abstractC0867k2 = c0880q0.f12264e;
            while (abstractC0867k2 instanceof C0880q0) {
                C0880q0 c0880q1 = (C0880q0) abstractC0867k2;
                ((ArrayDeque) this.f1138b).push(c0880q1);
                abstractC0867k2 = c0880q1.f12264e;
            }
            this.f1139c = (C0865j) abstractC0867k2;
            return;
        }
        this.f1138b = null;
        this.f1139c = (C0865j) abstractC0867k;
    }
}
