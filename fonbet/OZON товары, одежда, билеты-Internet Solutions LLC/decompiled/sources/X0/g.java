package X0;

import Bl0.C2652m;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public class g<K, V, T> extends e<K, V, T> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final f<K, V> f33926d;

    /* renamed from: e, reason: collision with root package name */
    private K f33927e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33928f;

    /* renamed from: g, reason: collision with root package name */
    private int f33929g;

    public g(@NotNull f<K, V> fVar, @NotNull u<K, V, T>[] uVarArr) {
        super(fVar.n(), uVarArr);
        this.f33926d = fVar;
        this.f33929g = fVar.m();
    }

    private final void k(int i11, t<?, ?> tVar, K k11, int i12) {
        int i13 = i12 * 5;
        if (i13 > 30) {
            e()[i12].n(tVar.j().length, 0, tVar.j());
            while (!Intrinsics.d(e()[i12].b(), k11)) {
                e()[i12].l();
            }
            i(i12);
            return;
        }
        int d11 = 1 << C2652m.d(i11, i13);
        if (tVar.k(d11)) {
            int h11 = tVar.h(d11);
            e()[i12].n(tVar.g() * 2, h11, tVar.j());
            i(i12);
            return;
        }
        int w11 = tVar.w(d11);
        t<?, ?> v11 = tVar.v(w11);
        e()[i12].n(tVar.g() * 2, w11, tVar.j());
        k(i11, v11, k11, i12 + 1);
    }

    public final void l(K k11, V v11) {
        f<K, V> fVar = this.f33926d;
        if (fVar.containsKey(k11)) {
            if (hasNext()) {
                K b11 = b();
                fVar.put(k11, v11);
                k(b11 != null ? b11.hashCode() : 0, fVar.n(), b11, 0);
            } else {
                fVar.put(k11, v11);
            }
            this.f33929g = fVar.m();
        }
    }

    @Override // X0.e, java.util.Iterator
    public final T next() {
        if (this.f33926d.m() != this.f33929g) {
            throw new ConcurrentModificationException();
        }
        this.f33927e = b();
        this.f33928f = true;
        return (T) super.next();
    }

    @Override // X0.e, java.util.Iterator
    public final void remove() {
        if (!this.f33928f) {
            throw new IllegalStateException();
        }
        boolean hasNext = hasNext();
        f<K, V> fVar = this.f33926d;
        if (hasNext) {
            K b11 = b();
            U.d(fVar).remove(this.f33927e);
            k(b11 != null ? b11.hashCode() : 0, fVar.n(), b11, 0);
        } else {
            U.d(fVar).remove(this.f33927e);
        }
        this.f33927e = null;
        this.f33928f = false;
        this.f33929g = fVar.m();
    }
}
