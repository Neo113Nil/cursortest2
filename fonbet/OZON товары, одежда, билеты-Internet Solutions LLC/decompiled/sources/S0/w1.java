package S0;

import gd.InterfaceC6712a;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class w1 implements Iterator<Object>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3947c1 f25576a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25577b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final V f25578c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25579d;

    /* renamed from: e, reason: collision with root package name */
    private int f25580e;

    public w1(@NotNull C3947c1 c3947c1, int i11, @NotNull V v11, @NotNull x1 x1Var) {
        this.f25576a = c3947c1;
        this.f25577b = i11;
        this.f25578c = v11;
        this.f25579d = c3947c1.u();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList<Object> b11 = this.f25578c.b();
        return b11 != null && this.f25580e < b11.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        ArrayList<Object> b11 = this.f25578c.b();
        if (b11 != null) {
            int i11 = this.f25580e;
            this.f25580e = i11 + 1;
            obj = b11.get(i11);
        } else {
            obj = null;
        }
        boolean z11 = obj instanceof C3945c;
        C3947c1 c3947c1 = this.f25576a;
        if (z11) {
            return new C3950d1(c3947c1, ((C3945c) obj).a(), this.f25579d);
        }
        if (!(obj instanceof V)) {
            r.k("Unexpected group information structure");
            throw null;
        }
        return new y1(c3947c1, this.f25577b, (V) obj, new T0(0));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
