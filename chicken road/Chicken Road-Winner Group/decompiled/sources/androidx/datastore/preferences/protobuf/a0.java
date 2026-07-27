package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f2211a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2212b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f2213c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f2214d;

    public a0(Y y) {
        this.f2214d = y;
    }

    public final Iterator a() {
        if (this.f2213c == null) {
            this.f2213c = this.f2214d.f2204b.entrySet().iterator();
        }
        return this.f2213c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3 = this.f2211a + 1;
        Y y = this.f2214d;
        return i3 < y.f2203a.size() || (!y.f2204b.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f2212b = true;
        int i3 = this.f2211a + 1;
        this.f2211a = i3;
        Y y = this.f2214d;
        return i3 < y.f2203a.size() ? (Map.Entry) y.f2203a.get(this.f2211a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2212b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f2212b = false;
        int i3 = Y.f;
        Y y = this.f2214d;
        y.b();
        if (this.f2211a >= y.f2203a.size()) {
            a().remove();
            return;
        }
        int i4 = this.f2211a;
        this.f2211a = i4 - 1;
        y.h(i4);
    }
}
